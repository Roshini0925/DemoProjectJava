package com.stream;

import java.util.Arrays;
import java.util.List;

public class UsingString {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Asha","Ravi","Mohan","Arun","Akshya","Sita","Gita","Rama");
		
		System.out.println("Names starting with A:");
		names.stream()
		.filter(name->name.startsWith("A"))
		.forEach(System.out::println);	
	}
}
