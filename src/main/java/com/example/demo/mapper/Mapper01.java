package com.example.demo.mapper;

import java.time.*;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper01 {
	
	@Select("""
			SELECT CustomerName 
			FROM Customers
			WHERE CustomerID = 1
			""")
	public String method1(); //나오는값 리턴할수 있도록 String 값으로 return value 지정
	
	@Select("""
			SELECT FirstName
			FROM Employees
			WHERE EmployeeId = 1
			""")
	public String method2();
	
	@Select("""
			SELECT SupplierName
			FROM Suppliers
			WHERE SupplierId = 1
			""")
	public String method3();
	
	
	@Select("""
			SELECT CustomerName
			FROM Customers
			WHERE CustomerId = #{id}
			""")
	public String method4(Integer id);
	
	
	@Select("""
			SELECT LastName
			FROM Employees
			WHERE EmployeeId = #{id}
			""")
	public String method5(Integer id);
	
	
	@Select("""
			SELECT Price 
			FROM MyTable33
			LIMIT 1
			""")
	public Integer method6();
	
	
	@Select("""
			SELECT Weight
			FROM MyTable33 
			Limit 1
			""")
	public Double method7();
	
	
	@Select("""
			SELECT Published
			FROM MyTable33 
			Limit 1
			""")
	public LocalDate method8();
	
	@Select("""
			SELECT Updated
			FROM MyTable33 
			Limit 1
			""")
	public LocalDateTime method9();
	
	
	@Select("""
			SELECT Title,
				   Published,
				   Price,
				   Updated,
				   Weight
			FROM MyTable33
			Limit 1				   
			""") // 컬럼명과 대소문자 구분없이 매치되는 빈의 프로퍼티명이 있으면 가능 
	public MyTable33 method10();

	
	@Select("""
			SELECT 
				Name,
				Age,
				Price,
				Birth,
				Inserted
			FROM MyTable32
			LIMIT 1
			""")
	public Dto5 method11();
	
	
	@Select("""
			SELECT 
				CustomerId as id,
				CustomerName as name, 
				ContactName,
				Address,
				City,
				PostalCode,
				Country
			FROM Customers
			WHERE CustomerId = 7
			""")
	public Customer method12();
	
	@Select("""
			SELECT 
				SupplierId id,
				SupplierName name,
				ContactName,
				address,
				City,
				PostalCode,
				Country,
				Phone
			FROM Suppliers
			WHERE Supplierid = 2				
			""")
	public Supplier method13();
	
	
	
	@Select("""
			SELECT 
				EmployeeId id,
				LastName,
				FirstName,
				BirthDate birth,
				Photo,
				Notes
			FROM Employees
			WHERE EmployeeId = 5
			""")
	public Employee method14();
	
	
	
	
}
