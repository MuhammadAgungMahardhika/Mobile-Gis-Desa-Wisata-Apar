package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",6,starter.processBA,starter.mostCurrent,37);
if (RapidSub.canDelegate("application_error")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 37;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createbitmap() throws Exception{
try {
		Debug.PushSubsStack("CreateBitmap (starter) ","starter",6,starter.processBA,starter.mostCurrent,98);
if (RapidSub.canDelegate("createbitmap")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","createbitmap");}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _rect = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
RemoteObject _path = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _x = RemoteObject.createImmutable(0f);
RemoteObject _y = RemoteObject.createImmutable(0f);
RemoteObject _radius = RemoteObject.createImmutable(0f);
 BA.debugLineNum = 98;BA.debugLine="Sub CreateBitmap As Canvas";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="Public bmp  As Bitmap";
Debug.ShouldStop(4);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 100;BA.debugLine="bmp.InitializeMutable(200dip, 200dip)";
Debug.ShouldStop(8);
_bmp.runVoidMethod ("InitializeMutable",(Object)(starter.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(starter.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 101;BA.debugLine="Public cvs As Canvas";
Debug.ShouldStop(16);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 102;BA.debugLine="cvs.Initialize2(bmp)";
Debug.ShouldStop(32);
_cvs.runVoidMethod ("Initialize2",(Object)((_bmp.getObject())));
 BA.debugLineNum = 103;BA.debugLine="Public rect As Rect";
Debug.ShouldStop(64);
_rect = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("rect", _rect);
 BA.debugLineNum = 104;BA.debugLine="rect.Initialize(0, 0, bmp.Width, bmp.Height)";
Debug.ShouldStop(128);
_rect.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_bmp.runMethod(true,"getWidth")),(Object)(_bmp.runMethod(true,"getHeight")));
 BA.debugLineNum = 105;BA.debugLine="cvs.DrawRect(rect, Colors.Transparent, True, 0)";
Debug.ShouldStop(256);
_cvs.runVoidMethod ("DrawRect",(Object)((_rect.getObject())),(Object)(starter.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(starter.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 106;BA.debugLine="Public path As Path";
Debug.ShouldStop(512);
_path = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper");Debug.locals.put("path", _path);
 BA.debugLineNum = 107;BA.debugLine="path.Initialize(0, 0)";
Debug.ShouldStop(1024);
_path.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 108;BA.debugLine="Public jo As JavaObject = path";
Debug.ShouldStop(2048);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _path.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 109;BA.debugLine="Public x = 100dip, y = 100dip, radius = 100dip As";
Debug.ShouldStop(4096);
_x = BA.numberCast(float.class, starter.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
_y = BA.numberCast(float.class, starter.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
_radius = BA.numberCast(float.class, starter.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))));Debug.locals.put("radius", _radius);Debug.locals.put("radius", _radius);
 BA.debugLineNum = 110;BA.debugLine="jo.RunMethod(\"addCircle\", Array As Object(x, y, r";
Debug.ShouldStop(8192);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addCircle")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_x),(_y),(_radius),(RemoteObject.createImmutable("CW"))})));
 BA.debugLineNum = 111;BA.debugLine="cvs.ClipPath(path)";
Debug.ShouldStop(16384);
_cvs.runVoidMethod ("ClipPath",(Object)((_path.getObject())));
 BA.debugLineNum = 112;BA.debugLine="Return cvs";
Debug.ShouldStop(32768);
if (true) return _cvs;
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download(RemoteObject _imagemap) throws Exception{
try {
		Debug.PushSubsStack("Download (starter) ","starter",6,starter.processBA,starter.mostCurrent,76);
if (RapidSub.canDelegate("download")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","download", _imagemap);}
int _i = 0;
RemoteObject _path = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
Debug.locals.put("ImageMap", _imagemap);
 BA.debugLineNum = 76;BA.debugLine="Sub Download (ImageMap As Map)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="For i = 0 To ImageMap.Size - 1";
Debug.ShouldStop(4096);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {_imagemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 78;BA.debugLine="tasks.Put(ImageMap.GetKeyAt(i), ImageMap.GetValu";
Debug.ShouldStop(8192);
starter._tasks.runVoidMethod ("Put",(Object)(_imagemap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_imagemap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i)))));
 BA.debugLineNum = 79;BA.debugLine="Public path As String = ImageMap.GetValueAt(i)";
Debug.ShouldStop(16384);
_path = BA.ObjectToString(_imagemap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("path", _path);Debug.locals.put("path", _path);
 BA.debugLineNum = 80;BA.debugLine="If cache.ContainsKey(path) Then";
Debug.ShouldStop(32768);
if (starter._cache.runMethod(true,"ContainsKey",(Object)((_path))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 81;BA.debugLine="Public iv As ImageView = ImageMap.GetKeyAt(i)";
Debug.ShouldStop(65536);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), _imagemap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 82;BA.debugLine="iv.SetBackgroundImage(cache.Get(path))";
Debug.ShouldStop(131072);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((starter._cache.runMethod(false,"Get",(Object)((_path))))));
 }else 
{ BA.debugLineNum = 83;BA.debugLine="Else If ongoingTasks.ContainsKey(path) = False T";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",starter._ongoingtasks.runMethod(true,"ContainsKey",(Object)((_path))),starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 84;BA.debugLine="ongoingTasks.Put(path, \"\")";
Debug.ShouldStop(524288);
starter._ongoingtasks.runVoidMethod ("Put",(Object)((_path)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 85;BA.debugLine="Public Job As HttpJob";
Debug.ShouldStop(1048576);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 86;BA.debugLine="Job.Initialize(path, Me)";
Debug.ShouldStop(2097152);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,starter.processBA,(Object)(_path),(Object)(starter.getObject()));
 BA.debugLineNum = 87;BA.debugLine="Job.Download(path)";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_path));
 }}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawroundbitmap(RemoteObject _cvs,RemoteObject _bmp) throws Exception{
try {
		Debug.PushSubsStack("DrawRoundBitmap (starter) ","starter",6,starter.processBA,starter.mostCurrent,92);
if (RapidSub.canDelegate("drawroundbitmap")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","drawroundbitmap", _cvs, _bmp);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
Debug.locals.put("cvs", _cvs);
Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 92;BA.debugLine="Sub DrawRoundBitmap (cvs As Canvas, bmp As Bitmap)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Public r As Rect";
Debug.ShouldStop(268435456);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("r", _r);
 BA.debugLineNum = 94;BA.debugLine="r.Initialize(0, 0, cvs.Bitmap.Width, cvs.Bitmap.H";
Debug.ShouldStop(536870912);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_cvs.runMethod(false,"getBitmap").runMethod(true,"getWidth")),(Object)(_cvs.runMethod(false,"getBitmap").runMethod(true,"getHeight")));
 BA.debugLineNum = 95;BA.debugLine="cvs.DrawBitmap(bmp, Null, r)";
Debug.ShouldStop(1073741824);
_cvs.runVoidMethod ("DrawBitmap",(Object)((_bmp.getObject())),(Object)((starter.mostCurrent.__c.getField(false,"Null"))),(Object)((_r.getObject())));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gps_locationchanged(RemoteObject _location1) throws Exception{
try {
		Debug.PushSubsStack("GPS_LocationChanged (starter) ","starter",6,starter.processBA,starter.mostCurrent,61);
if (RapidSub.canDelegate("gps_locationchanged")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","gps_locationchanged", _location1);}
RemoteObject _currentlat = RemoteObject.createImmutable("");
RemoteObject _currentlng = RemoteObject.createImmutable("");
Debug.locals.put("Location1", _location1);
 BA.debugLineNum = 61;BA.debugLine="Sub GPS_LocationChanged(Location1 As Location)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim currentLat, currentLng As String";
Debug.ShouldStop(536870912);
_currentlat = RemoteObject.createImmutable("");Debug.locals.put("currentLat", _currentlat);
_currentlng = RemoteObject.createImmutable("");Debug.locals.put("currentLng", _currentlng);
 BA.debugLineNum = 63;BA.debugLine="currentLat = Location1.Latitude";
Debug.ShouldStop(1073741824);
_currentlat = BA.NumberToString(_location1.runMethod(true,"getLatitude"));Debug.locals.put("currentLat", _currentlat);
 BA.debugLineNum = 64;BA.debugLine="currentLng = Location1.Longitude";
Debug.ShouldStop(-2147483648);
_currentlng = BA.NumberToString(_location1.runMethod(true,"getLongitude"));Debug.locals.put("currentLng", _currentlng);
 BA.debugLineNum = 65;BA.debugLine="If currentLat <> lat And currentLng <> lng Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("!",_currentlat,starter._lat) && RemoteObject.solveBoolean("!",_currentlng,starter._lng)) { 
 BA.debugLineNum = 66;BA.debugLine="lat = currentLat";
Debug.ShouldStop(2);
starter._lat = _currentlat;
 BA.debugLineNum = 67;BA.debugLine="lng = currentLng";
Debug.ShouldStop(4);
starter._lng = _currentlng;
 BA.debugLineNum = 68;BA.debugLine="Log(\"Current Location\")";
Debug.ShouldStop(8);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","13670023",RemoteObject.createImmutable("Current Location"),0);
 BA.debugLineNum = 69;BA.debugLine="Log(\"Lat = \" & lat)";
Debug.ShouldStop(16);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","13670024",RemoteObject.concat(RemoteObject.createImmutable("Lat = "),starter._lat),0);
 BA.debugLineNum = 70;BA.debugLine="Log(\"Lng = \" & lng)";
Debug.ShouldStop(32);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","13670025",RemoteObject.concat(RemoteObject.createImmutable("Lng = "),starter._lng),0);
 BA.debugLineNum = 72;BA.debugLine="CallSub(MapsAt, \"UpdateLocation\")";
Debug.ShouldStop(128);
starter.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",starter.processBA,(Object)((starter.mostCurrent._mapsat.getObject())),(Object)(RemoteObject.createImmutable("UpdateLocation")));
 };
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (starter) ","starter",6,starter.processBA,starter.mostCurrent,115);
if (RapidSub.canDelegate("jobdone")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","jobdone", _job);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
int _i = 0;
RemoteObject _path = RemoteObject.createImmutable("");
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _canvas = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 115;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 116;BA.debugLine="ongoingTasks.Remove(Job.JobName)";
Debug.ShouldStop(524288);
starter._ongoingtasks.runVoidMethod ("Remove",(Object)((_job.getField(true,"_jobname" /*RemoteObject*/ ))));
 BA.debugLineNum = 117;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1048576);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 118;BA.debugLine="Public bmp As Bitmap = Job.GetBitmap";
Debug.ShouldStop(2097152);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bmp = _job.runClassMethod (b4a.example.httpjob.class, "_getbitmap" /*RemoteObject*/ );Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 119;BA.debugLine="If tasks.IsInitialized Then";
Debug.ShouldStop(4194304);
if (starter._tasks.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="For i = 0 To tasks.Size - 1";
Debug.ShouldStop(8388608);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {starter._tasks.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 121;BA.debugLine="Public path As String = tasks.GetValueAt(i)";
Debug.ShouldStop(16777216);
_path = BA.ObjectToString(starter._tasks.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("path", _path);Debug.locals.put("path", _path);
 BA.debugLineNum = 122;BA.debugLine="If path = Job.JobName Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_path,_job.getField(true,"_jobname" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 123;BA.debugLine="Public iv As ImageView = tasks.GetKeyAt(i)";
Debug.ShouldStop(67108864);
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
_iv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ImageViewWrapper"), starter._tasks.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 124;BA.debugLine="Public canvas As Canvas = CreateBitmap";
Debug.ShouldStop(134217728);
_canvas = _createbitmap();Debug.locals.put("canvas", _canvas);Debug.locals.put("canvas", _canvas);
 BA.debugLineNum = 125;BA.debugLine="DrawRoundBitmap(canvas, bmp)";
Debug.ShouldStop(268435456);
_drawroundbitmap(_canvas,_bmp);
 BA.debugLineNum = 126;BA.debugLine="iv.SetBackgroundImage(canvas.Bitmap)";
Debug.ShouldStop(536870912);
_iv.runVoidMethod ("SetBackgroundImageNew",(Object)((_canvas.runMethod(false,"getBitmap").getObject())));
 BA.debugLineNum = 127;BA.debugLine="cache.Put(Job.JobName, canvas.Bitmap)";
Debug.ShouldStop(1073741824);
starter._cache.runVoidMethod ("Put",(Object)((_job.getField(true,"_jobname" /*RemoteObject*/ ))),(Object)((_canvas.runMethod(false,"getBitmap").getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 }else {
 BA.debugLineNum = 132;BA.debugLine="Log(\"Error downloading image: \" & Job.JobName &";
Debug.ShouldStop(8);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","13932177",RemoteObject.concat(RemoteObject.createImmutable("Error downloading image: "),_job.getField(true,"_jobname" /*RemoteObject*/ ),starter.mostCurrent.__c.getField(true,"CRLF"),_job.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 };
 BA.debugLineNum = 134;BA.debugLine="Job.Release";
Debug.ShouldStop(32);
_job.runClassMethod (b4a.example.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public GPS1 As GPS";
starter._gps1 = RemoteObject.createNew ("anywheresoftware.b4a.gps.GPS");
 //BA.debugLineNum = 10;BA.debugLine="Private gpsStarted As Boolean";
starter._gpsstarted = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 11;BA.debugLine="Public rp As RuntimePermissions";
starter._rp = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");
 //BA.debugLineNum = 12;BA.debugLine="Public lat, lng As String";
starter._lat = RemoteObject.createImmutable("");
starter._lng = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Public selectedObj As Map";
starter._selectedobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 14;BA.debugLine="Private tasks As Map";
starter._tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 15;BA.debugLine="Private cache As Map";
starter._cache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 16;BA.debugLine="Private ongoingTasks As Map";
starter._ongoingtasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",6,starter.processBA,starter.mostCurrent,19);
if (RapidSub.canDelegate("service_create")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 19;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(262144);
 BA.debugLineNum = 22;BA.debugLine="tasks.Initialize";
Debug.ShouldStop(2097152);
starter._tasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="cache.Initialize";
Debug.ShouldStop(4194304);
starter._cache.runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="ongoingTasks.Initialize";
Debug.ShouldStop(8388608);
starter._ongoingtasks.runVoidMethod ("Initialize");
 BA.debugLineNum = 25;BA.debugLine="GPS1.Initialize(\"GPS\")";
Debug.ShouldStop(16777216);
starter._gps1.runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("GPS")));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",6,starter.processBA,starter.mostCurrent,41);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 41;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",6,starter.processBA,starter.mostCurrent,28);
if (RapidSub.canDelegate("service_start")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 28;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
Debug.ShouldStop(268435456);
starter.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",6,starter.processBA,starter.mostCurrent,32);
if (RapidSub.canDelegate("service_taskremoved")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");}
 BA.debugLineNum = 32;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startgps() throws Exception{
try {
		Debug.PushSubsStack("StartGPS (starter) ","starter",6,starter.processBA,starter.mostCurrent,45);
if (RapidSub.canDelegate("startgps")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","startgps");}
 BA.debugLineNum = 45;BA.debugLine="Sub StartGPS";
Debug.ShouldStop(4096);
 BA.debugLineNum = 46;BA.debugLine="If gpsStarted = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",starter._gpsstarted,starter.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 47;BA.debugLine="GPS1.Start(0, 0)";
Debug.ShouldStop(16384);
starter._gps1.runVoidMethodAndSync ("Start",starter.processBA,(Object)(BA.numberCast(long.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 48;BA.debugLine="gpsStarted = True";
Debug.ShouldStop(32768);
starter._gpsstarted = starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 49;BA.debugLine="Log(\"GPS is started\")";
Debug.ShouldStop(65536);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","13538948",RemoteObject.createImmutable("GPS is started"),0);
 };
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stopgps() throws Exception{
try {
		Debug.PushSubsStack("StopGPS (starter) ","starter",6,starter.processBA,starter.mostCurrent,53);
if (RapidSub.canDelegate("stopgps")) { return b4a.example.starter.remoteMe.runUserSub(false, "starter","stopgps");}
 BA.debugLineNum = 53;BA.debugLine="Sub StopGPS";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="If gpsStarted Then";
Debug.ShouldStop(2097152);
if (starter._gpsstarted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 55;BA.debugLine="GPS1.Stop";
Debug.ShouldStop(4194304);
starter._gps1.runVoidMethod ("Stop");
 BA.debugLineNum = 56;BA.debugLine="gpsStarted = False";
Debug.ShouldStop(8388608);
starter._gpsstarted = starter.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 57;BA.debugLine="Log(\"GPS is stopped\")";
Debug.ShouldStop(16777216);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","13604484",RemoteObject.createImmutable("GPS is stopped"),0);
 };
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}