<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生管理系统|更新信息</title>
    <style>
        strong{
            font-size: 20px;
        }
    </style>
</head>
<body style="background-image: linear-gradient(90deg, #ffe3ec 0%, #c1fffd 100%);">
<div align="center">
    <h1 style="font-size: 36px">编辑学生信息</h1>
    <form action="/update" method="post">
        <div>
            <div style=" text-align: left;width: 240px;height: 20px;" >
                <label><strong>id</strong> </label>
            </div><br>
            <input style="border-radius: 6px;width: 240px;height: 38px;" type="text" name="student_id" value="${student.student_id}" hidden>
        </div><br>
        <div>
            <div style=" text-align: left;width: 240px;height: 20px;" >
                <label><strong>学号：</strong></label>
            </div><br>
            <input style="border-radius: 6px;width: 240px;height: 38px;" type="text" name="student_number" value="${student.student_number}" placeholder="请输入学号" required>
        </div><br>
        <div>
            <div style=" text-align: left;width: 240px;height: 20px;" >
                <label><strong>姓名：</strong> </label>
            </div><br>
            <input style="border-radius: 6px;width: 240px;height: 38px;"type="text" name="student_name" placeholder="请输入姓名" required value="${student.student_name}">
        </div><br>
        <div>
            <div style=" text-align: left;width: 240px;height: 20px;" >
                <label><strong>密码：</strong> </label>
            </div><br>
            <input style="border-radius: 6px;width: 240px;height: 38px;" type="password" name="student_password" placeholder="请输入密码" value="${student.student_password}" required>
        </div><br>
        <div>
            <div style="text-align: left; width: 240px;height: 20px;">
                <label><strong >性别：</strong> </label>
                <c:choose>
                    <c:when test="${student.student_sex==1}">
                        <label style="font-size: 19px">男<input type="radio" name="student_sex" value="1" checked></label>&emsp;&emsp;&emsp;
                        <label style="font-size: 19px">女<input type="radio" name="student_sex" value="0" ></label>
                    </c:when>
                    <c:when test="${student.student_sex==0}">
                        <label style="font-size: 19px">男<input type="radio" name="student_sex" value="1" ></label>&emsp;&emsp;&emsp;
                        <label style="font-size: 19px">女<input type="radio" name="student_sex" value="0" checked></label>
                    </c:when>
                </c:choose>
            </div>
        </div><br><br>
        <div align="left" style="width: 240px">
            <input type="submit" style="border-radius: 8px; background-color: #47ecfc;width: 80px;height: 40px;color: #f2f8f7" value="更新">
        </div>
    </form>
</div>
</body>
</html>

