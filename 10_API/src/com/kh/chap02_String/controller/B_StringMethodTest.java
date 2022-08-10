package com.kh.chap02_String.controller;

import java.util.Arrays;
import java.util.Scanner;

public class B_StringMethodTest {
	public void method() {
		String str1 = "Hell world";
		
//		메소드명(매개변수) : 반환형
		
//		1. 문자열.charAt(int index) : char
//		=> 문자열로부터 전달받은 index 위치의 문자 하나만을 추출해주는 메소드
		char ch = str1.charAt(3);
		System.out.println("ch : "+ch);	// l
		
//		2. 문자열.concat(String str) : str
//		=> 문자열과 전달된 또 다른 문자열을 하나로 합쳐서 반환해줌.
//		=> 문자열 = 문자열 + str과 같은 역할
//		=> 단, 두 뭉텅이로만 묶을 수 있음.
		String str2 = "!!!";
		System.out.println(str1.concat(str2));
		System.out.println(str1 + str2);
		
//		3. 문자열.length() : int
//		=> 현재 문자열의 길이를 반환해줌.
		System.out.println("str1의 길이 : "+str1.length()); // 10(띄어쓰기 포함)
		
//		4-1. 문자열.substring(int 시작index) : String
//		=> 문자열의 시작index위치에서부터 끝까지의 부분문자열을 추출하여 반환해주는 메소드임.
		System.out.println("Str1의 부분문자열 : "+str1.substring(6)); // orld
		
//		4-2. 문자열.substring(int 시작index, int 끝index) : String  => 오버로딩
//		=> 문자열의 시작index위치에서부터 끝 index의 위치의 부분문자열을 추출하여 반환해주는 메소드임.
		System.out.println("str1의 부분문자열 : "+str1.substring(0,6)); // Hell w (0 <= 인덱스 범위 < 6)
		
//		5. 문자열.replace(char old, char new) : String
//		=> old에 해당하는 문자열을 new로 변환시켜서, 해당 문자열을 반환시켜주는 메소드
		String str3 = str1.replace('l', 'c');
		System.out.println("str3 : "+str3);
		
//		6. 문자열.trim() : String
//		=> 문자열에서의 앞뒤 공백을 제거한 문자열을 반환해주는 메소드
		String str4 = "    JA VA    ";
		System.out.println("str4.trim()적용 : " + str4.trim()); // JA VA
//		QUIZ) 중간의 공백을 없애고 싶다면?
		System.out.println((str4).replace(" ", ""));
		
//		7-1. 문자열.toUpperCase() : String
//		=> 해당 문자열을 모두 대문자로 변경 후, 그 문자열을 반환시켜줌.
		System.out.println("대문자 : " + str1.toUpperCase());
//		7-2. 문자열.toLowerCase() : String
//		=> 해당 문자열을 모두 소문자로 변경 후, 그 문자열을 반환시켜줌.
		System.out.println("소문자 : " + str1.toLowerCase());
		
		/*
		 * 사용자로부터
		 * 종료를 원하면 Y를 입력하시오. 라고 유도
		 */
		System.out.println("---------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("종료하시겠습니까? (Y,N) : ");
		
//		첫번째 방법
		char answer1 = sc.nextLine().charAt(0); // 'y' / 'Y'
			if(answer1 == 'y' || answer1 =='Y') {
				System.out.println("시스템을 종료합니다.");
			}else {
				System.out.println("시스템을 종료하지 않습니다.");
			}
		
		
//		두번째 방법
		char answer2 = sc.nextLine().toUpperCase().charAt(0);
//		직접접근연산자(.)로 우선순위가 모두 같기 때문에 왼쪽에서부터 실행됨.
//		사용자입력 => 대문자 => 문자추출(메소드 Chaining)
		if(answer2 =='Y') {
			System.out.println("시스템을 종료합니다.");
		}else {
			System.out.println("시스템을 종료하지 않습니다.");
		}
		
		System.out.println("---------------------------------------------------");
//		문자열 => char[]
//		str1문자열 기준으로 문자열 하나하나를 추출해서 문자 배열에 담겠다.
		char[] arr = new char[str1.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = str1.charAt(i);	
		}
		System.out.println(Arrays.toString(arr));
		
//		8. 문자열.toCharArray() : char[]
//		=> 문자열의 각 문자들을 char배열에 옮겨담아
//		=> 그 배열 자체를 반환해주는 메소드
		char[] arr2 = str1.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
//		char[] => 문자열
		char[] arr3 = {'a','p','p','l','e'};
		String result = "";
		for(int i=0; i<arr3.length; i++) {
			result = result+arr3[i];	// 문자열형 + 다른자료형 = 문자열형
		}
		System.out.println("result : "+ result);
		
//		9. static valueOf(char[] data) : String
//		=> 전달된 char배열에 담긴 문자들을 하나의 문자열로 연이어서 반환해주는 메소드
		System.out.println("메소드 사용 후 : "+String.valueOf(arr3));
		
	}
}
