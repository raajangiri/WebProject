package com.raajan.di;

public class Student {
	
	private int id;
	private String studentName;
	
	 

	public Student(int id, String studentName) {
		
		this.id = id;
		this.studentName = studentName;
	}



	public void displayStudentInfo()
	{
		
		
		System.out.println("student name is :"+studentName+"\n student id is:"+id);
	
	
	}
	

}
