package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper07 {
	//dynamic 쓰려면 script 태그 넣어야 함
	//keyword가 패턴으로 들어감
	@Select("""
			<script>
			<bind name="pattern" value="'%' + keyword +'%'"/> 
			SELECT
			customerId as id,
			customerName as name,
			contactName,
			address
			FROM Customers
			WHERE
			CustomerName LIKE #{pattern}
			ORDER BY id DESC
			</script>
			""")
	List<Customer> sql1(String keyword);

	
//	@Select("""
//			<script>
//			<bind name="c" value = "'%' + keyword + '%'"/>
//			SELECT
//			EmployeeId id
//			FirstName,
//			LastName
//			FROM Employees
//			WHERE
//			FirstName LIKE #{c}	
//			OR LastName LIKE #{c}		
//			</script>
//			""")
//	public List<Employee> sql2(String keyword);
	
	@Select("""
			<script>
			<bind name="p" value="'%' + s + '%'" />
			
			SELECT
				EmployeeId id,
				FirstName,
				LastName
			FROM
				Employees
			WHERE
				FirstName LIKE #{p}
				OR LastName LIKE #{p}
			ORDER BY id DESC
			</script>
			""")
	List<Employee> sql2(String s);


	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			
			<if test="false">
			WHERE CustomerId = 10
			</if>
			</script>
			""")
	Integer sql3();


	@Select("""
			<script>
			SELECT COUNT(*)
			FROM Customers
			<if test="keyword neq null">
			<bind name = "pattern" value = "'%' + keyword + '%'" />
			WHERE CustomerName LIKE #{pattern}
			</if>
			</script>
			""")
	Integer sql4(String keyword);


	
	@Select("""
			<script>
			SELECT AVG(Price)
			FROM Products
			<if test="check > 1">
				WHERE CategoryId = #{check}
			</if>
			</script>
			""")
	Double sql5(Integer check);
	
	
	
	
	
	
	
}
