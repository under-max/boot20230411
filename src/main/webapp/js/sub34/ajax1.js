$.ajax("/sub34/link1")
$("#button").click(function(){
	$.ajax("/sub34/link1");
});


$("#button2").click(()=>{
	$.ajax("/sub34/link2")
});

$("#button3").click(()=>{
	$.ajax("/sub34/link3?name=son");
});

$("#button4").click(()=>{
	$.ajax("/sub34/link4?address=seoul");
});

$("#button5").click(()=>{
	$.ajax("/sub34/link5?name=son&age=222")
});

$("#button6").click(()=>{
	$.ajax("/sub34/link6?food=apple&price=3.14");
});

$("#button7").click(()=>{
	$.ajax("/sub34/link7?address=seoul&age=33&name=park");
});

$("#button8").click(()=>{
	$.ajax("/sub34/link8?price=10000.123123&product=pride&category=car");
});