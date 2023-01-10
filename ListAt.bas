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
	Private xui As XUI
	Private isDownloadReady As Boolean = False
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private BtnBack As Button
	Private MainScroll As ScrollView
	Private TitleNavbar As Label
	Private Navbar As Panel
	Private btnRefresh As Button
	Private loadRefresh As ProgressBar
	
	Private CLV As CustomListView
	Private PanelList As Panel
	
	Private PanelListItem As Panel
	Private idRG As Label
	Private nameRG As Label
	Private ivRG As B4XView
	Private imgMap As Map
	Private MediaManager As SimpleMediaManager
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("List")
	PanelList.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	TitleNavbar.Text = "List Atraction"
	btnRefresh.Visible = False
	loadRefresh.Visible = True
	
	imgMap.Initialize
	MediaManager.Initialize
	CLV.Clear
	imgMap.Clear
	Core.ExecuteUrlGet(Main.server&"atraction", "LoadAt", Me)
End Sub

Sub Activity_Resume
	Log("ListRG loaded")
	Dim extra As Map = CreateMap(MediaManager.REQUEST_RESIZE_MODE: "FILL_NO_DISTORTIONS")
	DownloadImg(imgMap, isDownloadReady, extra)
End Sub

Sub Activity_Pause (UserClosed As Boolean)
End Sub


Private Sub BtnBack_Click
	Log("Going back to previous activity")
	Activity.Finish
End Sub

Private Sub CLV_ItemClick (Index As Int, Value As Object)
	
End Sub

Private Sub CreateItem (id As String, name As String, img As String) As B4XView
	Dim p As B4XView = xui.CreatePanel("")
	p.SetLayoutAnimated(0, 0, 0, 100%x, 160dip)
	p.LoadLayout("ItemRG")
	
	idRG.Text = id
	nameRG.Text = name
	
	Dim imgPath As String = Main.baseServer & "media/photos/" &img
	imgMap.Put(ivRG, imgPath)
	Return p
End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Dim parser As JSONParser
		parser.Initialize(res)
		'Log("Response from server :"&res)
		
		Select Job.JobName
			Case "LoadAt"
				Try
					Dim map As Map
					map = parser.NextObject
					Dim data As List
					data = map.Get("data")
					If data.Size-1 > 0 Then
						CLV.Clear
						imgMap.Clear
						For i = 0 To data.Size-1
							Dim at As Map
							at = data.Get(i)
							CLV.Add(CreateItem(at.Get("id"), at.Get("name"), at.Get("gallery")), "")
							CLV.AsView.Height = PanelListItem.Height * CLV.Size
						Next
						isDownloadReady = True
						Dim extra As Map = CreateMap(MediaManager.REQUEST_RESIZE_MODE: "FILL_NO_DISTORTIONS")
						DownloadImg(imgMap, isDownloadReady, extra)
						CLV.sv.Height = CLV.AsView.Height
						PanelList.Height = CLV.AsView.Height
						MainScroll.Panel.Height = CLV.AsView.Height
					End If
					btnRefresh.Visible = True
					loadRefresh.Visible = False
				Catch
					Log(LastException)
				End Try
		End Select
	End If
End Sub

Private Sub btnRefresh_Click
	Log("Refreshing ListRG...")
	btnRefresh.Visible = False
	loadRefresh.Visible = True
	Core.ExecuteUrlGet(Main.server&"atraction", "LoadAt", Me)
End Sub

Sub DownloadImg (ImageMap As Map, readyToDownload As Boolean, extra As Map)
	If readyToDownload Then
		If extra.Size > 0 Then
			For i = 0 To ImageMap.Size - 1
				Log("Getting "&ImageMap.GetValueAt(i)&"@"&ImageMap.GetKeyAt(i))
				MediaManager.SetMediaWithExtra(ImageMap.GetKeyAt(i), ImageMap.GetValueAt(i), "", extra)
			Next
		End If
	End If
End Sub

Private Sub PanelListItem_Click
	Dim item As Int = CLV.GetItemFromView(Sender)
	Dim p As B4XView
	p = CLV.GetPanel(item)
	
	Dim a As B4XView
	a = p.GetView(0)
	Starter.selectedObj.Initialize
	Starter.selectedObj.Put("id", a.GetView(0).GetView(0).Text)
	Starter.selectedObj.Put("name", a.GetView(0).GetView(3).Text)
	
	Log("Redirect to DetailRG Activity")
	StartActivity(DetailAt)
	
End Sub