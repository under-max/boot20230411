package com.example.demo.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;
import com.example.demo.mapper.*;

@Controller
@RequestMapping("sub26")
public class Controller26 {
	
	@Autowired
	private Mapper06 mapper;
	
	
	// 경로 /sub26/link1?page=3 -> 3page
	// 경로: /sub26/link1?page=1 -> 1page
	// 경로: /sub26/link1 -> 1page
	@GetMapping("link1")
	public String method1(@RequestParam(value = "page", defaultValue = "1") Integer page, Model model) {
		System.out.println(page);
		// 이전버튼 계속 누르면 안넘어 가게
		if(page < 1) {
			page = 1;
		} 
		
		//쿼리에서 사용하는 시작 인덱스
		Integer startIndex = (page - 1) * 20;
		
		// 페이지 네이션 가장 왼쪽 구하기 
		Integer leftPageNumber = (page - 1) / 10 * 10 + 1;
		// 페이지 네이션 가장 오른쪽 구하기 
		Integer rightPageNumber = (leftPageNumber + 9);
		
		// 이전버튼 페이지 번호 구하기 
		Integer prevPageNumber = leftPageNumber - 10;
		Integer nextPageNumber = rightPageNumber + 1;
		
		// 마지막 페이지 구하기 
		// 한페이지당 20개 
		// 레코드 수 1~20개면
		// 마지막 페이지는 1페이지 
		// 21~40 개면 마지막 페이지는 2페이지 
		// 41~60 개면 마지막 페이지는 3페이지 
		// n개라면 마지막 페이지는? 
				
		Integer numOfrecord = mapper.countAll();
		Integer lastPageNumber = (numOfrecord - 1) /20 +1;
		
		// 오른쪽 페이지 번호가 마지막 페이지 번호보다 클수 없음 
		rightPageNumber = Math.min(rightPageNumber, lastPageNumber);
		
		List<Customer> list = mapper.listCustomer(startIndex);	
		
		model.addAttribute("customerList", list);
		
		model.addAttribute("leftPageNumber", leftPageNumber);
		model.addAttribute("rightPageNumber", rightPageNumber);
		
		model.addAttribute("prevPageNumber", prevPageNumber);
		model.addAttribute("nextPageNumber", nextPageNumber);
		
		model.addAttribute("lastPageNumber", lastPageNumber);
		
		//active 활성화용
		Integer currentPageNumber = page;
		model.addAttribute("currentPageNumber", currentPageNumber);
		
		//맨앞 
		
		//맨뒤 
		return "/sub13/link1";
	}
	
	
}
