<%--
  Created by IntelliJ IDEA.
  User: Luannv
  Date: 11/7/2023
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Student List</h1>

    <table>
        <thead>
            <tr>
                <th>StudentCode</th>
                <th>FullName</th>
                <th>Age</th>
                <th>Sex</th>
            </tr>
        </thead>
        <tbody>

        <c:forEach items="${students}" var="st">
            <tr>
                <td>${st.studentId}</td>
                <td>${st.fullName}</td>
                <td>${st.age}</td>
                <td>${st.sex ? "Duc" : "cai"}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
