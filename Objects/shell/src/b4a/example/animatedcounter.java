
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class animatedcounter {
    public static RemoteObject myClass;
	public animatedcounter() {
	}
    public static PCBA staticBA = new PCBA(null, animatedcounter.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _imageviews = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mdigits = RemoteObject.createImmutable(0);
public static RemoteObject _lbltemplate = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mvalue = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _digitheight = RemoteObject.createImmutable(0);
public static RemoteObject _digitwidth = RemoteObject.createImmutable(0);
public static RemoteObject _mduration = RemoteObject.createImmutable(0);
public static RemoteObject _fade = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _xfadeiv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
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
public static b4a.example.homeuser _homeuser = null;
public static b4a.example.listev _listev = null;
public static b4a.example.mapsev _mapsev = null;
public static b4a.example.httputils2service _httputils2service = null;
public static b4a.example.b4xcollections _b4xcollections = null;
public static b4a.example.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"DigitHeight",_ref.getField(false, "_digitheight"),"DigitWidth",_ref.getField(false, "_digitwidth"),"fade",_ref.getField(false, "_fade"),"ImageViews",_ref.getField(false, "_imageviews"),"lblTemplate",_ref.getField(false, "_lbltemplate"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mdigits",_ref.getField(false, "_mdigits"),"mDuration",_ref.getField(false, "_mduration"),"mEventName",_ref.getField(false, "_meventname"),"mValue",_ref.getField(false, "_mvalue"),"Tag",_ref.getField(false, "_tag"),"xfadeIv",_ref.getField(false, "_xfadeiv"),"xui",_ref.getField(false, "_xui")};
}
}