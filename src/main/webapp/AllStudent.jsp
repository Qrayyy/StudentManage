<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <meta charset="utf-8">
  <title>学生管理系统</title>
  <style type="text/css">
    body{
      background-color: #ffe3ec;
      background-image: linear-gradient(90deg, #ffe3ec 0%, #c1fffd 100%);
    }
    thead{
      color: #a8efed;
    }
    td{
      font-size: 20px;
    }
    #h1{
      font-size: 30px;
    }
    h2{
      font-size: 25px;
    }
    #stu{
      background: #C1FFFD;
      border-radius: 18px;
      margin: auto;
      height: 350px;
      width: 600px;
      text-align: center;
    }
  </style>
</head>
<body>
<div style="margin: auto">
  <div style="text-align: center" id="h1"><h1>学生管理系统</h1></div>
  <div style="text-align: center;width: 1412px" ><h2>学生列表</h2></div>
  <table id="stu">
    <thead>
    <td style="color: #fcc7d8">id   </td>
    <td style="color: #fcc7d8">学号  </td>
    <td style="color: #fcc7d8">姓名  </td>
    <td style="color: #fcc7d8">密码  </td>
    <td style="color: #fcc7d8">性别  </td>
    <td style="color: #fcc7d8"> 操作  </td>
    </thead>
    <tbody>
    <c:forEach items="${studentlist}" var="student">
      <tr>
        <td>${student.student_id}</td>
        <td>${student.student_number}</td>
        <td>${student.student_name}</td>
        <td>${student.student_password}</td>
        <td>
          <c:choose><%--jstl的选择标签--%>
            <c:when test="${student.student_sex==0}">女</c:when>
            <c:when test="${student.student_sex==1}">男</c:when>
          </c:choose>
        </td>
        <td>
          <a href="${pageContext.request.contextPath}/update?student_id=${student.student_id}"><input style="width: 46px;height: 26px; border-radius: 4px;background: #28e050" type="button" value="编辑"></a>
          <a href="${pageContext.request.contextPath}/delete?student_id=${student.student_id}"><input style="width: 46px;height: 26px; border-radius: 4px;background: #fd7855" type="button" value="删除"></a>
        </td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
  <br><br>
  <div align="center" style="width: 1400px">
    <button style="border-radius: 10px; background-color: #47ecfc;width: 90px;height: 48px;color: #f2f8f7"
            type="submit" onclick="window.location.href='/add.jsp'">添加学生</button>
  </div>
</div>
</body>
</html>