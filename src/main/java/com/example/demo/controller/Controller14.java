package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub14")
public class Controller14 {
	
	@Value("${spring.datasource.url}") // application.properties 사용하기 위함
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;
	
	// 추가 업무 : Contact Name 에도 키워드 조회 추가 
	// 1, 쿼리수정
	// 2. pstmt 에 2번째 물음표에 set하는 코드추가 
	// 3. Customer 자바빈의 ContactName 프로퍼티 추가 
	// 4. sub13/link1 뷰에 contactName 속성 출력하는 테이블열 추가
	
	// /sub13/link1?keyword=or
	@RequestMapping("link1")
	public String method1(String keyword1, String keyword2, Model model) throws Exception{
		String sql = """
				SELECT CustomerID, CustomerName, Address, ContactName
				FROM Customers 
				WHERE CustomerName LIKE ?
				OR ContactName LIKE ?
				""";
		List<Customer> list = new ArrayList<>();
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "%" + keyword1 + "%");
		pstmt.setString(2, "%" + keyword2 + "%");
	
		ResultSet rs = pstmt.executeQuery();
				
		
		try(con; pstmt; rs;) {
			while(rs.next()) {
				Customer c = new Customer();
				
				c.setId(rs.getInt("customerId"));
				c.setAddress(rs.getString("address"));
				c.setName(rs.getString("customerName"));
				c.setContactName(rs.getString("contactName"));
				list.add(c);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("customerList", list);
			
		
		return "/sub13/link1";
	}
	
}
