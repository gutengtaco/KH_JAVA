package com.kh.chap06_method.controller;

public class OverloadingTest {
	/*
	 * 메소드 오버로딩
	 * 한 클래스 내에 같은 메소드명으로 여러 메소드를 정의할 수 있는 방법.
	 * (즉, 메소드의 이름이 중복되도 허용함.)
	 * 
	 * 오버로딩 규칙
	 * 1. 매개변수의 자료형의 개수, 순서가 다르게 작성되어야 함.
	 * 2. 매개변수명, 반환형, 접근제한자는 오버로딩에 영향을 주지 않음.
	 * 3. 메소드명은 동일해야 함.
	 */
	
	/*
	 *오버로딩이 잘 된 예시
	 *System.out.println : 매개변수의 개수가 같더라도 종류가 다른 예시
	 *System.out.printf : 매개변수의 개수가 대놓고 다른 예시
	 *이전에 했던 "생성자" 예시 
	 */
	
	public void test() {
		// System안의 println메소드를 사용한 것임.
		// 괄호 안의 내용물은 매개변수임.
		System.out.println(0);	// int
		System.out.println('1');	// char
		System.out.println(1.1);	// double
		System.out.println("하이"); 	// String
 		System.out.println(true);	// boolean
 		// => 메소드의 매개변수의 개수는 같으나, 종류가 다르기 때문에, 오버로딩의 대표적인 예시임.
	}
	public void test(int a) { // 매개변수의 개수가 다르면, 오버로딩이 적용됨.
		
	}
	public void test(int a, String s) { // 마찬가지로, 매개변수의 개수가 달라, 오버로딩이 적용됨.
		
	}
	public void test(String s, int a) { // 매개변수의 종류와 개수가 같으나, 순서를 바꿔서, 오버로딩이 적용됨.
		
	}
	public void test(int a, int b) { // 매개변수의 개수가 같으나, 종류가 달라서, 오버로딩이 적용됨.
		
	}
//	public void test(int c, int d){ // 매개변수의 종류, 개수, 순서는 같음 => 오버로딩이 적용 안됨.
//									   => 매개변수명은 영향을 주지 않음.
//									   => 매개변수의 자료형의 개수와 순서가 다르게 작성되어야 함.
//	}
	public void test(int a, int b, String s) { // 매개변수의 종류, 개수가 모두 달라, 오버로딩이 적용됨.
		
	}
//	public int test(int a, int b, String s) {    매개변수의 종류, 개수, 순서가 같음 => 오버로딩이 적용 안됨.
//												 =>반환형이 영향을 주지 않음.
//		  										 =>오로지 매개변수의 종류, 개수, 순서만 오버로딩에 영향을 줌.
//	}
//	private void test(int a, int b, String s) {	 매개변수의 종류, 개수, 순서가 같음 => 오버로딩이 적용 안됨.
//	 											 =>접근제한자가 영향을 주지 않음. 
//		
//	}
	
}
