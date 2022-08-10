package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;

public class MethodRun {

	public static void main(String[] args) {
		
		System.out.println("------------MethodTest1 클래스------------"); 
//		1번
		MethodTest1 m1 = new MethodTest1();
		m1.method1(); 
		
		System.out.println("--------------------------------");
//		2번
//		m1.method2();	// sysout을 하지 않으면 결과값이 보이지 않음.
//		int random = m1.method2();	
//		System.out.println("랜덤값 : "+random);
		System.out.println("랜덤값 : "+m1.method2());
		
		System.out.println("--------------------------------");
//		3번
		m1.method3(1,10); // 순서, 개수, 자료형이 맞아 떨어져야 함.
		
		System.out.println("--------------------------------");
//		4번
		System.out.println(m1.method4(1, 10)); // sysout을 하지 않으면 결과값이 보이지 않음.
		
		/*
		 * 반환형이 있고, 없고의 차이
		 * 1. 반환형이 있는 경우(void가 아닌 경우) - 2,4번
		 * => 돌려줄 결과값이 있으니, 메소드를 호출하는 곳에서 반환형에 맞는 변수를 선언하여 결과를 대입.
		 * 2. 반환형이 없는 경우(void가 있는 경우) - 1,3번
		 * => 돌려줄 결과값이 없으니, 메소드 내에서 결과를 출력하는 형태로 이용.
		 * 
		 */
		System.out.println("------------MethodTest2 클래스------------"); 
		MethodTest2.method1(); // static은 import해주어야 함.
		
		System.out.println("---------------------------------");
		String str = MethodTest2.method2();
		System.out.println(str);
		System.out.println(MethodTest2.method2());
		
		System.out.println("---------------------------------");
		MethodTest2.method3("홍길동", 20);
		
		System.out.println("---------------------------------");
		
		System.out.println(MethodTest2.method4(10, 6, '*'));
		
		/*
		 * static 메소드의 경우에는 new문으로 객체를 생성할 필요가 없음.
		 * static이 붙은 클래스 변수와 마찬가지로 메소드 또한,
		 * 프로그램 실행 시, 메모리의 static영역(정적)에 할당됨.
		 */
	}

}
