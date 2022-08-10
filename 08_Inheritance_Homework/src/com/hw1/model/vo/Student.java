package com.hw1.model.vo;

public class Student extends Person{
//	�ʵ��
	private int grade;
	private String major;
	
//	�����ں�
//	Protected�� ��Ӱ����, �ٸ���Ű������ ��� ����
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
//	�޼ҵ��
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
