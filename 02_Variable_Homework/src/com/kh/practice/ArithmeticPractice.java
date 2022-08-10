package com.kh.practice;

import java.util.Scanner;

public class ArithmeticPractice {
	/*
	 * 인원 수와 사탕 갯수를 키보드로 입력 받고
	 * 1인당 동일하게 나눠가진 사탕 개수와 
	 * 나눠주고 남은 사탕의 개수를 출력하세요.
	 * ----------------------------
	 * 결과 예시
	 * 인원 수 : 5
	 * 사탕 갯수 : 164
	 * 1인당 나눠줄 사탕 갯수 : 32
	 * 남는 사탕 갯수 : 4
	 */
	
	public void devideCandy() {
		// 1. Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("결과 예시");
		// 2. nextInt, nextLine 사용
		System.out.print("인원 수 : ");
		int count = sc.nextInt();
		sc.nextLine();
		System.out.print("사탕갯수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		// 3. 결과 출력
		System.out.println("1인당 나눠줄 사탕 개수 : "+(num/count));
		System.out.print("남는 사탕 개수 : "+(num%count));
		
	}
}
