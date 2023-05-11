package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import lombok.*;

@Controller
@RequestMapping("sub34")
public class Controller34 {
	
	@GetMapping("ajax1")
	public void ajax1() {
		
	}
	
	@GetMapping("link1")
	@ResponseBody
	public String method1() {
		System.out.println("헬로!");
		return "첫번째 응답 데이터";
	}
	
	@GetMapping("link2")
	@ResponseBody
	public String method2() {
		System.out.println("get요청 link2");
		return "hi";
	}
	
	@GetMapping("link3")
	public void method3(@RequestParam("name") String name) {
		System.out.println("link3 매소드 일함");
		System.out.println("name : " + name);
	}
	
	@GetMapping("link4")
	public void method4(String address) {
		System.out.println("link4 일함");
		System.out.println("address: " + address);
	}
	
	@GetMapping("link5")
	public void method5(String name, Integer age) {
		System.out.println("name: " + name + " age : " + age);
	}
	
	@GetMapping("link6")
	public void method6(String food, Double price) {
		System.out.println("food : " + food);
		System.out.println("price : " + price);
	}
	
	@Data
	static class Dto1 {
		private String address;
		private String name;
		private Integer age;
		
	}
	
	@GetMapping("link7")
	public void method7(@ModelAttribute Dto1 dto) {
		System.out.println(dto);
	}
	
	@Data
	static class Dto2{
		private Double price;
		private String product;
		private String category;
	}
	
	@GetMapping("link8")
	public void method8(Dto2 dto) {
		System.out.println(dto);
	}
}
