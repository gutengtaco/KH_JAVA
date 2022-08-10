package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	/*
	 * 키보드로 입력받은 하나의 정수가
	 * 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요
	 * 
	 * 예시
	 * 정수 : -9
	 * 
	 * 양수가 아니다.
	 */
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int a = sc.nextInt();
		sc.nextLine();
		String str = (a > 0)? "양수다." : "양수가 아니다";
		System.out.println(str);
	}
	/*
	 * 키보드로 입력받은 하나의 정수가 
	 * 양수이면 "양수다" 양수가 아닌 경우 중에서 
	 * 0이면 "0이다" 0이 아니면 "음수다"를 출력하시오.
	 * 
	 * 예시
	 * 정수 : -9
	 * 
	 * 음수다
	 */
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int a = sc.nextInt();
		sc.nextLine();
		String str = (a>0)? "양수다" :(a==0)? "0이다" : "음수다";
		System.out.println(str);
	}
	/*
	 * 키보드로 입력받은 하나의 정수가
	 * 짝수이면 "짝수다", 홀수이면 "홀수다"를 출력하시오
	 * 
	 * 예시
	 * 정수 : 9
	 * 
	 * 음수다
	 */
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int a = sc.nextInt();
		sc.nextLine();
		String str = (a%2==0)? "짝수다": "홀수다";
		System.out.println(str);
	}
	/*
	 * 모든 사람이 골고루 나눠가지려고 한다.
	 * 인원 수와 사탕 개수를 키보드로 입력 받고
	 * 1인당 동일하게 나누어진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하시오.
	 * 
	 * 예시
	 * 인원수 : 29
	 * 사탕개수 : 100
	 * 1인당 사탕개수 : 3
	 * 남는 사탕개수 : 13
	 */
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 : ");
		int people = sc.nextInt();
		sc.nextLine();
		System.out.print("사탕개수 : ");
		int candy = sc.nextInt();
		sc.nextLine();
		System.out.println("1인당 사탕개수 : " +(candy / people ));
		System.out.println("남는 사탕개수 : " +(candy % people) );
	}
	/*
	 * 키보드로 입력받은 값들을 변수에 기록하고
	 * 저장된 변수의 값을 화면에 출력하여 확인하시오.
	 * 이때, 성별이 M이면 남학생, M이 아니면 여학생으로 출력처리하시오.
	 * 
	 * 예시
	 * 이름 : 강보람
	 * 학년(숫자만) : 3
	 * 반(숫자만) : 15
	 * 번호(숫자만) : 1
	 * 성별(M/F) : F
	 * 성적(소수점 아래 둘째 자리까지) : 95.75
	 * 
	 * 3학년 15반 1번 강보람 여학생의 성적은 95.75이다.
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();
		sc.nextLine();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		String str = sc.nextLine();
		String gender = (str=="M")? "남학생": "여학생";
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double result = sc.nextDouble();
		sc.nextLine();
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다."
				,grade,group,number,name,gender,result);
	}
	/*
	 * 나이를 키보드로 입력 받아
	 * 어린이(13세이하), 청소년(14~19세), 성인(20세~)인지 출력하시오.
	 * 
	 * 예시
	 * 나이 : 19
	 * 
	 * 청소년
	 */
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println();
		String result = (age <= 13)? "어린이"
				:(14<=age && age<=19)? "청소년" : "성인";
		System.out.println(result);
		
	}
	/*
	 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
	 * 세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	 * 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
	 * 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
	 * 
	 * 예시
	 * 국어 : 60
	 * 영어 : 80
	 * 수학 : 40
	 * 
	 * 합계 : 180
	 * 평균 : 60.0
	 * 합격
	 */
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		sc.nextLine();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		sc.nextLine();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		sc.nextLine();
		System.out.println();
		int sum = (korean+english+math);
		System.out.print("합계 : "+sum +"\n");
		double average = (double)((korean+english+math)/3);
		System.out.print("평균 : "+average +"\n");
		String result = (korean >= 40 && english>=40 && math>=40
				&& average >=60)?
				"합격" : "불합격";
		System.out.println(result);
	}
	/*
	 * 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하시오.
	 * 
	 * 예시
	 * 주민번호를 입력하시오(-포함) : 999999-1999999
	 * 남자
	 */
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String address = sc.nextLine();
		String gender = (address.charAt(7)=='1'||address.charAt(7)=='3' )? 
				"남자" : (address.charAt(7)=='2'||address.charAt(7)=='4')? 
				"여자":"잘못 입력하였습니다";
		System.out.print(gender);
	}
	/*
	 * 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
	 * 그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 
	 * true를 출력하고
	 * 아니면 false를 출력하세요.
	 * (단, 입력할 때 num1은 num2보다 작아야 함)
	 * 
	 * 정수1 : 4
	 * 정수2 : 11
	 * 입력 : 13
	 * true
	 */
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("입력 : ");
		int extraNum = sc.nextInt();
		sc.nextLine();
		String result = ((extraNum <= num1 || extraNum > num2)
				&& num1 <num2)?
				"true" : "false";
		//정수1 < extraNum(false) <= num2
		System.out.println(result);
	}
	/*
	 * 3개의 수를 키보드로 입력받아
	 * 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하시오.
	 * 
	 * 예시
	 * 입력1 : 5
	 * 입력2 : -8
	 * 입력3 : 5
	 * false
	 */
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int a = sc.nextInt();
		System.out.print("입력2 : ");
		int b = sc.nextInt();
		System.out.print("입력3 : ");
		int c = sc.nextInt();
		String result = (a==b && b==c && c==a)? "true" : "false";
		System.out.println(result);
	}
}

