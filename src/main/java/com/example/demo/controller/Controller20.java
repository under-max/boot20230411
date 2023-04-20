package com.example.demo.controller;

import java.time.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub20")
public class Controller20 {

	@Autowired
	private Mapper01 mapper01; // AutoWired를 통한 ioc conatainer 에 Mapper를 등록 
	
	@RequestMapping("link1")
	public void method1() {
		// interface 구현한 class 는 mybatis에서 구현함 
		
		String name = mapper01.method1();
		System.out.println(name);
	}
	
	@RequestMapping("link2")
	public void method2() {
		String name = mapper01.method2();
		System.out.println(name);
	}
	
	
	@RequestMapping("link3")
	public void method3() {
		System.out.println(mapper01.method3());
	}
	
	@RequestMapping("link4")
	public void method4() {
		System.out.println(mapper01.method4(5));
	}
	
	@RequestMapping("link5")
	public void method5(@RequestParam("id") Integer Id) {
		System.out.println(mapper01.method4(Id));
	}
	
	//link5?id=2
	// 2번직원의 lastname을 콘솔에 출력할수 있게 
	
	@RequestMapping("link6")
	public void method6(@RequestParam("id") Integer Id) {
		System.out.println(mapper01.method5(Id));
	}
	
	@RequestMapping("link7")
	public void method7() {
		System.out.println(mapper01.method6());
		
		// mapper01에 method7 작성
		//하나의 row의 weight 컬럼값 리턴 
		Double weight = mapper01.method7();
		System.out.println(weight);
		
		LocalDate published = mapper01.method8();
		System.out.println(published);
		
		LocalDateTime updated = mapper01.method9();
		System.out.println(updated);
		
		
	}
	
	
	@RequestMapping("link8")
	public void method8() {
		MyTable33 res = mapper01.method10();
		System.out.println(res);
	}
	
	@RequestMapping("link9")
	public void method9() {
		Dto5 res = mapper01.method11();
		System.out.println(res);
	}
	
	
	@RequestMapping("link10")
	public void method10() {
		Customer res = mapper01.method12();
		System.out.println(res);
	}
	
	@RequestMapping("link11")
	public void method11() {
		Supplier sup = mapper01.method13();
		System.out.println(sup); // 2번 공급자 정보 출력
	}
	
	@RequestMapping("link12")
	public void method12() {
		Employee rs = mapper01.method14();
		System.out.println(rs);
	}
}
