package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper06 {

	@Select("""
			SELECT
			CustomerId id,
			CustomerName name,
			ContactName,
			Address
			FROM Customers
			ORDER BY CustomerId DESC
			LIMIT #{startIndex}, 20
			""")
	List<Customer> listCustomer(Integer startInteger);
	

	@Select("""
			SELECT COUNT(*)
			FROM Customers
			""")
	Integer countAll();
}
