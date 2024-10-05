<%@page import="java.util.List"%>
<%@page import="spring.mvcModel.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>My Name is ${name} </h1>

 <%-- <% 
  List<Student> std=(List<Student>)request.getAttribute("m");%>
<% for(Student st: std ) {
	%>
<h1>    $ {paramValue.getEmail() }</h1>
<h1>	<%=st.getPass() %></h1>
  <h1>  <%=st.getId() %></h1>
  
<% 
}
%> 
 --%>
 
 <c:forEach   var="std"  items="${m}">
 
 <c:out value="${std.getEmail()}"></c:out>
 </c:forEach>
 

<%-- ${std.email}
${std.pass} 
hello --%>

</body>
</html>