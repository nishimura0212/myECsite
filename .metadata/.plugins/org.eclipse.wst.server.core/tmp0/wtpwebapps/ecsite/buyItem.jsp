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
<title>商品購入画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<p>LOWSAN</p>
		<div id="header-icon">
			<ul>
				<li class="icon">
					<a href="GoUserAction">
					会員画面へ戻る<img src="./img/icon/back.png" width="30px" height="30px">
					</a>
				</li>
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
			<p>商品購入画面</p>
		</div>
		<p class="comment">
		以下の商品を購入します<br>
		お支払い方法を選択し「購入する」ボタンを押してください</p>
		<table class="history-table">
			<tr>
				<th></th>
				<th>商品名</th>
				<th>値段</th>
				<th>購入個数</th>
				<th>購入日</th>
				<th>削除</th>
			</tr>
			<s:iterator value="cartList">
				<tr>
					<td class="td-img"><img
						src='<s:property value="itemImage"/>' class="buy-item-image"></td>
					<td><s:property value="item" /></td>
					<td><s:property value="totalPrice" /><span>円</span></td>
					<td><s:property value="totalCount" /><span>個</span></td>
					<td><s:property value="insert_date" /></td>
					<td><input type="checkbox" name="delete"
						value='<s:property value="id"/>' /></td>
				</tr>
			</s:iterator>
		</table>
		<s:form action="BuyItemAction">
			<div class="pay-method">
				<h4>お支払い方法</h4>
				<input type="radio" name="pay" value="1" checked="checked" class="radio">現金払い
				<br><input type="radio" name="pay"value="2" class="radio">クレジットカード
			</div>
			<div class="single">
				<button type="submit" class="single_btn">購入する</button>
			</div>
		</s:form>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>
</body>
</html>