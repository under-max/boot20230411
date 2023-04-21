package com.example.demo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub23")
public class Controller23 {
	
	
	@Autowired
	private Mapper04 mapper;
	
	@RequestMapping("link1")
	public void method1() {
		int cnt = mapper.sql1();
		System.out.println(cnt + "개 삭제 완료");
	}
	
	@RequestMapping("link2")
	public void method2(Integer id) {
		int cnt = mapper.sql2(id);
		System.out.println(cnt + "의 삭제 완료");
	}
	
	// /sub23/link3?key=7 -> Customers
	@RequestMapping("link3")
	public void method3(Integer id) {
		// 메소드 만들기
		// 7번고객 삭제하기 
		int cnt = mapper.sql3(id);
		System.out.println(cnt+ "id의 삭제 완료");
		
	}
	
	
}
