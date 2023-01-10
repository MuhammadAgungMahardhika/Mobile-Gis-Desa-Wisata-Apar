package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class mapsev extends Activity implements B4AActivity{
	public static mapsev mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.mapsev");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mapsev).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.mapsev");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.mapsev", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mapsev) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mapsev) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return mapsev.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (mapsev) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (mapsev) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            mapsev mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (mapsev) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.Map _eventmap = null;
public static String _selecteddate = "";
public static String _selecteddate2 = "";
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public uk.co.martinpearman.b4a.webviewextras.WebViewExtras _mywebviewextras = null;
public uk.co.martinpearman.b4a.webviewsettings.WebViewSettings _mywebviewsetting = null;
public anywheresoftware.b4a.objects.WebViewWrapper _webviewev = null;
public anywheresoftware.b4a.objects.PanelWrapper _navbar = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _mainscroll = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlist = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnobj = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnuserloc = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonback = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelev = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelrating = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelsearch = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldate = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinname = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinrating = null;
public b4a.example.swiftbutton _btndate = null;
public b4a.example.swiftbutton _btndate2 = null;
public b4a.example.b4xdatetemplate _datetemplate = null;
public b4a.example.b4xdialog _dialog = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.detailat _detailat = null;
public b4a.example.homevisitor _homevisitor = null;
public b4a.example.detailev _detailev = null;
public b4a.example.core _core = null;
public b4a.example.mapsat _mapsat = null;
public b4a.example.starter _starter = null;
public b4a.example.tourismproduct _tourismproduct = null;
public b4a.example.tourismpackage _tourismpackage = null;
public b4a.example.listat _listat = null;
public b4a.example.homeuser _homeuser = null;
public b4a.example.listev _listev = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
mostCurrent._activity.LoadLayout("MainScrollView",mostCurrent.activityBA);
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="MainScroll.Panel.LoadLayout(\"MapsEV\")";
mostCurrent._mainscroll.getPanel().LoadLayout("MapsEV",mostCurrent.activityBA);
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Navbar.Visible = False";
mostCurrent._navbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="If Navbar.Visible == False Then";
if (mostCurrent._navbar.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="MainScroll.Top = MainScroll.Top - Navbar.Height";
mostCurrent._mainscroll.setTop((int) (mostCurrent._mainscroll.getTop()-mostCurrent._navbar.getHeight()));
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="MainScroll.Height = MainScroll.Height + Navbar.H";
mostCurrent._mainscroll.setHeight((int) (mostCurrent._mainscroll.getHeight()+mostCurrent._navbar.getHeight()));
 };
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="WebViewEV.Height = MainScroll.Height";
mostCurrent._webviewev.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="PanelEV.Height = MainScroll.Height";
mostCurrent._panelev.setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=7077898;
 //BA.debugLineNum = 7077898;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
mostCurrent._mainscroll.getPanel().setHeight(mostCurrent._mainscroll.getHeight());
RDebugUtils.currentLine=7077900;
 //BA.debugLineNum = 7077900;BA.debugLine="WebViewEV.JavaScriptEnabled = True";
mostCurrent._webviewev.setJavaScriptEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7077901;
 //BA.debugLineNum = 7077901;BA.debugLine="MyWebViewExtras.addWebChromeClient(WebViewEV, \"We";
mostCurrent._mywebviewextras.addWebChromeClient(mostCurrent.activityBA,(android.webkit.WebView)(mostCurrent._webviewev.getObject()),"WebViewEV");
RDebugUtils.currentLine=7077902;
 //BA.debugLineNum = 7077902;BA.debugLine="MyWebViewSetting.setDOMStorageEnabled(WebViewEV,T";
