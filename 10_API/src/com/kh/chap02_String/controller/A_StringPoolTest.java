package com.kh.chap02_String.controller;

public class A_StringPoolTest {
	
	
//	String클래스에 대하여 공보해보자
//	String은 "불변클래스"(변하지 않는 클래스)라고 불림.
//	=> String 객체 기준으로 값이 수정되는 순간, 기존에 담긴 공간의 값이 변경되는 것이 아닌, 
//	=> 새로운 곳에서 새로운 문자열이 생기고 그 위치를 참조하겠다.
	
//	String형태의 객체 만들기
//	1. 생성자를 통해서 문자열 담기 => String str = new String();
	public void method1() {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
//		Stack				Heap
//		
//		0123	-------->	Hello
//		str1				0123
//		
//		1234	-------->	Hello
//		str2				1234
		System.out.println(str1 == str2); // false, 주소값 비교
		System.out.println(str1/*.toString*/);	// Hello
//		왜 toString인데도 주소값이 아닌 실제값이 나오는가?
//		Object클래스의 toString()메소드와 달리,
//		String클래스의 toString()메소드의 경우
//		오버라이딩을 하여 실제 담겨있는 주소값이 아닌, 실제 담겨있는 문자열을 반환하게끔 함.
		
		System.out.println(str1.equals(str2));	// true, 실제 문자열 비교
//		String 클래스의 equals()메소드의 경우,
//		원래는 실제 담겨있는 주소값을 비교하는 역할에서
//		실제 담겨있는 문자열을 비교할 수 있게끔 오버라이딩 한 것임.
		
		System.out.println(str1.hashCode()); // 69609650
		System.out.println(str2.hashCode()); // 69609650
//		참조형변수(객체)에서 주소값을 10진수의 형태로 반환해주는 메소드
//		str1과 str2의 주소값이 같게 나옴.
//		이유는 String클래스의 hashcode()메소드의 경우
//		실제 담겨있는 주소값을 10진수 형태로 내보내는 역할은 맞으나,
//		이 역할에서 실제 담겨있는 문자열 기반으로 해시코드를 10진수 형태로 만들어서 내보내게끔 오버라이딩함.
//		즉, 둘다 "Hello"로 문자열이 동등하기 때문에, 같은 주소값이 나옴.
		
//		그렇다면 진짜 주소값의 해시코드를 알고싶다면?
//		System.identityHashCode(참조형변수명)
//		=> 해당 객체의 실제 주소를 해시코드로 출력
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
//	2. 값을 리터럴로써 대입해버리기 => String str = "~";
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
//									  ┌> hello(중복된 내용)
//		Stack				Heap     ─┘
//						   [상수풀]
//		0123	──────────> hello
//		str1				0123
//							 ↑
//		1234	─────────────┘	
//		str2
		
//		String 객체를 만들때, 리터럴을 제시하는 방식으로 객체를 만들면
//		그 내용물이 heap영역에 있는 "상수풀(StringPool)"의 영역에 올라가게 됨.
//		이 영역에서는 중복되는 내용이 있다면, 중복된 내용을 빼는 대신, 같은 주소값을 참조하게 함.
		
		System.out.println(str1 == str2); // true, 주소값 비교
		System.out.println(str1/*toString*/);
		System.out.println(str2/*toString*/);
		System.out.println(str1.equals(str2)); // true, 실제값 비교
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // 실제 내용물(문자열)을 기반으로 10진수화
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));	// 실제 주소값을 반환
	}
	
//	불변클래스
//	=> 기존의 내용물이 변하지 않고, 새로운 주소에 새로운 내용을 추가하고, 참조하는 주소를 바꿈.
	public void method3() {
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		str += "abc";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
//										 ┌> hello(0123), goodbye(1234) => 연결이 끊겨, 언젠가 GC가 지워줌.
//		Stack				Heap		─┘
//						  [상수풀]
//		2345			  goodbyeabc
//		str				  2345	
//						  
		/*
		 * 기존의 상수풀의 연결이 끊긴 문자열들은 GC에 의해 정리됨.
		 * "불변"이라고 해서 수정이 아예 안되는 것이 아니라(이 경우는 "상수"임)
		 * 기존의 그 자리에서 수정되는 개념이 아닌, 매번 새로운 주소값을 참조하는 개념
		 */
	
	}
}
