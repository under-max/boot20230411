package com.example.demo.controller;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub12")
public class Controller12 {
	@Value("${spring.datasource.url}") // application.properties 사용하기 위함
	private String url;
	@Value("${spring.datasource.username}")
	private String name;
	@Value("${spring.datasource.password}")
	private String password;

	@RequestMapping("link1")
	public void method1() {
		String sql = """
				SELECT LastName FROM Employees
				""";

		try {
			Connection cs = DriverManager.getConnection(url, name, password);
			Statement stmt = cs.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (cs; stmt; rs;) {
				System.out.println(rs.next()); // true
				String name1 = rs.getString("lastName");
				System.out.println(name1);

				System.out.println(rs.next()); // true
				String name2 = rs.getString("lastName");
				System.out.println(name2);

				System.out.println(rs.next()); // true
				String name3 = rs.getString("lastName");
				System.out.println(name3);

				System.out.println(rs.next()); // true
				String name4 = rs.getString("lastName");
				System.out.println(name4);

				System.out.println(rs.next()); // true
				String name5 = rs.getString("lastName");
				System.out.println(name5);

				System.out.println(rs.next()); // true
				String name6 = rs.getString("lastName");
				System.out.println(name6);

				System.out.println(rs.next()); // true
				String name7 = rs.getString("lastName");
				System.out.println(name7);

				System.out.println(rs.next()); // true
				String name8 = rs.getString("lastName");
				System.out.println(name8);

				System.out.println(rs.next()); // true
				String name9 = rs.getString("lastName");
				System.out.println(name9);

				System.out.println(rs.next()); // false

			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@RequestMapping("link2")
	public void method2() {
		String sql = """
				SELECT LastName FROM Employees
				""";

		try {
			Connection cs = DriverManager.getConnection(url, name, password);
			Statement stmt = cs.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			try (cs; stmt; rs;) {

				while (rs.next()) {
					System.out.println(rs.getString("lastName"));
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//ShipperName FROM Shippers
	@RequestMapping("link3")
	public void method3(Model model) {
		
		String sql = """
				SELECT ShipperName FROM Shippers
				""";
		List<String> list = new ArrayList<>();
		try {
			Connection cs = DriverManager.getConnection(url, name, password);
			Statement st = cs.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			try(cs; st; rs;) {
				while(rs.next()) {
					System.out.println(rs.getString("shipperName"));
					list.add(rs.getString("shipperName"));
					
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("namesList", list);
		
	}
	
	
	@RequestMapping("link4")
	public void method4() {
		String sql = "SELECT * FROM Customers";
		
		try {
			Connection cs = DriverManager.getConnection(url, name, password);
			Statement st = cs.createStatement();
			ResultSet rs = st.executeQuery(sql);
			try (cs; st; rs;){
				while(rs.next()) {
					System.out.println(rs.getString("customerName"));
					System.out.println(rs.getString("contactName"));
					System.out.println(rs.getString("country"));
					
				}
				
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	@RequestMapping("link5")
	public void method5() {
String sql = "SELECT * FROM Customers";
		
		try {
			Connection cs = DriverManager.getConnection(url, name, password);
			Statement st = cs.createStatement();
			ResultSet rs = st.executeQuery(sql);
			try (cs; st; rs;){
				while(rs.next()) {
					System.out.println("###############################");
					System.out.println(rs.getString("customerName"));
					System.out.println(rs.getString("contactName"));
					System.out.println(rs.getString("country"));
					
				}
				
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("link6")
	public void method06() {
		String sql = "SELECT * FROM Products WHERE ProductID <= 3";
		
		
		try {
			Connection cs = DriverManager.getConnection(url, name, password);
			Statement st = cs.createStatement();
			ResultSet rs = st.executeQuery(sql);
			try (cs; st; rs;){
				while(rs.next()) {
					System.out.println("###############################");
					System.out.println(rs.getInt("ProductID"));
					System.out.println(rs.getString("ProductName"));
					System.out.println(rs.getDouble("Price"));
					
				}
				
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	// SELECT *FROm Customers WHERE CustomerID < 4
	// CustomerID 는 int 타입으로 가져오기 
	// CustomerName 은 String 타입으로 가져오기 
	
	@RequestMapping("link7")
	public void method7(Model model) {
		
		String sql = """
				SELECT * FROM Customers WHERE CustomerID < 4
				""";
		
		try {
			
			Connection cn = DriverManager.getConnection(url, name, password);
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			try(cn; st; rs;) {
				
				while(rs.next()) {
					/*
					System.out.println(rs.getInt("CustomerID"));
					System.out.println(rs.getString("CustomerName"));
					*/
					
					System.out.println(rs.getInt(1)); //CustomerId
					System.out.println(rs.getString(2)); //CustomerName
				}
				
			} 
		} catch (Exception e) {
			
		}
		
	}
	
	@RequestMapping("link8")
	public void method8() throws Exception{
		String sql = """
				SELECT FirstName, LastName
				FROM Employees
				WHERE EmployeeID < 4
				""";
		
		Connection con = DriverManager.getConnection(url, name, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		try (con; st; rs;){
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	@RequestMapping("link9")
	public void method9() throws Exception{
		
		String sql = "SELECT CustomerID, CustomerName, country FROM Customers";
		Connection con = DriverManager.getConnection(url, name, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
				
		try (con; st; rs;) {
			while(rs.next()) {
				int customerID = rs.getInt(1);
				String customerName = rs.getString(2);
				String country = rs.getString(3);
				System.out.println(customerID + ", " + customerName + ", " + country);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
