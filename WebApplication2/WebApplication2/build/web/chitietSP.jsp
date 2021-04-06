<%@include file="header.jsp" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!-<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">-->
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row">
    <div class="col-sm-2 bg-light"></div>
    <div class="col-sm-4">
        <img src="${objsp.getAnh()}" width="500px" height="400px"/>
    </div>
   <div class="col-sm-4">
        <h1>${objsp.getTenSp()}</h1>
        <a>So luong: ${objsp.getSoLuong()}</a>
        <h2>Gia: ${objsp.getGia()}</h2>
        <h3>Mo ta: ${objsp.getMota()} </h3>
        
        <div class="btn-group">
            <button type="button" class="btn  btn-outline-secondary"><a href="giohang?IdSP=${objsp.getidSp()}">Thêm vào giỏ hàng</a></button>
        </div>
    </div>-->
    <div class="col-sm-2 bg-light"></div>

</div>
<%@include file="footer.jsp" %>