package com.lambda;
@FunctionalInterface
interface PaymentService{
	String makePayment(int amount);
}
interface Operation{
	int calculate(int a,int b);
}
public class LambdaTest1 {
public static void main(String[] args) {
	PaymentService upi=(amount)->{
		return "Making Payment of Rs."+amount+" using UPI";
	};
	System.out.println(upi.makePayment(6000));
	Operation addition=(m,n)->(m+n);
	System.out.println("Addition: "+addition.calculate(10, 20));
	Operation multiplication=(x,y)->(x*y);
	System.out.println("Multiplication"+multiplication.calculate(5, 4));
	Operation division=(p,q)->(p/q);
	System.out.println("Division: "+division.calculate(20, 5));
}
}
