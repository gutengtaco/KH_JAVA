package com.kh.operator;

import java.util.Scanner;

public class E_Comparison {
	/*
	 * 비교연산자(관계연산자)
	 * 두개의 값을 비교하는 이항연산자
	 * 비교 연산 결과가 참일 경우 True, 거짓일 경우 False로 반환한다.
	 * => 특정 조건을 제시하는 조건문에 사용된다.
	 * 
	 * 분류
	 * 1. 크고 작음을 비교 
	 * => 숫자, 문자가 가능하다.
	 * a > b : a가 b보다 큰가? True or False
	 * a < b : a가 b보다 작은가? True or False
	 * a >= b : a가 b보다 크거나 같은가? True or False
	 * a <= b : a가 b보다 작거나 같은가? True or False
	 * 
	 * 2. 같음을 비교
	 * => 숫자, 문자, 주소값, 논리값 등이 가능하다.
	 * a == b : a와 b가 일치하는가? True or False
	 * a != b : a와 b가 일치하지 않는가? True or False
	 * 
	 * 
	 */
	public void method1() {
		
		//대소비교 연산자
		int a = 10;
		int b = 25;
		System.out.println("b가 a보다 큽니까? " + (a < b));
		System.out.println("a가 b보다 큽니까? " + (a > b));
		// +가 >보다 우선순위가 높으나, 문자열 > 숫자의 경우라서 오류가 뜬다.
		// 따라서, 괄호로 묶어서 우선순위를 차등하여 더 높여주어야 한다.
		// 괄호로 묶으면 (a > b)를 먼저 수행하고,이후 왼쪽에서 오른쪽으로 출력을 진행한다.
		System.out.println("a가 b보다 작거나 같습니까? " + (a <= b));
		System.out.println("a가 b보다 크거나 같습니까? " + (a >= b));
		System.out.println();
		//동등비교 연산자
		boolean result1 = (a == b);
		System.out.println("result1 : " + result1);
		boolean result2 = (a != b);
		System.out.println("result2 : " + result2);
		System.out.println();
		//산술연산 + 비교연산
		boolean result3 = 3 + 5 < 1;
		// 우선순위가 산술연산, 비교연산, 대입연산 순이라
		// 3+5, <1, = 순서로 실행된다.
		System.out.println("result3 : " + result3);
		System.out.println();
		/*
		 * 짝수, 홀수
		 * 짝수 : 2로 나누었을 때, 나누어 떨어지는 수(나머지가 0)
		 * 홀수 : 2로 나누었을 때, 나누어 떨어지지 않는 수(나머지가 1)
		 */
		// a = 10;, b = 25;
		System.out.println("a가 짝수입니까? " + ((a % 2)==0) );
		System.out.println("a가 홀수입니까? " + ((a % 2)==1) );
		System.out.println("b가 짝수입니까? " + ((b % 2)==0) );
		System.out.println("b가 홀수입니까? " + ((b % 2)==1) );
		System.out.println("b가 짝수가 아닙니까? " + ((b % 2)!=0) );
	}
	public void method2() {
		
		// 1. 사용자로부터 값(정수)을 입력받는다.
		// 2. 해당 값이 양수입니까?
		// 3. 해당 값이 짝수입니까?
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수의 값 :");
		int iNum = sc.nextInt();
		sc.nextLine();
	    System.out.println("해당 값이 양수입니까? : " + (iNum > 0) );
	    System.out.println("해당 값이 짝수입니까? : " + ((iNum % 2) == 0) );
		
	}
}
