package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic {
//	필드부
//	생성자부
	public Baby() {
		super();
	}
//	Baby의 필드에는 멤버변수가 없지만
//	Person의 상속을 받아 사용하기 때문에, Person의 매개변수생성자를 호출 및 초기화해줌.
	public Baby(String name, double weight, int health) {
		super(name,weight,health);
	}
	
//	메소드부
	@Override
	public String toString() {
		return super.toString();
	}
//	eat, sleep 메소드 오버라이딩
	@Override
	public void eat() {	// 아기가 밥을 먹는다면
		
//		몸무게 3 증가
//		건강도 1 증가
		super.setWeight(super.getWeight() +3);
		super.setHealth(super.getHealth() +1);
	}
	@Override
	public void sleep() {	// 아기가 잠을 잔다면
//		건강도 3 증가
		super.setHealth(super.getHealth() +3);
	}
	
	
	
	
	
}
