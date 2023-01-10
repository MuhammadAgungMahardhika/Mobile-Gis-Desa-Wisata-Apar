package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class simplemediamanager_subs_0 {


public static RemoteObject  _addlocalmedia(RemoteObject __ref,RemoteObject _key,RemoteObject _media,RemoteObject _mime) throws Exception{
try {
		Debug.PushSubsStack("AddLocalMedia (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("addlocalmedia")) { return __ref.runUserSub(false, "simplemediamanager","addlocalmedia", __ref, _key, _media, _mime);}
RemoteObject _meta = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediameta");
RemoteObject _smedia = RemoteObject.declareNull("b4a.example.simplemediamanager._smmedia");
Debug.locals.put("Key", _key);
Debug.locals.put("Media", _media);
Debug.locals.put("Mime", _mime);
 BA.debugLineNum = 71;BA.debugLine="Public Sub AddLocalMedia (Key As String, Media As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="Dim meta As SMMediaMeta = CreateSMMediaMeta(Mime,";
Debug.JustUpdateDeviceLine();
_meta = __ref.runClassMethod (b4a.example.simplemediamanager.class, "_createsmmediameta" /*RemoteObject*/ ,(Object)(_mime),(Object)(_key),(Object)(__ref.getField(true,"_state_ready" /*RemoteObject*/ )),(Object)(simplemediamanager.__c.getField(true,"True")));Debug.locals.put("meta", _meta);Debug.locals.put("meta", _meta);
 BA.debugLineNum = 73;BA.debugLine="Dim smedia As SMMedia = CreateSMMedia(Media, meta";
Debug.JustUpdateDeviceLine();
_smedia = __ref.runClassMethod (b4a.example.simplemediamanager.class, "_createsmmedia" /*RemoteObject*/ ,(Object)(_media),(Object)(_meta),(Object)(__ref.getField(true,"_state_ready" /*RemoteObject*/ )));Debug.locals.put("smedia", _smedia);Debug.locals.put("smedia", _smedia);
 BA.debugLineNum = 74;BA.debugLine="MetaCache.Put(meta.Key, meta)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_metacache" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_meta.getField(true,"Key" /*RemoteObject*/ ))),(Object)((_meta)));
 BA.debugLineNum = 75;BA.debugLine="MediaCache.Put(meta.Key, smedia)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_meta.getField(true,"Key" /*RemoteObject*/ ))),(Object)((_smedia)));
 BA.debugLineNum = 76;BA.debugLine="Return smedia";
Debug.JustUpdateDeviceLine();
if (true) return _smedia;
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _canceldisconnectedtargets(RemoteObject __ref,RemoteObject _media) throws Exception{
try {
		Debug.PushSubsStack("CancelDisconnectedTargets (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,466);
if (RapidSub.canDelegate("canceldisconnectedtargets")) { return __ref.runUserSub(false, "simplemediamanager","canceldisconnectedtargets", __ref, _media);}
RemoteObject _set = RemoteObject.declareNull("b4a.example.b4xset");
int _i = 0;
RemoteObject _requestset = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequestset");
Debug.locals.put("Media", _media);
 BA.debugLineNum = 466;BA.debugLine="Private Sub CancelDisconnectedTargets (Media As SM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 467;BA.debugLine="For Each set As B4XSet In Array(Media.UsedBy, Med";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_media.getField(false,"UsedBy" /*RemoteObject*/ )),(_media.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ))});
final int groupLen1 = group1.getField(true,"length").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_set = (group1.getArrayElement(false,RemoteObject.createImmutable(index1)));Debug.locals.put("set", _set);
Debug.locals.put("set", _set);
 BA.debugLineNum = 468;BA.debugLine="For i = set.Size - 1 To 0 Step - 1";
Debug.JustUpdateDeviceLine();
{
final int step2 = -1;
final int limit2 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_set.runClassMethod (b4a.example.b4xset.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 469;BA.debugLine="Dim RequestSet As SMMediaRequestSet = set.AsLis";
Debug.JustUpdateDeviceLine();
_requestset = (_set.runClassMethod (b4a.example.b4xset.class, "_aslist" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("RequestSet", _requestset);Debug.locals.put("RequestSet", _requestset);
 BA.debugLineNum = 470;BA.debugLine="If RequestSet.NumberOfAncestors > CountAncestor";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_requestset.getField(true,"NumberOfAncestors" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.runClassMethod (b4a.example.simplemediamanager.class, "_countancestors" /*RemoteObject*/ ,(Object)(_requestset.getField(false,"Target" /*RemoteObject*/ )))))) { 
 BA.debugLineNum = 474;BA.debugLine="ViewsManager.CancelRequest(RequestSet.Target)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.smmviews.class, "_cancelrequest" /*RemoteObject*/ ,(Object)(_requestset.getField(false,"Target" /*RemoteObject*/ )));
 BA.debugLineNum = 475;BA.debugLine="set.Remove(RequestSet)";
Debug.JustUpdateDeviceLine();
_set.runClassMethod (b4a.example.b4xset.class, "_remove" /*RemoteObject*/ ,(Object)((_requestset)));
 };
 }
}Debug.locals.put("i", _i);
;
 }
}Debug.locals.put("set", _set);
;
 BA.debugLineNum = 479;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cancelrequest(RemoteObject __ref,RemoteObject _requestset) throws Exception{
try {
		Debug.PushSubsStack("CancelRequest (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,392);
if (RapidSub.canDelegate("cancelrequest")) { return __ref.runUserSub(false, "simplemediamanager","cancelrequest", __ref, _requestset);}
RemoteObject _meta = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediameta");
RemoteObject _media = RemoteObject.declareNull("b4a.example.simplemediamanager._smmedia");
Debug.locals.put("RequestSet", _requestset);
 BA.debugLineNum = 392;BA.debugLine="Private Sub CancelRequest (RequestSet As SMMediaRe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 396;BA.debugLine="ViewsRequestSet.Remove(RequestSet.Target)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsrequestset" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_requestset.getField(false,"Target" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 397;BA.debugLine="ViewsManager.CancelRequest(RequestSet.Target)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.smmviews.class, "_cancelrequest" /*RemoteObject*/ ,(Object)(_requestset.getField(false,"Target" /*RemoteObject*/ )));
 BA.debugLineNum = 398;BA.debugLine="Dim meta As SMMediaMeta = MetaCache.Get(RequestSe";
Debug.JustUpdateDeviceLine();
_meta = (__ref.getField(false,"_metacache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ )))));Debug.locals.put("meta", _meta);Debug.locals.put("meta", _meta);
 BA.debugLineNum = 399;BA.debugLine="If meta <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_meta)) { 
 BA.debugLineNum = 400;BA.debugLine="meta.WaitingRequestsSets.Remove(RequestSet)";
Debug.JustUpdateDeviceLine();
_meta.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_remove" /*RemoteObject*/ ,(Object)((_requestset)));
 BA.debugLineNum = 401;BA.debugLine="Dim media As SMMedia = MediaCache.Get(RequestSet";
Debug.JustUpdateDeviceLine();
_media = (__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ )))));Debug.locals.put("media", _media);Debug.locals.put("media", _media);
 BA.debugLineNum = 402;BA.debugLine="If media <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_media)) { 
 BA.debugLineNum = 403;BA.debugLine="media.WaitingRequestsSets.Remove(RequestSet)";
Debug.JustUpdateDeviceLine();
_media.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_remove" /*RemoteObject*/ ,(Object)((_requestset)));
 BA.debugLineNum = 404;BA.debugLine="media.UsedBy.Remove(RequestSet)";
Debug.JustUpdateDeviceLine();
_media.getField(false,"UsedBy" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_remove" /*RemoteObject*/ ,(Object)((_requestset)));
 BA.debugLineNum = 405;BA.debugLine="CancelDisconnectedTargets(media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_canceldisconnectedtargets" /*RemoteObject*/ ,(Object)(_media));
 };
 };
 BA.debugLineNum = 408;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type SMMediaMeta (Mime As String, MediaType As In";
;
 //BA.debugLineNum = 4;BA.debugLine="Type SMMedia (Media As Object, Meta As SMMediaMet";
;
 //BA.debugLineNum = 5;BA.debugLine="Type SMMediaRequest (Key As String, Url As String";
;
 //BA.debugLineNum = 6;BA.debugLine="Type SMMediaRequestSet (Loading As SMMediaRequest";
;
 //BA.debugLineNum = 8;BA.debugLine="Public Const STATE_LOADING = 1, STATE_ERROR = 2,";
simplemediamanager._state_loading = BA.numberCast(int.class, 1);__ref.setField("_state_loading",simplemediamanager._state_loading);
simplemediamanager._state_error = BA.numberCast(int.class, 2);__ref.setField("_state_error",simplemediamanager._state_error);
simplemediamanager._state_ready = BA.numberCast(int.class, 3);__ref.setField("_state_ready",simplemediamanager._state_ready);
 //BA.debugLineNum = 9;BA.debugLine="Private MetaCache As Map";
simplemediamanager._metacache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_metacache",simplemediamanager._metacache);
 //BA.debugLineNum = 10;BA.debugLine="Private MediaCache As B4XOrderedMap";
simplemediamanager._mediacache = RemoteObject.createNew ("b4a.example.b4xorderedmap");__ref.setField("_mediacache",simplemediamanager._mediacache);
 //BA.debugLineNum = 11;BA.debugLine="Public MaxMediaCacheSize As Int = 40";
simplemediamanager._maxmediacachesize = BA.numberCast(int.class, 40);__ref.setField("_maxmediacachesize",simplemediamanager._maxmediacachesize);
 //BA.debugLineNum = 12;BA.debugLine="Private ViewsRequestSet As Map";
simplemediamanager._viewsrequestset = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_viewsrequestset",simplemediamanager._viewsrequestset);
 //BA.debugLineNum = 13;BA.debugLine="Private ImagesLoader As BitmapsAsync";
simplemediamanager._imagesloader = RemoteObject.createNew ("b4a.example.bitmapsasync");__ref.setField("_imagesloader",simplemediamanager._imagesloader);
 //BA.debugLineNum = 14;BA.debugLine="Private JobEmpty As HttpJob";
simplemediamanager._jobempty = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_jobempty",simplemediamanager._jobempty);
 //BA.debugLineNum = 15;BA.debugLine="Public const KEY_DEFAULT_LOADING = \"~loading\", KE";
simplemediamanager._key_default_loading = BA.ObjectToString("~loading");__ref.setField("_key_default_loading",simplemediamanager._key_default_loading);
simplemediamanager._key_default_error = BA.ObjectToString("~error");__ref.setField("_key_default_error",simplemediamanager._key_default_error);
 //BA.debugLineNum = 16;BA.debugLine="Public const MIME_UNKNOWN As String = \"~unknown\"";
simplemediamanager._mime_unknown = BA.ObjectToString("~unknown");__ref.setField("_mime_unknown",simplemediamanager._mime_unknown);
 //BA.debugLineNum = 17;BA.debugLine="Public MaxImageSize = 1000 As Int";
simplemediamanager._maximagesize = BA.numberCast(int.class, 1000);__ref.setField("_maximagesize",simplemediamanager._maximagesize);
 //BA.debugLineNum = 18;BA.debugLine="Public DefaultFadeAnimationDuration As Int = 300";
simplemediamanager._defaultfadeanimationduration = BA.numberCast(int.class, 300);__ref.setField("_defaultfadeanimationduration",simplemediamanager._defaultfadeanimationduration);
 //BA.debugLineNum = 19;BA.debugLine="Public DefaultResizeMode As String = \"FIT\"";
simplemediamanager._defaultresizemode = BA.ObjectToString("FIT");__ref.setField("_defaultresizemode",simplemediamanager._defaultresizemode);
 //BA.debugLineNum = 20;BA.debugLine="Public DefaultBackgroundColor As Int = xui.Color_";
simplemediamanager._defaultbackgroundcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White");__ref.setField("_defaultbackgroundcolor",simplemediamanager._defaultbackgroundcolor);
 //BA.debugLineNum = 21;BA.debugLine="Public DefaultForegroundColor As Int = xui.Color_";
simplemediamanager._defaultforegroundcolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black");__ref.setField("_defaultforegroundcolor",simplemediamanager._defaultforegroundcolor);
 //BA.debugLineNum = 22;BA.debugLine="Public ViewsManager As SMMViews";
simplemediamanager._viewsmanager = RemoteObject.createNew ("b4a.example.smmviews");__ref.setField("_viewsmanager",simplemediamanager._viewsmanager);
 //BA.debugLineNum = 23;BA.debugLine="Private xui As XUI";
simplemediamanager._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",simplemediamanager._xui);
 //BA.debugLineNum = 24;BA.debugLine="Public DefaultLoadingRequest, DefaultErrorRequest";
simplemediamanager._defaultloadingrequest = RemoteObject.createNew ("b4a.example.simplemediamanager._smmediarequest");__ref.setField("_defaultloadingrequest",simplemediamanager._defaultloadingrequest);
simplemediamanager._defaulterrorrequest = RemoteObject.createNew ("b4a.example.simplemediamanager._smmediarequest");__ref.setField("_defaulterrorrequest",simplemediamanager._defaulterrorrequest);
 //BA.debugLineNum = 25;BA.debugLine="Public Const REQUEST_ROUNDIMAGE = \"round_image\",";
simplemediamanager._request_roundimage = BA.ObjectToString("round_image");__ref.setField("_request_roundimage",simplemediamanager._request_roundimage);
simplemediamanager._request_background = BA.ObjectToString("background");__ref.setField("_request_background",simplemediamanager._request_background);
simplemediamanager._request_resize_mode = BA.ObjectToString("resize_mode");__ref.setField("_request_resize_mode",simplemediamanager._request_resize_mode);
simplemediamanager._request_fade_animation_duration = BA.ObjectToString("fade_animation");__ref.setField("_request_fade_animation_duration",simplemediamanager._request_fade_animation_duration);
 //BA.debugLineNum = 26;BA.debugLine="Public Const REQUEST_FOREGROUND = \"foreground\" As";
simplemediamanager._request_foreground = BA.ObjectToString("foreground");__ref.setField("_request_foreground",simplemediamanager._request_foreground);
 //BA.debugLineNum = 27;BA.debugLine="Public Const REQUEST_CALLBACK = \"callback\" As Str";
simplemediamanager._request_callback = BA.ObjectToString("callback");__ref.setField("_request_callback",simplemediamanager._request_callback);
 //BA.debugLineNum = 28;BA.debugLine="Public Const REQUEST_ZOOMIMAGEVIEW = \"zoomimagevi";
simplemediamanager._request_zoomimageview = BA.ObjectToString("zoomimageview");__ref.setField("_request_zoomimageview",simplemediamanager._request_zoomimageview);
 //BA.debugLineNum = 29;BA.debugLine="Private Const REQUEST_FILE = \"file\", REQUEST_DIR";
simplemediamanager._request_file = BA.ObjectToString("file");__ref.setField("_request_file",simplemediamanager._request_file);
simplemediamanager._request_dir = BA.ObjectToString("dir");__ref.setField("_request_dir",simplemediamanager._request_dir);
 //BA.debugLineNum = 30;BA.debugLine="Private LastTrimCache As Long";
simplemediamanager._lasttrimcache = RemoteObject.createImmutable(0L);__ref.setField("_lasttrimcache",simplemediamanager._lasttrimcache);
 //BA.debugLineNum = 31;BA.debugLine="Public MinTimeBetweenTrims As Long = 2000";
simplemediamanager._mintimebetweentrims = BA.numberCast(long.class, 2000);__ref.setField("_mintimebetweentrims",simplemediamanager._mintimebetweentrims);
 //BA.debugLineNum = 32;BA.debugLine="Public SleepDurationBeforeDownload As Long = 50";
simplemediamanager._sleepdurationbeforedownload = BA.numberCast(long.class, 50);__ref.setField("_sleepdurationbeforedownload",simplemediamanager._sleepdurationbeforedownload);
 //BA.debugLineNum = 33;BA.debugLine="Private HttpRequestsManager As RequestsManager";
simplemediamanager._httprequestsmanager = RemoteObject.createNew ("b4a.example.requestsmanager");__ref.setField("_httprequestsmanager",simplemediamanager._httprequestsmanager);
 //BA.debugLineNum = 34;BA.debugLine="Public B4ASdkVersion As Int";
simplemediamanager._b4asdkversion = RemoteObject.createImmutable(0);__ref.setField("_b4asdkversion",simplemediamanager._b4asdkversion);
 //BA.debugLineNum = 35;BA.debugLine="Public DefaultRequestTimeout As Int = 30000";
simplemediamanager._defaultrequesttimeout = BA.numberCast(int.class, 30000);__ref.setField("_defaultrequesttimeout",simplemediamanager._defaultrequesttimeout);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearmedia(RemoteObject __ref,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("ClearMedia (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,385);
if (RapidSub.canDelegate("clearmedia")) { return __ref.runUserSub(false, "simplemediamanager","clearmedia", __ref, _target);}
Debug.locals.put("Target", _target);
 BA.debugLineNum = 385;BA.debugLine="Public Sub ClearMedia(Target As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 386;BA.debugLine="If ViewsRequestSet.ContainsKey(Target) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_viewsrequestset" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_target.getObject()))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 387;BA.debugLine="CancelRequest(ViewsRequestSet.Get(Target))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_cancelrequest" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_viewsrequestset" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_target.getObject()))))));
 };
 BA.debugLineNum = 389;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clonerequest(RemoteObject __ref,RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("CloneRequest (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,523);
if (RapidSub.canDelegate("clonerequest")) { return __ref.runUserSub(false, "simplemediamanager","clonerequest", __ref, _request);}
RemoteObject _req = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequest");
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("Request", _request);
 BA.debugLineNum = 523;BA.debugLine="Public Sub CloneRequest(Request As SMMediaRequest)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 524;BA.debugLine="Dim req As SMMediaRequest = CreateSMMRequest(Requ";
Debug.JustUpdateDeviceLine();
_req = __ref.runClassMethod (b4a.example.simplemediamanager.class, "_createsmmrequest" /*RemoteObject*/ ,(Object)(_request.getField(true,"Key" /*RemoteObject*/ )),(Object)(_request.getField(true,"Url" /*RemoteObject*/ )),(Object)(_request.getField(true,"Mime" /*RemoteObject*/ )));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 525;BA.debugLine="For Each k As String In Request.Extra.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _request.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 526;BA.debugLine="req.Extra.Put(k, Request.Extra.Get(k))";
Debug.JustUpdateDeviceLine();
_req.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_k)),(Object)(_request.getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k)))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 528;BA.debugLine="Return req";
Debug.JustUpdateDeviceLine();
if (true) return _req;
 BA.debugLineNum = 529;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _countancestors(RemoteObject __ref,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("CountAncestors (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,569);
if (RapidSub.canDelegate("countancestors")) { return __ref.runUserSub(false, "simplemediamanager","countancestors", __ref, _target);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _count = RemoteObject.createImmutable(0);
Debug.locals.put("Target", _target);
 BA.debugLineNum = 569;BA.debugLine="Private Sub CountAncestors(Target As B4XView) As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 570;BA.debugLine="Dim p As B4XView = Target";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = _target;Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 571;BA.debugLine="Dim count As Int";
Debug.JustUpdateDeviceLine();
_count = RemoteObject.createImmutable(0);Debug.locals.put("count", _count);
 BA.debugLineNum = 573;BA.debugLine="Do While p.Parent Is View";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("i",_p.runMethod(false,"getParent").getObjectOrNull(), RemoteObject.createImmutable("android.view.View"))) {
 BA.debugLineNum = 577;BA.debugLine="count = count + 1";
Debug.JustUpdateDeviceLine();
_count = RemoteObject.solve(new RemoteObject[] {_count,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("count", _count);
 BA.debugLineNum = 578;BA.debugLine="p = p.Parent";
Debug.JustUpdateDeviceLine();
_p = _p.runMethod(false,"getParent");Debug.locals.put("p", _p);
 }
;
 BA.debugLineNum = 580;BA.debugLine="Return count";
Debug.JustUpdateDeviceLine();
if (true) return _count;
 BA.debugLineNum = 581;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject __ref,RemoteObject _url,RemoteObject _extra) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,499);
if (RapidSub.canDelegate("createrequest")) { return __ref.runUserSub(false, "simplemediamanager","createrequest", __ref, _url, _extra);}
Debug.locals.put("Url", _url);
Debug.locals.put("Extra", _extra);
 BA.debugLineNum = 499;BA.debugLine="Public Sub CreateRequest (Url As String, Extra As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 500;BA.debugLine="Return CreateSMMRequest2(Url, Url, MIME_UNKNOWN,";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4a.example.simplemediamanager.class, "_createsmmrequest2" /*RemoteObject*/ ,(Object)(_url),(Object)(_url),(Object)(__ref.getField(true,"_mime_unknown" /*RemoteObject*/ )),(Object)(_extra));
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsmmedia(RemoteObject __ref,RemoteObject _media,RemoteObject _meta,RemoteObject _mediastate) throws Exception{
try {
		Debug.PushSubsStack("CreateSMMedia (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,543);
if (RapidSub.canDelegate("createsmmedia")) { return __ref.runUserSub(false, "simplemediamanager","createsmmedia", __ref, _media, _meta, _mediastate);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.simplemediamanager._smmedia");
Debug.locals.put("Media", _media);
Debug.locals.put("Meta", _meta);
Debug.locals.put("MediaState", _mediastate);
 BA.debugLineNum = 543;BA.debugLine="Public Sub CreateSMMedia (Media As Object, Meta As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 544;BA.debugLine="Dim t1 As SMMedia";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.simplemediamanager._smmedia");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 545;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 546;BA.debugLine="t1.Media = Media";
Debug.JustUpdateDeviceLine();
_t1.setField ("Media" /*RemoteObject*/ ,_media);
 BA.debugLineNum = 547;BA.debugLine="t1.Meta = Meta";
Debug.JustUpdateDeviceLine();
_t1.setField ("Meta" /*RemoteObject*/ ,_meta);
 BA.debugLineNum = 548;BA.debugLine="t1.MediaState = MediaState";
Debug.JustUpdateDeviceLine();
_t1.setField ("MediaState" /*RemoteObject*/ ,_mediastate);
 BA.debugLineNum = 549;BA.debugLine="t1.WaitingRequestsSets.Initialize";
Debug.JustUpdateDeviceLine();
_t1.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 550;BA.debugLine="t1.UsedBy.Initialize";
Debug.JustUpdateDeviceLine();
_t1.getField(false,"UsedBy" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 551;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 552;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsmmediameta(RemoteObject __ref,RemoteObject _mime,RemoteObject _key,RemoteObject _metastate,RemoteObject _permanent) throws Exception{
try {
		Debug.PushSubsStack("CreateSMMediaMeta (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,531);
if (RapidSub.canDelegate("createsmmediameta")) { return __ref.runUserSub(false, "simplemediamanager","createsmmediameta", __ref, _mime, _key, _metastate, _permanent);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediameta");
Debug.locals.put("Mime", _mime);
Debug.locals.put("Key", _key);
Debug.locals.put("MetaState", _metastate);
Debug.locals.put("Permanent", _permanent);
 BA.debugLineNum = 531;BA.debugLine="Private Sub CreateSMMediaMeta (Mime As String, Key";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 532;BA.debugLine="Dim t1 As SMMediaMeta";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.simplemediamanager._smmediameta");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 533;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 534;BA.debugLine="t1.Mime = Mime";
Debug.JustUpdateDeviceLine();
_t1.setField ("Mime" /*RemoteObject*/ ,_mime);
 BA.debugLineNum = 535;BA.debugLine="t1.MediaType = ViewsManager.MimeToMediaType(Mime)";
Debug.JustUpdateDeviceLine();
_t1.setField ("MediaType" /*RemoteObject*/ ,__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.smmviews.class, "_mimetomediatype" /*RemoteObject*/ ,(Object)(_mime)));
 BA.debugLineNum = 536;BA.debugLine="t1.Key = Key";
Debug.JustUpdateDeviceLine();
_t1.setField ("Key" /*RemoteObject*/ ,_key);
 BA.debugLineNum = 537;BA.debugLine="t1.MetaState = MetaState";
Debug.JustUpdateDeviceLine();
_t1.setField ("MetaState" /*RemoteObject*/ ,_metastate);
 BA.debugLineNum = 538;BA.debugLine="t1.Permanent = Permanent";
Debug.JustUpdateDeviceLine();
_t1.setField ("Permanent" /*RemoteObject*/ ,_permanent);
 BA.debugLineNum = 539;BA.debugLine="t1.WaitingRequestsSets.Initialize";
Debug.JustUpdateDeviceLine();
_t1.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 540;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 541;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsmmediarequestset(RemoteObject __ref,RemoteObject _loading,RemoteObject _mainmedia,RemoteObject _error,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("CreateSMMediaRequestSet (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,554);
if (RapidSub.canDelegate("createsmmediarequestset")) { return __ref.runUserSub(false, "simplemediamanager","createsmmediarequestset", __ref, _loading, _mainmedia, _error, _target);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequestset");
Debug.locals.put("Loading", _loading);
Debug.locals.put("MainMedia", _mainmedia);
Debug.locals.put("Error", _error);
Debug.locals.put("Target", _target);
 BA.debugLineNum = 554;BA.debugLine="Public Sub CreateSMMediaRequestSet (Loading As SMM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 555;BA.debugLine="Dim t1 As SMMediaRequestSet";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.simplemediamanager._smmediarequestset");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 556;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 557;BA.debugLine="t1.Loading = Loading";
Debug.JustUpdateDeviceLine();
_t1.setField ("Loading" /*RemoteObject*/ ,_loading);
 BA.debugLineNum = 558;BA.debugLine="t1.MainMedia = MainMedia";
Debug.JustUpdateDeviceLine();
_t1.setField ("MainMedia" /*RemoteObject*/ ,_mainmedia);
 BA.debugLineNum = 559;BA.debugLine="t1.Error = Error";
Debug.JustUpdateDeviceLine();
_t1.setField ("Error" /*RemoteObject*/ ,_error);
 BA.debugLineNum = 560;BA.debugLine="t1.Target = Target";
Debug.JustUpdateDeviceLine();
_t1.setField ("Target" /*RemoteObject*/ ,_target);
 BA.debugLineNum = 561;BA.debugLine="t1.NumberOfAncestors = CountAncestors(t1.Target)";
Debug.JustUpdateDeviceLine();
_t1.setField ("NumberOfAncestors" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.simplemediamanager.class, "_countancestors" /*RemoteObject*/ ,(Object)(_t1.getField(false,"Target" /*RemoteObject*/ ))));
 BA.debugLineNum = 562;BA.debugLine="t1.Callback = Null";
Debug.JustUpdateDeviceLine();
_t1.setField ("Callback" /*RemoteObject*/ ,simplemediamanager.__c.getField(false,"Null"));
 BA.debugLineNum = 563;BA.debugLine="If t1.NumberOfAncestors = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t1.getField(true,"NumberOfAncestors" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 564;BA.debugLine="Log(\"Target is not in the views tree!\")";
Debug.JustUpdateDeviceLine();
simplemediamanager.__c.runVoidMethod ("LogImpl","912386314",RemoteObject.createImmutable("Target is not in the views tree!"),0);
 };
 BA.debugLineNum = 566;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsmmrequest(RemoteObject __ref,RemoteObject _key,RemoteObject _url,RemoteObject _mime) throws Exception{
try {
		Debug.PushSubsStack("CreateSMMRequest (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,503);
if (RapidSub.canDelegate("createsmmrequest")) { return __ref.runUserSub(false, "simplemediamanager","createsmmrequest", __ref, _key, _url, _mime);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequest");
Debug.locals.put("Key", _key);
Debug.locals.put("Url", _url);
Debug.locals.put("Mime", _mime);
 BA.debugLineNum = 503;BA.debugLine="Private Sub CreateSMMRequest (Key As String, Url A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 504;BA.debugLine="Dim t1 As SMMediaRequest";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.simplemediamanager._smmediarequest");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 505;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 506;BA.debugLine="t1.Key = Key";
Debug.JustUpdateDeviceLine();
_t1.setField ("Key" /*RemoteObject*/ ,_key);
 BA.debugLineNum = 507;BA.debugLine="t1.Url = Url";
Debug.JustUpdateDeviceLine();
_t1.setField ("Url" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 508;BA.debugLine="t1.Mime = Mime";
Debug.JustUpdateDeviceLine();
_t1.setField ("Mime" /*RemoteObject*/ ,_mime);
 BA.debugLineNum = 509;BA.debugLine="t1.Extra.Initialize";
Debug.JustUpdateDeviceLine();
_t1.getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 510;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 511;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsmmrequest2(RemoteObject __ref,RemoteObject _key,RemoteObject _url,RemoteObject _mime,RemoteObject _extra) throws Exception{
try {
		Debug.PushSubsStack("CreateSMMRequest2 (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,513);
if (RapidSub.canDelegate("createsmmrequest2")) { return __ref.runUserSub(false, "simplemediamanager","createsmmrequest2", __ref, _key, _url, _mime, _extra);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequest");
Debug.locals.put("Key", _key);
Debug.locals.put("Url", _url);
Debug.locals.put("Mime", _mime);
Debug.locals.put("Extra", _extra);
 BA.debugLineNum = 513;BA.debugLine="Private Sub CreateSMMRequest2 (Key As String, Url";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 514;BA.debugLine="Dim t1 As SMMediaRequest";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.simplemediamanager._smmediarequest");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 515;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 516;BA.debugLine="t1.Key = Key";
Debug.JustUpdateDeviceLine();
_t1.setField ("Key" /*RemoteObject*/ ,_key);
 BA.debugLineNum = 517;BA.debugLine="t1.Url = Url";
Debug.JustUpdateDeviceLine();
_t1.setField ("Url" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 518;BA.debugLine="t1.Mime = Mime";
Debug.JustUpdateDeviceLine();
_t1.setField ("Mime" /*RemoteObject*/ ,_mime);
 BA.debugLineNum = 519;BA.debugLine="t1.Extra = Extra";
Debug.JustUpdateDeviceLine();
_t1.setField ("Extra" /*RemoteObject*/ ,_extra);
 BA.debugLineNum = 520;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 521;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletemedia(RemoteObject __ref,RemoteObject _media) throws Exception{
try {
		Debug.PushSubsStack("DeleteMedia (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,436);
if (RapidSub.canDelegate("deletemedia")) { return __ref.runUserSub(false, "simplemediamanager","deletemedia", __ref, _media);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Media", _media);
 BA.debugLineNum = 436;BA.debugLine="Private Sub DeleteMedia (Media As SMMedia)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 440;BA.debugLine="If Media.MediaState = STATE_READY Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_ready" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 441;BA.debugLine="Select Media.Meta.MediaType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"MediaType" /*RemoteObject*/ ),__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_image" /*RemoteObject*/ ),__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_html" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 444;BA.debugLine="Dim jo As JavaObject = Media.Media 'B4XBitmap";
Debug.JustUpdateDeviceLine();
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _media.getField(false,"Media" /*RemoteObject*/ ));Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 445;BA.debugLine="jo.RunMethod(\"recycle\", Null)";
Debug.JustUpdateDeviceLine();
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("recycle")),(Object)((simplemediamanager.__c.getField(false,"Null"))));
 break; }
case 1: {
 BA.debugLineNum = 448;BA.debugLine="MetaCache.Remove(Media.Meta.Key)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_metacache" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ ))));
 break; }
}
;
 }else 
{ BA.debugLineNum = 450;BA.debugLine="Else if Media.MediaState = STATE_LOADING Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_loading" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 454;BA.debugLine="If Media.Job.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_media.getField(false,"Job" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 455;BA.debugLine="HttpRequestsManager.CancelRequest(Media.Meta.Fi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_httprequestsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.requestsmanager.class, "_cancelrequest" /*RemoteObject*/ ,(Object)(_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"FirstUrl" /*RemoteObject*/ )),(Object)(_media.getField(false,"Job" /*RemoteObject*/ )));
 };
 }}
;
 BA.debugLineNum = 458;BA.debugLine="MediaCache.Remove(Media.Meta.Key)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ ))));
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designersetmedia(RemoteObject __ref,RemoteObject _designerargs) throws Exception{
try {
		Debug.PushSubsStack("DesignerSetMedia (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("designersetmedia")) { return __ref.runUserSub(false, "simplemediamanager","designersetmedia", __ref, _designerargs);}
RemoteObject _target = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _url = RemoteObject.createImmutable("");
Debug.locals.put("DesignerArgs", _designerargs);
 BA.debugLineNum = 80;BA.debugLine="Private Sub DesignerSetMedia(DesignerArgs As Desig";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="Dim Target As B4XView = DesignerArgs.GetViewFromA";
Debug.JustUpdateDeviceLine();
_target = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_target = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _designerargs.runMethod(false,"GetViewFromArgs",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Target", _target);Debug.locals.put("Target", _target);
 BA.debugLineNum = 82;BA.debugLine="Dim url As String = DesignerArgs.Arguments.Get(1)";
Debug.JustUpdateDeviceLine();
_url = BA.ObjectToString(_designerargs.runMethod(false,"getArguments").runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("url", _url);Debug.locals.put("url", _url);
 BA.debugLineNum = 83;BA.debugLine="If DesignerArgs.FirstRun Then";
Debug.JustUpdateDeviceLine();
if (_designerargs.runMethod(true,"getFirstRun").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 84;BA.debugLine="SetMedia(Target, url)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_setmedia" /*RemoteObject*/ ,(Object)(_target),(Object)(_url));
 }else {
 BA.debugLineNum = 86;BA.debugLine="PanelResized(Target)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_panelresized" /*RemoteObject*/ ,(Object)(_target));
 };
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _downloadimagemedia(RemoteObject __ref,RemoteObject _media) throws Exception{
try {
		Debug.PushSubsStack("DownloadImageMedia (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,249);
if (RapidSub.canDelegate("downloadimagemedia")) { __ref.runUserSub(false, "simplemediamanager","downloadimagemedia", __ref, _media); return;}
ResumableSub_DownloadImageMedia rsub = new ResumableSub_DownloadImageMedia(null,__ref,_media);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadImageMedia extends BA.ResumableSub {
public ResumableSub_DownloadImageMedia(b4a.example.simplemediamanager parent,RemoteObject __ref,RemoteObject _media) {
this.parent = parent;
this.__ref = __ref;
this._media = _media;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.simplemediamanager parent;
RemoteObject _media;
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _unused = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadImageMedia (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,249);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Media", _media);
 BA.debugLineNum = 251;BA.debugLine="If Media.Meta.MetaState = STATE_READY Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"MetaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_ready" /*RemoteObject*/ )))) { 
this.state = 3;
}else {
this.state = 24;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 252;BA.debugLine="If SleepDurationBeforeDownload > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_sleepdurationbeforedownload" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 253;BA.debugLine="Sleep(SleepDurationBeforeDownload)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "simplemediamanager", "downloadimagemedia"),BA.numberCast(int.class, __ref.getField(true,"_sleepdurationbeforedownload" /*RemoteObject*/ )));
this.state = 26;
return;
case 26:
//C
this.state = 7;
;
 BA.debugLineNum = 254;BA.debugLine="CancelDisconnectedTargets(Media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_canceldisconnectedtargets" /*RemoteObject*/ ,(Object)(_media));
 BA.debugLineNum = 255;BA.debugLine="If IsMediaStillRelevant(Media) = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.simplemediamanager.class, "_ismediastillrelevant" /*RemoteObject*/ ,(Object)(_media)),parent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 259;BA.debugLine="DeleteMedia(Media) 'media is loading state. Re";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_deletemedia" /*RemoteObject*/ ,(Object)(_media));
 BA.debugLineNum = 260;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;
;
 BA.debugLineNum = 263;BA.debugLine="If Media.Meta.Dir = \"\" Then";
Debug.JustUpdateDeviceLine();

case 11:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Dir" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 264;BA.debugLine="Dim job As HttpJob";
Debug.JustUpdateDeviceLine();
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 265;BA.debugLine="job.Initialize(\"\", Me)";
Debug.JustUpdateDeviceLine();
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 266;BA.debugLine="job.Download(Media.Meta.FirstUrl)";
Debug.JustUpdateDeviceLine();
_job.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"FirstUrl" /*RemoteObject*/ )));
 BA.debugLineNum = 267;BA.debugLine="job.GetRequest.Timeout = DefaultRequestTimeout";
Debug.JustUpdateDeviceLine();
_job.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",__ref.getField(true,"_defaultrequesttimeout" /*RemoteObject*/ ));
 BA.debugLineNum = 271;BA.debugLine="Media.Job = job";
Debug.JustUpdateDeviceLine();
_media.setField ("Job" /*RemoteObject*/ ,_job);
 BA.debugLineNum = 272;BA.debugLine="Wait For (job) JobDone (job As HttpJob)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "simplemediamanager", "downloadimagemedia"), (_job));
this.state = 27;
return;
case 27:
//C
this.state = 14;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 273;BA.debugLine="Media.Job = JobEmpty";
Debug.JustUpdateDeviceLine();
_media.setField ("Job" /*RemoteObject*/ ,__ref.getField(false,"_jobempty" /*RemoteObject*/ ));
 BA.debugLineNum = 278;BA.debugLine="If job.Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 14:
//if
this.state = 19;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 279;BA.debugLine="Wait For (PrepareMedia(Media, job, \"\", \"\", Fal";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "simplemediamanager", "downloadimagemedia"), __ref.runClassMethod (b4a.example.simplemediamanager.class, "_preparemedia" /*RemoteObject*/ ,(Object)(_media),(Object)(_job),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(parent.__c.getField(true,"False"))));
this.state = 28;
return;
case 28:
//C
this.state = 19;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Unused", _unused);
;
 BA.debugLineNum = 280;BA.debugLine="Media.MediaState = IIf(Media.Media <> Null, ST";
Debug.JustUpdateDeviceLine();
_media.setField ("MediaState" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("N",_media.getField(false,"Media" /*RemoteObject*/ ))) ? ((__ref.getField(true,"_state_ready" /*RemoteObject*/ ))) : ((__ref.getField(true,"_state_error" /*RemoteObject*/ ))))));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 282;BA.debugLine="Media.MediaState = STATE_ERROR";
Debug.JustUpdateDeviceLine();
_media.setField ("MediaState" /*RemoteObject*/ ,__ref.getField(true,"_state_error" /*RemoteObject*/ ));
 if (true) break;

case 19:
//C
this.state = 22;
;
 BA.debugLineNum = 284;BA.debugLine="job.Release";
Debug.JustUpdateDeviceLine();
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 289;BA.debugLine="Wait For (PrepareMedia(Media, Null, Media.Meta.";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "simplemediamanager", "downloadimagemedia"), __ref.runClassMethod (b4a.example.simplemediamanager.class, "_preparemedia" /*RemoteObject*/ ,(Object)(_media),(Object)((parent.__c.getField(false,"Null"))),(Object)(_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Dir" /*RemoteObject*/ )),(Object)(_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"FileName" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True"))));
this.state = 29;
return;
case 29:
//C
this.state = 22;
_unused = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Unused", _unused);
;
 BA.debugLineNum = 290;BA.debugLine="Media.MediaState = IIf(Media.Media <> Null, STA";
Debug.JustUpdateDeviceLine();
_media.setField ("MediaState" /*RemoteObject*/ ,BA.numberCast(int.class, ((RemoteObject.solveBoolean("N",_media.getField(false,"Media" /*RemoteObject*/ ))) ? ((__ref.getField(true,"_state_ready" /*RemoteObject*/ ))) : ((__ref.getField(true,"_state_error" /*RemoteObject*/ ))))));
 if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 294;BA.debugLine="Media.MediaState = STATE_ERROR";
Debug.JustUpdateDeviceLine();
_media.setField ("MediaState" /*RemoteObject*/ ,__ref.getField(true,"_state_error" /*RemoteObject*/ ));
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 296;BA.debugLine="MediaIsReady(Media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_mediaisready" /*RemoteObject*/ ,(Object)(_media));
 BA.debugLineNum = 297;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
}
public static void  _complete(RemoteObject __ref,RemoteObject _unused) throws Exception{
}
public static RemoteObject  _getmediacachesize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMediaCacheSize (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,483);
if (RapidSub.canDelegate("getmediacachesize")) { return __ref.runUserSub(false, "simplemediamanager","getmediacachesize", __ref);}
 BA.debugLineNum = 483;BA.debugLine="Public Sub getMediaCacheSize As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 484;BA.debugLine="Return MediaCache.Size";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_getsize" /*RemoteObject*/ );
 BA.debugLineNum = 485;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrequestfromrequestset(RemoteObject __ref,RemoteObject _rs) throws Exception{
try {
		Debug.PushSubsStack("GetRequestFromRequestSet (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,489);
if (RapidSub.canDelegate("getrequestfromrequestset")) { return __ref.runUserSub(false, "simplemediamanager","getrequestfromrequestset", __ref, _rs);}
Debug.locals.put("rs", _rs);
 BA.debugLineNum = 489;BA.debugLine="Private Sub GetRequestFromRequestSet(rs As SMMedia";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 490;BA.debugLine="If rs.RequestState = STATE_LOADING Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_rs.getField(true,"RequestState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_loading" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 491;BA.debugLine="Return rs.Loading";
Debug.JustUpdateDeviceLine();
if (true) return _rs.getField(false,"Loading" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 492;BA.debugLine="Else If rs.RequestState = STATE_ERROR Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_rs.getField(true,"RequestState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_error" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 493;BA.debugLine="Return rs.Error";
Debug.JustUpdateDeviceLine();
if (true) return _rs.getField(false,"Error" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 495;BA.debugLine="Return rs.MainMedia";
Debug.JustUpdateDeviceLine();
if (true) return _rs.getField(false,"MainMedia" /*RemoteObject*/ );
 }}
;
 BA.debugLineNum = 497;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "simplemediamanager","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _build = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 41;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="ImagesLoader.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imagesloader" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapsasync.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 43;BA.debugLine="ImagesLoader.MaxFileSize = 8 * 1024 * 1024";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imagesloader" /*RemoteObject*/ ).setField ("_maxfilesize" /*RemoteObject*/ ,BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(8),RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "**",0, 1)));
 BA.debugLineNum = 44;BA.debugLine="MetaCache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_metacache" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="MediaCache.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 46;BA.debugLine="ViewsRequestSet.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsrequestset" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="ViewsManager.Initialize (Me)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.smmviews.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)((__ref)));
 BA.debugLineNum = 49;BA.debugLine="Dim build As JavaObject";
Debug.JustUpdateDeviceLine();
_build = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("build", _build);
 BA.debugLineNum = 50;BA.debugLine="B4ASdkVersion =  build.InitializeStatic(\"android.";
Debug.JustUpdateDeviceLine();
__ref.setField ("_b4asdkversion" /*RemoteObject*/ ,BA.numberCast(int.class, _build.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.os.Build$VERSION"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("SDK_INT")))));
 BA.debugLineNum = 52;BA.debugLine="AddLocalMedia(KEY_DEFAULT_ERROR, Null, \"none\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_addlocalmedia" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_key_default_error" /*RemoteObject*/ )),(Object)(simplemediamanager.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("none")));
 BA.debugLineNum = 53;BA.debugLine="DefaultLoadingRequest = CreateSMMRequest(KEY_DEFA";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaultloadingrequest" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.simplemediamanager.class, "_createsmmrequest" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_key_default_loading" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(true,"_mime_unknown" /*RemoteObject*/ ))));
 BA.debugLineNum = 54;BA.debugLine="DefaultLoadingRequest.Extra.Put(REQUEST_BACKGROUN";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultloadingrequest" /*RemoteObject*/ ).getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((__ref.getField(true,"_request_background" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"))));
 BA.debugLineNum = 55;BA.debugLine="DefaultErrorRequest = CreateSMMRequest(KEY_DEFAUL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaulterrorrequest" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.simplemediamanager.class, "_createsmmrequest" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_key_default_error" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(true,"_mime_unknown" /*RemoteObject*/ ))));
 BA.debugLineNum = 56;BA.debugLine="DefaultErrorRequest.Extra.Put(REQUEST_BACKGROUND,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaulterrorrequest" /*RemoteObject*/ ).getField(false,"Extra" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((__ref.getField(true,"_request_background" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((((int)0xff6a6a6a)))));
 BA.debugLineNum = 57;BA.debugLine="AddLocalMedia(KEY_DEFAULT_LOADING, Null, \"none\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_addlocalmedia" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_key_default_loading" /*RemoteObject*/ )),(Object)(simplemediamanager.__c.getField(false,"Null")),(Object)(RemoteObject.createImmutable("none")));
 BA.debugLineNum = 58;BA.debugLine="LastTrimCache = DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lasttrimcache" /*RemoteObject*/ ,simplemediamanager.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 59;BA.debugLine="HttpRequestsManager.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_httprequestsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.requestsmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ismediastillrelevant(RemoteObject __ref,RemoteObject _media) throws Exception{
try {
		Debug.PushSubsStack("IsMediaStillRelevant (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,462);
if (RapidSub.canDelegate("ismediastillrelevant")) { return __ref.runUserSub(false, "simplemediamanager","ismediastillrelevant", __ref, _media);}
Debug.locals.put("Media", _media);
 BA.debugLineNum = 462;BA.debugLine="Private Sub IsMediaStillRelevant (Media As SMMedia";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 463;BA.debugLine="Return Media.Meta.Permanent Or (Media.MediaState";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Permanent" /*RemoteObject*/ )) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_loading" /*RemoteObject*/ ))) && RemoteObject.solveBoolean(">",_media.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_loading" /*RemoteObject*/ ))) && RemoteObject.solveBoolean(">",_media.getField(false,"UsedBy" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))))));
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iswebpanimated(RemoteObject __ref,RemoteObject _media) throws Exception{
try {
		Debug.PushSubsStack("IsWebPAnimated (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("iswebpanimated")) { return __ref.runUserSub(false, "simplemediamanager","iswebpanimated", __ref, _media);}
Debug.locals.put("Media", _media);
 BA.debugLineNum = 346;BA.debugLine="Public Sub IsWebPAnimated(Media As SMMedia) As Boo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 348;BA.debugLine="Return B4ASdkVersion >= 28 And Media.Meta.MediaTy";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("g",__ref.getField(true,"_b4asdkversion" /*RemoteObject*/ ),BA.numberCast(double.class, 28)) && RemoteObject.solveBoolean("=",_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"MediaType" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_webp" /*RemoteObject*/ ))));
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mediaisready(RemoteObject __ref,RemoteObject _media) throws Exception{
try {
		Debug.PushSubsStack("MediaIsReady (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("mediaisready")) { return __ref.runUserSub(false, "simplemediamanager","mediaisready", __ref, _media);}
RemoteObject _req = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequestset");
Debug.locals.put("Media", _media);
 BA.debugLineNum = 354;BA.debugLine="Private Sub MediaIsReady (Media As SMMedia)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 355;BA.debugLine="CancelDisconnectedTargets(Media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_canceldisconnectedtargets" /*RemoteObject*/ ,(Object)(_media));
 BA.debugLineNum = 356;BA.debugLine="For Each req As SMMediaRequestSet In Media.Waitin";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _media.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_aslist" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_req = (group2.runMethod(false,"Get",index2));Debug.locals.put("req", _req);
Debug.locals.put("req", _req);
 BA.debugLineNum = 357;BA.debugLine="req.RequestState = Media.MediaState";
Debug.JustUpdateDeviceLine();
_req.setField ("RequestState" /*RemoteObject*/ ,_media.getField(true,"MediaState" /*RemoteObject*/ ));
 BA.debugLineNum = 358;BA.debugLine="If Media.MediaState = STATE_READY Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_ready" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 359;BA.debugLine="Media.UsedBy.Add(req)";
Debug.JustUpdateDeviceLine();
_media.getField(false,"UsedBy" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_req)));
 BA.debugLineNum = 360;BA.debugLine="ViewsManager.AddMedia(req, Media, GetRequestFro";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.smmviews.class, "_addmedia" /*void*/ ,(Object)(_req),(Object)(_media),(Object)(__ref.runClassMethod (b4a.example.simplemediamanager.class, "_getrequestfromrequestset" /*RemoteObject*/ ,(Object)(_req))));
 }else 
{ BA.debugLineNum = 361;BA.debugLine="Else if Media.MediaState = STATE_ERROR Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_error" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 362;BA.debugLine="ViewsManager.AddMedia(req, MediaCache.Get(req.E";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.smmviews.class, "_addmedia" /*void*/ ,(Object)(_req),(Object)((__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_req.getField(false,"Error" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ )))))),(Object)(__ref.runClassMethod (b4a.example.simplemediamanager.class, "_getrequestfromrequestset" /*RemoteObject*/ ,(Object)(_req))));
 }else {
 BA.debugLineNum = 364;BA.debugLine="Log(\"MediaIsReady Unexpected state!\")";
Debug.JustUpdateDeviceLine();
simplemediamanager.__c.runVoidMethod ("LogImpl","911272202",RemoteObject.createImmutable("MediaIsReady Unexpected state!"),0);
 }}
