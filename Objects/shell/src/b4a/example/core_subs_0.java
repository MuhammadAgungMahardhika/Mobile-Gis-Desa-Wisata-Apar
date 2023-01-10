package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class core_subs_0 {


public static RemoteObject  _executeurl(RemoteObject _ba,RemoteObject _url,RemoteObject _parameters,RemoteObject _jobname,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("ExecuteUrl (core) ","core",4,_ba,core.mostCurrent,9);
if (RapidSub.canDelegate("executeurl")) { return b4a.example.core.remoteMe.runUserSub(false, "core","executeurl", _ba, _url, _parameters, _jobname, _obj);}
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
;
Debug.locals.put("Url", _url);
Debug.locals.put("Parameters", _parameters);
Debug.locals.put("JobName", _jobname);
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 9;BA.debugLine="Sub ExecuteUrl(Url As String, Parameters As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(512);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 11;BA.debugLine="job.Initialize(JobName, Obj)";
Debug.ShouldStop(1024);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(_jobname),(Object)(_obj));
 BA.debugLineNum = 12;BA.debugLine="job.PostString(Url, Parameters)";
Debug.ShouldStop(2048);
_job.runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url),(Object)(_parameters));
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _executeurlget(RemoteObject _ba,RemoteObject _url,RemoteObject _jobname,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("ExecuteUrlGet (core) ","core",4,_ba,core.mostCurrent,15);
if (RapidSub.canDelegate("executeurlget")) { return b4a.example.core.remoteMe.runUserSub(false, "core","executeurlget", _ba, _url, _jobname, _obj);}
RemoteObject _job = RemoteObject.declareNull("b4a.example.httpjob");
;
Debug.locals.put("Url", _url);
Debug.locals.put("JobName", _jobname);
Debug.locals.put("Obj", _obj);
 BA.debugLineNum = 15;BA.debugLine="Sub ExecuteUrlGet(Url As String, JobName As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(32768);
_job = RemoteObject.createNew ("b4a.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 17;BA.debugLine="job.Initialize(JobName, Obj)";
Debug.ShouldStop(65536);
_job.runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(_jobname),(Object)(_obj));
 BA.debugLineNum = 18;BA.debugLine="job.Download(Url)";
Debug.ShouldStop(131072);
_job.runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}