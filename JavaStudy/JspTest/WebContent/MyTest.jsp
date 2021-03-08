<%@page import="Servlem.javaWebSample"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%= new Date().toString() %></p>
	<p><%= new javaWebSample() %></p>
	<%
	String[] fruits = new String[] {"apple","Banaba","Calon","Dingo"};
	String favorite = fruits[1];
	%>
	<p><%= favorite %></p>
	<!-- サーバー側に処理を送るためのもの -->
	<form method="POST" action="MySampleServlet">
		<input type="text" name="message">
		<button type="submit">Send</button>
	</form>
</body>
</html>