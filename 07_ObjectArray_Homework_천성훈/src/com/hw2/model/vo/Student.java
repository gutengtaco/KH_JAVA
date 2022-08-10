package com.hw2.model.vo;

public class Student {
//	필드부
	private int grade;
	private int classroom;
	private String name;
	private int kor;
	private int eng;
	private int math;
//	생성자부
	public Student() {}
	public Student(int grade, int classroom, String name, 
			int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
//	메소드부
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
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
//	getter메소드
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
//	information
	public String information() {
		return grade+","+classroom+","+name+","+kor+","+eng+","+math;
	}
}
