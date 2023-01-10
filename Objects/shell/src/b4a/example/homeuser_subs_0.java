package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homeuser_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homeuser) ","homeuser",10,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.homeuser.remoteMe.runUserSub(false, "homeuser","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"Homeuser\")";
Debug.ShouldStop(16);
homeuser.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Homeuser")),homeuser.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="Log(\"HomeUser loaded\")";
Debug.ShouldStop(32);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","15701636",RemoteObject.createImmutable("HomeUser loaded"),0);
 BA.debugLineNum = 39;BA.debugLine="Core.ExecuteUrl(Main.server&\"profile\", \"id=\"&Main";
Debug.ShouldStop(64);
homeuser.mostCurrent._core.runVoidMethod ("_executeurl" /*RemoteObject*/ ,homeuser.mostCurrent.activityBA,(Object)(RemoteObject.concat(homeuser.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("profile"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("id="),homeuser.mostCurrent._main._manager /*RemoteObject*/ .runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("user_id"))))),(Object)(BA.ObjectToString("Profile")),(Object)(homeuser.getObject()));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (homeuser) ","homeuser",10,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,47);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.homeuser.remoteMe.runUserSub(false, "homeuser","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (homeuser) ","homeuser",10,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,43);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.homeuser.remoteMe.runUserSub(false, "homeuser","activity_resume");}
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Log(\"HomeUser resumed\")";
Debug.ShouldStop(2048);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","15767169",RemoteObject.createImmutable("HomeUser resumed"),0);
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
public static RemoteObject  _btnev_click() throws Exception{
try {
		Debug.PushSubsStack("BtnEV_Click (homeuser) ","homeuser",10,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,62);
if (RapidSub.canDelegate("btnev_click")) { return b4a.example.homeuser.remoteMe.runUserSub(false, "homeuser","btnev_click");}
 BA.debugLineNum = 62;BA.debugLine="Private Sub BtnEV_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Log(\"Redirect to EventMap Activity\")";
Debug.ShouldStop(1073741824);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","16029313",RemoteObject.createImmutable("Redirect to EventMap Activity"),0);
 BA.debugLineNum = 64;BA.debugLine="StartActivity(MapsEv)";
Debug.ShouldStop(-2147483648);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._mapsev.getObject())));
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
public static RemoteObject  _btnlogout_click() throws Exception{
try {
		Debug.PushSubsStack("BtnLogout_Click (homeuser) ","homeuser",10,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,57);
if (RapidSub.canDelegate("btnlogout_click")) { return b4a.example.homeuser.remoteMe.runUserSub(false, "homeuser","btnlogout_click");}
 BA.debugLineNum = 57;BA.debugLine="Private Sub BtnLogout_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Log(\"Redirect to Main Activity\")";
Debug.ShouldStop(33554432);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","15963777",RemoteObject.createImmutable("Redirect to Main Activity"),0);
 BA.debugLineNum = 59;BA.debugLine="Core.ExecuteUrlGet(Main.server&\"logout\", \"Logout\"";
Debug.ShouldStop(67108864);
homeuser.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,homeuser.mostCurrent.activityBA,(Object)(RemoteObject.concat(homeuser.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("logout"))),(Object)(BA.ObjectToString("Logout")),(Object)(homeuser.getObject()));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnrg_click() throws Exception{
try {
		Debug.PushSubsStack("BtnRG_Click (homeuser) ","homeuser",10,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,52);
if (RapidSub.canDelegate("btnrg_click")) { return b4a.example.homeuser.remoteMe.runUserSub(false, "homeuser","btnrg_click");}
 BA.debugLineNum = 52;BA.debugLine="Private Sub BtnRG_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Log(\"Redirect to AtractionMap Activity\")";
Debug.ShouldStop(1048576);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","15898241",RemoteObject.createImmutable("Redirect to AtractionMap Activity"),0);
 BA.debugLineNum = 54;BA.debugLine="StartActivity(MapsAt)";
Debug.ShouldStop(2097152);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._mapsat.getObject())));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private BtnEV As Button";
homeuser.mostCurrent._btnev = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private BtnLogout As Button";
homeuser.mostCurrent._btnlogout = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private BtnRG As Button";
homeuser.mostCurrent._btnrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LabelEV As Label";
homeuser.mostCurrent._labelev = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LabelHeader As Label";
homeuser.mostCurrent._labelheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LabelLogout As Label";
homeuser.mostCurrent._labellogout = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LabelName As Label";
homeuser.mostCurrent._labelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelRG As Label";
homeuser.mostCurrent._labelrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LabelUsername As Label";
homeuser.mostCurrent._labelusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelBanner As Panel";
homeuser.mostCurrent._panelbanner = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelHome As Panel";
homeuser.mostCurrent._panelhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private PanelMenu As Panel";
homeuser.mostCurrent._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private PanelProfile As Panel";
homeuser.mostCurrent._panelprofile = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ProfileAvatar As ImageView";
homeuser.mostCurrent._profileavatar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (homeuser) ","homeuser",10,homeuser.mostCurrent.activityBA,homeuser.mostCurrent,67);
if (RapidSub.canDelegate("jobdone")) { return b4a.example.homeuser.remoteMe.runUserSub(false, "homeuser","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _avatarmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _avatarpath = RemoteObject.createImmutable("");
RemoteObject _errorparser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _errormap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _error = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 67;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(8);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","16094849",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 69;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 70;BA.debugLine="Dim res As String";
Debug.ShouldStop(32);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 71;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(64);
_res = _job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 72;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 73;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 74;BA.debugLine="Log(\"Response from server :\"&res)";
Debug.ShouldStop(512);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","16094855",RemoteObject.concat(RemoteObject.createImmutable("Response from server :"),_res),0);
 BA.debugLineNum = 75;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("Profile"),BA.ObjectToString("Logout"))) {
case 0: {
 BA.debugLineNum = 77;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 78;BA.debugLine="Dim map As Map";
Debug.ShouldStop(8192);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 79;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(16384);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 80;BA.debugLine="data = map.Get(\"data\")";
Debug.ShouldStop(32768);
homeuser._data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));
 BA.debugLineNum = 81;BA.debugLine="id = data.Get(\"id\")";
