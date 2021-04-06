<%-- 
    Document   : header
    Created on : Jan 18, 2021, 12:14:39 AM
    Author     : DELL
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="menu.css" rel="stylesheet" type="text/css"/>
    </head>
    <style>
        #main{height: 1200px;width: 100%}
        #header{height: 250px;width: 100%}
        #banner{height: 200px;width: 100%;background: red}
        #menu{height: 50px;width: 100%;background: red;background: black}
        #content{height: 800px;width: 100%}
        #left{height: 100%;width: 15%;background: yellow;float: left}
        #mainContent{height: 100%;width: 70%;float: left}
        #right{height: 100%;width: 15%;background: yellow;float: left}
        #footer{height: 150px;width: 100%;background: blue}
        a{font-size: 20px;font-weight: bold;margin-right: 20px}
        span{color: white;float: right}
        #logout{float: right}
    </style>
    <body>
        <div id="main">
            <div id="header">
                <div id="banner">

                </div>
                <div class="wrapper">
                    <div class="menu">
                        <ul>
                            <li><a href="trangchu">Trang chủ</a></li>
                            <li><a href="product">Sản Phẩm  </a>
                            </li>
                            <li><a href="tintuc">Tin Tức </a></li>
                            <li><a href="lienhe">Liên hệ</a></li>
                            <li><a href="thongtingiohang">Giỏ hàng</a></li>
                            <li><a href="#"><img src="image/user.png" height="30px" width="30px"/></a>
                                <ul>
                                    <c:if test="${sessionScope.acc != null}">
                                        <a class="nav-link" href="#">
                                            <c:if test="${sessionScope.acc == 'admin'}">
                                                <a href="AdminController"> Manager </a>
                                            </c:if>
                                        </a>
                                        <a class="nav-link" href="#">
                                            <%
                                                String user = (String) session.getAttribute("acc");
                                                if (session != null) {
                                                    out.print("Hello " + user);
                                                }
                                            %>
                                        </a>

                                        <a class="nav-link"href="logout">Đăng xuất</a>

                                    </c:if>
                                    <c:if test="${sessionScope.acc == null}">
                                        <a class="nav-link" href="LoginController">Đăng nhập</a>
                                    </c:if>-->
                                </ul>
                            </li>
                        </ul>

                    </div>
                </div>
            </div>
           
            <div id="content">
