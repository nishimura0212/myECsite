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
<title>ログイン画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<p>LOWSAN</p>
		<div id="header-icon">
			<ul>
				<li class="icon">
					<a href="GoHomeAction">
					ホーム<img src="./img/icon/home.png" width="30px" height="30px">
					</a>
				</li>
				<li class="icon">
					<a href="UserCreateAction">
					新規会員登録<img src="./img/icon/human.png" width="30px" height="30px">
					</a>
				</li>
			</ul>
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>ログイン画面</p>
		</div>
		<div class="waku">
			<div class="error">
				<s:if test="errorMessage!=''">
					<p>
						<s:property value="errorMessage" />
					</p>
				</s:if>
			</div>
			<s:form action="LoginAction">
				<div class="table">
					<label>ユーザID：</label><br>
					<input type="text" name="loginUserId" class="textarea"/><br>
					<label>パスワード：</label><br>
					<input type="password" name="loginPassword" class="textarea"/>
				</div>
				<div class="single">
					<button type="submit" class="single_btn">ログイン</button>
				</div>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>
</body>
</html>