Debug.ShouldStop(65536);
homeuser._id = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));
 BA.debugLineNum = 82;BA.debugLine="email = data.Get(\"email\")";
Debug.ShouldStop(131072);
homeuser._email = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));
 BA.debugLineNum = 83;BA.debugLine="username = data.Get(\"username\")";
Debug.ShouldStop(262144);
homeuser._username = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("username")))));
 BA.debugLineNum = 84;BA.debugLine="name = data.Get(\"name\")";
Debug.ShouldStop(524288);
homeuser._name = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));
 BA.debugLineNum = 85;BA.debugLine="user_image = data.Get(\"user_image\")";
Debug.ShouldStop(1048576);
homeuser._user_image = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("user_image")))));
 BA.debugLineNum = 86;BA.debugLine="address = data.Get(\"address\")";
Debug.ShouldStop(2097152);
homeuser._address = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address")))));
 BA.debugLineNum = 87;BA.debugLine="contact = data.Get(\"contact\")";
Debug.ShouldStop(4194304);
homeuser._contact = BA.ObjectToString(homeuser._data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("contact")))));
 BA.debugLineNum = 89;BA.debugLine="LabelName.Text = name";
Debug.ShouldStop(16777216);
homeuser.mostCurrent._labelname.runMethod(true,"setText",BA.ObjectToCharSequence(homeuser._name));
 BA.debugLineNum = 90;BA.debugLine="LabelUsername.Text = \"@\"&username";
Debug.ShouldStop(33554432);
homeuser.mostCurrent._labelusername.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("@"),homeuser._username)));
 BA.debugLineNum = 92;BA.debugLine="Dim avatarMap As Map";
Debug.ShouldStop(134217728);
_avatarmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("avatarMap", _avatarmap);
 BA.debugLineNum = 93;BA.debugLine="Dim avatarPath As String";
Debug.ShouldStop(268435456);
_avatarpath = RemoteObject.createImmutable("");Debug.locals.put("avatarPath", _avatarpath);
 BA.debugLineNum = 94;BA.debugLine="avatarPath = Main.baseServer & \"assets/images";
Debug.ShouldStop(536870912);
_avatarpath = RemoteObject.concat(homeuser.mostCurrent._main._baseserver /*RemoteObject*/ ,RemoteObject.createImmutable("assets/images/user-photos/"),homeuser._user_image);Debug.locals.put("avatarPath", _avatarpath);
 BA.debugLineNum = 96;BA.debugLine="avatarMap.Initialize";
Debug.ShouldStop(-2147483648);
_avatarmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 97;BA.debugLine="avatarMap.Put(ProfileAvatar, avatarPath)";
Debug.ShouldStop(1);
_avatarmap.runVoidMethod ("Put",(Object)((homeuser.mostCurrent._profileavatar.getObject())),(Object)((_avatarpath)));
 BA.debugLineNum = 98;BA.debugLine="Log(avatarMap.GetKeyAt(0))";
Debug.ShouldStop(2);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","16094879",BA.ObjectToString(_avatarmap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0)))),0);
 BA.debugLineNum = 99;BA.debugLine="Log(avatarMap.GetValueAt(0))";
