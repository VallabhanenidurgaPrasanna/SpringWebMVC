<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String name=(String)request.getAttribute("name");
int id=(Integer)request.getAttribute("id");
List<String> list=(List<String>)request.getAttribute("Listofnames");
%>
<body>
<h2>Welcome to Spring Web MVC</h2>
<h2>My name is <%=name %></h2>
<h2>My id is<%=id %></h2>
<h2>List of names<%=list %></h2>
</body>
</html>