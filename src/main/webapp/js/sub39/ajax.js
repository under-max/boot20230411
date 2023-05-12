$("#btn1").click(function() {
	$.ajax("/sub39/link1", {
		success: function() {
			console.log("성공");
		}, 
		error: function() {
			console.log("실패!")
		},
		complete: function() {
			console.log("성공이든 실패든")
		}
	});
})	

$("#btn3").click(()=>{
	//성공(200)응답을 받아서
	//콘솔에 "성공!!!" 출력
	$.ajax("/sub39/link3",{
		success: function(){
			console.log("성공!!!")
		},
		error: function(){
			console.log("실패");
		},
		complete: function(){
			console.log("완료");
		}
	})
})

$("#btn4").click(()=>{
	//실패 (500)응답 받아서
	//콘솔에 "실패!! 출력 "
	$.ajax("/sub39/link4",{
		success: function(){
			console.log("성공!!!")
		},
		error: function(){
			console.log("실패");
		},
		complete: function(){
			console.log("완료");
		}
	})
});


$("#btn5").click(()=>{
	$.ajax("/sub39/link1")
	.done(()=>{
		console.log("done 메소드 사용, 성공")
	})
	.fail(()=>{
		console.log("fail 메소드 사용, 실패")
	})
	.always(()=>{
		console.log("always 메소드 사용 성공이든 실패든")
	})
});

$("#btn6").click(()=>{
	$.ajax("/sub39/link2")
	.done(()=>{
		console.log("done 메소드 사용, 성공")
	})
	.fail(()=>{
		console.log("fail 메소드 사용, 실패")
	})
	.always(()=>{
		console.log("always 메소드 사용 성공이든 실패든")
	})
});

$("#btn7").click(()=>{
	$.ajax("/sub39/link3")
	.done(()=>{
		console.log("done 메소드 사용, 성공")
	})
	.fail(()=>{
		console.log("fail 메소드 사용, 실패")
	})
	.always(()=>{
		console.log("always 메소드 사용 성공이든 실패든")
	})
});

$("#btn8").click(()=>{
	$.ajax("/sub39/link4")
	.done(()=>{
		console.log("done 메소드 사용, 성공")
	})
	.fail(()=>{
		console.log("fail 메소드 사용, 실패")
	})
	.always(()=>{
		console.log("always 메소드 사용 성공이든 실패든")
	})
});




$("#btn9").click(()=>{
	$.ajax("/sub39/link9", {
		success: (data)=>{
			console.log("링크 9 성공");
			console.log(data)
		},
		complete: ()=>{
			console.log("링크9 완료")
		}
	})
})


$("#btn10").click(()=>{
	//응답 본문 (현재시간)이 콘솔에 출력
	$.ajax("/sub39/link10", {
		success: (data)=>{
			console.log(data);
			$("#res10").text(data);
		}
	});
});

$("#btn11").click(()=>{
	//응답 본문 (현재시간)이 콘솔에 출력
	$.ajax("/sub39/link11", {
		success: (data)=>{
			console.log(data);
			$("#res11").text(data.name);
		}
	});
});

$("#btn12").click(()=>{
	//응답 본문 (현재시간)이 콘솔에 출력
	$.ajax("/sub39/link12", {
		success: (data)=>{
			console.log(data.address);
			console.log(data.city);
			console.log(data.phone);
		}
	});
});


$("#btn13").click(()=>{
	//응답 본문 (현재시간)이 콘솔에 출력
	$.ajax("/sub39/link13", {
		success: (data)=>{
			for(let i = 0; i < data.length; i++){
				console.log(data[i]);
			}
		}
	});
});

$("#btn14").click(()=>{
	//응답 본문 (현재시간)이 콘솔에 출력
	const cid = $("#categoryInputId").val();
	
	$.ajax("/sub39/link14?cid=" + cid, {
		success: (data)=>{
			console.log(data);
			for(let i = 0; i < data.length; i++){
				$("#res14").append(data[i].productName + "<br/>");				
			}
		}
	});
});


$("#btn15").click(function() {
	const cid = $("#categoryInputId").val();
	
	$.ajax("/sub39/link14?cid=" + cid, {
		success: function(data) {
			// console.log(data);
			$("#res15").empty();
			$("#res15").append(`
				<table class="table">
					<thead>
						<tr>
							<th>
								상품명
							</th>
							<th>
								가격
							</th>
						</tr>
					</thead>
				</table>
			`);
			$("#res15 > .table").append("<tbody />");
			for (let i = 0; i < data.length; i++) {
				$("#res15 tbody")
					.append(`
						<tr>
							<td>
								${data[i].productName}
							</td>
							<td>
								${data[i].price}
							</td>
						</tr>
					`);
			}
		}
	})
})
