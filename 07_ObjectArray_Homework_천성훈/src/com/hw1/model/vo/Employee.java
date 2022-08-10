package com.hw1.model.vo;

public class Employee {
//	필드부
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String adress;
//	생성자부
	public Employee() {}
	public Employee(int empNo, String empName, int age
			, char gender, String phone, String adress) {
		this.empNo = empNo;
		this.empName = empName;
		this.age= age;
		this.gender = gender;
		this.phone = phone;
		this.adress = adress;
	}
	public Employee(int empNo, String empName,String dept,String job, int age
			, char gender,int salary,double bonusPoint, String phone, String adress) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age= age;
		this.gender = gender;
		this.salary= salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.adress = adress;
	}
//	메소드부
//	setter메소드
	public void setEmpNo(int empNo) {this.empNo = empNo;}
	public void setEmpName(String empName) {this.empName = empName;}
	public void setDept(String dept) {this.dept = dept;}
	public void setJob(String job) {this.job = job;}
	public void setAge(int age) {this.age = age;}
	public void setGender(char gender) {this.gender= gender;}
	public void setSalary(int salary) {this.salary=salary;}
	public void setBonusPoint(double bonusPoint) {this.bonusPoint = bonusPoint;}
	public void setPhone(String phone) {this.phone= phone;}
	public void setAdress(String adress) {this.adress = adress;}
//	getter메소드
	public int getEmpNo() {return empNo;}
	public String getEmpName() {return empName;}
	public String getDept() {return dept;}
	public String getJob() {return job;}
	public int getAge() {return age;}
	public char getGender() {return gender;}
	public int getSalary() {return salary;}
	public double getBonusPoint() {return bonusPoint;}
	public String getPhone() {return phone;}
	public String getAdress() {return adress;}
	
//	information
	public String information() {
		return empNo+", "+empName+", "+dept+", "+job+", "
				+age +", "+ gender+", "+salary+", "+bonusPoint+", "+
				phone+", "+adress;
	}
	
}
