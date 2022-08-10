package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 만일 1 미만의 숫자가 입력됐다면 “잘못 입력하셨습니다.“를 출력하세요.
		 * (for문 이용)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
			if(num>0) {
				for(int i=0; i<num; i++) {
					System.out.print((i+1)+" ");
				}
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
	}
	public void practice2() {
		/*
		 * practice1() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		 * “잘못 입력하셨습니다. 다시 입력해주세요.”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		Scanner sc = new Scanner(System.in);
			for(;;) {
				System.out.println("1이상의 숫자를 입력하세요 : ");
				int num = sc.nextInt();
				sc.nextLine();
					if(num>0) {
						for(int i=0; i<num; i++) {
							System.out.print((i+1)+" ");
						}
						break;
					}else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
						continue;
					}
			}
	}
	public void practice3() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * (for문 이용)
		 */
			Scanner sc = new Scanner(System.in);
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
				if(num >= 1) {
					for(int i=num; i>=1; i--) {
						System.out.print(i+" ");
					}
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
		
	}
	public void practice4() {
		/*
		 * practice3() 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		 * “잘못 입력하셨습니다. 다시 입력해주세요.“가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
				if(num >= 1) {
					for(int i=num; i>=1; i--) {
						System.out.print(i+" ");
					}
					break;
				}else {
					System.out.println("잘못 입력하셨습니다.다시 입력해주세요.");
					continue;
				}
		}
	}
	public void practice5() {
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 : "); // 4라고 가정
		int num = sc.nextInt();
		sc.nextLine();
		int sum = 0;
			if(num>0) { // num = 4
				for(int i=0; i<num; i++) { // i= 0,1,2,3 / num = 4
					sum = sum+(i+1); // sum = 1+2+3+4 
						if((i+1)==num) { // i= 1,2,3,4 / num = 4
							System.out.print((i+1)+ " = ");
							System.out.print(sum);
						}else { 
							System.out.print((i+1)+ " + ");
						}
				}
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
	}
	public void practice6() {
		/*
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.
		 * (for문 이용)
		 * 
		 * 예시
		 * 첫번째 숫자 : 4  
		 * 두번째 숫자 : 8
		 * 4 5 6 7 8 
		 * 
		 * 첫번째 숫자 : 8  
		 * 두번째 숫자 : 4
		 * 4 5 6 7 8 
		 * 
		 * 첫번째 숫자 : 9  
		 * 두번째 숫자 : 0
		 * 1이상의 숫자만을 입력해주세요.
		 */
		Scanner sc = new Scanner(System.in);
			System.out.print("첫번째 숫자 : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			System.out.print("두번째 숫자 : ");
			int num2 = sc.nextInt();
			sc.nextLine();	
				if(num1>=1 && num2>=1){ // 1이상의 숫자를 입력받음
					if(num1 < num2) { // num1=4, num2=8
						for(int i=num1; i<=num2; i++) {
							System.out.print(i+" ");
						}
					}else {
						// num2=4 , num1=8
						for(int i=num2; i<=num1; i++) {
							System.out.print(i+" ");
						}
					}
				}else if(num1 <= 0){ // num1이 0이하의 숫자를 입력받음
					System.out.println("1이상의 숫자만을 입력해주세요.");
				}else if(num2 <= 0) {// num2가 0이하의 숫자를 입력받음.
					System.out.println("1이상의 숫자만을 입력해주세요.");
				}
	}
	public void practice7() {
		/*
		 * 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		 * “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요
		 */
		Scanner sc = new Scanner(System.in);
			
			for(;;) {
				System.out.print("첫번째 숫자 : ");
				int num1 = sc.nextInt();
				sc.nextLine();
				System.out.print("두번째 숫자 : ");
				int num2 = sc.nextInt();
				sc.nextLine();	
					if(num1>=1 && num2>=1){ // 1이상의 숫자를 입력받음
						if(num1 < num2) { // num1=4, num2=8
							for(int i=num1; i<=num2; i++) {
								System.out.print(i+" ");
							}
							break;
						}else {
							// num2=4 , num1=8
							for(int i=num2; i<=num1; i++) {
								System.out.print(i+" ");
							}
							break;
						}
					}else if(num1 <= 0){ // num1이 0이하의 숫자를 입력받음
						System.out.println("1이상의 숫자만을 입력해주세요.");
					}else if(num2 <= 0) {// num2가 0이하의 숫자를 입력받음.
						System.out.println("1이상의 숫자만을 입력해주세요.");
					}
			}

	}
	public void practice8() {
		/*
		 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 * 
		 * (for문 이용)
		 * ex.
		 * 숫자 : 4
		 * ===== 4단 =====
		 * 4 * 1 = 4
		 * 4 * 2 = 8
		 * 4 * 3 = 12
		 * 4 * 4 = 16
		 * 4 * 5 = 20
		 * 4 * 6 = 24
		 * 4 * 7 = 28
		 * 4 * 8 = 32
		 * 4 * 9 = 36
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int gugudan = sc.nextInt();
		sc.nextLine();
		System.out.println("====="+ gugudan+"단 =====");
			for(int i=1; i<10; i++) {
				System.out.printf("%d * %d = %d \n",gugudan,i,(gugudan*i));
			}
	}
	public void practice9() {
		/*
		 * 사용자로부터 입력받은 숫자의 단부터 9단까지 출력하세요.
		 * 
		 * 예시
		 * 숫자 : 4
		 * ===== 4단 =====
		 * ===== 5단 =====
		 * ...
		 * ===== 9단 =====
		 * 
		 * 숫자 : 10
		 * 2~9 사이의 숫자만 입력해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int gugudan = sc.nextInt();
		sc.nextLine();
			if(gugudan>=2 && gugudan<=9) {
				for(int i=gugudan ; i<=9; i++) {
					System.out.printf("===== %d단 =====\n",i);
					for(int j=1; j<=9; j++ ) {
						System.out.printf("%d * %d = %d \n"
								,i,j,(i*j));
					}
				}
			}else{
				System.out.println("2~9사이의 숫자만 입력해주세요.");
			}
	}
	public void practice10() {
		/*
		 * Practice9() 문제와 동일하나, 2~9 사이의 숫자가 아닌 값이 입력됐다면
		 * “2~9 사이의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 */
		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 : ");
			int gugudan = sc.nextInt();
			sc.nextLine();
				if(gugudan>=2 && gugudan<=9) {
					for(int i=gugudan ; i<=9; i++) {
						System.out.printf("===== %d단 =====\n",i);
						for(int j=1; j<=9; j++ ) {
							System.out.printf("%d * %d = %d \n"
									,i,j,(i*j));
						}
					}
					break;
				}else{
					System.out.println("2~9사이의 숫자만 입력해주세요.");
				}
		}
	}
	public void practice11() {
		/*
		 * 사용자로부터 시작 숫자와 공차를 입력 받아
		 * 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요.
		 * 단, 출력되는 숫자는 총 10개입니다.
		 * ‘공차’는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
		 *ex) 2, 7, 12, 17, 22 …
		 *      5  5   5   5 => 여기서 공차는 5
		 *
		 * 시작 숫자 : 4
		 * 공차 : 3
		 * 4 7 10 13 16 19 22 25 28 31

		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("시작  숫자 : ");
		int startNum = sc.nextInt();
		sc.nextLine();
		System.out.print("공차 : ");
		int equaldef = sc.nextInt();
		sc.nextLine();
		// 시작숫자  : 3
		// 공차 : 2
		// 3 5 7 9 11 13 15 17 19 21(3+ 2*9)
		for(int i=0; i<=9; i++) {
			if(i==0) {
				System.out.print(startNum+" ");
			}else {
				startNum = startNum+equaldef;
				System.out.print(startNum+" ");
			}
		}
	}

	public void practice12() {
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
