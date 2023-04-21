package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper05 {
	
	@Update("""
			UPDATE MyTable39
			SET Col2 = '수정된값'
				Col3 = 99999
			""")
	public int sql1();
	
	@Update("""
			UPDATE MyTable39
			SET Col2 = #{val1},
				Col3 = #{val2}
			WHERE Col1 = #{key}
			""")
	public int sql2(Integer key, String val1, Integer val2);
	
	
	@Update("""
			UPDATE Customers
			SET CustomerName = #{v1},
			Country = #{v2}
			WHERE CustomerId = #{id}
			""")
	public int sql3(Integer id, String v1, String v2);
	
	
	@Update("""
			UPDATE Customers
			SET
				CustomerName = #{name},
				Contactname = #{contactName},
				Address = #{address},
				City = #{city},
				PostalCode = #{postalCode},
				Country = #{country}
			WHERE CustomerId = #{id}
			""")
	public int sql4(Customer customer);
		
	@Select("""
			SELECT 
				CustomerId id,
				CustomerName name,
				ContactName,
				Address,
				City,
				Country,
				PostalCode
			FROM Customers
			WHERE CustomerId = #{id}
			""")
	Customer sql5(Integer id);
	
	
	
	// employee 직원조회 및 수정코드 작성
	 // 조회용
	@Select("""
			SELECT
				EmployeeId id,
				LastName,
				FirstName,
				BirthDate birth,
				Photo,
				Notes
			FROM Employees
			WHERE EmployeeId = #{id}
			""")
	public Employee sql6(Integer id);
	
	
	//업데이트용 
	@Update("""
			UPDATE Employees
			SET 
				EmployeeId = #{id},
				LastName = #{lastName},
				FirstName = #{firstName},
				BirthDate = #{birth},
				Photo = #{photo},
				Notes = #{notes}
			WHERE Employeeid = #{id}
			""")
	public int sql7(Employee employee);
}