mostCurrent._mywebviewsetting.setDOMStorageEnabled((android.webkit.WebView)(mostCurrent._webviewev.getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7077903;
 //BA.debugLineNum = 7077903;BA.debugLine="WebViewEV.LoadUrl(Main.server)";
mostCurrent._webviewev.LoadUrl(mostCurrent._main._server /*String*/ );
RDebugUtils.currentLine=7077905;
 //BA.debugLineNum = 7077905;BA.debugLine="spinName.DropdownBackgroundColor = Colors.White";
mostCurrent._spinname.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7077906;
 //BA.debugLineNum = 7077906;BA.debugLine="Core.ExecuteUrlGet(Main.server&\"event\",\"LoadEvent";
mostCurrent._core._executeurlget /*String*/ (mostCurrent.activityBA,mostCurrent._main._server /*String*/ +"event","LoadEvent",mapsev.getObject());
RDebugUtils.currentLine=7077908;
 //BA.debugLineNum = 7077908;BA.debugLine="spinRating.DropdownBackgroundColor = Colors.White";
mostCurrent._spinrating.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=7077909;
 //BA.debugLineNum = 7077909;BA.debugLine="spinRating.AddAll(Array As String(\"Rating...\", \"1";
mostCurrent._spinrating.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Rating...","1","2","3","4","5"}));
RDebugUtils.currentLine=7077911;
 //BA.debugLineNum = 7077911;BA.debugLine="Dialog.Initialize (Activity)";
mostCurrent._dialog._initialize /*String*/ (null,mostCurrent.activityBA,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._activity.getObject())));
RDebugUtils.currentLine=7077912;
 //BA.debugLineNum = 7077912;BA.debugLine="Dialog.Title = \"Select Date...\"";
mostCurrent._dialog._title /*Object*/  = (Object)("Select Date...");
RDebugUtils.currentLine=7077913;
 //BA.debugLineNum = 7077913;BA.debugLine="DateTemplate.Initialize";
mostCurrent._datetemplate._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=7077914;
 //BA.debugLineNum = 7077914;BA.debugLine="DateTemplate.MinYear = 2000";
mostCurrent._datetemplate._minyear /*int*/  = (int) (2000);
RDebugUtils.currentLine=7077915;
 //BA.debugLineNum = 7077915;BA.debugLine="DateTemplate.MaxYear = 2050";
mostCurrent._datetemplate._maxyear /*int*/  = (int) (2050);
RDebugUtils.currentLine=7077916;
 //BA.debugLineNum = 7077916;BA.debugLine="btnDate.xLBL.Text = \"From\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("From"));
RDebugUtils.currentLine=7077917;
 //BA.debugLineNum = 7077917;BA.debugLine="btnDate2.xLBL.Text=\"To\"";
mostCurrent._btndate2._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("To"));
RDebugUtils.currentLine=7077919;
 //BA.debugLineNum = 7077919;BA.debugLine="selectedDate = \"\"";
_selecteddate = "";
RDebugUtils.currentLine=7077920;
 //BA.debugLineNum = 7077920;BA.debugLine="selectedDate2 = \"\"";
