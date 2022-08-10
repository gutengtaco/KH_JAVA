package com.kh.chap01.practice.example;

import java.util.Scanner;

public class PrintArray {
	/*
	 * 사용자로부터 문자를 입력받아
	 * 그 문자열만큼 반복을 돌려가면서 각 index 번째 문자를 하나씩 추출하여 출력하세요
	 * 
	 * 예시
	 * 실행결과 예시
	 * 문자열을 입력하세요 : apple
	 * 1번째 문자 : a
	 * 2번째 문자 : p
	 * 3번째 문자 : p
	 * 4번째 문자 : l
	 * 5번째 문자 : e
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		for(int i=0; i<str.length();i++) {
			System.out.println((i+1)+"번째 문자 : "+str.charAt(i));
		}
	}
}
