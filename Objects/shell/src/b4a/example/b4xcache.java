
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xcache {
    public static RemoteObject myClass;
	public b4xcache() {
	}
    public static PCBA staticBA = new PCBA(null, b4xcache.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _data = RemoteObject.declareNull("b4a.example.b4xorderedmap");
public static RemoteObject _mmaxsize = RemoteObject.createImmutable(0);
public static RemoteObject _removethreshold = RemoteObject.createImmutable(0f);
public static RemoteObject _eternalcounts = RemoteObject.createImmutable(0);
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
		return new Object[] {"Data",_ref.getField(false, "_data"),"DateUtils",_ref.getField(false, "_dateutils"),"EternalCounts",_ref.getField(false, "_eternalcounts"),"mMaxSize",_ref.getField(false, "_mmaxsize"),"RemoveThreshold",_ref.getField(false, "_removethreshold")};
}
}