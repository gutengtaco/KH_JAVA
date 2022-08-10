package com.hw1.model.vo;

public class Student extends Person{
//	필드부
	private int grade;
	private String major;
	
//	생성자부
//	Protected는 상속관계시, 다른패키지에서 사용 가능
	public Student() {
		super();
	}
	public Student(String name, 
			int age, 
			double height, 
			double weight,
			int grade, String major) {
		
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
//	메소드부
//	getter, setter
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
//	information
	@Override
	public String information() {
		return super.information()
				+", grade : "+grade + ", major : "+major;
	}
}
