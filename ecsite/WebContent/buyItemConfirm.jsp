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
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>購入商品確認画面</title>
<script type ="text/javascript">
	function submitAction(url) {
		$('form').attr('action',url);
		$('form').submit();
	}
</script>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<p>LOWSAN</p>
	</div>
	<div id="main">
		<div id="top">
			<p>購入商品確認画面</p>
		</div>
		<div class="comment">
			以下の内容でよろしいですか。
		</div>
		<div class="containerB">
			<s:form cssClass="flex-container">
			<p class="left">
				<img src='<s:property value="itemImage"/>'>
			</p>
				<table class="right">
				<tr>
					<td class="td-left">商品名</td>
					<td class="td-right"><s:property value="#session.buyItem_name"/></td>
				</tr>
				<tr>
					<td class="td-left">値段</td>
					<td class="td-right"><s:property value="#session.total_price"/><span>円</span></td>
				</tr>
				<tr>
					<td class="td-left">購入個数</td>
					<td class="td-right"><s:property value="#session.count"/><span>個</span></td>
				</tr>
				<tr>
					<td class="td-left">支払い方法</td>
					<td class="td-right"><s:property value="#session.pay"/></td>
				</tr>
				</table>
				<div class="button">
					<input type="hidden" name="back" value="1"/>
					<input type="button" value="戻る" onclick="submitAction('SelectItemAction')" class="gray_btn"/>
					<input type="button" value="完了" onclick="submitAction('BuyItemConfirmAction')" class="single_btn"/>
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