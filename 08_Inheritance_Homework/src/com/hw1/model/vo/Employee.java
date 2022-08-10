package com.hw1.model.vo;

public class Employee extends Person{
//	鞘靛何
	private int salary;
	private String dept;
//	积己磊何
	public Employee() {
		super();
	}
	public Employee(String name, 
			int age, 
			double height, 
			double weight,
			int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
//	皋家靛何
//	getter, setter
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
//	information
	public String information() {
		return super.information()
				+", salary : "+salary + ", dept : "+ dept;
	}
	
	
}
