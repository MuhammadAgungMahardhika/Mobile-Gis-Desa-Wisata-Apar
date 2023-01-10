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
	Dim eventMap As Map
	Dim selectedDate As String
	Dim selectedDate2 As String
	Private XUI As XUI
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MyWebViewExtras As WebViewExtras
	Private MyWebViewSetting As WebViewSettings
	Private WebViewEV As WebView
	Private Navbar As Panel
	Private MainScroll As ScrollView
	Private btnList As Button
	Private btnObj As Button
	Private btnUserLoc As Button
	Private ButtonBack As Button
	
	Private Label1 As Label
	Private Label2 As Label
	Private Label4 As Label
	
	Private PanelEV As Panel
	Private PanelRating As Panel
	Private PanelSearch As Panel
	Private PanelDate As Panel
	
	Private spinName As Spinner
	Private spinRating As Spinner
	
	Private btnDate As SwiftButton
	Private btnDate2 As SwiftButton
	Private DateTemplate As B4XDateTemplate
	Private Dialog As B4XDialog
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("MapsEV")
	Navbar.Visible = False
	If Navbar.Visible == False Then
		MainScroll.Top = MainScroll.Top - Navbar.Height
		MainScroll.Height = MainScroll.Height + Navbar.Height
	End If
	WebViewEV.Height = MainScroll.Height
	PanelEV.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	
	WebViewEV.JavaScriptEnabled = True
	MyWebViewExtras.addWebChromeClient(WebViewEV, "WebViewEV")
	MyWebViewSetting.setDOMStorageEnabled(WebViewEV,True)
	WebViewEV.LoadUrl(Main.server)

	spinName.DropdownBackgroundColor = Colors.White
	Core.ExecuteUrlGet(Main.server&"event","LoadEvent" ,Me)
	
	spinRating.DropdownBackgroundColor = Colors.White
	spinRating.AddAll(Array As String("Rating...", "1", "2", "3", "4", "5"))
	
	Dialog.Initialize (Activity)
	Dialog.Title = "Select Date..."
	DateTemplate.Initialize
	DateTemplate.MinYear = 2000
	DateTemplate.MaxYear = 2050
	btnDate.xLBL.Text = "From"
	btnDate2.xLBL.Text="To"
	
	selectedDate = ""
	selectedDate2 = ""


End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub spinRating_ItemClick (Position As Int, Value As Object)
	Dim getObjectByRate As String
	If Position == 0 Then
		MsgboxAsync("Please choose rating from 1-5", "Search by Rating")
		spinName.SelectedIndex = 0
		emptyDate
		getObjectByRate = "getObjectByRate('','event')"
		MyWebViewExtras.executeJavascript(WebViewEV, getObjectByRate)
	Else
		spinName.SelectedIndex = 0
		emptyDate
		Log("Searching Atraction with "&Value&" rating")
		getObjectByRate = "getObjectByRate('"&Value&"','event')"
		MyWebViewExtras.executeJavascript(WebViewEV, getObjectByRate)
	End If
End Sub

Private Sub spinName_ItemClick (Position As Int, Value As Object)
	Dim getObjectByName As String
	If Position == 0 Then
		MsgboxAsync("Please choose name", "Search by Name")
		spinRating.SelectedIndex = 0
		emptyDate
	Else
		spinRating.SelectedIndex = 0
		emptyDate
		Log("Searching Ev by name: "&Value)
		getObjectByName = "getObjectByName('"&Value&"','event')"
		MyWebViewExtras.executeJavascript(WebViewEV, getObjectByName)
	End If
End Sub

Private Sub btnDate_Click
	Wait For (Dialog.ShowTemplate(DateTemplate, "", "", "Cancel")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then
		Dim getObjectByDate As String
		DateTime.DateFormat = "yyyy-MM-dd"
		selectedDate = DateTime.Date(DateTemplate.Date)
		btnDate.xLBL.Text = selectedDate
		
		spinRating.SelectedIndex = 0
		spinName.SelectedIndex = 0
		
		Log("date start: "&selectedDate)
		getEventByDate
	End If
End Sub


Private Sub ButtonBack_Click
	Log("Going back to previous activity")
	Activity.Finish
End Sub

Private Sub btnUserLoc_Click
	MyWebViewExtras.executeJavascript(WebViewEV,"addUserMarkerToMap({lat:-0.599343 ,lng:100.110793})")
End Sub

Private Sub btnObj_Click
	spinRating.SelectedIndex = 0
	spinName.SelectedIndex = 0
	emptyDate
	MyWebViewExtras.executeJavascript(WebViewEV,"showObject('event')")
End Sub

Private Sub btnList_Click
	Log("Redirect to ListEv activity")
	StartActivity(ListEv)
End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Dim parser As JSONParser
		parser.Initialize(res)
		
		Select Job.JobName
			Case "LoadEvent"
				Try
					Dim map As Map
					map = parser.NextObject
					Dim data As List
					data = map.Get("data")
					eventMap.Initialize
					spinName.Add("Select event by name..")
					For i = 0 To data.Size - 1
						Dim event As Map
						event = data.Get(i)
						eventMap.Put(event.Get("name"),event.Get("id"))
						spinName.Add(event.Get("name"))
						
					Next
				Catch
					Log(LastException)
				End Try
		End Select
	End If
End Sub


Private Sub WebViewEV_PageFinished (Url As String)
	
End Sub

Private Sub btnDate2_Click
	
	If selectedDate == "" Then
		Msgbox("Please fill from date first","Select from date")
		Return
	End If
	
	Wait For (Dialog.ShowTemplate(DateTemplate, "", "", "Cancel")) Complete (Result As Int)
	If Result = XUI.DialogResponse_Positive Then

		DateTime.DateFormat = "yyyy-MM-dd"
		selectedDate2 = DateTime.Date(DateTemplate.Date)
		btnDate2.xLBL.Text = selectedDate2
		
		spinRating.SelectedIndex = 0
		spinName.SelectedIndex = 0
		
		Log("date end:" &selectedDate2)
		getEventByDate
	End If
End Sub

private Sub getEventByDate
	Dim getObjectByDate As String
	If (selectedDate <> "") And (selectedDate2 <> "")  Then
		Log("Searching EV with date")
		getObjectByDate = "getObjectByDate('"&selectedDate&"','"&selectedDate2&"')"
		MyWebViewExtras.executeJavascript(WebViewEV, getObjectByDate)
	End If
End Sub

private Sub emptyDate
	selectedDate = ""
	btnDate.xLBL.Text = "From"
	selectedDate2 = ""
	btnDate2.xLBL.Text = "To"
End Sub