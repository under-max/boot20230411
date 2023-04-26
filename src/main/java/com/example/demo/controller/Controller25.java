package com.example.demo.controller;

import java.util.*;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.*;

@Controller
@RequestMapping("sub25")
public class Controller25 {
	
	@RequestMapping(path="link1", method=RequestMethod.POST) //get방식일때만 진행
	public void method1() {
		System.out.println("/sub25/link1 에서 메소드 일함");
	}
	
	// @RequestMapping(Value="link2", method = RequestMethod.Get)
	@GetMapping("link2")
	public void method2() {
	
		System.out.println("/sub25/link2 GET에서 메소드 일함");
	}
	
	//RequestMapping(path="link3", RequestMethod.POST)
	@PostMapping("link3")
	public void method3(){
		System.out.println("/sub25/link3 Post에서 메소드 일함");
	}
	
	// pathVariable
	// sub25/link4/abc
	// sub25/link4/def
	@GetMapping("link4/{var1}")
	public void method4(@PathVariable("var1") String p1) {
		System.out.println("var1: " + p1);
	}
	
	// sub25/link5/abc/15
	@GetMapping("link5/{id}/{age}")
	public void method4(@PathVariable("id") String id, @PathVariable("age") int age){
		System.out.println("id: " + id + "  age: " + age);
	}
	
	// sub25/link6/id/adadad/name/www
	@GetMapping("link6/id/{var1}/name/{var2}")
	public void method5(@PathVariable("var1") String id, @PathVariable("var2") String name) {
		System.out.println(id + " ," + name);
	}
	
	
	@GetMapping("link7")
	public String method7() {
		
		return "hello";
	}
	
	
	// redirect
	@GetMapping("link8")
	public String method8() {
		
		return "redirect:/sub25/link7";
	}
	
	@GetMapping("link9")
	public String method9(Model model) {
		model.addAttribute("attr1","value1");
		//Model 은 Request를 사용하기 떄문에 redirect에서는 못넘어감
		return "redirect:link10";
	}
	
	@GetMapping("link10")
	public void method10() {
		
	}
	
	
	@GetMapping("link11")
	public String method11(RedirectAttributes rttr) {
		rttr.addFlashAttribute("attr1", "redirect attribute");
		// 그렇기 때문에 RedirectAttribute 이용해야 함 내부 session을 이용하고 쓰고 삭제함 
		return "redirect:link10";
	}
	
	
	@GetMapping("link12")
	public String method12(RedirectAttributes rttr) {
		List<String> list = new ArrayList<>();
		list.add("Spring");
		list.add("Java");
		rttr.addFlashAttribute("list", list);
		return "redirect:link13";
	}
	
	@GetMapping("link13")
	public void method13() {
		
	}
	
	@GetMapping("link14")
	public String method14(RedirectAttributes rttr) {
		// 목적지의 model attribute로 
		//rttr.addFlashAttribute("list", list); 
		
		// 쿼리 스트링으로 붙어서 넘어감 (주소창값)
		rttr.addAttribute("addrss", "seoul");
		return "redirect:link5";
	}
	
	@GetMapping("link15")
	public String method15(RedirectAttributes rttr) {
		rttr.addAttribute("email", "aaa@bbbb.com");
		rttr.addAttribute("location", "Seoul");
		
		return "redirect:link16";
	}
	
	@GetMapping("link16")
	public void method16(@RequestParam("email") String email,
			@RequestParam("location") String location) {
		System.out.println("email: " + email);
		System.out.println("location: " + location);
	}
}
