package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

import jakarta.servlet.http.*;

@Controller
@RequestMapping("sub9")
public class Controller09 {

	@RequestMapping("link1")
	public String method01(HttpServletRequest req, Model model) {
		// 1 request parameter 수집 가공
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));

		Dto04 obj = new Dto04();
		obj.setName(name);
		obj.setAge(age);
		// 2 business logic

		// 3 add attribute
		model.addAttribute("value", obj);
		// 4 forward , redirect
		/// WEB-INF/views/sub9/link1.jsp
		return "/sub9/link1";
	}

	// /sub9/link2?name=park&age=40
	@RequestMapping("link2")
	public String method2(@ModelAttribute("value") Dto04 dto04) {

		return "/sub9/link1";
	}

	@RequestMapping("link3")
	public void method3(@ModelAttribute("attr") Dto04 dto04) {
		// 1.request parameter 수집 가공
		// dto04객체 생성
		// name 요청 파라미터를 위객체에 셋팅
		// age 요청 파라미터를 위ㅣ 객체에 셋팅

		// 3. add Attribute 추가
		// 위 객체를 attr 이름으로 model에 추가

		// 4. forward /redirect
		// /WEB-INF/views/sub9/link3로 forward
	}

	@RequestMapping("link4")
	public void method4(Dto04 dto04) {
		// 1.request parameter 수집 가공
		// dto04객체 생성
		// name 요청 파라미터를 위객체에 셋팅
		// age 요청 파라미터를 위ㅣ 객체에 셋팅

		// 3. add Attribute 추가
		// 위 객체를 attr 이름으로 model에 추가

		// 4. forward /redirect
		// /WEB-INF/views/sub9/link4로 forward
		
		//위 사항이 자동으로 처리됨 
	}
	
	//경로? /sub9/link5?model=sonata&price=3000&company=Hyondai
	@RequestMapping("link5")
	public void method05(Dto02 dto) {
		//model , price, company		
	}
}
