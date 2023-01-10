package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapsat_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapsat) ","mapsat",5,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,36);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mapsat.remoteMe.runUserSub(false, "mapsat","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(16);
mapsat.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),mapsat.mostCurrent.activityBA);
 BA.debugLineNum = 38;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsRG\")";
Debug.ShouldStop(32);
mapsat.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapsRG")),mapsat.mostCurrent.activityBA);
 BA.debugLineNum = 39;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(64);
mapsat.mostCurrent._navbar.runMethod(true,"setVisible",mapsat.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 40;BA.debugLine="If Navbar.Visible == False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",mapsat.mostCurrent._navbar.runMethod(true,"getVisible"),mapsat.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 41;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
Debug.ShouldStop(256);
mapsat.mostCurrent._mainscroll.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {mapsat.mostCurrent._mainscroll.runMethod(true,"getTop"),mapsat.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 42;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
Debug.ShouldStop(512);
mapsat.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {mapsat.mostCurrent._mainscroll.runMethod(true,"getHeight"),mapsat.mostCurrent._navbar.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 44;BA.debugLine="WebViewRG.Height = MainScroll.Height";
Debug.ShouldStop(2048);
mapsat.mostCurrent._webviewrg.runMethod(true,"setHeight",mapsat.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 45;BA.debugLine="PanelRG.Height = MainScroll.Height";
Debug.ShouldStop(4096);
mapsat.mostCurrent._panelrg.runMethod(true,"setHeight",mapsat.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 46;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(8192);
mapsat.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",mapsat.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 48;BA.debugLine="WebViewRG.JavaScriptEnabled = True";
Debug.ShouldStop(32768);
mapsat.mostCurrent._webviewrg.runMethod(true,"setJavaScriptEnabled",mapsat.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 49;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewRG, \"We";
Debug.ShouldStop(65536);
mapsat.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",mapsat.mostCurrent.activityBA,(Object)((mapsat.mostCurrent._webviewrg.getObject())),(Object)(RemoteObject.createImmutable("WebViewRG")));
 BA.debugLineNum = 50;BA.debugLine="MyWebViewSetting.setDOMStorageEnabled(WebViewRG,T";
Debug.ShouldStop(131072);
mapsat.mostCurrent._mywebviewsetting.runVoidMethod ("setDOMStorageEnabled",(Object)((mapsat.mostCurrent._webviewrg.getObject())),(Object)(mapsat.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 51;BA.debugLine="WebViewRG.LoadUrl(Main.server)";
Debug.ShouldStop(262144);
mapsat.mostCurrent._webviewrg.runVoidMethod ("LoadUrl",(Object)(mapsat.mostCurrent._main._server /*RemoteObject*/ ));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (mapsat) ","mapsat",5,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,75);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mapsat.remoteMe.runUserSub(false, "mapsat","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 75;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 76;BA.debugLine="CallSubDelayed(Starter, \"StopGPS\")";
Debug.ShouldStop(2048);
mapsat.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsat.processBA,(Object)((mapsat.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StopGPS")));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsat) ","mapsat",5,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,57);
if (RapidSub.canDelegate("activity_resume")) { b4a.example.mapsat.remoteMe.runUserSub(false, "mapsat","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(b4a.example.mapsat parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.mapsat parent;
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsat) ","mapsat",5,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,57);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 58;BA.debugLine="Log(\"MapsAt Loaded\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","12621441",RemoteObject.createImmutable("MapsAt Loaded"),0);
 BA.debugLineNum = 59;BA.debugLine="If Starter.GPS1.GPSEnabled = False Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(true,"getGPSEnabled"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 60;BA.debugLine="ToastMessageShow(\"Please enable the GPS device.\"";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please enable the GPS device.")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 61;BA.debugLine="StartActivity(Starter.GPS1.LocationSettingsInten";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",mapsat.processBA,(Object)((parent.mostCurrent._starter._gps1 /*RemoteObject*/ .runMethod(false,"getLocationSettingsIntent"))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 63;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION";
Debug.ShouldStop(1073741824);
parent.mostCurrent._starter._rp /*RemoteObject*/ .runVoidMethod ("CheckAndRequest",mapsat.processBA,(Object)(parent.mostCurrent._starter._rp /*RemoteObject*/ .getField(true,"PERMISSION_ACCESS_FINE_LOCATION")));
 BA.debugLineNum = 64;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", mapsat.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapsat", "activity_resume"), null);
this.state = 13;
return;
case 13:
//C
this.state = 6;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 65;BA.debugLine="If Result Then";
Debug.ShouldStop(1);
if (true) break;

case 6:
//if
this.state = 11;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 66;BA.debugLine="CallSubDelayed(Starter, \"StartGPS\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed",mapsat.processBA,(Object)((parent.mostCurrent._starter.getObject())),(Object)(RemoteObject.createImmutable("StartGPS")));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 68;BA.debugLine="ToastMessageShow(\"Please allow GPS to run this";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please allow GPS to run this appliation")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 69;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _btnlist_click() throws Exception{
try {
		Debug.PushSubsStack("btnList_Click (mapsat) ","mapsat",5,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,105);
if (RapidSub.canDelegate("btnlist_click")) { return b4a.example.mapsat.remoteMe.runUserSub(false, "mapsat","btnlist_click");}
 BA.debugLineNum = 105;BA.debugLine="Private Sub btnList_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Log(\"Redirect to ListAt activity\")";
Debug.ShouldStop(512);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","13014657",RemoteObject.createImmutable("Redirect to ListAt activity"),0);
 BA.debugLineNum = 107;BA.debugLine="StartActivity(ListAt)";
Debug.ShouldStop(1024);
mapsat.mostCurrent.__c.runVoidMethod ("StartActivity",mapsat.processBA,(Object)((mapsat.mostCurrent._listat.getObject())));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnobj_click() throws Exception{
try {
		Debug.PushSubsStack("btnObj_Click (mapsat) ","mapsat",5,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,101);
if (RapidSub.canDelegate("btnobj_click")) { return b4a.example.mapsat.remoteMe.runUserSub(false, "mapsat","btnobj_click");}
 BA.debugLineNum = 101;BA.debugLine="Private Sub btnObj_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG,\"show";
Debug.ShouldStop(32);
mapsat.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsat.mostCurrent._webviewrg.getObject())),(Object)(RemoteObject.createImmutable("showObject('atraction')")));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnuserloc_click() throws Exception{
try {
		Debug.PushSubsStack("btnUserLoc_Click (mapsat) ","mapsat",5,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,84);
if (RapidSub.canDelegate("btnuserloc_click")) { return b4a.example.mapsat.remoteMe.runUserSub(false, "mapsat","btnuserloc_click");}
RemoteObject _panto = RemoteObject.createImmutable("");
 BA.debugLineNum = 84;BA.debugLine="Private Sub btnUserLoc_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="UpdateLocation";
Debug.ShouldStop(1048576);
_updatelocation();
 BA.debugLineNum = 86;BA.debugLine="Log(\"Panning to user location\")";
Debug.ShouldStop(2097152);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","12818050",RemoteObject.createImmutable("Panning to user location"),0);
 BA.debugLineNum = 87;BA.debugLine="Dim panTO As String";
Debug.ShouldStop(4194304);
_panto = RemoteObject.createImmutable("");Debug.locals.put("panTO", _panto);
 BA.debugLineNum = 88;BA.debugLine="panTO = \"panTo({lat:\"&Starter.lat&\",lng:\"&Starter";
Debug.ShouldStop(8388608);
_panto = RemoteObject.concat(RemoteObject.createImmutable("panTo({lat:"),mapsat.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable(",lng:"),mapsat.mostCurrent._starter._lng /*RemoteObject*/ ,RemoteObject.createImmutable("})"));Debug.locals.put("panTO", _panto);
 BA.debugLineNum = 89;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, panT";
Debug.ShouldStop(16777216);
mapsat.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsat.mostCurrent._webviewrg.getObject())),(Object)(_panto));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonback_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonBack_Click (mapsat) ","mapsat",5,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,110);
if (RapidSub.canDelegate("buttonback_click")) { return b4a.example.mapsat.remoteMe.runUserSub(false, "mapsat","buttonback_click");}
 BA.debugLineNum = 110;BA.debugLine="Private Sub ButtonBack_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(16384);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","13080193",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 112;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
mapsat.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
 //BA.debugLineNum = 14;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mapsat.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 15;BA.debugLine="Private MyWebViewSetting As WebViewSettings";
mapsat.mostCurrent._mywebviewsetting = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 16;BA.debugLine="Private Navbar As Panel";
mapsat.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private MainScroll As ScrollView";
mapsat.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnList As Button";
mapsat.mostCurrent._btnlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private btnObj As Button";
mapsat.mostCurrent._btnobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btnUserLoc As Button";
mapsat.mostCurrent._btnuserloc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Label1 As Label";
mapsat.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private Label2 As Label";
mapsat.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Label3 As Label";
mapsat.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private PanelCategory As Panel";
mapsat.mostCurrent._panelcategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private PanelRating As Panel";
mapsat.mostCurrent._panelrating = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private PanelRG As Panel";
mapsat.mostCurrent._panelrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelSearch As Panel";
mapsat.mostCurrent._panelsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private spinCategory As Spinner";
mapsat.mostCurrent._spincategory = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private spinRating As Spinner";
mapsat.mostCurrent._spinrating = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private WebViewRG As WebView";
mapsat.mostCurrent._webviewrg = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private spinName As Spinner";
mapsat.mostCurrent._spinname = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private ButtonBack As Button";
mapsat.mostCurrent._buttonback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim atractionMap As Map";
mapsat._atractionmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updatelocation() throws Exception{
try {
		Debug.PushSubsStack("UpdateLocation (mapsat) ","mapsat",5,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,93);
if (RapidSub.canDelegate("updatelocation")) { return b4a.example.mapsat.remoteMe.runUserSub(false, "mapsat","updatelocation");}
RemoteObject _addusermarkertomap = RemoteObject.createImmutable("");
 BA.debugLineNum = 93;BA.debugLine="Public Sub UpdateLocation";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Log(\"Update user position on Maps\")";
Debug.ShouldStop(536870912);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","12883585",RemoteObject.createImmutable("Update user position on Maps"),0);
 BA.debugLineNum = 95;BA.debugLine="Log(\"Lat: \"&Starter.lat&\"; Long: \"&Starter.lng)";
Debug.ShouldStop(1073741824);
mapsat.mostCurrent.__c.runVoidMethod ("LogImpl","12883586",RemoteObject.concat(RemoteObject.createImmutable("Lat: "),mapsat.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable("; Long: "),mapsat.mostCurrent._starter._lng /*RemoteObject*/ ),0);
 BA.debugLineNum = 96;BA.debugLine="Dim addUserMarkerToMap As String";
Debug.ShouldStop(-2147483648);
_addusermarkertomap = RemoteObject.createImmutable("");Debug.locals.put("addUserMarkerToMap", _addusermarkertomap);
 BA.debugLineNum = 97;BA.debugLine="addUserMarkerToMap = \"addUserMarkerToMap({lat:\"&S";
Debug.ShouldStop(1);
_addusermarkertomap = RemoteObject.concat(RemoteObject.createImmutable("addUserMarkerToMap({lat:"),mapsat.mostCurrent._starter._lat /*RemoteObject*/ ,RemoteObject.createImmutable(",lng:"),mapsat.mostCurrent._starter._lng /*RemoteObject*/ ,RemoteObject.createImmutable("})"));Debug.locals.put("addUserMarkerToMap", _addusermarkertomap);
 BA.debugLineNum = 98;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewRG, addU";
Debug.ShouldStop(2);
mapsat.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsat.mostCurrent._webviewrg.getObject())),(Object)(_addusermarkertomap));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _webviewrg_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebViewRG_PageFinished (mapsat) ","mapsat",5,mapsat.mostCurrent.activityBA,mapsat.mostCurrent,79);
if (RapidSub.canDelegate("webviewrg_pagefinished")) { return b4a.example.mapsat.remoteMe.runUserSub(false, "mapsat","webviewrg_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 79;BA.debugLine="Private Sub WebViewRG_PageFinished (Url As String)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}