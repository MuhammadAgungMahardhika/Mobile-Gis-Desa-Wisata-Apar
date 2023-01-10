package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapsev_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,47);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(32768);
mapsev.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),mapsev.mostCurrent.activityBA);
 BA.debugLineNum = 49;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsEV\")";
Debug.ShouldStop(65536);
mapsev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MapsEV")),mapsev.mostCurrent.activityBA);
 BA.debugLineNum = 50;BA.debugLine="Navbar.Visible = False";
Debug.ShouldStop(131072);
mapsev.mostCurrent._navbar.runMethod(true,"setVisible",mapsev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 51;BA.debugLine="If Navbar.Visible == False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",mapsev.mostCurrent._navbar.runMethod(true,"getVisible"),mapsev.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 52;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
Debug.ShouldStop(524288);
mapsev.mostCurrent._mainscroll.runMethod(true,"setTop",RemoteObject.solve(new RemoteObject[] {mapsev.mostCurrent._mainscroll.runMethod(true,"getTop"),mapsev.mostCurrent._navbar.runMethod(true,"getHeight")}, "-",1, 1));
 BA.debugLineNum = 53;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
Debug.ShouldStop(1048576);
mapsev.mostCurrent._mainscroll.runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"),mapsev.mostCurrent._navbar.runMethod(true,"getHeight")}, "+",1, 1));
 };
 BA.debugLineNum = 55;BA.debugLine="WebViewEV.Height = MainScroll.Height";
Debug.ShouldStop(4194304);
mapsev.mostCurrent._webviewev.runMethod(true,"setHeight",mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 56;BA.debugLine="PanelEV.Height = MainScroll.Height";
Debug.ShouldStop(8388608);
mapsev.mostCurrent._panelev.runMethod(true,"setHeight",mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 57;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(16777216);
mapsev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",mapsev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 59;BA.debugLine="WebViewEV.JavaScriptEnabled = True";
Debug.ShouldStop(67108864);
mapsev.mostCurrent._webviewev.runMethod(true,"setJavaScriptEnabled",mapsev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewEV, \"We";
Debug.ShouldStop(134217728);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",mapsev.mostCurrent.activityBA,(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(RemoteObject.createImmutable("WebViewEV")));
 BA.debugLineNum = 61;BA.debugLine="MyWebViewSetting.setDOMStorageEnabled(WebViewEV,T";
Debug.ShouldStop(268435456);
mapsev.mostCurrent._mywebviewsetting.runVoidMethod ("setDOMStorageEnabled",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(mapsev.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 62;BA.debugLine="WebViewEV.LoadUrl(Main.server)";
Debug.ShouldStop(536870912);
mapsev.mostCurrent._webviewev.runVoidMethod ("LoadUrl",(Object)(mapsev.mostCurrent._main._server /*RemoteObject*/ ));
 BA.debugLineNum = 64;BA.debugLine="spinName.DropdownBackgroundColor = Colors.White";
Debug.ShouldStop(-2147483648);
mapsev.mostCurrent._spinname.runMethod(true,"setDropdownBackgroundColor",mapsev.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 65;BA.debugLine="Core.ExecuteUrlGet(Main.server&\"event\",\"LoadEvent";
Debug.ShouldStop(1);
mapsev.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,mapsev.mostCurrent.activityBA,(Object)(RemoteObject.concat(mapsev.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("event"))),(Object)(BA.ObjectToString("LoadEvent")),(Object)(mapsev.getObject()));
 BA.debugLineNum = 67;BA.debugLine="spinRating.DropdownBackgroundColor = Colors.White";
Debug.ShouldStop(4);
mapsev.mostCurrent._spinrating.runMethod(true,"setDropdownBackgroundColor",mapsev.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 68;BA.debugLine="spinRating.AddAll(Array As String(\"Rating...\", \"1";
Debug.ShouldStop(8);
mapsev.mostCurrent._spinrating.runVoidMethod ("AddAll",(Object)(mapsev.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("Rating..."),BA.ObjectToString("1"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),RemoteObject.createImmutable("5")})))));
 BA.debugLineNum = 70;BA.debugLine="Dialog.Initialize (Activity)";
Debug.ShouldStop(32);
mapsev.mostCurrent._dialog.runClassMethod (b4a.example.b4xdialog.class, "_initialize" /*RemoteObject*/ ,mapsev.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), mapsev.mostCurrent._activity.getObject()));
 BA.debugLineNum = 71;BA.debugLine="Dialog.Title = \"Select Date...\"";
