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
	Private btnRefresh As Button
	Private loadRefresh As ProgressBar
	Private MainScroll As ScrollView
	Private Navbar As Panel
	Private TitleNavbar As Label
	Private WebViewProduct As WebView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("Product")
	WebViewProduct.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	TitleNavbar.Text = "LIST PRODUCT"
	
	MyWebViewExtras.addWebChromeClient(WebViewProduct, "WebViewProduct")
	WebViewProduct.JavaScriptEnabled = True
	WebViewProduct.LoadUrl(Main.server&"products")
	MyWebViewSettings.setDOMStorageEnabled(WebViewProduct,True)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub BtnBack_Click
	Log("Going back to previous activity")
	Activity.Finish
End Sub