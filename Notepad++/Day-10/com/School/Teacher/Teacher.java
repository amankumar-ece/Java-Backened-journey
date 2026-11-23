package com.School.Teacher;

// Accesing student file which is in another package
import com.School.Student.Student;
class Teacher
{
  public static void main(String args[])
  {
 // using student class which is in different package 
    Student acc = new Student();
	
	acc.showStudent(); 
	}
}	
