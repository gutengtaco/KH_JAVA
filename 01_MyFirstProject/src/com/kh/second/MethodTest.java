package com.kh.second;

public class MethodTest {// MethodTest Class 영역이 시작한다.

/*
 * 한 Class내에 여러 개의 Method를 만들 수 있다.
 * 무조건 main Method를 포함할 필요는 없다.
 * (단, 프로그램 단위에서는 최소 1개 이상이 필요하다) 	
 */
	
	//일반 Method : 스스로 실행되지 못한다. 호출(call)이 필요하다.
	public void testPrintA() {
		//Method가 실행되는 순간 실행될 내용
		System.out.println("testPrintA Method 실행");
		testPrintB();
	}
	public void testPrintB() {
		//Method가 실행되는 순간 실행될 내용
		System.out.println("testPrintB Method 실행");
		testPrintC();
	}
	public void testPrintC() {
		//Method가 실행되는 순간 실행될 내용
		System.out.println("testPrintC Method 실행");
		// testPrintA(); 무한반복이 됨.
		// [실행결과]
		// 프로그램시작
		// testPrintA 메소드 실행
		// testPrintB 메소드 실행
		// testPrintC 메소드 실행
		// testPrintA 메소드 실행
		// testPrintB 메소드 실행
		// testPrintC 메소드 실행
		// ...
		// [오류메세지]
		// Exception in thread "main" java.lang.stackOverflowError
		// Stack은 메모리 공간의 한 유형 중 하나인데 Stack의 크기를 벗어난 경우 발생
	}
	
}// MethodTest Class 영역이 끝난다.
