<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
    <h1>Welcome to do list for the user ${userName}</h1>
    <table border="1">
        <tr>
            <td>Id</td>
            <td>Todo</td>
            <td>Date</td>
            <td>Completed</td>
        </tr>
        <c:forEach items="${todolist}" var="todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.todoName}</td>
                <td>${todo.todoDate}</td>
                <td>${todo.completed}</td>
            </tr>
        </c:forEach>
    </table>
    <spring:url value="/todo/createnewtodo" var="url" htmlEscape="true" />
    <a href="${url}">Click to create Todo</a>
</body>

</html>