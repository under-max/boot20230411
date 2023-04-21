package com.example.demo.mapper;

import org.apache.ibatis.annotations.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper03 {
	
	@Insert("""
			INSERT INTO MyTable34 (Col1, Col2)
			VALUES (#{var1}, #{var2})
			""")
	public int sql1(Integer var1, String var2); // return type int 몇개에 영향을 미쳤는지 리턴함
	
	
	@Insert("""
			INSERT INTO MyTable35 (Col1, Col2)
			VALUES (#{v1}, #{v2})
			""")
	int sql2(Double v1, String v2);
	
	//MyTable35 만들고
	
	
	// 파라미터 1개일때
	// 프로퍼티명만 작성
	@Insert("""
			INSERT INTO MyTable36 (Col1, Col2, CoL3)
			VALUES (#{prop1}, #{prop2}, #{prop3})
			""")
	public int sql3(Dto09 dto);
	
	// 
	@Insert("""
			INSERT INTO MyTable37 (Age, Name, Score)
			VALUES (#{age}, #{name}, #{score})
			""")
	public int sql4(Dto10 dto);
	
	
	@Insert("""
			INSERT INTO MyTable37 (Age, Name, Score)
			VALUES (#{dto09.prop1}, #{dto10.name}, #{dto09.prop3})
			""")
	public int sql5(Dto09 dto09, Dto10 dto10);
	
	
	// dto1.prop1 -> col1
	// dto2.age -> col2
	// dto1.prop2 -> col3
	// dto2.name -> col4
	// dto1.prop3 -> col5
	// dto2.score -> col6
	@Insert("""
			INSERT INTO MyTable38 (Col1, Col2, Col3, Col4, Col5, Col6)
			VALUES (#{dto1.prop1}, #{dto2.age}, #{dto1.prop2}, #{dto2.name}, #{dto1.prop3}, #{dto2.score})
			""")
	public int sql6(Dto09 dto1, Dto10 dto2);

	
	
	@Insert("""
			INSERT INTO MyTable39 (Col2, Col3)
			VALUES (#{prop2}, #{prop3})
			""")
	@Options(useGeneratedKeys = true, keyProperty = "prop1")//keyProperty 자바빈 어디에 셋팅할건지
	public int sql7(Dto11 dto);
	
	
	@Insert("""
			INSERT INTO MyTable40 (Age, Name, Score)
			VALUES (#{age}, #{name}, #{score})
			""")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int sql8(Dto12 dto12);
	
	
}
