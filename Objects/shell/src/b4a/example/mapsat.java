
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

public class mapsat implements IRemote{
	public static mapsat mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mapsat() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mapsat"), "b4a.example.mapsat");
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
		pcBA = new PCBA(this, mapsat.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _atractionmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mywebviewextras = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewextras.WebViewExtras");
public static RemoteObject _mywebviewsetting = RemoteObject.declareNull("uk.co.martinpearman.b4a.webviewsettings.WebViewSettings");
public static RemoteObject _navbar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mainscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _btnlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnobj = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnuserloc = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelcategory = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelrating = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelsearch = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _spincategory = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _spinrating = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _webviewrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
public static RemoteObject _spinname = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _buttonback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.detailat _detailat = null;
public static b4a.example.homevisitor _homevisitor = null;
public static b4a.example.detailev _detailev = null;
public static b4a.example.core _core = null;
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
		return new Object[] {"Activity",mapsat.mostCurrent._activity,"atractionMap",mapsat._atractionmap,"B4XCollections",Debug.moduleToString(b4a.example.b4xcollections.class),"btnList",mapsat.mostCurrent._btnlist,"btnObj",mapsat.mostCurrent._btnobj,"btnUserLoc",mapsat.mostCurrent._btnuserloc,"ButtonBack",mapsat.mostCurrent._buttonback,"Core",Debug.moduleToString(b4a.example.core.class),"DateUtils",mapsat.mostCurrent._dateutils,"DetailAt",Debug.moduleToString(b4a.example.detailat.class),"DetailEv",Debug.moduleToString(b4a.example.detailev.class),"Homeuser",Debug.moduleToString(b4a.example.homeuser.class),"Homevisitor",Debug.moduleToString(b4a.example.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"Label1",mapsat.mostCurrent._label1,"Label2",mapsat.mostCurrent._label2,"Label3",mapsat.mostCurrent._label3,"ListAt",Debug.moduleToString(b4a.example.listat.class),"ListEv",Debug.moduleToString(b4a.example.listev.class),"Main",Debug.moduleToString(b4a.example.main.class),"MainScroll",mapsat.mostCurrent._mainscroll,"MapsEv",Debug.moduleToString(b4a.example.mapsev.class),"MyWebViewExtras",mapsat.mostCurrent._mywebviewextras,"MyWebViewSetting",mapsat.mostCurrent._mywebviewsetting,"Navbar",mapsat.mostCurrent._navbar,"PanelCategory",mapsat.mostCurrent._panelcategory,"PanelRating",mapsat.mostCurrent._panelrating,"PanelRG",mapsat.mostCurrent._panelrg,"PanelSearch",mapsat.mostCurrent._panelsearch,"spinCategory",mapsat.mostCurrent._spincategory,"spinName",mapsat.mostCurrent._spinname,"spinRating",mapsat.mostCurrent._spinrating,"Starter",Debug.moduleToString(b4a.example.starter.class),"TourismPackage",Debug.moduleToString(b4a.example.tourismpackage.class),"TourismProduct",Debug.moduleToString(b4a.example.tourismproduct.class),"WebViewRG",mapsat.mostCurrent._webviewrg,"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}