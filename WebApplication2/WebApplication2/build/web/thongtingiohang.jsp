<%@include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table border="1" cellspacing="0" cellpadding="0">
    <tr>
        <th>MaSp</th>
        <th>TenSp</th>
        <th>Anh</th>
        <th>gia</th>
        <th>So Luong</th>
        <th>Tong</th>
    </tr>
    <c:forEach items="${arr}" var="objsp">
        <tr>
            <td>${objsp.getIdSp()}</td>
            <td>${objsp.getTenSp()}</td>
            <td><img src="${objsp.getAnh()}" height="100" width="100"></td>
            <td>${objsp.getGia()}</td>
            <td>${objsp.getSoLuong()}</td>
            <td>${objsp.getGia() * objsp.getSoLuong()}</td>
        </tr>
    </c:forEach>
</table>
<%@include file="footer.jsp" %>