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
    <li><a href="javascript:;">查看评论</a></li>
    <li class="active">评论列表</li>
</ol>
<h3>评论列表</h3>
<a href="${pageContext.request.contextPath }/content/contentindex.xhb">返回</a>
<table class="table table-hover table-striped">
    <tr>
        <th>ID</th>
         <th>内容ID</th>
        <th>用户ID</th>
        <th>评论</th>
        <th>时间</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${page.lists }" var="comment">
	    <tr>
	    <td>${comment.id }</td>
	    <td>${comment.u_id }</td>
	    <td>${comment.c_id }</td>
	    <td>${comment.content }</td>
	     <td>${comment.time }</td>
	    <td>
	    	<a href="${pageContext.request.contextPath }/comment/delete.xhb?id=${comment.id }&c_id=${contentid}">删除</a> 
	    </td>
	    </tr>
	   </c:forEach>

</table>
	
<%@include file="page.jsp" %>   
</rapid:override>
  <%@include file="../index.jsp" %>  