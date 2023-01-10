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

	Private BtnEV As Button
	Private BtnLogin As Button
	Private BtnRG As Button
	Private LabelEV As Label
	Private LabelHeader As Label
	Private LabelLogin As Label
	Private LabelName As Label
	Private LabelRG As Label
	Private LabelUsername As Label
	Private PanelBanner As Panel
	Private PanelHome As Panel
	Private PanelMenu As Panel
	Private PanelProfile As Panel
	Private ProfileAvatar As ImageView
	Private BtnPd As Button
	Private LabelPd As Label
	Private PanelPd As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("Homevisitor")
	
End Sub

Sub Activity_Resume
	Log("HomeVisitor loaded")
	LabelName.Text = "Hello, Visitor"
	LabelUsername.Text = ""
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub BtnRG_Click
	Log("Redirect to AtractionMap Activity")
	StartActivity(MapsAt)
End Sub

Private Sub BtnLogin_Click
	Log("Redirect to Main Activity")
	Main.manager.SetBoolean("is_login", False)
	Main.manager.SetBoolean("visitor", False)
	Main.manager.SetBoolean("user", False)
	Activity.Finish
	StartActivity(Main)
End Sub

Private Sub BtnEV_Click
	Log("Redirect to Package Activity")
	StartActivity(TourismPackage)
End Sub

Private Sub BtnPd_Click
	Log("Redirect to Product Activity")
	StartActivity(TourismProduct)
End Sub