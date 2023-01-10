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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MyWebViewExtras As WebViewExtras
	Private MyWebViewSettings As WebViewSettings
	Private BtnBack As Button
	Private MainScroll As ScrollView
	Private Navbar As Panel
	Private TitleNavbar As Label
	Private wvDetail As WebView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("Detail")
	wvDetail.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	TitleNavbar.Text = Starter.selectedObj.Get("name")
	
	MyWebViewExtras.addWebChromeClient(wvDetail, "wvDetail")
	wvDetail.JavaScriptEnabled = True
	wvDetail.LoadUrl(Main.server&"detail_event/"&Starter.selectedObj.Get("id"))
	MyWebViewSettings.setDOMStorageEnabled(wvDetail,True)
End Sub

Sub Activity_Resume
	Log("DetailEv loaded")
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub BtnBack_Click
	Log("Going back to previous activity")
	Activity.Finish
End Sub
