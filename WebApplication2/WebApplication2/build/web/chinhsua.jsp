<%-- 
    Document   : chinhsua
    Created on : Apr 5, 2021, 7:24:45 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="row">
            <div class="col-sm-2 bg-dark text-light justify-content-center m-auto d-flex border border-top-bottom-left-0">Admintrator</div>
            <div class="col-sm-2 bg-dark text-light justify-content-center m-auto d-flex border border-top-bottom-left-0"><a href="trangchu">Vào trang Web</a></div>
            <div class="col-sm-2 bg-dark text-light justify-content-center m-auto d-flex border border-top-bottom-left-0">Liên hệ</div>
            <div class="col-sm-2 bg-dark text-light justify-content-center m-auto d-flex">Đơn hàng</div>
            <div class="col-sm bg-dark text-light justify-content-center m-auto d-flex">Xin chào Admin</div>
        </div>
        <div class="row">
            <div class="col-sm-2 border">Trang chủ Admin</div>
            <div class="col-sm-10 border"><a href="#">Trang chủ</a></div>
        </div>
        <div class="row">
            <div class="col-sm-2 border">
                <ul class="list-group">
                    <li class="list-group-item border-0">
                        <a href="#">Quản lý sản phẩm</a>
                        <ul class="list-group-item list-unstyled border-0">
                            <li><a href="chinhsua">Chinh sua san pham</a></li>

                        </ul>
                    </li>
                    <li class="list-group-item border-0">
                        <a href="#">Quản lý thông tin</a>
                        <ul class="list-group-item list-unstyled border-0">
                            <li><a href="#">Danh sách đơn hàng</a></li>
                            <li><a href="#">Khách hàng liên hệ</a></li>
                        </ul>
                    <li class="list-group-item border-0">
                        <a href="#">Cấu hình User</a>
                        <ul class="list-group-item list-unstyled border-0">
                            <li><a href="#">Quản lý User</a></li>
                            <li><a href="#">Thông tin User</a></li>
                        </ul>
                </ul>
            </div>
            <div class="col-sm-10 border">
                <table class="table table-bordered">
                    <tr>
                        <td>Mã sản phẩm</td>
                        <td>Tên sản phẩm</td>
                        <td>Đơn giá</td>
                        <td>Số lượng</td>
                        <td>Hình ảnh</td>
                        <td>Tác vụ</td>
                    </tr>
                    <c:forEach items="${arr}" var ="objsp">    
                        <tr>
                            <td>${objsp.getidSp()}</td>
                            <td>${objsp.getTenSP()}</td>
                            <td>${objsp.getGia()}</td>
                            <td>${objsp.getMota()}</td>
                            <td><img src="${objsp.getAnh()}" height="100px" width="100px"/></td>
                            <td><a href="suaSanPham?IdSp=${objsp.getidSp()}"> Sửa</a>
                                <a href="xoaSanPham?IdSP=${objsp.getidSp()}"> Xóa</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>


        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
