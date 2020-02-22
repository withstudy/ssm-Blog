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
	    <li class="active">添加内容</li>
	</ol>
	<h3>添加内容</h3>
	<form action="${pageContext.request.contextPath }/content/add.xhb" method="post">
	    <div class="form-group">
	        <label for="category">分类:</label>
	        <select id="category" name="c_id" class="form-control">
	             <c:forEach items="${categorys }" var="category">
	           		 <option value="${category.id }">${ category.name }</option>
	            </c:forEach>
	        </select>
	    </div>
	    <div class="form-group">
	        <label for="title">标题:</label>
	        <input type="text" class="form-control" id="title" placeholder="请输入内容标题" name="title">
	    </div>
	    <div class="form-group">
	        <label for="comment">简介:</label>
	        <textarea name="comment"  class="form-control" id="comment" placeholder="请输入内容简介" rows="3"></textarea>
	        <!--<input type="text" class="form-control" id="description" placeholder="请输入内容简介" name="description">-->
	    </div>
	    <div class="form-group">
	        <label for="content">内容:</label>
	        <textarea class="form-control" id="content" placeholder="请输入内容" name="content" rows="8"></textarea>
	        <!--<input type="text" class="form-control" id="content" placeholder="请输入内容" name="content">-->
	    </div>
	    <button type="submit" class="btn btn-default">添加</button>
	</form>
</rapid:override>
  <%@include file="../index.jsp" %>  



