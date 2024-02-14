package com.javaBasics;

public class Example8 
{
	
	public static void main(String[] args) 
	{	
		/**
		 * Write a java program to calculate sum of the elements of an array.
		 */
		
		int values[] = {100, 230, 330, 490, 200};
		
		int sum = 0;
		
		for(int i = 0; i < values.length; i++)//i++ => i = i+1
		{
			sum = sum + values[i];//an expression
			/**
			 * From the above line-18 of code,
			 * 
			 * sum = sum + values[i] is an expression
			 * 
			 * Operands(variables and Constants): sum, values and i
			 * 
			 * Operators: = and + 
			 * 
			 * Expression = Operands + Operators 
			 * 
			 */
		}
		
		System.out.println(sum);
		
		//System.out.println(values[values.length-1]);
		
	}

}
