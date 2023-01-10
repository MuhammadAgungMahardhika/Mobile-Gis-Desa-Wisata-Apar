
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class simplemediamanager {
    public static RemoteObject myClass;
	public simplemediamanager() {
	}
    public static PCBA staticBA = new PCBA(null, simplemediamanager.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _state_loading = RemoteObject.createImmutable(0);
public static RemoteObject _state_error = RemoteObject.createImmutable(0);
public static RemoteObject _state_ready = RemoteObject.createImmutable(0);
public static RemoteObject _metacache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mediacache = RemoteObject.declareNull("b4a.example.b4xorderedmap");
public static RemoteObject _maxmediacachesize = RemoteObject.createImmutable(0);
public static RemoteObject _viewsrequestset = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _imagesloader = RemoteObject.declareNull("b4a.example.bitmapsasync");
public static RemoteObject _jobempty = RemoteObject.declareNull("b4a.example.httpjob");
public static RemoteObject _key_default_loading = RemoteObject.createImmutable("");
public static RemoteObject _key_default_error = RemoteObject.createImmutable("");
public static RemoteObject _mime_unknown = RemoteObject.createImmutable("");
public static RemoteObject _maximagesize = RemoteObject.createImmutable(0);
public static RemoteObject _defaultfadeanimationduration = RemoteObject.createImmutable(0);
public static RemoteObject _defaultresizemode = RemoteObject.createImmutable("");
public static RemoteObject _defaultbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _defaultforegroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _viewsmanager = RemoteObject.declareNull("b4a.example.smmviews");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _defaultloadingrequest = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequest");
public static RemoteObject _defaulterrorrequest = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequest");
public static RemoteObject _request_roundimage = RemoteObject.createImmutable("");
public static RemoteObject _request_background = RemoteObject.createImmutable("");
public static RemoteObject _request_resize_mode = RemoteObject.createImmutable("");
public static RemoteObject _request_fade_animation_duration = RemoteObject.createImmutable("");
public static RemoteObject _request_foreground = RemoteObject.createImmutable("");
public static RemoteObject _request_callback = RemoteObject.createImmutable("");
public static RemoteObject _request_zoomimageview = RemoteObject.createImmutable("");
public static RemoteObject _request_file = RemoteObject.createImmutable("");
public static RemoteObject _request_dir = RemoteObject.createImmutable("");
public static RemoteObject _lasttrimcache = RemoteObject.createImmutable(0L);
public static RemoteObject _mintimebetweentrims = RemoteObject.createImmutable(0L);
public static RemoteObject _sleepdurationbeforedownload = RemoteObject.createImmutable(0L);
public static RemoteObject _httprequestsmanager = RemoteObject.declareNull("b4a.example.requestsmanager");
public static RemoteObject _b4asdkversion = RemoteObject.createImmutable(0);
public static RemoteObject _defaultrequesttimeout = RemoteObject.createImmutable(0);
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
		return new Object[] {"B4ASdkVersion",_ref.getField(false, "_b4asdkversion"),"DateUtils",_ref.getField(false, "_dateutils"),"DefaultBackgroundColor",_ref.getField(false, "_defaultbackgroundcolor"),"DefaultErrorRequest",_ref.getField(false, "_defaulterrorrequest"),"DefaultFadeAnimationDuration",_ref.getField(false, "_defaultfadeanimationduration"),"DefaultForegroundColor",_ref.getField(false, "_defaultforegroundcolor"),"DefaultLoadingRequest",_ref.getField(false, "_defaultloadingrequest"),"DefaultRequestTimeout",_ref.getField(false, "_defaultrequesttimeout"),"DefaultResizeMode",_ref.getField(false, "_defaultresizemode"),"HttpRequestsManager",_ref.getField(false, "_httprequestsmanager"),"ImagesLoader",_ref.getField(false, "_imagesloader"),"JobEmpty",_ref.getField(false, "_jobempty"),"KEY_DEFAULT_ERROR",_ref.getField(false, "_key_default_error"),"KEY_DEFAULT_LOADING",_ref.getField(false, "_key_default_loading"),"LastTrimCache",_ref.getField(false, "_lasttrimcache"),"MaxImageSize",_ref.getField(false, "_maximagesize"),"MaxMediaCacheSize",_ref.getField(false, "_maxmediacachesize"),"MediaCache",_ref.getField(false, "_mediacache"),"MetaCache",_ref.getField(false, "_metacache"),"MIME_UNKNOWN",_ref.getField(false, "_mime_unknown"),"MinTimeBetweenTrims",_ref.getField(false, "_mintimebetweentrims"),"REQUEST_BACKGROUND",_ref.getField(false, "_request_background"),"REQUEST_CALLBACK",_ref.getField(false, "_request_callback"),"REQUEST_DIR",_ref.getField(false, "_request_dir"),"REQUEST_FADE_ANIMATION_DURATION",_ref.getField(false, "_request_fade_animation_duration"),"REQUEST_FILE",_ref.getField(false, "_request_file"),"REQUEST_FOREGROUND",_ref.getField(false, "_request_foreground"),"REQUEST_RESIZE_MODE",_ref.getField(false, "_request_resize_mode"),"REQUEST_ROUNDIMAGE",_ref.getField(false, "_request_roundimage"),"REQUEST_ZOOMIMAGEVIEW",_ref.getField(false, "_request_zoomimageview"),"SleepDurationBeforeDownload",_ref.getField(false, "_sleepdurationbeforedownload"),"STATE_ERROR",_ref.getField(false, "_state_error"),"STATE_LOADING",_ref.getField(false, "_state_loading"),"STATE_READY",_ref.getField(false, "_state_ready"),"ViewsManager",_ref.getField(false, "_viewsmanager"),"ViewsRequestSet",_ref.getField(false, "_viewsrequestset"),"xui",_ref.getField(false, "_xui")};
}
}