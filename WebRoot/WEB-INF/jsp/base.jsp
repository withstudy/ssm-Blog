<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %> 

<rapid:override name="username">
	${user.username }
</rapid:override>


 <rapid:override name="content">  
      
      <div class="jumbotron">
	    <h1>Hello,${user.username }！</h1>
	    <p>欢迎进入后台管理~~</p>
	</div>
        
  </rapid:override> 
  <%@include file="index.jsp" %>  

