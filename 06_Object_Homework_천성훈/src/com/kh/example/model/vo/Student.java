package com.kh.example.model.vo;

public class Student {

//	[필드부]
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

//	[생성자부]
	
//	[메소드부]
//	setter 메소드
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
//	getter 메소드	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
//	information 메소드
	public String information() {
		return "학년 : " + grade +"\n"+"반 : "+classroom+"\n"
				+"이름 : "+name+"\n"+"키 : "+height+"\n" 
				+ "성별 : "+ gender;
	}
}
