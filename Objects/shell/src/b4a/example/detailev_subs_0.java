package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class detailev_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (detailev) ","detailev",3,detailev.mostCurrent.activityBA,detailev.mostCurrent,24);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.detailev.remoteMe.runUserSub(false, "detailev","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 24;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(67108864);
detailev.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),detailev.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="MainScroll.Panel.LoadLayout(\"Detail\")";
Debug.ShouldStop(134217728);
detailev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Detail")),detailev.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="wvDetail.Height = MainScroll.Height";
Debug.ShouldStop(268435456);
detailev.mostCurrent._wvdetail.runMethod(true,"setHeight",detailev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(536870912);
detailev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",detailev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 31;BA.debugLine="TitleNavbar.Text = Starter.selectedObj.Get(\"name\"";
Debug.ShouldStop(1073741824);
detailev.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence(detailev.mostCurrent._starter._selectedobj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))));
 BA.debugLineNum = 33;BA.debugLine="MyWebViewExtras.addWebChromeClient(wvDetail, \"wvD";
Debug.ShouldStop(1);
detailev.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",detailev.mostCurrent.activityBA,(Object)((detailev.mostCurrent._wvdetail.getObject())),(Object)(RemoteObject.createImmutable("wvDetail")));
 BA.debugLineNum = 34;BA.debugLine="wvDetail.JavaScriptEnabled = True";
Debug.ShouldStop(2);
detailev.mostCurrent._wvdetail.runMethod(true,"setJavaScriptEnabled",detailev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 35;BA.debugLine="wvDetail.LoadUrl(Main.server&\"detail_event/\"&Star";
Debug.ShouldStop(4);
detailev.mostCurrent._wvdetail.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(detailev.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("detail_event/"),detailev.mostCurrent._starter._selectedobj /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))))));
 BA.debugLineNum = 36;BA.debugLine="MyWebViewSettings.setDOMStorageEnabled(wvDetail,T";
Debug.ShouldStop(8);
detailev.mostCurrent._mywebviewsettings.runVoidMethod ("setDOMStorageEnabled",(Object)((detailev.mostCurrent._wvdetail.getObject())),(Object)(detailev.mostCurrent.__c.getField(true,"True")));
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
		Debug.PushSubsStack("Activity_Pause (detailev) ","detailev",3,detailev.mostCurrent.activityBA,detailev.mostCurrent,43);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.detailev.remoteMe.runUserSub(false, "detailev","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (detailev) ","detailev",3,detailev.mostCurrent.activityBA,detailev.mostCurrent,39);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.detailev.remoteMe.runUserSub(false, "detailev","activity_resume");}
 BA.debugLineNum = 39;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="Log(\"DetailEv loaded\")";
Debug.ShouldStop(128);
detailev.mostCurrent.__c.runVoidMethod ("LogImpl","12031617",RemoteObject.createImmutable("DetailEv loaded"),0);
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
		Debug.PushSubsStack("BtnBack_Click (detailev) ","detailev",3,detailev.mostCurrent.activityBA,detailev.mostCurrent,48);
if (RapidSub.canDelegate("btnback_click")) { return b4a.example.detailev.remoteMe.runUserSub(false, "detailev","btnback_click");}
 BA.debugLineNum = 48;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(65536);
detailev.mostCurrent.__c.runVoidMethod ("LogImpl","12162689",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 50;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
detailev.mostCurrent._activity.runVoidMethod ("Finish");
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private MyWebViewExtras As WebViewExtras";
detailev.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 16;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
detailev.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnBack As Button";
detailev.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private MainScroll As ScrollView";
detailev.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Navbar As Panel";
detailev.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private TitleNavbar As Label";
detailev.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private wvDetail As WebView";
detailev.mostCurrent._wvdetail = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}