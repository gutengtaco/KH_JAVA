package com.kh.chap06_method.controller;

public class MethodTest2 {
	// static : 메소드의 경우, 호출 시 new구문으로 객체를 생성할 필요 없음.
	
	public static void method1() {
		System.out.println("매개변수도 없고, 반환형도 없는 static 메소드");
	}
	public static String method2() {
		return "매개변수는 없지만, 반환값은 있는 static 메소드";
	}
	public static void method3(String name, int age) {
		System.out.printf("%d살의 %s님 환영합니다.\n",age,name);
	}
	public static int method4(int num1, int num2, char op) {
		int result = 0;
		switch(op) {
		case '+' :  result = num1 + num2; break;
		case '-' :  result = num1 - num2; break;
		case '*' :  result = num1 * num2; break;
		case '/' :  result = num1 / num2; break;
		case '%' :  result = num1 % num2; break;
		default : result = -99999; 
		}
//		return "계산하기 싫은데?"; 
//		오류 : 반환형과 return의 자료형이 일치해야 함.
		return result;
	}
	
}
