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
	Private WebViewPackage As WebView
	Private loadRefresh As ProgressBar
	Private btnRefresh As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("package")
	WebViewPackage.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	TitleNavbar.Text = "List Package"
	btnRefresh.Visible = False
	loadRefresh.Visible = True
	
	MyWebViewExtras.addWebChromeClient(WebViewPackage, "WebViewPackage")
	WebViewPackage.JavaScriptEnabled = True
	WebViewPackage.LoadUrl(Main.server&"package/")
	MyWebViewSettings.setDOMStorageEnabled(WebViewPackage,True)
	
End Sub

Sub Activity_Resume
	Log("package loaded")
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub BtnBack_Click
	Log("Going back to previous activity")
	Activity.Finish
End Sub


