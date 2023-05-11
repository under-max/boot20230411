package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub27")
public class Controller27 {
	
	@Autowired
	private Mapper07 mapper;
	
	
	// 경로: sub27/link1?keyword=ell
	@RequestMapping("link1")
	public String method1(@RequestParam(value = "s", defaultValue = "") String keyword, Model model) {
		model.addAttribute("customerList", mapper.sql1(keyword));
		System.out.println(mapper.sql1(keyword));
		return "/sub13/link1";
	}
	
	//경로: /sub27/link2?search=?
	@RequestMapping("link2")
	public String method2(@RequestParam(value = "search", defaultValue = "") String keyword, Model model ) {
		//직원의 firstName, lastName의 이름을 출력 
		System.out.println(keyword);
		
		List<Employee> list = mapper.sql2(keyword);
		System.out.println(list);
		model.addAttribute("employee", list);
		return "/sub13/link2";
	}
	
	
	@GetMapping("link3")
	public void method3() {
		mapper.sql3();
	}
	
	@GetMapping("link4")
	public void method4() {
		mapper.sql4("eve");
	}
	
	
	@GetMapping("link5")
	public void method5() {
		mapper.sql4(null);
	}
	

	
	@GetMapping("link6")
	public void method6() {
		//3번 카테고리 상품의 평균가격
		Double avg = mapper.sql5(3);
		System.out.println(avg);
	}
	
	@GetMapping("link7")
	public void method7() {
		//모든 상품의 평균 가격
		Double avg = mapper.sql5(0);
		System.out.println(avg);
	}
}
