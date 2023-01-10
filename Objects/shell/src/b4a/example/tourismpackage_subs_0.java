package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tourismpackage_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tourismpackage) ","tourismpackage",8,tourismpackage.mostCurrent.activityBA,tourismpackage.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tourismpackage.remoteMe.runUserSub(false, "tourismpackage","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(268435456);
tourismpackage.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),tourismpackage.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.LoadLayout(\"Package\")";
Debug.ShouldStop(536870912);
tourismpackage.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Package")),tourismpackage.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="WebViewPackage.Height = MainScroll.Height";
Debug.ShouldStop(1073741824);
tourismpackage.mostCurrent._webviewpackage.runMethod(true,"setHeight",tourismpackage.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 32;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(-2147483648);
tourismpackage.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",tourismpackage.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 33;BA.debugLine="TitleNavbar.Text = \"\"";
Debug.ShouldStop(1);
tourismpackage.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 35;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewPackage";
Debug.ShouldStop(4);
tourismpackage.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",tourismpackage.mostCurrent.activityBA,(Object)((tourismpackage.mostCurrent._webviewpackage.getObject())),(Object)(RemoteObject.createImmutable("WebViewPackage")));
 BA.debugLineNum = 36;BA.debugLine="WebViewPackage.JavaScriptEnabled = True";
Debug.ShouldStop(8);
tourismpackage.mostCurrent._webviewpackage.runMethod(true,"setJavaScriptEnabled",tourismpackage.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 37;BA.debugLine="WebViewPackage.LoadUrl(Main.server&\"package\")";
Debug.ShouldStop(16);
tourismpackage.mostCurrent._webviewpackage.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(tourismpackage.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("package"))));
 BA.debugLineNum = 38;BA.debugLine="MyWebViewSettings.setDOMStorageEnabled(WebViewPac";
Debug.ShouldStop(32);
tourismpackage.mostCurrent._mywebviewsettings.runVoidMethod ("setDOMStorageEnabled",(Object)((tourismpackage.mostCurrent._webviewpackage.getObject())),(Object)(tourismpackage.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Pause (tourismpackage) ","tourismpackage",8,tourismpackage.mostCurrent.activityBA,tourismpackage.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tourismpackage.remoteMe.runUserSub(false, "tourismpackage","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (tourismpackage) ","tourismpackage",8,tourismpackage.mostCurrent.activityBA,tourismpackage.mostCurrent,41);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tourismpackage.remoteMe.runUserSub(false, "tourismpackage","activity_resume");}
 BA.debugLineNum = 41;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("BtnBack_Click (tourismpackage) ","tourismpackage",8,tourismpackage.mostCurrent.activityBA,tourismpackage.mostCurrent,50);
if (RapidSub.canDelegate("btnback_click")) { return b4a.example.tourismpackage.remoteMe.runUserSub(false, "tourismpackage","btnback_click");}
 BA.debugLineNum = 50;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(262144);
tourismpackage.mostCurrent.__c.runVoidMethod ("LogImpl","14718593",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 52;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
tourismpackage.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
tourismpackage.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 16;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
tourismpackage.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnBack As Button";
tourismpackage.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnRefresh As Button";
tourismpackage.mostCurrent._btnrefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private loadRefresh As ProgressBar";
tourismpackage.mostCurrent._loadrefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private MainScroll As ScrollView";
tourismpackage.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Navbar As Panel";
tourismpackage.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private TitleNavbar As Label";
tourismpackage.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private WebViewPackage As WebView";
tourismpackage.mostCurrent._webviewpackage = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}