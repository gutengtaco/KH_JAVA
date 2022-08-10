package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 * Checked Exception : 반드시 예외처리를 해줘야 하는 예외들
	 * (예측 불가능한 상황에서 발생, 미리 예외처리 구문을 작성함)
	 * => 주로 외부매체와 입출력시 발생.
	 */
	
	public void method1() throws IOException{
		/*
		try {
			
		method2();
		
		}catch(IOException e) {
			
			System.out.println("예외 발생됨");
			
		}
		*/
		method2();
	}
//						  CheckedException이 발생할 상황을 해결하기 위한
//						  throws구문 추가.
	public void method2() throws IOException {
//		Scanner sc = new Scanner(System.in);
		
//		Checked Exception 상황을 연출하기 위해
//		Scanner와 같이 키보드로 값을 입력받을 수 있는 객체를 하나 생성
//		BufferedReader 클래스로부터 객체 생성(단, 문자열로만 입력이 가능함)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무 문자열이나 입력하시오 : ");
//		String str = br.readLine(); // 한줄 단위로 사용자가 입력한 문자열을 입력받겠다.
//		[오류메세지]
//		Unhandled exception type IOException
//		이 메소드를 호출했을 때, IOException이 발생할 수도 있음을 컴파일 에러로 알려준 것(빨간 밑줄)
//		=>Checked Exception이라 무조건 예외처리 구문을 써주어야 함.
		/*
//		1. try ~ catch문 : 이 영역에서 당장 예외를 처리하겠다 라는 개념
		try {
			
			String str = br.readLine(); // sc.nextLine()과 쓰임새가 같음
			System.out.println("문자열의 길이 : "+str.length());
			
		}catch(IOException e){
			
//			예외가 언제 발생할 지 모름.
			
			System.out.println("예외 발생함.");
			
		}
		*/
		
//		2. throws 구문을 이용하기
//		throws : 여기서 예외를 처리하는 것이 아닌, 메소드를 호출한 곳에서 처리하게끔 떠넘김.
//		=> Checked, UnChecked 둘다 사용할 수 있음.
//		=> 즉, 나를 호출한 곳에서 try ~ catch문을 쓰겠다.
//		=> readLine()메소드 자체에도 throws IOException이 선언되어 있음.
		String str = br.readLine();
		System.out.println("문자열의 길이 : "+str.length());
	}
	
	/*
	 * Runtime Exception(UnChecked) : 예외 발생 시점(해당 코드가 실행되다가 오류나면 => 예외처리가 필수가 아닌 런타임 에러
	 * Checked Exception : 예외 발생 시점(언젠가 실행되다가 => 반드시 예외처리를 해줘야하기 때문에 육안상 컴파일 에러로 보임)
	 */
	
}
