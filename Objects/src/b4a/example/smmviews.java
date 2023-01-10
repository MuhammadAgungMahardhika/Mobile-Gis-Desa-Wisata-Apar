package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class smmviews extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.smmviews");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.smmviews.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _smmview{
public boolean IsInitialized;
public Object CustomView;
public anywheresoftware.b4a.objects.B4XViewWrapper mBase;
public int ViewType;
public String Key;
public void Initialize() {
IsInitialized = true;
CustomView = new Object();
mBase = new anywheresoftware.b4a.objects.B4XViewWrapper();
ViewType = 0;
Key = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _targettosmmviews = null;
public int _view_type_b4ximageview = 0;
public int _view_type_gifview = 0;
public int _view_type_videoplayer = 0;
public int _view_type_none = 0;
public int _view_type_webview = 0;
public int _view_type_zoomimageview = 0;
public int _media_type_image = 0;
public int _media_type_gif = 0;
public int _media_type_video = 0;
public int _media_type_none = 0;
public int _media_type_webp = 0;
public int _media_type_html = 0;
public b4a.example.b4xset _unusedviews = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
public boolean _gif_supported = false;
public boolean _video_supported = false;
public boolean _webp_supported = false;
public b4a.example.simplemediamanager _mmanager = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.detailat _detailat = null;
public b4a.example.homevisitor _homevisitor = null;
public b4a.example.detailev _detailev = null;
public b4a.example.core _core = null;
public b4a.example.mapsat _mapsat = null;
public b4a.example.starter _starter = null;
public b4a.example.tourismproduct _tourismproduct = null;
public b4a.example.tourismpackage _tourismpackage = null;
public b4a.example.listat _listat = null;
public b4a.example.homeuser _homeuser = null;
public b4a.example.listev _listev = null;
public b4a.example.mapsev _mapsev = null;
public b4a.example.httputils2service _httputils2service = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.xuiviewsutils _xuiviewsutils = null;
public String  _cancelrequest(b4a.example.smmviews __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "cancelrequest", true))
	 {return ((String) Debug.delegate(ba, "cancelrequest", new Object[] {_target}));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub CancelRequest (Target As B4XView)";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="If TargetToSMMViews.ContainsKey(Target) Then";
if (__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_target.getObject()))) { 
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="ReturnViewToCache(TargetToSMMViews.Get(Target))";
__ref._returnviewtocache /*String*/ (null,(b4a.example.smmviews._smmview)(__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_target.getObject()))));
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="TargetToSMMViews.Remove(Target)";
__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_target.getObject()));
 };
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="End Sub";
return "";
}
public int  _mimetomediatype(b4a.example.smmviews __ref,String _mime) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "mimetomediatype", true))
	 {return ((Integer) Debug.delegate(ba, "mimetomediatype", new Object[] {_mime}));}
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub MimeToMediaType (Mime As String) As Int";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="If Mime.StartsWith(\"image/gif\") Then";
if (_mime.startsWith("image/gif")) { 
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="If GIF_SUPPORTED = False Then Log(\"*** Add a ref";
if (__ref._gif_supported /*boolean*/ ==__c.False) { 
__c.LogImpl("912976130","*** Add a reference to B4XGIfView and add SMM_GIF to the build configuration ***",0);};
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Return IIf(GIF_SUPPORTED, MEDIA_TYPE_GIF, MEDIA_";
if (true) return (int)(BA.ObjectToNumber(((__ref._gif_supported /*boolean*/ ) ? ((Object)(__ref._media_type_gif /*int*/ )) : ((Object)(__ref._media_type_none /*int*/ )))));
 }else 
{RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="Else If Mime.StartsWith(\"image/webp\") Then";
if (_mime.startsWith("image/webp")) { 
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="If WEBP_SUPPORTED = False Then Log(\"*** Add a re";
if (__ref._webp_supported /*boolean*/ ==__c.False) { 
__c.LogImpl("912976133","*** Add a reference to WebP library and add SMM_WEBP to the build configuration ***",0);};
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="Return IIf(WEBP_SUPPORTED, MEDIA_TYPE_WEBP, MEDI";
if (true) return (int)(BA.ObjectToNumber(((__ref._webp_supported /*boolean*/ ) ? ((Object)(__ref._media_type_webp /*int*/ )) : ((Object)(__ref._media_type_none /*int*/ )))));
 }else 
{RDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="Else If Mime.StartsWith(\"image/\") Then";
if (_mime.startsWith("image/")) { 
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="Return MEDIA_TYPE_IMAGE";
if (true) return __ref._media_type_image /*int*/ ;
 }else 
{RDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="Else if Mime.StartsWith(\"video/\") Then";
if (_mime.startsWith("video/")) { 
RDebugUtils.currentLine=12976138;
 //BA.debugLineNum = 12976138;BA.debugLine="If VIDEO_SUPPORTED = False Then Log(\"*** Add a r";
if (__ref._video_supported /*boolean*/ ==__c.False) { 
__c.LogImpl("912976138","*** Add a reference to the video library and add SMM_VIDEO to the build configuration ***",0);};
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="Return IIf(VIDEO_SUPPORTED, MEDIA_TYPE_VIDEO, ME";
if (true) return (int)(BA.ObjectToNumber(((__ref._video_supported /*boolean*/ ) ? ((Object)(__ref._media_type_video /*int*/ )) : ((Object)(__ref._media_type_none /*int*/ )))));
 }else 
{RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="Else If Mime.StartsWith(\"text/\") Then";
if (_mime.startsWith("text/")) { 
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="Return MEDIA_TYPE_HTML";
if (true) return __ref._media_type_html /*int*/ ;
 }else {
RDebugUtils.currentLine=12976143;
 //BA.debugLineNum = 12976143;BA.debugLine="Return MEDIA_TYPE_NONE";
if (true) return __ref._media_type_none /*int*/ ;
 }}}}}
;
RDebugUtils.currentLine=12976145;
 //BA.debugLineNum = 12976145;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.smmviews __ref,anywheresoftware.b4a.BA _ba,b4a.example.simplemediamanager _manager) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_manager}));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub Initialize (Manager As SimpleMediaManag";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="mManager = Manager";
__ref._mmanager /*b4a.example.simplemediamanager*/  = _manager;
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="TargetToSMMViews.Initialize";
__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="UnusedViews.Initialize";
__ref._unusedviews /*b4a.example.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="Panel = xui.CreatePanel(\"\")";
__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="Panel.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="End Sub";
return "";
}
public void  _addmedia(b4a.example.smmviews __ref,b4a.example.simplemediamanager._smmediarequestset _requestset,b4a.example.simplemediamanager._smmedia _media,b4a.example.simplemediamanager._smmediarequest _request) throws Exception{
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "addmedia", true))
	 {Debug.delegate(ba, "addmedia", new Object[] {_requestset,_media,_request}); return;}
ResumableSub_AddMedia rsub = new ResumableSub_AddMedia(this,__ref,_requestset,_media,_request);
rsub.resume(ba, null);
}
public static class ResumableSub_AddMedia extends BA.ResumableSub {
public ResumableSub_AddMedia(b4a.example.smmviews parent,b4a.example.smmviews __ref,b4a.example.simplemediamanager._smmediarequestset _requestset,b4a.example.simplemediamanager._smmedia _media,b4a.example.simplemediamanager._smmediarequest _request) {
this.parent = parent;
this.__ref = __ref;
this._requestset = _requestset;
this._media = _media;
this._request = _request;
this.__ref = parent;
}
b4a.example.smmviews __ref;
b4a.example.smmviews parent;
b4a.example.simplemediamanager._smmediarequestset _requestset;
b4a.example.simplemediamanager._smmedia _media;
b4a.example.simplemediamanager._smmediarequest _request;
anywheresoftware.b4a.objects.B4XViewWrapper _target = null;
int _viewtype = 0;
b4a.example.smmviews._smmview _sm = null;
int _fadeanimation = 0;
b4a.example.b4ximageview _x = null;
anywheresoftware.b4j.object.JavaObject _decoder = null;
anywheresoftware.b4j.object.JavaObject _drawable = null;
Object[] _params = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="smmviews";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="Dim Target As B4XView = RequestSet.Target";
_target = new anywheresoftware.b4a.objects.B4XViewWrapper();
_target = _requestset.Target /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="CancelRequest(Target)";
__ref._cancelrequest /*String*/ (null,_target);
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="Dim ViewType As Int = MediaTypeToViewType(MEDIA.M";
_viewtype = __ref._mediatypetoviewtype /*int*/ (null,_media.Meta /*b4a.example.simplemediamanager._smmediameta*/ .MediaType /*int*/ ,_request);
RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="Dim sm As SMMView = GetView(ViewType, MEDIA.Meta.";
_sm = __ref._getview /*b4a.example.smmviews._smmview*/ (null,_viewtype,_media.Meta /*b4a.example.simplemediamanager._smmediameta*/ .Key /*String*/ );
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="Target.Color = Request.Extra.GetDefault(mManager.";
_target.setColor((int)(BA.ObjectToNumber(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._mmanager /*b4a.example.simplemediamanager*/ ._request_background /*String*/ ),(Object)(__ref._mmanager /*b4a.example.simplemediamanager*/ ._defaultbackgroundcolor /*int*/ )))));
RDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="TargetToSMMViews.Put(Target, sm)";
__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_target.getObject()),(Object)(_sm));
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="Target.AddView(sm.mBase, 0, 0, Target.Width, Targ";
_target.AddView((android.view.View)(_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),_target.getWidth(),_target.getHeight());
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="Dim FadeAnimation As Int = Request.Extra.GetDefau";
_fadeanimation = (int)(BA.ObjectToNumber(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._mmanager /*b4a.example.simplemediamanager*/ ._request_fade_animation_duration /*String*/ ),(Object)(__ref._mmanager /*b4a.example.simplemediamanager*/ ._defaultfadeanimationduration /*int*/ ))));
RDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="If FadeAnimation > 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_fadeanimation>0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=12845069;
 //BA.debugLineNum = 12845069;BA.debugLine="sm.mBase.Visible = False";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=12845070;
 //BA.debugLineNum = 12845070;BA.debugLine="sm.mBase.SetVisibleAnimated(FadeAnimation, True)";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(_fadeanimation,parent.__c.True);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=12845072;
 //BA.debugLineNum = 12845072;BA.debugLine="sm.mBase.Visible = True";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
 if (true) break;
