package com.kh.chap03_class.model.vo;

public class Person {
	
//	[鞘靛何]
	private String id; 
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
//	[积己磊何]
	
//	[皋家靛何]
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd() {
		return pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	public String information() {
		return "id : "+ id +"\n"+"pwd : "+ pwd+"\n" + "name : "+ name+"\n"
				+ "age : " + age+"\n"+ "gender : " + gender+"\n" + "phone : "+phone+"\n" 
				+ "email : "+email ;
	}
}
