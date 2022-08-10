package com.kh.operator;

public class C_Compound {
	/*
	 * 복합대입연산자
	 * 산술연산자와 대입연산자를 함께 사용하는 연산자이다.
	 * 
	 * 종류
	 * +=, -=, *=, /=, %=
	 * 
	 * 사용 예시
	 * a += 3; => a = a + 3;
	 * a -= 3; => a = a + 3;
	 * a *= 3; => a = a + 3;
	 * a /= 3; => a = a + 3;
	 * a %= 3; => a = a + 3;
	 * 기존의 a라는 Variable의 값에 3을 '더하여' 다시 a에 '대입'한다.
	 * 기존의 a라는 Variable의 값에 3을 '빼서' 다시 a에 '대입'한다.
	 * 기존의 a라는 Variable의 값에 3을 '곱해서' 다시 a에 '대입'한다.
	 * 기존의 a라는 Variable의 값에 3을 '나누어서 몫'을 다시 a에 '대입'한다.
	 * 기존의 a라는 Variable의 값에 3을 '나누어서 나머지'를 다시 a에 '대입'한다.
	 * 
	 */
	
	public void method1() {
		// 산술연산자를 이용하여
		// 3을 증가시키기
		int num = 12;
		System.out.println("현재 num : " + num);
		num = num + 3;
		System.out.println("증가된 num : " + num);
		
		// 복합대입연산자를 이용하여 
		// 3을 증가시키기
		num += 3;
		System.out.println("또 증가된 num : "+num);
		
		// 5를 감소시키기
		num -= 5;
		System.out.println("감소된 num : "+num);
		
		// 6배 증가시키기
		num *= 6;
		System.out.println("배가된 num : "+num);
		
		// 2배 나누어서 몫을 구하기
		num /= 2;
		System.out.println("나눠진 몫 num : "+num);
		
		// 4배 나누어서 나머지 구하기
		num %= 4; 
		System.out.println("나눠진 나머지 num : " + num);
		
		// +=의 경우, 문자열의 접합도 가능함 
		String str = "Hello";
		str += "World";
		//str = str + "World";
		System.out.println(str);
		
	}
}
