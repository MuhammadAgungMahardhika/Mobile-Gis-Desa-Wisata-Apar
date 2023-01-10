package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class core {
private static core mostCurrent = new core();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.main _main = null;
public b4a.example.detailat _detailat = null;
public b4a.example.homevisitor _homevisitor = null;
public b4a.example.detailev _detailev = null;
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
public static String  _executeurl(anywheresoftware.b4a.BA _ba,String _url,String _parameters,String _jobname,Object _obj) throws Exception{
RDebugUtils.currentModule="core";
if (Debug.shouldDelegate(null, "executeurl", false))
	 {return ((String) Debug.delegate(null, "executeurl", new Object[] {_ba,_url,_parameters,_jobname,_obj}));}
b4a.example.httpjob _job = null;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub ExecuteUrl(Url As String, Parameters As String";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="job.Initialize(JobName, Obj)";
_job._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_jobname,_obj);
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="job.PostString(Url, Parameters)";
_job._poststring /*String*/ (null,_url,_parameters);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="End Sub";
return "";
}
public static String  _executeurlget(anywheresoftware.b4a.BA _ba,String _url,String _jobname,Object _obj) throws Exception{
RDebugUtils.currentModule="core";
if (Debug.shouldDelegate(null, "executeurlget", false))
	 {return ((String) Debug.delegate(null, "executeurlget", new Object[] {_ba,_url,_jobname,_obj}));}
b4a.example.httpjob _job = null;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub ExecuteUrlGet(Url As String, JobName As String";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim job As HttpJob";
_job = new b4a.example.httpjob();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="job.Initialize(JobName, Obj)";
_job._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA),_jobname,_obj);
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="job.Download(Url)";
_job._download /*String*/ (null,_url);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="End Sub";
return "";
}
}