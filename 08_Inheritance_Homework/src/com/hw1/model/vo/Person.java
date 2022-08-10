package com.hw1.model.vo;

public class Person {
//	�ʵ��
	protected String name;
	private int age;
	private double height;
	private double weight;
//	�����ں�
	public Person() {}
	public Person(int age, 
			double height, 
			double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
//	�޼ҵ��
//	getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
//	setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
//	information
	public String information() {
		return "name : "+name + ", age : "+age + 
				", height : "+height + ", weight : "+weight;
	}
	
}
