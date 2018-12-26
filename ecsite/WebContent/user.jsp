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
<title>会員画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<p>LOWSAN</p>
		<div id="header-icon">
			<ul>
				<li class="icon">
					<a href="LogoutAction">
					ログアウト<img src="./img/icon/logout.png" width="30px" height="30px">
					</a>
				</li>
			</ul>
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>会員画面</p>
			<div class="comment">
				ようこそ
				<s:property value="#session.user" />
				さん
			</div>
		</div>
		<div class="main-text">
			<s:form action="GoSelectCategoryAction">
				<button type="submit" class="userButton">商品購入</button>
			</s:form>
			<s:form action="CartAction">
				<button type="submit" class="userButton">カート</button>
			</s:form>
			<s:form action="BuyHistoryAction">
				<button type="submit" class="userButton">購入履歴</button>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>
</body>
</html>