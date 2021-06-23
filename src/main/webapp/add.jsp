<%--
  Created by IntelliJ IDEA.
  User: sdfczdv
  Date: 2021/6/15
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生管理系统|添加学生</title>
    <style>
        strong{
            font-size: 20px;
        }
    </style>
</head>
<body style="background-image: linear-gradient(90deg, #ffe3ec 0%, #c1fffd 100%);">
<div align="center">
    <h1 style="font-size: 36px">添加学生</h1><br>
    <form action="/add" method="post">
        <div>
            <div style=" text-align: left;width: 240px;height: 20px;" >
                <label><strong>学号：</strong> </label>
            </div><br>
            <input style="border-radius: 6px;width: 240px;height: 38px;" type="text" name="student_number" placeholder="请输入学号" required>
        </div><br>
        <div>
            <div style=" text-align: left;width: 240px;height: 20px;" >
                <label><strong>姓名：</strong> </label>
            </div><br>
            <input style="border-radius:  6px;width: 240px;height: 38px;"type="text" name="student_name" placeholder="请输入姓名" required>
        </div><br>
        <div>
            <div style=" text-align: left;width: 240px;height: 20px;" >
                <label><strong>密码：</strong> </label>
            </div><br>
            <input style="border-radius:  6px;width: 240px;height: 38px;" type="password" name="student_password" placeholder="请输入密码" required>
        </div><br>
        <div>
            <div style=" text-align: left;width: 240px;height: 50px;">
                <label><strong >性别：</strong> </label>
                <label style="font-size: 18px">男<input type="radio" name="student_sex" value="1" checked></label>&emsp;&emsp;&emsp;
                <label style="font-size: 18px">女<input type="radio" name="student_sex" value="0" ></label>
            </div>
        </div><br>
        <div  align="left" style="width: 240px">
            <input type="submit" style="border-radius: 8px; background-color: #47ecfc;width: 86px;height: 42px;color: #f2f8f7" value="添加学生">
        </div>
    </form>
</div>
<%--<%
    String addsuccess = (String) request.getAttribute("addsuccess");
    if(addsuccess!=null){
%>
<script type="text/javascript" language="javascript">
alert("<%=addsuccess%>");
window.location='/AllStudent.jsp';
</script>
<%
    }
%>--%>
</body>
</html>
