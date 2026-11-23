package com.student.school;

import java.io.Serializable;

public class Student implements Serializable {
	
	String studentId;
	String studentName;
	String schoolName;
   private transient int password;
	public Student(String studentId, String studentName, String schoolName, int password) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.schoolName = schoolName;
		this.password = password;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
    

}
