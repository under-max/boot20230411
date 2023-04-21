package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@RequestMapping("sub22")
@Controller
public class Controller22 {
	
	@Autowired
	private Mapper03 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int cnt1 = mapper.sql1(77, "java");
		int cnt2 = mapper.sql1(88, "spring");
		int cnt3 = mapper.sql1(99, "css");

		System.out.println(cnt1);
		System.out.println(cnt2);
		System.out.println(cnt3);
	}
	
	
	@RequestMapping("link2")
	public void method2() {
		int cnt1 = mapper.sql2(3.14, "원주율");
		int cnt2 = mapper.sql2(8.2222, "반지름");
		
		System.out.println(cnt1);
		System.out.println(cnt2);
	}
	
	
	// /sub22/link3?val1=234.2332&val2=송태섭
	@RequestMapping("link3")
	public void method3(Double val1, String val2) {
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(mapper.sql2(val1, val2));
	}
	
	@RequestMapping("link4")
	public void method4() {
		Dto09 dto = new Dto09();
		dto.setProp1(300);
		dto.setProp2("Hello myBatis");
		dto.setProp3(33.33);
		
		int cnt = mapper.sql3(dto);
		System.out.println(cnt);
	}
	
	@RequestMapping("link5")
	public void method5() {
		Dto10 dto = new Dto10();
		dto.setAge(30);
		dto.setName("박지성");
		dto.setScore(2.23);
		
		int cnt = mapper.sql4(dto);
		System.out.println(cnt);
	}
	
	// /sub22/link6?age=77&name=park&score=88.88
	@RequestMapping("link6")
	public void method06(@ModelAttribute Dto10 dto) {
		int cnt = mapper.sql4(dto);
		System.out.println(cnt + "행 개 입력됨");
	}
	
	//36에 데이터 추가될 수 있게 적절하게 수정
	// /sub22/link7?prop1=20&prop2=Java&prop3=555.55
	@RequestMapping("link7")
	public void method06(@ModelAttribute Dto09 dto) {
		int cnt = mapper.sql3(dto);
		System.out.println(cnt + "행 개 입력됨");
	}
	
	
	@RequestMapping("link8")
	public void method07() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		dto1.setProp1(345);
		dto2.setName("서태웅");
		dto1.setProp3(99.88);
		
		int cnt = mapper.sql5(dto1, dto2);
		System.out.println(cnt + "행 생성 완료");
	}
	
	@RequestMapping("link9")
	public void method08() {
		Dto09 dto1 = new Dto09();
		Dto10 dto2 = new Dto10();
		
		dto1.setProp1(10);
		dto1.setProp2("강백호");
		dto1.setProp3(12.22);
		
		dto2.setAge(20);
		dto2.setName("정대만");
		dto2.setScore(32.11);
		
		int cnt = mapper.sql6(dto1, dto2);
		System.out.println(cnt + "개 입력 완료");
	}
	
	
	// /sub22/link10?prop1=7&prop2=lunch&prop3=3.14&age=8&name=song&score=2.22
	@RequestMapping("link10")
	public void method09(Dto09 p1, Dto10 p2) {
				
		int cnt = mapper.sql6(p1, p2);
		System.out.println(cnt + "행 입력");
	}
	
	// /sub22/link11?prop2=mybatis&prop3=231
	@RequestMapping("link11")
	@ResponseBody
	public String method10(Dto11 dto) {
		System.out.println(dto.getProp1());
		int cnt = mapper.sql7(dto); //행위가 일어난 뒤에 값이 저장됨 
		System.out.println(dto);
		System.out.println(cnt + "행 입력 완료");
		System.out.println(dto.getProp1());
		
		return dto.getProp1() + "번째 데이터 입력완료";
	}
	
	
	
	// sub22/link12?age=40&name=son&score=9.9
	// 요청시 MyTable40에 데이터 추가되도록 코드 
	// 컨트롤러 메소드, 매퍼 메소드 ,자바빈 
	// 이때 자바빈의 Id 프로퍼티에 자동 증가 컬럼값 받을 수 있게 
	
	@RequestMapping("link12")
	@ResponseBody
	public String method11(Dto12 dto12) {
		int cnt = mapper.sql8(dto12);
		System.out.println(dto12.getId());
		System.out.println(cnt + "행 입력 완료");
		
		return dto12.getId() + ": age: " + dto12.getAge() + "name: " + dto12.getName() + "score: " + dto12.getScore();
	}
	
}
