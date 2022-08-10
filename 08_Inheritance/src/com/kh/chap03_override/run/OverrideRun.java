package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		/*
		 * 모든 클래스는 Object의 후손임.
		 * 즉, 자바에서 최상위클래스는 항상 Object
		 * => Object에 있는 메소드들은 어느 클래스를 만들든지 가져다 쓸 수 있음.
		 * => 마음에 안들면 입맛대로 재정의하여 쓸 수 있음.
		 */
		
		Book bk = new Book("자바의정석","김자바",23000);
		System.out.println(bk.toString()); // 필드의 내용물을 문자열로 연이어서.
		System.out.println(bk /*.toString*/); // 주소값이 아닌 실제값이 찍힘.
		
		/*
		 * Object 클래스에서 제공하는 toString() 메소드의 원래 역할 => 주소값 찍어주기
		 * (해당 참조형 변수의 풀클래스명 @해당 객체의 주소값의 16진수형태 => 10진수는 .hashcode())
		 * => 지금은 주소값을 찍는 대신에, 각 필드의 값을 문자열로 연이어서 리턴하게끔 오버라이딩을 해줬음.
		 * => toString()메소드를 주석처리하면, 오버라이딩이 해제되어, 원래대로 주소값이 찍히는 것을 볼 수 있음.
		 */
		
		
	}

}
