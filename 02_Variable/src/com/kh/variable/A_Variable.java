package com.kh.variable;

public class A_Variable {
	
	//시급, 근무시간, 근무일수를 곱해서 월급을 계산하여 출력하는 Method
	public void printSalary() {

		System.out.println("===== 변수 사용 전 =====");
		
		// 계산 시 필요한 정보들(시급, 근무시간, 근무일수)
		System.out.println("시급 : 9160 원");
		System.out.println("근무시간 : 6 시간");
		System.out.println("근무일수 : 15 일");
		
		// 월급 - 시급 * 근무시간 * 근무일수
		// 김갑생 : 000000원 형식으로 출력
//		System.out.println("강민수 : 9160 * 6 * 15 원");
		// 1. Java에서 곱셈 연산은 X로 표시하지 않고 *로 표시한다.
		// 2. Java에서 문자열은 쌍따옴표("")로 묶어서 표현하고, 숫자는 그냥 표현한다.
		// 3. Java에서 서로 다른 형태의 값을 여러개 연이어서 붙이고 싶을 경우, + 기호를 쓴다.
		// 결과는? 강민수 : 9160 * 6 * 15 원 
		// 여기서 우리가 원하는 값은? 824400원
		// 다만, 강민수씨만 실수로 0을 하나 더 넣었음.
		System.out.println("강민수 : " + 91600*6*15 + " 원");
		System.out.println("김동현 : " + 9160*6*15 + " 원");
		System.out.println("김유진 : " + 9160*6*15 + " 원");
		System.out.println("김한솔 : " + 9160*6*15 + " 원");
		System.out.println("김현우 : " + 9160*6*15 + " 원");
		
		// Variable를 사용해보자
		System.out.print("\n"); // 개행
		
		System.out.println("===== 변수 사용 후 =====");
		//맛보기로 Variable를 선언하고 값을 대입해보자.
		int pay = 9160; // 시급을 담아두는 Variable
		int time = 6;	// 근무시간을 담아두는 Variable
		int day = 15;	// 근무일수를 담아두는 Variable
		// Variable을 가지고 출력해보기
		System.out.println("시급 :" + pay + " 원");
		System.out.println("근무시간 :" + time + " 시간");
		System.out.println("근무일수 :" + day + " 일");
		
		System.out.println("강민수 : "+ pay*time*day+"원");
		System.out.println("김동현 : "+ pay*time*day+"원");
		System.out.println("김유진 : "+ pay*time*day+"원");
		System.out.println("김한솔 : "+ pay*time*day+"원");
		System.out.println("김현우 : "+ pay*time*day+"원");
		// [오류메세지]
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		// String literal is not properly closed by a double-quote
		// 쌍따옴표를 두번 쓰면 생기는 오류이다.
		/*
		 * Variable을 사용하는 이유
		 * 1. Variable은 우선적으로 값에 의미를 부여할 목적으로 사용한다.(가독성)
		 * 2. 단 한번만 값을 기록하고, 필요할 때마다 계속 이름을 불러서 사용한다.(재사용성)
		 * 3. 유지보수를 보다 쉽게 할 수 있다.
		 */
	}
	
