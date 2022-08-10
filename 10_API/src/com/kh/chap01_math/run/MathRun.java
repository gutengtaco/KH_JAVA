package com.kh.chap01_math.run;
// import java.lang.Math; => 생략가능(항상 import되어있음)

public class MathRun {
	public static void main(String[] args) {
		/*
		 * API : Application Programming Interface
		 * '라이브러리'라고도 함
		 */
		
//		Math클래스(수학과 관련)에서 제공하는 유용한 기능을 살펴보자.
//		1. java.lang.Math
//		2. 모든 메소드들이 static, 모든 필드들이 static => 객체 생성이 필요없음.
		
//		3. Math m = new Math();
//		[오류메세지]
//		The constructor Math() is not visible
//		Ctrl키를 누르고 Open declaration을 보면 생성자가 private로 되어있음
//		=> 객체 생성이 되지 않음.
		
//		상수
//		파이(원주율) => Math클래스 내에 상수필드로 정의되어 있음.
		System.out.println("파이 : "+ Math.PI);
		
//		메소드
//		객체명.메소드명(매개변수) : 반환형
//		1. 올림처리 => Math.ceil(double) : double
		double num1 = 4.349;
		System.out.println("올림 : "+Math.ceil(num1)); // 5.0
		
//		2. 반올림처리 => Math.round(double) : long
		System.out.println("반올림 : "+Math.round(num1)); // 4
		
//		3. 버림처리 => Math.floor(double) : double
		System.out.println("버림 : "+Math.floor(num1)); // 4.0
		
//		4. 절대값(absolute) => Math.abs(int,double,long,float) : int, double, long, float(오버로딩 되어있음.)
		int num2 = -10;
		System.out.println("절대값 : "+Math.abs(num2)); // 10
		
//		5. 최소값 => Math.min(int,int) : int
		System.out.println("최소값 : "+Math.min(5, 10)); // 5
		
//		6. 최대값 => Math.max(int,int) : int
		System.out.println("최대값 : "+Math.max(5, 10)); // 10
		
//		7. 제곱근(square root) => Math.sqrt(double) : double
		System.out.println("4의 제곱근 : "+Math.sqrt(4)); // 2.0
		
//		8. 제곱 => Math.pow(double, double) : double
		System.out.println("2의 10제곱 : "+Math.pow(2, 10)); // 1024.0

		/*
		 * java.lang.Math클래스의 특징
		 * - 모든필드 : 상수필드
		 * - 모든메소드 : static메소드
		 * 
		 * 모든게 다 static이기때문에 Math.으로 접근 가능(객체 생성 필요 없음)
		 * 어차피 생성자가 private이기 때문에 객체 생성도 불가능함.
		 * 
		 * static : 프로그램 실행과 동시에 메모리 영역에 올려놓음.
		 * 			공유(재사용)의 개념이 강함.
		 * 			=> 싱글톤 패턴(클래스의 객체를 API문서에 단 한번 생성하고, 이를 사용함)
		 * 
		 */
		
		
	}

}
