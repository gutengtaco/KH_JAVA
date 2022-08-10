package com.kh.chap02.loop;

import java.util.Scanner;

public class B_while {
	/*
	 * while문
	 * 반복문의 일종으로 조건식의 결과가 true일 경우에만 반복을 진행
	 * 조건식의 결과가 false인 경우, 반복문을 빠져나옴.
	 * 
	 * [표현법]
	 * [기본]
	 * while(조건식 - true/false){
	 * 	반복적으로 실행할 내용물;
	 * }
	 * 
	 * [응용]
	 * 초기식; : 반복에 필요한 변수를 선언 및 초기화(필수 아님)
	 * while(조건식 - true/false){
	 * 	반복적으로 실행할 내용물;
	 * 	증감식;(필수 아님)  
	 * }
	 * 
	 * [응용2]
	 * while(true){
	 * 반복적으로 실행할 내용물;
	 * }
	 * => 무한반복이 일어남.
	 * 
	 */
	public void method1() {
		
		//for(int i=0; i<5; i++) {
			//안녕하세요
			//안녕하세요
			//안녕하세요
			//안녕하세요
			//안녕하세요
			//System.out.println("안녕하세요.");
		//}
		int i=0; // 초기식
		while(i<5) { //조건식
			System.out.println("안녕하세요");
			i++; // 증감식
		}
		System.out.println("i = "+i);
		// 이 시점에서 i는 5이다.
		
		System.out.println();
		while(i>=1) {
			System.out.println("i = "+--i); 
			//i--;
			
			/*
			 *System.out.println("i = "+(i--));
			 *5,4,3,2,1
			 *System.out.println("i = "+(--i));
			 *4,3,2,1,0
			*/
		}
		System.out.println("i = "+i);
		// 이 시점에서 i는 0이다.
	}
	public void method2() {
//		1에서부터 10까지의 총 합계
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("총 합계 : "+sum);
		
		int i=1;
		int sum=0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("총 합계 : "+sum);
	}
	public void method3() {
//		1에서부터 랜덤값(1~100)까지의 총 합계
//		int random = (int)((Math.random()*100)+1);
//		int sum=0;
//		for(int i=1; i<=random; i++) {
//			sum = sum+i;
//		}
//		System.out.println("i : "+random);
//		System.out.println("랜덤 총합계 : "+sum);

		int i=1;
		int sum=0;
		int random = (int)((Math.random()*100)+1);
		while(i<=random) {
			sum = sum+i;
			i++;
		}
		System.out.println("i : "+i);
		System.out.println("랜덤 총합계 : "+sum);
	}
	public void method4() {
		/*
		 * 아무 문자열이나 입력하세요 : ~~
		 * 문자열을 무한반복하면서 매번 입력받기
		 * 입력받은 문자열이 exit라는 문자열이라면 종료
		 */
		Scanner sc = new Scanner(System.in);
		//for(;;) : 횟수가 있을 때, 쓰기 유리함.
		while(true) { //무한반복을 사용할 때 유리함.
			System.out.print("아무 문자열이나 입력하세요 : ");
			String str = sc.nextLine();
			System.out.println("입력 문자 : "+str);
				if(str.equals("exit")) {
					System.out.println("프로그램을 종료합니다.");
					return;
				}
		}
	}
	/*
	 * do-while문
	 * do로 우선 실행을 하고, while을 통해 조건을 제시한다.
	 * 
	 * [표현법]
	 * 초기식;
	 * do{
	 * 	실행할 코드;
	 * 	증감식;
	 * }while(조건식);
	 * 
	 * 조건식이 true이면? 실행할 코드를 다시 실행.
	 * 조건식이 false이면? 그래도 do문을 실행하고 빠져나온다.
	 * 즉, while문은 조건 검사를 먼저 하고, true여야지만 실행.
	 * do-while문은 일단 실행을 하고 나서, 조건 검사를 하여 true이면 돌아가서 실행
	 * 최초의 while문이 false여도 최소 한번은 실행함.
	 */
	public void method5() {
		int i=0;
//		while(i==1) {
//			System.out.println("하이"); // 내용물이 실행되지 않음.
//		}
		do {
			System.out.println("하이"); // 내용물이 한번은 실행됨.
		}while(i==1);
	}
	public void method6() {
		// 1 2 3 4 5 
		// for문
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// while문
		int i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		int j=1;
		//do-while문
		do {
			System.out.print(j + " ");
			j++;
		}while(j<=5); // j가 6이면 do문을 벗어나서 실행이 종료됨.
	}
}

