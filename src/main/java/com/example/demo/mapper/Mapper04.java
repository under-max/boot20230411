package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

@Mapper
public interface Mapper04 {

	@Delete("""
			DELETE FROM MyTable40
			""")
	public int sql1();
	
	
	@Delete("""
			DELETE FROM MyTable39
			WHERE Col1 = #{id}
			""")
	public int sql2(Integer id);
	
	@Delete("""
			DELETE FROM Customers
			WHERE CustomerId = #{id}
			""")
	public int sql3(Integer id);
}
