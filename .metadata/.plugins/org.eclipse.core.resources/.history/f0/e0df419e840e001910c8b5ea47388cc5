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
					<form method="post" name="form1" action="GoSelectItemAction">
    				<input type="hidden" name="category" value="1">
    				<a href="javascript:form1.submit()">前画面に戻る<img src="./img/icon/back.png" width="30px" height="30px"></a>
					</form>
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
			<p>商品購入画面</p>
		</div>
		<div>
			<s:if test="errorMessage != ''">
				<s:property value="errorMessage" />
			</s:if>
		</div>
		<div class="containerA">
			<s:form action="BuyItemAction" cssClass="flex-container">
				<p class="left">
					<img src='<s:property value="itemImage"/>'>
				</p>
				<table class="right">
					<tr>
						<td class="td-left"><span>商品名</span></td>
						<td class="td-right"><s:property value="#session.buyItem_name" /><br></td>
					</tr>
					<tr>
						<td class="td-left"><span>値段</span></td>
						<td class="td-right"><s:property value="#session.buyItem_price" /> <span>円</span>
						</td>
					</tr>
					<tr>
						<td class="td-left"><span>購入個数</span></td>
						<td class="td-right"><select name="count" class="select">
								<option value="1" selected="selected">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
						</select></td>
					</tr>
					<tr>
						<td class="td-left"><span>支払い方法</span></td>
						<td class="td-right"><input type="radio" name="pay" value="1" checked="checked">現金払い
							 <br><input type="radio" name="pay"value="2">クレジットカード</td>
					</tr>
					<s:submit value="購入する" cssClass="single_btn" align="center"/>
				</table>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>

</body>
</html>