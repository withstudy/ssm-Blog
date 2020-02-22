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
    <li class="active">分类列表</li>
</ol>
<h3>分类列表</h3>
<table class="table table-hover table-striped">
    <tr>
        <th>ID</th>
        <th>分类名</th>
        <th>简介</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${page.lists }" var="category">
	    <tr>
	    <td>${category.id }</td>
	    <td>${category.name }</td>
	    <td>${category.comment }</td>
	    <td>
	    	<a href="${pageContext.request.contextPath }/category/toedit.xhb?id=${category.id }">编辑</a> | 
	    	<a href="${pageContext.request.contextPath }/category/delete.xhb?id=${category.id }">删除</a>
	    </td>
	    </tr>
	   </c:forEach>

</table>
	
<%@include file="page.jsp" %>   
</rapid:override>
  <%@include file="../index.jsp" %>  