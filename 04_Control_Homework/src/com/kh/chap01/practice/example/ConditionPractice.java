package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		/*
		 * 메뉴를 출력하고 메뉴 번호를 누르면 "oo메뉴입니다."를,
		 * 종료 번호를 누르면 "프로그램이 종료됩니다."를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
//		메뉴 출력
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("9.종료");
//		사용자 입력
//		메뉴 일치여부 확인
//		Switch에서의 break는 단순히 Switch문을 빠져나가는 역할을 함.
//		return을 해줘야 호출한 메소드로 돌아가, 호출되기 이전인 상태가 됨.
		while(true) {
			System.out.print("메뉴를 입력하세요 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1 : 
				System.out.println("입력 메뉴입니다.");
				break;
			case 2 : 
				System.out.println("수정 메뉴입니다.");
				break;
			case 3 : 
				System.out.println("조회 메뉴입니다.");
				break;
			case 4 : 
				System.out.println("삭제 메뉴입니다.");
				break;
			case 9 :
				System.out.println("종료 메뉴입니다.");
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	public void practice2() {
		/*
		 * 키보드로 정수를 입력받아
		 * 정수가 양수이면서 짝수일때만 "짝수다"를 출력
		 * 짝수가 아니면 "홀수다"를 출력
		 * 양수가 아니면 "양수만 입력해주세요."를 출력
		 */
		Scanner sc =new Scanner(System.in);
		
		for(;;) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			if(num>0) { // 양수인 경우
				if(num%2==0) { // 짝수인 경우
					System.out.println("짝수다");
					break;
//					break;시 반복문을 벗어나 실행 중지됨.
				}else { // 홀수인 경우
					System.out.println("홀수다");
					continue;
//					continue;시 아래의 코드는 실행하지 않고
//					다시 반복문으로 돌아가서 반복 실행됨.
				}
			}else { // 양수가 아닌 경우
				System.out.println("양수만 입력해주세요.");
//					return;
			}
			System.out.println("굳");
