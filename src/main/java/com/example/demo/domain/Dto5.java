package com.example.demo.domain;

import java.time.*;

import lombok.*;

@Data
public class Dto5 {
	private String name;
	private int age;
	private double price;
	private LocalDate birth;
	private LocalDateTime inserted;
}
