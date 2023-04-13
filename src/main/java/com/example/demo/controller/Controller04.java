package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub4")
public class Controller04 {
	//method argument (parameter)
	
	//경로 : /sub4/link1
	@RequestMapping("link1")
	public void method01(HttpServletRequest request) {
		//1. request handller 가 하는 일이 request parameter 수집 가공
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		
		//2.business logic
		
		//3.add attribute
		
		//4.forward/redirect		
	}
	
	//경로 : /sub4/link2?address=seoul&email=korea@gmail.com
	
			//address mail 파라미터 출력
	@RequestMapping("link2")
	public void method02(HttpServletRequest request) {
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		System.out.println("address : " + address);
		System.out.println("email : " + email);
	}
	
	//경로 : /sub4/link3?address=seoul
	@RequestMapping("link3")
	public void method03(@RequestParam("address") String address) {
		System.out.println("address : " + address);
	}
	
	//경로: /sub/link4?age=99
	@RequestMapping("link4")
	public void method04(@RequestParam("age") int age) {
		System.out.println("age : " + age);
	}
	
	@RequestMapping("link6")
	public void method05(@RequestParam String email) {
		System.out.println(email);
	}
	
	@RequestMapping("link7")
	public void method06(@RequestParam int age) {
		System.out.println("age : " + age);
	}
	
	@RequestMapping("link8") //String type 은 other any로 간주되어 @RequestParam 안써도 가능
	public void method07(String address) {
		System.out.println(address);
	}
	
	@RequestMapping("link9")
	public void method08(double score) {
		System.out.println(score);
	}
}
