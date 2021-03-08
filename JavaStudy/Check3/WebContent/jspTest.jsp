<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<table>
		<tr>
			<th><h1>login</h1></th>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
			<th></th>
			<th style="font-size: 15px"><%@ include file="header.jsp" %></th>
		</tr>
		</table>
	</div>
	<div class="jspTest">

		<table>
		<tr>
			<th><label for="name">name</label></th>
			<th><input type="text" name="name" id="name"></th>
		</tr>
		<tr>
			<th><label for="ids">id</label></th>
			<th><input type="text" name="id" id="ids"></th>
		</tr>
		</table>
	</div>
	<div class="footer">
		<h1>hoge.Inc</h1>
	</div>
</body>
</html>