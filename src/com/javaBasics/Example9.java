package com.javaBasics;

public class Example9 {

	public static void main(String[] args) {
		
		int a = 100, b = 50;
		
		boolean valid = true, inValid = false, operation;
		
		//1.unary operators: ++, --
		//int operation1 = a++;		
		//System.out.println(operation1);
		
		//2.binary operators: +, /, >, &&, ||..etc
		int result = a/b;
		System.out.println(result);
		
		//3. ternary operators: ?:		
		operation = a > b;//true
		
		System.out.println(operation ? valid: inValid);
		
	}

}
