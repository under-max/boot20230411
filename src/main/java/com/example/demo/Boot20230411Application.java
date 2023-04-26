package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;

import com.example.demo.component.*;
import com.example.demo.domain.*;

@SpringBootApplication
public class Boot20230411Application {
	// Spring Beans : 스프링이 관리하는 객체들
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Boot20230411Application.class, args);
		Object o = context.getBean("bean1");
		System.out.println(o);
		
		Object o2 = context.getBean("employee");
		Object o3 = context.getBean("employee");
		System.out.println(System.identityHashCode(o2));
		System.out.println(System.identityHashCode(o3));
		
		Object o4 = context.getBean("bean2");
		Object o5 = context.getBean("bean3");
		
		System.out.println(o4);
		System.out.println(o5);
		
		ComponentA c1 = (ComponentA) o4;
		System.out.println(c1.getComp());
		
		ComponentC c3 = (ComponentC) context.getBean("bean4");
		System.out.println(c3.getCom());
		
		ComponentD c4 = (ComponentD) context.getBean("componentD"); //Component 어노테이션으로 자동생성 lowerCarmelCase로 이름 들어감 
		System.out.println(c4);
		
		ComponentE c5 = (ComponentE) context.getBean("componentE");
		System.out.println(c5);
	}
	
	// 우리가 객체를 직접 만들 때 
	public void legacy() {
		Object o = new Object();
		Employee e = new Employee();
		
		e.setId(100); // 프로퍼티 직접 셋팅
	}
	

}