;
 }
}Debug.locals.put("req", _req);
;
 BA.debugLineNum = 367;BA.debugLine="Media.WaitingRequestsSets.Clear";
Debug.JustUpdateDeviceLine();
_media.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 368;BA.debugLine="If Media.MediaState = STATE_ERROR Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_error" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 372;BA.debugLine="MediaCache.Remove(Media.Meta.Key)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _metaisready(RemoteObject __ref,RemoteObject _meta) throws Exception{
try {
		Debug.PushSubsStack("MetaIsReady (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("metaisready")) { return __ref.runUserSub(false, "simplemediamanager","metaisready", __ref, _meta);}
RemoteObject _requestset = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequestset");
RemoteObject _media = RemoteObject.declareNull("b4a.example.simplemediamanager._smmedia");
RemoteObject _mediatype = RemoteObject.createImmutable(0);
Debug.locals.put("Meta", _meta);
 BA.debugLineNum = 202;BA.debugLine="Private Sub MetaIsReady (Meta As SMMediaMeta)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 203;BA.debugLine="For Each RequestSet As SMMediaRequestSet In Meta.";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _meta.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_aslist" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_requestset = (group1.runMethod(false,"Get",index1));Debug.locals.put("RequestSet", _requestset);
Debug.locals.put("RequestSet", _requestset);
 BA.debugLineNum = 207;BA.debugLine="If MediaCache.ContainsKey(Meta.Key) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_containskey" /*RemoteObject*/ ,(Object)((_meta.getField(true,"Key" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 208;BA.debugLine="Dim Media As SMMedia = MediaCache.Get(Meta.Key)";
Debug.JustUpdateDeviceLine();
_media = (__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_meta.getField(true,"Key" /*RemoteObject*/ )))));Debug.locals.put("Media", _media);Debug.locals.put("Media", _media);
 BA.debugLineNum = 210;BA.debugLine="MediaCache.Remove(Meta.Key)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((_meta.getField(true,"Key" /*RemoteObject*/ ))));
 BA.debugLineNum = 211;BA.debugLine="MediaCache.Put(Meta.Key, Media)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_meta.getField(true,"Key" /*RemoteObject*/ ))),(Object)((_media)));
 BA.debugLineNum = 212;BA.debugLine="Media.WaitingRequestsSets.Add(RequestSet)";
Debug.JustUpdateDeviceLine();
_media.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_requestset)));
 BA.debugLineNum = 213;BA.debugLine="If Media.MediaState <> STATE_LOADING Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_loading" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 214;BA.debugLine="MediaIsReady(Media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_mediaisready" /*RemoteObject*/ ,(Object)(_media));
 };
 }else {
 BA.debugLineNum = 217;BA.debugLine="Media = CreateSMMedia(Null, Meta, IIf(Meta.Meta";
Debug.JustUpdateDeviceLine();
_media = __ref.runClassMethod (b4a.example.simplemediamanager.class, "_createsmmedia" /*RemoteObject*/ ,(Object)(simplemediamanager.__c.getField(false,"Null")),(Object)(_meta),(Object)(BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_meta.getField(true,"MetaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_ready" /*RemoteObject*/ )))) ? ((__ref.getField(true,"_state_loading" /*RemoteObject*/ ))) : ((__ref.getField(true,"_state_error" /*RemoteObject*/ )))))));Debug.locals.put("Media", _media);
 BA.debugLineNum = 218;BA.debugLine="Media.WaitingRequestsSets.Add(RequestSet)";
