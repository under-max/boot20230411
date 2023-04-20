package com.example.demo.controller;

import java.sql.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("sub18")
public class Controller18 {

	@Value("${spring.datasource.url}") // application.properties 사용하기 위함
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	// 트랜젝션 없이 모두 실행
	@RequestMapping("link1")
	public void method1() {

		String sql1 = """
				UPDATE BANK
				SET Money = Money - 5000
				WHERE CustomerName = 'A';
				""";

		String sql2 = """
				UPDATE BANK
				SET Money = Money + 5000
				WHERE CustomerName = 'B';
				""";

		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt1 = con.createStatement();
				Statement stmt2 = con.createStatement();) {
			stmt1.executeUpdate(sql1);
			stmt2.executeUpdate(sql2);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("이체완료");
	}

	
	// 트랜잭션 설정 없이 중간에 exception 발생	
	@RequestMapping("link2")
	public void method2() {

		String sql1 = """
				UPDATE BANK
				SET Money = Money - 5000
				WHERE CustomerName = 'A';
				""";

		String sql2 = """
				UPDATE BANK
				SET Money = Money + 5000
				WHERE CustomerName = 'B';
				""";

		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt1 = con.createStatement();
				Statement stmt2 = con.createStatement();) {
			stmt1.executeUpdate(sql1);
			// exception 발생 
			int a = 3 / 0;
			
			stmt2.executeUpdate(sql2);
			System.out.println("이체완료");

		} catch (Exception e) {
			System.out.println("이체 실패");
			e.printStackTrace();
		}

	}

	
	// 트랜잭션 설정 후 모두 성공 하는 code
	@RequestMapping("link3")
	public void method3() {

		String sql1 = """
				UPDATE BANK
				SET Money = Money - 5000
				WHERE CustomerName = 'A';
				""";

		String sql2 = """
				UPDATE BANK
				SET Money = Money + 5000
				WHERE CustomerName = 'B';
				""";

		try (
				Connection con = DriverManager.getConnection(url, username, password);
				Statement stmt1 = con.createStatement();
				Statement stmt2 = con.createStatement();) {
			con.setAutoCommit(false);
			
			stmt1.executeUpdate(sql1);
			stmt2.executeUpdate(sql2);
			
			con.commit();
			System.out.println("이체완료");

		} catch (Exception e) {
			System.out.println("이체 실패");
			e.printStackTrace();
		}

	}
	
	
	// 트랜잭션 설정 후 모두 실패 (중간에 exception 발생시)
		@RequestMapping("link4")
		public void method4() throws Exception{

			String sql1 = """
					UPDATE BANK
					SET Money = Money - 5000
					WHERE CustomerName = 'A';
					""";

			String sql2 = """
					UPDATE BANK
					SET Money = Money + 5000
					WHERE CustomerName = 'B';
					""";
			
			Connection con = DriverManager.getConnection(url, username, password);
			try (
					con;
					Statement stmt1 = con.createStatement();
					Statement stmt2 = con.createStatement();) {
				con.setAutoCommit(false);
				
				stmt1.executeUpdate(sql1);
				
				// exception 발생 
				int a = 5 / 0;
				stmt2.executeUpdate(sql2);
				
				con.commit();
				System.out.println("이체완료");

			} catch (Exception e) {
				System.out.println("이체 실패");
				con.rollback();
				e.printStackTrace();
			}

		}
		
		
	
}
