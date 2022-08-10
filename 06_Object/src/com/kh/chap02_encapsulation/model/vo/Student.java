package com.kh.chap02_encapsulation.model.vo;

public class Student {
	// [필드부]
	/* 필드 == 맴버변수, 인스턴스변수
	 * 
	 * 	접근제한자     [예약어]   자료형     필드명;
	 * 	public           기본자료형
	 * 	protected        참조자료형
	 * 	default          
	 * 	private
	 */
	private String name;
	private int age;
	private double height;
	
	// [생성자부]
	
	// [메소드부]
	// 접근제한자 반환형 메소드명(매개변수){ }
	// setter , getter메소드 작성
	
	// setter 메소드
	// public void set필드명(자료형 매개변수명){  
	// 	 this.필드명 = 매개변수명;		
	// }
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	// getter 메소드
	// public 자료형 get필드명(){
	//	 return 필드명;
	// }
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	// 여기까지가 캡슐화
	
	// 한큐에, 현재 필드에 담겨있는 모든 값들을 하나의 문자열로 합쳐 내보내는 메소드
	public String information() {
		// return name, age, height; (X) => return구문시 작성된 결과값은 한개뿐이어야 함.
		// 따라서, 꼼수로 자료형을 String으로 하고, 한줄로 모든 내용을 문자열로 취급해버림.
		return name + "님의 나이는 " + age + " 살 이고, 키는 " + height + " cm입니다.";
	}
}





