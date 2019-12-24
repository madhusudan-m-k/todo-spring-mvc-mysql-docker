<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
    <h1>Add new TODO items to the list</h1>
    <form:form name="todoform" method="post" action="./addtodo" modelAttribute="todoModel">
        <table>
            <tr>
                <td>Name :</td>
                <td>
                    <form:input type="text" path="todoName" size="50" />
                </td>
            </tr>
            <tr>
                <td>Date :</td>
                <td>
                    <form:input type="text" path="todoDate" size="10" />
                </td>
            </tr>
            <tr>
                <td>Completed :</td>
                <td>
                    <form:checkbox path="completed" />
                </td>
            </tr>
            <tr>
                <td>
                    <input type="button" name="Submit" value="Submit" onclick="document.forms['todoform'].submit();" />
                </td>
            </tr>
    </form:form>
    </table>
</body>

</html>