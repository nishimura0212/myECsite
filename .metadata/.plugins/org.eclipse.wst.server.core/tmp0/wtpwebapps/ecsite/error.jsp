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
<title>Error画面</title>
<link rel="stylesheet" type="text/css" href="css/style4.css">
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>Error</p>
		</div>
		<div>
			<h3>エラーが発生しました。</h3>
			<div id="text-right">
				<p>Homeへ戻る場合は
					<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
				<p>ログアウトする場合は
					 <a href='<s:url action="LogoutAction"/>'>こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>