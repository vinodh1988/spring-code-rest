<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h1> Spring application is running ...</h1>
 <hr/>
 <H3>List of names:</H3>
 <ul>
 <%
   String [] name= (String[])request.getAttribute("names");
   for (String n : name) {
 %>
     <li> <%= n %> </li>
 <% } %>
 </ul>
 <hr/>
 <h3> Session Value : <%=request.getAttribute("svalue") %></h3>
 <h3> Application Value : <%=request.getAttribute("avalue") %></h3>
</body>
</html>