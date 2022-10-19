<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>手机列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>手机列表 —— 显示所有手机</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/phone/toAddPhone">新增手机</a>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/phone/allPhone">显示全部手机</a>
        </div>
        <div class="col-md-4 column"></div>
        <%--查询--%>
        <div class="col-md-4 column">
            <span style="color: #ee2020 ;font-weight: bold">${error}</span>
            <form action="${pageContext.request.contextPath}/phone/queryPhone" method="post" style="float:right" class="form-inline">
                <div class="form-group">
                <input type="text" name="queryPhoneName" class="form-control" placeholder="请输入要查询的手机">
                </div>
                <div class="form-group">
                <input type="submit" value="查询" class="btn btn-primary">
                </div>
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>手机编号</th>
                    <th>手机名字</th>
                    <th>手机数量</th>
                    <th>手机详情</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="phone" items="${requestScope.get('list')}">
                    <tr>
                        <td>${phone.getPhoneID()}</td>
                        <td>${phone.getPhoneName()}</td>
                        <td>${phone.getPhoneCounts()}</td>
                        <td>${phone.getDetail()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/phone/toUpdatePhone?id=${phone.getPhoneID()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/phone/del/${phone.getPhoneID()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>