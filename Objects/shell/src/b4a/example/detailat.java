
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class detailat implements IRemote{
	public static detailat mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public detailat() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("detailat"), "b4a.example.detailat");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, detailat.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mywebviewextras = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
public static RemoteObject _mywebviewsettings = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
public static RemoteObject _btnback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _titlenavbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _wvdetail = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.homevisitor _homevisitor = null;
public static b4a.example.detailev _detailev = null;
public static b4a.example.core _core = null;
public static b4a.example.mapsat _mapsat = null;
public static b4a.example.starter _starter = null;
public static b4a.example.tourismproduct _tourismproduct = null;
public static b4a.example.tourismpackage _tourismpackage = null;
public static b4a.example.listat _listat = null;
public static b4a.example.homeuser _homeuser = null;
public static b4a.example.listev _listev = null;
public static b4a.example.mapsev _mapsev = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",detailat.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.example.b4xcollections.class),"BtnBack",detailat.mostCurrent._btnback,"Core",Debug.moduleToString(b4a.example.core.class),"DateUtils",detailat.mostCurrent._dateutils,"DetailEv",Debug.moduleToString(b4a.example.detailev.class),"Homeuser",Debug.moduleToString(b4a.example.homeuser.class),"Homevisitor",Debug.moduleToString(b4a.example.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"ListAt",Debug.moduleToString(b4a.example.listat.class),"ListEv",Debug.moduleToString(b4a.example.listev.class),"Main",Debug.moduleToString(b4a.example.main.class),"MainScroll",detailat.mostCurrent._mainscroll,"MapsAt",Debug.moduleToString(b4a.example.mapsat.class),"MapsEv",Debug.moduleToString(b4a.example.mapsev.class),"MyWebViewExtras",detailat.mostCurrent._mywebviewextras,"MyWebViewSettings",detailat.mostCurrent._mywebviewsettings,"Navbar",detailat.mostCurrent._navbar,"Starter",Debug.moduleToString(b4a.example.starter.class),"TitleNavbar",detailat.mostCurrent._titlenavbar,"TourismPackage",Debug.moduleToString(b4a.example.tourismpackage.class),"TourismProduct",Debug.moduleToString(b4a.example.tourismproduct.class),"wvDetail",detailat.mostCurrent._wvdetail,"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}