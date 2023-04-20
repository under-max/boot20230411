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
</head>
<body>	
	<h1>link10으로</h1>
	<form action="/sub19/link10" method="post">
		<label for="one">제목</label>
		<input type="text" name="title" id="one"/>
		<br>
		<label for="two" >발행일</label>
		<input type="date" name="published" id="two"/>
		<br>
		<label for="three">가격</label>
		<input type="text" name="price" id="three"/>
		<br>
		<label for="four">개정일</label>
		<input type="datetime-local" name="updated" id="four"/>
		<br>
		<label for="five">무게</label>
		<input type="text" name="weight" id="five"/>
		<br>
		<button type="submit">전송</button>
	</form>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>