;
RDebugUtils.currentLine=12845074;
 //BA.debugLineNum = 12845074;BA.debugLine="Select ViewType";

case 6:
//select
this.state = 25;
switch (BA.switchObjectToInt(_viewtype,__ref._view_type_b4ximageview /*int*/ ,__ref._view_type_gifview /*int*/ ,__ref._view_type_zoomimageview /*int*/ ,__ref._view_type_videoplayer /*int*/ ,__ref._view_type_webview /*int*/ )) {
case 0: {
this.state = 8;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 20;
if (true) break;
}
case 3: {
this.state = 22;
if (true) break;
}
case 4: {
this.state = 24;
if (true) break;
}
}
if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=12845076;
 //BA.debugLineNum = 12845076;BA.debugLine="Dim x As B4XImageView = sm.CustomView";
_x = (b4a.example.b4ximageview)(_sm.CustomView /*Object*/ );
RDebugUtils.currentLine=12845077;
 //BA.debugLineNum = 12845077;BA.debugLine="x.RoundedImage = Request.Extra.GetDefault(mMana";
_x._setroundedimage /*boolean*/ (null,BA.ObjectToBoolean(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._mmanager /*b4a.example.simplemediamanager*/ ._request_roundimage /*String*/ ),(Object)(parent.__c.False))));
RDebugUtils.currentLine=12845078;
 //BA.debugLineNum = 12845078;BA.debugLine="x.ResizeMode = Request.Extra.GetDefault(mManage";
