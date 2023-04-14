package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Controller
@RequestMapping("sub13")
public class Controller13 {

	@Value("${spring.datasource.url}") // application.properties 사용하기 위함
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;
	
	// 고객 주소 추가 
	// jsp에서 테이블 형식으로 보여주기 
	@RequestMapping("link1")
	public void method1(Model model) throws Exception{
		String sql = """
				SELECT CustomerID, CustomerName, Address
				FROM Customers
				""";
		
		List<Customer> obj = new ArrayList<>();
		
		// 1. attribute 가공 
		
		// 2. business logic
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();		
		ResultSet rs = stmt.executeQuery(sql);
		try (con; stmt; rs;){
			while(rs.next()) {
				int id = rs.getInt("customerId");
				String name = rs.getString("customerName");
				
				Customer customer = new Customer();
				customer.setId(id);
				customer.setName(name);
				customer.setAddress(rs.getString("address"));
				obj.add(customer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 3. add Attribute
		model.addAttribute("customerList", obj);
		// 4. forward 는 뭐 자동이고
		
	}
	
	
	@RequestMapping("link2")
	public void method2(Model model) throws Exception{
		
		String sql = """
				SELECT EmployeeId,
						LastName,
						FirstName
				FROM Employees
				""";
		
		//Employee 클래스 작성
		//프로퍼티 작성
		//jsp 작성 
		
		List<Employee> employees = new ArrayList<>();
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
				
		try (con; st; rs;){
			
			while(rs.next()) {
				
				Employee employee = new Employee();
				
				int id = rs.getInt("employeeId");
				String lastName = rs.getString("lastName");
				String firstName = rs.getString("firstName");
				
				employee.setId(id);
				employee.setLastName(lastName);
				employee.setFirstName(firstName);
				employees.add(employee);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("employeeList", employees);
	}
	
	
	// 경로 : /sub13/link3?id= 식으로 들어오니까 @GetrequestParam 으로 받으면 됨 
	@RequestMapping("link3")
	public void method3(@RequestParam String id, Model model) throws Exception{
		
		String sql = """
				SELECT CustomerId, CustomerName, Address
				FROM Customers
				WHERE CustomerId = """;//특정 id만 보여주고 싶을때
		sql += id;
		
		List<Customer> list = new ArrayList<>();
//		System.out.println(sql);
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		try (con; stmt; rs;){
			
			while(rs.next()) {
				Customer customer = new Customer();
				customer.setName(rs.getString("customerName"));
				customer.setAddress(rs.getString("address"));
				customer.setId(rs.getInt("customerId"));
				
				list.add(customer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("customerList", list);
		
	}
	
	
	///sub13/link4?id=5
	@RequestMapping("link4")
	public void method4(@RequestParam String id, Model model) throws Exception{
		
		String sql = """
				SELECT CustomerId, CustomerName, Address
				FROM Customers
				WHERE CustomerId = ?""";//특정 id만 보여주고 싶을때
		
		
		List<Customer> list = new ArrayList<>();
//		System.out.println(sql);
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement stmt = con.prepareStatement(sql); //jdbc에서 저공하는 sql injection 방어를 위하여
		stmt.setString(1, id);
		
		ResultSet rs = stmt.executeQuery();
		
		try (con; stmt; rs;){
			
			while(rs.next()) {
				Customer customer = new Customer();
				customer.setName(rs.getString("customerName"));
				customer.setAddress(rs.getString("address"));
				customer.setId(rs.getInt("customerId"));
				
				list.add(customer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("customerList", list);
		
	}
	
	// /sub13/link5?id=3
	@RequestMapping("link5")
	public String method5(@RequestParam int id, Model model) throws Exception{
		//사용자에게 직원 id 입력 받아서
		// 쿼리 완성하고 실행후에
		//  /sub13/link5?id=3로 포워드해서 직원 1명 정보 출력

		String sql = """
				SELECT EmployeeId,
				lastName,
				firstName
				FROM Employees
				WHERE EmployeeId = ?
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		List<Employee> employees = new ArrayList<>();
		
		try (con; ps; rs;){
			while(rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("EmployeeId"));
				employee.setLastName(rs.getString("lastName"));
				employee.setFirstName(rs.getString("firstName"));
				
				employees.add(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("employeeList", employees);
		
		return "/sub13/link2";
	}
}
