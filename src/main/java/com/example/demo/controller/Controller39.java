package com.example.demo.controller;

import java.time.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub39")
public class Controller39 {
	
	@GetMapping("view")
	public void method() {
		
	}
	
	@GetMapping("link1")
	@ResponseBody
	public String method1() {
		return "Hello ajax";
	}
	
	@GetMapping("link2")
	@ResponseBody
	public ResponseEntity method2() {
		return ResponseEntity.badRequest().build();
	}
	
	@GetMapping("link3")
	@ResponseBody
	public ResponseEntity method3() {
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("link4")
	@ResponseBody
	public ResponseEntity method4() {
		return ResponseEntity.status(HttpStatusCode.valueOf(500)).build();
	}
	
	/*
	@GetMapping("link5")
	public ResponseEntity method5() {
		boolean ok = service.method();
		if (ok) {
			return ResponseEntity.ok();
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	*/
	
	
	@GetMapping("link9")
	@ResponseBody
	public String method9() {
		return "Hello AJAX!@";
	}
	
	@GetMapping("link10")
	@ResponseBody
	public String method10() {
		String time = LocalDateTime.now().toString();
		return time;
	}
	
	@GetMapping("link11")
	@ResponseBody
	public Map<String, Object> method11(){
		return Map.of("name", "채소연", "age", 20);
	}
	
	@GetMapping("link12")
	@ResponseBody
	public Map<String, String> method12(){
		return Map.of("address", "YongSan", "city", "Seolu", "phone", "123-456");
	}
	
	@GetMapping("link13")
	@ResponseBody
	public List<String> method13(){
		return List.of("강백호", "채치수", "송태섭");
				
	}
	
	@Autowired
	private Mapper02 mapper02;
	@GetMapping("link14")
	@ResponseBody
	public List<Dto08> method21(Integer cid){
		return mapper02.sql7(cid);
	}
}
