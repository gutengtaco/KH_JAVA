package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 단독 if문
	 * 조건을 단독적으로 한개만 제시할 경우
	 * [표현법]
	 * if(조건식){
	 *  해당 조건식의 결과가 true일 경우에 실행할 코드	
	 *  }
	 *  => 조건식의 결과가 true일 경우, 중괄호 블럭 안에 있는 코드가 실행된다.
	 *  => 조건식의 결과가 false일 경우, 중괄호 블럭 안의 코드를 무시하고 넘어간다.
	 *  
	 *  
	 */
	public void method1() {
		
		// 단독 if문
		// 사용자로부터 정수값을 입력받은 후,
		// "양수이다","0이다","음수이다"
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 : ");
		int num = sc.nextInt();
		sc.nextLine();
		// String result = (num > 0)? "양수이다" : 
		//	(num==0)? "0이다" : "음수이다";
		// 1. 양수일 경우
		if(num > 0) {
			System.out.println("양수이다.");
		}
		// 2. 0일 경우
		if(num == 0) {
			System.out.println("0이다.");
		}
		// 3. 음수일 경우
		if(num < 0) {
			System.out.println("음수이다.");
		}
	}
	public void method2() {
		
		// 단독if문 2
		// 사용자가 입력한 정수값이 짝수인지, 홀수인지를 판별해서
		// "짝수다", "홀수다"를 출력한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 : ");
		int num = sc.nextInt();
		sc.nextLine();
		if((num % 2 == 0)) {
			System.out.println("짝수다");
		}
		if((num % 2 == 1)){
			System.out.println("홀수다");
		}
	}
	//실습문제
	public void method3() {
		/* 사용자가 나이를 입력한 후, 
		 * 13세 이하면 "어린이입니다"
		 * 13세 초과 ~ 19세 이하면 "청소년입니다"
		 * 19세 초과 ~ "성인입니다"
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int num = sc.nextInt();
		sc.nextLine();
//		1. 삼항연산자
//		(13세 이하)? 어린이 : (19세 이하)? 청소년 : 성인; 
//		String age1 = (num<=13)? "어린이입니다" : 
//			(num<=19)? "청소년입니다":"성인입니다";
//		System.out.printf("%s",age1);
//		System.out.println();
		
		//2. 단독 if문
		if(num <=13) { // 13세 이하 : 어린이
			System.out.println("어린이입니다");
		}
		if(num >=14 && num <=19) { //14세 ~ 19세 : 청소년
			System.out.println("청소년입니다");
		}
		if(num >= 20) { //20세 이상 : 성인
			System.out.println("성인입니다");
		}
	}
	public void method4() {
		// 사용자에게 입력받은 주민등록번호를 가지고
		// 남자,여자 인지 판별 후 "남자입니다","여자입니다" 출력
		
		// 1. 사용자에게 주민등록번호 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력(-포함): ");
		// 주민번호 : 생년월일6글자 + '-' + 성별1글자 + 6자리 숫자
		String personId = sc.nextLine();
		// 성별에 해당하는 인덱스 추출
		char gender = personId.charAt(7);
		// 문자로 된 Variable을 이용하여 일치 여부 판별
		if((gender=='1') || (gender=='3')) {
			System.out.println("남자입니다");
		}
		if((gender=='2') || (gender=='4')) {
			System.out.println("여자입니다.");
		}
		// 이외의 숫자를 입력한 경우
		if((gender != '1')&&(gender != '2')&&
				(gender != '3')&&(gender != '4')) {
			System.out.println("잘못된 주민번호 입니다.");
		}
		
	}
}
