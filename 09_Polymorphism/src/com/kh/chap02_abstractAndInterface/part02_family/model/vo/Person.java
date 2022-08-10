package com.kh.chap02_abstractAndInterface.part02_family.model.vo;
//	추상클래스
public abstract class Person {
//	[필드부]
	private String name;
	private double weight;
	private int health;
	
//	[생성자부]
	public Person() {
		super();
	}
	public Person(String name, double weight, int health) {
		super();
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
//	[메소드부]
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	@Override
	public String toString() {
		return "name : "+name+", weight : "+weight+", health : "+health;
	}
//	메소드로 사람의 행위를 정의 : 먹는행위, 자는행위
//	추상메소드
	
//	인터페이스 사용을 위해 주석처림
//	public abstract void eat();
//	public abstract void sleep();
}
