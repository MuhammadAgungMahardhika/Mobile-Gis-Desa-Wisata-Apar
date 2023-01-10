package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,36);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="CheckLogin";
Debug.ShouldStop(16);
_checklogin();
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"Login\")";
Debug.ShouldStop(32);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Login")),main.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="StartActivity(Homevisitor)";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homevisitor.getObject())));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,47);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,42);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Log(\"Login loaded\")";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1196609",RemoteObject.createImmutable("Login loaded"),0);
 BA.debugLineNum = 44;BA.debugLine="Log(\"Resume: \"&manager.GetBoolean(\"user\"))";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1196610",RemoteObject.concat(RemoteObject.createImmutable("Resume: "),main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("user")))),0);
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
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogin_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,69);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnlogin_click");}
 BA.debugLineNum = 69;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Log(server&\"login\")";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1524289",RemoteObject.concat(main._server,RemoteObject.createImmutable("login")),0);
 BA.debugLineNum = 71;BA.debugLine="Core.ExecuteUrl(server&\"login\", \"login=\"&EditLogi";
Debug.ShouldStop(64);
main.mostCurrent._core.runVoidMethod ("_executeurl" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(RemoteObject.concat(main._server,RemoteObject.createImmutable("login"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("login="),main.mostCurrent._editlogin.runMethod(true,"getText"),RemoteObject.createImmutable("&password="),main.mostCurrent._editpassword.runMethod(true,"getText"))),(Object)(BA.ObjectToString("Login")),(Object)(main.getObject()));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnvisitor_click() throws Exception{
try {
		Debug.PushSubsStack("BtnVisitor_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("btnvisitor_click")) { return b4a.example.main.remoteMe.runUserSub(false, "main","btnvisitor_click");}
 BA.debugLineNum = 60;BA.debugLine="Private Sub BtnVisitor_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="Log(\"Redirecting to HomeVisitor Activity\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1458753",RemoteObject.createImmutable("Redirecting to HomeVisitor Activity"),0);
 BA.debugLineNum = 62;BA.debugLine="manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(536870912);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 63;BA.debugLine="manager.SetBoolean(\"visitor\", True)";
Debug.ShouldStop(1073741824);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 64;BA.debugLine="manager.SetBoolean(\"user\", False)";
Debug.ShouldStop(-2147483648);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 65;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 66;BA.debugLine="StartActivity(Homevisitor)";
Debug.ShouldStop(2);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homevisitor.getObject())));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("CheckLogin (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,74);
if (RapidSub.canDelegate("checklogin")) { return b4a.example.main.remoteMe.runUserSub(false, "main","checklogin");}
RemoteObject _islogin = RemoteObject.createImmutable(false);
 BA.debugLineNum = 74;BA.debugLine="Sub CheckLogin";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Log(\"Checking login status...\")";
Debug.ShouldStop(1024);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1589825",RemoteObject.createImmutable("Checking login status..."),0);
 BA.debugLineNum = 76;BA.debugLine="Dim isLogin As Boolean";
Debug.ShouldStop(2048);
_islogin = RemoteObject.createImmutable(false);Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 77;BA.debugLine="isLogin = manager.GetBoolean(\"is_login\")";
Debug.ShouldStop(4096);
_islogin = main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("is_login")));Debug.locals.put("isLogin", _islogin);
 BA.debugLineNum = 78;BA.debugLine="If isLogin Then";
Debug.ShouldStop(8192);
if (_islogin.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="If manager.GetBoolean(\"user\") Then";
Debug.ShouldStop(16384);
if (main._manager.runMethod(true,"GetBoolean",(Object)(RemoteObject.createImmutable("user"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 80;BA.debugLine="Log(\"Redirecting to HomeUser activity\")";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1589830",RemoteObject.createImmutable("Redirecting to HomeUser activity"),0);
 BA.debugLineNum = 81;BA.debugLine="Activity.Finish";
Debug.ShouldStop(65536);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 82;BA.debugLine="StartActivity(Homeuser)";
Debug.ShouldStop(131072);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homeuser.getObject())));
 };
 };
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editlogin_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditLogin_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,56);
if (RapidSub.canDelegate("editlogin_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","editlogin_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 56;BA.debugLine="Private Sub EditLogin_TextChanged (Old As String,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editpassword_textchanged(RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditPassword_TextChanged (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,52);
if (RapidSub.canDelegate("editpassword_textchanged")) { return b4a.example.main.remoteMe.runUserSub(false, "main","editpassword_textchanged", _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 52;BA.debugLine="Private Sub EditPassword_TextChanged (Old As Strin";
Debug.ShouldStop(524288);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 28;BA.debugLine="Private BtnLogin As Button";
main.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private BtnVisitor As Button";
main.mostCurrent._btnvisitor = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private EditLogin As EditText";
main.mostCurrent._editlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private EditPassword As EditText";
main.mostCurrent._editpassword = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ImageLogin As ImageView";
main.mostCurrent._imagelogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private PanelLogin As Panel";
main.mostCurrent._panellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,87);
if (RapidSub.canDelegate("jobdone")) { return b4a.example.main.remoteMe.runUserSub(false, "main","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _errorparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _errormap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _error = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 87;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1655361",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 89;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16777216);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 90;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 91;BA.debugLine="Dim res As String";
Debug.ShouldStop(67108864);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 92;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(134217728);
_res = _job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 93;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(268435456);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 94;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(536870912);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 95;BA.debugLine="Log(\"Response from server :\"&res)";
Debug.ShouldStop(1073741824);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1655368",RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res),0);
 BA.debugLineNum = 97;BA.debugLine="Dim map As Map";
Debug.ShouldStop(1);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 98;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(2);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 99;BA.debugLine="data = map.Get(\"data\")";
Debug.ShouldStop(4);
main._data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));
 BA.debugLineNum = 100;BA.debugLine="in_group = data.Get(\"in_group\")";
Debug.ShouldStop(8);
main._in_group = BA.ObjectToBoolean(main._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("in_group")))));
 BA.debugLineNum = 101;BA.debugLine="If in_group Then";
Debug.ShouldStop(16);
if (main._in_group.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 102;BA.debugLine="user = data.Get(\"user\")";
Debug.ShouldStop(32);
main._user = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), main._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user")))));
 BA.debugLineNum = 103;BA.debugLine="id = user.Get(\"id\")";
Debug.ShouldStop(64);
main._id = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 104;BA.debugLine="email = user.Get(\"email\")";
Debug.ShouldStop(128);
main._email = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));
 BA.debugLineNum = 105;BA.debugLine="username = user.Get(\"username\")";
Debug.ShouldStop(256);
main._username = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));
 BA.debugLineNum = 106;BA.debugLine="name = user.Get(\"name\")";
