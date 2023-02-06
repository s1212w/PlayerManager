<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>플레이어 목록</title>
<style>
        @import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400&display=swap');

        body {
            background-color: #F2E5E5;
        }

        h1 {
            font-size: 60px;
            font-weight: 1000;
            text-align: center;
            color: #CE7777; 
            text-shadow: 5px 5px #154297, 8px 8px rgb(255, 255, 255);
        }
        
        h2 {
            font-size: 25px;
            text-align: center;
            font-family: 'Noto Sans KR', sans-serif;
        }
        
        .container {
            text-align: center;
            font-family: 'Noto Sans KR', sans-serif;
        }

        input[type=button] {
            width: 200px;
            height: 35px;
            background-color:antiquewhite;
            --border: 1px solid #ccc;
            --box-shadow: 1px 1px 1px #ccc;
            text-align: center;
            font-weight: bold;
            cursor: pointer;
            font-family: 'Noto Sans KR', sans-serif;
            
        }

        input[type=button]:hover {
            background-color: #332c26;
            color: rgb(255, 255, 255);
        }

        #button-area {
            margin-top: 40px;
            text-align: center;
            --padding: 10px;
            --border-radius: 20px;
        }

        #btn2 {
            background-color: #cfcfcf;
            width: 150px;
        }
</style>
</head>
<body>
    <br>
    <h1>PLAYERMANAGER</h1>
    <h2>플레이어 목록</h2>
    <br>

    <div class="container">
    	<c:forEach items = "${pList }" var="player">
        	<a href="/player/info?player-number=${player.playerNumber }">${player.playerName } </a><br>
        </c:forEach>
    </div>


    <div id="button-area">
        <p id="input"><input type="button" id="btn2" onclick = "location.href = '/user/home.do'" value="뒤로 가기"></p>
    </div>
</body>
</html>