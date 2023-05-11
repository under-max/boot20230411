package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub28")
public class Controller28 {

	@Autowired
	private Mapper09 mapper;
	
	@GetMapping("link1")
	public void method1() {
		List<Supplier> list1 = mapper.sql1(List.of("UK", "USA"));
		list1.forEach(System.out::println);
	}
	
	// Suppliers table에 공급자들 목록 
	@GetMapping("link2")
	public void method2() {
		List<Supplier> list2 = mapper.sql2(List.of("UK", "USA", "Japan"));
		list2.forEach(System.out::println);
	}
	
	
	@GetMapping("link3")
	public void method3() {
		//sub28/link3.jsp 포워드
	};
	
	@GetMapping("link4")
	public void method4(@RequestParam(value="country", required = false) List<String> country) {
		System.out.println(country);
		mapper.sql2(country).forEach(System.out::println);		
		
	}
}
