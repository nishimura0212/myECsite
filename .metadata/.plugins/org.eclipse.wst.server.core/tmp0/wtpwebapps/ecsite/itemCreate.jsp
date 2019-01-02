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
<title>ItemCreate画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<img src="./img/lawson02.png"/>
	</div>
	<div id="main">
		<div id="top">
			<p>ItemCreate</p>
		</div>
		<div>
			<s:if test="errorMessage != ''">
				<s:property value="errorMessage" escape="false"/>
			</s:if>
			<table>
				<s:form action="ItemCreateConfirmAction">
					<tr>
						<td>
						<label>カテゴリー：</label>
						</td>
						<td>
							<select name="itemCategory">
								<option>選択してください</option>
								<option value="Fruits">Fruits</option>
								<option value="Desserts">Desserts</option>
								<option value="Foods">Foods</option>
								<option value="Seasonings">Seasonings</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>
						<label>商品名：</label>
						</td>
						<td>
						<input type="text" name="itemName" value="" size=13/>
						</td>
					</tr>
					<tr>
						<td>
						<label>価格（半角数字）：</label>
						</td>
						<td>
						<input type="text" name="itemPrice" value="" size=10/>
						<span>円</span>
						</td>
					</tr>
					<tr>
						<td>
						<label>在庫（半角数字）：</label>
						</td>
						<td>
						<input type="text" name="itemStock" value="" size=10/>
						<span>個</span>
						</td>
					</tr>
					<tr>
						<td>
						<label>画像：</label>
						</td>
						<td>
						<input type="file" name="itemImage"/>
						</td>
					</tr>
					<s:submit value="登録"/>
				</s:form>
				</table>

				<div>
					<p>前画面に戻る場合は
						<a href='<s:url action="GoAdminAction"/>'>こちら</a></p>
				</div>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>

</body>
</html>