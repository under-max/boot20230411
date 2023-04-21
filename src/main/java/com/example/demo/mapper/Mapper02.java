package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper02 {

	
	@Select("""
			SELECT CustomerName From Customers
			""")
	public List<String> sql1();
	
	
	@Select("""
			SELECT LastName From Employees
			""")
	public List<String> sql2();
	
	
	@Select("""
			SELECT LastName, FirstName FROM Employees
			""")
	public List<Dto07> sql3();
	
	@Select("""
			SELECT ProductName, Price From Products
			""")
	public List<Dto08> sql4();
	
	@Select("""
			SELECT ProductName
			FROM Products
			WHERE CategoryId = #{cid}
			""")
	public List<String> sql5(Integer cid);
	
	@Select("""
			SELECT CustomerName
			FROM Customers
			WHERE Country = #{country}
			""")
	public List<String> sql6(String country);
	
	
	@Select("""
			SELECT ProductName, Price
			FROM Products
			WHERE CategoryId = #{cid}
			""")
	public List<Dto08> sql7(Integer cid);
	
}
