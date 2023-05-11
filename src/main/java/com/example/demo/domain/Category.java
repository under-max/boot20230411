package com.example.demo.domain;

import java.util.*;

import lombok.*;
@Data
public class Category {

	private Integer id;
	private String name;
	private String description;
	
	// 하지만 ProductsName 을 가져오는 JOIN을 해야 한다면 
	
	private List<Products> products;
}
