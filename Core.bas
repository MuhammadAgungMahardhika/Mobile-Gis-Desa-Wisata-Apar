B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=11.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub ExecuteUrl(Url As String, Parameters As String, JobName As String, Obj As Object)
	Dim job As HttpJob
	job.Initialize(JobName, Obj)
	job.PostString(Url, Parameters)
End Sub

Sub ExecuteUrlGet(Url As String, JobName As String, Obj As Object)
	Dim job As HttpJob
	job.Initialize(JobName, Obj)
	job.Download(Url)
End Sub