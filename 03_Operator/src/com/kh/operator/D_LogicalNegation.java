package com.kh.operator;

public class D_LogicalNegation {
	/*
	 * 논리 부정 연산자
	 * true 또는 false라는 논리값을 반전시켜주는 연산자
	 * 산술연산자, 증감연산자, 복합대입연산자가 숫자에 사용한 연산자인 것에 대해
	 * 논리 부정 연산자는 논리값에 대한 연산을 적용한다.
	 * [표현법]
	 * !논리값
	 */
	public void method1() {
		System.out.println("True의 부정 : " + !true);
		System.out.println("False의 부정 : "+ !false);
		
		boolean b1 = true;
		boolean b2 = !b1;
		System.out.println("b1의 부정 : "+b1);
		System.out.println("b2의 부정 : "+b2);
	}
}
