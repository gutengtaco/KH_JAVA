package com.kh.chap02_abstractAndInterface.part02_family.model.vo;
//	eat,sleep메소드가 추상메소드라, 오버라이드로 채워주기 전까지는 추상클래스 오류뜸.
//					상속			구현
public class Mother extends Person implements Basic {
//	필드부
	/*
	 * name, weight, health
	 */
	private String babyBirth;	// 아기의 탄생 여부 : 출산, 입양, 없음

//	생성자부
	public Mother() {
		super();
	}
	public Mother(String name, double weight, int health,String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
//	메소드부
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	@Override
	public String toString() {	// toString은 오버라이딩 강제 x(편의성을 위해 만듬)
		return super.toString()+", babyBirth : " + babyBirth;
	}
//	eat과 sleep은 오버라이딩 강제 O(추상메소드이기 때문에)
	
//	인터페이스를 사용하지 않으면, 부모클래스인 Person에 eat,sleep메소드가 없어서(주석처리하여) 오류가 뜸.
//	다만, 인터페이스(Basic)에 eat,sleep메소드가 존재하기 때문에, implements Basic을 해주면 오류가 사라짐.
	@Override
	public void eat() {
//		몸무게를 기존의 몸무게에 10 증가
		super.setWeight(super.getWeight() +10);
//		건강도를 기존의 건강도에 10 감소
		super.setHealth(super.getHealth() -10);
	}
	@Override
	public void sleep() {
//		건강도를 기존의 건강도에 10 증가
		super.setHealth(super.getHealth() +10);
	}
	
}
