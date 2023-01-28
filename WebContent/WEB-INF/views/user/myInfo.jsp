<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세 정보</title>
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

        #join {
            width: 300px;
            margin: 0 auto;
        }
        
        input[type=text], input[type=password]{
            width:300px;
            height: 35px;
            margin-top: 5px;
        }

        input[type=submit],input[type=reset] {
            width: 150px;
            height: 35px;
            background-color:antiquewhite;
            --border: 1px solid #ccc;
            --box-shadow: 1px 1px 1px #ccc;
            text-align: center;
            font-weight: bold;
            cursor: pointer;
        }

        input[type=submit]:hover,input[type=reset]:hover {
            background-color: #332c26;
            color: rgb(255, 255, 255);
        }

        #button-area {
            margin-top: 40px;
            text-align: center;
            --padding: 10px;
            --border-radius: 20px;
        }

        #title {
            font-weight: bolder;
        }
    </style>
</head>
<body>
    <br><br>
    <h1>PLAYERMANAGER</h1>
    <br><br>

    <form action="/user/update.do" method="post">

        <div id="join">
            <label for="join_id"  id="title">아이디</label><br>
            <input type = "text" id="join_id" name="user-id" value="${user.userId }" required> <br><br>
            <label for="join_pwd" id="title">비밀번호</label> <br>
            <input type = "password" id="join_pwd" name="user-pwd" value="${user.userPwd }" required> <br><br>
            <label for="join_name" id="title">이름</label> <br>
            <input type = "text" id="join_name" name="user-name" value="${user.userName }" required> <br><br>
            <label for="join_email" id="title">이메일</label> <br>
            <input type = "text" id="join_email" name="user-email" value="${user.userEmail }" required> <br><br>
        </div>
        <div id="button-area">
            <input type="submit" value="수정하기">
            <input type="reset" value="초기화">
        </div>

    </form>


</body>
</html>