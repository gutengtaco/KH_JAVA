package com.kh.chap06_method.controller;

public class MethodTest1 {
	/*
	 * 메소드
	 * 
	 *[표현법]
	 *접근제한자[예약어] 반환형 메소드명(매개변수=> 생략 가능){ 
	 *
	 *     실행할 코드;
	 *     
	 *	   return 반환할 값; => 생략 가능 : 반환형이 void일 경우만
	 *}
	 *  
	 * 메소드를 정의한 다음, 얼마든지 호출이 가능함.
	 * 
	 * 경우의 수를 만들어서 메소드 테스트
	 * 1. 매개변수X, 반환값X (늘 만들던 케이스)
	 * 2. 매개변수X, 반환값O 
	 * 3. 매개변수O, 반환값X
	 * 4. 매개변수O, 반환값O
	 * => 반환값이 있으면(return), 결과값을 메소드를 호출한 곳으로 가서 사용할 수 있음.
	 * => 반환값이 없으면(void), 결과값이 없기 때문에 메소드 내에서만 값을 사용할 수 있음.
	 * => 따라서, return시에는 호출된 메소드에서 Sysout을 해줌.
	 * 			void시에는 메소드 내에서 Sysout을 해줌.
	 * => 다만, return시에는 메소드내에서 sysout을 해줘도 결과가 출력됨.
	 */
	
	// 1. 매개변수X, 반환값X (항상 만들어왔음)
	public void method1() {
		System.out.println("매개변수와 반환값이 둘다 없는 메소드입니다.");
		//1부터 10까지의 합계를 구하여 출력하는 기능
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println("총합 : "+sum);
		
//		return; void메소드의 경우에는 생략되어있음.(JVM이 자동으로 생성해줌.)
		
	}
	// 2. 매개변수X, 반환값O 
	// [오류메세지]
	// This method must return a result of type int
	public int method2() {
		System.out.println("매개변수가 없고 반환값은 있는 메소드입니다.");
		
		// 1에서부터 100까지 숫자 중 랜덤값을 발생시켜 반환시켜주는 메소드
		// int random = (int)((Math.random()*100)+1);
		// return random;
		
		return (int)((Math.random()*100)+1);
	}
	
	// 3. 매개변수O, 반환값X
	public void method3(int num1, int num2) {
		
		System.out.println("매개변수가 있고 반환값이 없는 메소드입니다.");
		
		// num1과 num2를 비교해서 결과를 출력하는 메소드
		// 최소값 : xx
		// 최대값 : xx
		int min=0; // 두 수 중 작은 값을 넣을 용도의 변수
		int max=0; // 두 수 중 큰 값을 넣을 용도의 변수
			if(num1 > num2) {
				min = num2;
				max = num1;
			}else {
				min = num1;
				max = num2;
			}
			System.out.println("최대값 : "+max+"\n최소값 : "+min);
	}
	// 4. 매개변수O, 반환값O
	public int method4(int a, int b) {
		System.out.println("매개변수가 있고 반환값도 있는 메소드입니다.");
		
		// 두 매개변수를 곱한 결과값을 반환해주는 메소드
		return a*b;
	}
}
