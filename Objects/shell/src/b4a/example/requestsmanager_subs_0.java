package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class requestsmanager_subs_0 {


public static RemoteObject  _cancelrequest(RemoteObject __ref,RemoteObject _url,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("CancelRequest (requestsmanager) ","requestsmanager",17,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("cancelrequest")) { return __ref.runUserSub(false, "requestsmanager","cancelrequest", __ref, _url, _job);}
Debug.locals.put("URL", _url);
Debug.locals.put("Job", _job);
 BA.debugLineNum = 9;BA.debugLine="Public Sub CancelRequest (URL As String, Job As Ht";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="Log(\"Add HU2_PUBLIC is missing from the build con";
Debug.JustUpdateDeviceLine();
requestsmanager.__c.runVoidMethod ("LogImpl","913565986",RemoteObject.createImmutable("Add HU2_PUBLIC is missing from the build configuration. Can't cancel request."),0);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (requestsmanager) ","requestsmanager",17,__ref.getField(false, "ba"),__ref,5);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "requestsmanager","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 7;BA.debugLine="End Sub";
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