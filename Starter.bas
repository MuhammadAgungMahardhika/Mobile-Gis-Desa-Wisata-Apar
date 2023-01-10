B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.9
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public GPS1 As GPS
	Private gpsStarted As Boolean
	Public rp As RuntimePermissions
	Public lat, lng As String
	Public selectedObj As Map
	Private tasks As Map
	Private cache As Map
	Private ongoingTasks As Map
End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	tasks.Initialize
	cache.Initialize
	ongoingTasks.Initialize
	GPS1.Initialize("GPS")
End Sub

Sub Service_Start (StartingIntent As Intent)
	Service.StopAutomaticForeground 'Starter service can start in the foreground state in some edge cases.
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy

End Sub

Sub StartGPS
	If gpsStarted = False Then
		GPS1.Start(0, 0)
		gpsStarted = True
		Log("GPS is started")
	End If
End Sub

Sub StopGPS
	If gpsStarted Then
		GPS1.Stop
		gpsStarted = False
		Log("GPS is stopped")
	End If
End Sub

Sub GPS_LocationChanged(Location1 As Location)
	Dim currentLat, currentLng As String
	currentLat = Location1.Latitude
	currentLng = Location1.Longitude
	If currentLat <> lat And currentLng <> lng Then
		lat = currentLat
		lng = currentLng
		Log("Current Location")
		Log("Lat = " & lat)
		Log("Lng = " & lng)	
		
		CallSub(MapsAt, "UpdateLocation")
	End If
End Sub

Sub Download (ImageMap As Map)
	For i = 0 To ImageMap.Size - 1
		tasks.Put(ImageMap.GetKeyAt(i), ImageMap.GetValueAt(i))
		Public path As String = ImageMap.GetValueAt(i)
		If cache.ContainsKey(path) Then
			Public iv As ImageView = ImageMap.GetKeyAt(i)
			iv.SetBackgroundImage(cache.Get(path))
		Else If ongoingTasks.ContainsKey(path) = False Then
			ongoingTasks.Put(path, "")
			Public Job As HttpJob
			Job.Initialize(path, Me)
			Job.Download(path)
		End If
	Next
End Sub

Sub DrawRoundBitmap (cvs As Canvas, bmp As Bitmap)
	Public r As Rect
	r.Initialize(0, 0, cvs.Bitmap.Width, cvs.Bitmap.Height)
	cvs.DrawBitmap(bmp, Null, r)
End Sub

Sub CreateBitmap As Canvas
	Public bmp  As Bitmap
	bmp.InitializeMutable(200dip, 200dip)
	Public cvs As Canvas
	cvs.Initialize2(bmp)
	Public rect As Rect
	rect.Initialize(0, 0, bmp.Width, bmp.Height)
	cvs.DrawRect(rect, Colors.Transparent, True, 0)
	Public path As Path
	path.Initialize(0, 0)
	Public jo As JavaObject = path
	Public x = 100dip, y = 100dip, radius = 100dip As Float
	jo.RunMethod("addCircle", Array As Object(x, y, radius, "CW"))
	cvs.ClipPath(path)
	Return cvs
End Sub

Sub JobDone (Job As HttpJob)
	ongoingTasks.Remove(Job.JobName)
	If Job.Success Then
		Public bmp As Bitmap = Job.GetBitmap
		If tasks.IsInitialized Then
			For i = 0 To tasks.Size - 1
				Public path As String = tasks.GetValueAt(i)
				If path = Job.JobName Then
					Public iv As ImageView = tasks.GetKeyAt(i)
					Public canvas As Canvas = CreateBitmap
					DrawRoundBitmap(canvas, bmp)
					iv.SetBackgroundImage(canvas.Bitmap)
					cache.Put(Job.JobName, canvas.Bitmap)
				End If
			Next
		End If
	Else
		Log("Error downloading image: " & Job.JobName & CRLF & Job.ErrorMessage)
	End If
	Job.Release
End Sub
