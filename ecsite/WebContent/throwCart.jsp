<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>カート追加画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<p>LOWSAN</p>
	</div>
	<div id="main">
		<div id="top">
			<p>カート追加画面</p>
		</div>
		<div class="comment">
			<h2 style="color:red">カートに商品を追加しました</h2>
			<a href='<s:url action="CartAction"/>'>カート</a>
			<span>から商品の確認が可能です。</span>
			<div class="center">
			<p>お買い物を続ける場合は
				<a href='<s:url action="GoSelectCategoryAction"/>'>こちら</a></p>
			<p>会員画面へ戻る場合は
				<a href='<s:url action="GoUserAction"/>'>こちら</a></p>
			<p>ログアウトする場合は
				<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>
</body>
</html>