_selecteddate2 = "";
RDebugUtils.currentLine=7077923;
 //BA.debugLineNum = 7077923;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="mapsev";
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return "";
}
public static void  _btndate_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndate_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btndate_click", null); return;}
ResumableSub_btnDate_Click rsub = new ResumableSub_btnDate_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnDate_Click extends BA.ResumableSub {
public ResumableSub_btnDate_Click(b4a.example.mapsev parent) {
this.parent = parent;
}
b4a.example.mapsev parent;
int _result = 0;
String _getobjectbydate = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mapsev";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mapsev", "btndate_click"), parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._datetemplate),(Object)(""),(Object)(""),(Object)("Cancel")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Dim getObjectByDate As String";
_getobjectbydate = "";
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="selectedDate = DateTime.Date(DateTemplate.Date)";
parent._selecteddate = anywheresoftware.b4a.keywords.Common.DateTime.Date(parent.mostCurrent._datetemplate._getdate /*long*/ (null));
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="btnDate.xLBL.Text = selectedDate";
parent.mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._selecteddate));
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="spinRating.SelectedIndex = 0";
parent.mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="spinName.SelectedIndex = 0";
parent.mostCurrent._spinname.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="Log(\"date start: \"&selectedDate)";
anywheresoftware.b4a.keywords.Common.LogImpl("17405579","date start: "+parent._selecteddate,0);
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="getEventByDate";
_geteventbydate();
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _geteventbydate() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "geteventbydate", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "geteventbydate", null));}
String _getobjectbydate = "";
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="private Sub getEventByDate";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim getObjectByDate As String";
_getobjectbydate = "";
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="If (selectedDate <> \"\") And (selectedDate2 <> \"\")";
if (((_selecteddate).equals("") == false) && ((_selecteddate2).equals("") == false)) { 
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="Log(\"Searching EV with date\")";
anywheresoftware.b4a.keywords.Common.LogImpl("17929859","Searching EV with date",0);
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="getObjectByDate = \"getObjectByDate('\"&selectedDa";
_getobjectbydate = "getObjectByDate('"+_selecteddate+"','"+_selecteddate2+"')";
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, get";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_getobjectbydate);
 };
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="End Sub";
return "";
}
public static void  _btndate2_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndate2_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btndate2_click", null); return;}
ResumableSub_btnDate2_Click rsub = new ResumableSub_btnDate2_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnDate2_Click extends BA.ResumableSub {
public ResumableSub_btnDate2_Click(b4a.example.mapsev parent) {
this.parent = parent;
}
b4a.example.mapsev parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mapsev";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="If selectedDate == \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._selecteddate).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="Msgbox(\"Please fill from date first\",\"Select fro";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please fill from date first"),BA.ObjectToCharSequence("Select from date"),mostCurrent.activityBA);
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mapsev", "btndate2_click"), parent.mostCurrent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.mostCurrent._datetemplate),(Object)(""),(Object)(""),(Object)("Cancel")));
this.state = 9;
return;
case 9:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="If Result = XUI.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="selectedDate2 = DateTime.Date(DateTemplate.Date)";
parent._selecteddate2 = anywheresoftware.b4a.keywords.Common.DateTime.Date(parent.mostCurrent._datetemplate._getdate /*long*/ (null));
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="btnDate2.xLBL.Text = selectedDate2";
parent.mostCurrent._btndate2._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._selecteddate2));
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="spinRating.SelectedIndex = 0";
parent.mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="spinName.SelectedIndex = 0";
parent.mostCurrent._spinname.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="Log(\"date end:\" &selectedDate2)";
anywheresoftware.b4a.keywords.Common.LogImpl("17864337","date end:"+parent._selecteddate2,0);
RDebugUtils.currentLine=7864338;
 //BA.debugLineNum = 7864338;BA.debugLine="getEventByDate";
