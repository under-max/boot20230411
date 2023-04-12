package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controller01 {
	//요청이 왔을때 명시 
	
	@RequestMapping("/sub1/link1") //어떤 경로로 왔을때 일해야할지 명시 
	public void method01() {
		System.out.println("일함!@!!@@!@!@!@!@!@!@");
	}
	
	@RequestMapping("/sub1/link2") //어떤 경로로 왔을때 일해야할지 명시 
	public void method02() {
		System.out.println("/sub1/link2경로 요청에서 일하는 메소드");
	}
	
	@RequestMapping("/sub1/link3")
	public void method3() {
		System.out.println("sub1/link3 address요청에 의하여 실행된 메소드 등장");
	}
}
