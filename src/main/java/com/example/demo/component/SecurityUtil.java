package com.example.demo.component;

import org.springframework.security.core.*;
import org.springframework.stereotype.*;

@Component //빈에 securityUtil로 등록 
public class SecurityUtil {
	
	
	public boolean checkBoardWriter(Authentication authentication, String id) {
		System.out.println("게시물 작성자 확인 메소드");
		System.out.println(id);
		System.out.println(authentication.getName());
		return true;
	}
	
	
}
