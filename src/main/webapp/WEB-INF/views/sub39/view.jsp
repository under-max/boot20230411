<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="jakarta.tags.core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<h5>JQUERY ajax 응답 후 실행되는 함수들 연습</h5>
<div>
	<button id="btn1">완료 후 실행</button>
</div>

<div>
	<button id="btn2">완료 후 실행</button>
</div>

<div>
	<button id="btn3">성공 응답 (200)</button>
</div>

<div>
	<button id="btn4">실패 응답 (500)</button>
</div>

<div>
	<button id="btn5">응답!! (500)</button>
</div>

<div>
	<button id="btn6">응답!! (500)</button>
</div>

<div>
	<button id="btn7">응답!! (200)</button>
</div>

<div>
	<button id="btn8">응답!! (500)</button>
</div>


<div>
	<button id="btn9">본문이 있는 성공 응답!! (200)</button>
</div>


<div>
	<button id="btn10">현재시간 출력~!</button>
</div>
<div id="res10"></div>

<div>
	<button id="btn11">Json응답</button>
</div>
<div id="res11"></div>


<div>
	<button id="btn12">Json응답</button>
</div>

<div>
	<button id="btn13">배열 응답</button>
</div>


<div>
	<input type="text" id="categoryInputId"/>
	<button id="btn14">리스트(객체) 응답</button>
	<ol id="res14"></ol>
</div>


<div>
	<button id="btn15">객체응답, 테이블로 보여주기</button>
	
	<div>
		<div id="res15">
		
		</div>
	</div>
	
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.4/jquery.min.js" integrity="sha512-pumBsjNRGGqkPzKHndZMaAG+bir374sORyzM3uulLV14lN5LyykqNk8eEeUlUkB3U0M4FApyaHraT65ihJhDpQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="/js/sub39/ajax.js"></script>
</body>
</html>