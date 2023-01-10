B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Public data As Map
	Public id, username, email, name, user_image, address, contact As String
	Public status As Int
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private BtnEV As Button
	Private BtnLogout As Button
	Private BtnRG As Button
	Private LabelEV As Label
	Private LabelHeader As Label
	Private LabelLogout As Label
	Private LabelName As Label
	Private LabelRG As Label
	Private LabelUsername As Label
	Private PanelBanner As Panel
	Private PanelHome As Panel
	Private PanelMenu As Panel
	Private PanelProfile As Panel
	Private ProfileAvatar As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("Homeuser")
	Log("HomeUser loaded")
	Core.ExecuteUrl(Main.server&"profile", "id="&Main.manager.GetString("user_id"), "Profile", Me)
	
End Sub

Sub Activity_Resume
	Log("HomeUser resumed")
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub BtnRG_Click
	Log("Redirect to AtractionMap Activity")
	StartActivity(MapsAt)
End Sub

Private Sub BtnLogout_Click
	Log("Redirect to Main Activity")
	Core.ExecuteUrlGet(Main.server&"logout", "Logout", Me)
End Sub

Private Sub BtnEV_Click
	Log("Redirect to EventMap Activity")
	StartActivity(MapsEv)
End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Dim parser As JSONParser
		parser.Initialize(res)
		Log("Response from server :"&res)
		Select Job.JobName
			Case "Profile"
				Try
					Dim map As Map
					map = parser.NextObject
					data = map.Get("data")
					id = data.Get("id")
					email = data.Get("email")
					username = data.Get("username")
					name = data.Get("name")
					user_image = data.Get("user_image")
					address = data.Get("address")
					contact = data.Get("contact")
			
					LabelName.Text = name
					LabelUsername.Text = "@"&username
					
					Dim avatarMap As Map
					Dim avatarPath As String
					avatarPath = Main.baseServer & "assets/images/user-photos/" &user_image
					
					avatarMap.Initialize
					avatarMap.Put(ProfileAvatar, avatarPath)
					Log(avatarMap.GetKeyAt(0))
					Log(avatarMap.GetValueAt(0))
					CallSubDelayed2(Starter, "Download", avatarMap)
					
				Catch
					Log(LastException)
				End Try
				
			Case "Logout"
				Try
					Dim map As Map
					map = parser.NextObject
					status = map.Get("status")
					If status == 200 Then
						Msgbox2("Successfully logged out", "Log Out","Oke","","",Null)
						Main.manager.SetBoolean("is_login", False)
						Main.manager.SetBoolean("visitor", False)
						Main.manager.SetBoolean("user", False)
						Log("Successfully logged out")
						Activity.Finish
						StartActivity(Main)
					End If
				Catch
					Log(LastException)
				End Try
		End Select
		
	Else
		Dim errorParser As JSONParser
		errorParser.Initialize(Job.ErrorMessage)
		
		Dim errorMap As Map
		errorMap = errorParser.NextObject
		Log("Error: " & Job.ErrorMessage)
		
		Dim error As String
		error = errorMap.Get("message")
		ToastMessageShow("Error: " & error, True)
	End If
	Job.Release
End Sub
