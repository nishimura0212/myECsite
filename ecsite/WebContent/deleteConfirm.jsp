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
<title>履歴削除確認画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<p>LOWSAN</p>
	</div>
	<div id="main">
		<div id="top">
			<p>履歴削除確認画面</p>
		</div>
		<div>
			<p class="comment">以下の内容を削除します。</p>
			<s:form action="DeleteCompleteAction">
				<table class="history-table">
					<tr>
						<th></th>
						<th>商品名</th>
						<th>値段</th>
						<th>購入個数</th>
						<th>支払い方法</th>
						<th>購入日</th>
					</tr>
					<s:iterator value="deleteItemInfo">
						<tr>
							<td class="td-img"><img
								src='<s:property value="itemImage"/>' class="buy-item-image"></td>
							<td><s:property value="item"/></td>
							<td><s:property value="totalPrice"/><span>円</span></td>
							<td><s:property value="totalCount"/><span>個</span></td>
							<td><s:property value="payment"/></td>
							<td><s:property value="insert_date"/></td>
						</tr>
						<input type="hidden" name="deleteComplete"
							value='<s:property value="id"/>'>
					</s:iterator>
				</table>
				<br>
				<br>
				<input type="hidden" name="deleteFlg" value="1" />
				<div class="single">
				<button type="submit" class="gray_btn">削除</button>
				</div>
			</s:form>
		</div>
		<div class="text">
			<s:form action="BuyHistoryAction">
				<button type="submit" class="single_btn">キャンセル</button>
			</s:form>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>
</body>
</html>