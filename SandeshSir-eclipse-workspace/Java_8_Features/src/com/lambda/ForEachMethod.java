package com.lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
	
	public static void main(String[] args) {
     List<String>movies=Arrays.asList("Kantara","The Girlfriend","Salaar","A","Raja Kumara","OG","Shh","Saiyaara");
//    
//     for(String movie:movies) 
//     {
//     System.out.println(movie);
//}
     System.out.println("Using Lambda inside forEach()");
     movies.forEach((movie)->System.out.println(movie));

     System.out.println("Using method reference inside forEach()");
     movies.forEach(System.out::println);
}
}