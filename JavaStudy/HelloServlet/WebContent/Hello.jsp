<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/css/style.css">
<title>スポーツ選択画面</title>
</head>
<body>
	<div class="box">
	<h1>Hello</h1>
	<form action="/HelloServlet/sample" method="post">
		<input type="submit" value="送信">
	</form>
	</div>
	<div class="box">
	<h1>Sports</h1>
	<form action="/helloPackage/SportsServlet" method="post">
		<input type="checkbox" name="sports" value="tennis">テニス
		<input type="checkbox" name="sports" value="baseball">野球
		<input type="checkbox" name="sports" value="football">サッカー
		<input type="checkbox" name="sports" value="table_tennis">卓球
		<input type="checkbox" name="sports" value="basketball">バスケットボール
		<input type="submit" value="送信">
	</form>
	</div>
</body>
</html>