package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	public void method1() {
		
		String str = "Java,Oracle,JDBC,HTML,Server,Spring";
		
//		구분자를 제시해서 해당 문자열을 단어 단위로 분리
//		방법1. 분리된 문자열들을 String배열에 차곡차곡 담아서 관리
		String[] arr = str.split(",");
//		split이라는 문자열을 쪼개주는 메소드를 활용(String 클래스)
//		[표현법] 문자열.split(String구분자) : String[]
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
//		배열의 경우, for문을 다음과 같이 쓸 수 있음(향상된 for문, for each문)
//		[표현법]
//		for(값을 담아줄 변수 선언문 : 순차적으로 접근하고 싶은 배열명 또는 컬렉션명) { 반복적으로 실행할 코드 } 
		for(String s : arr) {	// 주의사항 : 해당 배열의 타입에 맞게 변수선언문을 작성해야 함!!
//			arr[0] = s => system.out.print(s) : Java
//			arr[1] = s => system.out.print(s) : Oracle
//			arr[2] = s => system.out.print(s) : JDBC
//			...
//			arr[5] = s => system.out.print(s) : Spring
			
//			내부적으로 s라는 문자열 타입의 변수에 arr[i] 방에 들은 값이 순차적으로 담기면서, 코드를 실행함.
//			값을 이미 뽑아서 변수에 담아 제공되는 형식이라, 배열에 들은 값을 변경하는 용도로는 불가능
//			단지, 배열의 값을 출력해주는 용도로만 사용함.
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
//		방법2. 분리된 각각의 문자열들을 "토큰"이라는 단위로 취급하는 방법
//		여기서 토큰이란? 단어의 한 뭉텅이를 말하는 것임.
//		StringTokenizer 클래스를 활용함.(java.util.StringTokenizer)
//		[표현법]
//		StringTokenizer 객체명 = new StringTokenizer(분리시키고자 하는 문자열, 구분자);
		StringTokenizer stn = new StringTokenizer(str, ",");
		
//		countTokens();
//		분리되어 존재하는 문자열의 뭉탱이 개수를 반환해줌.
		System.out.print("분리된 문자열의 개수 : "+stn.countTokens() + "개"); // 6개
		
//		nextToken();
//		Java, Oracle, JDBC, HTML, Server, Spring
//		쪼개진 단어를 순차적으로 반환해줌.
//		System.out.println();
//		System.out.println(stn.nextToken());	// Java
//		System.out.println(stn.nextToken()); 	// Oracle
//		System.out.println(stn.nextToken());	// JDBC
//		System.out.println(stn.nextToken());	// HTML
//		System.out.println(stn.nextToken());	// Server
//		System.out.println(stn.nextToken());	// Spring
//		System.out.println(stn.nextToken());
//		[오류메세지]
//		java.util.NoSuchElementException
//		현재 남아있는 객체로부터, 토큰 개수의 범위를 벗어나면 발생하는 오류임.
		System.out.println();
		System.out.println("현재 담겨있는 토큰의 개수 : "+stn.countTokens() + "개"); // 0개
//		nextToken으로 뽑아내면, 현재의 토큰 개수가 감소함
		
//		토큰이 출력될수록 countTokens()의 결과값이 -1씩 되서,
//		미리 변수에 담아놓고, 이를 조건식에 사용하여 반복을 시작해야 함.
//		int end = stn.countTokens();
//		for(int i=0; i<end; i++) {
//			System.out.print(stn.nextToken()+" ");
//		}
		
//		더이상 뽑아낼 토큰이 있나?라는 조건을 제시하면 while문 사용 가능
//		StingTokenizer클래스에서 제공하는 hasMoreTokens()메소드를 사용
//		=> StringTokenizer 객체로부터 뽑아낼 토큰이 있는 경우에 true를 반환
		while(stn.hasMoreTokens()) {	// true면 출력문을
			System.out.print(stn.nextToken()+" ");
		} 	// false면 벗어남.
		
	}
}
