package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 * 자료형 => 기본자료형(8가지), 참조자료형(1가지)
		 * 기본자료형은 Stack에 실제값을 바로 담았었음.
		 * 기본자료형은 .메소드() 호출이 불가함.
		 * 참조자료형은 Stack에 주소값, Heap에 실제값을 담았었음.
		 * 참조자료형은 .메소드() 호출이 가능했음.
		 * 
		 * Wrapper클래스
		 * 기본자료형을 객체형식으로 포장해주는 클래스를 Wrapper클래스라고 함.
		 * 	
		 * 기본자료형	<------->	Wrapper클래스
		 * boolean					Boolean	
		 * char						Character
		 * byte 					Byte
		 * short 					Short
		 * int 						Integer
		 * long						Long
		 * float 					Float
		 * double					Double
		 * 
		 * => 기본자료형을 Wrapper클래스 형태로 바꾸어주는 작업을 Boxing이라고 함.
		 * => Wrapper클래스를 기본자료형으로 바꾸어주는 작업을 UnBoxing이라고 함.
		 */
		
		int num1 = 10;
		int num2 = 15;
		
//		num1과 num2가 동일한지 출력문을 통해서 알아보고 싶다면?
		System.out.println(num1 == num2);
		
//		System.out.println(num1.equals(num2)); 기본자료형이라 에러가 뜸.
//		System.out.println(num1.hashCode()); 당연히 해시코드도 오류가 뜸.
//		=> 기본자료형은 메소드를 호출할 수 없음.

//		기본자료형에서 객체 자료형의 메소드를 가져다 쓰고 싶을때
//		=> Wrapper클래스로 변환하여 사용.
		
//		기본자료형 => Wrapper자료형(Boxing)
		Integer i1 = num1;	// 10
		Integer i2 = num2; 	// 15
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode()); 	
		
		System.out.println(num1 < num2); // true(일반자료형의 대소비교)
		System.out.println(i1.compareTo(i2)); 
//		a.compareTo(b) : a랑 b를 비교해서 a > b이면 1, a < b이면 -1, 같으면 0
//		=> 객체로 바꾸게 되면, 메소드들을 이용할 수 있음.
		
//		Wrapper자료형 => 기본자료형(UnBoxing)
		int num3 = i1;	// 10
		int num4 = i2;	// 15
		
		System.out.println(num3 == num4);
		System.out.println(num3 > num4);
		
		System.out.println("-----------------------------------------------------");
		
//		기본자료형 <--------> String (중요)
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // 1015.3
		
//		1. String -> 기본자료형 : 파싱한다.
//		[표현법]
//		해당 Wrapper클래스명.parseXXX(반환할 문자열);
//		.parstXXX()메소드는 static이 붙어있어 객체를 생성하지 않아도 사용할 수 있음.
		
		int i = Integer.parseInt(str1);	//	"10" --> 10
//		str1의 문자열을 int형으로 바꾸고, 이를 int i에 담음.
		
		double d = Double.parseDouble(str2); // "15.3" --> 15.3
//		마찬가지로, str2의 문자열을 double형으로 바꾸고, 이를 double d에 담음.
		
		System.out.println(i+d);	//	 25.3
		
//		2. 기본자료형 -> String 
//		   10			 "10"
//		   15.3          "15.3"
//		[표현법]
//		String.valueOf(변환할 기본자료형); : String
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		System.out.println(strI+strD);
		
		
	}

}
