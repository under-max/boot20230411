$("#btn1").click(()=>{
	const obj = {
		name: "정대만",
		age: 40
	}
	$.ajax("/sub36/link1",{
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(obj)
	});
});

$("#btn2").click(()=>{
	const data = {
		name: "박지성",
		email: "aaa@aaaa.com",
		score: 50.25,
		married: true
	}
	$.ajax("/sub36/link2",{
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	})
});

$("#btn3").click(()=>{
	const data = {
		name: "태웅",
		hobby: [
			"독서",
			"농구",
			"음악감상"
		]
	};
	$.ajax("/sub36/link3", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	})
});


$("#btn4").click(()=>{
	const data = {
		phone: [
			"123-4567",
			"2345-5678",
			"4562-1234"
		]
	}
	$.ajax("/sub36/link4", {
		method: "post",
		contentType:"application/json",
		data: JSON.stringify(data)
	});
});

$("#btn5").click(()=>{
	const data = {
		title: "java",
		publisher:"한빛",
		writer: {
			name:"정대만",
			age: 44	
		}
	}
	$.ajax("/sub36/link5", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	});
});

$("#btn6").click(()=>{
	const data = {
		city: "seoul",
		price: 3600,
		etc: {
			name: "정대만",
			email: "aaa@aaaa",
			score: 36.22,
			married: false
		}
	}
	$.ajax("/sub36/link6", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	})
});


$("#btn7").click(()=>{
	const data = [
		{
			name: "이강민",
			age: 22
		},
		{
			name: "강백호",
			age: 30
		}
	]
	$.ajax("/sub36/link7", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	})
});

$("#btn8").click(function() {
	const name = $("#inputName").val();
	const age = $("#inputAge").val();

	const data = {
		name: name,
		age: age
	};

	$.ajax("/sub36/link1", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	})
});



$("#btn9").click(()=>{	
	const name = $("#name").val();
	const email = $("#email").val();
	const score = $("#score").val();
	const married = document.getElementById("married").checked ? true : false;
	
	const data = {
		name: name,
		email: email,
		score: score,
		married: married
	}
	$.ajax("/sub36/link2", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
	})
});

