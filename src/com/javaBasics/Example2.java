package com.javaBasics;

//java program starts from the class
public class Example2 
{
	
	//Bootstrapping/execution point of java program
	public static void main(String[] args) 
	{	
		/**
		 * Write a java program to calculate sum of the elements of an array.
		 */
		
		int values[] = {100, 230, 330, 490, 200};
		/**
		 * Array: an array is a collection of similar type/homogeneous values.
		 * 
		 * The features of an array: 
		 * 			- array works based index concept
		 * 			- array index starts from 0 and ends with length-1(last value)
		 * 
		 */
		
		//System.out.println(values.length);
		
		int sum = 0;
		
		for(int i = 0; i < values.length; i++)//i++ => i = i+1
		{
			sum = sum + values[i];
			/**
			 * iteration-1: sum = 0+100 => 100
			 * iteration-2: sum = 100+230 => 330
			 * iteration-3: sum = 330+330 => 660
			 * iteration-4: sum = 660+490 => 1150
			 * iteration-5: sum = 1150+200 => 1350
			 */
		}
		
		System.out.println(sum);
		
		//System.out.println(values[values.length-1]);
		
	}

}
