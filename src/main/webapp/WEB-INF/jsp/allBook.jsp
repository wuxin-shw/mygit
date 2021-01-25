<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 无心y
  Date: 2020/12/5
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">


</head>
<body>
<div class="container">
    <div class="row-clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 ————————  显示所有书籍</small>
                </h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">显示全部书籍</a>
            </div>

            <div class="col-md-8 column">
                <form class="form-inline" action="${pageContext.request.contextPath}/book/searchBook" method="post" style="float:right">
                    <span style="color:red;font-weight: bold">${error}</span>
                    <input type="text" name="bookName" class="form-control" placeholder="请输入要查询书籍的名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                    
                </form>
            </div>
        </div>

    </div>


    <div class="row-clearfix">
         <div class="col-md-12 column">
             <table class="table table-hover table-striped">
                 <thead>
                    <tr>
                        <th>书籍编号</th>
                        <th>书籍名称</th>
                        <th>书籍数量</th>
                        <th>书籍详情</th>
                        <th>操作</th>
                    </tr>
                 </thead>
                    <c:forEach var="book" items="${list}">
                        <tr>
                            <td>${book.bookid}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.derail}</td>
                            <td>

                                <a href="${pageContext.request.contextPath}/book/toUpdate?id=${book.bookid}">修改</a>
                                |
                                <a href="${pageContext.request.contextPath}/book/delete/${book.bookid}">删除</a>
                            </td>
                        </tr>
                    </c:forEach>
                 <tbody>
                 </tbody>
             </table>
         </div>
    </div>
</div>
<h1></h1>
</body>
</html>
