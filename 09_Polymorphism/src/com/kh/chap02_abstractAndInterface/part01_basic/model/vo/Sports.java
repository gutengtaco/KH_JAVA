package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public abstract class Sports {
//	필드부
	private int people;	// Sports에 참여하는 선수의 명수
	
	
//	생성자부
	public Sports() {}
	public Sports(int people) {this.people= people;}
//	메소드부
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	@Override
	public String toString() {
		return "people : "+people;
	}
	
	public abstract void rule();
	/*
	 * 어차피 오버라이딩을 할 것인데, 왜 부모클래스에 내용을 채워야 하는가??
	 * 
	 * 몸통부가 존재하지 않는 미완성메소드 == 추상메소드
	 * => abstract라는 예약어를 같이 써주어야 함.
	 * [표현법]
	 * public abstract 반환형 메소드명(매개변수 => 생략가능);
	 * => 중괄호 영역이 없음.
	 * [주의사항]
	 * 만약, 내가 지금 작성하고 있는 클래스의 메소드들 중에서
	 * abstract라는 키워드가 붙은 추상메소드가 하나라도 포함되는 순간,
	 * 그 클래스는 추상클래스가 됨.
	 * => 클래스명 앞에도 abstract를 붙여주어야 함!!
	 */
}
