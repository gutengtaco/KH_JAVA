package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * break문
	 * break문을 만나는 순간
	 * "현재 내 위치로부터 가장 가까운 반복문 한 겹"을
	 * 빠져나가게끔 해주는 구문
	 * 즉, 해당 break문이 속해 있는 반복문 한 겹을 빠져나감.
	 * 
	 * [표현법]
	 * break;
	 * 
	 * [주의할점]
	 * 분기문에서의 break와 switch문에서의 break는 다른 개념임.
	 * switch에서의 break문은 단순히 해당 switch영역을 빠져나가는 용도일 뿐.
	 * 반복문에서의 break문은 break문의 위치에서 한겹을 빠져나가는 것임.
	 * 
	 */
	public void method1() {
		
		// 매번 반복적으로 새로이 발생되는 랜덤값(1~100)출력
		// 단, 랜덤값이 홀수일 경우에는 반복문을 빠져나가게끔.
		int i=0;
		int random=0;
		while(true) {
			random = (int)((Math.random()*100)+1);
			if(random%2==1) { // 홀수 판별
				// return;	
				// 이 구문이 실행된 시점으로 본다면, 이미 반복을 통해 판별을 끝냈을 것.
				// 즉, 홀수가 나오면 프로그램이 종료되기에, 결과는 짝수만 나옴.
				break;
				// 마찬가지로 홀수가 나오면 프로그램이 종료되기에, 결과는 짝수만 나옴.
				
				/*
				 * return과 break의 차이점
				 * break의 경우, 해당 while문을 한겹 빠져나가 "끝났습니다."가 출력됨.
				 * return의 경우, a.method1();로 다시 가기 때문에
				 * 무한반복의 while문을 벗어나지 못하여 "끝났습니다."에 도달하지 못함.
				 * [오류메세지]
				 * Unreachable code
				 */
			}
			System.out.println("랜덤 : "+random); // 홀수 이외의 값을 출력
		}
		// while문의 반복이 끝났을 시점.
		System.out.println("끝났습니다."); // return일시, 도달하지 못함.
	}
	public void method2() {
		/*
		 * 아무 문자열이나 입력하세요. : 
		 */
		// 문자열을 무한으로 반복하면서 매번 입력받기
		// 그 문자열의 길이를 출력하고
		// 만약, 입력받은 문자열이 "exit"라는 문자열이라면 종료
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("아무 문자열이나 입력하세요 : ");
			String str = sc.nextLine();
			if(str.equals("exit")) { // 문자열이 exit인 경우
				// return;
				break;
			}else {	// 문자열이 exit가 아닌 경우
				// 문자열.length()
				// .length()의 결과는 정수형으로 나옴.
				System.out.println("\""+str+"\"" + " 의 길이 : "+str.length());
			}
		}
		// return시, Unreachable Code
		// break가 없을시, Unreachable Code
		// break시, while문을 빠져나와 아래의 코드를 출력.
		
		System.out.println("프로그램을 종료합니다.");
	}
	public void method3() {
		
		// 매번 반복적으로 사용자에게 양수를 입력받아
		// 1 ~ 입력값까지 출력
		// 정상적으로 양수를 입력했을 경우, 결과를 출력 후 무한반복을 빠져나옴.
		// 아닐 경우, 다시 입력하라는 문구를 출력.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("양수 입력 : ");
			int num = sc.nextInt();
			if(num>0) { // 양수일 경우
				for(int i=1; i<=num; i++) {
					System.out.print(i+" ");
				}
				break; // while문을 빠져나감.
			}else { // 양수가 아닐 경우
				System.out.println("다시 입력해주세요.");
			}
			System.out.println();
		}
	}

}
