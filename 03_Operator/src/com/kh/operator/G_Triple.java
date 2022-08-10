package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항연산자
	 * 세 개의 항목(피연산자)를 가지고 연산하는 연산자
	 * 
	 * [표현법]
	 * 조건식? 조건식의 결과가 true일 경우의 결과값 : 조건식의 결과가 false일 경우의 결과값
	 * => 단, 조건식의 결과는 true 또는 false만 나온다.
	 * (조건식 : 조건을 판별하는 식.결과가 true 또는 false로 나오는 식)
	 * 논리부정연산자, 비교연산자, 논리연산자가 조건식으로 쓰일 수 있다.
	 */
	public void method1() {
		
		// 사용자가 입력한 정수값이 양수인지 아닌지 판별 후, 결과를 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String result = (num > 0)? "양수입니다." : "양수가 아닙니다.";
		// 결과 값이 String이 나오기 때문에 Variable을 String으로 하였다.
		System.out.println(num+"은 "+result );
	}
	public void method2() {
		// 사용자가 입력한 정수값이 짝수인지 홀수인지를 판별 후, 결과를 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 : ");
		int num = sc.nextInt();
		sc.nextLine();
		// 짝수일 경우
		// String result = (num % 2 == 0)? "짝수입니다." : "홀수입니다.";
        // 홀수일 경우
		String result = (num % 2 == 1)? "홀수입니다." : "짝수입니다.";
		System.out.printf("%d은  %s", num , result);
	}
	public void method3() {
		// 사용자로부터 영문자 하나를 입력받아 대문자인지 아닌지 판별 후 출력하기
		// => 아스키코드 'A' = 65, 'a' = 97
		//자동형변환이라 (int)안써줘도 된다.
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자 : ");
		char ch = sc.nextLine().charAt(0);
		//String result = (65 <= (int)ch && (int)ch <=90 )? 
		//"대문자입니다" : "대문자가 아닙니다."; 
		String result = (('A'<=ch) && (ch <='Z'))? 
		"대문자입니다." : "대문자가 아닙니다.";
		System.out.printf("%c은 %s",ch,result);
	}
	public void method4() {
		/*
		 * 기존의 method1의 내용을 보완한다.
		 * 사용자가 입력한 정수 값이 (음수, 0, 양수)인지를 판별한 후
		 * 결과를 출력해보겠다.
		 */
		
		Scanner sc =new Scanner(System.in);
		System.out.print("정수 값 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String result = (num > 0)? "양수입니다" 
				: (num == 0)? "0입니다" : "음수입니다.";
		System.out.printf("%s",result);
	}
}
