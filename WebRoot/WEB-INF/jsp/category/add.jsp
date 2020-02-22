<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>  


<rapid:override name="username">
	${user.username }
</rapid:override>


<rapid:override name="content"> 

	<ol class="breadcrumb">
	    <li><a href="javascript:;">管理首页</a></li>
	    <li><a href="javascript:;">分类首页</a></li>
	    <li class="active">分类添加</li>
	</ol>
	<h3>添加分类</h3>
	<form action="${pageContext.request.contextPath }/category/add.xhb" method="post">
	    <div class="form-group">
	        <label for="name">分类名称:</label>
	        <input type="text" class="form-control" id="name" placeholder="请输入用户名" name="name" >
	    </div>
	     <div class="form-group">
	        <label for="comment">简介:</label>
	        <textarea class="form-control" id="comment" placeholder="请输入内容" name="comment" rows="4"></textarea>
	        <!--<input type="text" class="form-control" id="content" placeholder="请输入内容" name="content">-->
	    </div>
	    <button type="submit" class="btn btn-default">添加</button>
	</form>
</rapid:override>
  <%@include file="../index.jsp" %>  



