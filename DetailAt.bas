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
	CheckLogin
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("Detail")
	wvDetail.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height
	TitleNavbar.Text = Starter.selectedObj.Get("name")
	
	MyWebViewExtras.addWebChromeClient(wvDetail, "wvDetail")
	wvDetail.JavaScriptEnabled = True
	wvDetail.LoadUrl(Main.server&"detail_atraction/"&Starter.selectedObj.Get("id"))
	MyWebViewSettings.setDOMStorageEnabled(wvDetail,True)
	
End Sub

Sub Activity_Resume
	Log("DetailAt loaded")
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub BtnBack_Click
	Log("Going back to previous activity")
	Activity.Finish
End Sub

Sub CheckLogin
	Log("Checking login status...")
	Dim isLogin As Boolean
	isLogin = Main.manager.GetBoolean("is_login")
	If isLogin Then
		If Main.manager.GetBoolean("user") Then
			Log("User detected")
			Core.ExecuteUrl(Main.server&"login", "login=agung&password=Put1n4yl4k", "Login", Me)
		End If
	Else
		Log("No user detected")
	End If
End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success Then
		Try
			Dim res As String
			res = Job.GetString
			Dim parser As JSONParser
			parser.Initialize(res)
			Log("Response from server :"&res)
			
		Catch
			Log(LastException)
		End Try
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

