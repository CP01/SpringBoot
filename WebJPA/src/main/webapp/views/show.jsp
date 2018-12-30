<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.cp.model.User" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Data</title>
</head>
<body>
<h1>Registered Users</h1>
<form action="home">
<tr><th> <label>ID</label> </th>
<th> <label>Name</label> </th></tr>
<%! String str = "";%>
<%! Iterable<User> itr = null; %>
<%
itr = (Iterable) request.getAttribute("itr");
itr.forEach(curUser -> {
str = str +" "+ ((User) curUser).getId();
str = str +" "+ ((User) curUser).getName();
});%>
<%= str%>
<input type="submit" name="Submit" />
</form>
</body>
</html>