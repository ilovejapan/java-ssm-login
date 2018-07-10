<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form name="form" id="form" action="login.do" method="post">
      <table>
        <tr>
          <td class="text">Username:</td>
          <td><input type="text" name="username" id="username"></td>  
        </tr>
        
        <tr>
          <td class="text">Password:</td>
          <td><input type="password" name="password" id="password"></td>
        </tr> 
        
        <tr>
          <td colspan="2" align="center"><input type="submit" value="Login">&nbsp;<input type="submit" value="register"></td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
          	<label id="message" class="red">
          		${message}
          		
          	</label>
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>
