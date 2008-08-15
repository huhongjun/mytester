<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic"%>
<%@ page import="com.zhjedu.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>无标题文档</title>
</head>
<style>
body,table,tr,td,input,select,div,textarea,font	{font-family: "宋体";font-size:12px; color:red}
.btnBlue
{
	BORDER-RIGHT: #2C59AA 1px solid; BORDER-LEFT: #2C59AA 1px solid; BORDER-TOP: #2C59AA 1px solid; BORDER-BOTTOM: #2C59AA 1px solid;
	PADDING-LEFT: 2px; PADDING-RIGHT: 2px; PADDING-TOP: 1px; 
	FILTER: progid:DXImageTransform.Microsoft.Gradient(GradientType=0, StartColorStr=#ffffff, EndColorStr=#9DBCEA);
	HEIGHT: 23px;
	FONT-SIZE: 9pt;	CURSOR: hand; COLOR: black; 	
}
</style>
<bean:define id="timelimit" name="quiz" property="timelimit"/>
<bean:define id="totalhour" name="quizExam" property="totalhour"/>
<%
	if(Integer.parseInt(timelimit.toString()) > 0){	//做倒计时控制
		int t = Integer.parseInt(timelimit.toString());
		if(Integer.parseInt(totalhour.toString()) > 0){
			t = Integer.parseInt(totalhour.toString());
%>
	<script language="javascript">
		alert("请注意：您已参加过但没有完成此次考试，此次考试的剩余时间还有<%=t%>分钟！");
	</script>
<%
		}
%>
<body onload="javascript:show_date_time(<%=t * 60 %>)" style="margin-top:0">&nbsp; 
<% 
	}else{ 
%>
<body onload="javascript:show_date_time(-1)" style="margin-top:0">
<%
	}
%>
<input type="hidden" value="0" name="totalhour" />
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="41%" height="30">考试名称：<bean:write name="quiz" property="name"/> </td>
    <td width="12%">姓名：<%=UserSessionInfo.getStudentRealName(request) %> </td>
    <td width="22%">考试剩余时间：<span id="nowtime"></span></td>
    <td width="25%"><div align="center">
      <input type="button" name="Submit" value=" 保 存 " onclick="save()" class="btnBlue"/>
      <input type="button" name="Submit" value=" 检 查 " onclick="parent.mainFrame.window.checkFinish()" class="btnBlue"/>
      <input type="button" name="Submit2" value=" 交 卷 " onclick="parent.mainFrame.window.sbt3()" class="btnBlue"/>
    </div></td>
  </tr>
</table>
</body>
</html>
<script language="JavaScript" type="text/JavaScript">
function show_date_time(n){
	if(n > -1){
	    var m = n - 1;
	    if (n == 0){
	        alert("考试时间已到，系统将自动提交试卷！");
	        parent.mainFrame.window.sbt();
	    }else{
	       TimeMsg(m, 60)
	       window.setTimeout("show_date_time(" + m + ")", 1000); //1000表示１秒钟
	    }
	}else{
		document.getElementsByName("totalhour").value = 0;
		document.getElementById("nowtime").innerHTML="不限时";
	}

}

function TimeMsg(a, b){
	var c = parseInt(a / b); //取整
	var d = a % b //取余
	document.getElementsByName("totalhour").value = c;
	document.getElementById("nowtime").innerHTML = c + "分" + d + "秒";
}

function save(){
	parent.mainFrame.window.sbt2(document.getElementsByName("totalhour").value);
}
</script>