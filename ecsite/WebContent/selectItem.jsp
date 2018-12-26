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
<title>商品選択画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<p>LOWSAN</p>
		<div id="header-icon">
			<ul>
				<li class="icon">
					<a href="GoSelectCategoryAction">
					前画面に戻る<img src="./img/icon/back.png" width="30px" height="30px">
					</a>
				</li>
				<li class="icon">
					<a href="BuyHistoryAction">
					購入履歴<img src="./img/icon/History.png" width="30px" height="30px">
					</a>
				</li>
			</ul>
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>商品選択画面</p>
		</div>
		<div class="item-wrap">
			<div>
			<s:iterator value="sCDTO">
			<div class="flex-container">
				<div class="itemBox">
					<!-- 画像をクリックすると商品IDをActionに渡す -->
					<a href='<s:url action="SelectItemAction">
						<s:param name="selectItemName" value="itemName"/></s:url>'>
						<img src='<s:property value="itemImage"/>'>
						<input type="hidden" name="back" value="1" />
					</a>
					<p class="itemName">
					<s:property value="itemName" />
					</p>
				</div>
			</div>
			</s:iterator>
			</div>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>
</body>
</html>