_geteventbydate();
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=7864340;
 //BA.debugLineNum = 7864340;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnlist_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlist_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlist_click", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Private Sub btnList_Click";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="Log(\"Redirect to ListEv activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("17667713","Redirect to ListEv activity",0);
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="StartActivity(ListEv)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._listev.getObject()));
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="End Sub";
return "";
}
public static String  _btnobj_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnobj_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnobj_click", null));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Private Sub btnObj_Click";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="spinName.SelectedIndex = 0";
mostCurrent._spinname.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="emptyDate";
_emptydate();
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV,\"show";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),"showObject('event')");
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="End Sub";
return "";
}
public static String  _emptydate() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "emptydate", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "emptydate", null));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="private Sub emptyDate";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="selectedDate = \"\"";
_selecteddate = "";
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="btnDate.xLBL.Text = \"From\"";
mostCurrent._btndate._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("From"));
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="selectedDate2 = \"\"";
_selecteddate2 = "";
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="btnDate2.xLBL.Text = \"To\"";
mostCurrent._btndate2._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("To"));
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="End Sub";
return "";
}
public static String  _btnuserloc_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnuserloc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnuserloc_click", null));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub btnUserLoc_Click";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV,\"addU";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),"addUserMarkerToMap({lat:-0.599343 ,lng:100.110793})");
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
return "";
}
public static String  _buttonback_click() throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonback_click", null));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub ButtonBack_Click";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Log(\"Going back to previous activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("17471105","Going back to previous activity",0);
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.example.httpjob _job) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _data = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _event = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("17733249","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"LoadEvent")) {
case 0: {
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="Try";
try {RDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="Dim data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7733262;
 //BA.debugLineNum = 7733262;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="eventMap.Initialize";
_eventmap.Initialize();
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="spinName.Add(\"Select event by name..\")";
mostCurrent._spinname.Add("Select event by name..");
RDebugUtils.currentLine=7733265;
 //BA.debugLineNum = 7733265;BA.debugLine="For i = 0 To data.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_data.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="Dim event As Map";
_event = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7733267;
 //BA.debugLineNum = 7733267;BA.debugLine="event = data.Get(i)";
_event = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get(_i)));
RDebugUtils.currentLine=7733268;
 //BA.debugLineNum = 7733268;BA.debugLine="eventMap.Put(event.Get(\"name\"),event.Get(\"id";
_eventmap.Put(_event.Get((Object)("name")),_event.Get((Object)("id")));
RDebugUtils.currentLine=7733269;
 //BA.debugLineNum = 7733269;BA.debugLine="spinName.Add(event.Get(\"name\"))";
mostCurrent._spinname.Add(BA.ObjectToString(_event.Get((Object)("name"))));
 }
};
 } 
       catch (Exception e23) {
			processBA.setLastException(e23);RDebugUtils.currentLine=7733273;
 //BA.debugLineNum = 7733273;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("17733273",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
RDebugUtils.currentLine=7733277;
 //BA.debugLineNum = 7733277;BA.debugLine="End Sub";
return "";
}
public static String  _spinname_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinname_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinname_itemclick", new Object[] {_position,_value}));}
String _getobjectbyname = "";
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub spinName_ItemClick (Position As Int, V";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim getObjectByName As String";
_getobjectbyname = "";
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="MsgboxAsync(\"Please choose name\", \"Search by Nam";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose name"),BA.ObjectToCharSequence("Search by Name"),processBA);
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="emptyDate";
_emptydate();
 }else {
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="spinRating.SelectedIndex = 0";
mostCurrent._spinrating.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="emptyDate";
_emptydate();
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="Log(\"Searching Ev by name: \"&Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("17340041","Searching Ev by name: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="getObjectByName = \"getObjectByName('\"&Value&\"','";
_getobjectbyname = "getObjectByName('"+BA.ObjectToString(_value)+"','event')";
RDebugUtils.currentLine=7340043;
 //BA.debugLineNum = 7340043;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, get";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_getobjectbyname);
 };
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="End Sub";
return "";
}
public static String  _spinrating_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "spinrating_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "spinrating_itemclick", new Object[] {_position,_value}));}
String _getobjectbyrate = "";
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub spinRating_ItemClick (Position As Int,";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim getObjectByRate As String";
_getobjectbyrate = "";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="If Position == 0 Then";
if (_position==0) { 
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="MsgboxAsync(\"Please choose rating from 1-5\", \"Se";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please choose rating from 1-5"),BA.ObjectToCharSequence("Search by Rating"),processBA);
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="spinName.SelectedIndex = 0";
mostCurrent._spinname.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="emptyDate";
_emptydate();
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="getObjectByRate = \"getObjectByRate('','event')\"";
_getobjectbyrate = "getObjectByRate('','event')";
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, get";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_getobjectbyrate);
 }else {
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="spinName.SelectedIndex = 0";
mostCurrent._spinname.setSelectedIndex((int) (0));
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="emptyDate";
_emptydate();
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="Log(\"Searching Atraction with \"&Value&\" rating\")";
anywheresoftware.b4a.keywords.Common.LogImpl("17274507","Searching Atraction with "+BA.ObjectToString(_value)+" rating",0);
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="getObjectByRate = \"getObjectByRate('\"&Value&\"','";
_getobjectbyrate = "getObjectByRate('"+BA.ObjectToString(_value)+"','event')";
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="MyWebViewExtras.executeJavascript(WebViewEV, get";
mostCurrent._mywebviewextras.executeJavascript((android.webkit.WebView)(mostCurrent._webviewev.getObject()),_getobjectbyrate);
 };
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="End Sub";
return "";
}
public static String  _webviewev_pagefinished(String _url) throws Exception{
RDebugUtils.currentModule="mapsev";
if (Debug.shouldDelegate(mostCurrent.activityBA, "webviewev_pagefinished", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "webviewev_pagefinished", new Object[] {_url}));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub WebViewEV_PageFinished (Url As String)";
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return "";
}
}