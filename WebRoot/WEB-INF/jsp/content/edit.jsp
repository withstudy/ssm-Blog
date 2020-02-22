<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>  


<rapid:override name="username">
	${user.username }
</rapid:override>


<rapid:override name="content"> 

	<ol class="breadcrumb">
	    <li><a href="/admin">管理首页</a></li>
	    <li><a href="/admin/content">内容首页</a></li>
	    <li class="active">修改内容</li>
	</ol>
	<form action="${pageContext.request.contextPath }/content/edit.xhb" method="post">
	    <input type="hidden" value="${editcontent.id }" name="id">
	    <div class="form-group">
	        <label for="category">分类:</label>
	        <select id="category" name="c_id" class="form-control">
	        <c:forEach items="${categorys }" var="category">
	        	<c:choose>
	        		<c:when test="${category.id == editcontent.c_id }">
	        			<option value="${category.id }" selected>${ category.name }</option>
	        		</c:when>
	        		<c:otherwise>
	        			<option value="${category.id }">${ category.name }</option>
	        		</c:otherwise>
	        	</c:choose>
	        		
	           		 
	           </c:forEach>
	           
	        </select>
	    </div>
	
	    <div class="form-group">
	        <label for="title">标题:</label>
	        <input type="text" class="form-control" id="title" placeholder="请输入内容标题" name="title" value="${editcontent.title }">
	    </div>
	    <div class="form-group">
	        <label for="comment">简介:</label>
	        <textarea name="comment"  class="form-control" id="comment" placeholder="请输入内容简介" rows="3">${editcontent.comment }</textarea>
	        <!--<input type="text" class="form-control" id="description" placeholder="请输入内容简介" name="description">-->
	    </div>
	    <div class="form-group">
	        <label for="content">内容:</label>
	        <textarea class="form-control" id="content" placeholder="请输入内容" name="content" rows="8" > ${editcontent.content }</textarea>
	        <!--<input type="text" class="form-control" id="content" placeholder="请输入内容" name="content">-->
	    </div>
	    <button type="submit" class="btn btn-default">修改</button>
	</form>
</rapid:override>
  <%@include file="../index.jsp" %>  



