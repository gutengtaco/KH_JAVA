package com.kh.operator;

public class A_Arithmetic {
	/*
	 * 산술연산자
	 * 이항연산자로 연산 방법과 우선순위가 기존에 알던 사칙연산과 같다.
	 * 
	 * 종류
	 * 덧셈 : +
	 * 뺄셈 : -
	 * 곱셈 : *
	 * 나눗셈(몫) : /
	 * 나눗셈(나머지): %(Modular) 
	 * 
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 + num2 = " + num1 + num2);
		// num1과 num2를 String처럼 취급하여, 103이라는 값이 나온다. 
		// => +라는 기호는 연산의 기능과 출력의 기능을 둘다 가지고 있다.
		// => 앞과 뒤가 우선순위가 동일한 +이기 때문에 연산의 순서가 왼쪽에서 오른쪽으로 진행된다.
		System.out.println("num1 + num2 = " + (num1 + num2));
		// 최우선순위인 괄호로 묶어서 문자열과 int값을 따로 출력한다.
		
		// System.out.println("num1 - num2 = " + num1 - num2);
		// [오류메세지]
		// The operator - is undefined for the argument type(s) String, int
		// 뺄셈의 경우, 덧셈과 우선순위가 동일하다.
		// 쌍따옴표와 +num1까지 String으로 취급하였고, String - int가 되어 오류가 발생한다.
		System.out.println("num1 - num2 = " + (num1 - num2));
		// =>마찬가지로 최우선순위인 괄호로 묶어서 문자열과 int값을 따로 출력한다.
		
		int result = num1 + num2;
		System.out.println("result = " + result);
		// Variable을 통해서는 우선순위에 차등없이 괄호없이 사용해도 된다.
		
		System.out.println();
		// *,/,%의 우선순위가 +,-보다 높기 때문에 괄호를 사용하지 않아도 된다.
		// 다만, 괄호로 묶는 것을 권장한다.(Source Code의 가독성이 좋아지기 때문에)
		System.out.println("num1 * num2 = " + (num1*num2)); // 30이라는 값이 나온다.
		System.out.println("num1 / num2 = " + (num1/num2)); // 3이라는 값이 나온다.
		// 본래 3.33333... 이나 int의 연산결과라 int로 출력된다.
		System.out.println("num1 % num2 = " + (num1%num2)); // 1이라는 값이 나온다.
		
		// System.out.println(10 / 0);
		// [오류메세지]
		// Exception in thread "main"
		// java.lang.ArithmeticException: / by zero
		// 0으로는 숫자의 몫을 구하지 못한다.
		// System.out.println(10 % 0);
		// [오류메세지]
		// Exception in thread "main"
		// java.lang.ArithmeticException: / by zero
		// 0으로는 숫자의 나머지를 구하지 못한다.
		
		System.out.println();
		//실수의 경우
		double a = 35; // 35.0
		double b = 10; // 10.0
		
		System.out.println("a + b= "+(a+b));
		System.out.println("a - b= "+(a-b));
		System.out.println("a * b= "+(a*b));
		System.out.println("a / b= "+(a/b));
		System.out.println("a % b= "+(a%b));
	}
	
	
}
