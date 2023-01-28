<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PlayerManager</title>
<link rel="stylesheet" href="/PlayerManager/login.css">
</head>
<body>
	<div id="container">
    <br><br><br>
    <h1>PLAYERMANAGER</h1>
    <br><br><br>

    <div id="login">
        <fieldset class="field1">
            <ul id="shipping">
                <li>
                    <label for="user_id">아이디</label>
                    <input type = "text" id="user_id" required>
                </li>
                <li>
                    <label for="user_pw">비밀번호</label>
                    <input type = "password" id="user_pw" required>
                </li>
            </ul>
        </fieldset>
</div>

    <div id="button-area">
        <p id="input"><input type="button" value="로그인" onClick="alert('로그인 성공하였습니다.\n플레이어 정보 관리 페이지로 이동합니다.')"></p>
        <p id="input"><input type="button" value="회원가입" onclick="location.href='page3.html'"></p>
    </div>



    <!-- <p id="input">아이디 : <input type="text"></p>
    <p id="input">비밀번호 : <input type="password"></p>
    <p id="input"><input type="submit" value="로그인" onClick="alert('로그인 성공하였습니다.\n플레이어 정보 관리 페이지로 이동합니다.')"></p> -->
    
    <!--onclick="location.href='page2.html'"  -->


    </div>
</body>
</html>