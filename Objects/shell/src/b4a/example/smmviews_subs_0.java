package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class smmviews_subs_0 {


public static void  _addmedia(RemoteObject __ref,RemoteObject _requestset,RemoteObject _media,RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("AddMedia (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("addmedia")) { __ref.runUserSub(false, "smmviews","addmedia", __ref, _requestset, _media, _request); return;}
ResumableSub_AddMedia rsub = new ResumableSub_AddMedia(null,__ref,_requestset,_media,_request);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AddMedia extends BA.ResumableSub {
public ResumableSub_AddMedia(b4a.example.smmviews parent,RemoteObject __ref,RemoteObject _requestset,RemoteObject _media,RemoteObject _request) {
this.parent = parent;
this.__ref = __ref;
this._requestset = _requestset;
this._media = _media;
this._request = _request;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.smmviews parent;
RemoteObject _requestset;
RemoteObject _media;
RemoteObject _request;
RemoteObject _target = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _viewtype = RemoteObject.createImmutable(0);
RemoteObject _sm = RemoteObject.declareNull("b4a.example.smmviews._smmview");
RemoteObject _fadeanimation = RemoteObject.createImmutable(0);
RemoteObject _x = RemoteObject.declareNull("b4a.example.b4ximageview");
RemoteObject _decoder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _drawable = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _params = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AddMedia (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,47);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("RequestSet", _requestset);
Debug.locals.put("MEDIA", _media);
Debug.locals.put("Request", _request);
 BA.debugLineNum = 51;BA.debugLine="Dim Target As B4XView = RequestSet.Target";
Debug.JustUpdateDeviceLine();
_target = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_target = _requestset.getField(false,"Target" /*RemoteObject*/ );Debug.locals.put("Target", _target);Debug.locals.put("Target", _target);
 BA.debugLineNum = 52;BA.debugLine="CancelRequest(Target)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.smmviews.class, "_cancelrequest" /*RemoteObject*/ ,(Object)(_target));
 BA.debugLineNum = 53;BA.debugLine="Dim ViewType As Int = MediaTypeToViewType(MEDIA.M";
Debug.JustUpdateDeviceLine();
_viewtype = __ref.runClassMethod (b4a.example.smmviews.class, "_mediatypetoviewtype" /*RemoteObject*/ ,(Object)(_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"MediaType" /*RemoteObject*/ )),(Object)(_request));Debug.locals.put("ViewType", _viewtype);Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 54;BA.debugLine="Dim sm As SMMView = GetView(ViewType, MEDIA.Meta.";
Debug.JustUpdateDeviceLine();
_sm = __ref.runClassMethod (b4a.example.smmviews.class, "_getview" /*RemoteObject*/ ,(Object)(_viewtype),(Object)(_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ )));Debug.locals.put("sm", _sm);Debug.locals.put("sm", _sm);
 BA.debugLineNum = 55;BA.debugLine="Target.Color = Request.Extra.GetDefault(mManager.";
Debug.JustUpdateDeviceLine();
_target.runMethod(true,"setColor",BA.numberCast(int.class, _request.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((__ref.getField(false,"_mmanager" /*RemoteObject*/ ).getField(true,"_request_background" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_mmanager" /*RemoteObject*/ ).getField(true,"_defaultbackgroundcolor" /*RemoteObject*/ ))))));
 BA.debugLineNum = 56;BA.debugLine="TargetToSMMViews.Put(Target, sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_targettosmmviews" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_target.getObject())),(Object)((_sm)));
 BA.debugLineNum = 57;BA.debugLine="Target.AddView(sm.mBase, 0, 0, Target.Width, Targ";
Debug.JustUpdateDeviceLine();
_target.runVoidMethod ("AddView",(Object)((_sm.getField(false,"mBase" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_target.runMethod(true,"getWidth")),(Object)(_target.runMethod(true,"getHeight")));
 BA.debugLineNum = 58;BA.debugLine="Dim FadeAnimation As Int = Request.Extra.GetDefau";
Debug.JustUpdateDeviceLine();
_fadeanimation = BA.numberCast(int.class, _request.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((__ref.getField(false,"_mmanager" /*RemoteObject*/ ).getField(true,"_request_fade_animation_duration" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_mmanager" /*RemoteObject*/ ).getField(true,"_defaultfadeanimationduration" /*RemoteObject*/ )))));Debug.locals.put("FadeAnimation", _fadeanimation);Debug.locals.put("FadeAnimation", _fadeanimation);
 BA.debugLineNum = 59;BA.debugLine="If FadeAnimation > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_fadeanimation,BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 60;BA.debugLine="sm.mBase.Visible = False";
Debug.JustUpdateDeviceLine();
_sm.getField(false,"mBase" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 61;BA.debugLine="sm.mBase.SetVisibleAnimated(FadeAnimation, True)";
Debug.JustUpdateDeviceLine();
_sm.getField(false,"mBase" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(_fadeanimation),(Object)(parent.__c.getField(true,"True")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 63;BA.debugLine="sm.mBase.Visible = True";
Debug.JustUpdateDeviceLine();
_sm.getField(false,"mBase" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 65;BA.debugLine="Select ViewType";
Debug.JustUpdateDeviceLine();

case 6:
//select
this.state = 25;
switch (BA.switchObjectToInt(_viewtype,__ref.getField(true,"_view_type_b4ximageview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_gifview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_zoomimageview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_videoplayer" /*RemoteObject*/ ),__ref.getField(true,"_view_type_webview" /*RemoteObject*/ ))) {
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
 BA.debugLineNum = 67;BA.debugLine="Dim x As B4XImageView = sm.CustomView";
Debug.JustUpdateDeviceLine();
_x = (_sm.getField(false,"CustomView" /*RemoteObject*/ ));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 68;BA.debugLine="x.RoundedImage = Request.Extra.GetDefault(mMana";
Debug.JustUpdateDeviceLine();
_x.runClassMethod (b4a.example.b4ximageview.class, "_setroundedimage" /*RemoteObject*/ ,BA.ObjectToBoolean(_request.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((__ref.getField(false,"_mmanager" /*RemoteObject*/ ).getField(true,"_request_roundimage" /*RemoteObject*/ ))),(Object)((parent.__c.getField(true,"False"))))));
 BA.debugLineNum = 69;BA.debugLine="x.ResizeMode = Request.Extra.GetDefault(mManage";
Debug.JustUpdateDeviceLine();
_x.runClassMethod (b4a.example.b4ximageview.class, "_setresizemode" /*RemoteObject*/ ,BA.ObjectToString(_request.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((__ref.getField(false,"_mmanager" /*RemoteObject*/ ).getField(true,"_request_resize_mode" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_mmanager" /*RemoteObject*/ ).getField(true,"_defaultresizemode" /*RemoteObject*/ ))))));
 BA.debugLineNum = 70;BA.debugLine="x.Bitmap = MediaToBitmap(MEDIA)";
Debug.JustUpdateDeviceLine();
_x.runClassMethod (b4a.example.b4ximageview.class, "_setbitmap" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.smmviews.class, "_mediatobitmap" /*RemoteObject*/ ,(Object)(_media)));
 BA.debugLineNum = 72;BA.debugLine="If mManager.IsWebPAnimated (MEDIA) Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//if
this.state = 16;
if (__ref.getField(false,"_mmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.simplemediamanager.class, "_iswebpanimated" /*RemoteObject*/ ,(Object)(_media)).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 73;BA.debugLine="Dim decoder As JavaObject";
Debug.JustUpdateDeviceLine();
_decoder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("decoder", _decoder);
 BA.debugLineNum = 74;BA.debugLine="Dim Drawable As JavaObject = decoder.Initializ";
Debug.JustUpdateDeviceLine();
_drawable = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_drawable = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _decoder.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.graphics.ImageDecoder"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("decodeDrawable")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_media.getField(false,"Media" /*RemoteObject*/ )}))));Debug.locals.put("Drawable", _drawable);Debug.locals.put("Drawable", _drawable);
 BA.debugLineNum = 75;BA.debugLine="x.mBase.GetView(0).As(View).Background = Drawa";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _x.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject())).runMethod(false,"setBackground",(_drawable.getObject()));
 BA.debugLineNum = 76;BA.debugLine="If GetType(Drawable) = \"android.graphics.drawa";
Debug.JustUpdateDeviceLine();
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",parent.__c.runMethod(true,"GetType",(Object)((_drawable.getObject()))),BA.ObjectToString("android.graphics.drawable.AnimatedImageDrawable"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 77;BA.debugLine="Drawable.RunMethod(\"start\", Null)";
Debug.JustUpdateDeviceLine();
_drawable.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("start")),(Object)((parent.__c.getField(false,"Null"))));
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
 BA.debugLineNum = 115;BA.debugLine="ParentResized(Target)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.smmviews.class, "_parentresized" /*RemoteObject*/ ,(Object)(_target));
 BA.debugLineNum = 116;BA.debugLine="sm.CustomView.As(WebView).LoadUrl(MEDIA.Media)";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.WebViewWrapper"), _sm.getField(false,"CustomView" /*RemoteObject*/ ))).runVoidMethod ("LoadUrl",(Object)(BA.ObjectToString(_media.getField(false,"Media" /*RemoteObject*/ ))));
 if (true) break;
;
 BA.debugLineNum = 118;BA.debugLine="If RequestSet.Callback <> Null And RequestSet.Req";
Debug.JustUpdateDeviceLine();

case 25:
//if
this.state = 32;
if (RemoteObject.solveBoolean("N",_requestset.getField(false,"Callback" /*RemoteObject*/ )) && RemoteObject.solveBoolean("!",_requestset.getField(true,"RequestState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_mmanager" /*RemoteObject*/ ).getField(true,"_state_loading" /*RemoteObject*/ )))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 119;BA.debugLine="Dim params() As Object = Array(RequestSet.Reques";
Debug.JustUpdateDeviceLine();
_params = RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((RemoteObject.solveBoolean("=",_requestset.getField(true,"RequestState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_mmanager" /*RemoteObject*/ ).getField(true,"_state_ready" /*RemoteObject*/ ))))),(_media)});Debug.locals.put("params", _params);Debug.locals.put("params", _params);
 BA.debugLineNum = 120;BA.debugLine="If FadeAnimation > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 28:
//if
this.state = 31;
if (RemoteObject.solveBoolean(">",_fadeanimation,BA.numberCast(double.class, 0))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 121;BA.debugLine="Sleep(FadeAnimation + 10)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "smmviews", "addmedia"),RemoteObject.solve(new RemoteObject[] {_fadeanimation,RemoteObject.createImmutable(10)}, "+",1, 1));
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
 BA.debugLineNum = 127;BA.debugLine="RequestSet.Callback.As(JavaObject).RunMethodJO(\"";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _requestset.getField(false,"Callback" /*RemoteObject*/ ))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getBA")),(Object)((parent.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("raiseEventFromUI")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_target.getObject()),RemoteObject.createImmutable(("smm_mediaready")),(_params)})));
 if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _cancelrequest(RemoteObject __ref,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("CancelRequest (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("cancelrequest")) { return __ref.runUserSub(false, "smmviews","cancelrequest", __ref, _target);}
Debug.locals.put("Target", _target);
 BA.debugLineNum = 40;BA.debugLine="Public Sub CancelRequest (Target As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="If TargetToSMMViews.ContainsKey(Target) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_targettosmmviews" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_target.getObject()))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 42;BA.debugLine="ReturnViewToCache(TargetToSMMViews.Get(Target))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.smmviews.class, "_returnviewtocache" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_targettosmmviews" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_target.getObject()))))));
 BA.debugLineNum = 43;BA.debugLine="TargetToSMMViews.Remove(Target)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_targettosmmviews" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_target.getObject())));
 };
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Type SMMView (CustomView As Object, mBase As B4XV";
;
 //BA.debugLineNum = 3;BA.debugLine="Private TargetToSMMViews As Map";
smmviews._targettosmmviews = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_targettosmmviews",smmviews._targettosmmviews);
 //BA.debugLineNum = 4;BA.debugLine="Private Const VIEW_TYPE_B4XIMAGEVIEW = 1, VIEW_TY";
smmviews._view_type_b4ximageview = BA.numberCast(int.class, 1);__ref.setField("_view_type_b4ximageview",smmviews._view_type_b4ximageview);
smmviews._view_type_gifview = BA.numberCast(int.class, 2);__ref.setField("_view_type_gifview",smmviews._view_type_gifview);
smmviews._view_type_videoplayer = BA.numberCast(int.class, 3);__ref.setField("_view_type_videoplayer",smmviews._view_type_videoplayer);
smmviews._view_type_none = BA.numberCast(int.class, 4);__ref.setField("_view_type_none",smmviews._view_type_none);
smmviews._view_type_webview = BA.numberCast(int.class, 5);__ref.setField("_view_type_webview",smmviews._view_type_webview);
smmviews._view_type_zoomimageview = BA.numberCast(int.class, 6);__ref.setField("_view_type_zoomimageview",smmviews._view_type_zoomimageview);
 //BA.debugLineNum = 5;BA.debugLine="Public Const MEDIA_TYPE_IMAGE = 1, MEDIA_TYPE_GIF";
smmviews._media_type_image = BA.numberCast(int.class, 1);__ref.setField("_media_type_image",smmviews._media_type_image);
smmviews._media_type_gif = BA.numberCast(int.class, 2);__ref.setField("_media_type_gif",smmviews._media_type_gif);
smmviews._media_type_video = BA.numberCast(int.class, 3);__ref.setField("_media_type_video",smmviews._media_type_video);
smmviews._media_type_none = BA.numberCast(int.class, 4);__ref.setField("_media_type_none",smmviews._media_type_none);
smmviews._media_type_webp = BA.numberCast(int.class, 5);__ref.setField("_media_type_webp",smmviews._media_type_webp);
smmviews._media_type_html = BA.numberCast(int.class, 6);__ref.setField("_media_type_html",smmviews._media_type_html);
 //BA.debugLineNum = 6;BA.debugLine="Private UnusedViews As B4XSet";
smmviews._unusedviews = RemoteObject.createNew ("b4a.example.b4xset");__ref.setField("_unusedviews",smmviews._unusedviews);
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI";
smmviews._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",smmviews._xui);
 //BA.debugLineNum = 8;BA.debugLine="Private Panel As B4XView";
smmviews._panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_panel",smmviews._panel);
 //BA.debugLineNum = 12;BA.debugLine="Private Const GIF_SUPPORTED As Boolean = False";
smmviews._gif_supported = smmviews.__c.getField(true,"False");__ref.setField("_gif_supported",smmviews._gif_supported);
 //BA.debugLineNum = 22;BA.debugLine="Private Const VIDEO_SUPPORTED As Boolean = False";
smmviews._video_supported = smmviews.__c.getField(true,"False");__ref.setField("_video_supported",smmviews._video_supported);
 //BA.debugLineNum = 27;BA.debugLine="Private Const WEBP_SUPPORTED As Boolean = False";
smmviews._webp_supported = smmviews.__c.getField(true,"False");__ref.setField("_webp_supported",smmviews._webp_supported);
 //BA.debugLineNum = 29;BA.debugLine="Private mManager As SimpleMediaManager";
smmviews._mmanager = RemoteObject.createNew ("b4a.example.simplemediamanager");__ref.setField("_mmanager",smmviews._mmanager);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createsmmview(RemoteObject __ref,RemoteObject _customview,RemoteObject _mbase,RemoteObject _viewtype,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("CreateSMMView (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,345);
if (RapidSub.canDelegate("createsmmview")) { return __ref.runUserSub(false, "smmviews","createsmmview", __ref, _customview, _mbase, _viewtype, _key);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.smmviews._smmview");
Debug.locals.put("CustomView", _customview);
Debug.locals.put("mBase", _mbase);
Debug.locals.put("ViewType", _viewtype);
Debug.locals.put("Key", _key);
 BA.debugLineNum = 345;BA.debugLine="Private Sub CreateSMMView (CustomView As Object, m";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 346;BA.debugLine="Dim t1 As SMMView";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.smmviews._smmview");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 347;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 348;BA.debugLine="t1.CustomView = CustomView";
Debug.JustUpdateDeviceLine();
_t1.setField ("CustomView" /*RemoteObject*/ ,_customview);
 BA.debugLineNum = 349;BA.debugLine="t1.mBase = mBase";
Debug.JustUpdateDeviceLine();
_t1.setField ("mBase" /*RemoteObject*/ ,_mbase);
 BA.debugLineNum = 350;BA.debugLine="t1.ViewType = ViewType";
Debug.JustUpdateDeviceLine();
_t1.setField ("ViewType" /*RemoteObject*/ ,_viewtype);
 BA.debugLineNum = 351;BA.debugLine="t1.Key = Key";
Debug.JustUpdateDeviceLine();
_t1.setField ("Key" /*RemoteObject*/ ,_key);
 BA.debugLineNum = 352;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 353;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getview(RemoteObject __ref,RemoteObject _viewtype,RemoteObject _key) throws Exception{
try {
		Debug.PushSubsStack("GetView (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("getview")) { return __ref.runUserSub(false, "smmviews","getview", __ref, _viewtype, _key);}
RemoteObject _sview = RemoteObject.declareNull("b4a.example.smmviews._smmview");
RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _customview = RemoteObject.declareNull("Object");
RemoteObject _x = RemoteObject.declareNull("b4a.example.b4ximageview");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _wv = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
Debug.locals.put("ViewType", _viewtype);
Debug.locals.put("Key", _key);
 BA.debugLineNum = 225;BA.debugLine="Private Sub GetView (ViewType As Int, Key As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 226;BA.debugLine="For Each sview As SMMView In UnusedViews.AsList";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_unusedviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_aslist" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_sview = (group1.runMethod(false,"Get",index1));Debug.locals.put("sview", _sview);
Debug.locals.put("sview", _sview);
 BA.debugLineNum = 227;BA.debugLine="If sview.ViewType = ViewType Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sview.getField(true,"ViewType" /*RemoteObject*/ ),BA.numberCast(double.class, _viewtype))) { 
 BA.debugLineNum = 228;BA.debugLine="UnusedViews.Remove(sview)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_unusedviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_remove" /*RemoteObject*/ ,(Object)((_sview)));
 BA.debugLineNum = 232;BA.debugLine="Return CreateSMMView(sview.CustomView, sview.mB";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.smmviews.class, "_createsmmview" /*RemoteObject*/ ,(Object)(_sview.getField(false,"CustomView" /*RemoteObject*/ )),(Object)(_sview.getField(false,"mBase" /*RemoteObject*/ )),(Object)(_sview.getField(true,"ViewType" /*RemoteObject*/ )),(Object)(_key));
 };
 }
}Debug.locals.put("sview", _sview);
;
 BA.debugLineNum = 238;BA.debugLine="Dim mBase As B4XView";
Debug.JustUpdateDeviceLine();
_mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("mBase", _mbase);
 BA.debugLineNum = 239;BA.debugLine="Dim CustomView As Object";
Debug.JustUpdateDeviceLine();
_customview = RemoteObject.createNew ("Object");Debug.locals.put("CustomView", _customview);
 BA.debugLineNum = 240;BA.debugLine="Select ViewType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_viewtype,__ref.getField(true,"_view_type_b4ximageview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_none" /*RemoteObject*/ ),__ref.getField(true,"_view_type_gifview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_zoomimageview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_videoplayer" /*RemoteObject*/ ),__ref.getField(true,"_view_type_webview" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 242;BA.debugLine="Dim x As B4XImageView = XUIViewsUtils.CreateB4X";
Debug.JustUpdateDeviceLine();
_x = smmviews._xuiviewsutils.runMethod(false,"_createb4ximageview" /*RemoteObject*/ ,__ref.getField(false, "ba"));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 243;BA.debugLine="x.mBackgroundColor = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_x.setField ("_mbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 244;BA.debugLine="CustomView = x";
Debug.JustUpdateDeviceLine();
_customview = (_x);Debug.locals.put("CustomView", _customview);
 BA.debugLineNum = 245;BA.debugLine="mBase = x.mBase";
Debug.JustUpdateDeviceLine();
_mbase = _x.getField(false,"_mbase" /*RemoteObject*/ );Debug.locals.put("mBase", _mbase);
 break; }
case 1: {
 BA.debugLineNum = 247;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 248;BA.debugLine="CustomView = p";
Debug.JustUpdateDeviceLine();
_customview = (_p.getObject());Debug.locals.put("CustomView", _customview);
 BA.debugLineNum = 249;BA.debugLine="mBase = p";
Debug.JustUpdateDeviceLine();
_mbase = _p;Debug.locals.put("mBase", _mbase);
 break; }
case 2: {
 BA.debugLineNum = 251;BA.debugLine="Panel.LoadLayout(\"SMMGifView\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_panel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("SMMGifView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 252;BA.debugLine="CustomView = Panel.GetView(0).Tag";
Debug.JustUpdateDeviceLine();
_customview = __ref.getField(false,"_panel" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag");Debug.locals.put("CustomView", _customview);
 BA.debugLineNum = 253;BA.debugLine="mBase = Panel.GetView(0)";
Debug.JustUpdateDeviceLine();
_mbase = __ref.getField(false,"_panel" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("mBase", _mbase);
 BA.debugLineNum = 254;BA.debugLine="mBase.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_mbase.runVoidMethod ("RemoveViewFromParent");
 break; }
case 3: {
 BA.debugLineNum = 256;BA.debugLine="Panel.LoadLayout(\"SMMZoomImageView\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_panel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("SMMZoomImageView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 257;BA.debugLine="CustomView = Panel.GetView(0).Tag";
Debug.JustUpdateDeviceLine();
_customview = __ref.getField(false,"_panel" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"getTag");Debug.locals.put("CustomView", _customview);
 BA.debugLineNum = 258;BA.debugLine="mBase = Panel.GetView(0)";
Debug.JustUpdateDeviceLine();
_mbase = __ref.getField(false,"_panel" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("mBase", _mbase);
 BA.debugLineNum = 259;BA.debugLine="mBase.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_mbase.runVoidMethod ("RemoveViewFromParent");
 break; }
case 4: {
 break; }
case 5: {
 BA.debugLineNum = 282;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 283;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(smmviews.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(smmviews.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 284;BA.debugLine="Dim wv As WebView";
Debug.JustUpdateDeviceLine();
_wv = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");Debug.locals.put("wv", _wv);
 BA.debugLineNum = 285;BA.debugLine="wv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_wv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 286;BA.debugLine="p.AddView(wv, 0, 0, p.Width,p.Height)";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("AddView",(Object)((_wv.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_p.runMethod(true,"getWidth")),(Object)(_p.runMethod(true,"getHeight")));
 BA.debugLineNum = 287;BA.debugLine="CustomView = wv";
Debug.JustUpdateDeviceLine();
_customview = (_wv.getObject());Debug.locals.put("CustomView", _customview);
 BA.debugLineNum = 288;BA.debugLine="mBase = p";
Debug.JustUpdateDeviceLine();
_mbase = _p;Debug.locals.put("mBase", _mbase);
 break; }
}
;
 BA.debugLineNum = 290;BA.debugLine="Return CreateSMMView(CustomView, mBase, ViewType,";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.smmviews.class, "_createsmmview" /*RemoteObject*/ ,(Object)(_customview),(Object)(_mbase),(Object)(_viewtype),(Object)(_key));
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _manager) throws Exception{
try {
		Debug.PushSubsStack("Initialize (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "smmviews","initialize", __ref, _ba, _manager);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Manager", _manager);
 BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize (Manager As SimpleMediaManag";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="mManager = Manager";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mmanager" /*RemoteObject*/ ,_manager);
 BA.debugLineNum = 34;BA.debugLine="TargetToSMMViews.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_targettosmmviews" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="UnusedViews.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_unusedviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 36;BA.debugLine="Panel = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_panel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 37;BA.debugLine="Panel.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_panel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(smmviews.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(smmviews.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mediatobitmap(RemoteObject __ref,RemoteObject _media) throws Exception{
try {
		Debug.PushSubsStack("MediaToBitmap (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("mediatobitmap")) { return __ref.runUserSub(false, "smmviews","mediatobitmap", __ref, _media);}
RemoteObject _decoder = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("MEDIA", _media);
 BA.debugLineNum = 133;BA.debugLine="Private Sub MediaToBitmap(MEDIA As SMMedia) As B4X";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="If mManager.IsWebPAnimated(MEDIA) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.simplemediamanager.class, "_iswebpanimated" /*RemoteObject*/ ,(Object)(_media)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 136;BA.debugLine="Dim decoder As JavaObject";
Debug.JustUpdateDeviceLine();
_decoder = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("decoder", _decoder);
 BA.debugLineNum = 137;BA.debugLine="Return decoder.InitializeStatic(\"android.graphic";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _decoder.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.graphics.ImageDecoder"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("decodeBitmap")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_media.getField(false,"Media" /*RemoteObject*/ )}))));
 };
 BA.debugLineNum = 140;BA.debugLine="Return MEDIA.Media";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _media.getField(false,"Media" /*RemoteObject*/ ));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mediatypetoviewtype(RemoteObject __ref,RemoteObject _mediatype,RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("MediaTypeToViewType (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("mediatypetoviewtype")) { return __ref.runUserSub(false, "smmviews","mediatypetoviewtype", __ref, _mediatype, _request);}
Debug.locals.put("MediaType", _mediatype);
Debug.locals.put("Request", _request);
 BA.debugLineNum = 162;BA.debugLine="Private Sub MediaTypeToViewType(MediaType As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 163;BA.debugLine="Select MediaType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_mediatype,__ref.getField(true,"_media_type_image" /*RemoteObject*/ ),__ref.getField(true,"_media_type_webp" /*RemoteObject*/ ),__ref.getField(true,"_media_type_gif" /*RemoteObject*/ ),__ref.getField(true,"_media_type_video" /*RemoteObject*/ ),__ref.getField(true,"_media_type_none" /*RemoteObject*/ ),__ref.getField(true,"_media_type_html" /*RemoteObject*/ ))) {
case 0: 
case 1: {
 BA.debugLineNum = 170;BA.debugLine="Return VIEW_TYPE_B4XIMAGEVIEW";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_view_type_b4ximageview" /*RemoteObject*/ );
 break; }
case 2: {
 BA.debugLineNum = 172;BA.debugLine="Return VIEW_TYPE_GIFVIEW";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_view_type_gifview" /*RemoteObject*/ );
 break; }
case 3: {
 BA.debugLineNum = 174;BA.debugLine="Return VIEW_TYPE_VIDEOPLAYER";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_view_type_videoplayer" /*RemoteObject*/ );
 break; }
case 4: {
 BA.debugLineNum = 176;BA.debugLine="Return VIEW_TYPE_NONE";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_view_type_none" /*RemoteObject*/ );
 break; }
case 5: {
 BA.debugLineNum = 178;BA.debugLine="Return VIEW_TYPE_WEBVIEW";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_view_type_webview" /*RemoteObject*/ );
 break; }
default: {
 BA.debugLineNum = 180;BA.debugLine="Log(\"Unexpected media type: \" & MediaType)";
Debug.JustUpdateDeviceLine();
smmviews.__c.runVoidMethod ("LogImpl","913041682",RemoteObject.concat(RemoteObject.createImmutable("Unexpected media type: "),_mediatype),0);
 BA.debugLineNum = 181;BA.debugLine="Return VIEW_TYPE_NONE";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_view_type_none" /*RemoteObject*/ );
 break; }
}
;
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mimetomediatype(RemoteObject __ref,RemoteObject _mime) throws Exception{
try {
		Debug.PushSubsStack("MimeToMediaType (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("mimetomediatype")) { return __ref.runUserSub(false, "smmviews","mimetomediatype", __ref, _mime);}
Debug.locals.put("Mime", _mime);
 BA.debugLineNum = 143;BA.debugLine="Public Sub MimeToMediaType (Mime As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 144;BA.debugLine="If Mime.StartsWith(\"image/gif\") Then";
Debug.JustUpdateDeviceLine();
if (_mime.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("image/gif"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 145;BA.debugLine="If GIF_SUPPORTED = False Then Log(\"*** Add a ref";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_gif_supported" /*RemoteObject*/ ),smmviews.__c.getField(true,"False"))) { 
smmviews.__c.runVoidMethod ("LogImpl","912976130",RemoteObject.createImmutable("*** Add a reference to B4XGIfView and add SMM_GIF to the build configuration ***"),0);};
 BA.debugLineNum = 146;BA.debugLine="Return IIf(GIF_SUPPORTED, MEDIA_TYPE_GIF, MEDIA_";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, ((__ref.getField(true,"_gif_supported" /*RemoteObject*/ ).<Boolean>get().booleanValue()) ? ((__ref.getField(true,"_media_type_gif" /*RemoteObject*/ ))) : ((__ref.getField(true,"_media_type_none" /*RemoteObject*/ )))));
 }else 
{ BA.debugLineNum = 147;BA.debugLine="Else If Mime.StartsWith(\"image/webp\") Then";
Debug.JustUpdateDeviceLine();
if (_mime.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("image/webp"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 148;BA.debugLine="If WEBP_SUPPORTED = False Then Log(\"*** Add a re";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_webp_supported" /*RemoteObject*/ ),smmviews.__c.getField(true,"False"))) { 
smmviews.__c.runVoidMethod ("LogImpl","912976133",RemoteObject.createImmutable("*** Add a reference to WebP library and add SMM_WEBP to the build configuration ***"),0);};
 BA.debugLineNum = 149;BA.debugLine="Return IIf(WEBP_SUPPORTED, MEDIA_TYPE_WEBP, MEDI";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, ((__ref.getField(true,"_webp_supported" /*RemoteObject*/ ).<Boolean>get().booleanValue()) ? ((__ref.getField(true,"_media_type_webp" /*RemoteObject*/ ))) : ((__ref.getField(true,"_media_type_none" /*RemoteObject*/ )))));
 }else 
{ BA.debugLineNum = 150;BA.debugLine="Else If Mime.StartsWith(\"image/\") Then";
Debug.JustUpdateDeviceLine();
if (_mime.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("image/"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 151;BA.debugLine="Return MEDIA_TYPE_IMAGE";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_media_type_image" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 152;BA.debugLine="Else if Mime.StartsWith(\"video/\") Then";
Debug.JustUpdateDeviceLine();
if (_mime.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("video/"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 153;BA.debugLine="If VIDEO_SUPPORTED = False Then Log(\"*** Add a r";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_video_supported" /*RemoteObject*/ ),smmviews.__c.getField(true,"False"))) { 
smmviews.__c.runVoidMethod ("LogImpl","912976138",RemoteObject.createImmutable("*** Add a reference to the video library and add SMM_VIDEO to the build configuration ***"),0);};
 BA.debugLineNum = 154;BA.debugLine="Return IIf(VIDEO_SUPPORTED, MEDIA_TYPE_VIDEO, ME";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, ((__ref.getField(true,"_video_supported" /*RemoteObject*/ ).<Boolean>get().booleanValue()) ? ((__ref.getField(true,"_media_type_video" /*RemoteObject*/ ))) : ((__ref.getField(true,"_media_type_none" /*RemoteObject*/ )))));
 }else 
{ BA.debugLineNum = 155;BA.debugLine="Else If Mime.StartsWith(\"text/\") Then";
Debug.JustUpdateDeviceLine();
if (_mime.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("text/"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 156;BA.debugLine="Return MEDIA_TYPE_HTML";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_media_type_html" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 158;BA.debugLine="Return MEDIA_TYPE_NONE";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_media_type_none" /*RemoteObject*/ );
 }}}}}
;
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _parentresized(RemoteObject __ref,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("ParentResized (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,311);
if (RapidSub.canDelegate("parentresized")) { return __ref.runUserSub(false, "smmviews","parentresized", __ref, _target);}
RemoteObject _sm = RemoteObject.declareNull("b4a.example.smmviews._smmview");
RemoteObject _x = RemoteObject.declareNull("b4a.example.b4ximageview");
Debug.locals.put("Target", _target);
 BA.debugLineNum = 311;BA.debugLine="Public Sub ParentResized (Target As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 312;BA.debugLine="If TargetToSMMViews.ContainsKey(Target) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_targettosmmviews" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_target.getObject()))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 313;BA.debugLine="Dim sm As SMMView = TargetToSMMViews.Get(Target)";
Debug.JustUpdateDeviceLine();
_sm = (__ref.getField(false,"_targettosmmviews" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_target.getObject()))));Debug.locals.put("sm", _sm);Debug.locals.put("sm", _sm);
 BA.debugLineNum = 314;BA.debugLine="sm.mBase.SetLayoutAnimated(0, 0, 0, Target.Width";
Debug.JustUpdateDeviceLine();
_sm.getField(false,"mBase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_target.runMethod(true,"getWidth")),(Object)(_target.runMethod(true,"getHeight")));
 BA.debugLineNum = 315;BA.debugLine="Select sm.ViewType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_sm.getField(true,"ViewType" /*RemoteObject*/ ),__ref.getField(true,"_view_type_b4ximageview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_videoplayer" /*RemoteObject*/ ),__ref.getField(true,"_view_type_webview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_zoomimageview" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 317;BA.debugLine="Dim x As B4XImageView = sm.CustomView";
Debug.JustUpdateDeviceLine();
_x = (_sm.getField(false,"CustomView" /*RemoteObject*/ ));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 318;BA.debugLine="x.Update";
Debug.JustUpdateDeviceLine();
_x.runClassMethod (b4a.example.b4ximageview.class, "_update" /*RemoteObject*/ );
 break; }
case 1: {
 break; }
case 2: {
 BA.debugLineNum = 334;BA.debugLine="sm.CustomView.As(B4XView).SetLayoutAnimated(0,";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _sm.getField(false,"CustomView" /*RemoteObject*/ ))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_target.runMethod(true,"getWidth")),(Object)(_target.runMethod(true,"getHeight")));
 break; }
case 3: {
 break; }
}
;
 };
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _returnviewtocache(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("ReturnViewToCache (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("returnviewtocache")) { return __ref.runUserSub(false, "smmviews","returnviewtocache", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 185;BA.debugLine="Private Sub ReturnViewToCache (sm As SMMView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="sm.mBase.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_sm.getField(false,"mBase" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 190;BA.debugLine="Select sm.ViewType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_sm.getField(true,"ViewType" /*RemoteObject*/ ),__ref.getField(true,"_view_type_b4ximageview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_gifview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_videoplayer" /*RemoteObject*/ ),__ref.getField(true,"_view_type_webview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_zoomimageview" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 192;BA.debugLine="sm.CustomView.As(B4XImageView).Clear";
Debug.JustUpdateDeviceLine();
((_sm.getField(false,"CustomView" /*RemoteObject*/ ))).runClassMethod (b4a.example.b4ximageview.class, "_clear" /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 194;BA.debugLine="sm.mBase.GetView(0).SetBitmap(Null)";
Debug.JustUpdateDeviceLine();
_sm.getField(false,"mBase" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetBitmap",(Object)((smmviews.__c.getField(false,"Null"))));
 break; }
case 2: {
 break; }
case 3: {
 BA.debugLineNum = 214;BA.debugLine="sm.CustomView.As(JavaObject).RunMethod(\"stopLoa";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _sm.getField(false,"CustomView" /*RemoteObject*/ ))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("stopLoading")),(Object)((smmviews.__c.getField(false,"Null"))));
 BA.debugLineNum = 216;BA.debugLine="sm.CustomView.As(WebView).LoadHtml(\"\")";
Debug.JustUpdateDeviceLine();
(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.WebViewWrapper"), _sm.getField(false,"CustomView" /*RemoteObject*/ ))).runVoidMethod ("LoadHtml",(Object)(RemoteObject.createImmutable("")));
 break; }
case 4: {
 break; }
}
;
 BA.debugLineNum = 222;BA.debugLine="UnusedViews.Add(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_unusedviews" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_sm)));
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _typetostring(RemoteObject __ref,RemoteObject _viewtype) throws Exception{
try {
		Debug.PushSubsStack("TypeToString (smmviews) ","smmviews",16,__ref.getField(false, "ba"),__ref,294);
if (RapidSub.canDelegate("typetostring")) { return __ref.runUserSub(false, "smmviews","typetostring", __ref, _viewtype);}
Debug.locals.put("ViewType", _viewtype);
 BA.debugLineNum = 294;BA.debugLine="Private Sub TypeToString (ViewType As Int) As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 295;BA.debugLine="Select ViewType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_viewtype,__ref.getField(true,"_view_type_b4ximageview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_gifview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_none" /*RemoteObject*/ ),__ref.getField(true,"_view_type_videoplayer" /*RemoteObject*/ ),__ref.getField(true,"_view_type_webview" /*RemoteObject*/ ),__ref.getField(true,"_view_type_zoomimageview" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 297;BA.debugLine="Return \"B4XImageView\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("B4XImageView");
 break; }
case 1: {
 BA.debugLineNum = 299;BA.debugLine="Return \"B4XGifView\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("B4XGifView");
 break; }
case 2: {
 BA.debugLineNum = 301;BA.debugLine="Return \"Panel\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Panel");
 break; }
case 3: {
 BA.debugLineNum = 303;BA.debugLine="Return \"video player\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("video player");
 break; }
case 4: {
 BA.debugLineNum = 305;BA.debugLine="Return \"WebView\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("WebView");
 break; }
case 5: {
 BA.debugLineNum = 307;BA.debugLine="Return \"ZoomImageView\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("ZoomImageView");
 break; }
}
;
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}