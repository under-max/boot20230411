package com.example.demo.config;

import org.springframework.context.annotation.*;

import com.example.demo.component.*;
import com.example.demo.domain.*;

@Configuration
public class MyConfig1 {
	
	//스프링이 이메소드를 사용해서 객체를 만들어서 IOC Container 에 던짐 
	// 스프링 빈(스프링이 관리하는 객체) 
	// 빈 이름 == 메소드의 이름과 같음
	@Bean
	public Object bean1() {
		return new Object();
	}
	
	@Bean
	public Employee employee() {
		
		return new Employee();
	}
	
	@Bean
	public ComponentA bean2() {
		ComponentA o = new ComponentA(bean3());
		return o;
	}
	
	@Bean
	public ComponentB bean3() {
		return new ComponentB();
	}
	
	@Bean
	public ComponentC bean4() {
		ComponentC comp = new ComponentC();
		comp.setCom(bean3());
		
		return comp;
	}
	
	
}
