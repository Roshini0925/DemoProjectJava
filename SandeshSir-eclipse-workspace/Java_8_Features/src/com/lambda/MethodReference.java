package com.lambda;
@FunctionalInterface
interface Demo{
	void print(String msg);
	}
	class Hello{
		void display(String message) {
			System.out.println("Hello Everyone" +message);
		}
	}
class Hi{
	static void show(String message) {
		System.out.println("Hi " +message);
	}
}
public class MethodReference {
	
public static void main(String[] args) {
	Hello hello=new Hello();
	Demo demo=hello::display;
	demo.print("How are you all");
	Demo demo1=Hi::show;
	demo1.print("Wassup");
}
}