Debug.ShouldStop(64);
mapsev.mostCurrent._dialog.setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Select Date...")));
 BA.debugLineNum = 72;BA.debugLine="DateTemplate.Initialize";
Debug.ShouldStop(128);
mapsev.mostCurrent._datetemplate.runClassMethod (b4a.example.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,mapsev.mostCurrent.activityBA);
 BA.debugLineNum = 73;BA.debugLine="DateTemplate.MinYear = 2000";
Debug.ShouldStop(256);
mapsev.mostCurrent._datetemplate.setField ("_minyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2000));
 BA.debugLineNum = 74;BA.debugLine="DateTemplate.MaxYear = 2050";
Debug.ShouldStop(512);
mapsev.mostCurrent._datetemplate.setField ("_maxyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2050));
 BA.debugLineNum = 75;BA.debugLine="btnDate.xLBL.Text = \"From\"";
Debug.ShouldStop(1024);
mapsev.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("From"));
 BA.debugLineNum = 76;BA.debugLine="btnDate2.xLBL.Text=\"To\"";
Debug.ShouldStop(2048);
mapsev.mostCurrent._btndate2.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("To"));
 BA.debugLineNum = 78;BA.debugLine="selectedDate = \"\"";
Debug.ShouldStop(8192);
mapsev._selecteddate = BA.ObjectToString("");
 BA.debugLineNum = 79;BA.debugLine="selectedDate2 = \"\"";
Debug.ShouldStop(16384);
mapsev._selecteddate2 = BA.ObjectToString("");
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Activity_Pause (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,88);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 88;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Activity_Resume (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,84);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","activity_resume");}
 BA.debugLineNum = 84;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btndate_click() throws Exception{
try {
		Debug.PushSubsStack("btnDate_Click (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,125);
if (RapidSub.canDelegate("btndate_click")) { b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","btndate_click"); return;}
ResumableSub_btnDate_Click rsub = new ResumableSub_btnDate_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDate_Click extends BA.ResumableSub {
public ResumableSub_btnDate_Click(b4a.example.mapsev parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.mapsev parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _getobjectbydate = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDate_Click (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,125);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 126;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mapsev.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapsev", "btndate_click"), parent.mostCurrent._dialog.runClassMethod (b4a.example.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._datetemplate)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancel")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 127;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 128;BA.debugLine="Dim getObjectByDate As String";
Debug.ShouldStop(-2147483648);
_getobjectbydate = RemoteObject.createImmutable("");Debug.locals.put("getObjectByDate", _getobjectbydate);
 BA.debugLineNum = 129;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(1);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 130;BA.debugLine="selectedDate = DateTime.Date(DateTemplate.Date)";
Debug.ShouldStop(2);
parent._selecteddate = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent._datetemplate.runClassMethod (b4a.example.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )));
 BA.debugLineNum = 131;BA.debugLine="btnDate.xLBL.Text = selectedDate";
Debug.ShouldStop(4);
parent.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._selecteddate));
 BA.debugLineNum = 133;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(16);
parent.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 134;BA.debugLine="spinName.SelectedIndex = 0";
Debug.ShouldStop(32);
parent.mostCurrent._spinname.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 136;BA.debugLine="Log(\"date start: \"&selectedDate)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","17405579",RemoteObject.concat(RemoteObject.createImmutable("date start: "),parent._selecteddate),0);
 BA.debugLineNum = 137;BA.debugLine="getEventByDate";
