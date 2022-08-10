package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * for문
	 * 코드를 반복시켜주는 구문 중 하나이다.
	 * 단, 내가 반복할 횟수를 알고 있을 때 사용한다.
	 * 괄호 안에 반복을 지정하는 부분이 (초기식;조건식;증감식)으로 이루어져 있다.
	 * 
	 * [표현법]
	 * for(초기식;조건식;증감식){
	 * 		반복시키고자 하는 코드;
	 * }
	 * => 소괄호 : 몇번 반복을 할지를 지정한다.
	 * => 중괄호 : 무엇을 반복하여 출력할지를 지정한다.
	 * 
	 * 초기식 : 반복문이 실행될 때, "초기에 단 한번만 실행되는 구문"이다.
	 *        (반복문 안에서 사용할 Variable을 선언 및 초기화한다.)
	 * 조건식 : 반복문이 실행될 때, "해당 반복이 수행될 조건"을 지정한다.
	 * 		  (초기식에서 지정한 Variable을 가지고 조건을 지정한다)
	 * 		  => 조건식의 결과가 true : 반복을 진행한다. 
	 *        => 조건식의 결과가 false : 반복을 종료 후 반복문을 빠져나온다.
	 * 증감식 : 반복문을 제어하는 Variable값을 증감시킨다.
	 * 		  (초기식에서 지정한 Variable을 가지고 증감을 한다)
	 * 
	 * [실행 순서]
	 * 초기식  -> 조건식(true) ->코드 -> 증감식 
	 *      -> 조건식(true) ->코드 -> 증감식 
	 *      -> 조건식(true) ->코드 -> 증감식 
	 *      ...
	 *      -> 조건식 (false) ->코드를 실행하지 않고, 반복문 종료 후 빠져나옴.
	 * 
	 */
	public void method1() {
		// for문을 사용하는 이유
		// 1. 반복적인 구문을 작성할 때, 실수를 줄이기 위해서
		// 2. 반복이 늘어나면 번거롭기 때문에
		
		// "안녕하세요"를 5번 연속으로 출력하기
		// System.out.println("안녕하세요");
		// System.out.println("안녕하세요");
		// System.out.println("안녕하세요");
		// System.out.println("안녕하세요");
		// System.out.println("안녕하세요");
		
		// 반복 횟수는 같아도 초기식, 조건식, 증감식이 다를 수 있다.
		// i=1 ; i<=5
		for(int i=1; i<=5; i++) {// 초기식 : Variable을 선언 후 초기화해줌.
								// 조건식 : 증감시킬 횟수를 지정해줌.
								// 증감식 : 증감연산자를 이용하여 지정해줌.
								// 		    후위증감연산자를 사용해준다.
			System.out.println("안녕하세요.");
			// i = 1(true) : "안녕하세요" => i=2
			// i = 2(true) : "안녕하세요" => i=3
			// i = 3(true) : "안녕하세요" => i=4
			// i = 4(true) : "안녕하세요" => i=5
			// i = 5(true) : "안녕하세요" => i=6
			// i = 6(false) => 반복문 종료
		}

		System.out.println();
		// i=1, i<6
		for(int i=1; i<6; i++) {
			System.out.println("반갑습니다.");
		}
		
		System.out.println();
		// 반복의 시작값이 1일 필요는 없다.
		// i값이 11에서부터 16보다 작을때 까지 1씩 증가할 동안 반복
		// i=11,12,13,14,15(true) / 16(false)
		for(int i=11; i<16; i++) {
			System.out.println("어서오세요");
		}
		
		System.out.println();
		// 증감식에서 증가할 값이 1일 필요는 없다.
		// i가 1부터 10까지 매번 2씩 증가할동안 반복
		// i=1,3,5,7,9(true) /11(false)
		for(int i=1;i<=10; i+=2) {
			System.out.println("저리가세요");
		}
		
		System.out.println();
		// 증감식에서 감소도 가능하다.
		// i가 10에서부터 6보다 크거나 같을때까지 감소할동안 반복
		// i = 10,9,8,7,6(true) / 5(false)
		for(int i=10; i>=6; i-=1) {
			System.out.println("하이");
		}
	}
	public void method2() {
		
		// 제일 단순하게 반복되는 횟수를 지정하는 표현법
		// 초기식; 조건식; 증감식
		// (int i=0; i<반복시키고자하는 횟수; i++)
		//System.out.println("고정된 문자열");
		int j = 0;
		for(int i=0; i<10; i++) {
			
			// 고정된 문자열말고 매번 달라지는 출력 결과를 보고싶다.
			// i : 0
			// i : 1
			// i : 2 ...
			//System.out.println("i : "+i);
			
			// 0번째 출력문
			// 1번째 출력문
			// 2번째 출력문 ...
			//System.out.println(i+"번째 출력문");
			
			// 1번째 출력문
			// 2번째 출력문
			// 3번째 출력문 ...
			// int j = i+1;
			// System.out.println(j+"번째 출력문");
			
			// 1번째 출력문
			// 2번째 출력문
			// 2번째 출력문
			// 3번째 출력문...
			// 특정 출력문만 반복하고 싶을때
			System.out.println((i+1)+"번째 출력문");
			if(i==1) {
				j=i+1;
				System.out.println(j+"번째 출력문");
			}else {
			}
		}
	}
	
	public void method3() {
		
		for(int i=0; i<10; i++) {
			// 1 2 3 4 5 6 7 8 9 10
			// System.out.print((i+1)+" ");
			System.out.printf("%d ",(i+1));
		}
	}
	
	public void method4() {
		
		// 1에서부터 10까지 모든 수를 더하는 것
		int sum = 0 ; // 0으로 초기화하는 이유 : 누적시 정확한 값을 얻기 위해서.
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			// sum += i;
			// i=1 => sum= 0+1		 => i=2
			// i=2 => sum= 0+1+2	 => i=3
			// i=3 => sum= 0+1+2+3   => i=4
			// i=4 => sum= 0+1+2+3+4 => i=5
			// ...
			// i=10 => sum= 0+1+2+...+9+10 =55 =>i=11
			// i=11(false)
			
			// 1+2+3+.....+10+
			// System.out.print(i+"+");
			System.out.print(i);
			
			// i가 마지막 숫자가 되기 전까지는 "+"를 연이어서 출력
			// i가 마지막 숫자가 되는 순간 "="을 출력
			// => 선택적으로 결정(조건문)
			// 마지막 숫자 : 10
			if(i == 10) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
			// 1+2+3+...+10 =
		}
		System.out.println(sum);
		System.out.println("1에서 10까지의 합 : "+sum);
	}
	public void method5() {
		// 사용자로부터 양수 한개를 입력 받아
		// 1부터 그 숫자까지 누적합을 구하고자한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("양수 값 : ");
		int num = sc.nextInt();
		sc.nextLine();
		// 1.양수인지 아닌지 판별
		if(num>0) { // num이 양수인 경우
			// 2. 누적합 구하기
			int sum = 0;
			for(int i=1; i<=num; i++) {
				System.out.print(i);
				// 3. 누적합을 수식으로 표현하기
				// 1+2+3+...=
				if(i==num) {
					System.out.print(" = ");
				}else {
					System.out.print(" + ");
				}
				
				sum = sum+i;
			}
		// 4.for문 밖에 결과 출력하기
		System.out.println(sum);
		System.out.println("누적합 : "+sum);
		
		}else{ // num이 양수가 아닐 경우
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void method6() {
		// 난수 : 매번 임의로 발생하는 랜덤값
		/*
		 * Math클래스
		 * 수학 계산과 관련된 모든 상수, method를 포함하고 있는 Class
		 * Java에서 이미 제공하고 있는 Class
		 * 
		 * [특징]
		 * 모든 Variable과 Method앞에 static이 붙어있다.
		 * => Method를 호출할 때, new를 이용하여 대변할 이름을 만들 필요가 없다.
		 *    바로 Class명.Method명();으로 호출해준다.
		 * random()
		 * 매번 다른 랜덤값을 리턴해준다.
		 * 0.0 ~ 0.999999 사이의 랜덤값을 발생한다.
		 * 0.0 <= 랜덤값  < 1.0
		 * 
		 * [표현법]
		 * 0.0 <= Math.random(); < 1.0
		 */
		
		// 1. random으로 난수 발생
		// 2. 난수의 범위를 조정
		int random = (int)(Math.random()*10)+1; 
		// 0.0 ~ 0.999...
		// 0.0 ~ 9.999...(*10)
		// 1.0 ~ 10.999...(+1)
		// 1 ~ 10 (강제형변환 : int)
		// [공식화]
		// (Math.random() * 랜덤값 개수)+시작수
		// ex ) 11~20사이의 숫자 중 랜덤값
		// (Math.random() * 10)+11
		System.out.println(random);
		
		// 3. for문 및 출력
		int sum = 0;
		// 1~10까지 랜덤값 발생
		for(int i=1; i<=random; i++) {
			//랜덤값의 누적합 계산
			sum+=i;
		}
		System.out.printf("1부터 %d까지의 총 합은 %d이다",random,sum);
	}
	public void method7() {
		// 1에서부터 10까지의 정수 중에서
		// 홀수만 출력하겠다.
		// for문 한개로 끝낸 버전 => 반복 5번(효율적)
		for(int i=1; i<= 10; i += 2) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		// for문 + if문 => 반복 10번(비효율적)
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}
	public void method8() {
		// 구구단 2단
		for(int i=1; i<=9; i++) {
			System.out.printf("2 * %d = %d \n",i,(2*i));
		}
	}
	public void method9() {
		// 사용자로부터 단수를 입력받아
		// 해당 단수의 구구단을 출력
		System.out.println("====구구단 생성기====");
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 사이의 단수 입력 : ");
		int gugudan = sc.nextInt();
		sc.nextLine();
		
			if(gugudan>=2 && gugudan<=9) {
				for(int i=1; i<=9; i++) {
					System.out.printf("%d * %d = %d \n"
							,gugudan,i,(gugudan*i));
				}
			}else {
				System.out.println("단수를 잘못 입력하셨습니다.");
			}
	}
	public void method10() {
		// 2단부터 9단까지 모두 다 출력하기
		// 9단 먼저 찍고 확장
		// 규칙을 찾자!
		// 9라는 단수 부분이 2,3,4,5,6,7,8,9 => 2~9까지 1씩 증가
		// [에러메세지]
		// Duplicate local variable i
		// Variable이 중복되면 발생한다.
		for(int i=2; i<=9; i++) { // 8번
			System.out.println("-----"+i+"단-----");
			for(int j=1; j<=9; j++) { // 9번
				System.out.printf("%d * %d = %d \n",i,j,(i*j));
			}
		}
		// 총 반복횟수 : 72번
	}
	public void method11() {
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		// i = 0 : j = 1 2 3 4 5
		// i = 1 : j = 1 2 3 4 5
		// i = 2 : j = 1 2 3 4 5 
		for(int i=0; i<3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public void method12() {
		
		// *****
		// *****
		// *****
		// *****
		
		// 세로
		/*
		for(int i=0; i<4; i++) {
			// 가로
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// 애초부터 반복을 20번 돌린다.
		for(int i=0; i<20; i++) {
			System.out.print("*");
			// 0 1 2 3 4
			// 5 6 7 8 9
			// 10 11 12 13 14
			// 15 16 17 18 19
			if((i+1)%5 == 0 ) {
				System.out.println();
			}
		}
	}
	public void method13() {
		// 1***
		// *2**
		// **3*
		// ***4
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==j) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	// for문 안에 for문을 겹쳐 쓸 경우, "중첩 for문"이라고도 부른다.
	// if문 안에 if문을 겹쳐 쓸 경우, "중첩 if문"이라고도 부른다.
	public void method14() {
		
		/*
		 * 사용자로부터 문자를 입력받아
		 * 3자리에 있는 문자를 출력하시오.
		 * 문자 입력 : Hello
		 * 1번째 문자 : H
		 * 2번째 문자 : e
		 * 3번째 문자 : l
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		/*
		 * char ch1 = str.charAt(0);
		 * char ch2 = str.charAt(1);
		 * char ch3 = str.charAt(2);
		 */
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+"번째 문자 : " + str.charAt(i));
		}
		
	}
	public void method15() {
		/*
		 * 아무 문자열이나 입력하세요. : 
		 */
		
		// 문자열을 무한으로 반복하면서 매번 입력받기
		// 만약, 입력받은 문자열이 "exit"라는 문자열이라면 종료
		// [오류메세지]
		// break cannot be used outside of a loop or a switch
		// break문은 반복문이나 switch문 안에서만 쓰일 수 있다.
		Scanner sc = new Scanner(System.in);
		
		// i=0; true; i++ : 조건식을 생략하거나 true를 입력하면 무한반복이 일어난다.
		// i=0; i<2;  :증감식을 생략하면 무한반복이 일어난다.
		// i=0; i<2; i+=0 : 증감을 0씩 하면 무한반복이 일어난다.
		// ;; : 전부 생략해도 무한반복이 일어난다.
		for(int i=0; true; i++) {
			System.out.print("아무 문자열이나 입력받으세요 : ");
			String str = sc.nextLine();
			// switch(str) { case "exit" : ~ }
			if(str.equals("exit")) { 
				System.out.println("프로그램을 종료합니다.");
				// 종료시키는 구문
				// 나를 호출했던 구문으로 돌아감 (a.method15();)
				return;
				// break도 가능하다.
				// 다만, switch에서의 break와 반복문에서의 break는
				// 역할이 다르다.(분기문에서 배우게 될 예정)
			}else {
				System.out.println("입력된 문자열 : "+str);
			}
		}
	}
	public void method16() {
		/*
		 * 사용자로부터 2개의 정수 값을 입력받아,
		 * 그 사이에 숫자를 모두 출력하는 프로그램을 작성하라.
		 * 예시
		 * 정수1 입력 : 3 
		 * 정수2 입력 : 8
		 * 3 4 5 6 7 8
		 * 조건문과 for문을 이용하시오.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		// 정수가 입력되지 않았을 때는
		// 1. Math.round() 또는 Math.ceiling()으로 반올림,반내림을 수행
		// 2. try{ }catch{ }를 통해서 오류에 대한 예외처리 하기.(나중에 배움)
		
		if(num1 < num2) {
			for(int i=num1; i<=num2; i++) {
				System.out.print(i+" ");
			}
		}else if(num1 > num2) {
			//for(int i=num2; i<=num1; i++){
			//System.out.println(i+" ");
		    //}
			for(int i=num1; i>=num2; i-- ) {
				System.out.print(i+" ");
			}
		}else {
			System.out.print("값이 동일합니다.");
		}
	}


	
}

