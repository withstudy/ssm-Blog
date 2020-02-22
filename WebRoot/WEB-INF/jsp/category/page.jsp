<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<nav aria-label="...">
    <ul class="pager">
        <li class="previous">
         		<c:choose>
				  	<c:when test="${page.currPage > 1}">
				  		<a href="${pageContext.request.contextPath }/content/contentindex.xhb?currPage=${page.currPage-1}">
				  			<span aria-hidden="true">&larr;</span> 上一页
				  		</a>
				  	</c:when>
				  	<c:otherwise>
				  		<span>没有上一页了</span>
				  	</c:otherwise>
				  </c:choose>
        </li>
        <li>一共有${page.totalCount }条数据，每页显示${page.pageSize }条数据，共${page.totalPage }页，当前${page.currPage }页</li>
        <li class="next">
        	<c:choose>
				  	<c:when test="${page.currPage < page.totalPage}">
				  		<a href="${pageContext.request.contextPath }/content/contentindex.xhb?currPage=${page.currPage+1}">
				  			 下一页<span aria-hidden="true">&rarr;</span>
				  		</a>
				  	</c:when>
				  	<c:otherwise>
				  		<span>没有下一页了</span>
				  	</c:otherwise>
				 </c:choose>
        </li>
    </ul>
</nav>
