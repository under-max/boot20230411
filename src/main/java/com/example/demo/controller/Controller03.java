package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub3")
public class Controller03 {
	
	//spring mvc request handler method
	//
	
	@RequestMapping("link1")
	public void method01() {
		System.out.println("link1의 요청을 받아 method01이 등장");
	}

	@RequestMapping("link2")
	public void method02() {
		System.out.println("link2의 요청을 받아 method02가 등장");
	}
}