_x._setresizemode /*String*/ (null,BA.ObjectToString(_request.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(__ref._mmanager /*b4a.example.simplemediamanager*/ ._request_resize_mode /*String*/ ),(Object)(__ref._mmanager /*b4a.example.simplemediamanager*/ ._defaultresizemode /*String*/ ))));
RDebugUtils.currentLine=12845079;
 //BA.debugLineNum = 12845079;BA.debugLine="x.Bitmap = MediaToBitmap(MEDIA)";
_x._setbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,__ref._mediatobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (null,_media));
RDebugUtils.currentLine=12845081;
 //BA.debugLineNum = 12845081;BA.debugLine="If mManager.IsWebPAnimated (MEDIA) Then";
if (true) break;

case 9:
//if
this.state = 16;
if (__ref._mmanager /*b4a.example.simplemediamanager*/ ._iswebpanimated /*boolean*/ (null,_media)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=12845082;
 //BA.debugLineNum = 12845082;BA.debugLine="Dim decoder As JavaObject";
_decoder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12845083;
 //BA.debugLineNum = 12845083;BA.debugLine="Dim Drawable As JavaObject = decoder.Initializ";
_drawable = new anywheresoftware.b4j.object.JavaObject();
_drawable = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_decoder.InitializeStatic("android.graphics.ImageDecoder").RunMethod("decodeDrawable",new Object[]{_media.Media /*Object*/ })));
RDebugUtils.currentLine=12845084;
 //BA.debugLineNum = 12845084;BA.debugLine="x.mBase.GetView(0).As(View).Background = Drawa";
