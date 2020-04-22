<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<link rel="stylesheet"
      href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<body>

<div class="container">
    <h1>User Details</h1>
    <p align="right">
        <button
                onclick="window.location.href = 'userAdd.html'; return false;"
                class="btn btn-primary">Add User</button>
    </p>
    <hr />
    <table border="1" class="table table-striped table-bordered">
        <thead class="thead-dark">
        <tr>
            <th> Name</th>
            <th>Left Money</th>
            <th>Password</th>

        </tr>
        </thead>
        <c:forEach items="${userList}" var="e">
            <c:url var="updateLink" value="/user/userUpdate">
                <c:param name="userId" value="${e.id}" />
            </c:url>

            <c:url var="deleteLink" value="/user/userDelete">
                <c:param name="userId" value="${e.id}" />
            </c:url>
            <tbody>
            <tr>
                <td>${e.name}</td>
                <td>${e.leftmoney}</td>
                <td>${e.password}</td>

                <td><a href="${updateLink}">Update</a> | <a
                        href="${deleteLink}"
                        onclick="if(!(confirm('Are you sure want to delete this User permanently?'))) return false">Delete</a>
                </td>
            </tr>
            </tbody>
        </c:forEach>
    </table>
</div>

</body>
</html>