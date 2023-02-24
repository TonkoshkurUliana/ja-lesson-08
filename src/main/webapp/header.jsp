<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="style/header.css">
<body>
<header>
    <div class="inner">
        <nav>
            <a class="active" href="${pageContext.request.contextPath}/cabinet.jsp">Catalog</a>
            <a href="${pageContext.request.contextPath}/createProduct.jsp">New product</a>
            <a href="${pageContext.request.contextPath}/bucket.jsp.jsp">Bucket</a>
            <a class="product-logout" href="#">LogOut</a>
        </nav>
        <a href="https://u24.gov.ua/" class="donate-link">Donate</a>
    </div>
</header>
<script src="js/header.js"></script>
</body>
</html>