((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_x._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).getObject()))).setBackground((android.graphics.drawable.Drawable)(_drawable.getObject()));
RDebugUtils.currentLine=12845085;
 //BA.debugLineNum = 12845085;BA.debugLine="If GetType(Drawable) = \"android.graphics.drawa";
if (true) break;

case 12:
//if
this.state = 15;
if ((parent.__c.GetType((Object)(_drawable.getObject()))).equals("android.graphics.drawable.AnimatedImageDrawable")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=12845086;
 //BA.debugLineNum = 12845086;BA.debugLine="Drawable.RunMethod(\"start\", Null)";
_drawable.RunMethod("start",(Object[])(parent.__c.Null));
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 25;
;
 if (true) break;

case 18:
//C
this.state = 25;
 if (true) break;

case 20:
//C
this.state = 25;
 if (true) break;

case 22:
//C
this.state = 25;
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=12845124;
 //BA.debugLineNum = 12845124;BA.debugLine="ParentResized(Target)";
__ref._parentresized /*String*/ (null,_target);
RDebugUtils.currentLine=12845125;
 //BA.debugLineNum = 12845125;BA.debugLine="sm.CustomView.As(WebView).LoadUrl(MEDIA.Media)";
((anywheresoftware.b4a.objects.WebViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.WebViewWrapper(), (android.webkit.WebView)(_sm.CustomView /*Object*/ ))).LoadUrl(BA.ObjectToString(_media.Media /*Object*/ ));
 if (true) break;
;
RDebugUtils.currentLine=12845127;
 //BA.debugLineNum = 12845127;BA.debugLine="If RequestSet.Callback <> Null And RequestSet.Req";

case 25:
//if
this.state = 32;
if (_requestset.Callback /*Object*/ != null && _requestset.RequestState /*int*/ !=__ref._mmanager /*b4a.example.simplemediamanager*/ ._state_loading /*int*/ ) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=12845128;
 //BA.debugLineNum = 12845128;BA.debugLine="Dim params() As Object = Array(RequestSet.Reques";
_params = new Object[]{(Object)(_requestset.RequestState /*int*/ ==__ref._mmanager /*b4a.example.simplemediamanager*/ ._state_ready /*int*/ ),(Object)(_media)};
RDebugUtils.currentLine=12845129;
 //BA.debugLineNum = 12845129;BA.debugLine="If FadeAnimation > 0 Then";
if (true) break;

case 28:
//if
this.state = 31;
if (_fadeanimation>0) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=12845130;
 //BA.debugLineNum = 12845130;BA.debugLine="Sleep(FadeAnimation + 10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "smmviews", "addmedia"),(int) (_fadeanimation+10));
this.state = 33;
return;
case 33:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=12845136;
 //BA.debugLineNum = 12845136;BA.debugLine="RequestSet.Callback.As(JavaObject).RunMethodJO(\"";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_requestset.Callback /*Object*/ ))).RunMethodJO("getBA",(Object[])(parent.__c.Null)).RunMethod("raiseEventFromUI",new Object[]{(Object)(_target.getObject()),(Object)("smm_mediaready"),(Object)(_params)});
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=12845140;
 //BA.debugLineNum = 12845140;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _parentresized(b4a.example.smmviews __ref,anywheresoftware.b4a.objects.B4XViewWrapper _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "parentresized", true))
	 {return ((String) Debug.delegate(ba, "parentresized", new Object[] {_target}));}
b4a.example.smmviews._smmview _sm = null;
b4a.example.b4ximageview _x = null;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub ParentResized (Target As B4XView)";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="If TargetToSMMViews.ContainsKey(Target) Then";
if (__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_target.getObject()))) { 
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Dim sm As SMMView = TargetToSMMViews.Get(Target)";
_sm = (b4a.example.smmviews._smmview)(__ref._targettosmmviews /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_target.getObject())));
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="sm.mBase.SetLayoutAnimated(0, 0, 0, Target.Width";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),_target.getWidth(),_target.getHeight());
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="Select sm.ViewType";
switch (BA.switchObjectToInt(_sm.ViewType /*int*/ ,__ref._view_type_b4ximageview /*int*/ ,__ref._view_type_videoplayer /*int*/ ,__ref._view_type_webview /*int*/ ,__ref._view_type_zoomimageview /*int*/ )) {
case 0: {
RDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="Dim x As B4XImageView = sm.CustomView";
_x = (b4a.example.b4ximageview)(_sm.CustomView /*Object*/ );
RDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="x.Update";
_x._update /*String*/ (null);
 break; }
case 1: {
 break; }
case 2: {
RDebugUtils.currentLine=13303831;
 //BA.debugLineNum = 13303831;BA.debugLine="sm.CustomView.As(B4XView).SetLayoutAnimated(0,";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sm.CustomView /*Object*/ ))).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_target.getWidth(),_target.getHeight());
 break; }
case 3: {
 break; }
}
;
 };