Debug.JustUpdateDeviceLine();
_media.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_requestset)));
 BA.debugLineNum = 219;BA.debugLine="MediaCache.Put(Media.Meta.Key, Media)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ ))),(Object)((_media)));
 BA.debugLineNum = 220;BA.debugLine="TrimMediaCacheImpl";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_trimmediacacheimpl" /*RemoteObject*/ );
 BA.debugLineNum = 221;BA.debugLine="If Media.MediaState = STATE_ERROR Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_error" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 222;BA.debugLine="MediaIsReady(Media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_mediaisready" /*RemoteObject*/ ,(Object)(_media));
 }else {
 BA.debugLineNum = 224;BA.debugLine="Dim MediaType As Int = Media.Meta.MediaType";
Debug.JustUpdateDeviceLine();
_mediatype = _media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"MediaType" /*RemoteObject*/ );Debug.locals.put("MediaType", _mediatype);Debug.locals.put("MediaType", _mediatype);
 BA.debugLineNum = 225;BA.debugLine="Select MediaType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_mediatype,__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_gif" /*RemoteObject*/ ),__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_image" /*RemoteObject*/ ),__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_webp" /*RemoteObject*/ ),__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_video" /*RemoteObject*/ ),__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_html" /*RemoteObject*/ ),__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_none" /*RemoteObject*/ ))) {
