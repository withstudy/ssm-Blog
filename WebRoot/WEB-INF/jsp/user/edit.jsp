<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>  


<rapid:override name="username">
	${user.username }
</rapid:override>


<rapid:override name="content"> 

	<ol class="breadcrumb">
	    <li><a href="javascript:;">管理首页</a></li>
	    <li><a href="javascript:;">用户管理</a></li>
	    <li class="active">编辑用户</li>
	</ol>
	<h3>编辑用户</h3>
	<form action="${pageContext.request.contextPath }/blog/edit.xhb" method="post">
	<input type="hidden" name="id" value="${edituser.id }">
	    <div class="form-group">
	        <label for="nausername">用户名:</label>
	        <input type="text" class="form-control" id="username" placeholder="请输入用户名" name="username" value="${edituser.username }">
	    </div>
	    <div class="form-group">
	        <label for="password">密码:</label>
	        <input type="text" class="form-control" id="password" placeholder="请输入密码" name="password" value="${edituser.password }">
	    </div>
	    <button type="submit" class="btn btn-default">修改</button>
	</form>
</rapid:override>
  <%@include file="../index.jsp" %>  