RDebugUtils.currentLine=13303840;
 //BA.debugLineNum = 13303840;BA.debugLine="End Sub";
return "";
}
public int  _mediatypetoviewtype(b4a.example.smmviews __ref,int _mediatype,b4a.example.simplemediamanager._smmediarequest _request) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "mediatypetoviewtype", true))
	 {return ((Integer) Debug.delegate(ba, "mediatypetoviewtype", new Object[] {_mediatype,_request}));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Private Sub MediaTypeToViewType(MediaType As Int,";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Select MediaType";
switch (BA.switchObjectToInt(_mediatype,__ref._media_type_image /*int*/ ,__ref._media_type_webp /*int*/ ,__ref._media_type_gif /*int*/ ,__ref._media_type_video /*int*/ ,__ref._media_type_none /*int*/ ,__ref._media_type_html /*int*/ )) {
case 0: 
case 1: {
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="Return VIEW_TYPE_B4XIMAGEVIEW";
if (true) return __ref._view_type_b4ximageview /*int*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="Return VIEW_TYPE_GIFVIEW";
if (true) return __ref._view_type_gifview /*int*/ ;
 break; }
case 3: {
RDebugUtils.currentLine=13041676;
 //BA.debugLineNum = 13041676;BA.debugLine="Return VIEW_TYPE_VIDEOPLAYER";
if (true) return __ref._view_type_videoplayer /*int*/ ;
 break; }
case 4: {
RDebugUtils.currentLine=13041678;
 //BA.debugLineNum = 13041678;BA.debugLine="Return VIEW_TYPE_NONE";
if (true) return __ref._view_type_none /*int*/ ;
 break; }
case 5: {
RDebugUtils.currentLine=13041680;
 //BA.debugLineNum = 13041680;BA.debugLine="Return VIEW_TYPE_WEBVIEW";
if (true) return __ref._view_type_webview /*int*/ ;
 break; }
default: {
RDebugUtils.currentLine=13041682;
 //BA.debugLineNum = 13041682;BA.debugLine="Log(\"Unexpected media type: \" & MediaType)";
__c.LogImpl("913041682","Unexpected media type: "+BA.NumberToString(_mediatype),0);
RDebugUtils.currentLine=13041683;
 //BA.debugLineNum = 13041683;BA.debugLine="Return VIEW_TYPE_NONE";
if (true) return __ref._view_type_none /*int*/ ;
 break; }
}
;
RDebugUtils.currentLine=13041685;
 //BA.debugLineNum = 13041685;BA.debugLine="End Sub";
return 0;
}
public b4a.example.smmviews._smmview  _getview(b4a.example.smmviews __ref,int _viewtype,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "getview", true))
	 {return ((b4a.example.smmviews._smmview) Debug.delegate(ba, "getview", new Object[] {_viewtype,_key}));}
b4a.example.smmviews._smmview _sview = null;
anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
Object _customview = null;
b4a.example.b4ximageview _x = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.WebViewWrapper _wv = null;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Private Sub GetView (ViewType As Int, Key As Strin";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="For Each sview As SMMView In UnusedViews.AsList";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._unusedviews /*b4a.example.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_sview = (b4a.example.smmviews._smmview)(group1.Get(index1));
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="If sview.ViewType = ViewType Then";
if (_sview.ViewType /*int*/ ==_viewtype) { 
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="UnusedViews.Remove(sview)";
__ref._unusedviews /*b4a.example.b4xset*/ ._remove /*String*/ (null,(Object)(_sview));
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="Return CreateSMMView(sview.CustomView, sview.mB";
if (true) return __ref._createsmmview /*b4a.example.smmviews._smmview*/ (null,_sview.CustomView /*Object*/ ,_sview.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_sview.ViewType /*int*/ ,_key);
 };
 }
};
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="Dim mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="Dim CustomView As Object";
_customview = new Object();
RDebugUtils.currentLine=13172751;
 //BA.debugLineNum = 13172751;BA.debugLine="Select ViewType";
