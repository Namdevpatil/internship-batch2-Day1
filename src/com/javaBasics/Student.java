package com.javaBasics;

public class Student {

	//non-static variable
	int rollNumber = 4590;
	String studentName = "XYZ";

	
	//static variables
	static String collegeName = "JNTU Kakinada";
	
	//method
	public void getStudent1()
	{
		//local variables
				
		System.out.println(rollNumber);
		System.out.println(studentName);
		System.out.println(collegeName);
	}
	
	public void getStudent2()
	{
		System.out.println(rollNumber);
		System.out.println(studentName);//studentName cannot be resolved to a variable
		System.out.println(collegeName);
	}
	
}