Debug.ShouldStop(512);
main._name = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 107;BA.debugLine="user_image = user.Get(\"user_image\")";
Debug.ShouldStop(1024);
main._user_image = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_image")))));
 BA.debugLineNum = 108;BA.debugLine="address = user.Get(\"address\")";
Debug.ShouldStop(2048);
main._address = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address")))));
 BA.debugLineNum = 109;BA.debugLine="contact = user.Get(\"contact\")";
Debug.ShouldStop(4096);
main._contact = BA.ObjectToString(main._user.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("contact")))));
 BA.debugLineNum = 111;BA.debugLine="ToastMessageShow(\"Login as User\", False)";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Login as User")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 112;BA.debugLine="Msgbox2(\"Hi, \"&name, \"Logged In\",\"Oke\",\"\",\"\",N";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Hi, "),main._name))),(Object)(BA.ObjectToCharSequence("Logged In")),(Object)(BA.ObjectToString("Oke")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 113;BA.debugLine="Log(\"Redirect to HomeUser Activity\")";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1655386",RemoteObject.createImmutable("Redirect to HomeUser Activity"),0);
 BA.debugLineNum = 115;BA.debugLine="manager.SetBoolean(\"is_login\", True)";
Debug.ShouldStop(262144);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 116;BA.debugLine="manager.SetBoolean(\"user\", True)";
Debug.ShouldStop(524288);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 117;BA.debugLine="manager.SetBoolean(\"visitor\", False)";
Debug.ShouldStop(1048576);
main._manager.runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 118;BA.debugLine="manager.SetString(\"user_id\", id)";
Debug.ShouldStop(2097152);
main._manager.runVoidMethod ("SetString",(Object)(BA.ObjectToString("user_id")),(Object)(main._id));
 BA.debugLineNum = 119;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4194304);
main.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 120;BA.debugLine="StartActivity(Homeuser)";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._homeuser.getObject())));
 }else {
 BA.debugLineNum = 122;BA.debugLine="MsgboxAsync(\"Please input correct credentials\"";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please input correct credentials")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Failed"))),main.processBA);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e35) {
			BA.rdebugUtils.runVoidMethod("setLastException",main.processBA, e35.toString()); BA.debugLineNum = 125;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1655398",BA.ObjectToString(main.mostCurrent.__c.runMethod(false,"LastException",main.mostCurrent.activityBA)),0);
 };
 }else {
 BA.debugLineNum = 128;BA.debugLine="Dim errorParser As JSONParser";
Debug.ShouldStop(-2147483648);
_errorparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("errorParser", _errorparser);
 BA.debugLineNum = 129;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
Debug.ShouldStop(1);
_errorparser.runVoidMethod ("Initialize",(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 131;BA.debugLine="Dim errorMap As Map";
Debug.ShouldStop(4);
_errormap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 132;BA.debugLine="errorMap = errorParser.NextObject";
Debug.ShouldStop(8);
_errormap = _errorparser.runMethod(false,"NextObject");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 133;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("LogImpl","1655406",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 135;BA.debugLine="Dim error As String";
Debug.ShouldStop(64);
_error = RemoteObject.createImmutable("");Debug.locals.put("error", _error);
 BA.debugLineNum = 136;BA.debugLine="error = errorMap.Get(\"message\")";
Debug.ShouldStop(128);
_error = BA.ObjectToString(_errormap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("error", _error);
 BA.debugLineNum = 137;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
Debug.ShouldStop(256);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_error))),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 138;BA.debugLine="MsgboxAsync(\"Please input correct credentials\",\"";
Debug.ShouldStop(512);
main.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please input correct credentials")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Login Failed"))),main.processBA);
 };
 BA.debugLineNum = 140;BA.debugLine="Job.Release";