switch (BA.switchObjectToInt(_viewtype,__ref._view_type_b4ximageview /*int*/ ,__ref._view_type_none /*int*/ ,__ref._view_type_gifview /*int*/ ,__ref._view_type_zoomimageview /*int*/ ,__ref._view_type_videoplayer /*int*/ ,__ref._view_type_webview /*int*/ )) {
case 0: {
RDebugUtils.currentLine=13172753;
 //BA.debugLineNum = 13172753;BA.debugLine="Dim x As B4XImageView = XUIViewsUtils.CreateB4X";
_x = _xuiviewsutils._createb4ximageview /*b4a.example.b4ximageview*/ (ba);
RDebugUtils.currentLine=13172754;
 //BA.debugLineNum = 13172754;BA.debugLine="x.mBackgroundColor = xui.Color_Transparent";
_x._mbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=13172755;
 //BA.debugLineNum = 13172755;BA.debugLine="CustomView = x";
_customview = (Object)(_x);
RDebugUtils.currentLine=13172756;
 //BA.debugLineNum = 13172756;BA.debugLine="mBase = x.mBase";
_mbase = _x._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
 break; }
case 1: {
RDebugUtils.currentLine=13172758;
 //BA.debugLineNum = 13172758;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=13172759;
 //BA.debugLineNum = 13172759;BA.debugLine="CustomView = p";
_customview = (Object)(_p.getObject());
RDebugUtils.currentLine=13172760;
 //BA.debugLineNum = 13172760;BA.debugLine="mBase = p";
_mbase = _p;
 break; }
case 2: {
RDebugUtils.currentLine=13172762;
 //BA.debugLineNum = 13172762;BA.debugLine="Panel.LoadLayout(\"SMMGifView\")";
__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SMMGifView",ba);
RDebugUtils.currentLine=13172763;
 //BA.debugLineNum = 13172763;BA.debugLine="CustomView = Panel.GetView(0).Tag";
_customview = __ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).getTag();
RDebugUtils.currentLine=13172764;
 //BA.debugLineNum = 13172764;BA.debugLine="mBase = Panel.GetView(0)";
_mbase = __ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=13172765;
 //BA.debugLineNum = 13172765;BA.debugLine="mBase.RemoveViewFromParent";
_mbase.RemoveViewFromParent();
 break; }
case 3: {
RDebugUtils.currentLine=13172767;
 //BA.debugLineNum = 13172767;BA.debugLine="Panel.LoadLayout(\"SMMZoomImageView\")";
__ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("SMMZoomImageView",ba);
RDebugUtils.currentLine=13172768;
 //BA.debugLineNum = 13172768;BA.debugLine="CustomView = Panel.GetView(0).Tag";
_customview = __ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).getTag();
RDebugUtils.currentLine=13172769;
 //BA.debugLineNum = 13172769;BA.debugLine="mBase = Panel.GetView(0)";
_mbase = __ref._panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=13172770;
 //BA.debugLineNum = 13172770;BA.debugLine="mBase.RemoveViewFromParent";
_mbase.RemoveViewFromParent();
 break; }
case 4: {
 break; }
case 5: {
RDebugUtils.currentLine=13172793;
 //BA.debugLineNum = 13172793;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=13172794;
 //BA.debugLineNum = 13172794;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (100)));
RDebugUtils.currentLine=13172795;
 //BA.debugLineNum = 13172795;BA.debugLine="Dim wv As WebView";
_wv = new anywheresoftware.b4a.objects.WebViewWrapper();
RDebugUtils.currentLine=13172796;
 //BA.debugLineNum = 13172796;BA.debugLine="wv.Initialize(\"\")";
_wv.Initialize(ba,"");
RDebugUtils.currentLine=13172797;
 //BA.debugLineNum = 13172797;BA.debugLine="p.AddView(wv, 0, 0, p.Width,p.Height)";
_p.AddView((android.view.View)(_wv.getObject()),(int) (0),(int) (0),_p.getWidth(),_p.getHeight());
RDebugUtils.currentLine=13172798;
 //BA.debugLineNum = 13172798;BA.debugLine="CustomView = wv";
_customview = (Object)(_wv.getObject());
RDebugUtils.currentLine=13172799;
 //BA.debugLineNum = 13172799;BA.debugLine="mBase = p";
_mbase = _p;
 break; }
}
;
RDebugUtils.currentLine=13172801;
 //BA.debugLineNum = 13172801;BA.debugLine="Return CreateSMMView(CustomView, mBase, ViewType,";
