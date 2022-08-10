package com.kh.chap04_field.model.vo;

// 클래스변수(static변수)와 상수필드(static final)에 대하여 정리
public class FieldTest3 {
	
//	접근제한자 [예약어] 자료형 필드명; 
	public static String sta = "static 변수";  //static이 붙으면 글씨가 기울어짐.
//	 생성시점 : 프로그램이 시작과 동시에 static영역에 할당.
//			(객체를 생성하지 않아도 할당이 됨.)
//	소멸시점 : 프로그램이 종료됨과 함께 소멸됨.
//	static은 "공유"의 성격이 강함.
//	=> 프로그램 시작과 동시에 메모리영역에 자동으로 생성하여 두고두고 공유해서 씀.
	
	public String str = "그냥 멤버변수";
	
//	static은 메소드에도 붙일 수 있음.
	public static void test() {
		System.out.println("안녕");
	}
	
	/*
	 * 상수 필드
	 * [표현법]
	 * public static final 자료형 필드명 = 값;
	 * 
	 * => 한번 지정된 값은 고정해서 사용하기 때문에,
	 * => 무조건 처음에 초기화를 같이 해주어야 함.
	 * => 예약어의 순서는 final static도 가능함.
	 * => 필드명은 모두 대문자로 작성.
	 * 
	 * static : 공유의 개념
	 * final : 한번 초기화된 값은 변경 불가.
	 * => 값이 변경되서는 안되는 , 고정적인 값을 지정할때 쓰임.
	 * => 예) math.PI = 3.141592...
	 */
	
	public static final int NUM = 1;
	
}