case 0: 
case 1: 
case 2: {
 BA.debugLineNum = 227;BA.debugLine="DownloadImageMedia(Media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_downloadimagemedia" /*void*/ ,(Object)(_media));
 break; }
case 3: 
case 4: {
 BA.debugLineNum = 229;BA.debugLine="Media.MediaState = STATE_READY";
Debug.JustUpdateDeviceLine();
_media.setField ("MediaState" /*RemoteObject*/ ,__ref.getField(true,"_state_ready" /*RemoteObject*/ ));
 BA.debugLineNum = 230;BA.debugLine="Media.Media = Meta.FirstUrl";
Debug.JustUpdateDeviceLine();
_media.setField ("Media" /*RemoteObject*/ ,(_meta.getField(true,"FirstUrl" /*RemoteObject*/ )));
 BA.debugLineNum = 231;BA.debugLine="MediaIsReady(Media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_mediaisready" /*RemoteObject*/ ,(Object)(_media));
 break; }
case 5: {
 BA.debugLineNum = 233;BA.debugLine="Log(\"Unexpected mime: \" & Media.Meta.Mime)";
Debug.JustUpdateDeviceLine();
simplemediamanager.__c.runVoidMethod ("LogImpl","911010079",RemoteObject.concat(RemoteObject.createImmutable("Unexpected mime: "),_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Mime" /*RemoteObject*/ )),0);
 BA.debugLineNum = 234;BA.debugLine="Media.MediaState = STATE_ERROR";
Debug.JustUpdateDeviceLine();
_media.setField ("MediaState" /*RemoteObject*/ ,__ref.getField(true,"_state_error" /*RemoteObject*/ ));
 BA.debugLineNum = 235;BA.debugLine="MediaIsReady(Media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_mediaisready" /*RemoteObject*/ ,(Object)(_media));
 break; }
}
;
 };
 };
 }
}Debug.locals.put("RequestSet", _requestset);
;
 BA.debugLineNum = 240;BA.debugLine="Meta.WaitingRequestsSets.Clear";