//			본래 break와 continue로 인해 실행되지 않고, else로 인해서만 실행 가능
//			그런데, 여기서 else에 return을 사용하면 Unreachable Code가 됨. 
		}
	}
	public void practice3() {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력받고
		 * 합계와 평균을 계산하고
		 * 합격 / 불합격을 처리하시오.
		 * (조건 : 
		 * 세과목의 점수가 각각 40점 이상이면서,
		 * 평균이 60점 이상인 경우
		 * 합격했을 경우, "축하합니다. 합격입니다!"
		 * 불합격인 경우, "불합격입니다."
		 *   
		 * 
		 */
		Scanner sc =new Scanner(System.in);
		for(int i=0; ;i++) {
			System.out.print("국어점수 : ");
			int korean = sc.nextInt();
			sc.nextLine();
			System.out.print("수학점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
			System.out.print("영어점수 : ");
			int english = sc.nextInt();
			sc.nextLine();
			int sum = korean+math+english;
			double avg = (korean+math+english)/3;
				if( (korean>=40 && math>=40&& english>=40)
						&&( sum/3 )>=60){
					System.out.println("합계 : "+sum);
					System.out.println("평균 : "+avg);
					System.out.println("축하합니다. 합격입니다.\n");
					
				}else {
					System.out.println("불합격입니다.\n");
				}
		}
	}
	public void practice4() {
		/*
		 * 수업 자료에서 if문으로 되어있는 봄, 여름, 가을, 겨울을 switch문으로 출력하시오.
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1~12사이의 정수 입력 : ");
			int month = sc.nextInt();
			sc.nextLine();
			switch(month) {
				case 3 : 
				case 4 :
				case 5 :
					System.out.printf("%d은 봄입니다.\n",month);
					return;
				case 6 : 
				case 7 :
				case 8 :
					System.out.printf("%d은 여름입니다.\n",month);
					return;
				case 9 : 
				case 10 :
				case 11 :
					System.out.printf("%d은 가을입니다.\n",month);
					return;
				case 12 : 
				case 1 :
				case 2 :
					System.out.printf("%d은 겨울입니다.\n",month);
					return;
				default : 
					System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
					break;
			}
		}
	}
	
	public void practice5() {
		/*
		 * 아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		 * 로그인 성공 시 "로그인 성공"
		 * 아이디가 틀렸을 시 "아이디가 틀렸습니다."
		 * 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다." 출력
		 * 
		 * 예시
		 * 아이디 : boram
		 * 비밀번호 : 1234
		 * 로그인 성공
		 * 
		 * 아이디 : boram
		 * 비밀번호 : 23467
		 * 비밀번호가 틀렸습니다.
		 * 
		 * 아이디 : rambo
		 * 비밀번호 : 1234
		 * 아이디가 틀렸습니다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			int pwd = sc.nextInt();
			sc.nextLine();
				if(id.equals("boram")) { // 아이디가 맞을 경우
					if(pwd == 1234) { // 아이디가 맞고, 비밀번호가 맞음
						System.out.println("로그인 성공");
						System.out.println();
						break;
					}else { //아이디가 맞고, 비밀번호가 틀림
						System.out.println("비밀번호가 틀렸습니다.");
						System.out.println();
						continue;
					}
				}else { // 아이디가 틀린 경우
					System.out.println("아이디가 틀렸습니다.");
					System.out.println();
					continue;
				}
		}
	}
	
	
	
	
	
	
	
	public void practice6() {
		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력받아
		 * 각 등급이 행할 수 있는 권한을 출력하세요.
		 * 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 회원은 게시글작성, 게시글조회, 댓글작성이 가능하고
		 * 비회원은 게시글 조회만 가능.
		 * 잘못 입력했을 시 "잘못입력했습니다."
		 * 
		 * 회원등급 : 관리자
		 * 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성
		 */
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("회원 등급 : ");
			String authority = sc.nextLine();
				if(authority.equals("관리자")) {
					System.out.println("회원관리, 게시글관리, 게시글작성"
							+ ",댓글 작성, 게시글 조회");
					break;
				}else if(authority.equals("회원")) {
					System.out.println("게시글작성, 게시글조회, 댓글작성");
					break;
				}else if(authority.equals("비회원")) {
					System.out.println("게시글 조회");
					break;
				}else {
					System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
					continue;
				}
		}
	}
	
	public void practice7() {
		/*
		 * 키, 몸무게를 double로 입력받고
		 * BMI지수를 계산하여 결과에 따라
		 * 저체중 / 정상체중 / 과체중 / 비만을 출력하세요.
		 * BMI = 몸무게 / ( 키(cm) * 키(cm) )
		 * BMI가 
		 * 18.5 미만 			: 저체중
		 * 18.5 이상 ~ 23 미만 	: 정상체중
		 * 23 이상 ~ 25 미만 	: 과체중
		 * 25 이상 ~ 30 미만		: 비만
		 * 30이상				: 고도 비만 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요. : ");
		double m = sc.nextDouble();
		sc.nextLine();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double kg = sc.nextDouble();
		sc.nextLine();
		double bmi = kg/(m*m);
		System.out.println("BMI지수 : "+bmi);
			if(bmi <18.5) {
				System.out.println("저체중");
			}else if(bmi<23){
				System.out.println("정상체중");
			}else if(bmi<25){
				System.out.println("과체중");
			}else if(bmi<30){
				System.out.println("비만");
			}else {
				System.out.println("고도 비만");
				
			}
	}
	public void practice8() {
		/*
		 * 키보드로 두 개의 양수와 연산기호를 입력받아
		 * 연산기호에 맞춰 연산결과를 출력하시오.
		 * 단, 양수가 아닌 값을 입력하거나 제시되어 있지 않은 연산기호 입력시
		 * "잘못 입력하셨습니다. 프로그램을 종료합니다"출력
		 * printf문을 이용하여 출력문 작성
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자 입력1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("피연산자 입력2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자 입력(+,-,*,/,%) : ");
		String str = sc.nextLine();
			if(str.equals("+")){
				System.out.printf("%d %s %d = %d",num1,str,num2,(num1+num2));
			}else if(str.equals("-")) {
				System.out.printf("%d %s %d = %d",num1,str,num2,(num1-num2));
			}else if(str.equals("*")) {
				System.out.printf("%d %s %d = %d",num1,str,num2,(num1*num2));
			}else if(str.equals("/")) {
				System.out.printf("%d %s %d = %d",num1,str,num2,(num1/num2));
			}else if(str.equals("%")) {
				System.out.printf("%d %s %d = %d",num1,str,num2,(num1%num2));
			}else {
				System.out.println("잘못 입력하였습니다. 프로그램을 종료합니다.");
			}
	}
	public void practice9() {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석회수를 입력하고
		 * Pass 또는 Fail을 출력하시오.
		 * 총점 100점 중 배점으로는
		 * 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%
		 * 이때, 출석 회수는 총 강의 회수 20회 중에서 출석한 날만 입력
		 * 총점이 70점 이상이면서 전체 강의의 70%이상 출석했을 경우 Pass,
		 * 아니면 Fail
		 * 
		 * 예시
		 * 중간고사 점수 : 80
		 * 기말고사 점수 : 90
		 * 과제 점수 : 50
		 * 출석 회수 : 15
		 * ===========결과==========
		 * 중간고사 점수(20)  : 16.0
		 * 기말고사 점수(30)  : 27.0
		 * 과제 점수(30)    : 15.0
		 * 출석 점수(20)    : 15.0	
		 * 총점 : 73.0
		 * PASS
		 * 
		 * 중간 고사 점수 : 80 : 16
		 * 기말 고사 점수 : 30 : 9
		 * 과제 점수 : 60	 : 18
		 * 출석 회수 : 18 	 : 18
		 * ===========결과==========
		 * FAIL [점수 미달] (총점 61.0)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("중간고사 점수 : ");
			int middle = sc.nextInt();
			sc.nextLine();
			double middlePoint = middle * 0.2;
			
			System.out.print("기말고사 점수 : ");
			int end = sc.nextInt();
			sc.nextLine();
			double endPoint = end * 0.3;
			
			System.out.print("과제 점수 : ");
			int report = sc.nextInt();
			sc.nextLine();
			double reportPoint = report * 0.3;
			
			System.out.print("출석 회수 : ");
			double attend = sc.nextDouble();
			sc.nextLine();

			double result = middlePoint+endPoint+reportPoint+attend;
			
			if(result>=70 && (attend/20)>=0.7) { // 총점 70점 이상 이면서 출석 70% 이상
				System.out.println("===========결과==========");
				System.out.println("중간고사 점수(20) : "+middlePoint);
				System.out.println("기말고사 점수 (30): "+endPoint);
				System.out.println("과제 점수(30) : "+reportPoint);
				System.out.println("출석 회수(20) : "+attend);
				System.out.println("총점 : "+result);
				System.out.println("PASS");
			}else if(result < 70 && (attend/20) >= 0.7) { // 총점 70점 미만 이면서 출석 70% 이상 
				System.out.printf("FAIL [점수 미달] (총점 %.1f)",result);
			}else if(result >= 70 && (attend/20) < 0.7) { // 총점 70점 이상 이면서 출석 70% 미만
				System.out.printf("FAIL [출석 횟수 부족] (%.0f/20)",attend);
			}else{ // 총점 70점 미만 이면서 출석 70% 미만
				System.out.printf("FAIL [점수 미달] (총점 %.1f)\n",result);
				System.out.printf("FAIL [출석 횟수 부족] (%.0f/20)",attend);
				
			}
			System.out.println();
			
		}
			
	}
	public void practice10() {
		/*
		 * 앞에 구현한 실습문제를 선택하여 실행할 수 있는 메뉴화면을 구현.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		
		
		System.out.print("선택 : ");
		int choose = sc.nextInt();
		sc.nextLine();
		
		switch(choose) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		default : System.out.println("해당 메뉴는 존재하지 않습니다.");
		
		}
	}
}