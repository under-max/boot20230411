package com.example.demo.controller;

import org.springframework.security.access.prepost.*;
import org.springframework.security.core.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub33")
public class Controller33 {
	
	@GetMapping("mylogin")
	public void loginForm() {
		
	}
	
	@GetMapping("loginSuccess")
	public void loginSucess() {
		
	}
	
	
	@GetMapping("viewAuth")
	public void viewAuth(Authentication authentication) { //타입명시 interface임
		System.out.println("로그인 정보 확인하기");
		System.out.println(authentication);
		System.out.println(authentication.getName());
	}
	
	
	@GetMapping("customCheck")
	@PreAuthorize("@securityUtil.checkBoardWriter(authentication, #id)")
	public void method(String id) {
		System.out.println("customCheck 메소드 실행중");
		
	}
	
	
}

