package com.kh.variable;

public class C_Cast {

	/*
	 * 형변환
	 * 값의 자료형을 바꾸는 개념이다.
	 * 
	 * 컴퓨터 상에서 값 처리 규칙
	 * 1. =(대입연산자) 을 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 한다.
	 * => 즉, 같은 자료형에 해당하는 값만 대입이 가능하다.
	 * => 다른 자료형의 값을 넣고 싶다면, "형변환"이 필요하다.
	 * [표현법] 자료형 Variable명 = (바꿀 자료형)값 ;
	 *  
	 * 2. 같은 자료형끼리만 연산이 가능하다.
	 * => 다른 자료형끼리 연산을 수행하고 싶으면 "형변환"이 필요하다.
	 * [표현법] 값 + (바꿀 자료형)값 ; 
	 * 
	 * 형변환의 종류
	 * 1. 자동 형변환 : 자동으로 형변환이 되어, 코드상으로 직접 형변환 할 필요가 없다.
	 * 			        작은 byte의 값을 큰 byte의 Variable에 담는 경우
	 *              ex) 휴대폰(작은)을 냉장고 상자(큰)에 넣는 경우 
	 * 2. 강제 형변환 : 자동 형변환이 진행되지 않는 경우, 내가 직접 형변환을 해야하는 경우
	 *              큰 byte의 값을 작은byte의 Variable에 담는 경우
	 *              "명시적 형변환" 이라고도 한다.
	 * [표현법] (바꿀 자료형)자료형을 바꾸고 싶은 값; 
	 * => 강제형변환만 표현법이 존재한다.
	 * => (바꿀 자료형) : 형변환 연산자, Cast연산자라고 한다.
	 */
	