Debug.JustUpdateDeviceLine();
_meta.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 241;BA.debugLine="If Meta.MetaState = STATE_ERROR Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_meta.getField(true,"MetaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_error" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 245;BA.debugLine="MetaCache.Remove(Meta)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_metacache" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_meta)));
 };
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelresized(RemoteObject __ref,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("PanelResized (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,377);
if (RapidSub.canDelegate("panelresized")) { return __ref.runUserSub(false, "simplemediamanager","panelresized", __ref, _target);}
RemoteObject _set = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequestset");
Debug.locals.put("Target", _target);
 BA.debugLineNum = 377;BA.debugLine="Public Sub PanelResized (Target As B4XView)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 378;BA.debugLine="Dim set As SMMediaRequestSet = ViewsRequestSet.Ge";
Debug.JustUpdateDeviceLine();
_set = (__ref.getField(false,"_viewsrequestset" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_target.getObject()))));Debug.locals.put("set", _set);Debug.locals.put("set", _set);
 BA.debugLineNum = 379;BA.debugLine="If set <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_set)) { 
 BA.debugLineNum = 380;BA.debugLine="ViewsManager.ParentResized(Target)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.smmviews.class, "_parentresized" /*RemoteObject*/ ,(Object)(_target));
 };
 BA.debugLineNum = 382;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preparemedia(RemoteObject __ref,RemoteObject _media,RemoteObject _job,RemoteObject _dir,RemoteObject _filename,RemoteObject _fromfile) throws Exception{
try {
		Debug.PushSubsStack("PrepareMedia (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,299);
if (RapidSub.canDelegate("preparemedia")) { return __ref.runUserSub(false, "simplemediamanager","preparemedia", __ref, _media, _job, _dir, _filename, _fromfile);}
ResumableSub_PrepareMedia rsub = new ResumableSub_PrepareMedia(null,__ref,_media,_job,_dir,_filename,_fromfile);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PrepareMedia extends BA.ResumableSub {
public ResumableSub_PrepareMedia(b4a.example.simplemediamanager parent,RemoteObject __ref,RemoteObject _media,RemoteObject _job,RemoteObject _dir,RemoteObject _filename,RemoteObject _fromfile) {
this.parent = parent;
this.__ref = __ref;
this._media = _media;
this._job = _job;
this._dir = _dir;
this._filename = _filename;
this._fromfile = _fromfile;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.simplemediamanager parent;
RemoteObject _media;
RemoteObject _job;
RemoteObject _dir;
RemoteObject _filename;
RemoteObject _fromfile;
RemoteObject _mediatype = RemoteObject.createImmutable(0);
RemoteObject _skipregularimageloading = RemoteObject.createImmutable(false);
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PrepareMedia (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,299);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Media", _media);
Debug.locals.put("job", _job);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("FromFile", _fromfile);
 BA.debugLineNum = 300;BA.debugLine="Dim MediaType As Int = Media.Meta.MediaType";
Debug.JustUpdateDeviceLine();
_mediatype = _media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"MediaType" /*RemoteObject*/ );Debug.locals.put("MediaType", _mediatype);Debug.locals.put("MediaType", _mediatype);
 BA.debugLineNum = 301;BA.debugLine="If MediaType = ViewsManager.MEDIA_TYPE_IMAGE Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_mediatype,BA.numberCast(double.class, __ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_image" /*RemoteObject*/ )))) { 
this.state = 3;
}else {
this.state = 18;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 302;BA.debugLine="Dim SkipRegularImageLoading As Boolean 'ignore";
Debug.JustUpdateDeviceLine();
_skipregularimageloading = RemoteObject.createImmutable(false);Debug.locals.put("SkipRegularImageLoading", _skipregularimageloading);
 BA.debugLineNum = 309;BA.debugLine="If SkipRegularImageLoading = False Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_skipregularimageloading,parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 310;BA.debugLine="If FromFile Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (_fromfile.<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 311;BA.debugLine="Wait For (ImagesLoader.LoadFromFile(Dir, FileN";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "simplemediamanager", "preparemedia"), __ref.getField(false,"_imagesloader" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapsasync.class, "_loadfromfile" /*RemoteObject*/ ,(Object)(_dir),(Object)(_filename),(Object)(__ref.getField(true,"_maximagesize" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_maximagesize" /*RemoteObject*/ ))));
this.state = 26;
return;
case 26:
//C
this.state = 12;
_bmp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("bmp", _bmp);
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 313;BA.debugLine="Wait For (ImagesLoader.LoadFromHttpJob(job, Ma";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "simplemediamanager", "preparemedia"), __ref.getField(false,"_imagesloader" /*RemoteObject*/ ).runClassMethod (b4a.example.bitmapsasync.class, "_loadfromhttpjob" /*RemoteObject*/ ,(Object)(_job),(Object)(__ref.getField(true,"_maximagesize" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_maximagesize" /*RemoteObject*/ ))));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_bmp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("bmp", _bmp);
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 315;BA.debugLine="Media.Media = IIf(bmp.IsInitialized, bmp, Null)";
Debug.JustUpdateDeviceLine();
_media.setField ("Media" /*RemoteObject*/ ,((_bmp.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) ? ((_bmp.getObject())) : (parent.__c.getField(false,"Null"))));
 if (true) break;
;
 BA.debugLineNum = 317;BA.debugLine="If (xui.IsB4A Or xui.IsB4J) And Media.Meta.Mime";
Debug.JustUpdateDeviceLine();

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getIsB4J"))))) && RemoteObject.solveBoolean("=",_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Mime" /*RemoteObject*/ ),BA.ObjectToString("image/jpeg")) && RemoteObject.solveBoolean("N",_media.getField(false,"Media" /*RemoteObject*/ ))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 318;BA.debugLine="PreprocessExif(Media, IIf(FromFile, File.OpenIn";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_preprocessexif" /*RemoteObject*/ ,(Object)(_media),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper"), ((_fromfile.<Boolean>get().booleanValue()) ? ((parent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename)).getObject())) : ((_job.runClassMethod (b4a.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject())))));
 if (true) break;

