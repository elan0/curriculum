<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- 上記のものは俗にいうディレクティブ<% %>、ディレクティブには種類がある -->
<!--
pageディレクティブ
	language=JSPで使用する言語の指定
	contentType=JSPのデータの型(サイトならhtml)
	pageEncodingJSPページの文字コードの指定
	その他の使いそうな指定
	import=JSPで使用するクラスの指定="java.util.Date"
	session=セッションの有効無効="true"
	errorPage=エラーが発生した時の遷移先を指定="index2.html"
includeディレクティブ
	JSPから他のJSPファイルを読み込むときに使用する
	<% %>内にinclude file="読み込みたいファイル"で使用することが出来る

taglibディレクティブ
 -->
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HelloWorld</h1>
</body>
</html>