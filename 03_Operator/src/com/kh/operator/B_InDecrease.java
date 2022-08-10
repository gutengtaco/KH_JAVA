package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증감연산자
	 * 단항연산자로써, 한번에 값을 1씩 증가시키거나 감소시키는 연산자이다.
	 * 
	 * 종류
	 * ++ : 한번에 값을 1만 증가시킨다.
	 * [표현법]
	 * ++값; : 전위 증가 연산자
	 * 값 ++; : 후위 증가 연산자
	 * -- : 한번에 값을 1만 감소시킨다.
	 * [표현법]
	 * --값; : 전위 감소 연산자
	 * 값--;  : 후위 감소 연산자
	 * 
	 * => 연산자의 위치에 따라 연산이 언제 될지 결정한다.
	 * (증감연산자)값 : 연산이 먼저 되고 나서 값을 처리한다. => 선증감 후처리
	 * 값(증감연산자) : 값을 먼저 처리하고 연산을 한다.	=> 선처리 후증감
	 */
	public void method1() {
		int num = 10;
		System.out.println("num : "+num);
		num++;
		System.out.println("변경된 num : " +num);
		// num Variable에 들은 값을 1 증가시킨다.
		// 즉, num = num + 1; 과 같은 의미이다.
		num--;
		// num Variable에 들은 값을 1 감소시킨다.
		// 즉, num = num - 1; 과 같은 의미이다.
		num--;
		System.out.println("변경된 num : " +num);
	}
	public void method2() {
		// 전위연산
		int a = 10;
		int b = ++a; 
		// 선증감 : ++a(11)
		// 후처리 : int b=++a(11)
		// ++a를 먼저, 이후 대입
		System.out.println("a : "+a+", b : "+ b);
		
		// 후위연산
		int c = 10;
		int d = c++; 
		// 선처리 = int d=c(10)
		// 후증감 : c++(11)
		// 대입 먼저, 이후 c++
		System.out.println("c : "+c+", d : "+ d);
	}
	
	public void method3() {
		// 증감연산자는 단항연산자라 값 한개에만 적용 된다.
		// 즉, 증감연산자가 붙은 num(1,2,3,4)에만 증감이 적용된다.
		// ++후위연산
		int num1 = 20;
		int result1 = num1++ * 3; 
		// result1 = 60, num1 = 21
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		
		// ++전위연산
		int num2 = 20;
		int result2 = ++num2 * 3;
		// num2 = 21, result2 = 63
		System.out.println("num2 : " + num2);
		System.out.println("result2 : "+result2);
		
		// --전위연산
		int num3 = 10;
		int result3 = --num3 * 5;
		// num3 = 9, result3 = 45 
		System.out.println("num3 : "+ num3);
		System.out.println("result3 : "+result3);
		
		// --후위연산
		int num4 = 10;
		int result4 = num4--*5;
		// result = 50, num4 = 9
		System.out.println("num4 : "+num4);
		System.out.println("result4 : "+result4);
	}
}
