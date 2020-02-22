<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>  

<rapid:override name="username">
	${user.username }
</rapid:override>

<rapid:override name="content">  


<ol class="breadcrumb">
    <li><a href="javascript:;">管理首页</a></li>
    <li><a href="javascript:;">内容首页</a></li>
    <li class="active">内容列表</li>
</ol>
<h3>内容列表</h3>
<table class="table table-hover table-striped">
    <tr>
        <th>ID</th>
         <th>作者</th>
        <th>分类</th>
        <th>标题</th>
        <th>简介</th>
        <th>内容</th>
        <th>时间</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${page.lists }" var="content">
	    <tr>
	    <td>${content.id }</td>
	    <c:forEach items="${users }" var="user">
	    	<c:if test="${user.id == content.u_id }">
	    	   <td>${user.username }</td>
	    	</c:if>
	    </c:forEach>
	     <c:forEach items="${categorys }" var="category">
	    	<c:if test="${category.id == content.c_id }">
	    	   <td>${category.name }</td>
	    	</c:if>
	    </c:forEach>
	    <td>${content.title }</td>
	    <td>${content.comment }</td>
	    <td>${content.content }</td>
	     <td>${content.date }</td>
	    <td>
	    	<a href="${pageContext.request.contextPath }/content/toedit.xhb?id=${content.id }">编辑</a> | 
	    	<a href="${pageContext.request.contextPath }/content/delete.xhb?id=${content.id }">删除</a> |
	    	<a href="${pageContext.request.contextPath }/comment/commentindex.xhb?c_id=${content.id }">查看评论</a>
	    </td>
	    </tr>
	   </c:forEach>

</table>
	
<%@include file="page.jsp" %>   
</rapid:override>
  <%@include file="../index.jsp" %>  