Debug.ShouldStop(2048);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
detailat_subs_0._process_globals();
homevisitor_subs_0._process_globals();
detailev_subs_0._process_globals();
core_subs_0._process_globals();
mapsat_subs_0._process_globals();
starter_subs_0._process_globals();
tourismproduct_subs_0._process_globals();
tourismpackage_subs_0._process_globals();
listat_subs_0._process_globals();
homeuser_subs_0._process_globals();
listev_subs_0._process_globals();
mapsev_subs_0._process_globals();
httputils2service_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
detailat.myClass = BA.getDeviceClass ("b4a.example.detailat");
homevisitor.myClass = BA.getDeviceClass ("b4a.example.homevisitor");
detailev.myClass = BA.getDeviceClass ("b4a.example.detailev");
core.myClass = BA.getDeviceClass ("b4a.example.core");
mapsat.myClass = BA.getDeviceClass ("b4a.example.mapsat");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
tourismproduct.myClass = BA.getDeviceClass ("b4a.example.tourismproduct");
tourismpackage.myClass = BA.getDeviceClass ("b4a.example.tourismpackage");
listat.myClass = BA.getDeviceClass ("b4a.example.listat");
homeuser.myClass = BA.getDeviceClass ("b4a.example.homeuser");
listev.myClass = BA.getDeviceClass ("b4a.example.listev");
mapsev.myClass = BA.getDeviceClass ("b4a.example.mapsev");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.httpjob");
simplemediamanager.myClass = BA.getDeviceClass ("b4a.example.simplemediamanager");
smmviews.myClass = BA.getDeviceClass ("b4a.example.smmviews");
requestsmanager.myClass = BA.getDeviceClass ("b4a.example.requestsmanager");
bitmapsasync.myClass = BA.getDeviceClass ("b4a.example.bitmapsasync");
b4xbitset.myClass = BA.getDeviceClass ("b4a.example.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4a.example.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4a.example.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4a.example.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4a.example.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4a.example.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4a.example.b4xset");
animatedcounter.myClass = BA.getDeviceClass ("b4a.example.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.example.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.example.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.example.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.example.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.example.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.example.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4a.example.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.example.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.example.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.example.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4a.example.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4a.example.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.example.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.example.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.example.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4a.example.madewithlove");
b4xformatter.myClass = BA.getDeviceClass ("b4a.example.b4xformatter");
roundslider.myClass = BA.getDeviceClass ("b4a.example.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.example.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.example.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4a.example.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public server As String = \"https://apar.batubusua";
main._server = BA.ObjectToString("https://apar.batubusuak.com/mobile/");
 //BA.debugLineNum = 19;BA.debugLine="Public baseServer As String = \"https://apar.batub";
main._baseserver = BA.ObjectToString("https://apar.batubusuak.com/");
 //BA.debugLineNum = 20;BA.debugLine="Public data, user As Map";
main._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
main._user = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 21;BA.debugLine="Public id,email, username,  name, user_image, add";
main._id = RemoteObject.createImmutable("");
main._email = RemoteObject.createImmutable("");
main._username = RemoteObject.createImmutable("");
main._name = RemoteObject.createImmutable("");
main._user_image = RemoteObject.createImmutable("");
main._address = RemoteObject.createImmutable("");
main._contact = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Public in_group As Boolean";
main._in_group = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 23;BA.debugLine="Public manager As AHPreferenceManager";
main._manager = RemoteObject.createNew ("de.amberhome.objects.preferenceactivity.PreferenceManager");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}