	//변수의 선언
	public void declareVariable() {
		
		/*
		 * 변수의 선언
		 * 값을 기록하기 위한 Variable을 메모리 공간에 확보해두겠다. 
		 * =>일정 용량을 가진 상자를 만든다.
		 * 
		 * [표현법] 자료형 Variable명;
		 * 자료형 : Variable의 크기 및 모양을 지정하는 부분이다.
		 * Variable명 : Variable의 이름을 정하는 부분이다. 
		 * 
		 * Variable 선언 시 주의할 점
		 * 1. Variable명은 소문자로 시작하게끔 이름을 지어준다.(단, 낙타봉표기법을 지킨다.)
		 * 2. 같은 영역(중괄호)안에서는 동일한 Variable명으로 선언이 불가하다(이름 중복 불가)
		 * 3. 해당 영역(중괄호)안에 선언된 Variable은 해당 영역 안에서만 사용이 가능하다.
		 *    즉, 다른 Method에서는 사용이 불가하다 => 지역변수라고 한다.
		 */
		
		// 자료형
		// 1. 논리형(true/false => 논리값)
		boolean isTrue;	 //1byte
		
		// 2. 숫자형(정수형, 실수형)
		// 정수형
		byte bNum; 		//1byte(-128 ~ 127 : 256자)
		short sNum;		//2byte 
		int iNum;		//4byte(기본자료형, -21억 ~ 21억)
		long lNum;		//8byte
		
		// 실수형(소수점 아래의 숫자를 표현 가능)
		float fNum;		//4byte(소수점 아래 7자리)
		double dNum;	//8byte(기본자료형, 소수점 아래 15자리 - 정교함)
		
		// 3. 문자형
		char ch; // 2byte
		
		// ----- 이 위는 총 8개의 기본자료형이라고 한다----- 
		
		// 4. 문자열형(참조자료형)
		String str; // 크기를 제한하지 않는다.
		
		/*
		 * 만들어진 변수에 값을 대입(박스에 값을 담기)
		 * [표현법] 변수명 = 값;
		 */
		
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; 	// long임을 알려주기 위해 뒤에 L을 같이 표기해준다.
		
		fNum = 4.0f;// float임을 알려주기 위해 뒤에 f를 같이 표기해준다.
		dNum = 8.0;		
		
		ch = 'A'; 	// Java에서 문자형 값의 경우는 반드시 작은따옴표('')에 넣는다.
		str = "안녕하세요"; // 문자열의 경우는 쌍따옴표("")에 넣는다.
		
		//각 변수에 담긴 값을 출력
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);

	}
	//변수의 선언과 동시에 초기화
	public void intiVariable() {
		
		/*
		 * 변수의 선언과 동시에 초기화
		 * [표현법] 자료형 Variable명 = 값;
		 * 선언 -> 값 -> 대입의 순서로 진행
		 */
		
		// 1.논리형
		boolean isTrue = true; 
		boolean isFalse = 3+5<1; // 결과가 True 또는 False로 나오는 수식도 가능
	
		// 2.정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		// 3.실수형
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 4.문자형
		char ch = '김';
		
		// 5.문자열형(참조자료형)
		String str = "Java공부중";
		
		//각 변수에 담긴 값 출력
		System.out.println("isTrue : "+isTrue);
		System.out.println("isFalse : "+isFalse);
		System.out.println("bNum : "+bNum);
		System.out.println("sNum : "+sNum);
		System.out.println("iNum : "+iNum);
		System.out.println("lNum : "+lNum);
		System.out.println("fNum : "+fNum);
		System.out.println("dNum : "+dNum);
		System.out.println("ch : " +ch);
		System.out.println("str : " +str);
		
	}
	//상수
	public void constant() {
		
		//기존의 Variable
		int age = 20;	//선언과 동시에 대입
		System.out.println("age : " + age);
		
		// Variable의 특징 : 값을 바꿀 수 있다.
		age = 30;
		System.out.println("변경된 age : " + age);
	
		/*
		 * 상수 : 변하지 않는 값을 의미한다.
		 * 		한번 기록된 값이 변경 불가능하다.
		 * => 항상 고정적인 값을 기록할 때 사용한다.
		 * 	    예) pi : 원주율  
		 * 
		 * 상수 선언 시 주의할점
		 * 1. final이라는 키워드를 붙여서 선언한다.
		 * 2. 상수명을 항상 대문자로 쓴다.
		 * [표현법] final 자료형 상수명 = 값;
		 */
			
		final int AGE = 20;
		System.out.println("AGE : " + AGE);
		//AGE = 30; 상수 값을 바꾸려고 하면 오류가 뜬다.
		//[오류메세지]
		//The final local variable AGE cannot be assigned. 
		//It must be blank and not using a compound assignment
		//=>final키워드가 붙은 지역변수인 AGE는 대입 당할 수 없다.
		//=>상수에 이미 값이 있을 경우 대입자체가 되지 않는다.
	}
	
	
}
