package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class listev_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (listev) ","listev",11,listev.mostCurrent.activityBA,listev.mostCurrent,37);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.listev.remoteMe.runUserSub(false, "listev","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 37;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16);
 BA.debugLineNum = 40;BA.debugLine="Activity.LoadLayout(\"MainScrollView\")";
Debug.ShouldStop(128);
listev.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("MainScrollView")),listev.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="MainScroll.Panel.LoadLayout(\"List\")";
Debug.ShouldStop(256);
listev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("List")),listev.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="PanelList.Height = MainScroll.Height";
Debug.ShouldStop(512);
listev.mostCurrent._panellist.runMethod(true,"setHeight",listev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 43;BA.debugLine="MainScroll.Panel.Height = MainScroll.Height";
Debug.ShouldStop(1024);
listev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",listev.mostCurrent._mainscroll.runMethod(true,"getHeight"));
 BA.debugLineNum = 44;BA.debugLine="TitleNavbar.Text = \"List Event\"";
Debug.ShouldStop(2048);
listev.mostCurrent._titlenavbar.runMethod(true,"setText",BA.ObjectToCharSequence("List Event"));
 BA.debugLineNum = 45;BA.debugLine="btnRefresh.Visible = False";
Debug.ShouldStop(4096);
listev.mostCurrent._btnrefresh.runMethod(true,"setVisible",listev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 46;BA.debugLine="loadRefresh.Visible = True";
Debug.ShouldStop(8192);
listev.mostCurrent._loadrefresh.runMethod(true,"setVisible",listev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 48;BA.debugLine="imgMap.Initialize";
Debug.ShouldStop(32768);
listev.mostCurrent._imgmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="MediaManager.Initialize";
Debug.ShouldStop(65536);
listev.mostCurrent._mediamanager.runClassMethod (b4a.example.simplemediamanager.class, "_initialize" /*RemoteObject*/ ,listev.mostCurrent.activityBA);
 BA.debugLineNum = 50;BA.debugLine="CLV.Clear";
Debug.ShouldStop(131072);
listev.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 51;BA.debugLine="imgMap.Clear";
Debug.ShouldStop(262144);
listev.mostCurrent._imgmap.runVoidMethod ("Clear");
 BA.debugLineNum = 52;BA.debugLine="Core.ExecuteUrlGet(Main.server&\"event\", \"LoadEV\",";
Debug.ShouldStop(524288);
listev.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,listev.mostCurrent.activityBA,(Object)(RemoteObject.concat(listev.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("event"))),(Object)(BA.ObjectToString("LoadEV")),(Object)(listev.getObject()));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (listev) ","listev",11,listev.mostCurrent.activityBA,listev.mostCurrent,61);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.listev.remoteMe.runUserSub(false, "listev","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 61;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (listev) ","listev",11,listev.mostCurrent.activityBA,listev.mostCurrent,55);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.listev.remoteMe.runUserSub(false, "listev","activity_resume");}
RemoteObject _extra = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Log(\"ListEV loaded\")";
Debug.ShouldStop(8388608);
listev.mostCurrent.__c.runVoidMethod ("LogImpl","16356993",RemoteObject.createImmutable("ListEV loaded"),0);
 BA.debugLineNum = 57;BA.debugLine="Dim extra As Map = CreateMap(MediaManager.REQUEST";
Debug.ShouldStop(16777216);
_extra = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extra = listev.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(listev.mostCurrent._mediamanager.getField(true,"_request_resize_mode" /*RemoteObject*/ )),(RemoteObject.createImmutable("FILL_NO_DISTORTIONS"))}));Debug.locals.put("extra", _extra);Debug.locals.put("extra", _extra);
 BA.debugLineNum = 58;BA.debugLine="DownloadImg(imgMap, isDownloadReady, extra)";
