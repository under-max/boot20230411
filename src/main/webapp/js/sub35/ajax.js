$("#button1").click(() => {
	$.ajax("/sub35/link1", { method: "post" });
});

$("#button2").click(() => {
	$.ajax("/sub35/link2", { method: "post" });
});

$("#button3").click(() => {
	$.ajax("/sub35/link3", {
		method: "post",
		data: "name=손"
	});
});

$("#button4").click(() => {
	$.ajax("/sub35/link4", {
		method: "post",
		data: "address=seoul&price=99.77"
	});
});

$("#button5").click(() => {
	$.ajax("/sub35/link5", {
		method: "post",
		data: "name=발&score=7&email=aaa@aaa.com"
	});
});

$("#button6").click(() => {
	$.ajax("/sub35/link6", {
		method: "post",
		data: "address=seoul&product=car&price=20.23"
	});
});


$("#button7").click(() => {
	const obj = { name: "son" };
	$.ajax("/sub35/link7", {
		method: "post",
		//data:'{"name":"son"}',
		data: JSON.stringify(obj),
		contentType: "application/json"
	});
});




$("#button8").click(() => {
	const data = {
		"address": "seoul",
		"name": "박지성"
	}
	$.ajax("/sub35/link8", {
		method: "post",
		//data: '{"address":"seoul","name":"박지성"}',
		data: JSON.stringify(data),
		contentType: "application/json"
	});
});

$("#button9").click(() => {
	const data = {
		age: 555,
		name: "son",
		married: false
	}
	$.ajax("/sub35/link9", {
		method: "post",
		contentType: "application/json",
		//data:'{"age":555,"name":"Son","married":false}'
		data: JSON.stringify(data)
	})
});

$("#button10").click(() => {
	const data = {
		address: null,
		age: 30,
		name: "Son"
	}
	$.ajax("/sub35/link10", {
		method: "post",
		contentType: "application/json",
		//data:'{"address":null,"age":30,"name":"Son"}'
		data: JSON.stringify(data)
	});
});

$("#button11").click(() => {
	const data = {
		book: {
			title: "java",
			price: 300
		},
		address: "seoul"
	}
	$.ajax("/sub35/link11", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data:'{"book":{"title":"java", "price": 300}, "address":"seoul"}'
	});
});

$("#button12").click(() => {
	const data = {
		food: ["pizza", "coke", "coffee"],
		score: "피자스쿨"
	}
	$.ajax("/sub35/link12", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data: `{"food":["pizza", "coke", "coffee"], "score": "피자스쿨"}`
	});
});

$("#button13").click(() => {
	const data = ["pizza", "coke", "coffee"]
	
	$.ajax("/sub35/link13", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data: `"food":["pizza", "coke", "coffee"]`
	});
});

$("#button14").click(function() {
	
	const data = 
		[
			{
				name: "강백호",
				pos: "파포"
			}
			,			
			{
				name: "서태웅",
				pos: "스포"
			}
		]
	
	$.ajax("/sub35/link14", {
		method: "post",
		contentType: "application/json",
		data: JSON.stringify(data)
		//data: `[{"name":"강백호", "pos":"파포"}, {"name":"서태웅", "pos":"스포"}]`
	})
})
