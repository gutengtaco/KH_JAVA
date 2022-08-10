package com.kh.chap01.condition;

import java.util.Scanner;


public class C_Switch {
	/*
	 * Switch문
	 * 표현하고 싶은 경우의 수가 여러 개일 경우 사용 가능하다.
	 * 단, ==(동등비교연산자)이 포함된 조건인 경우에만 사용이 가능하다.
	 * 
	 * switch문과 if문의 차이점
	 * if(조건식) 	=> 조건식을 복잡하게 기술할 수 있다.(사용가능한 연산자의 가짓수가 많다)
	 *				       조건식에서 숫자의 범위를 표현할 수 있다. 	
	 * Switch(조건식x)=> 확실한 값의 조건만 가능하다.(동등 비교 수행)
	 * 				
	 * [표현법]
	 * switch(동등 비교를 할 대상자){
	 * case 값1 : 실행할코드1; // 만약 앞으로 동등비교를 할 대상자 == 값1이면
	 * 					   // 실행할 코드 1을 실행한다.
	 * 			  break;   // 실행할 코드 1을 실행하고, 중괄호 영역을 빠져나간다.
	 * case 값2 : 실행할코드2; // 만약 앞으로 동등비교를 할 대상자 == 값2이면
	 * 					   // 실행할 코드 2를 실행한다.
	 *            break;   // 실행할 코드 2를 실행하고, 중괄호 영역을 빠져나간다.
	 * ...
	 * case 값n : 실행할코드n;
	 *            break;
	 *            
	 * default : 실행할코드;  // case 값1에서 n번까지 동등비교를 수행하고
	 *                     // 하나도 실행되지 않았을 때 실행된다(=else)
	 *                     // break;를 쓰지 않는다.
	 * }
	 */
	public void method1() {
		/*
		 * 1~3사이의 숫자를 입력받아
		 * 1인경우 : "빨간불입니다"
		 * 2인경우 : "파란불입니다"
		 * 3인경우 : "초록불입니다"
		 * 잘못입력한경우 : "잘못 입력하였습니다"
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
//		if(num == 1) { // 빨간불
//			System.out.println("빨간불입니다.");
//		}else if(num == 2) { // 파란불
//			System.out.println("파란불입니다.");
//		}else if(num ==3) { // 초록불
//			System.out.println("초록불입니다.");
//		}else { // 잘못입력한 경우
//			System.out.println("잘못입력하였습니다.");
//		}
		
		String light = "";
		switch(num) {
		case 1 : // num == 1이면 실행한다.
			light = "빨간불"; 
			// System.out.println("빨간불입니다");
				break; // 실행결과가 true이면 중괄호 영역을 나온다.

		case 2 : // num == 2이면 실행한다.
			light = "파란불"; 
			// System.out.println("파란불입니다");
				break; // 실행결과가 true이면 중괄호 영역을 나온다.

		case 3 : // num == 3이면 실행한다.
			light = "초록불"; 
			// System.out.println("초록불입니다.");
				break; // 실행결과가 true이면 중괄호 영역을 나온다.
		
		default : // num이 1,2,3이 아닌 경우, default를 출력한다.
			System.out.println("잘못 입력하셨습니다."); 
			return; 
			// return문은 현재 실행중인 Method 자체를 빠져나간다는 뜻이다.
			// 그리고, 현재 실행중인 Method를 호출한 c.method1();으로 돌아간다.
			// 즉, num == 4일 경우, default의 "잘못입력하였습니다."를 실행하기로 하고
			// switch문을 나와서 c.method1();을 실행하여 출력한다.
		}
		System.out.printf("%s입니다.",light);
	}
	public void method2() {
		// 사용자에게 구매할 과일명(사과, 바나나, 복숭아)를 입력받아
		// 각 과일의 가격을 출력(사과:1000원 / 바나나 : 2000원 / 복숭아 : 5000원)
		Scanner sc =new Scanner(System.in);
		System.out.println("-----Welcome 과일가게 -----");
		System.out.print("구매할 과일명 입력 : ");
		String fruit = sc.nextLine();
		int price = 0;
		
		// [주의할 점]
		// switch에서는 문자열도 동등비교(==)를 내부적으로 수행할 수 있다.(equals없이)
		switch(fruit) {
		case "사과" :			// if( fruit.equals("사과") ) {}
			price = 1000;
			break;
		
		case "바나나" : 		// else if( fruit.equals("바나나") ) {}
			price = 2000;
			break;
			
		case "복숭아" : 		// else if( fruit.equals("복숭아") ) {}
			price = 5000;
			break;
		
		default :		// else {}
			System.out.println("입력하신 과일은 존재하지 않습니다.");
			return;
			// return을 쓰면 바로 위의 "입력하신~"까지를 출력하고
			// Method2를 호출한 c.method2()로 돌아간다.
		}
		System.out.printf("%s의 가격은 %d원 입니다.",fruit,price);
	}
	public void method3(){
		// 주민번호를 입력받아 남자, 여자를 구별하시오.
		// => 주민번호를 문자열로 취급하여 받으시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력(-포함) : ");
		// Variable은 조건문 밖에서 선언한다.
		// 이유는 Variable이 해당 중괄호 안에서만 유효하게 되기 때문이다.
		String personId = sc.nextLine();
		char gender = personId.charAt(7);
		String result = "";
		
		switch(gender) {
		// '1' 또는 '3'일 경우 
		// 동일한 케이스를 한번에 묶어서 나열하고 그 사이에는 break를 쓰지 않는다.
		// case에 아무런 값, 코드, break를 적지 않으면 다음 case로 넘어간다.
		case '1' : 
			// result = "남자입니다";
			// break;
		case '3' :
			result = "남자입니다";
			break;
		
		// '2' 또는 '4'일 경우 
		case '2' : 
			// result = "여자입니다";
			// break;
		case '4' : 
			result = "여자입니다";
			break;
		
		default : 
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		System.out.println(result);
	}
	public void method4() {
		// 사용자에게 1월~12월 사이의 일을 입력받아
		// 해당 월에 해당하는 계절을 출력
		// 봄(3~5), 여름(6~8월), 가을(9~11월), 겨울(12~2월)
		Scanner sc =new Scanner(System.in);
		System.out.print("월 입력 : ");
		
		int month = sc.nextInt();
		sc.nextLine();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8: 
			System.out.println("여름입니다.");
			break;
		case 9:
		case 10:
		case 11: 
			System.out.println("가을입니다.");
			break;
		case 12:
		case 1:
		case 2: 
			System.out.println("겨울입니다."); 
			break;
		default : 
			System.out.println("1~12사이의 숫자를 입력해주세요.");
			// return;
			// Method가 끝나는 영역 기준으로 return이 마지막 구문이기 때문에
			// return이 있으나 없으나 Method가 끝나니 생략해도 된다.
		}
	}
}
