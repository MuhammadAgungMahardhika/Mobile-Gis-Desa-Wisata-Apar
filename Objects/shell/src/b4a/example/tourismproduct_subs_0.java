package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tourismproduct_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (tourismproduct) ","tourismproduct",7,tourismproduct.mostCurrent.activityBA,tourismproduct.mostCurrent,26);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.tourismproduct.remoteMe.runUserSub(false, "tourismproduct","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 26;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 29;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(268435456);
tourismproduct.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),tourismproduct.mostCurrent.activityBA);
 BA.debugLineNum = 30;BA.debugLine="MainScroll.Panel.LoadLayout(\"Product\")";
Debug.ShouldStop(536870912);
tourismproduct.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Product")),tourismproduct.mostCurrent.activityBA);
 BA.debugLineNum = 31;BA.debugLine="WebViewProduct.Height = MainScroll.Height";
Debug.ShouldStop(1073741824);
tourismproduct.mostCurrent._webviewproduct.runMethod(true,"setHeight",tourismproduct.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 32;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(-2147483648);
tourismproduct.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",tourismproduct.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 33;BA.debugLine="TitleNavbar.Text = \"LIST PRODUCT\"";
Debug.ShouldStop(1);
tourismproduct.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence("LIST PRODUCT"));
 BA.debugLineNum = 35;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewProduct";
Debug.ShouldStop(4);
tourismproduct.mostCurrent._mywebviewextras.runVoidMethod ("addWebChromeClient",tourismproduct.mostCurrent.activityBA,(Object)((tourismproduct.mostCurrent._webviewproduct.getObject())),(Object)(RemoteObject.createImmutable("WebViewProduct")));
 BA.debugLineNum = 36;BA.debugLine="WebViewProduct.JavaScriptEnabled = True";
Debug.ShouldStop(8);
tourismproduct.mostCurrent._webviewproduct.runMethod(true,"setJavaScriptEnabled",tourismproduct.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 37;BA.debugLine="WebViewProduct.LoadUrl(Main.server&\"products\")";
Debug.ShouldStop(16);
tourismproduct.mostCurrent._webviewproduct.runVoidMethod ("LoadUrl",(Object)(RemoteObject.concat(tourismproduct.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("products"))));
 BA.debugLineNum = 38;BA.debugLine="MyWebViewSettings.setDOMStorageEnabled(WebViewPro";
Debug.ShouldStop(32);
tourismproduct.mostCurrent._mywebviewsettings.runVoidMethod ("setDOMStorageEnabled",(Object)((tourismproduct.mostCurrent._webviewproduct.getObject())),(Object)(tourismproduct.mostCurrent.__c.getField(true,"True")));
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
		Debug.PushSubsStack("Activity_Pause (tourismproduct) ","tourismproduct",7,tourismproduct.mostCurrent.activityBA,tourismproduct.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.tourismproduct.remoteMe.runUserSub(false, "tourismproduct","activity_pause", _userclosed);}
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
		Debug.PushSubsStack("Activity_Resume (tourismproduct) ","tourismproduct",7,tourismproduct.mostCurrent.activityBA,tourismproduct.mostCurrent,41);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.tourismproduct.remoteMe.runUserSub(false, "tourismproduct","activity_resume");}
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
		Debug.PushSubsStack("BtnBack_Click (tourismproduct) ","tourismproduct",7,tourismproduct.mostCurrent.activityBA,tourismproduct.mostCurrent,50);
if (RapidSub.canDelegate("btnback_click")) { return b4a.example.tourismproduct.remoteMe.runUserSub(false, "tourismproduct","btnback_click");}
 BA.debugLineNum = 50;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(262144);
tourismproduct.mostCurrent.__c.runVoidMethod ("LogImpl","14325377",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 52;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
tourismproduct.mostCurrent._activity.runVoidMethod ("Finish");
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
tourismproduct.mostCurrent._mywebviewextras = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
 //BA.debugLineNum = 16;BA.debugLine="Private MyWebViewSettings As WebViewSettings";
tourismproduct.mostCurrent._mywebviewsettings = RemoteObject.createNew ("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
 //BA.debugLineNum = 17;BA.debugLine="Private BtnBack As Button";
tourismproduct.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnRefresh As Button";
tourismproduct.mostCurrent._btnrefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private loadRefresh As ProgressBar";
tourismproduct.mostCurrent._loadrefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private MainScroll As ScrollView";
tourismproduct.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private Navbar As Panel";
tourismproduct.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private TitleNavbar As Label";
tourismproduct.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private WebViewProduct As WebView";
tourismproduct.mostCurrent._webviewproduct = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}