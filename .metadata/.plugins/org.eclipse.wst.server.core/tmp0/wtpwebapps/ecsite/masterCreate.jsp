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
<title>MasterCreate画面</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="header">
		<img src="./img/lawson02.png"/>
	</div>
	<div id="main">
		<div id="top">
			<p>MasterCreate</p>
		</div>
		<div>
			<s:if test="errorMessage != ''">
				<s:property value="errorMessage" escape="false"/>
			</s:if>
			<table>
				<s:form action="MasterCreateConfirmAction">
					<tr>
						<td>
						<label>管理者ID：</label>
						</td>
						<td>
						<input type="text" name="loginMasterId" value=""/>
						</td>
					</tr>
					<tr>
						<td>
						<label>パスワード：</label>
						</td>
						<td>
						<input type="text" name="loginPassword" value=""/>
						</td>
					</tr>
					<tr>
						<td>
						<label>管理者名：</label>
						</td>
						<td>
						<input type="text" name="masterName" value=""/>
						</td>
					</tr>
					<s:submit value="登録"/>
				</s:form>
				</table>

				<div>
					<span>前画面に戻る場合は</span>
						<a href='<s:url action="AdminAction"/>'>こちら</a>
				</div>
		</div>
	</div>
	<div id="footer">
		<p>copyright &copy; internous | ECsite is one which provides A to Z about programming<br/>
		<a href = '<s:url action="AdminAction"/>'>管理者</a></p>
	</div>
</body>
</html>