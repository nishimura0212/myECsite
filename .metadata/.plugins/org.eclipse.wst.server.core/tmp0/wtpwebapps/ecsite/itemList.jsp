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
<title>ItemList画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<img src="./img/lawson02.png"/>
	</div>
	<div id="main">
		<div id="top">
			<p>ItemList</p>
		</div>
		<div>
			<h3>商品一覧は以下のとおりです。</h3>
				<table border="1">
					<tr>
						<th></th>
						<th>カテゴリー</th>
						<th>商品名</th>
						<th>値段</th>
						<th>在庫</th>
					</tr>
					<s:iterator value="itemInfoDTO">
						<tr>
							<td><s:property value="id"/></td>
							<td><s:property value="itemCategory"/></td>
							<td><s:property value="itemName"/></td>
							<td><s:property value="itemPrice"/><span>円</span></td>
							<td><s:property value="itemStock"/><span>個</span></td>
						</tr>
					</s:iterator>
				</table>
				<s:form action="ItemListDeleteConfirmAction">
					<s:submit value="削除"/>
				</s:form>
		</div>
		<div id="text">
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