
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xlisttemplate {
    public static RemoteObject myClass;
	public b4xlisttemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xlisttemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _selecteditem = RemoteObject.createImmutable("");
public static RemoteObject _xdialog = RemoteObject.declareNull("b4a.example.b4xdialog");
public static RemoteObject _allowmultiselection = RemoteObject.createImmutable(false);
public static RemoteObject _selectioncolor = RemoteObject.createImmutable(0);
public static RemoteObject _selecteditems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _multiselectionminimum = RemoteObject.createImmutable(0);
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
		return new Object[] {"AllowMultiSelection",_ref.getField(false, "_allowmultiselection"),"CustomListView1",_ref.getField(false, "_customlistview1"),"DateUtils",_ref.getField(false, "_dateutils"),"mBase",_ref.getField(false, "_mbase"),"MultiSelectionMinimum",_ref.getField(false, "_multiselectionminimum"),"Options",_ref.getField(false, "_options"),"SelectedItem",_ref.getField(false, "_selecteditem"),"SelectedItems",_ref.getField(false, "_selecteditems"),"SelectionColor",_ref.getField(false, "_selectioncolor"),"xDialog",_ref.getField(false, "_xdialog"),"xui",_ref.getField(false, "_xui")};
}
}