Debug.ShouldStop(256);
_geteventbydate();
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static void  _btndate2_click() throws Exception{
try {
		Debug.PushSubsStack("btnDate2_Click (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,199);
if (RapidSub.canDelegate("btndate2_click")) { b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","btndate2_click"); return;}
ResumableSub_btnDate2_Click rsub = new ResumableSub_btnDate2_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnDate2_Click extends BA.ResumableSub {
public ResumableSub_btnDate2_Click(b4a.example.mapsev parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.mapsev parent;
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnDate2_Click (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,199);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 201;BA.debugLine="If selectedDate == \"\" Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",parent._selecteddate,BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 202;BA.debugLine="Msgbox(\"Please fill from date first\",\"Select fro";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please fill from date first")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Select from date"))),mapsev.mostCurrent.activityBA);
 BA.debugLineNum = 203;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 206;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", mapsev.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapsev", "btndate2_click"), parent.mostCurrent._dialog.runClassMethod (b4a.example.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((parent.mostCurrent._datetemplate)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancel")))));
this.state = 9;
return;
case 9:
//C
this.state = 5;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 207;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent._xui.getField(true,"DialogResponse_Positive")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 209;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 210;BA.debugLine="selectedDate2 = DateTime.Date(DateTemplate.Date)";
Debug.ShouldStop(131072);
parent._selecteddate2 = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent._datetemplate.runClassMethod (b4a.example.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )));
 BA.debugLineNum = 211;BA.debugLine="btnDate2.xLBL.Text = selectedDate2";
Debug.ShouldStop(262144);
parent.mostCurrent._btndate2.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(parent._selecteddate2));
 BA.debugLineNum = 213;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(1048576);
parent.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 214;BA.debugLine="spinName.SelectedIndex = 0";
Debug.ShouldStop(2097152);
parent.mostCurrent._spinname.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 216;BA.debugLine="Log(\"date end:\" &selectedDate2)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","17864337",RemoteObject.concat(RemoteObject.createImmutable("date end:"),parent._selecteddate2),0);
 BA.debugLineNum = 217;BA.debugLine="getEventByDate";
