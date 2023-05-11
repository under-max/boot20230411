package com.example.demo.mapper;

import java.util.*;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.domain.*;

@Mapper
public interface Mapper09 {
	
	@Select("""
			<script>
			SELECT 
			SupplierName name,
			contactName,
			address,
			city,
			postalCode,
			country,
			phone,
			SupplierID id
			FROM Suppliers
			WHERE country IN (
			<foreach collection="elems" item="elem" separator=",">
				#{elem}
			</foreach>
			)
			</script>
			""")
	public List<Supplier> sql1(List<String> elems);

	@Select("""
			<script>
			SELECT
			supplierName name,
			contactName,
			address,
			city,
			postalCode,
			country,
			phone,
			supplierID id
			FROM Suppliers
			
			<if test="con != null">
			WHERE Country IN (
			<foreach collection="con" item="ct" separator=",">
				#{ct}
			</foreach>
			)
			</if>
			</script>
			""")
	public List<Supplier> sql2(List<String> con);
	
	
}