if (true) return __ref._createsmmview /*b4a.example.smmviews._smmview*/ (null,_customview,_mbase,_viewtype,_key);
RDebugUtils.currentLine=13172802;
 //BA.debugLineNum = 13172802;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _mediatobitmap(b4a.example.smmviews __ref,b4a.example.simplemediamanager._smmedia _media) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "mediatobitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "mediatobitmap", new Object[] {_media}));}
anywheresoftware.b4j.object.JavaObject _decoder = null;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Private Sub MediaToBitmap(MEDIA As SMMedia) As B4X";
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="If mManager.IsWebPAnimated(MEDIA) Then";
if (__ref._mmanager /*b4a.example.simplemediamanager*/ ._iswebpanimated /*boolean*/ (null,_media)) { 
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="Dim decoder As JavaObject";
_decoder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="Return decoder.InitializeStatic(\"android.graphic";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_decoder.InitializeStatic("android.graphics.ImageDecoder").RunMethod("decodeBitmap",new Object[]{_media.Media /*Object*/ })));
 };
RDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="Return MEDIA.Media";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_media.Media /*Object*/ ));
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="End Sub";
return null;
}
public String  _returnviewtocache(b4a.example.smmviews __ref,b4a.example.smmviews._smmview _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "returnviewtocache", true))
	 {return ((String) Debug.delegate(ba, "returnviewtocache", new Object[] {_sm}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Private Sub ReturnViewToCache (sm As SMMView)";
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="sm.mBase.RemoveViewFromParent";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="Select sm.ViewType";
switch (BA.switchObjectToInt(_sm.ViewType /*int*/ ,__ref._view_type_b4ximageview /*int*/ ,__ref._view_type_gifview /*int*/ ,__ref._view_type_videoplayer /*int*/ ,__ref._view_type_webview /*int*/ ,__ref._view_type_zoomimageview /*int*/ )) {
case 0: {
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="sm.CustomView.As(B4XImageView).Clear";
((b4a.example.b4ximageview)(_sm.CustomView /*Object*/ ))._clear /*String*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=13107209;
 //BA.debugLineNum = 13107209;BA.debugLine="sm.mBase.GetView(0).SetBitmap(Null)";
_sm.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetBitmap((android.graphics.Bitmap)(__c.Null));
 break; }
case 2: {
 break; }
case 3: {
RDebugUtils.currentLine=13107229;
 //BA.debugLineNum = 13107229;BA.debugLine="sm.CustomView.As(JavaObject).RunMethod(\"stopLoa";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_sm.CustomView /*Object*/ ))).RunMethod("stopLoading",(Object[])(__c.Null));
RDebugUtils.currentLine=13107231;
 //BA.debugLineNum = 13107231;BA.debugLine="sm.CustomView.As(WebView).LoadHtml(\"\")";
((anywheresoftware.b4a.objects.WebViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.WebViewWrapper(), (android.webkit.WebView)(_sm.CustomView /*Object*/ ))).LoadHtml("");
 break; }
case 4: {
 break; }
}
;
RDebugUtils.currentLine=13107237;
 //BA.debugLineNum = 13107237;BA.debugLine="UnusedViews.Add(sm)";
__ref._unusedviews /*b4a.example.b4xset*/ ._add /*String*/ (null,(Object)(_sm));
RDebugUtils.currentLine=13107238;
 //BA.debugLineNum = 13107238;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.smmviews __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Type SMMView (CustomView As Object, mBase As B4XV";
