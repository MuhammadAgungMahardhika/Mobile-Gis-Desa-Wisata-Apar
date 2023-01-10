package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bitmapsasync_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private jme As JavaObject";
bitmapsasync._jme = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_jme",bitmapsasync._jme);
 //BA.debugLineNum = 7;BA.debugLine="Public MaxFileSize As Long = 3 * 1024 * 1024";
bitmapsasync._maxfilesize = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(3),RemoteObject.createImmutable(1024),RemoteObject.createImmutable(1024)}, "**",0, 1));__ref.setField("_maxfilesize",bitmapsasync._maxfilesize);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
bitmapsasync._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",bitmapsasync._xui);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bitmapsasync) ","bitmapsasync",18,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bitmapsasync","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="jme = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jme" /*RemoteObject*/ ).setObject (__ref);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadfromfile(RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _maxwidth,RemoteObject _maxheight) throws Exception{
try {
		Debug.PushSubsStack("LoadFromFile (bitmapsasync) ","bitmapsasync",18,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("loadfromfile")) { return __ref.runUserSub(false, "bitmapsasync","loadfromfile", __ref, _dir, _filename, _maxwidth, _maxheight);}
ResumableSub_LoadFromFile rsub = new ResumableSub_LoadFromFile(null,__ref,_dir,_filename,_maxwidth,_maxheight);
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
public static class ResumableSub_LoadFromFile extends BA.ResumableSub {
public ResumableSub_LoadFromFile(b4a.example.bitmapsasync parent,RemoteObject __ref,RemoteObject _dir,RemoteObject _filename,RemoteObject _maxwidth,RemoteObject _maxheight) {
this.parent = parent;
this.__ref = __ref;
this._dir = _dir;
this._filename = _filename;
this._maxwidth = _maxwidth;
this._maxheight = _maxheight;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.bitmapsasync parent;
RemoteObject _dir;
RemoteObject _filename;
RemoteObject _maxwidth;
RemoteObject _maxheight;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _bmp = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadFromFile (bitmapsasync) ","bitmapsasync",18,__ref.getField(false, "ba"),__ref,48);
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
Debug.locals.put("Dir", _dir);
Debug.locals.put("Filename", _filename);
Debug.locals.put("MaxWidth", _maxwidth);
Debug.locals.put("MaxHeight", _maxheight);
 BA.debugLineNum = 49;BA.debugLine="Dim res As B4XBitmap";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");Debug.locals.put("res", _res);
 BA.debugLineNum = 50;BA.debugLine="If Dir <> File.DirAssets Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean("!",_dir,parent.__c.getField(false,"File").runMethod(true,"getDirAssets"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 51;BA.debugLine="If File.Size(Dir, Filename) > MaxFileSize Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean(">",parent.__c.getField(false,"File").runMethod(true,"Size",(Object)(_dir),(Object)(_filename)),__ref.getField(true,"_maxfilesize" /*RemoteObject*/ ))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 52;BA.debugLine="Log($\"File larger than MaxFileSize $1.0{File.Si";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","913828100",(RemoteObject.concat(RemoteObject.createImmutable("File larger than MaxFileSize "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((parent.__c.getField(false,"File").runMethod(true,"Size",(Object)(_dir),(Object)(_filename))))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 53;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 64;BA.debugLine="Dim sf As Object = jme.RunMethod(\"loadBitmap\", Ar";
Debug.JustUpdateDeviceLine();
_sf = __ref.getField(false,"_jme" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("loadBitmap")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(parent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename)).getObject()),(parent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename)).getObject()),(_maxwidth),(_maxheight)})));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 65;BA.debugLine="Wait For (sf) Bitmap_Loaded (Success As Boolean,";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","bitmap_loaded", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "bitmapsasync", "loadfromfile"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_bmp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Bmp", _bmp);
;
 BA.debugLineNum = 70;BA.debugLine="If Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 9:
//if
this.state = 12;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 71;BA.debugLine="res = Bmp";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _bmp);Debug.locals.put("res", _res);
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 73;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
 BA.debugLineNum = 75;BA.debugLine="End Sub";
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
public static void  _bitmap_loaded(RemoteObject __ref,RemoteObject _success,RemoteObject _bmp) throws Exception{
}
public static RemoteObject  _loadfromhttpjob(RemoteObject __ref,RemoteObject _job,RemoteObject _maxwidth,RemoteObject _maxheight) throws Exception{
try {
		Debug.PushSubsStack("LoadFromHttpJob (bitmapsasync) ","bitmapsasync",18,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("loadfromhttpjob")) { return __ref.runUserSub(false, "bitmapsasync","loadfromhttpjob", __ref, _job, _maxwidth, _maxheight);}
ResumableSub_LoadFromHttpJob rsub = new ResumableSub_LoadFromHttpJob(null,__ref,_job,_maxwidth,_maxheight);
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
public static class ResumableSub_LoadFromHttpJob extends BA.ResumableSub {
public ResumableSub_LoadFromHttpJob(b4a.example.bitmapsasync parent,RemoteObject __ref,RemoteObject _job,RemoteObject _maxwidth,RemoteObject _maxheight) {
this.parent = parent;
this.__ref = __ref;
this._job = _job;
this._maxwidth = _maxwidth;
this._maxheight = _maxheight;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.bitmapsasync parent;
RemoteObject _job;
RemoteObject _maxwidth;
RemoteObject _maxheight;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _bmp = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadFromHttpJob (bitmapsasync) ","bitmapsasync",18,__ref.getField(false, "ba"),__ref,20);
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
Debug.locals.put("Job", _job);
Debug.locals.put("MaxWidth", _maxwidth);
Debug.locals.put("MaxHeight", _maxheight);
 BA.debugLineNum = 21;BA.debugLine="Dim res As B4XBitmap";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");Debug.locals.put("res", _res);
 BA.debugLineNum = 22;BA.debugLine="If Job.Success = False Then Return res";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 23;BA.debugLine="If Job.Response.ContentLength >= MaxFileSize Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("g",_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getContentLength"),__ref.getField(true,"_maxfilesize" /*RemoteObject*/ ))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 24;BA.debugLine="Log($\"File larger than MaxFileSize $1.0{Job.Resp";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("LogImpl","913762564",(RemoteObject.concat(RemoteObject.createImmutable("File larger than MaxFileSize "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("1.0")),(Object)((_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getContentLength")))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 25;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 35;BA.debugLine="Dim sf As Object = jme.RunMethod(\"loadBitmap\", Ar";
Debug.JustUpdateDeviceLine();
_sf = __ref.getField(false,"_jme" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("loadBitmap")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_job.runClassMethod (b4a.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject()),(_job.runClassMethod (b4a.example.httpjob.class, "_getinputstream" /*RemoteObject*/ ).getObject()),(_maxwidth),(_maxheight)})));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 36;BA.debugLine="Wait For (sf) Bitmap_Loaded (Success As Boolean,";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("WaitFor","bitmap_loaded", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "bitmapsasync", "loadfromhttpjob"), _sf);
this.state = 15;
return;
case 15:
//C
this.state = 11;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_bmp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Bmp", _bmp);
;
 BA.debugLineNum = 41;BA.debugLine="If Success Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 14;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 42;BA.debugLine="res = Bmp";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _bmp);Debug.locals.put("res", _res);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 44;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
 BA.debugLineNum = 46;BA.debugLine="End Sub";
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
}