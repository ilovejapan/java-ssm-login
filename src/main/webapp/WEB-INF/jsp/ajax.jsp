<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>ajax</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!-- <meta name="content-type" content=""application/x-www-form-urlencoded"> -->
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<!-- <script type="text/javascript" src="./jquery-1.11.3.js"></script> -->
<!-- 	<script type="text/javascript">
	
/* 		$(document).ready(function(){ */
		function test(){
	
			/* alert("try ajax"); */
			
			var resp = $.ajax({
				
				url:"/ajax.do",
				type:"post",
				data:{
					name:"james"
				},
				dataType:"json"
/* 				success:function(data){
					alert("success");
					
					
				}, */
/* 				error:function(){
					alert("error : try again");
				} */
				
			});
			resp.done(function(data){
    			alert("saved : "+data);
    		});
    		
    		resp.fail(function(jqXHR,textStatus){
    			alert("jquery failed : "+textStatus);
    		});
			
		}
			
/* 		}); */
	
	</script> -->

  </head>
  
  <body>
    This is ajax JSP page. <br>
    ${message}
    ${name}
    
    <br>
    <input type="button" value="test" onclick="sendAjax()" />
    <!-- <button id="btn" type="button" onclick="sendAjax()">click</button> -->
    <br>
    <input id="username" name="username" type="text" />
    <br>
    <input id="password" name="password" type="text">
    <br>
    <div id="div"></div>
    
<!--     <form action="ajax.do" method="post">
    	<input id="username" name="username" type="text" />
    	<br>
    	<input type="button" value="test" onclick="sendAjax()" />
    </form> -->
  </body>
  	<script type="text/javascript" src="./jquery-1.11.3.js"></script>
    <script type="text/javascript">
    
    	/* alert("hello ajax"); */
    
    	function sendAjax(){
    		
    		var name = $("#username").val();
    		var pwd = $("#password").val();
    		var div = $("#div");
    		
    		alert("try ajax");
    		
    		/* var json = {name:$("#username").val(),pwd:$("#password").val()}; */
    		
    		$.ajax({
    			
    			url:"./ajax.do",
    			type:"POST",
    			data:{"name":name},
    			/* data:JSON.stringify({"name":name}), */
    			/* dataType:"json", */
    			/* contentType:"application/json;charset=utf-8", *//* "application/x-www-form-urlencoded"*/
    			/* async:false, */
    			success:function(data,textStatus,jqXHR)
    			{
    				alert("success");
    				alert(data.prototype);
    				alert(data);
    				/* alert("status : "+textStatus+" xhr : "+jqXHR); */
    			},
    			error:function(XMLHttpRequest,textStatus,errorThrown)
    			{
    				alert("error : try again");
    				alert("xhr status : "+XMLHttpRequest.status);
    				alert("xhr ready state : "+XMLHttpRequest.readyState);
    				alert("text status : "+textStatus);
    			}
    			
    		});
    		
/*     		resp.done(function(data){
    			alert("success");
    			alert(data.prototype);
    		});
    		
    		resp.fail(function(jqXHR,textStatus){
    			alert("request failed : "+textStatus);
    		}); */
    	}
    </script>
</html>
