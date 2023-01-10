
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xsignaturetemplate {
    public static RemoteObject myClass;
	public b4xsignaturetemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xsignaturetemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _lastx = RemoteObject.createImmutable(0f);
public static RemoteObject _lasty = RemoteObject.createImmutable(0f);
public static RemoteObject _strokewidth = RemoteObject.createImmutable(0f);
public static RemoteObject _strokecolor = RemoteObject.createImmutable(0);
public static RemoteObject _textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _adddateandtime = RemoteObject.createImmutable(false);
public static RemoteObject _textfont = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
public static RemoteObject _numberofpoints = RemoteObject.createImmutable(0);
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
		return new Object[] {"AddDateAndTime",_ref.getField(false, "_adddateandtime"),"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"LastX",_ref.getField(false, "_lastx"),"LastY",_ref.getField(false, "_lasty"),"mBase",_ref.getField(false, "_mbase"),"NumberOfPoints",_ref.getField(false, "_numberofpoints"),"StrokeColor",_ref.getField(false, "_strokecolor"),"StrokeWidth",_ref.getField(false, "_strokewidth"),"TextColor",_ref.getField(false, "_textcolor"),"TextFont",_ref.getField(false, "_textfont"),"xui",_ref.getField(false, "_xui")};
}
}