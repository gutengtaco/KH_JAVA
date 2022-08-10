package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	/*
	 * 이름(String), 성별(char), 나이(int), 키(double)를 사용자에게 입력 받아 
	 * 각각의 값을 변수에 담고 출력하세요.
	 *
	 * 예시
	 * 이름을 입력하세요 : 아무개
	 * 나이를 입력하세요 : 20
	 * 성별을 입력하세요(남/여) : 남
	 * 키를 입력하세요(cm) : 180.5
	 * 
	 * 키 180.5인 20살 남자 아무개님 반갑습니다^^
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별을 입력하시오(남/여) : ");
		char str = sc.nextLine().charAt(0);
//		String str = gender+"자";
		String gender = (str=='남')? "남자"
				:(str=='여')? "여자":"X";
		System.out.print("키를 입력하시오 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.printf("키 %.1f인 %d살 %s %s님 반갑습니다^^"
				,height,age,gender,name);
		
	}
	/*
	 * 키보드로 정수 두개를 입력받아
	 * 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요
	 * 
	 * 예시
	 * 첫번째 정수를 입력하시오 : 23
	 * 두번째 정수를 입력하시오 : 7
	 * 더하기 결과 : 30
	 * 빼기 결과 : 16
	 * 곱하기 결과 : 161
	 * 나누기 몫 결과 : 3
	 */
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오 : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력하시오 : ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("더하기 결과 : "+(a+b));
		System.out.println("빼기 결과 : "+(a-b));
		System.out.println("곱하기 결과 : "+(a*b));
		System.out.println("나누기 몫 결과 : "+(a/b));
	}
	
	/*
	 * 키보드로 가로, 세로값을 실수형으로 입력받아
	 * 사각형의 면적과 둘레를 계산하여 출력하시오.
	 * [참고]
	 * 사각형의 면적 = 가로 * 세로
	 * 사각형의 둘레 = (가로 * 2) + (세로 * 2)
	 * 
	 * 예시
	 * 가로 : 13.5
	 * 세로 : 41.7
	 * 면적 : 562.95
	 * 둘레 : 110.4
	 */
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double horizon = sc.nextDouble();
		sc.nextLine();
		System.out.print("세로 : ");
		double vertical = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.println("면적 : " +(horizon * vertical));
		System.out.println("둘레 : " +((horizon*2) + (vertical*2)));
	}
	/*
	 * 영어 문자열 값을 키보드로 입력받아
	 * 앞의 문자 세 개를 출력하세요.
	 * 
	 * 예시
	 * 문자열을 입력하세요 : apple
	 * 첫번째 문자 : a
	 * 두번째 문자 : p
	 * 세번째 문자 : p
	 */
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		System.out.println();
		System.out.println("첫번째 문자 : "+str.charAt(0));
		System.out.println("두번째 문자 : "+str.charAt(1));
		System.out.println("세번째 문자 : "+str.charAt(2));
	}
}
