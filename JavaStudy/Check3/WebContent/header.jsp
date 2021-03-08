<%@page import="java.text.SimpleDateFormat"%>
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
	<%
	SimpleDateFormat sdf =new SimpleDateFormat("yyyy/mm/dd");
	Date date =sdf.parse("2019/03/01");
	String date2 = sdf.format(date);
	%>
			<p> <%= date2 %>
</body>
</html>