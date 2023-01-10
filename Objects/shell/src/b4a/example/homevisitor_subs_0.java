package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class homevisitor_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,35);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.homevisitor.remoteMe.runUserSub(false, "homevisitor","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 38;BA.debugLine="Activity.LoadLayout(\"Homevisitor\")";
Debug.ShouldStop(32);
homevisitor.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Homevisitor")),homevisitor.mostCurrent.activityBA);
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
		Debug.PushSubsStack("Activity_Pause (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,48);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.homevisitor.remoteMe.runUserSub(false, "homevisitor","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 48;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Resume (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,42);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.homevisitor.remoteMe.runUserSub(false, "homevisitor","activity_resume");}
 BA.debugLineNum = 42;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Log(\"HomeVisitor loaded\")";
Debug.ShouldStop(1024);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","11441793",RemoteObject.createImmutable("HomeVisitor loaded"),0);
 BA.debugLineNum = 44;BA.debugLine="LabelName.Text = \"Hello, Visitor\"";
Debug.ShouldStop(2048);
homevisitor.mostCurrent._labelname.runMethod(true,"setText",BA.ObjectToCharSequence("Hello, Visitor"));
 BA.debugLineNum = 45;BA.debugLine="LabelUsername.Text = \"\"";
Debug.ShouldStop(4096);
homevisitor.mostCurrent._labelusername.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("BtnEV_Click (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,67);
if (RapidSub.canDelegate("btnev_click")) { return b4a.example.homevisitor.remoteMe.runUserSub(false, "homevisitor","btnev_click");}
 BA.debugLineNum = 67;BA.debugLine="Private Sub BtnEV_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Log(\"Redirect to Package Activity\")";
Debug.ShouldStop(8);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","11703937",RemoteObject.createImmutable("Redirect to Package Activity"),0);
 BA.debugLineNum = 69;BA.debugLine="StartActivity(TourismPackage)";
Debug.ShouldStop(16);
homevisitor.mostCurrent.__c.runVoidMethod ("StartActivity",homevisitor.processBA,(Object)((homevisitor.mostCurrent._tourismpackage.getObject())));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("BtnLogin_Click (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,58);
if (RapidSub.canDelegate("btnlogin_click")) { return b4a.example.homevisitor.remoteMe.runUserSub(false, "homevisitor","btnlogin_click");}
 BA.debugLineNum = 58;BA.debugLine="Private Sub BtnLogin_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 59;BA.debugLine="Log(\"Redirect to Main Activity\")";
Debug.ShouldStop(67108864);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","11638401",RemoteObject.createImmutable("Redirect to Main Activity"),0);
 BA.debugLineNum = 60;BA.debugLine="Main.manager.SetBoolean(\"is_login\", False)";
Debug.ShouldStop(134217728);
homevisitor.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("is_login")),(Object)(homevisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 61;BA.debugLine="Main.manager.SetBoolean(\"visitor\", False)";
Debug.ShouldStop(268435456);
homevisitor.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("visitor")),(Object)(homevisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 62;BA.debugLine="Main.manager.SetBoolean(\"user\", False)";
Debug.ShouldStop(536870912);
homevisitor.mostCurrent._main._manager /*RemoteObject*/ .runVoidMethod ("SetBoolean",(Object)(BA.ObjectToString("user")),(Object)(homevisitor.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 63;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
homevisitor.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 64;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(-2147483648);
homevisitor.mostCurrent.__c.runVoidMethod ("StartActivity",homevisitor.processBA,(Object)((homevisitor.mostCurrent._main.getObject())));
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
public static RemoteObject  _btnpd_click() throws Exception{
try {
		Debug.PushSubsStack("BtnPd_Click (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,72);
if (RapidSub.canDelegate("btnpd_click")) { return b4a.example.homevisitor.remoteMe.runUserSub(false, "homevisitor","btnpd_click");}
 BA.debugLineNum = 72;BA.debugLine="Private Sub BtnPd_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="Log(\"Redirect to Product Activity\")";
Debug.ShouldStop(256);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","11769473",RemoteObject.createImmutable("Redirect to Product Activity"),0);
 BA.debugLineNum = 74;BA.debugLine="StartActivity(TourismProduct)";
Debug.ShouldStop(512);
homevisitor.mostCurrent.__c.runVoidMethod ("StartActivity",homevisitor.processBA,(Object)((homevisitor.mostCurrent._tourismproduct.getObject())));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("BtnRG_Click (homevisitor) ","homevisitor",2,homevisitor.mostCurrent.activityBA,homevisitor.mostCurrent,53);
if (RapidSub.canDelegate("btnrg_click")) { return b4a.example.homevisitor.remoteMe.runUserSub(false, "homevisitor","btnrg_click");}
 BA.debugLineNum = 53;BA.debugLine="Private Sub BtnRG_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="Log(\"Redirect to AtractionMap Activity\")";
Debug.ShouldStop(2097152);
homevisitor.mostCurrent.__c.runVoidMethod ("LogImpl","11572865",RemoteObject.createImmutable("Redirect to AtractionMap Activity"),0);
 BA.debugLineNum = 55;BA.debugLine="StartActivity(MapsAt)";
Debug.ShouldStop(4194304);
homevisitor.mostCurrent.__c.runVoidMethod ("StartActivity",homevisitor.processBA,(Object)((homevisitor.mostCurrent._mapsat.getObject())));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
 //BA.debugLineNum = 16;BA.debugLine="Private BtnEV As Button";
homevisitor.mostCurrent._btnev = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnLogin As Button";
homevisitor.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private BtnRG As Button";
homevisitor.mostCurrent._btnrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private LabelEV As Label";
homevisitor.mostCurrent._labelev = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private LabelHeader As Label";
homevisitor.mostCurrent._labelheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private LabelLogin As Label";
homevisitor.mostCurrent._labellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private LabelName As Label";
homevisitor.mostCurrent._labelname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private LabelRG As Label";
homevisitor.mostCurrent._labelrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private LabelUsername As Label";
homevisitor.mostCurrent._labelusername = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private PanelBanner As Panel";
homevisitor.mostCurrent._panelbanner = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private PanelHome As Panel";
homevisitor.mostCurrent._panelhome = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelMenu As Panel";
homevisitor.mostCurrent._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelProfile As Panel";
homevisitor.mostCurrent._panelprofile = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private ProfileAvatar As ImageView";
homevisitor.mostCurrent._profileavatar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private BtnPd As Button";
homevisitor.mostCurrent._btnpd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private LabelPd As Label";
homevisitor.mostCurrent._labelpd = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelPd As Panel";
homevisitor.mostCurrent._panelpd = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}