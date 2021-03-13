<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<title>ログイン画面</title>
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="main">
		<table>
			<tr>
				<th>name</th>
				<th><input type="text" name="namae" size="19"></th>
			</tr>
			<tr>
				<td>id</td>
				<td><input type="password" name="pass" size="20"></td>
			</tr>
		</table>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>