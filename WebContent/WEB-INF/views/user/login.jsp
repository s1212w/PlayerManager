<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PlayerManager</title>
<link rel="stylesheet" href="/PlayerManager/resources/css/login.css"
	type="text/css">
<style>
#container {
	padding: 20px 40px;
	margin: 0px auto;
}

body {
	background-color: #F2E5E5;
}

h1 {
	font-size: 70px;
	font-weight: 1000;
	text-align: center;
	color: #CE7777;
	text-shadow: 5px 5px #154297, 8px 8px rgb(255, 255, 255);
}

ul {
	list-style-type: none;
	padding-left: 0;
}

li {
	margin: 10px;
}

#shipping li label {
	width: 80px;
	text-align: center;
	float: left;
}

.field1 {
	border: 5px dashed #6e6e6e;
	padding: 20px;
}

#login {
	width: 500px;
	margin: 0 auto;
	text-align: center;
}

input[type=submit],[type=reset] {
	width: 150px;
	height: 40px;
	background-color: antiquewhite;
	border: 1px solid #ccc;
	box-shadow: 1px 1px 1px #ccc;
	text-align: center;
	font-weight: bold;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #332c26;
	color: rgb(255, 255, 255);
}

input[type=reset]:hover {
	background-color: #332c26;
	color: rgb(255, 255, 255);
}

#button-area {
	margin-top: 40px;
	text-align: center; 
	--padding: 10px;
	border-radius: 20px;
}

a:link, a:visited {
		margin-top: 40px;
	text-align: center; 
	--padding: 10px;
	border-radius: 20px;
	width: 150px;
	height: 40px;
	background-color: antiquewhite;
	border: 1px solid #ccc;
	box-shadow: 1px 1px 1px #ccc;
	text-align: center;
	font-weight: bold;
	cursor: pointer;
	text-decoration: none;

}
a:hover, a:active {
background-color: #332c26;
	color: rgb(255, 255, 255);
}


</style>
</head>
<body>
	<div id="container">
		<br>
		<br>
		<br>
		<h1>PLAYERMANAGER</h1>
		<br>
		<br>
		<br>

		<form action="home.do" method="post">
			<div id="login">
				<fieldset class="field1">
					<ul id="shipping">
						<li><label for="user_id">아이디</label> <input type="text"
							id="user_id" name="user-id" required></li>
						<li><label for="user_pw">비밀번호</label> <input type="password"
							id="user_pw" name="user-pwd" required></li>
					</ul>
				</fieldset>
			</div>

			<div id="button-area">
				<p id="input">
					<input type="submit" value="로그인">
				</p>
				<p id="reset">
					<input type="reset" value="취소">
				</p>
				<span><a href="/user/enrollView.do">회원가입</a></span>
			</div>
		</form>



		<!-- <p id="input">아이디 : <input type="text"></p>
    <p id="input">비밀번호 : <input type="password"></p>
    <p id="input"><input type="submit" value="로그인" onClick="alert('로그인 성공하였습니다.\n플레이어 정보 관리 페이지로 이동합니다.')"></p> -->

		<!--onclick="location.href='page2.html'"  -->


	</div>
</body>
</html>