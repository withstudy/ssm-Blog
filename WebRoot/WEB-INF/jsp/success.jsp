<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>   

<rapid:override name="username">
	${user.username }
</rapid:override>


<rapid:override name="content">  
	
	<ol class="breadcrumb">
	    <li><a href="javascript:;">管理首页</a></li>
	    <li class="active">成功提示</li>
	</ol>
	
	<div class="panel panel-success">
	    <div class="panel-heading">
	        <h3 class="panel-title">成功提示</h3>
	    </div>
	    <div class="panel-body">
	       ${message }
	    </div>
	    <div class="panel-footer">
	   			 <c:choose>
				  	<c:when test="${url != null}">
				  		 <a href="${pageContext.request.contextPath }${url }">点击这里跳转</a>
				  	</c:when>
				  	<c:otherwise>
				  		 <a href="javascript:window.history.back();">返回上一部</a>
				  	</c:otherwise>
				  </c:choose>
	
	    </div>
	</div>
	
</rapid:override>
  <%@include file="index.jsp" %>  
