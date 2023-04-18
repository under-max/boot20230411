package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub15")
public class Controller15 {

	@Value("${spring.datasource.url}") // application.properties 사용하기 위함
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;
	
	@RequestMapping("link1")
	public void method1() throws Exception {
		// 새 고객데이터 추가 
		
		String sql = """
				INSERT INTO Customers
				(CustomerID, CustomerName, City)
				VALUES (93, '서태웅', '부산')
				""";
		
		//Insert, Update, Delete 는
		// Statement의 ExecuteUpdate 메소드 사용 
		//리턴값은 영향을 미친 레코드 수
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate(sql);
		
		try (con; stmt;){
			
		}
		
		System.out.println(count + "행이 추가됨");
	}
	
	
	// 경로 : sub15/link2 로 보냈을때 
	// 10번째 직원 추가
	// 컬럼: EmployeeID, LastName, FirstName 
	
	@RequestMapping("link2")
	public void method2() throws Exception{
		
		String sql = """
				INSERT INTO Employees
				(EmployeeID, LastName, FirstName)
				VALUES 
				(10, "Kang", "Backho")
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		int count = stmt.executeUpdate(sql);
		
		try (con; stmt;){
			
		}
		
		System.out.println(count + " 개 업데이트 완료");
	}
	
	
	// /sub15/link3?customerName=송태섭&city=부산&country=한국
		@RequestMapping("link3")
		public void method3(
				@RequestParam("customerName") String customerName,
				@RequestParam("city") String city,
				@RequestParam("country") String country) throws Exception {
			String sql = """
					INSERT INTO Customers
					(CustomerName, City, Country)
					VALUES
					(?, ?, ?)
					""";

			try (Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pstmt = con.prepareStatement(sql);) {
				pstmt.setString(1, customerName);
				pstmt.setString(2, city);
				pstmt.setString(3, country);

				int count = pstmt.executeUpdate();
				System.out.println(count + "개 행 추가됨");
			}
	
		
		}
		
		// /sub15/link4?firstName=박지성&lastName=두개의심장
		// 직원정보 추가 
		
		@RequestMapping("link4")
		public void method4(String firstName, String lastName) throws Exception {
			
			String sql = """
					INSERT INTO Employees (firstName, lastName)
					VALUES (?, ?)
					""";			
			
			
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pstmt = con.prepareStatement(sql)) {
				pstmt.setString(1, firstName);
				pstmt.setString(2, lastName);
				int count = pstmt.executeUpdate();
				System.out.println(count + "개 추가됨");
			} 
			
			
			
		}
		
		@RequestMapping("link5")
		public void method5() {
			//form 이 있는 view로 포워드 
			// view : /WEB-INF/views/sub15/link5.jsp
			
		}
		
		
		@RequestMapping("link6")
		public void method6(@RequestParam("firstName") String firstName, 
				@RequestParam("lastName") String lastName) throws Exception {
			
			String sql = """
					INSERT INTO Employees (firstName, lastName)
					VALUES (?, ?)
					""";
			
		
			
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pstmt = con.prepareStatement(sql);
					) {
				pstmt.setString(1, firstName);
				pstmt.setString(2, lastName);
				int count = pstmt.executeUpdate();
				System.out.println(count + "개 추가 완료");
				
			}
			System.out.println(firstName);
			System.out.println(lastName);
		}
		
		// 경로 : /sub15/link7
		// 폼이있는 jsp로 포워드
		
		@RequestMapping("link7")
		public void method7() {
			
		}
		
		// 경로: /sub15/link8
		@RequestMapping("link8")
		public void method8(
				@RequestParam("supplierName") String supplierName, 
				@RequestParam("city") String city,
				@RequestParam("country") String country
				) throws Exception{
			//3개 메소드 파라미터 활용해서 
			//suppliers 테이블에 레코드 추가 
			
			String sql = """
					INSERT INTO Suppliers (supplierName, city, country)
					VALUES (?, ?, ?)
					""";			
			
			try(Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pstmt = con.prepareStatement(sql);
					) {
				pstmt.setString(1, supplierName);
				pstmt.setString(2, city);
				pstmt.setString(3, country);
				int count = pstmt.executeUpdate();
				System.out.println(count + " 개 입력 완료");
			}
			
		}
		
		
		@RequestMapping("link9")
		public void method9() {
			
		}
		
		@RequestMapping("link10")
		public void method10(@ModelAttribute("customer") Customer customer) throws Exception{
			System.out.println(customer);
			
			String sql = """
					INSERT INTO Customers (CustomerName, ContactName, Address)
					VALUES (?, ?, ?)
					""";
			
			try (
					Connection con = DriverManager.getConnection(url, name, password);
					PreparedStatement pstmt = con.prepareStatement(sql);
					) {
				pstmt.setString(1, customer.getName());
				pstmt.setString(2, customer.getContactName());
				pstmt.setString(3, customer.getAddress());
				
				int cnt = pstmt.executeUpdate();
				System.out.println(cnt + "개 업데이트 완료");
			}

		}
		
		
		//경로 : /sub15/link11
		@RequestMapping("link11")
		public void method11() {
			
		}
		
		// 경로: /sub15/link12
		@RequestMapping("link12")
		@ResponseBody
		public String method12(Supplier supplier) throws Exception{
			
			
			String sql = """
					INSERT INTO Suppliers (SupplierName, ContactName, Address, City, PostalCode, Country, Phone)
					VALUES (?,?,?,?,?,?,?)
					""";
			
			try(Connection con = DriverManager.getConnection(url, this.name, password);
				PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				) {
					
				ps.setString(1, supplier.getName());
				ps.setString(2, supplier.getContactName());
				ps.setString(3, supplier.getAddress());
				ps.setString(4, supplier.getCity());
				ps.setString(5, supplier.getPostalCode());
				ps.setString(6, supplier.getCountry());
				ps.setString(7, supplier.getPhone());
				
				// 자동생성된 칼럼(키) 값 얻기 
				ResultSet rskey = ps.getGeneratedKeys();
				int keyValue = 0;
				System.out.println(rskey.next());
				if(rskey.next()) {
					keyValue = rskey.getInt(1);
				}
				
				int count = ps.executeUpdate();
				System.out.println(supplier);
				System.out.println(keyValue+ "번 공급자 데이터 입력됨");
				System.out.println(count + "개가 업데이트 되었습니다.");
			
				return keyValue + "번 공급자 데이터 입력됨";
			}
			
		}
}