Debug.ShouldStop(33554432);
_downloadimg(listev.mostCurrent._imgmap,listev._isdownloadready,_extra);
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
public static RemoteObject  _btnback_click() throws Exception{
try {
		Debug.PushSubsStack("BtnBack_Click (listev) ","listev",11,listev.mostCurrent.activityBA,listev.mostCurrent,65);
if (RapidSub.canDelegate("btnback_click")) { return b4a.example.listev.remoteMe.runUserSub(false, "listev","btnback_click");}
 BA.debugLineNum = 65;BA.debugLine="Private Sub BtnBack_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="Log(\"Going back to previous activity\")";
Debug.ShouldStop(2);
listev.mostCurrent.__c.runVoidMethod ("LogImpl","16488065",RemoteObject.createImmutable("Going back to previous activity"),0);
 BA.debugLineNum = 67;BA.debugLine="Activity.Finish";
Debug.ShouldStop(4);
listev.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnrefresh_click() throws Exception{
try {
		Debug.PushSubsStack("btnRefresh_Click (listev) ","listev",11,listev.mostCurrent.activityBA,listev.mostCurrent,144);
if (RapidSub.canDelegate("btnrefresh_click")) { return b4a.example.listev.remoteMe.runUserSub(false, "listev","btnrefresh_click");}
 BA.debugLineNum = 144;BA.debugLine="Private Sub btnRefresh_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="Log(\"Refreshing ListEV...\")";
Debug.ShouldStop(65536);
listev.mostCurrent.__c.runVoidMethod ("LogImpl","16815745",RemoteObject.createImmutable("Refreshing ListEV..."),0);
 BA.debugLineNum = 146;BA.debugLine="btnRefresh.Visible = False";
Debug.ShouldStop(131072);
listev.mostCurrent._btnrefresh.runMethod(true,"setVisible",listev.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 147;BA.debugLine="loadRefresh.Visible = True";
Debug.ShouldStop(262144);
listev.mostCurrent._loadrefresh.runMethod(true,"setVisible",listev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 148;BA.debugLine="Core.ExecuteUrlGet(Main.server&\"event\", \"LoadEV\",";
Debug.ShouldStop(524288);
listev.mostCurrent._core.runVoidMethod ("_executeurlget" /*RemoteObject*/ ,listev.mostCurrent.activityBA,(Object)(RemoteObject.concat(listev.mostCurrent._main._server /*RemoteObject*/ ,RemoteObject.createImmutable("event"))),(Object)(BA.ObjectToString("LoadEV")),(Object)(listev.getObject()));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clv_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV_ItemClick (listev) ","listev",11,listev.mostCurrent.activityBA,listev.mostCurrent,70);
if (RapidSub.canDelegate("clv_itemclick")) { return b4a.example.listev.remoteMe.runUserSub(false, "listev","clv_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 70;BA.debugLine="Private Sub CLV_ItemClick (Index As Int, Value As";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject _id,RemoteObject _name,RemoteObject _date,RemoteObject _img) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (listev) ","listev",11,listev.mostCurrent.activityBA,listev.mostCurrent,89);
if (RapidSub.canDelegate("createitem")) { return b4a.example.listev.remoteMe.runUserSub(false, "listev","createitem", _id, _name, _date, _img);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _imgpath = RemoteObject.createImmutable("");
Debug.locals.put("id", _id);
Debug.locals.put("name", _name);
Debug.locals.put("date", _date);
Debug.locals.put("img", _img);
 BA.debugLineNum = 89;BA.debugLine="Private Sub CreateItem (id As String, name As Stri";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 90;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_p = listev._xui.runMethod(false,"CreatePanel",listev.processBA,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 91;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 100%x, 160dip)";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(listev.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),listev.mostCurrent.activityBA)),(Object)(listev.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 160)))));
 BA.debugLineNum = 92;BA.debugLine="p.LoadLayout(\"itemEV\")";
Debug.ShouldStop(134217728);
_p.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("itemEV")),listev.mostCurrent.activityBA);
 BA.debugLineNum = 94;BA.debugLine="idEV.Text = id";
Debug.ShouldStop(536870912);
listev.mostCurrent._idev.runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 95;BA.debugLine="nameEV.Text = name";
Debug.ShouldStop(1073741824);
listev.mostCurrent._nameev.runMethod(true,"setText",BA.ObjectToCharSequence(_name));
 BA.debugLineNum = 96;BA.debugLine="dateEV.Text = date";
Debug.ShouldStop(-2147483648);
listev.mostCurrent._dateev.runMethod(true,"setText",BA.ObjectToCharSequence(_date));
 BA.debugLineNum = 98;BA.debugLine="Dim imgPath As String = Main.baseServer & \"media/";
Debug.ShouldStop(2);
_imgpath = RemoteObject.concat(listev.mostCurrent._main._baseserver /*RemoteObject*/ ,RemoteObject.createImmutable("media/photos/"),_img);Debug.locals.put("imgPath", _imgpath);Debug.locals.put("imgPath", _imgpath);
 BA.debugLineNum = 99;BA.debugLine="Log(img)";
Debug.ShouldStop(4);
listev.mostCurrent.__c.runVoidMethod ("LogImpl","16684682",_img,0);
 BA.debugLineNum = 100;BA.debugLine="imgMap.Put(ivEV, imgPath)";
Debug.ShouldStop(8);
listev.mostCurrent._imgmap.runVoidMethod ("Put",(Object)((listev.mostCurrent._ivev.getObject())),(Object)((_imgpath)));
 BA.debugLineNum = 101;BA.debugLine="Return p";
Debug.ShouldStop(16);
if (true) return _p;
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadimg(RemoteObject _imagemap,RemoteObject _readytodownload,RemoteObject _extra) throws Exception{
try {
		Debug.PushSubsStack("DownloadImg (listev) ","listev",11,listev.mostCurrent.activityBA,listev.mostCurrent,151);
if (RapidSub.canDelegate("downloadimg")) { return b4a.example.listev.remoteMe.runUserSub(false, "listev","downloadimg", _imagemap, _readytodownload, _extra);}
int _i = 0;
Debug.locals.put("ImageMap", _imagemap);
Debug.locals.put("readyToDownload", _readytodownload);
Debug.locals.put("extra", _extra);
 BA.debugLineNum = 151;BA.debugLine="Sub DownloadImg (ImageMap As Map, readyToDownload";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="If readyToDownload Then";
Debug.ShouldStop(8388608);
if (_readytodownload.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 153;BA.debugLine="If extra.Size > 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(">",_extra.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 154;BA.debugLine="For i = 0 To ImageMap.Size - 1";
Debug.ShouldStop(33554432);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_imagemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 155;BA.debugLine="Log(\"Getting \"&ImageMap.GetValueAt(i)&\"@\"&Imag";
Debug.ShouldStop(67108864);
listev.mostCurrent.__c.runVoidMethod ("LogImpl","16881284",RemoteObject.concat(RemoteObject.createImmutable("Getting "),_imagemap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable("@"),_imagemap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),0);
 BA.debugLineNum = 156;BA.debugLine="MediaManager.SetMediaWithExtra(ImageMap.GetKey";
Debug.ShouldStop(134217728);
listev.mostCurrent._mediamanager.runClassMethod (b4a.example.simplemediamanager.class, "_setmediawithextra" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _imagemap.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(BA.ObjectToString(_imagemap.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _i))))),(Object)(BA.ObjectToString("")),(Object)(_extra));
 }
}Debug.locals.put("i", _i);
;
 };
 };
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private BtnBack As Button";
listev.mostCurrent._btnback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private MainScroll As ScrollView";
listev.mostCurrent._mainscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private TitleNavbar As Label";
listev.mostCurrent._titlenavbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private Navbar As Panel";
listev.mostCurrent._navbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnRefresh As Button";
listev.mostCurrent._btnrefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private loadRefresh As ProgressBar";
listev.mostCurrent._loadrefresh = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private CLV As CustomListView";
listev.mostCurrent._clv = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 25;BA.debugLine="Private PanelList As Panel";
listev.mostCurrent._panellist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelListItem As Panel";
listev.mostCurrent._panellistitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private idEV As Label";
listev.mostCurrent._idev = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private nameEV As Label";
listev.mostCurrent._nameev = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private dateEV As Label";
listev.mostCurrent._dateev = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private ivEV As B4XView";
listev.mostCurrent._ivev = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private imgMap As Map";
listev.mostCurrent._imgmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 33;BA.debugLine="Private MediaManager As SimpleMediaManager";
listev.mostCurrent._mediamanager = RemoteObject.createNew ("b4a.example.simplemediamanager");
 //BA.debugLineNum = 34;BA.debugLine="Private PanelListEV As Panel";
listev.mostCurrent._panellistev = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (listev) ","listev",11,listev.mostCurrent.activityBA,listev.mostCurrent,104);
if (RapidSub.canDelegate("jobdone")) { return b4a.example.listev.remoteMe.runUserSub(false, "listev","jobdone", _job);}
RemoteObject _res = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _ev = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _extra = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 104;BA.debugLine="Sub JobDone (Job As HttpJob)";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="Log(\"JobName = \" & Job.JobName & \", Success = \" &";
Debug.ShouldStop(256);
listev.mostCurrent.__c.runVoidMethod ("LogImpl","16750209",RemoteObject.concat(RemoteObject.createImmutable("JobName = "),_job.getField(true,"_jobname" /*RemoteObject*/ ),RemoteObject.createImmutable(", Success = "),_job.getField(true,"_success" /*RemoteObject*/ )),0);
 BA.debugLineNum = 106;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(512);
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 107;BA.debugLine="Dim res As String";
Debug.ShouldStop(1024);
_res = RemoteObject.createImmutable("");Debug.locals.put("res", _res);
 BA.debugLineNum = 108;BA.debugLine="res = Job.GetString";
Debug.ShouldStop(2048);
_res = _job.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("res", _res);
 BA.debugLineNum = 109;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(4096);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 110;BA.debugLine="parser.Initialize(res)";
Debug.ShouldStop(8192);
_parser.runVoidMethod ("Initialize",(Object)(_res));
 BA.debugLineNum = 112;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("LoadEV"))) {
case 0: {
 BA.debugLineNum = 114;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 115;BA.debugLine="Dim map As Map";
Debug.ShouldStop(262144);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 116;BA.debugLine="map = parser.NextObject";
Debug.ShouldStop(524288);
_map = _parser.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 117;BA.debugLine="Dim data As List";
Debug.ShouldStop(1048576);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data", _data);
 BA.debugLineNum = 118;BA.debugLine="data = map.Get(\"data\")";
Debug.ShouldStop(2097152);
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);
 BA.debugLineNum = 119;BA.debugLine="If data.Size-1 > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 120;BA.debugLine="CLV.Clear";
Debug.ShouldStop(8388608);
listev.mostCurrent._clv.runVoidMethod ("_clear");
 BA.debugLineNum = 121;BA.debugLine="imgMap.Clear";
Debug.ShouldStop(16777216);
listev.mostCurrent._imgmap.runVoidMethod ("Clear");
 BA.debugLineNum = 122;BA.debugLine="For i = 0 To data.Size-1";
Debug.ShouldStop(33554432);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {_data.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 123;BA.debugLine="Dim ev As Map";
Debug.ShouldStop(67108864);
_ev = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("ev", _ev);
 BA.debugLineNum = 124;BA.debugLine="ev = data.Get(i)";
Debug.ShouldStop(134217728);
_ev = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _data.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("ev", _ev);
 BA.debugLineNum = 125;BA.debugLine="CLV.Add(CreateItem(ev.Get(\"id\"), ev.Get(\"na";
Debug.ShouldStop(268435456);
listev.mostCurrent._clv.runVoidMethod ("_add",(Object)(_createitem(BA.ObjectToString(_ev.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))),BA.ObjectToString(_ev.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name"))))),BA.ObjectToString(_ev.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("date_start"))))),BA.ObjectToString(_ev.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("gallery"))))))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 126;BA.debugLine="CLV.AsView.Height = PanelListItem.Height *";
Debug.ShouldStop(536870912);
listev.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {listev.mostCurrent._panellistitem.runMethod(true,"getHeight"),listev.mostCurrent._clv.runMethod(true,"_getsize")}, "*",0, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 128;BA.debugLine="isDownloadReady = True";
Debug.ShouldStop(-2147483648);
listev._isdownloadready = listev.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 129;BA.debugLine="Dim extra As Map = CreateMap(MediaManager.RE";
Debug.ShouldStop(1);
_extra = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extra = listev.mostCurrent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {(listev.mostCurrent._mediamanager.getField(true,"_request_resize_mode" /*RemoteObject*/ )),(RemoteObject.createImmutable("FILL_NO_DISTORTIONS"))}));Debug.locals.put("extra", _extra);Debug.locals.put("extra", _extra);
 BA.debugLineNum = 130;BA.debugLine="DownloadImg(imgMap, isDownloadReady, extra)";
Debug.ShouldStop(2);
_downloadimg(listev.mostCurrent._imgmap,listev._isdownloadready,_extra);
 BA.debugLineNum = 131;BA.debugLine="CLV.sv.Height = CLV.AsView.Height";
Debug.ShouldStop(4);
listev.mostCurrent._clv.getField(false,"_sv").runMethod(true,"setHeight",listev.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 132;BA.debugLine="PanelList.Height = CLV.AsView.Height";
Debug.ShouldStop(8);
listev.mostCurrent._panellist.runMethod(true,"setHeight",listev.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 BA.debugLineNum = 133;BA.debugLine="MainScroll.Panel.Height = CLV.AsView.Height";
Debug.ShouldStop(16);
listev.mostCurrent._mainscroll.runMethod(false,"getPanel").runMethod(true,"setHeight",listev.mostCurrent._clv.runMethod(false,"_asview").runMethod(true,"getHeight"));
 };
 BA.debugLineNum = 135;BA.debugLine="btnRefresh.Visible = True";
Debug.ShouldStop(64);
listev.mostCurrent._btnrefresh.runMethod(true,"setVisible",listev.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 136;BA.debugLine="loadRefresh.Visible = False";
Debug.ShouldStop(128);
listev.mostCurrent._loadrefresh.runMethod(true,"setVisible",listev.mostCurrent.__c.getField(true,"False"));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e33) {
			BA.rdebugUtils.runVoidMethod("setLastException",listev.processBA, e33.toString()); BA.debugLineNum = 138;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
listev.mostCurrent.__c.runVoidMethod ("LogImpl","16750242",BA.ObjectToString(listev.mostCurrent.__c.runMethod(false,"LastException",listev.mostCurrent.activityBA)),0);
 };
 break; }
}
;
 };
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panellistitem_click() throws Exception{
try {
		Debug.PushSubsStack("PanelListItem_Click (listev) ","listev",11,listev.mostCurrent.activityBA,listev.mostCurrent,74);
if (RapidSub.canDelegate("panellistitem_click")) { return b4a.example.listev.remoteMe.runUserSub(false, "listev","panellistitem_click");}
RemoteObject _item = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 74;BA.debugLine="Private Sub PanelListItem_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Dim item As Int = CLV.GetItemFromView(Sender)";
Debug.ShouldStop(1024);
_item = listev.mostCurrent._clv.runMethod(true,"_getitemfromview",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), listev.mostCurrent.__c.runMethod(false,"Sender",listev.mostCurrent.activityBA)));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 76;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(2048);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 77;BA.debugLine="p = CLV.GetPanel(item)";
Debug.ShouldStop(4096);
_p = listev.mostCurrent._clv.runMethod(false,"_getpanel",(Object)(_item));Debug.locals.put("p", _p);
 BA.debugLineNum = 79;BA.debugLine="Dim a As B4XView";
Debug.ShouldStop(16384);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 80;BA.debugLine="a = p.GetView(0)";
Debug.ShouldStop(32768);
_a = _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("a", _a);
 BA.debugLineNum = 81;BA.debugLine="Starter.selectedObj.Initialize";
Debug.ShouldStop(65536);
listev.mostCurrent._starter._selectedobj /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 82;BA.debugLine="Starter.selectedObj.Put(\"id\", a.GetView(0).GetVie";
Debug.ShouldStop(131072);
listev.mostCurrent._starter._selectedobj /*RemoteObject*/ .runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"getText"))));
 BA.debugLineNum = 83;BA.debugLine="Starter.selectedObj.Put(\"name\", a.GetView(0).GetV";
Debug.ShouldStop(262144);
listev.mostCurrent._starter._selectedobj /*RemoteObject*/ .runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_a.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).runMethod(true,"getText"))));
 BA.debugLineNum = 85;BA.debugLine="Log(\"Redirect to DetailEV Activity\")";
Debug.ShouldStop(1048576);
listev.mostCurrent.__c.runVoidMethod ("LogImpl","16619147",RemoteObject.createImmutable("Redirect to DetailEV Activity"),0);
 BA.debugLineNum = 86;BA.debugLine="StartActivity(DetailEv)";
Debug.ShouldStop(2097152);
listev.mostCurrent.__c.runVoidMethod ("StartActivity",listev.processBA,(Object)((listev.mostCurrent._detailev.getObject())));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
listev._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 10;BA.debugLine="Private isDownloadReady As Boolean = False";
listev._isdownloadready = listev.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}