package com.kh.practice;

import java.util.Scanner;

public class KeyboardInputPractice {
	/*
	 * 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	 * 결과 예시
	 * 첫 번째 정수 : 5
	 * 두 번째 정수 : 7
	 * 더하기 결과 : 12
	 * 빼기 결과 : -2
	 * 곱하기 결과 : 35
	 * 나누기 결과 : 0
	 */
	public void myCalculator() {
		// 1. Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("결과 예시");
		// 2. nextInt, nextLine 사용
		System.out.print("첫번째 정수 : ");
		int first = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수 : ");
		int second = sc.nextInt();
		sc.nextLine();
		// 3. 결과 출력
		System.out.println("더하기 결과 : "+(first+second));
		System.out.println("빼기 결과 : "+(first-second));
		System.out.println("곱하기 결과 : "+(first*second));
		System.out.println("나누기 결과 : "+(first/second));
	}
	
}
