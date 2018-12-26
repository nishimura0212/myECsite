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
<title>Admin画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>

<body>
	<div id="header">
		<img src="./img/lawson02.png"/>
	</div>
	<div id="main">
		<div id="top">
			<p>Admin</p>
		</div>

		<div id="wrap">
			<div id="left">
				<div class="text-center">
					<h3>商品</h3>
					<s:form action="ItemCreateAction">
						<s:submit value="新規登録"/>
					</s:form>
					<s:form action="ItemListAction">
						<s:submit value="一覧"/>
					</s:form>
				</div>
			</div>

			<div id="right">
				<div class="text-center">
					<h3>ユーザー</h3>
					<s:form action="UserCreateAction2">
						<s:submit value="新規登録"/>
					</s:form>
					<s:form action="UserListAction">
						<s:submit value="一覧"/>
					</s:form>
				</div>
			</div>
		</div>

		<div id="text">
			<p class="text">Home画面に戻る場合は
				<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="GoLogin2Action"/>'>管理者</a></p>
	</div>

</body>
</html>