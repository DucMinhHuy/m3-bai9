<%--
  Created by IntelliJ IDEA.
  User: minhhuyduc
  Date: 03/10/2022
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>discount Calculator</title>
    <link rel="stylesheet" href="css/style.css" type="text/css">

</head>
<body>
<h2>discount Calculator</h2>
<form action="money" method="post">
<input type="text" name="productDescription" placeholder="mo ta san pham"/><br>
<input type="text" name="listPrice" placeholder="gia niem yet"/><br>
<input type="text" name="discountPercent" placeholder="ty le chiet khau"/><br>
<input type="submit" value="tinh"/>
</form>
</body>
</html>