	// 자동 형변환 : 작은 byte의 값을 큰 byte의 Variable에 담을 경우 발생한다.
	public void autoCasting() {
		// 자동 형변환이 되는 case
		
		/* 1. 정수형 int(4byte) -> 실수형 double(8byte) */
		int i1 = 10;
		double d1 = i1;
		System.out.println("d1 : " + d1);
		// double d1 = (double)i1;
		// 10.0(10->10.0)이 출력되는 것을 볼 수 있다.
		int i2 = 12;
		double d2 = 3.3;
		double result2 = i2+d2;
		System.out.println("result2 : "+result2);
		// double result2 = (double)i2 + double d2;
		// 15.3(12.0 + 3.3)이 출력되는 것을 볼 수 있다.
		
		/* 2. 정수형 int(4byte) -> 정수형 long(8byte) */
		int i3 = 1000;
		long l3 = i3;
		// long l3 = (long)i3;
		long l4 = (long)2000; 
		// L을 붙이지 않아도 long으로 자동 형변환이 된 것이다.
		// 본래는 그냥 숫자만 쓰면 int형을 의미한다.
		System.out.println("l3 : "+l3); 
		System.out.println("l4 : "+l4);
		
		/* 3.[특이케이스] 정수형 long(8byte) -> 실수형 float(4byte) */
		// 정수가 실수로 변환될 경우, 큰 size의 정수가 작은 size의 실수로 변환 가능하다.
		// 이는 4byte float형이 사실 8byte long형보다 담을 수 있는 값의 범위가 크기 때문이다.
		long l5 = 1000000000;
		float f5 = l5;
		System.out.println("f5 : "+f5);
		// float f5 = (float)l5;
		// 1.0E9라는 값이 나온다.(1000000000.0)
		
		/* 4.[특이케이스] 문자형 char(2byte) <---> 정수형 int(4byte) 
		   : 양방향 형변환 가능                                                                                 */
		char ch = 65;
		System.out.println("ch : " +ch); 
		// char ch = (char) 65;
		// 'A'라는 값이 나온다.
		int num = 'A';
		System.out.println("num : "+num);
		// int num = (int) 'A';
		// 65라는 값이 나온다.
		System.out.println((int)'김');
		/*
		 * [참고] 아스키 코드 표
		 * 각 문자별로 고유한 숫자값으로 대치되서 표현되는 개념
		 * (0~127 : 대소영문자, 숫자, 특수문자)
		 * 'A' = 65 , 'a' = 97
		 * '김' = 44608
		 * [참고] 유니코드 표
		 * 각 문자별로 고유한 숫자값으로 대치되서 표현되는 개념
		 * 아스키 코드의 확장된 개념이라고 보면 된다.
		 * (0~65536 : 영어, 숫자, 특수문자, 그 이외의 언어문자)
		 */
		int sum = 'A' + 10;
		System.out.println("sum : " + sum);
		System.out.println("sum : " + (char)sum);
		// int sum = (int)'A' + 10; => 75라는 값이 나온다.
		// char sum = 'A' + (char)10; => K라는 값이 나온다.
		
		/* 5.[특이케이스] byte끼리, short끼리의 연산 */
		byte b1 = 1;
		byte b2 = 10;
		short s1 = 1;
		short s2 = 10;
		//byte result = b1 + b2;
		// [오류메세지]
		// Type mismatch: cannot convert from int to byte
		// byte나 short로 연산시 결과값이 int(4byte)로 취급한다.
		byte result1 = (byte)(b1 + b2);
		short result11 = (short)(s1 + s2);
		System.out.println("result1 : "+result1);
		System.out.println("result11 : "+result11);
		// 이렇게 b1+b2로 연산한 결과인 int형을 byte형으로 바꾸어 준다
		// (byte)b1 + (byte)b2로 하더라도 연산 결과가 11로 int형이기 때문에
		// 결과값 전체를 byte로 하지 않는 이상은 오류가 뜬다.
		// short도 마찬가지이다.
		
	}
	// 강제(명시적) 형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 형변환 할 경우(형변환 연산자 사용)
	public void forceCasting() {
		// 강제 형변환을 해야하는 case
		// 1. double(8byte) -> float(4byte)
		float f1 = 4.0f;
		// [오류메세지]
		// Type mismatch: cannot convert from double to float
		// 값 뒤에 f를 붙여주거나 값 앞에(float)을 붙여줘야 한다.
		double d2 = 8.0;
		float f2 = (float)d2;
		
		// 2. double(8byte) -> int(4byte)
		double d3 = 10.89;
		int i3 = (int)d3; // 10이 담기는가? 11이 담기는가? 
		System.out.println("i3 : "+ i3);
		// 10.89 -> 10이 담긴다.
		// [주의사항]
		// 데이터의 손실이 일어날 수 있다.(강제 형변환은 신중히!)
		// => 소수점 아래 내용이 절삭되었다.
		
		int iNum = 10;
		double dNum = 5.89;
		// int iSum = iNum + dNum;
		// iNum이 상대적으로 큰 size인 double형으로 자동변환이 되고
		// dNum과 덧셈연산이 행해진 상태이다.
		// 즉, 15.89라는 double형인 상태로, int iSum의 값이 된 상태이다.
		// [해결방법]
		// 1. 연산 결과를 통으로 강제 형변환을 해준다.
		int iSum1 = (int)(iNum + dNum);
		System.out.println("iSum1 : "+iSum1); // 15라는 값이 나온다.
		// 2. 각각의 값을 결과의 자료형에 맞게 강제 형변환을 해준다.
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : "+iSum2); // 15라는 값이 나온다.
		// 3. 결과의 자료형을 연산 결과에 맞게 강제 형변환을 해준다.
		double iSum3 = iNum + dNum;
		System.out.println("iSum3 : "+iSum3); // 15.89라는 값이 나온다.
		
		/*
		 * 강제 형변환을 주로 하는 경우
		 * 오류 발생시 : Type mismatch : cannot convert from ~ to ~...
		 */
	}
	
}
