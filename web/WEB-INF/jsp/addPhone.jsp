<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增手机</title>
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
                    <small>新增手机</small>
                </h1>
            </div>
        </div>
    </div>


    <form action="${pageContext.request.contextPath}/phone/addPhone" method="post" class="form-inline">
        <div class="form-group">
            <label>手机名称：</label>
            <input type="text" name="phoneName" class="form-control">
        </div>
        <div class="form-group">
            <label>手机数量：</label>
            <input type="text" name="phoneCounts" class="form-control">
        </div>
        <div class="form-group">
            <label>手机详情：</label>
            <input type="text" name="detail" class="form-control">
        </div>
        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>
    </form>

</div>