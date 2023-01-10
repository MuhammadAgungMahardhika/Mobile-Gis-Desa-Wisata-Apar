
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class smmviews {
    public static RemoteObject myClass;
	public smmviews() {
	}
    public static PCBA staticBA = new PCBA(null, smmviews.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _targettosmmviews = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _view_type_b4ximageview = RemoteObject.createImmutable(0);
public static RemoteObject _view_type_gifview = RemoteObject.createImmutable(0);
public static RemoteObject _view_type_videoplayer = RemoteObject.createImmutable(0);
public static RemoteObject _view_type_none = RemoteObject.createImmutable(0);
public static RemoteObject _view_type_webview = RemoteObject.createImmutable(0);
public static RemoteObject _view_type_zoomimageview = RemoteObject.createImmutable(0);
public static RemoteObject _media_type_image = RemoteObject.createImmutable(0);
public static RemoteObject _media_type_gif = RemoteObject.createImmutable(0);
public static RemoteObject _media_type_video = RemoteObject.createImmutable(0);
public static RemoteObject _media_type_none = RemoteObject.createImmutable(0);
public static RemoteObject _media_type_webp = RemoteObject.createImmutable(0);
public static RemoteObject _media_type_html = RemoteObject.createImmutable(0);
public static RemoteObject _unusedviews = RemoteObject.declareNull("b4a.example.b4xset");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _gif_supported = RemoteObject.createImmutable(false);
public static RemoteObject _video_supported = RemoteObject.createImmutable(false);
public static RemoteObject _webp_supported = RemoteObject.createImmutable(false);
public static RemoteObject _mmanager = RemoteObject.declareNull("b4a.example.simplemediamanager");
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
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"GIF_SUPPORTED",_ref.getField(false, "_gif_supported"),"MEDIA_TYPE_GIF",_ref.getField(false, "_media_type_gif"),"MEDIA_TYPE_HTML",_ref.getField(false, "_media_type_html"),"MEDIA_TYPE_IMAGE",_ref.getField(false, "_media_type_image"),"MEDIA_TYPE_NONE",_ref.getField(false, "_media_type_none"),"MEDIA_TYPE_VIDEO",_ref.getField(false, "_media_type_video"),"MEDIA_TYPE_WEBP",_ref.getField(false, "_media_type_webp"),"mManager",_ref.getField(false, "_mmanager"),"Panel",_ref.getField(false, "_panel"),"TargetToSMMViews",_ref.getField(false, "_targettosmmviews"),"UnusedViews",_ref.getField(false, "_unusedviews"),"VIDEO_SUPPORTED",_ref.getField(false, "_video_supported"),"VIEW_TYPE_B4XIMAGEVIEW",_ref.getField(false, "_view_type_b4ximageview"),"VIEW_TYPE_GIFVIEW",_ref.getField(false, "_view_type_gifview"),"VIEW_TYPE_NONE",_ref.getField(false, "_view_type_none"),"VIEW_TYPE_VIDEOPLAYER",_ref.getField(false, "_view_type_videoplayer"),"VIEW_TYPE_WEBVIEW",_ref.getField(false, "_view_type_webview"),"VIEW_TYPE_ZOOMIMAGEVIEW",_ref.getField(false, "_view_type_zoomimageview"),"WEBP_SUPPORTED",_ref.getField(false, "_webp_supported"),"xui",_ref.getField(false, "_xui")};
}
}