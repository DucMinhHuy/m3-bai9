<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<style type="text/css">
    .login {
        height: 180px; width:230px;
        margin: 0;
        padding: 10px;
        border: 1px #CCC solid;
    }
    .login input{
        padding: 5px; margin: 5px
    }
</style>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form method="post" action="/login">
    <div class="login">
        <h2>Login</h2>
        <input type="text" name="userName" size="30" placeholder="userName"/>
        <input type="password" name="passWord" size="30" placeholder="password"/>
        <input type="submit" value="Sign in"/>
    </div>
</form>
</body>
</html>