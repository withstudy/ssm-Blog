<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>   

<rapid:override name="username">
	${user.username }
</rapid:override>


<rapid:override name="content">  
	
	<ol class="breadcrumb">
	    <li><a href="javascript:;">管理首页</a></li>
	    <li class="active">错误提示</li>
	</ol>
	
	<div class="panel panel-danger">
	    <div class="panel-heading">
	        <h3 class="panel-title">错误提示</h3>
	    </div>
	    <div class="panel-body">
	        ${message }
	    </div>
	    <div class="panel-footer">
	        <a href="javascript:window.history.back();">返回上一步</a>
	    </div>
	</div>
	
</rapid:override>
  <%@include file="index.jsp" %>  
