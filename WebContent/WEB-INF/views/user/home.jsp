<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈 화면</title>
    <style>
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
        h4 {
        	text-align : center;
        }
        #input {
            text-align: center;
        }

        .container {
            display: flex;
            justify-content: center;
            flex-direction: column;
            align-items: center;
        }

        .box {
            width: 300px;
            height: 100px;
            --background-color: #154297;
        }

        .container-2 {
            display: flex;
            justify-content: center;
        }

        p {
            text-align: center;
        }

        input[type=button] {
            width:180px;
            height: 40px;
            background-color:rgb(206, 183, 188);
            border: 1px solid rgb(139, 139, 139);
            box-shadow: 1px 1px 1px rgb(49, 47, 47);
            text-align: center;
            border-radius: 5px;
            --background: transparent;
            cursor: pointer;
        }

        input[type=button]:hover {
            background-color: #500522;
            color: white;
        }

        #btn2 {
            margin: 10px;
            width:100px;
            height: 40px;
            background-color:rgb(181, 179, 190);
            --border: 1px solid rgb(116, 19, 19);
            text-align: center;
            cursor: pointer;
            
        }
        #btn2:hover {
            background-color: #500522;
            color: white;
        }



    </style>
</head>
<body>
<br><br>
    <h1>PLAYERMANAGER</h1>
    <h4>${userId }님 환영합니다.</h4>
    <br><br>

    <div class="container">
        <div class="box">
            <p><input type='button' value='플레이어 추가하기'/></p>
        </div>
        <div class="box">
            <p><input type='button' value='플레이어 정보 보기'/></p>
        </div>
        <div class="box">
            <p><input type='button' value='플레이어 장비 추가하기'/></p>
        </div>
    </div>

    <br><br>

    <div class="container-2">
        <input type='button' id="btn2" value='회원 정보 수정' onClick="location.href='/user/myInfo.do?user-id=${userId}'"/>
        <input type='button' id="btn2" value='로그아웃' onclick="location.href='/user/logout.do'"/>
    </div>

</body>
</html>