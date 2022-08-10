package com.kh.chap01.run;

import com.kh.chap01.condition.B_Else;
import com.kh.chap01.condition.C_Switch;

public class ConditionRun {
	/*
	 * 프로그램은 기본적으로 위에서 아래로 순차적으로 실행된다.
	 * 다만, 순차적인 흐름을 바꾸고자 할 때는 "제어문"을 사용하여 제어한다.
	 * 
	 * 제어문의 종류로는 조건문, 반복문, 분기문이 있다.
	 * 조건문 : 선택적으로 실행하는 선택문(if문/ if-else문/ if -else if문/ switch문)
	 * 반복문 : 반복적으로 실행하는 실행문(while문/ do-while문/ for문)
	 * 분기문 : 그 이외의 흐름을 제어하는 구문(break문, continue문)
	 * 
	 * 조건문 
	 * "조건식"을 통해 결과가 참, 거짓을 판별하여 
	 * 해당 조건이 참일 경우, 이와 관련된 구문을 실*행한다.
	 * => 조건식의 결과는 true / false 라는 논리값만 나와야 한다.
	 * => 조건식에서는 비교연산자(대소,동등), 논리연산자(&&,||)을 주로 사용한다.
	 * 
	 * 조건문은 크게 if문과 switch문으로 나뉜다.
	 * 1. if문 계열
	 * 단독 if문
	 * if-else문
	 * if-else if문
	 *
	 * 2. switch문
	 */
	public static void main(String[] args) {
//		A_If a = new A_If();
//		a.method1();
//		a.method2();
//		a.method3();
//		a.method4();
		B_Else b = new B_Else();
//		b.method1();
//		b.method2();
//		b.method3();
//		b.method4();
//		b.method5();
//		b.method6();
		C_Switch c = new C_Switch();
//		c.method1();
//		c.method2();
//		c.method3();
		c.method4();
	}

}
