package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	/*
	 * 키보드로 문자 하나를 입력받아 
	 * 그 문자와 문자의 유니코드 값을 출력하시오.
	 * 
	 * 예시
	 * 문자 : A
	 * A unicode : 65
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch+" Unicode : "+(int)ch);
	}
	/*
	 * 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아
	 * 총점과 평균을 출력하시오.
	 * 
	 * 예시
	 * 국어 : 90.0
	 * 영어 : 90.0
	 * 수학 : 90.0
	 * 
	 * 총점 : 270
	 * 평균 : 90
	 */
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double korean = sc.nextDouble();
		System.out.print("영어 : ");
		double english = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		System.out.println();
		System.out.println("총점 : "+(int)(korean+english+math));
		System.out.println("평균 : "+(int)((korean+english+math)/3));
	}
	/*
	 * 선언 및 초기화된 5개의 변수를 가지고
	 * 알맞은 사칙연산과 형변환을 이용하여
	 * 주석에 적힌 값과 같은 값이 나오도록 코드를 작성하시오.
	 */
	public void method3(){
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);			// 2
		System.out.println((int)dNum);				// 2
		
		System.out.println((float)(iNum2*dNum));	// 10.0
		System.out.println((float)iNum1);			// 10.0
		
		System.out.println((float)iNum1 /(float)iNum2);	// 2.5
		System.out.println(dNum);						// 2.5
		
		System.out.println((int)fNum);  		// 3
		System.out.println(iNum1 / (int)fNum);	// 3
		
		System.out.println((float)(iNum1/ fNum));			// 3.333333
		System.out.println((double)iNum1 / (double)fNum);	// 3.333333333333335

		System.out.println(ch);					// 'A'
		System.out.println((int)ch);			// 65
		System.out.println((int)(ch + iNum1));	// 75
		System.out.println((char)(ch + iNum1));	// 'K'
		
		
		
		
		
	}
}
