package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
//	필드부
	private String name;
	private int age;
	private int score;
//	생성자부
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
//	메소드부
//	getter,setter
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
//	toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
//	eqauls() 메소드 재정의 : 세 필드의 값이 모두 일치하는지
	@Override
	public boolean equals(Object obj) {
		Student other = (Student)obj;
		
//		this.name과 other.name이 일치하는지 비교
//		this.age과 other.age이 일치하는지 비교
//		this.score과 other.score이 일치하는지 비교
//		=> 문자열은 eqauls(), 숫자형은 ==
		if( (this.name.equals(other.name))&& 
			(this.age == other.age) &&
			(this.score == other.score)) {
			
			return true;
		}else {
			return false;
		}
	}
//	hashCode() 메소드 재정의 : 세 필드의 값을 문자열 하나로 만든 다음, hashCode생성
	public int hashCode() {
//		"공유20100"
//		=> 세 필드를 모두 String으로 만들어 준 후, 이를 hashCode값으로 바꿔줌.
		return (name+age+score).hashCode();
	}
	
	/*
//	자동완성기능으로 eqauls(), hashCode()만들기
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	*/
	
}