;
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="Private TargetToSMMViews As Map";
_targettosmmviews = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="Private Const VIEW_TYPE_B4XIMAGEVIEW = 1, VIEW_TY";
_view_type_b4ximageview = (int) (1);
_view_type_gifview = (int) (2);
_view_type_videoplayer = (int) (3);
_view_type_none = (int) (4);
_view_type_webview = (int) (5);
_view_type_zoomimageview = (int) (6);
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="Public Const MEDIA_TYPE_IMAGE = 1, MEDIA_TYPE_GIF";
_media_type_image = (int) (1);
_media_type_gif = (int) (2);
_media_type_video = (int) (3);
_media_type_none = (int) (4);
_media_type_webp = (int) (5);
_media_type_html = (int) (6);
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="Private UnusedViews As B4XSet";
_unusedviews = new b4a.example.b4xset();
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="Private Panel As B4XView";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12648459;
 //BA.debugLineNum = 12648459;BA.debugLine="Private Const GIF_SUPPORTED As Boolean = False";
_gif_supported = __c.False;
RDebugUtils.currentLine=12648469;
 //BA.debugLineNum = 12648469;BA.debugLine="Private Const VIDEO_SUPPORTED As Boolean = False";
_video_supported = __c.False;
RDebugUtils.currentLine=12648474;
 //BA.debugLineNum = 12648474;BA.debugLine="Private Const WEBP_SUPPORTED As Boolean = False";
_webp_supported = __c.False;
RDebugUtils.currentLine=12648476;
 //BA.debugLineNum = 12648476;BA.debugLine="Private mManager As SimpleMediaManager";
_mmanager = new b4a.example.simplemediamanager();
RDebugUtils.currentLine=12648477;
 //BA.debugLineNum = 12648477;BA.debugLine="End Sub";
return "";
}
public b4a.example.smmviews._smmview  _createsmmview(b4a.example.smmviews __ref,Object _customview,anywheresoftware.b4a.objects.B4XViewWrapper _mbase,int _viewtype,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "createsmmview", true))
	 {return ((b4a.example.smmviews._smmview) Debug.delegate(ba, "createsmmview", new Object[] {_customview,_mbase,_viewtype,_key}));}
b4a.example.smmviews._smmview _t1 = null;
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Private Sub CreateSMMView (CustomView As Object, m";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim t1 As SMMView";
_t1 = new b4a.example.smmviews._smmview();
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="t1.CustomView = CustomView";
_t1.CustomView /*Object*/  = _customview;
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="t1.mBase = mBase";
_t1.mBase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _mbase;
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="t1.ViewType = ViewType";
_t1.ViewType /*int*/  = _viewtype;
RDebugUtils.currentLine=13369350;
 //BA.debugLineNum = 13369350;BA.debugLine="t1.Key = Key";
_t1.Key /*String*/  = _key;
RDebugUtils.currentLine=13369351;
 //BA.debugLineNum = 13369351;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="End Sub";
return null;
}
public String  _typetostring(b4a.example.smmviews __ref,int _viewtype) throws Exception{
__ref = this;
RDebugUtils.currentModule="smmviews";
if (Debug.shouldDelegate(ba, "typetostring", true))
	 {return ((String) Debug.delegate(ba, "typetostring", new Object[] {_viewtype}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Private Sub TypeToString (ViewType As Int) As Stri";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Select ViewType";
switch (BA.switchObjectToInt(_viewtype,__ref._view_type_b4ximageview /*int*/ ,__ref._view_type_gifview /*int*/ ,__ref._view_type_none /*int*/ ,__ref._view_type_videoplayer /*int*/ ,__ref._view_type_webview /*int*/ ,__ref._view_type_zoomimageview /*int*/ )) {
case 0: {
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="Return \"B4XImageView\"";
if (true) return "B4XImageView";
 break; }
case 1: {
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="Return \"B4XGifView\"";
if (true) return "B4XGifView";
 break; }
case 2: {
RDebugUtils.currentLine=13238279;
 //BA.debugLineNum = 13238279;BA.debugLine="Return \"Panel\"";
if (true) return "Panel";
 break; }
case 3: {
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="Return \"video player\"";
if (true) return "video player";
 break; }
case 4: {
RDebugUtils.currentLine=13238283;
 //BA.debugLineNum = 13238283;BA.debugLine="Return \"WebView\"";
if (true) return "WebView";
 break; }
case 5: {
RDebugUtils.currentLine=13238285;
 //BA.debugLineNum = 13238285;BA.debugLine="Return \"ZoomImageView\"";
if (true) return "ZoomImageView";
 break; }
}
;
RDebugUtils.currentLine=13238287;
 //BA.debugLineNum = 13238287;BA.debugLine="End Sub";
return "";
}
}