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
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<img src="./img/lawson02.png"/>
	</div>
	<div id="main">
		<div id="top">
			<p>Login</p>
		</div>
		<div>
			<div>
				<s:if test="errorMessage !=''">
					<s:property value="errorMessage"/>
				</s:if>
			</div>
			<h3>ログインをお願いします</h3>
			<table>
			<s:form action="LoginAction2">
				<tr>
					<td><label>管理者ID：</label></td>
					<td><input type="text" name="loginMasterId"/></td>
				</tr>
				<tr>
					<td><label>パスワード：</label></td>
					<td><input type="password" name="loginPassword"/></td>
				</tr>
				<s:submit value="ログイン"/>
			</s:form>
			</table>
			<br/>
			<div id="text-link">
				<p>新規管理者登録は
					<a href='<s:url action="MasterCreateAction"/>'>こちら</a></p>
				<p>Homeへ戻る場合は
					<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>

</body>
</html>