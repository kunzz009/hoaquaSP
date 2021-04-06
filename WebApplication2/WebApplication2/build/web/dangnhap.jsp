<%-- 
    Document   : dangnhap
    Created on : Feb 26, 2021, 9:22:03 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="login.css">
    </head>
    <body>
        <header>
            <div  class="container">
               
            </div>
        </header>
        <main>
            <div class="container">
            <div class="login-form">
                <form action="LoginController" method="post">
                    <h1>Đăng nhập</h1>
                    <b>Số điện thoại/Email</b>
                    <div class="input-box">
                        <i ></i>
                        <input type="text" placeholder="Số điện thoại/Email" name="user">
                    </div>
                    <b>Mật khẩu</b>
                    <div class="input-box">
                        <i ></i>
                        <input type="password" placeholder="Mật khẩu" name="pass">
                    </div>
                    <div>
                        <a href="quenmk">Quên mật khẩu</a>
                    </div>
                    <div class="btn-box">
                        <button type="submit">
                            Đăng nhập
                        </button>
                    </div>
                </form>
            </div>
            </div>
        </main>
        <footer>
            <div  class="container">
                
            </div>
        </footer>
    </body>
</html>