Debug.ShouldStop(16777216);
_geteventbydate();
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _btnlist_click() throws Exception{
try {
		Debug.PushSubsStack("btnList_Click (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,158);
if (RapidSub.canDelegate("btnlist_click")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","btnlist_click");}
 BA.debugLineNum = 158;BA.debugLine="Private Sub btnList_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Log(\"Redirect to ListEv activity\")";
Debug.ShouldStop(1073741824);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","17667713",RemoteObject.createImmutable("Redirect to ListEv activity"),0);
 BA.debugLineNum = 160;BA.debugLine="StartActivity(ListEv)";
Debug.ShouldStop(-2147483648);
mapsev.mostCurrent.__c.runVoidMethod ("StartActivity",mapsev.processBA,(Object)((mapsev.mostCurrent._listev.getObject())));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btnObj_Click (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,151);
if (RapidSub.canDelegate("btnobj_click")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","btnobj_click");}
 BA.debugLineNum = 151;BA.debugLine="Private Sub btnObj_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(8388608);
mapsev.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 153;BA.debugLine="spinName.SelectedIndex = 0";
Debug.ShouldStop(16777216);
mapsev.mostCurrent._spinname.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 154;BA.debugLine="emptyDate";
Debug.ShouldStop(33554432);
_emptydate();
 BA.debugLineNum = 155;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV,\"show";
Debug.ShouldStop(67108864);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(RemoteObject.createImmutable("showObject('event')")));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("btnUserLoc_Click (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,147);
if (RapidSub.canDelegate("btnuserloc_click")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","btnuserloc_click");}
 BA.debugLineNum = 147;BA.debugLine="Private Sub btnUserLoc_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV,\"addU";
Debug.ShouldStop(524288);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(RemoteObject.createImmutable("addUserMarkerToMap({lat:-0.599343 ,lng:100.110793})")));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("ButtonBack_Click (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,142);
if (RapidSub.canDelegate("buttonback_click")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","buttonback_click");}
 BA.debugLineNum = 142;BA.debugLine="Private Sub ButtonBack_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(16384);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","17471105",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 144;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
mapsev.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _emptydate() throws Exception{
try {
		Debug.PushSubsStack("emptyDate (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,230);
if (RapidSub.canDelegate("emptydate")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","emptydate");}
 BA.debugLineNum = 230;BA.debugLine="private Sub emptyDate";
Debug.ShouldStop(32);
 BA.debugLineNum = 231;BA.debugLine="selectedDate = \"\"";
Debug.ShouldStop(64);
mapsev._selecteddate = BA.ObjectToString("");
 BA.debugLineNum = 232;BA.debugLine="btnDate.xLBL.Text = \"From\"";
Debug.ShouldStop(128);
mapsev.mostCurrent._btndate.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("From"));
 BA.debugLineNum = 233;BA.debugLine="selectedDate2 = \"\"";
Debug.ShouldStop(256);
mapsev._selecteddate2 = BA.ObjectToString("");
 BA.debugLineNum = 234;BA.debugLine="btnDate2.xLBL.Text = \"To\"";
Debug.ShouldStop(512);
mapsev.mostCurrent._btndate2.getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("To"));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _geteventbydate() throws Exception{
try {
		Debug.PushSubsStack("getEventByDate (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,221);
if (RapidSub.canDelegate("geteventbydate")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","geteventbydate");}
RemoteObject _getobjectbydate = RemoteObject.createImmutable("");
 BA.debugLineNum = 221;BA.debugLine="private Sub getEventByDate";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="Dim getObjectByDate As String";
Debug.ShouldStop(536870912);
_getobjectbydate = RemoteObject.createImmutable("");Debug.locals.put("getObjectByDate", _getobjectbydate);
 BA.debugLineNum = 223;BA.debugLine="If (selectedDate <> \"\") And (selectedDate2 <> \"\")";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",mapsev._selecteddate,RemoteObject.createImmutable(""))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",mapsev._selecteddate2,RemoteObject.createImmutable("")))))) { 
 BA.debugLineNum = 224;BA.debugLine="Log(\"Searching EV with date\")";
Debug.ShouldStop(-2147483648);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","17929859",RemoteObject.createImmutable("Searching EV with date"),0);
 BA.debugLineNum = 225;BA.debugLine="getObjectByDate = \"getObjectByDate('\"&selectedDa";
Debug.ShouldStop(1);
_getobjectbydate = RemoteObject.concat(RemoteObject.createImmutable("getObjectByDate('"),mapsev._selecteddate,RemoteObject.createImmutable("','"),mapsev._selecteddate2,RemoteObject.createImmutable("')"));Debug.locals.put("getObjectByDate", _getobjectbydate);
 BA.debugLineNum = 226;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, get";
Debug.ShouldStop(2);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_getobjectbydate));
 };
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 18;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
mapsev.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 19;BA.debugLine="Private MyWebViewSetting As WebViewSettings";
mapsev.mostCurrent._mywebviewsetting = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 20;BA.debugLine="Private WebViewEV As WebView";
mapsev.mostCurrent._webviewev = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Navbar As Panel";
mapsev.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private MainScroll As ScrollView";
mapsev.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private btnList As Button";
mapsev.mostCurrent._btnlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btnObj As Button";
mapsev.mostCurrent._btnobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btnUserLoc As Button";
mapsev.mostCurrent._btnuserloc = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ButtonBack As Button";
mapsev.mostCurrent._buttonback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private Label1 As Label";
mapsev.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Label2 As Label";
mapsev.mostCurrent._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private Label4 As Label";
mapsev.mostCurrent._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelEV As Panel";
mapsev.mostCurrent._panelev = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private PanelRating As Panel";
mapsev.mostCurrent._panelrating = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private PanelSearch As Panel";
mapsev.mostCurrent._panelsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private PanelDate As Panel";
mapsev.mostCurrent._paneldate = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private spinName As Spinner";
mapsev.mostCurrent._spinname = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private spinRating As Spinner";
mapsev.mostCurrent._spinrating = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private btnDate As SwiftButton";
mapsev.mostCurrent._btndate = RemoteObject.createNew ("b4a.example.swiftbutton");
 //BA.debugLineNum = 41;BA.debugLine="Private btnDate2 As SwiftButton";
mapsev.mostCurrent._btndate2 = RemoteObject.createNew ("b4a.example.swiftbutton");
 //BA.debugLineNum = 42;BA.debugLine="Private DateTemplate As B4XDateTemplate";
mapsev.mostCurrent._datetemplate = RemoteObject.createNew ("b4a.example.b4xdatetemplate");
 //BA.debugLineNum = 43;BA.debugLine="Private Dialog As B4XDialog";
mapsev.mostCurrent._dialog = RemoteObject.createNew ("b4a.example.b4xdialog");
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,163);
if (RapidSub.canDelegate("jobdone")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _event = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 163;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(8);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","17733249",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 165;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(16);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 166;BA.debugLine="Dim res As String";
Debug.ShouldStop(32);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 167;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(64);
_res = _job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 168;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 169;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 171;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("LoadEvent"))) {
case 0: {
 BA.debugLineNum = 173;BA.debugLine="Try";
Debug.ShouldStop(4096);
try { BA.debugLineNum = 174;BA.debugLine="Dim map As Map";
Debug.ShouldStop(8192);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 175;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(16384);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 176;BA.debugLine="Dim data As List";
Debug.ShouldStop(32768);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 177;BA.debugLine="data = map.Get(\"data\")";
Debug.ShouldStop(65536);
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);
 BA.debugLineNum = 178;BA.debugLine="eventMap.Initialize";
Debug.ShouldStop(131072);
mapsev._eventmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 179;BA.debugLine="spinName.Add(\"Select event by name..\")";
Debug.ShouldStop(262144);
mapsev.mostCurrent._spinname.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("Select event by name..")));
 BA.debugLineNum = 180;BA.debugLine="For i = 0 To data.Size - 1";
Debug.ShouldStop(524288);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 181;BA.debugLine="Dim event As Map";
Debug.ShouldStop(1048576);
_event = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("event", _event);
 BA.debugLineNum = 182;BA.debugLine="event = data.Get(i)";
Debug.ShouldStop(2097152);
_event = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("event", _event);
 BA.debugLineNum = 183;BA.debugLine="eventMap.Put(event.Get(\"name\"),event.Get(\"id";
Debug.ShouldStop(4194304);
mapsev._eventmap.runVoidMethod ("Put",(Object)(_event.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),(Object)(_event.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 184;BA.debugLine="spinName.Add(event.Get(\"name\"))";
Debug.ShouldStop(8388608);
mapsev.mostCurrent._spinname.runVoidMethod ("Add",(Object)(BA.ObjectToString(_event.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))))));
 }
}Debug.locals.put("i", _i);
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e23) {
			BA.rdebugUtils.runVoidMethod("setLastException",mapsev.processBA, e23.toString()); BA.debugLineNum = 188;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","17733273",BA.ObjectToString(mapsev.mostCurrent.__c.runMethod(false,"LastException",mapsev.mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim eventMap As Map";
mapsev._eventmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="Dim selectedDate As String";
mapsev._selecteddate = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim selectedDate2 As String";
mapsev._selecteddate2 = RemoteObject.createImmutable("");
 //BA.debugLineNum = 12;BA.debugLine="Private XUI As XUI";
mapsev._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _spinname_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinName_ItemClick (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,110);
if (RapidSub.canDelegate("spinname_itemclick")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","spinname_itemclick", _position, _value);}
RemoteObject _getobjectbyname = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 110;BA.debugLine="Private Sub spinName_ItemClick (Position As Int, V";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Dim getObjectByName As String";
Debug.ShouldStop(16384);
_getobjectbyname = RemoteObject.createImmutable("");Debug.locals.put("getObjectByName", _getobjectbyname);
 BA.debugLineNum = 112;BA.debugLine="If Position == 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 113;BA.debugLine="MsgboxAsync(\"Please choose name\", \"Search by Nam";
Debug.ShouldStop(65536);
mapsev.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please choose name")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Search by Name"))),mapsev.processBA);
 BA.debugLineNum = 114;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(131072);
