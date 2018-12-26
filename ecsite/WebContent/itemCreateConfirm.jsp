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
<title>ItemCreateConfirm画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<img src="./img/lawson02.png"/>
	</div>
	<div id="main">
		<div id="top">
			<p>ItemCreateConfirm</p>
		</div>
		<div>
			<h3>登録する内容は以下でよろしいですか。</h3>
			<table>
				<s:form action="ItemCreateCompleteAction">
					<tr id="box">
						<td>
						<label>カテゴリー：</label>
						</td>
						<td>
						<s:property value="itemCategory" escape="false"/>
						</td>
					</tr>
					<tr id="box">
						<td>
						<label>商品名：</label>
						</td>
						<td>
						<s:property value="itemName" escape="false"/>
						</td>
					</tr>
					<tr id="box">
						<td>
						<label>価格：</label>
						</td>
						<td>
						<s:property value="itemPrice" escape="false"/>
						<span>円</span>
						</td>
					</tr>
					<tr id="box">
						<td>
						<label>在庫：</label>
						</td>
						<td>
						<s:property value="itemStock" escape="false"/>
						<span>個</span>
						</td>
					</tr>
					<tr id="box">
						<td>
						<label>画像：</label>
						</td>
						<td>
						<s:property value="itemImage" escape="false"/>
						</td>
					</tr>
					<tr>
						<td>
						<s:submit value="完了"/>
						</td>
					</tr>
				</s:form>
				</table>
				</div>
				<div>
					<p>商品登録画面に戻る場合は
					<a href='<s:url action="ItemCreateAction"/>'>こちら</a></p>
				</div>
		</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>

</body>
</html>