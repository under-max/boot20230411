package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub7")
public class Controller07 {
	//1.
	//2.
	//3. add attribute
	//4. forward
	@RequestMapping("link1")
	public void method1(HttpServletRequest req) {
		// WEB-INF/views/sub7/link1.jsp
		//3. add attribute
		req.setAttribute("MyName", "서태웅");
	}
	
	@RequestMapping("link2")
	public String method2(Model model) {
		model.addAttribute("MyName", "채치수");
		
		return "/sub7/link1";
	}
	
	//경로: /sub7/link3
	//method3 작성
	///WEB-INF/views/sub7/link3.jsp 로 이동
	@RequestMapping("link3")
	public String method3(Model model) {
		
		model.addAttribute("address", "seoul");
		return "/sub7/link3";
	}
	
	@RequestMapping("link4")
	public void method4(Model model) {
		model.addAttribute("list", List.of("java", "Spring"));
	}
	
	@RequestMapping("link5")
	public void method5(Model model) {
		Map<String, String> map = new HashMap<>();
		map.put("address", "서태웅");
		map.put("age", "55");
		map.put("email", "seo@gmail.com");
		model.addAttribute("myMap", map);
	}
	
	
	@RequestMapping("link6")
	public void method6(Model model) {
		model.addAttribute("name", "이한나");
		model.addAttribute("job", "매니저");
		model.addAttribute("hobby", List.of("영화", "독서", "Tv"));
		
	}
	
	@RequestMapping("link7")
	public void method7(Model model) {
		model.addAttribute("age", 17);
		model.addAttribute("country", "한국");
		model.addAttribute("movieList", List.of("어벤져스", "아이언맨"));
		
	}
	
	@RequestMapping("link8")
	public void method8(Model model) {
		Dto01 o1 = new Dto01();
		o1.setName("박지성");
		o1.setAge(40);
		
		model.addAttribute("player", o1);		
		
	}
	
	//methot9 작성
	//Dto2클래스 작성 
	//경로 : //sub7/link9로 요청 오면
	//dto2객체만들어서 model에 attribute로 추가
	//view :: /sub7/link9로 포워드
	
	@RequestMapping("link9")
	public void method9(Model model) {
		Dto02 o2 = new Dto02();
		o2.setModel("소나타");
		o2.setPrice(4000);
		o2.setCompany("현대자동차");
		model.addAttribute("value", o2);
	}
	
	@RequestMapping("link10")
	public void method10(Model model) {
		Dto04 obj = new Dto04();
		obj.setName("송태섭");
		obj.setAge(20);
		
		model.addAttribute("val", obj);
	}
}
