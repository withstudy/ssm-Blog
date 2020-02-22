<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>   

<rapid:override name="username">
	${user.username }
</rapid:override>


<rapid:override name="content">  
      
	     <ol class="breadcrumb">
		    <li><a href="javascript:;">管理首页</a></li>
		    <li class="active">用户列表</li>
		</ol>
	<h3>用户列表</h3>
	<table class="table table-hover table-striped">
	    <tr>
	        <th>ID</th>
	        <th>用户名</th>
	        <th>密码</th>
	        <th>操作</th>
	    </tr>
	   <c:forEach items="${page.lists }" var="user">
	    <tr>
	    <td>${user.id }</td>
	    <td>${user.username }</td>
	    <td>${user.password }</td>
	    <td>
	    	<a href="${pageContext.request.contextPath }/blog/toedit.xhb?id=${user.id }">编辑</a> | 
	    	<a href="${pageContext.request.contextPath }/blog/delete.xhb?id=${user.id }">删除</a>
	    </td>
	    </tr>
	    </c:forEach>
	</table>
       <%@include file="page.jsp" %>   
  </rapid:override> 
  <%@include file="../index.jsp" %>  