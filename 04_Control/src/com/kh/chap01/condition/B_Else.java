package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/*
	 * if-else문
	 * 두개의 조건으로 경우의 수를 나눌 경우에 사용한다.
	 * [표현법]
	 * if(조건식){
	 * 		조건이 참일 경우 실행할 코드
	 * }else{
	 * 		조건이 거짓일 경우 실행할 코드
	 * }
	 * => 조건식의 결과가 true인 경우, if블럭을 실행
	 * => 조건식의 결과가 false인 경우, else블럭을 실행
	 * => 둘 중 하나만 실행이 된다.
	 * 
	 */
	
	public void method1() {
		// 사용자가 입력한 정수값이 짝수인지, 홀수인지를 판별해서
		// "짝수다", "홀수다"를 출력한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 : ");
		int num = sc.nextInt();
		sc.nextLine();
		if(num % 2 == 0) { // 짝수일 경우
			System.out.println("짝수다");
		}else {	// 짝수가 아닌 경우(홀수일 경우)
			System.out.println("홀수다");
		}
	}
	//중첩 if문 : if영역 안에 또 if문이 있을 경우
	//=> 삼항연산자의 경우와 같다.
	public void method2() {
		// 사용자가 입력한 양수값이 짝수인지, 홀수인지를 판별해서
		// "짝수다", "홀수다"를 출력한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 값 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) { // 양수일 경우
			
			if(num %2==0) {// 짝수일 경우
				System.out.println("짝수다.");
			}else { // 홀수일 경우
				System.out.println("홀수다.");
			}
		}else { // 양수가 아닌 경우
			System.out.println("양수를 입력해야 한다.");
		}
	}
	public void method3() {
		// 사용자로부터 이름을 입력받아
		// 유효한 이름이라면 "본인입니다. 어서오세요."출력
		// 아니라면 "본인이 아닙니다. 돌아가주세요." 출력
		// => 문자열의 동등비교
		// Scanner sc = new Scanner(System.in);
		// System.out.print("사용자의 이름 입력 : ");
		// String name = sc.nextLine();
		// if(name == "홍길동") {
		// 		System.out.println("본인입니다. 어서오세요");
		// }else {
		// 		System.out.println("본인이 아닙니다. 돌아가주세요");
		// }
		/* 
		 * 기본자료형은 동등 비교시, == 또는 != 을 가지고 비교가 가능하다.
		 * (boolean ,char, byte, short, int, long, float, double)
		 * 
		 * 참조자료형인 String은 동등 비교시, == 또는 !=을 가지고 비교가 되지 않는다.
		 * 왜? => 주소값이 비교대상으로 되기 때문이다.
		 * 기본자료형은 Stack영역에 값 및 주소값이 같이 저장되지만
		 * 참조자료형인 String은 Heap영역에 값을, Stack영역에 주소값을 저장하기때문이다.
		 * => 위에서는 0123 -> 홍길동 0123(sc.nextLine())
		 *          1234 -> 홍길동 1234(name == "홍길동")
		 * 
		 * 주소값을 비교하기 위해 equals()를 사용한다.
		 * [표현법]
		 * 비교하고자 하는 문자열.equals(비교자하고자 하는 문자열2)
		 * => 만일, 두 문자열의 내용이 동일하면 true를 반환
		 * 					      동일하지 않다면 false를 반환
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자의 이름 입력 : ");
		String name = sc.nextLine();
		
		if(name.equals("홍길동")) { //"홍길동".equals(name)도 가능
			
			System.out.println("본인입니다. 어서오세요");
		}else {
			
			System.out.println("본인이 아닙니다. 돌아가주세요");
		}
	}
	/*
	 * if -else if문
	 * 동일한 비교대상을 가지고, 여러 개의 조건을 제시해주고자 할 경우 사용한다.
	 * 
	 * [표현법]
	 * if(조건식1) {
	 * 		실행할 코드1;
	 * }
	 * else if(조건식2) {
	 * 		실행할 코드2;
	 * }
	 * else if(조건식3) {
	 * 		실행할 코드3;
	 * }
	 * else{
	 * 		앞의 조건들이 모두 false경우, 실행할 코드4;
	 * }
	 */
	public void method4() {
		// 양수, 0, 음수를 판별하는 코드를 작성한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0 ) { // 양수일 경우
			System.out.println("양수입니다.");
		}else if(num == 0) { //  0일 경우
			System.out.println("0입니다.");
		}else { // 음수일 경우
			System.out.println("음수입니다.");
		}
	}
	public void method5() {
		/*
		 * 사용자로부터 키보드로 점수를 입력받는다.
		 * 90점 이상인 경우 : "A"등급
		 * 80점 이상 ~ 90점 미만 : "B"등급
		 * 70점 이상 ~ 80점 미만 : "C"등급
		 * 70점 미만 : "D"등급
		 * => "당신의 점수는 xx점이고, 등급은 X등급 입니다."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		sc.nextLine();
		char grade = ' ';
		// char자료형의 값은 공백 한칸으로 초기화한다.
		
		// 먼저, 0~100사이인지를 체크
		// if(score < 0 || score > 100) {// 0 ~ 100사이가 아닐 경우
		// else{ // 0~100사이일 경우
		
		if(score>=0 && score<=100) {// 0~ 100사이일 경우
			if(score >= 90) {	// 90~100점
				grade = 'A';
				System.out.println(grade);
			}else if(score >= 80 ) { // 80~89점
				grade = 'B';
				System.out.println(grade);
			}else if(score >= 70 ) { // 70~79점
				grade = 'C';
				System.out.println(grade);
			}else { // 1~69점
				grade = 'D';
				System.out.println(grade);
			}
			// 점수와 등급을 출력하는 출력문을 작성
			System.out.printf("당신의 점수는 %d점이고, 등급은 %c입니다."
					,score,grade);
		}
		else {//0~100사이가 아닐경우
			System.out.println("잘못 입력했습니다.");
		}
		
	}
	public void method6() {
		/*
		 * 나이를 입력받아 어린이, 청소년, 성인을 출력하시오.
		 * 어린이(1~13), 청소년(14~19), 성인(20~)
		 */
		// Scanner class 및 입력문 
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		// Variable 설정
		int age = sc.nextInt();
		sc.nextLine();
		String str = "";
		// if - else if 문
		if(age > 0) { // 양수로 입력한 경우
			if(age > 19) { // 20세 이상
				//System.out.println("성인입니다.");
				str = "성인";
			}else if(age >13) { // 14~19세
				//System.out.println("청소년입니다.");
				str = "청소년";
			}else { // 1~13세
				//System.out.println("어린이입니다.");
				str = "어린이";
			}
			// age와 str의 결과를 출력할 출력문을 작성.
			System.out.printf("당신의 나이는 %d세이며, \"%s\" 입니다.",age,str);
		}else { // 0, 음수로 입력한 경우
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
}