Debug.ShouldStop(4);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","16094880",BA.ObjectToString(_avatarmap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))),0);
 BA.debugLineNum = 100;BA.debugLine="CallSubDelayed2(Starter, \"Download\", avatarMa";
Debug.ShouldStop(8);
homeuser.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",homeuser.processBA,(Object)((homeuser.mostCurrent._starter.getObject())),(Object)(BA.ObjectToString("Download")),(Object)((_avatarmap)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",homeuser.processBA, e32.toString()); BA.debugLineNum = 103;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","16094884",BA.ObjectToString(homeuser.mostCurrent.__c.runMethod(false,"LastException",homeuser.mostCurrent.activityBA)),0);
 };
 break; }
case 1: {
 BA.debugLineNum = 107;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 108;BA.debugLine="Dim map As Map";
Debug.ShouldStop(2048);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 109;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(4096);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 110;BA.debugLine="status = map.Get(\"status\")";
Debug.ShouldStop(8192);
homeuser._status = BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));
 BA.debugLineNum = 111;BA.debugLine="If status == 200 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",homeuser._status,BA.numberCast(double.class, 200))) { 
 BA.debugLineNum = 112;BA.debugLine="Msgbox2(\"Successfully logged out\", \"Log Out\"";
Debug.ShouldStop(32768);
homeuser.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Successfully logged out")),(Object)(BA.ObjectToCharSequence("Log Out")),(Object)(BA.ObjectToString("Oke")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)((homeuser.mostCurrent.__c.getField(false,"Null"))),homeuser.mostCurrent.activityBA);
 BA.debugLineNum = 113;BA.debugLine="Main.manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(65536);
homeuser.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(homeuser.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 114;BA.debugLine="Main.manager.SetBoolean(\"visitor\", False)";
Debug.ShouldStop(131072);
homeuser.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(homeuser.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 115;BA.debugLine="Main.manager.SetBoolean(\"user\", False)";
Debug.ShouldStop(262144);
homeuser.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(homeuser.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 116;BA.debugLine="Log(\"Successfully logged out\")";
Debug.ShouldStop(524288);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","16094897",RemoteObject.createImmutable("Successfully logged out"),0);
 BA.debugLineNum = 117;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1048576);
homeuser.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 118;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(2097152);
homeuser.mostCurrent.__c.runVoidMethod ("StartActivity",homeuser.processBA,(Object)((homeuser.mostCurrent._main.getObject())));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e49) {
			BA.rdebugUtils.runVoidMethod("setLastException",homeuser.processBA, e49.toString()); BA.debugLineNum = 121;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","16094902",BA.ObjectToString(homeuser.mostCurrent.__c.runMethod(false,"LastException",homeuser.mostCurrent.activityBA)),0);
 };
 break; }
}
;
 }else {
 BA.debugLineNum = 126;BA.debugLine="Dim errorParser As JSONParser";
Debug.ShouldStop(536870912);
_errorparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("errorParser", _errorparser);
 BA.debugLineNum = 127;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
Debug.ShouldStop(1073741824);
_errorparser.runVoidMethod ("Initialize",(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 129;BA.debugLine="Dim errorMap As Map";
Debug.ShouldStop(1);
_errormap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 130;BA.debugLine="errorMap = errorParser.NextObject";
Debug.ShouldStop(2);
_errormap = _errorparser.runMethod(false,"NextObject");Debug.locals.put("errorMap", _errormap);
 BA.debugLineNum = 131;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
Debug.ShouldStop(4);
homeuser.mostCurrent.__c.runVoidMethod ("LogImpl","16094912",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 133;BA.debugLine="Dim error As String";
Debug.ShouldStop(16);
_error = RemoteObject.createImmutable("");Debug.locals.put("error", _error);
 BA.debugLineNum = 134;BA.debugLine="error = errorMap.Get(\"message\")";
Debug.ShouldStop(32);
_error = BA.ObjectToString(_errormap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("message")))));Debug.locals.put("error", _error);
 BA.debugLineNum = 135;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
Debug.ShouldStop(64);
homeuser.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error: "),_error))),(Object)(homeuser.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 137;BA.debugLine="Job.Release";
Debug.ShouldStop(256);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
 //BA.debugLineNum = 9;BA.debugLine="Public data As Map";
homeuser._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="Public id, username, email, name, user_image, add";
homeuser._id = RemoteObject.createImmutable("");
homeuser._username = RemoteObject.createImmutable("");
homeuser._email = RemoteObject.createImmutable("");
homeuser._name = RemoteObject.createImmutable("");
homeuser._user_image = RemoteObject.createImmutable("");
homeuser._address = RemoteObject.createImmutable("");
homeuser._contact = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Public status As Int";
homeuser._status = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}