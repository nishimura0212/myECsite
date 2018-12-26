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
<title>ホーム画面</title>
<link rel="stylesheet" type="text/css" href="css/home.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
<script>
	$(document).ready(function(){
		$('.slide1').bxSlider({
			ticker: true,
			slideWidth: 400,
			minSlides: 2,
			maxSlides: 5,
			speed: 60000,
			controls: false,
			pager: false,
			useCSS: false
		});
	});
	$(document).ready(function(){
		$('.slide2').bxSlider({
			ticker: true,
			slideWidth: 400,
			autoDirection: 'prev',
			minSlides: 2,
			maxSlides: 5,
			speed: 70000,
			controls: false,
			pager: false,
			useCSS: false
		});
	});
</script>
</head>
<body>
	<div id="header">
		<p>LOWSAN</p>
		<div id="header-icon">
			<ul>
				<li class="icon">
					<a href="GoLoginAction">
					ログイン<img src="./img/icon/login.png" width="30px" height="30px">
					</a>
				</li>
				<li class="icon">
					<a href="UserCreateAction">
					新規会員登録<img src="./img/icon/human.png" width="30px" height="30px">
					</a>
				</li>
			</ul>
		</div>
	</div>
	<div id="main">
		<div class="slide1">
			<div>
				<img src="./img/slide1.png">
			</div>
			<div>
				<img src="./img/slide2.png">
			</div>
			<div>
				<img src="./img/slide3.png">
			</div>
			<div>
				<img src="./img/slide4.png">
			</div>
			<div>
				<img src="./img/slide5.png">
			</div>
			<div>
				<img src="./img/slide6.png">
			</div>
			<div>
				<img src="./img/slide7.png">
			</div>
			<div>
				<img src="./img/slide8.png">
			</div>
			<div>
				<img src="./img/slide9.png">
			</div>
			<div>
				<img src="./img/slide10.png">
			</div>
		</div>
		<div class="center-bar">
			<p>マチの元気印<br>「LOWSAN」<br>でお買い物しよう！</p>
		</div>
		<div class="slide2">
			<div>
				<img src="./img/slide11.png">
			</div>
			<div>
				<img src="./img/slide12.png">
			</div>
			<div>
				<img src="./img/slide13.png">
			</div>
			<div>
				<img src="./img/slide14.png">
			</div>
			<div>
				<img src="./img/slide15.png">
			</div>
			<div>
				<img src="./img/slide16.png">
			</div>
			<div>
				<img src="./img/slide17.png">
			</div>
			<div>
				<img src="./img/slide18.png">
			</div>
			<div>
				<img src="./img/slide19.png">
			</div>
			<div>
				<img src="./img/slide20.png">
			</div>
		</div>
	</div>
	<div id="footer">
		<p>
			copyright &copy; internous | ECsite is one which provides A to Z
			about programming<br><a href='<s:url action="AdminAction"/>'>管理者</a>
		</p>
	</div>
</body>
</html>