case 16:
//C
this.state = 25;
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 321;BA.debugLine="Dim in As InputStream = IIf(FromFile, File.OpenI";
Debug.JustUpdateDeviceLine();
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
_in = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper"), ((_fromfile.<Boolean>get().booleanValue()) ? ((parent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename)).getObject())) : ((_job.runClassMethod (b4a.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject()))));Debug.locals.put("in", _in);Debug.locals.put("in", _in);
 BA.debugLineNum = 322;BA.debugLine="Select MediaType";
Debug.JustUpdateDeviceLine();
if (true) break;

case 19:
//select
this.state = 24;
switch (BA.switchObjectToInt(_mediatype,__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_gif" /*RemoteObject*/ ),__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_webp" /*RemoteObject*/ ))) {
case 0: {
this.state = 21;
if (true) break;
}
case 1: {
this.state = 23;
if (true) break;
}
}
if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 324;BA.debugLine="Media.Media = Bit.InputStreamToBytes(in)";
Debug.JustUpdateDeviceLine();
_media.setField ("Media" /*RemoteObject*/ ,(parent.__c.getField(false,"Bit").runMethod(false,"InputStreamToBytes",(Object)((_in.getObject())))));
 if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 343;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 344;BA.debugLine="End Sub";
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
public static RemoteObject  _preprocessexif(RemoteObject __ref,RemoteObject _media,RemoteObject _in) throws Exception{
try {
		Debug.PushSubsStack("PreprocessExif (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,584);
if (RapidSub.canDelegate("preprocessexif")) { return __ref.runUserSub(false, "simplemediamanager","preprocessexif", __ref, _media, _in);}
RemoteObject _exifinterface = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _orientation = RemoteObject.createImmutable(0);
Debug.locals.put("Media", _media);
Debug.locals.put("In", _in);
 BA.debugLineNum = 584;BA.debugLine="Public Sub PreprocessExif (Media As SMMedia, In As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 588;BA.debugLine="If Media.Meta.Mime <> \"image/jpeg\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_media.getField(false,"Meta" /*RemoteObject*/ ).getField(true,"Mime" /*RemoteObject*/ ),BA.ObjectToString("image/jpeg"))) { 
 BA.debugLineNum = 589;BA.debugLine="Log(\"image/jpeg mime expected!\")";
Debug.JustUpdateDeviceLine();
simplemediamanager.__c.runVoidMethod ("LogImpl","912517381",RemoteObject.createImmutable("image/jpeg mime expected!"),0);
 BA.debugLineNum = 590;BA.debugLine="In.Close";
Debug.JustUpdateDeviceLine();
_in.runVoidMethod ("Close");
 BA.debugLineNum = 591;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 594;BA.debugLine="If B4ASdkVersion >= 24 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_b4asdkversion" /*RemoteObject*/ ),BA.numberCast(double.class, 24))) { 
 BA.debugLineNum = 595;BA.debugLine="Dim ExifInterface As JavaObject";
Debug.JustUpdateDeviceLine();
_exifinterface = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ExifInterface", _exifinterface);
 BA.debugLineNum = 596;BA.debugLine="ExifInterface.InitializeNewInstance(\"android.med";
Debug.JustUpdateDeviceLine();
_exifinterface.runVoidMethod ("InitializeNewInstance",(Object)(BA.ObjectToString("android.media.ExifInterface")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_in.getObject())})));
 BA.debugLineNum = 597;BA.debugLine="Dim orientation As Int = ExifInterface.RunMethod";
Debug.JustUpdateDeviceLine();
_orientation = BA.numberCast(int.class, _exifinterface.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAttribute")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("Orientation"))}))));Debug.locals.put("orientation", _orientation);Debug.locals.put("orientation", _orientation);
 BA.debugLineNum = 598;BA.debugLine="Media.Media = RotateBitmapBasedOnOrientation(Med";
Debug.JustUpdateDeviceLine();
_media.setField ("Media" /*RemoteObject*/ ,(__ref.runClassMethod (b4a.example.simplemediamanager.class, "_rotatebitmapbasedonorientation" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _media.getField(false,"Media" /*RemoteObject*/ )),(Object)(_orientation)).getObject()));
 };
 BA.debugLineNum = 600;BA.debugLine="In.Close";
