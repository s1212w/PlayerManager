<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>플레이어 정보</title>
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



        input[type=button] {
            width: 300px;
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
        
        #modify,#delete {
        	width: 150px;
        	height: 35px;
        	background-color: white;
        }
        
        #modify:hover, #delete:hover {
         background-color: #332c26;
            color: rgb(255, 255, 255);
        }

        #button-area2 {
            margin-top: 40px;
            text-align: center;
            --padding: 10px;
            --border-radius: 20px;
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
    <h2>플레이어 정보</h2>
    <br>

    <div id="player_add">
    <fieldset>
        
        <ul id="player_info">
            <li>
                <label for="name">닉네임</label>
                <input type="text" id="name" value="${player.playerName }">
            </li>
            <li>
                <label for="job">직업</label>
                <input type="text" id="job" value="${player.playerJob }">
            </li>
            <li>
                <label for="level">레벨</label>
                <input type="text" id="level" value="${player.playerLevel }">
            </li>
            <li>
                <label for="str">STR</label>
                <input type="text" id="str" value="${player.playerStr }">
            </li>
            <li>
                <label for="dex">DEX</label>
                <input type="text" id="dex" value="${player.playerDex }">
            </li>
            <li>
                <label for="int">INT</label>
                <input type="text" id="int" value="${player.playerInt }">
            </li>
            <li>
                <label for="luk">LUK</label>
                <input type="text" id="luk" value="${player.playerLuk }">
            </li>
        </ul>
    </fieldset>
    </div>

    <div id="button-area">
	    	<div id="button-area2">
			    <input type="button" id="modify" value="수정하기" onclick = "location.href = '/player/modify?player-number=${player.playerNumber}'">
			    <input type="button" id="delete" value="삭제하기" onclick = "deleteCheck();">
			    
	    	</div>
	    	<br>
        <input type="button" value="목록으로 가기" onclick = "location.href = '/player/list'">
    </div>
    
    <script>
    	const deleteCheck = () => {
    		var playerNumber = "${player.playerNumber}";
    		if(confirm("삭제하시겠습니까?")) {
    			location.href="/player/remove?player-number="+playerNumber;
    		}
    	}
    </script>
</body>
</html>