
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

public class homeuser implements IRemote{
	public static homeuser mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public homeuser() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("homeuser"), "b4a.example.homeuser");
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
		pcBA = new PCBA(this, homeuser.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _email = RemoteObject.createImmutable("");
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _user_image = RemoteObject.createImmutable("");
public static RemoteObject _address = RemoteObject.createImmutable("");
public static RemoteObject _contact = RemoteObject.createImmutable("");
public static RemoteObject _status = RemoteObject.createImmutable(0);
public static RemoteObject _btnev = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnlogout = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _labelev = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labellogout = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelrg = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _labelusername = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelbanner = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelhome = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelprofile = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _profileavatar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.main _main = null;
public static b4a.example.detailat _detailat = null;
public static b4a.example.homevisitor _homevisitor = null;
public static b4a.example.detailev _detailev = null;
public static b4a.example.core _core = null;
public static b4a.example.mapsat _mapsat = null;
public static b4a.example.starter _starter = null;
public static b4a.example.tourismproduct _tourismproduct = null;
public static b4a.example.tourismpackage _tourismpackage = null;
public static b4a.example.listat _listat = null;
public static b4a.example.listev _listev = null;
public static b4a.example.mapsev _mapsev = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",homeuser.mostCurrent._activity,"address",homeuser._address,"B4XCollections",Debug.moduleToString(b4a.example.b4xcollections.class),"BtnEV",homeuser.mostCurrent._btnev,"BtnLogout",homeuser.mostCurrent._btnlogout,"BtnRG",homeuser.mostCurrent._btnrg,"contact",homeuser._contact,"Core",Debug.moduleToString(b4a.example.core.class),"data",homeuser._data,"DateUtils",homeuser.mostCurrent._dateutils,"DetailAt",Debug.moduleToString(b4a.example.detailat.class),"DetailEv",Debug.moduleToString(b4a.example.detailev.class),"email",homeuser._email,"Homevisitor",Debug.moduleToString(b4a.example.homevisitor.class),"HttpUtils2Service",Debug.moduleToString(b4a.example.httputils2service.class),"id",homeuser._id,"LabelEV",homeuser.mostCurrent._labelev,"LabelHeader",homeuser.mostCurrent._labelheader,"LabelLogout",homeuser.mostCurrent._labellogout,"LabelName",homeuser.mostCurrent._labelname,"LabelRG",homeuser.mostCurrent._labelrg,"LabelUsername",homeuser.mostCurrent._labelusername,"ListAt",Debug.moduleToString(b4a.example.listat.class),"ListEv",Debug.moduleToString(b4a.example.listev.class),"Main",Debug.moduleToString(b4a.example.main.class),"MapsAt",Debug.moduleToString(b4a.example.mapsat.class),"MapsEv",Debug.moduleToString(b4a.example.mapsev.class),"name",homeuser._name,"PanelBanner",homeuser.mostCurrent._panelbanner,"PanelHome",homeuser.mostCurrent._panelhome,"PanelMenu",homeuser.mostCurrent._panelmenu,"PanelProfile",homeuser.mostCurrent._panelprofile,"ProfileAvatar",homeuser.mostCurrent._profileavatar,"Starter",Debug.moduleToString(b4a.example.starter.class),"status",homeuser._status,"TourismPackage",Debug.moduleToString(b4a.example.tourismpackage.class),"TourismProduct",Debug.moduleToString(b4a.example.tourismproduct.class),"user_image",homeuser._user_image,"username",homeuser._username,"XUIViewsUtils",Debug.moduleToString(b4a.example.xuiviewsutils.class)};
}
}