Debug.JustUpdateDeviceLine();
_in.runVoidMethod ("Close");
 BA.debugLineNum = 620;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _registerformeta(RemoteObject __ref,RemoteObject _requestset) throws Exception{
try {
		Debug.PushSubsStack("RegisterForMeta (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("registerformeta")) { __ref.runUserSub(false, "simplemediamanager","registerformeta", __ref, _requestset); return;}
ResumableSub_RegisterForMeta rsub = new ResumableSub_RegisterForMeta(null,__ref,_requestset);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RegisterForMeta extends BA.ResumableSub {
public ResumableSub_RegisterForMeta(b4a.example.simplemediamanager parent,RemoteObject __ref,RemoteObject _requestset) {
this.parent = parent;
this.__ref = __ref;
this._requestset = _requestset;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.simplemediamanager parent;
RemoteObject _requestset;
RemoteObject _media = RemoteObject.declareNull("b4a.example.simplemediamanager._smmedia");
RemoteObject _meta = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediameta");
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _o = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RegisterForMeta (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,145);
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
 BA.debugLineNum = 149;BA.debugLine="ClearMedia(RequestSet.Target)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_clearmedia" /*RemoteObject*/ ,(Object)(_requestset.getField(false,"Target" /*RemoteObject*/ )));
 BA.debugLineNum = 150;BA.debugLine="ViewsRequestSet.Put(RequestSet.Target, RequestSet";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsrequestset" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_requestset.getField(false,"Target" /*RemoteObject*/ ).getObject())),(Object)((_requestset)));
 BA.debugLineNum = 151;BA.debugLine="Dim media As SMMedia = MediaCache.Get(RequestSet.";
Debug.JustUpdateDeviceLine();
_media = (__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ )))));Debug.locals.put("media", _media);Debug.locals.put("media", _media);
 BA.debugLineNum = 154;BA.debugLine="If media <> Null And media.MediaState = STATE_REA";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 30;
if (RemoteObject.solveBoolean("N",_media) && RemoteObject.solveBoolean("=",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_ready" /*RemoteObject*/ )))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 30;
 BA.debugLineNum = 155;BA.debugLine="media.WaitingRequestsSets.Add(RequestSet)";
Debug.JustUpdateDeviceLine();
_media.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_requestset)));
 BA.debugLineNum = 156;BA.debugLine="MediaIsReady(media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_mediaisready" /*RemoteObject*/ ,(Object)(_media));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 158;BA.debugLine="If media <> Null And media.MediaState = STATE_ER";
Debug.JustUpdateDeviceLine();
if (true) break;

case 6:
//if
this.state = 9;
if (RemoteObject.solveBoolean("N",_media) && RemoteObject.solveBoolean("=",_media.getField(true,"MediaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_error" /*RemoteObject*/ )))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 159;BA.debugLine="Log(\"Unexpected state:  media.MediaState = STAT";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","910944526",RemoteObject.createImmutable("Unexpected state:  media.MediaState = STATE_ERROR"),0);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 161;BA.debugLine="RequestSet.RequestState = STATE_LOADING";
Debug.JustUpdateDeviceLine();
_requestset.setField ("RequestState" /*RemoteObject*/ ,__ref.getField(true,"_state_loading" /*RemoteObject*/ ));
 BA.debugLineNum = 162;BA.debugLine="ViewsManager.AddMedia(RequestSet, MediaCache.Get";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.smmviews.class, "_addmedia" /*void*/ ,(Object)(_requestset),(Object)((__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_requestset.getField(false,"Loading" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ )))))),(Object)(_requestset.getField(false,"Loading" /*RemoteObject*/ )));
 BA.debugLineNum = 163;BA.debugLine="If MetaCache.ContainsKey(RequestSet.MainMedia.Ke";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 29;
if (__ref.getField(false,"_metacache" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 164;BA.debugLine="Dim meta As SMMediaMeta = MetaCache.Get(Request";
Debug.JustUpdateDeviceLine();
_meta = (__ref.getField(false,"_metacache" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ )))));Debug.locals.put("meta", _meta);Debug.locals.put("meta", _meta);
 BA.debugLineNum = 165;BA.debugLine="meta.WaitingRequestsSets.Add(RequestSet)";
Debug.JustUpdateDeviceLine();
_meta.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_requestset)));
 BA.debugLineNum = 166;BA.debugLine="If meta.MetaState <> STATE_LOADING Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("!",_meta.getField(true,"MetaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_loading" /*RemoteObject*/ )))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 167;BA.debugLine="MetaIsReady(meta)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_metaisready" /*RemoteObject*/ ,(Object)(_meta));
 if (true) break;

case 16:
//C
this.state = 29;
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 170;BA.debugLine="meta = CreateSMMediaMeta(RequestSet.MainMedia.M";
Debug.JustUpdateDeviceLine();
_meta = __ref.runClassMethod (b4a.example.simplemediamanager.class, "_createsmmediameta" /*RemoteObject*/ ,(Object)(_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(true,"Mime" /*RemoteObject*/ )),(Object)(_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(true,"Key" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(true,"Mime" /*RemoteObject*/ ),__ref.getField(true,"_mime_unknown" /*RemoteObject*/ ))) ? ((__ref.getField(true,"_state_loading" /*RemoteObject*/ ))) : ((__ref.getField(true,"_state_ready" /*RemoteObject*/ )))))),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("meta", _meta);
 BA.debugLineNum = 171;BA.debugLine="meta.FirstUrl = RequestSet.MainMedia.Url";
Debug.JustUpdateDeviceLine();
_meta.setField ("FirstUrl" /*RemoteObject*/ ,_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(true,"Url" /*RemoteObject*/ ));
 BA.debugLineNum = 172;BA.debugLine="meta.WaitingRequestsSets.Add(RequestSet)";
Debug.JustUpdateDeviceLine();
_meta.getField(false,"WaitingRequestsSets" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xset.class, "_add" /*RemoteObject*/ ,(Object)((_requestset)));
 BA.debugLineNum = 173;BA.debugLine="meta.Dir = RequestSet.MainMedia.Extra.GetDefaul";
