package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class detailat_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (detailat) ","detailat",1,detailat.mostCurrent.activityBA,detailat.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.detailat.remoteMe.runUserSub(false, "detailat","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="CheckLogin";
Debug.ShouldStop(16777216);
_checklogin();
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(33554432);
detailat.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),detailat.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="MainScroll.Panel.LoadLayout(\"Detail\")";
Debug.ShouldStop(67108864);
detailat.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Detail")),detailat.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="wvDetail.Height = MainScroll.Height";
Debug.ShouldStop(134217728);
detailat.mostCurrent._wvdetail.runMethod(true,"setHeight",detailat.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 29;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(268435456);
detailat.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",detailat.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 30;BA.debugLine="TitleNavbar.Text = Starter.selectedObj.Get(\"name\"";
Debug.ShouldStop(536870912);
detailat.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence(detailat.mostCurrent._starter._selectedobj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 32;BA.debugLine="MyWebViewExtras.addWebChromeClient(wvDetail, \"wvD";
Debug.ShouldStop(-2147483648);
detailat.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",detailat.mostCurrent.activityBA,(Object)((detailat.mostCurrent._wvdetail.getObject())),(Object)(RemoteObject.createImmutable("wvDetail")));
 BA.debugLineNum = 33;BA.debugLine="wvDetail.JavaScriptEnabled = True";
Debug.ShouldStop(1);
detailat.mostCurrent._wvdetail.runMethod(true,"setJavaScriptEnabled",detailat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 34;BA.debugLine="wvDetail.LoadUrl(Main.server&\"detail_atraction/\"&";
Debug.ShouldStop(2);
detailat.mostCurrent._wvdetail.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(detailat.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("detail_atraction/"),detailat.mostCurrent._starter._selectedobj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 BA.debugLineNum = 35;BA.debugLine="MyWebViewSettings.setDOMStorageEnabled(wvDetail,T";
Debug.ShouldStop(4);
detailat.mostCurrent._mywebviewsettings.runVoidMethod ("setDOMStorageEnabled",(Object)((detailat.mostCurrent._wvdetail.getObject())),(Object)(detailat.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (detailat) ","detailat",1,detailat.mostCurrent.activityBA,detailat.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.detailat.remoteMe.runUserSub(false, "detailat","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (detailat) ","detailat",1,detailat.mostCurrent.activityBA,detailat.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.detailat.remoteMe.runUserSub(false, "detailat","activity_resume");}
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Log(\"DetailAt loaded\")";
Debug.ShouldStop(128);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","1917505",RemoteObject.createImmutable("DetailAt loaded"),0);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBack_Click (detailat) ","detailat",1,detailat.mostCurrent.activityBA,detailat.mostCurrent,48);
if (RapidSub.canDelegate("btnback_click")) { return b4a.example.detailat.remoteMe.runUserSub(false, "detailat","btnback_click");}
 BA.debugLineNum = 48;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(65536);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","11048577",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 50;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
detailat.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checklogin() throws Exception{
try {
		Debug.PushSubsStack("CheckLogin (detailat) ","detailat",1,detailat.mostCurrent.activityBA,detailat.mostCurrent,53);
if (RapidSub.canDelegate("checklogin")) { return b4a.example.detailat.remoteMe.runUserSub(false, "detailat","checklogin");}
RemoteObject _islogin = RemoteObject.createImmutable(false);
 BA.debugLineNum = 53;BA.debugLine="Sub CheckLogin";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Log(\"Checking login status...\")";
Debug.ShouldStop(2097152);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","11114113",RemoteObject.createImmutable("Checking login status..."),0);
 BA.debugLineNum = 55;BA.debugLine="Dim isLogin As Boolean";
Debug.ShouldStop(4194304);
_islogin = RemoteObject.createImmutable(false);Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 56;BA.debugLine="isLogin = Main.manager.GetBoolean(\"is_login\")";
Debug.ShouldStop(8388608);
_islogin = detailat.mostCurrent._main._manager /*RemoteObject*/ .runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("is_login")));Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 57;BA.debugLine="If isLogin Then";
Debug.ShouldStop(16777216);
if (_islogin.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="If Main.manager.GetBoolean(\"user\") Then";
Debug.ShouldStop(33554432);
if (detailat.mostCurrent._main._manager /*RemoteObject*/ .runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("user"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 59;BA.debugLine="Log(\"User detected\")";
Debug.ShouldStop(67108864);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","11114118",RemoteObject.createImmutable("User detected"),0);
 BA.debugLineNum = 60;BA.debugLine="Core.ExecuteUrl(Main.server&\"login\", \"login=agu";
Debug.ShouldStop(134217728);
detailat.mostCurrent._core.runVoidMethod ("_executeurl" /*RemoteObject*/ ,detailat.mostCurrent.activityBA,(Object)(RemoteObject.concat(detailat.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("login"))),(Object)(BA.ObjectToString("login=agung&password=Put1n4yl4k")),(Object)(BA.ObjectToString("Login")),(Object)(detailat.getObject()));
 };
 }else {
 BA.debugLineNum = 63;BA.debugLine="Log(\"No user detected\")";
Debug.ShouldStop(1073741824);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","11114122",RemoteObject.createImmutable("No user detected"),0);
 };
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
detailat.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 16;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
detailat.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnBack As Button";
detailat.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private MainScroll As ScrollView";
detailat.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Navbar As Panel";
detailat.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private TitleNavbar As Label";
detailat.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private wvDetail As WebView";
detailat.mostCurrent._wvdetail = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (detailat) ","detailat",1,detailat.mostCurrent.activityBA,detailat.mostCurrent,67);
if (RapidSub.canDelegate("jobdone")) { return b4a.example.detailat.remoteMe.runUserSub(false, "detailat","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _errorparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _errormap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _error = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 67;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(8);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","11179649",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 69;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 70;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 71;BA.debugLine="Dim res As String";
Debug.ShouldStop(64);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 72;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(128);
_res = _job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 73;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(256);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 74;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(512);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 75;BA.debugLine="Log(\"Response from server :\"&res)";
Debug.ShouldStop(1024);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","11179656",RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res),0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",detailat.processBA, e10.toString()); BA.debugLineNum = 78;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","11179659",BA.ObjectToString(detailat.mostCurrent.__c.runMethod(false,"LastException",detailat.mostCurrent.activityBA)),0);
 };
 }else {
 BA.debugLineNum = 81;BA.debugLine="Dim errorParser As JSONParser";
Debug.ShouldStop(65536);
_errorparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("errorParser", _errorparser);
 BA.debugLineNum = 82;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
Debug.ShouldStop(131072);
_errorparser.runVoidMethod ("Initialize",(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 84;BA.debugLine="Dim errorMap As Map";
Debug.ShouldStop(524288);
_errormap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 85;BA.debugLine="errorMap = errorParser.NextObject";
Debug.ShouldStop(1048576);
_errormap = _errorparser.runMethod(false,"NextObject");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 86;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(2097152);
detailat.mostCurrent.__c.runVoidMethod ("LogImpl","11179667",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 88;BA.debugLine="Dim error As String";
Debug.ShouldStop(8388608);
_error = RemoteObject.createImmutable("");Debug.locals.put("error", _error);
 BA.debugLineNum = 89;BA.debugLine="error = errorMap.Get(\"message\")";
Debug.ShouldStop(16777216);
_error = BA.ObjectToString(_errormap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("error", _error);
 BA.debugLineNum = 90;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
Debug.ShouldStop(33554432);
detailat.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_error))),(Object)(detailat.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 92;BA.debugLine="Job.Release";
Debug.ShouldStop(134217728);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}