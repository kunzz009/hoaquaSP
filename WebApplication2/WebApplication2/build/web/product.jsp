<%@include file="header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table>
    <tr>

        
        <c:forEach items="${arr}" var="objsp"  >

            <td>
                    <a href="chitietSP?IdSP=${objsp.getidSp()}"><img src="${objsp.getAnh()}" height="300px" width="300px" /></a><br>
                    
                </td>
        
            <td>${objsp.getTenSp()}</td>
            <c:if test="${(loop.index+1)%2==0}">
            </tr>
            <tr>
            </c:if>
        </c:forEach>
    </tr>
</table>
<c:forEach begin="0" end="${totalPage}" var="index">
    <a href="?page=${index}">${index+1}</a>
</c:forEach>
<%@include file="footer.jsp" %>