mapsev.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 115;BA.debugLine="emptyDate";
Debug.ShouldStop(262144);
_emptydate();
 }else {
 BA.debugLineNum = 117;BA.debugLine="spinRating.SelectedIndex = 0";
Debug.ShouldStop(1048576);
mapsev.mostCurrent._spinrating.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 118;BA.debugLine="emptyDate";
Debug.ShouldStop(2097152);
_emptydate();
 BA.debugLineNum = 119;BA.debugLine="Log(\"Searching Ev by name: \"&Value)";
Debug.ShouldStop(4194304);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","17340041",RemoteObject.concat(RemoteObject.createImmutable("Searching Ev by name: "),_value),0);
 BA.debugLineNum = 120;BA.debugLine="getObjectByName = \"getObjectByName('\"&Value&\"','";
Debug.ShouldStop(8388608);
_getobjectbyname = RemoteObject.concat(RemoteObject.createImmutable("getObjectByName('"),_value,RemoteObject.createImmutable("','event')"));Debug.locals.put("getObjectByName", _getobjectbyname);
 BA.debugLineNum = 121;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, get";
Debug.ShouldStop(16777216);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_getobjectbyname));
 };
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinrating_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("spinRating_ItemClick (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,93);
if (RapidSub.canDelegate("spinrating_itemclick")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","spinrating_itemclick", _position, _value);}
RemoteObject _getobjectbyrate = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 93;BA.debugLine="Private Sub spinRating_ItemClick (Position As Int,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 94;BA.debugLine="Dim getObjectByRate As String";
Debug.ShouldStop(536870912);
_getobjectbyrate = RemoteObject.createImmutable("");Debug.locals.put("getObjectByRate", _getobjectbyrate);
 BA.debugLineNum = 95;BA.debugLine="If Position == 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 96;BA.debugLine="MsgboxAsync(\"Please choose rating from 1-5\", \"Se";
Debug.ShouldStop(-2147483648);
mapsev.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Please choose rating from 1-5")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Search by Rating"))),mapsev.processBA);
 BA.debugLineNum = 97;BA.debugLine="spinName.SelectedIndex = 0";