Debug.JustUpdateDeviceLine();
_meta.setField ("Dir" /*RemoteObject*/ ,BA.ObjectToString(_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((__ref.getField(true,"_request_dir" /*RemoteObject*/ ))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 174;BA.debugLine="meta.FileName = RequestSet.MainMedia.Extra.GetD";
Debug.JustUpdateDeviceLine();
_meta.setField ("FileName" /*RemoteObject*/ ,BA.ObjectToString(_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(false,"Extra" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((__ref.getField(true,"_request_file" /*RemoteObject*/ ))),(Object)((RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 175;BA.debugLine="MetaCache.Put(meta.Key, meta)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_metacache" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_meta.getField(true,"Key" /*RemoteObject*/ ))),(Object)((_meta)));
 BA.debugLineNum = 176;BA.debugLine="If meta.MetaState = STATE_LOADING Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",_meta.getField(true,"MetaState" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_state_loading" /*RemoteObject*/ )))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 177;BA.debugLine="Dim job As HttpJob";
Debug.JustUpdateDeviceLine();
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 178;BA.debugLine="job.Initialize(\"\", Me)";
Debug.JustUpdateDeviceLine();
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 179;BA.debugLine="job.Head(RequestSet.MainMedia.Url)";
Debug.JustUpdateDeviceLine();
_job.runClassMethod (b4a.example.httpjob.class, "_head" /*RemoteObject*/ ,(Object)(_requestset.getField(false,"MainMedia" /*RemoteObject*/ ).getField(true,"Url" /*RemoteObject*/ )));
 BA.debugLineNum = 180;BA.debugLine="job.GetRequest.Timeout = DefaultRequestTimeout";
Debug.JustUpdateDeviceLine();
_job.runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",__ref.getField(true,"_defaultrequesttimeout" /*RemoteObject*/ ));
 BA.debugLineNum = 181;BA.debugLine="meta.Job = job";
Debug.JustUpdateDeviceLine();
_meta.setField ("Job" /*RemoteObject*/ ,_job);
 BA.debugLineNum = 182;BA.debugLine="Wait For (job) JobDone (job As HttpJob)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "simplemediamanager", "registerformeta"), (_job));
this.state = 31;
return;
case 31:
//C
this.state = 22;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 183;BA.debugLine="meta.Job = JobEmpty";
Debug.JustUpdateDeviceLine();
_meta.setField ("Job" /*RemoteObject*/ ,__ref.getField(false,"_jobempty" /*RemoteObject*/ ));
 BA.debugLineNum = 184;BA.debugLine="If job.Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//if
this.state = 27;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 BA.debugLineNum = 185;BA.debugLine="Dim o As Object = job.Response.ContentType";
Debug.JustUpdateDeviceLine();
_o = (_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getContentType"));Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 186;BA.debugLine="meta.Mime = IIf(o = Null, \"\", o).As(String)";
Debug.JustUpdateDeviceLine();
_meta.setField ("Mime" /*RemoteObject*/ ,(((RemoteObject.solveBoolean("n",_o)) ? (BA.ObjectToString("")) : (BA.ObjectToString(_o)))));
 BA.debugLineNum = 187;BA.debugLine="meta.MediaType = ViewsManager.MimeToMediaType";
Debug.JustUpdateDeviceLine();
_meta.setField ("MediaType" /*RemoteObject*/ ,__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.smmviews.class, "_mimetomediatype" /*RemoteObject*/ ,(Object)(_meta.getField(true,"Mime" /*RemoteObject*/ ))));
 BA.debugLineNum = 188;BA.debugLine="meta.MetaState = STATE_READY";
Debug.JustUpdateDeviceLine();
_meta.setField ("MetaState" /*RemoteObject*/ ,__ref.getField(true,"_state_ready" /*RemoteObject*/ ));
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 190;BA.debugLine="meta.MetaState = STATE_ERROR";
Debug.JustUpdateDeviceLine();
_meta.setField ("MetaState" /*RemoteObject*/ ,__ref.getField(true,"_state_error" /*RemoteObject*/ ));
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 192;BA.debugLine="job.Release";
Debug.JustUpdateDeviceLine();
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 195;BA.debugLine="MetaIsReady(meta)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_metaisready" /*RemoteObject*/ ,(Object)(_meta));
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 200;BA.debugLine="End Sub";
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
public static RemoteObject  _rotatebitmapbasedonorientation(RemoteObject __ref,RemoteObject _bmp,RemoteObject _orientation) throws Exception{
try {
		Debug.PushSubsStack("RotateBitmapBasedOnOrientation (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,622);
if (RapidSub.canDelegate("rotatebitmapbasedonorientation")) { return __ref.runUserSub(false, "simplemediamanager","rotatebitmapbasedonorientation", __ref, _bmp, _orientation);}
Debug.locals.put("bmp", _bmp);
Debug.locals.put("orientation", _orientation);
 BA.debugLineNum = 622;BA.debugLine="Private Sub RotateBitmapBasedOnOrientation (bmp As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 623;BA.debugLine="Select orientation";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_orientation,BA.numberCast(int.class, 3),BA.numberCast(int.class, 6),BA.numberCast(int.class, 8))) {
case 0: {
 BA.debugLineNum = 625;BA.debugLine="bmp = bmp.Rotate(180)";
Debug.JustUpdateDeviceLine();
_bmp = _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(int.class, 180)));Debug.locals.put("bmp", _bmp);
 break; }
case 1: {
 BA.debugLineNum = 627;BA.debugLine="bmp = bmp.Rotate(90)";
Debug.JustUpdateDeviceLine();
_bmp = _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(int.class, 90)));Debug.locals.put("bmp", _bmp);
 break; }
case 2: {
 BA.debugLineNum = 629;BA.debugLine="bmp = bmp.Rotate(270)";
Debug.JustUpdateDeviceLine();
_bmp = _bmp.runMethod(false,"Rotate",(Object)(BA.numberCast(int.class, 270)));Debug.locals.put("bmp", _bmp);
 break; }
}
;
 BA.debugLineNum = 631;BA.debugLine="Return bmp";
Debug.JustUpdateDeviceLine();
if (true) return _bmp;
 BA.debugLineNum = 632;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmedia(RemoteObject __ref,RemoteObject _target,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("SetMedia (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setmedia")) { return __ref.runUserSub(false, "simplemediamanager","setmedia", __ref, _target, _url);}
Debug.locals.put("Target", _target);
Debug.locals.put("Url", _url);
 BA.debugLineNum = 91;BA.debugLine="Public Sub SetMedia(Target As B4XView, Url As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="SetMediaWithExtra(Target, Url, MIME_UNKNOWN, Crea";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_setmediawithextra" /*RemoteObject*/ ,(Object)(_target),(Object)(_url),(Object)(__ref.getField(true,"_mime_unknown" /*RemoteObject*/ )),(Object)(simplemediamanager.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}))));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmediafromfile(RemoteObject __ref,RemoteObject _target,RemoteObject _dir,RemoteObject _filename,RemoteObject _mime,RemoteObject _extra) throws Exception{
try {
		Debug.PushSubsStack("SetMediaFromFile (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("setmediafromfile")) { return __ref.runUserSub(false, "simplemediamanager","setmediafromfile", __ref, _target, _dir, _filename, _mime, _extra);}
Debug.locals.put("Target", _target);
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("Mime", _mime);
 BA.debugLineNum = 124;BA.debugLine="Public Sub SetMediaFromFile(Target As B4XView, Dir";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="If Extra = Null Or Extra.IsInitialized = False Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_extra) || RemoteObject.solveBoolean("=",_extra.runMethod(true,"IsInitialized"),simplemediamanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 126;BA.debugLine="Dim Extra As Map";
Debug.JustUpdateDeviceLine();
_extra = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Extra", _extra);
 BA.debugLineNum = 127;BA.debugLine="Extra.Initialize";
Debug.JustUpdateDeviceLine();
_extra.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 129;BA.debugLine="Extra.Put(REQUEST_DIR, IIf(Dir = \"\", FileName, Di";
Debug.JustUpdateDeviceLine();
_extra.runVoidMethod ("Put",(Object)((__ref.getField(true,"_request_dir" /*RemoteObject*/ ))),(Object)(((RemoteObject.solveBoolean("=",_dir,BA.ObjectToString(""))) ? ((_filename)) : ((_dir)))));
 BA.debugLineNum = 130;BA.debugLine="Extra.Put(REQUEST_FILE, IIf(Dir = \"\", \"\", FileNam";
Debug.JustUpdateDeviceLine();
_extra.runVoidMethod ("Put",(Object)((__ref.getField(true,"_request_file" /*RemoteObject*/ ))),(Object)(((RemoteObject.solveBoolean("=",_dir,BA.ObjectToString(""))) ? (RemoteObject.createImmutable((""))) : ((_filename)))));
 BA.debugLineNum = 131;BA.debugLine="If ViewsManager.MimeToMediaType(Mime) = ViewsMana";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).runClassMethod (b4a.example.smmviews.class, "_mimetomediatype" /*RemoteObject*/ ,(Object)(_mime)),BA.numberCast(double.class, __ref.getField(false,"_viewsmanager" /*RemoteObject*/ ).getField(true,"_media_type_none" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 132;BA.debugLine="Log(\"Invalid mime!\")";
Debug.JustUpdateDeviceLine();
simplemediamanager.__c.runVoidMethod ("LogImpl","910813448",RemoteObject.createImmutable("Invalid mime!"),0);
 BA.debugLineNum = 133;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 135;BA.debugLine="SetMediaWithExtra(Target, xui.FileUri(Dir, FileNa";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_setmediawithextra" /*RemoteObject*/ ,(Object)(_target),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"FileUri",(Object)(_dir),(Object)(_filename))),(Object)(_mime),(Object)(_extra));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmediawithextra(RemoteObject __ref,RemoteObject _target,RemoteObject _url,RemoteObject _mime,RemoteObject _extra) throws Exception{
try {
		Debug.PushSubsStack("SetMediaWithExtra (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("setmediawithextra")) { return __ref.runUserSub(false, "simplemediamanager","setmediawithextra", __ref, _target, _url, _mime, _extra);}
RemoteObject _request = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequest");
RemoteObject _rs = RemoteObject.declareNull("b4a.example.simplemediamanager._smmediarequestset");
Debug.locals.put("Target", _target);
Debug.locals.put("Url", _url);
Debug.locals.put("Mime", _mime);
 BA.debugLineNum = 107;BA.debugLine="Public Sub SetMediaWithExtra (Target As B4XView, U";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="If Mime = \"\" Then Mime = MIME_UNKNOWN";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_mime,BA.ObjectToString(""))) { 
_mime = __ref.getField(true,"_mime_unknown" /*RemoteObject*/ );Debug.locals.put("Mime", _mime);};
 BA.debugLineNum = 109;BA.debugLine="If Extra = Null Or Extra.IsInitialized = False Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_extra) || RemoteObject.solveBoolean("=",_extra.runMethod(true,"IsInitialized"),simplemediamanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 110;BA.debugLine="Dim Extra As Map";
Debug.JustUpdateDeviceLine();
_extra = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Extra", _extra);
 BA.debugLineNum = 111;BA.debugLine="Extra.Initialize";
Debug.JustUpdateDeviceLine();
_extra.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 113;BA.debugLine="Dim Request As SMMediaRequest = CreateSMMRequest2";
Debug.JustUpdateDeviceLine();
_request = __ref.runClassMethod (b4a.example.simplemediamanager.class, "_createsmmrequest2" /*RemoteObject*/ ,(Object)(_url),(Object)(_url),(Object)(_mime),(Object)(_extra));Debug.locals.put("Request", _request);Debug.locals.put("Request", _request);
 BA.debugLineNum = 114;BA.debugLine="Dim rs As SMMediaRequestSet = CreateSMMediaReques";
Debug.JustUpdateDeviceLine();
_rs = __ref.runClassMethod (b4a.example.simplemediamanager.class, "_createsmmediarequestset" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4a.example.simplemediamanager.class, "_clonerequest" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_defaultloadingrequest" /*RemoteObject*/ )))),(Object)(_request),(Object)(__ref.runClassMethod (b4a.example.simplemediamanager.class, "_clonerequest" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_defaulterrorrequest" /*RemoteObject*/ )))),(Object)(_target));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 117;BA.debugLine="If Extra.ContainsKey(REQUEST_CALLBACK) Then rs.Ca";
Debug.JustUpdateDeviceLine();
if (_extra.runMethod(true,"ContainsKey",(Object)((__ref.getField(true,"_request_callback" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
_rs.setField ("Callback" /*RemoteObject*/ ,_extra.runMethod(false,"Get",(Object)((__ref.getField(true,"_request_callback" /*RemoteObject*/ )))));};
 BA.debugLineNum = 118;BA.debugLine="SetMediaWithRequestSet(rs)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_setmediawithrequestset" /*RemoteObject*/ ,(Object)(_rs));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmediawithrequestset(RemoteObject __ref,RemoteObject _requestset) throws Exception{
try {
		Debug.PushSubsStack("SetMediaWithRequestSet (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("setmediawithrequestset")) { return __ref.runUserSub(false, "simplemediamanager","setmediawithrequestset", __ref, _requestset);}
Debug.locals.put("RequestSet", _requestset);
 BA.debugLineNum = 141;BA.debugLine="Public Sub SetMediaWithRequestSet (RequestSet As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="RegisterForMeta(RequestSet)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_registerformeta" /*void*/ ,(Object)(_requestset));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trimmediacache(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TrimMediaCache (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,411);
if (RapidSub.canDelegate("trimmediacache")) { return __ref.runUserSub(false, "simplemediamanager","trimmediacache", __ref);}
 BA.debugLineNum = 411;BA.debugLine="Public Sub TrimMediaCache";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 412;BA.debugLine="LastTrimCache = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lasttrimcache" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 413;BA.debugLine="TrimMediaCacheImpl";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_trimmediacacheimpl" /*RemoteObject*/ );
 BA.debugLineNum = 414;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _trimmediacacheimpl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TrimMediaCacheImpl (simplemediamanager) ","simplemediamanager",15,__ref.getField(false, "ba"),__ref,416);
if (RapidSub.canDelegate("trimmediacacheimpl")) { return __ref.runUserSub(false, "simplemediamanager","trimmediacacheimpl", __ref);}
RemoteObject _onlylookfordisconnectedtargets = RemoteObject.createImmutable(false);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _media = RemoteObject.declareNull("b4a.example.simplemediamanager._smmedia");
 BA.debugLineNum = 416;BA.debugLine="Private Sub TrimMediaCacheImpl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 417;BA.debugLine="If DateTime.Now > LastTrimCache + MinTimeBetweenT";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",simplemediamanager.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lasttrimcache" /*RemoteObject*/ ),__ref.getField(true,"_mintimebetweentrims" /*RemoteObject*/ )}, "+",1, 2))) { 
 BA.debugLineNum = 418;BA.debugLine="Dim OnlyLookForDisconnectedTargets As Boolean =";
Debug.JustUpdateDeviceLine();
_onlylookfordisconnectedtargets = BA.ObjectToBoolean(RemoteObject.solveBoolean("<",__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_maxmediacachesize" /*RemoteObject*/ ))));Debug.locals.put("OnlyLookForDisconnectedTargets", _onlylookfordisconnectedtargets);Debug.locals.put("OnlyLookForDisconnectedTargets", _onlylookfordisconnectedtargets);
 BA.debugLineNum = 419;BA.debugLine="LastTrimCache = DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lasttrimcache" /*RemoteObject*/ ,simplemediamanager.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 423;BA.debugLine="Dim i As Int = 0";
Debug.JustUpdateDeviceLine();
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 424;BA.debugLine="Do While i < MediaCache.Size";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, __ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_getsize" /*RemoteObject*/ )))) {
 BA.debugLineNum = 425;BA.debugLine="Dim Media As SMMedia = MediaCache.Get(MediaCach";
Debug.JustUpdateDeviceLine();
_media = (__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_i)))));Debug.locals.put("Media", _media);Debug.locals.put("Media", _media);
 BA.debugLineNum = 426;BA.debugLine="CancelDisconnectedTargets(Media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_canceldisconnectedtargets" /*RemoteObject*/ ,(Object)(_media));
 BA.debugLineNum = 427;BA.debugLine="If OnlyLookForDisconnectedTargets = False And M";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_onlylookfordisconnectedtargets,simplemediamanager.__c.getField(true,"False")) && RemoteObject.solveBoolean(">",__ref.getField(false,"_mediacache" /*RemoteObject*/ ).runClassMethod (b4a.example.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_maxmediacachesize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0)) && RemoteObject.solveBoolean("=",__ref.runClassMethod (b4a.example.simplemediamanager.class, "_ismediastillrelevant" /*RemoteObject*/ ,(Object)(_media)),simplemediamanager.__c.getField(true,"False"))) { 
 BA.debugLineNum = 428;BA.debugLine="DeleteMedia(Media)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.simplemediamanager.class, "_deletemedia" /*RemoteObject*/ ,(Object)(_media));
 BA.debugLineNum = 429;BA.debugLine="i = i - 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("i", _i);
 };
 BA.debugLineNum = 431;BA.debugLine="i = i + 1";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
;
 };
 BA.debugLineNum = 434;BA.debugLine="End Sub";
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