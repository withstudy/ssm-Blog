<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>博客后台管理系统 </title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="./bootstrap/css/bootstrap.min.css">
    <script src="./bootstrap/js/jquery.min.js"></script>
    <script src="./bootstrap/js/bootstrap.min.js"></script>
  </head>
  
  <body>
  <div style="width:400px;margin:100px auto;text-align: center;border: 1px solid #999; padding:15px;border-radius:10px; ">
  		<h1>博客后台管理系统 </h1>
  		<h3>欢迎登录</h3>
	   <form:form id="login" modelAttribute="user" method="post" action="${pageContext.request.contextPath }/user/login.xhb" style="text-align: left;">
		    <div class="form-group">
			    <label for="username">用户名</label>
			    <form:input path="username" class="form-control" id="username" placeholder="请输入用户名"/>
			    <form:errors path="username" style="color:red;"/>
		 	 </div>
		 	 <div class="form-group">
			    <label for="password">密码</label>
			    <form:input path="password" class="form-control" id="password" placeholder="请输入密码" />
			    <form:errors path="password" style="color:red;"/>
		 	 </div>
		 	 <button type="submit" class="btn btn-default">登录</button><span>没有账号？去<a href="${pageContext.request.contextPath }/user/toregister.xhb" id="registera">注册</a></span>
	   </form:form>
  </div>
  
   
  
  </body>
</html>
