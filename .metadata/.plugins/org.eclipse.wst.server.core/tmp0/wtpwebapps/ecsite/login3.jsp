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
<title>Login画面</title>
<link rel="stylesheet" type="text/css" href="css/style5.css">
</head>
<body>
	<div id="header">
		<s:form action="LoginAction">
				<button type="submit" class="submit">戻る</button>
				<button type="submit" class="submit">ログイン</button>
			</s:form>
	</div>
	<div id="main">
		<div id="container">
		<div id="top">
			<h1>ログインしてください</h1>
		</div>
			<table>
				<tr>
					<td><label>ユーザーID：</label></td>
					<td><input type="text" name="loginUserId"/></td>
				</tr>
				<tr>
					<td><label>パスワード：</label></td>
					<td><input type="password" name="loginPassword"/></td>
				</tr>
			</table>
			<br>
			<s:form action="LoginAction">
				<button type="submit" class="submit2">戻る</button>
				<button type="submit" class="submit1">ログイン</button>
			</s:form>
			<br><br>
			<table class="table">
				<tr>
					<td>商品名</td>
					<td>折り紙</td>
				</tr>
				<tr>
					<td>価格</td>
					<td>100円</td>

				</tr>
				<tr>
					<td>個数</td>
					<td>3個</td>
				</tr>
			</table>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>

</body>
</html>