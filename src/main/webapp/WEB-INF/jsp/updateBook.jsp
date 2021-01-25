<%--
  Created by IntelliJ IDEA.
  User: 无心y
  Date: 2020/12/6
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <div class="row-clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/update" method="post">

        <input type="hidden" name="bookid" value="${SBook.bookid}">

        <div class="form-group">
            <label >书籍名称</label>
            <input type="text" name="bookName" class="form-control" value="${SBook.bookName}" required>
        </div>
        <div class="form-group">
            <label >书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" value="${SBook.bookCounts}" required>
        </div>
        <div class="form-group">
            <label >书籍描述</label>
            <input type="text" name="derail" class="form-control" value="${SBook.derail}" required>
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="修改">
        </div>

    </form>

</div>

</body>
</html>
