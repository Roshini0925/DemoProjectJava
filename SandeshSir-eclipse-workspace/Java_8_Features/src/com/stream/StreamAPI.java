package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI {
	public static void main(String[] args) {
		
		List<Integer> list1=Arrays.asList(2,3,4,5,6,7,8);
		
		Stream<Integer> stream=list1.stream();
		stream.forEach(System.out::println);
	    
		System.out.println("Even Numbers in the List:");
		for(Integer i:list1) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("using Stream filter() method:");
		//Predicate Interface
		Predicate<Integer> check=i->(i%2==0);
		System.out.println(check.test(7));
		System.out.println(check.test(6)); //this will return boolean true or false
        //Consumer Interface
        Consumer<String> consume=message->System.out.println("Hello " + message); 		
        	consume.accept("Everyone");
	
        	list1.stream()
		.filter(i->(i%2==0))
        .forEach(System.out::println);
        	
        	System.out.println("Collecting even numbers into a List:");
        	List<Integer>evenumbers=list1.stream()
        			.filter(i->(i%2==0))
        			.toList();
        	evenumbers.forEach(System.out::println);
	
		
//		stream.forEach(n->System.out.println(n));
	}
}
