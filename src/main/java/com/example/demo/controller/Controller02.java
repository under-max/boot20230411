package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller //일하는 메소드들을 가짐 
@RequestMapping("/sub2") //앞부분이 겹칠경우 class level 로 뺄수 있음 
public class Controller02 {	
	
	//실제경로 /sub/link1
	@RequestMapping("/link1")
	public void method01() {
		System.out.println("/sub2/link1에서 일하는 메소드");
	}
	
	
	@RequestMapping("/link2")
	public void method02() {
		System.out.println("/sub2/link2에서 일하는 메소드");
	}
}
