package com.kh.practice;

import java.util.Scanner;

/*
 * 3글자 이상으로 이루어진 영어단어를 키보드로 입력받아
 * 해당 문자열 값의 앞에서 3개의 문자를 각각 추출하여 출력하시오.
 * Method Name : myString
 * 결과예시
 * 문자열을 입력하세요: Hello
 * 첫번째 문자 : H
 * 두번째 문자 : e
 * 세번째 문자 : l
 */
public class VariablePractice {
	public void myString() {
		// 1. Scanner Class
		Scanner sc = new Scanner(System.in);
		// 2. import문 생성
		// 3. 문자열을 입력하세요
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		// 4. n번째 글자
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		System.out.println("첫번째 글자 : "+ch1);
		System.out.println("두번째 글자 : "+ch2);
		System.out.println("세번째 글자 : "+ch3);
		
		
	}
}
