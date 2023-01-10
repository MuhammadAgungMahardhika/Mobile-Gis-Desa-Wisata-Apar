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
	Dim atractionMap As Map
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	Private MyWebViewExtras As WebViewExtras
	Private MyWebViewSetting As WebViewSettings
	Private Navbar As Panel
	Private MainScroll As ScrollView
	Private btnList As Button
	Private btnObj As Button
	Private btnUserLoc As Button
	Private Label1 As Label
	Private Label2 As Label
	Private Label3 As Label
	Private PanelCategory As Panel
	Private PanelRating As Panel
	Private PanelRG As Panel
	Private PanelSearch As Panel
	Private spinCategory As Spinner
	Private spinRating As Spinner
	Private WebViewRG As WebView
	Private spinName As Spinner
	Private ButtonBack As Button
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("MapsRG")
	Navbar.Visible = False
	If Navbar.Visible == False Then
		MainScroll.Top = MainScroll.Top - Navbar.Height
		MainScroll.Height = MainScroll.Height + Navbar.Height
	End If
	WebViewRG.Height = MainScroll.Height
	PanelRG.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	
	WebViewRG.JavaScriptEnabled = True
	MyWebViewExtras.addWebChromeClient(WebViewRG, "WebViewRG")
	MyWebViewSetting.setDOMStorageEnabled(WebViewRG,True)
	WebViewRG.LoadUrl(Main.server)


End Sub


Sub Activity_Resume
	Log("MapsAt Loaded")
	If Starter.GPS1.GPSEnabled = False Then
		ToastMessageShow("Please enable the GPS device.", True)
		StartActivity(Starter.GPS1.LocationSettingsIntent)
	Else
		Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_ACCESS_FINE_LOCATION)
		Wait For Activity_PermissionResult (Permission As String, Result As Boolean)
		If Result Then
			CallSubDelayed(Starter, "StartGPS")
		Else
			ToastMessageShow("Please allow GPS to run this appliation", True)
			Activity.Finish
		End If
	End If
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	CallSubDelayed(Starter, "StopGPS")
End Sub

Private Sub WebViewRG_PageFinished (Url As String)
	
End Sub


Private Sub btnUserLoc_Click
	UpdateLocation
	Log("Panning to user location")
	Dim panTO As String
	panTO = "panTo({lat:"&Starter.lat&",lng:"&Starter.lng&"})"
	MyWebViewExtras.executeJavascript(WebViewRG, panTO)
	
End Sub

Public Sub UpdateLocation
	Log("Update user position on Maps")
	Log("Lat: "&Starter.lat&"; Long: "&Starter.lng)
	Dim addUserMarkerToMap As String
	addUserMarkerToMap = "addUserMarkerToMap({lat:"&Starter.lat&",lng:"&Starter.lng&"})"
	MyWebViewExtras.executeJavascript(WebViewRG, addUserMarkerToMap)
End Sub

Private Sub btnObj_Click
	MyWebViewExtras.executeJavascript(WebViewRG,"showObject('atraction')")
End Sub

Private Sub btnList_Click
	Log("Redirect to ListAt activity")
	StartActivity(ListAt)
End Sub

Private Sub ButtonBack_Click
	Log("Going back to previous activity")
	Activity.Finish
End Sub



