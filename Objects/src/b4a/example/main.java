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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (detailat.mostCurrent != null);
vis = vis | (homevisitor.mostCurrent != null);
vis = vis | (detailev.mostCurrent != null);
vis = vis | (mapsat.mostCurrent != null);
vis = vis | (tourismproduct.mostCurrent != null);
vis = vis | (tourismpackage.mostCurrent != null);
vis = vis | (listat.mostCurrent != null);
vis = vis | (homeuser.mostCurrent != null);
vis = vis | (listev.mostCurrent != null);
vis = vis | (mapsev.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (detailat.previousOne != null) {
				__a = detailat.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(detailat.mostCurrent == null ? null : detailat.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (homevisitor.previousOne != null) {
				__a = homevisitor.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(homevisitor.mostCurrent == null ? null : homevisitor.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (detailev.previousOne != null) {
				__a = detailev.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(detailev.mostCurrent == null ? null : detailev.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (mapsat.previousOne != null) {
				__a = mapsat.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(mapsat.mostCurrent == null ? null : mapsat.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (tourismproduct.previousOne != null) {
				__a = tourismproduct.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tourismproduct.mostCurrent == null ? null : tourismproduct.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (tourismpackage.previousOne != null) {
				__a = tourismpackage.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(tourismpackage.mostCurrent == null ? null : tourismpackage.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (listat.previousOne != null) {
				__a = listat.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(listat.mostCurrent == null ? null : listat.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (homeuser.previousOne != null) {
				__a = homeuser.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(homeuser.mostCurrent == null ? null : homeuser.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (listev.previousOne != null) {
				__a = listev.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(listev.mostCurrent == null ? null : listev.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (mapsev.previousOne != null) {
				__a = mapsev.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(mapsev.mostCurrent == null ? null : mapsev.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, httputils2service.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _server = "";
public static String _baseserver = "";
public static anywheresoftware.b4a.objects.collections.Map _data = null;
public static anywheresoftware.b4a.objects.collections.Map _user = null;
public static String _id = "";
public static String _email = "";
public static String _username = "";
public static String _name = "";
public static String _user_image = "";
public static String _address = "";
public static String _contact = "";
public static boolean _in_group = false;
public static de.amberhome.objects.preferenceactivity.PreferenceManager _manager = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnvisitor = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editlogin = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editpassword = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagelogin = null;
public anywheresoftware.b4a.objects.PanelWrapper _panellogin = null;
public b4a.example.dateutils _dateutils = null;
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
public b4a.example.mapsev _mapsev = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="CheckLogin";
_checklogin();
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="Activity.LoadLayout(\"Login\")";
mostCurrent._activity.LoadLayout("Login",mostCurrent.activityBA);
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="StartActivity(Homevisitor)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homevisitor.getObject()));
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="End Sub";
return "";
}
public static String  _checklogin() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checklogin", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checklogin", null));}
boolean _islogin = false;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub CheckLogin";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Log(\"Checking login status...\")";
anywheresoftware.b4a.keywords.Common.LogImpl("1589825","Checking login status...",0);
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Dim isLogin As Boolean";
_islogin = false;
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="isLogin = manager.GetBoolean(\"is_login\")";
_islogin = _manager.GetBoolean("is_login");
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="If isLogin Then";
if (_islogin) { 
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="If manager.GetBoolean(\"user\") Then";
if (_manager.GetBoolean("user")) { 
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Log(\"Redirecting to HomeUser activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("1589830","Redirecting to HomeUser activity",0);
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="StartActivity(Homeuser)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeuser.getObject()));
 };
 };
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Log(\"Login loaded\")";
anywheresoftware.b4a.keywords.Common.LogImpl("1196609","Login loaded",0);
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Log(\"Resume: \"&manager.GetBoolean(\"user\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("1196610","Resume: "+BA.ObjectToString(_manager.GetBoolean("user")),0);
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogin_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlogin_click", null));}
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Private Sub BtnLogin_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Log(server&\"login\")";
anywheresoftware.b4a.keywords.Common.LogImpl("1524289",_server+"login",0);
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Core.ExecuteUrl(server&\"login\", \"login=\"&EditLogi";
mostCurrent._core._executeurl /*String*/ (mostCurrent.activityBA,_server+"login","login="+mostCurrent._editlogin.getText()+"&password="+mostCurrent._editpassword.getText(),"Login",main.getObject());
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="End Sub";
return "";
}
public static String  _btnvisitor_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnvisitor_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnvisitor_click", null));}
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub BtnVisitor_Click";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="Log(\"Redirecting to HomeVisitor Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("1458753","Redirecting to HomeVisitor Activity",0);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="manager.SetBoolean(\"is_login\", False)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="manager.SetBoolean(\"visitor\", True)";
_manager.SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="manager.SetBoolean(\"user\", False)";
_manager.SetBoolean("user",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="StartActivity(Homevisitor)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homevisitor.getObject()));
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="End Sub";
return "";
}
public static String  _editlogin_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editlogin_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "editlogin_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub EditLogin_TextChanged (Old As String,";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public static String  _editpassword_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editpassword_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "editpassword_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub EditPassword_TextChanged (Old As Strin";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(b4a.example.httpjob _job) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
String _res = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.JSONParser _errorparser = null;
anywheresoftware.b4a.objects.collections.Map _errormap = null;
String _error = "";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("1655361","JobName = "+_job._jobname /*String*/ +", Success = "+BA.ObjectToString(_job._success /*boolean*/ ),0);
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Try";
try {RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Dim res As String";
_res = "";
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="res = Job.GetString";
_res = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="parser.Initialize(res)";
_parser.Initialize(_res);
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="Log(\"Response from server :\"&res)";
anywheresoftware.b4a.keywords.Common.LogImpl("1655368","Response from server :"+_res,0);
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="map = parser.NextObject";
_map = _parser.NextObject();
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="data = map.Get(\"data\")";
_data = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_map.Get((Object)("data"))));
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="in_group = data.Get(\"in_group\")";
_in_group = BA.ObjectToBoolean(_data.Get((Object)("in_group")));
RDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="If in_group Then";
if (_in_group) { 
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="user = data.Get(\"user\")";
_user = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_data.Get((Object)("user"))));
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="id = user.Get(\"id\")";
_id = BA.ObjectToString(_user.Get((Object)("id")));
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="email = user.Get(\"email\")";
_email = BA.ObjectToString(_user.Get((Object)("email")));
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="username = user.Get(\"username\")";
_username = BA.ObjectToString(_user.Get((Object)("username")));
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="name = user.Get(\"name\")";
_name = BA.ObjectToString(_user.Get((Object)("name")));
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="user_image = user.Get(\"user_image\")";
_user_image = BA.ObjectToString(_user.Get((Object)("user_image")));
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="address = user.Get(\"address\")";
_address = BA.ObjectToString(_user.Get((Object)("address")));
RDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="contact = user.Get(\"contact\")";
_contact = BA.ObjectToString(_user.Get((Object)("contact")));
RDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="ToastMessageShow(\"Login as User\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Login as User"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655385;
 //BA.debugLineNum = 655385;BA.debugLine="Msgbox2(\"Hi, \"&name, \"Logged In\",\"Oke\",\"\",\"\",N";
anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Hi, "+_name),BA.ObjectToCharSequence("Logged In"),"Oke","","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="Log(\"Redirect to HomeUser Activity\")";
anywheresoftware.b4a.keywords.Common.LogImpl("1655386","Redirect to HomeUser Activity",0);
RDebugUtils.currentLine=655388;
 //BA.debugLineNum = 655388;BA.debugLine="manager.SetBoolean(\"is_login\", True)";
_manager.SetBoolean("is_login",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="manager.SetBoolean(\"user\", True)";
_manager.SetBoolean("user",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655390;
 //BA.debugLineNum = 655390;BA.debugLine="manager.SetBoolean(\"visitor\", False)";
_manager.SetBoolean("visitor",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=655391;
 //BA.debugLineNum = 655391;BA.debugLine="manager.SetString(\"user_id\", id)";
_manager.SetString("user_id",_id);
RDebugUtils.currentLine=655392;
 //BA.debugLineNum = 655392;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=655393;
 //BA.debugLineNum = 655393;BA.debugLine="StartActivity(Homeuser)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._homeuser.getObject()));
 }else {
RDebugUtils.currentLine=655395;
 //BA.debugLineNum = 655395;BA.debugLine="MsgboxAsync(\"Please input correct credentials\"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please input correct credentials"),BA.ObjectToCharSequence("Login Failed"),processBA);
 };
 } 
       catch (Exception e35) {
			processBA.setLastException(e35);RDebugUtils.currentLine=655398;
 //BA.debugLineNum = 655398;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("1655398",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }else {
RDebugUtils.currentLine=655401;
 //BA.debugLineNum = 655401;BA.debugLine="Dim errorParser As JSONParser";
_errorparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=655402;
 //BA.debugLineNum = 655402;BA.debugLine="errorParser.Initialize(Job.ErrorMessage)";
_errorparser.Initialize(_job._errormessage /*String*/ );
RDebugUtils.currentLine=655404;
 //BA.debugLineNum = 655404;BA.debugLine="Dim errorMap As Map";
_errormap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=655405;
 //BA.debugLineNum = 655405;BA.debugLine="errorMap = errorParser.NextObject";
_errormap = _errorparser.NextObject();
RDebugUtils.currentLine=655406;
 //BA.debugLineNum = 655406;BA.debugLine="Log(\"Error: \" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("1655406","Error: "+_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=655408;
 //BA.debugLineNum = 655408;BA.debugLine="Dim error As String";
_error = "";
RDebugUtils.currentLine=655409;
 //BA.debugLineNum = 655409;BA.debugLine="error = errorMap.Get(\"message\")";
_error = BA.ObjectToString(_errormap.Get((Object)("message")));
RDebugUtils.currentLine=655410;
 //BA.debugLineNum = 655410;BA.debugLine="ToastMessageShow(\"Error: \" & error, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error: "+_error),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=655411;
 //BA.debugLineNum = 655411;BA.debugLine="MsgboxAsync(\"Please input correct credentials\",\"";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Please input correct credentials"),BA.ObjectToCharSequence("Login Failed"),processBA);
 };
RDebugUtils.currentLine=655413;
 //BA.debugLineNum = 655413;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=655414;
 //BA.debugLineNum = 655414;BA.debugLine="End Sub";
return "";
}
}