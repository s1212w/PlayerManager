<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
            font-family: 'Noto Sans KR', sans-serif;
            font-size: 25px;
            text-align: center;
        }

        #player_add {
            width: 400px;
            text-align: center;
            margin: 0 auto;
        }

        ul {
            list-style-type: none;
            --padding-left: 0;
        }

        li {
            margin:10px;
            font-family: 'Noto Sans KR', sans-serif;
        }

        #player_info li label {
            width: 50px;
            text-align: left;
            float: left;
        }


        fieldset {
            border: 3px dashed #6e6e6e;
        }

        fieldset legend {
            font-family: 'Noto Sans KR', sans-serif;
            font-weight: bold;
            text-align: center;
        }

        select {
            width: 170px;
        }

        input[type=submit] {
            width: 300px;
            height: 35px;
            background-color:antiquewhite;
            --border: 1px solid #ccc;
            --box-shadow: 1px 1px 1px #ccc;
            text-align: center;
            font-weight: bold;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: #332c26;
            color: rgb(255, 255, 255);
        }

        #button-area {
            margin-top: 40px;
            text-align: center;
            --padding: 10px;
            --border-radius: 20px;
        }
	
</style>
</head>
<body>
	<br>
    <h1>PLAYERMANAGER</h1>
    <h2>플레이어 등록하기</h2>
    <br>

	<form action="/player/add.do" method="post">
    <div id="player_add">
    <fieldset>
        <legend>플레이어 정보 입력</legend>
        <ul id="player_info">
            <li>
                <label for="name">닉네임</label>
                <input type="text" id="name" name="player-name">
            </li>
            <li>
                <label for="job">직업</label>
                <input type="text" id="job" name="player-job">
            </li>
            <li>
                <label for="level">레벨</label>
                <input type="text" id="level" name="player-level">
            </li>
            <li>
                <label for="str">STR</label>
                <input type="text" id="str" name="player-str">
            </li>
            <li>
                <label for="dex">DEX</label>
                <input type="text" id="dex" name="player-dex">
            </li>
            <li>
                <label for="int">INT</label>
                <input type="text" id="int" name="player-int">
            </li>
            <li>
                <label for="luk">LUK</label>
                <input type="text" id="luk" name="player-luk">
            </li>
        </ul>
    </fieldset>
    </div>

    <div id="button-area">
        <p id="input"><input type="submit" value="등록하기"></p>
    </div>
    </form>

</body>
</html>