Debug.ShouldStop(1);
mapsev.mostCurrent._spinname.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 98;BA.debugLine="emptyDate";
Debug.ShouldStop(2);
_emptydate();
 BA.debugLineNum = 99;BA.debugLine="getObjectByRate = \"getObjectByRate('','event')\"";
Debug.ShouldStop(4);
_getobjectbyrate = BA.ObjectToString("getObjectByRate('','event')");Debug.locals.put("getObjectByRate", _getobjectbyrate);
 BA.debugLineNum = 100;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, get";
Debug.ShouldStop(8);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_getobjectbyrate));
 }else {
 BA.debugLineNum = 102;BA.debugLine="spinName.SelectedIndex = 0";
Debug.ShouldStop(32);
mapsev.mostCurrent._spinname.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 103;BA.debugLine="emptyDate";
Debug.ShouldStop(64);
_emptydate();
 BA.debugLineNum = 104;BA.debugLine="Log(\"Searching Atraction with \"&Value&\" rating\")";
Debug.ShouldStop(128);
mapsev.mostCurrent.__c.runVoidMethod ("LogImpl","17274507",RemoteObject.concat(RemoteObject.createImmutable("Searching Atraction with "),_value,RemoteObject.createImmutable(" rating")),0);
 BA.debugLineNum = 105;BA.debugLine="getObjectByRate = \"getObjectByRate('\"&Value&\"','";
Debug.ShouldStop(256);
_getobjectbyrate = RemoteObject.concat(RemoteObject.createImmutable("getObjectByRate('"),_value,RemoteObject.createImmutable("','event')"));Debug.locals.put("getObjectByRate", _getobjectbyrate);
 BA.debugLineNum = 106;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, get";
Debug.ShouldStop(512);
mapsev.mostCurrent._mywebviewextras.runVoidMethod ("executeJavascript",(Object)((mapsev.mostCurrent._webviewev.getObject())),(Object)(_getobjectbyrate));
 };
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
public static RemoteObject  _webviewev_pagefinished(RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("WebViewEV_PageFinished (mapsev) ","mapsev",12,mapsev.mostCurrent.activityBA,mapsev.mostCurrent,195);
if (RapidSub.canDelegate("webviewev_pagefinished")) { return b4a.example.mapsev.remoteMe.runUserSub(false, "mapsev","webviewev_pagefinished", _url);}
Debug.locals.put("Url", _url);
 BA.debugLineNum = 195;BA.debugLine="Private Sub WebViewEV_PageFinished (Url As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}