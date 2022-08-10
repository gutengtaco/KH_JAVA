package com.kh.variable;

public class D_Printf {
	
	/*
	 * System.out.println(출력하고자 하는 값); 
	 * => 값을 출력한 후에 줄바꿈(커서가 다음줄에 찍힘.)을 한번 해준다.
	 * System.out.print(출력하고자 하는 값);
	 * => 값을 출력한 후에 줄바꿈(커서가 해당줄에 찍힘.)을 하지 않는다.
	 * 
	 * System.out.printf()에 대하여 배워본다
	 * [표현법]
	 * System.out.printf("출력하고자 하는 형식", 출력하고자 하는 값);
	 * => f는 format(형식)을 의미한다.
	 * => 형식에 맞춰서 값들이 출력되나, 줄바꿈은 일어나지 않는다.
	 * => 개행은 \n을 이용한다.
	 * => "출력하고자 하는 형식"에 구멍을 뚫고, 출력하고자 하는 값으로 구멍을 메꾼다고 생각하면 된다.
	 * 형식
	 * %d : 정수(decimal, 10진수)가 들어갈 자리
	 * %f : 실수(float)가 들어갈 자리
	 * %c : 문자(character)가 들어갈 자리
	 * %s : 문자열(String)이 들어갈 자리
	 */
	public void printfTest(){
		
		//정수 테스트(%d)
		int iNum1 = 10;
		int iNum2 = 20;
		
		// iNum1 : xx, iNum2 : xx => 이런 형식으로 출력한다.
		// println 사용
		System.out.println("iNum1 : "+iNum1+", iNum2 : "+iNum2);
		// printf 사용
		System.out.printf("iNum1 : %d, iNum2 : %d",iNum1,iNum2);
		
		// 정수테스트(%d)
		System.out.println("\n"+iNum1 + " + " +iNum2 + " = " + iNum1+iNum2);
		System.out.println(iNum1 + " + " +iNum2 + " = " + (iNum1+iNum2));
		// 괄호를 사용하지 않으면 연산작용이 아닌 문자열로 취급한다.
		
		System.out.printf("%d + %d = %d \n",iNum1,iNum2,(iNum1+iNum2));
		// 줄바꿈이 되지 않아 개행도 추가해준다.
		
		// 함께 사용할 수 있는 옵션
		System.out.printf("%5d \n",iNum1); // 5칸의 공간 중 오른쪽 정렬을 함.
		System.out.printf("%-5d \n" ,iNum2); // 5칸의 공간 중 왼쪽 정렬을 함.
		
		// 실수테스트(%f)
		double dNum = 4.27546789;
		System.out.printf("dNum : %f \n",dNum); 
		// 4.275468이라는 값이 나온다.
		// %f : 소수점 아래 7번째 줄에서 반올림이 되어 소수점 아래 6번째까지만 출력된다.
		System.out.printf("dNum : %.1f \n",dNum);
		// 4.3이라는 값이 나온다.
		// 소수점 아래 2번째 줄에서 반올림이 되어 소수점 아래 1번째까지만 출력된다.
		
		// 문자 및 문자열 테스트(%c, %s)
		char ch = 'a';
		String str = "Hello";
		System.out.printf("%c %s \n",ch,str);
		// a Hello라는 값이 나온다.
		System.out.printf("%c    %s \n",ch,str);
		System.out.printf("%c \t %s \n",ch,str);
		// \t : Tab키를 한번 누른 효과를 준다.
		// \n : Enter키를 한번 누른 효과를 준다.
		
		// 옵션
		System.out.printf("%C %S",ch, str);
		// 알파벳 소문자일 경우, 대문자로 바꾸어서 출력한다.
		
		/*
		 * printf : 포맷 한 번을 제시하여 간편하게 출력할 수 있게 해준다.
		 * 	                  단, 지정한 Format의 종류와 개수 and Variable의 종류와 개수가 맞아야 한다.
		 */
	}
}
