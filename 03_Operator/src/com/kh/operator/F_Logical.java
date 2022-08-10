package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

	/*
	 * 논리연산자
	 * 두 개의 논리값을 연산하는 연산자.(이항연산자)
	 * [표현법]
	 * 논리값 (논리연산자) 논리값 
	 * =>결과 값이 논리값으로 나온다. 
	 * 
	 * [종류]
	 * && : AND연산자. 둘다 참일때만 True
	 * || : OR연산자. 둘 중 하나만 참이어도 True
	 * 
	 * [경우의 수]
	 * AND
	 * True && True   : 참
	 * True && False  : 거짓
	 * False && True  : 거짓
	 * False && False : 거짓
	 * 
	 * OR
	 * True || True   : 참
	 * True || False  : 참
	 * False || True  : 참
	 * False || False : 거짓
	 */
	
	public void method1() {
		// 비교연산자 + 논리연산자
		// 사용자가 입력한 정수 값이 양수 이면서 짝수인지 확인
		// && : 그리고, ~(이)면서, ~(이)고
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 : ");
		int num = sc.nextInt();
		sc.nextLine();
		boolean result = ((num > 0) && (num % 2 == 0));
		System.out.println("정수값이 양수이면서 짝수인가 ? "+result);
	}
	public void method2() {
		// 사용자가 입력한 정수값이 1 이상 100이하의 수인지 확인하기
		// 1이상 이면서 100이하 ( 1 <= num <= 100)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 : ");
		int num = sc.nextInt();
		sc.nextLine();
		boolean result = ((1 <= num  && num <= 100));
		System.out.println("정수값이 1이상 100이하인가? "+result);
	}
	public void method3() {
		// || : 또는 ,~(이)거나
		// 사용자가 입력한 값이 'y' 이거나(또는) 'Y'인지 확인하기
		Scanner sc = new Scanner(System.in);
		System.out.print("계속하시려면 y 또는 Y를 입력하시오 : ");
		char ch =sc.nextLine().charAt(0);
		boolean result = ((ch == 'y') ||(ch =='Y'));
		System.out.println("사용자가 입력한 값이 y 또는 Y인가? " + result);
	}
	public void method4() {
		/*
		 * && : 둘 다 True여야 True이다
		 * || : 둘 중 하나만 True여도 True이다(둘 다 False여야 False)
		 */
		
		int num1 = 10;
		boolean result1 = false && (num1 > 0); // false
		// dead code(오류가 아닌 필요없는 코드라는 경고의 뜻이다.) : num1 > 0
		// 이미 앞에 false가 떠서 뒤에 무슨 코드이든지 false가 나온다.
		System.out.println("result1 : "+result1);
		
		boolean result2 = true || (num1 > 0); // true
		// 마찬가지로 dead code : num1 > 0
		// 어차피 앞이 true라 뒤가 뭐가 나오든지 true라는 결과가 나온다.
		System.out.println("result2 : "+result2);
		
	}
}
