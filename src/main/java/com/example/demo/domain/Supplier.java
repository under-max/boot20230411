package com.example.demo.domain;

import java.util.*;

import lombok.*;

@Data
public class Supplier {

	private String name;
	private String contactName;
	private String address;
	private String city;
	private String postalCode;
	private String country;
	private String phone;
	private int id;
	
	// 공급자 정보 조회 상품정보도 같이 나오게 
	private List<Products> products;
}
