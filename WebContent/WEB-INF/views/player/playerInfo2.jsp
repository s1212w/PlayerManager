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
            width: 500px;
            text-align: center;
            margin: 0 auto;
        }


        fieldset {
            border: 3px dashed #6e6e6e;
        }
        
        #player-info {
        	font-family: 'Noto Sans KR', sans-serif;
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
        
        .blue{
        	background: #5abae6;
        }
        .red{
        	background: #d34e4e;
        }
        .green {
        	background: #9dbb19;
        }
        .yellow {
        	background: #f7b358;
        }
        
        span {
        	display : block;
        	margin: 10px 0;
        	color: #fff;
        	font-size: 20px;
        	line-height: 1.8em;
        	text-align: center;
        	border-radius: 15px;
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
	        <div id="player-info">
	                <h3>${player.playerName} </h3>
		
					<h3>${player.playerJob } </h3>
					
					<h3>Lv.${player.playerLevel }</h3>
	
	                <span class="blue" style="width:${player.playerStr}0px">STR</span>
	
	                <span class="red" style="width:${player.playerDex}0px">DEX</span>
	
	                <span class="green" style="width:${player.playerInt}0px">INT</span>
	
	                <span class="yellow" style="width:${player.playerLuk}0px">LUK</span>
			</div>
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
    	
    	d3.selectAll("span")
    	.datum(function(){return this.dataset;})
    	.style("width","10%")
    	.transition().duration(1500)
    	.style("width",d=>d.val)

    </script>
</body>
</html>