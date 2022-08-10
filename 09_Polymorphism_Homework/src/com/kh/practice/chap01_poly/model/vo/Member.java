package com.kh.practice.chap01_poly.model.vo;

public class Member {
	
//	鞘靛何
	private String name;
	private int age;
	private char gender;
	private int couponCount = 0;
	
//	积己磊何
	public Member() {
		super();
	}
	
	public Member(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
//	getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getCouponCount() {
		return couponCount;
	}

	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
//	toString
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", gender=" + gender + ", couponCount=" + couponCount + "]";
	}
	
	
	
	
}
