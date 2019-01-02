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
<title>UserList画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<img src="./img/lawson02.png"/>
	</div>
	<div id="main">
		<div id="top">
			<p>UserList</p>
		</div>
		<div>
			<h3>ユーザー一覧は以下のとおりです。</h3>
				<table border="1">
					<tr>
						<th></th>
						<th>ユーザーID</th>
						<th>パスワード</th>
						<th>ユーザー名</th>
					</tr>
					<s:iterator value="userInfoDTO">
						<tr>
							<td><s:property value="id"/></td>
							<td><s:property value="loginId"/></td>
							<td><s:property value="loginPass"/></td>
							<td><s:property value="userName"/></td>
						</tr>
					</s:iterator>
				</table>
				<s:form action="UserListDeleteConfirmAction">
					<s:submit value="削除"/>
				</s:form>
		</div>
		<div>
			<p>前画面に戻る場合は
				<a href='<s:url action="GoAdminAction"/>'>こちら</a></p>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>
</body>
</html>