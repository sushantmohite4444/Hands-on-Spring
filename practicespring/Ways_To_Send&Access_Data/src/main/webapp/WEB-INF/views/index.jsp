<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"   %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String s=(String)request.getAttribute("name");
%>
<h1>"${ name }" </h1>

<p> my name is <%= s %></p>

<a href="input"><button>inter details</button></a>
 
</body>
</html>