<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %> 

<rapid:override name="username">
	${user.username }
</rapid:override>


 <rapid:override name="content">  
      
      <div style="width:400px;margin:100px auto;text-align: center;border: 1px solid #999; padding:15px;border-radius:10px; ">
		   <form  method="post" action="${pageContext.request.contextPath }/file/upload.xhb" style="text-align: left;" enctype="multipart/form-data">
			    
				<input name="imgpic" type="file" value="">
				<input type="submit" value="上传">
		   </form>
	  </div>
        
  </rapid:override> 
  <%@include file="index.jsp" %>  

