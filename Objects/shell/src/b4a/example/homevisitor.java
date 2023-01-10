
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

public class homevisitor implements IRemote{
	public static homevisitor mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public homevisitor() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("homevisitor"), "b4a.example.homevisitor");
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
		pcBA = new PCBA(this, homevisitor.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _btnev = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelev = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labellogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelbanner = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelhome = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelprofile = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _profileavatar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _btnpd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelpd = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelpd = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.detailat _detailat = null;
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
		return new Object[] {"Activity",homevisitor.mostCurrent._activity,"B4XCollections",Debug.moduleToString(b4a.example.b4xcollections.class),"BtnEV",homevisitor.mostCurrent._btnev,"BtnLogin",homevisitor.mostCurrent._btnlogin,"BtnPd",homevisitor.mostCurrent._btnpd,"BtnRG",homevisitor.mostCurrent._btnrg,"Core",Debug.moduleToString(b4a.example.core.class),"DateUtils",homevisitor.mostCurrent._dateutils,"DetailAt",Debug.moduleToString(b4a.example.detailat.class),"DetailEv",Debug.moduleToString(b4a.example.detailev.class),"Homeuser",Debug.moduleToString(b4a.example.homeuser.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"LabelEV",homevisitor.mostCurrent._labelev,"LabelHeader",homevisitor.mostCurrent._labelheader,"LabelLogin",homevisitor.mostCurrent._labellogin,"LabelName",homevisitor.mostCurrent._labelname,"LabelPd",homevisitor.mostCurrent._labelpd,"LabelRG",homevisitor.mostCurrent._labelrg,"LabelUsername",homevisitor.mostCurrent._labelusername,"ListAt",Debug.moduleToString(b4a.example.listat.class),"ListEv",Debug.moduleToString(b4a.example.listev.class),"Main",Debug.moduleToString(b4a.example.main.class),"MapsAt",Debug.moduleToString(b4a.example.mapsat.class),"MapsEv",Debug.moduleToString(b4a.example.mapsev.class),"PanelBanner",homevisitor.mostCurrent._panelbanner,"PanelHome",homevisitor.mostCurrent._panelhome,"PanelMenu",homevisitor.mostCurrent._panelmenu,"PanelPd",homevisitor.mostCurrent._panelpd,"PanelProfile",homevisitor.mostCurrent._panelprofile,"ProfileAvatar",homevisitor.mostCurrent._profileavatar,"Starter",Debug.moduleToString(b4a.example.starter.class),"TourismPackage",Debug.moduleToString(b4a.example.tourismpackage.class),"TourismProduct",Debug.moduleToString(b4a.example.tourismproduct.class),"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}