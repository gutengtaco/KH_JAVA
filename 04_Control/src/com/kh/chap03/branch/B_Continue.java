package com.kh.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	/*
	 * continue문
	 * 반복문 안에서 사용하는 구문
	 * continue를 만나게 되면, 그 뒤에 어떤 구문이 있더라도 실행하지 않고
	 * 가장 가까운 반복문으로 올라감.
	 */
	public void method1() {
		// 1에서부터 10까지 숫자 중 홀수만 출력
		// 1 3 5 7 9
		// 1. 증감식을 2씩 증가하여 출력
		for(int i=1; i<=10; i+=2) {	// 5회 반복
			System.out.print(i+" ");
		}
		System.out.println();
		// 2. 조건문에 %을 사용하여 출력
		for(int i=1; i<=10; i++) {	// 10회 반복
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		// 3. 반복문 안에서 continue 이용
		for(int i=1; i<=10; i++) {
			
			// i가 짝수일 경우를 판별해냄
			if(i%2==0) {
				continue;	// 짝수이면, continue를 통해 다시 반복문으로 돌아감
			}
			// i가 홀수일 경우, 출력
			System.out.print(i+" ");
		}
	}
	public void method2() {
		// 1부터 100까지의 총 합계
		// 단, 6의 배수는 빼고 계산
		int sum=0;
		for(int i=1; i<=100 ; i++) {
			if(i%6==0) { // 6의 배수를 판별
				continue;	// 해당 증감을 수행하지 않고, 다음 i++로 이동.
							// i=5 => i=6(continue, 수행x) => i=7
			}
			sum=sum+i;
			System.out.println(i+" ");
		}
		System.out.print("6의 배수를 제외한 1~100의 합 : "+sum);
	}
	/*
	 * continue가 for문 안에 있을 경우 => 증감식으로 이동한다.
	 * continue가 while문 안에 있을 경우 => 조건식으로 이동한다.
	 */
	public void method3() {
		// 2단 ~ 9단 까지 출력하긴 하되
		// 4의 배수단만 건너뛰고 출력하시오.
		for(int i=2; i<=9; i++) { // 바깥쪽 for문 : 단수
			System.out.println("====="+i+"단 =====");
//			1. 4단,8단을 건너뛰기
//			if(i==4 || i==8) {
//				continue;	// i가 4인경우, 이를 실행하지 않고 i++로 이동.
//							// 4단은 출력되지 않고 5단으로 넘어감.
//			}
//			2. 4의 배수를 건너뛰기
			for(int j=1; j<=9; j++) { // 안쪽 for문 : 곱하기 1~9
				 if(i%4==0){
				 		continue;
				 }
				System.out.printf("%d * %d = %d \n",i,j,(i*j));
			}
		}
		System.out.println("구구단 종료");
	}
	// 반복문 실습문제 12번 - 계산기 만들기 + exit입력시 빠져나가기
	public void method4() {
		/*
		 * 정수 2개와 연산자를 입력받아
		 * 단, 나눗셈 몫(나머지)일 경우, 0으로 나누려고 할때
		 * "다시 입력해주세요"
		 * 없는 연산자의 경우
		 * "없는 연산자입니다. 다시 입력해주세요"
		 * exit를 입력시
		 * "프로그램을 종료합니다"를 출력 후 빠져나감.
		 * 
		 */
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.print("연산자(+,-,*,/,%) : "  );
			String operator = sc.nextLine();

			
			// exit입력 시 탈출
			if(operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			// 숫자를 입력받기 전에 "없는 연산자~" 문구를 미리 띄울 수 있음!
			if(operator.equals("+")||
			   operator.equals("-")||
			   operator.equals("*")||
			   operator.equals("/")||
			   operator.equals("%")){ // 일치하는 연산자인지 확인함.
				
				System.out.print("정수1 입력 : ");
				int num1 = sc.nextInt();
				sc.nextLine();
				System.out.print("정수2 입력 : ");
				int num2 = sc.nextInt();
				sc.nextLine();
				
				switch(operator) {
				case "+" : System.out.println(num1 + " + " +num2 + " = " + (num1+num2));break;
				case "-" : System.out.println(num1 + " - " +num2 + " = " + (num1-num2));break;
				case "*" : System.out.println(num1 + " * " +num2 + " = " + (num1*num2));break;
				case "/" : 
					if(num2==0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
						continue;	// 가장 가까운 반복문인 while문으로 돌아감.(올라감)
					}else {
						System.out.println(num1 + "/" +num2 + " = " + (num1/num2));
						break;	// while문을 빠져나감.(내려감)
					}
				case "%" : 
					if(num2==0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
						continue;
					}else {
						System.out.println(num1 + "%" +num2 + " = " + (num1%num2));
						break;
					}
				}
			}else { // 일치하지 않는 연산자.
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
			}
					
			
		}
		
	}

}
