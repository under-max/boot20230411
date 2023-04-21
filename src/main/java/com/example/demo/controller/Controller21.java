package com.example.demo.controller;

import java.util.*;

import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub21")
public class Controller21 {
	
	@Autowired
	private Mapper02 mapper;
	
	@RequestMapping("link1")
	public void method1() {
//		String sql = """
//				SELECT CustomerName From Customers
//				""";
		List<String> list = mapper.sql1();
		
		/*
		 	List<String> list = new ArrayList<>()
		 	ResultSet rs = stmt.executeQuery;
		 	while(rs.next()){
		 		list.add(rs.getString());
		 	}
		 	
		 */
//		System.out.println(list);
		list.stream().forEach(System.out::println);		
	}
	
	// 경로: /sub21/link2
	// 모든 직원의 lastname 출력 
	@RequestMapping("link2")
	public void method2() {
		List<String> list = mapper.sql2();
		
		list.stream().forEach(System.out::println);
		
		
	}
	
		
	@RequestMapping("link3")
	public void method3() {
		List<Dto07> list = mapper.sql3();
		
		list.stream().forEach(System.out::println);
	}
	
	
	// 모든 상품의 이름 가격을 조회해서 콘솔에 출력 
	
	@RequestMapping("link4")
	public void method4() {		
		List<Dto08> item = mapper.sql4();
		item.forEach(System.out::println);
	}
	
	@RequestMapping("link5")
	public void method5(@RequestParam("cid") Integer cid) {
		
		List<String> productName = mapper.sql5(cid); // 특정 카테고리의 상품이름 조회
		productName.forEach(System.out::println);
	}
	
	
	// /sub21/link6?country=uk
	// /sub21/link6?country=canada
	// 각국가에 잇는 고객명(CustomerName)이 콘솔에 출력
	@RequestMapping("link6")
	public void method6(@RequestParam("country") String country) {
		List<String> name = mapper.sql6(country);
		name.forEach(System.out::println);
		
	}
	
	
	@RequestMapping("link7")
	public void method7(@RequestParam("cid") Integer cid) {
		List<Dto08> item = mapper.sql7(cid);
		item.forEach(System.out::println);
	}
	
}
