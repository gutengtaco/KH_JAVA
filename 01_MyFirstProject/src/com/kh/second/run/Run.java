package com.kh.second.run;

import com.kh.first.HelloEveryone;
import com.kh.second.MethodTest; // 해당 Package에 있는 해당 Class를 가져다 쓴다.(Import문)

//com.kh.second.run.Run
public class Run { // Class안에 Source Code를 작성한다.
	
	// main Method
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");
		/*
		 * 같은 Class에 존재하는 Method를 호출하는 경우
		 * => 호출하고자 하는 Method명();
		 * 지금은 서로 다른 Class에 존재하는 Method를 호출하고자 함
		 */
		
		// 1. 호출할 Method가 존재하는 Class를 찾아야 한다.
		// => 호출할 Method가 존재하는 Class를 생성(new)이라는 것을 해야 한다.
		// [표현법] MethodTest(클래스명) mt(대변할 이름) = new MethodTest(클래스명)();
		// MethodTest mt = new MethodTest();
		// => 기본적으로 현재 같은 Package내에 해당 이름을 가진 Class를 찾는다.
		// => Run Class기준에서 MethodTest Class가 다른 Package에 존재하기 때문에 오류가 뜬다.
		// [참고] static 키워드를 붙이면 위의 과정을 생략할 수 있다.
		
		// [해결방법] 
		// 1. 해당 Class가 정확히 어느 Package에 있는 Class인지 명시해준다.
		// => com.kh.second.MethodTest mt = new com.kh.second.MethodTest();
		// 2. Class명만 가지고 작성을 하되, 이 Class가 어떤 Package를 속해있는지의 선언문을 추가한다.
		// => import com.kh.second.MethodTest;
		MethodTest mt = new MethodTest();
		
		// 2. 생성 후 해당 Class에 있는 Method를 호출한다.
		// [표현법] 대변할 이름.호출하고자 하는 Method명();
		
		/*
		mt.testPrintA();
		mt.testPrintB();
		mt.testPrintC();
		*/
		
		// testPrintA Method를 한번만 호출해서 A,B,C 모두 호출하는 결과를 얻고싶다.
		mt.testPrintA();
		
		// 일반 Method : 호출에 의해서만 실행이 되는 Method
		// main Method : 시작 시점에서 실행되는 Method
		// => main Method를 호출해서 사용할 수 있는가?
		// => 정답은 Yes
		// public static이라는 키워드가 붙은 다른 Class의 Method를 호출한다.
		// Import문을 통해 서로 다른 Package와 서로 다른 Class를 호출한다.
		// [표현법] 해당Class명.Method명();
		HelloEveryone.main(null); // null : 값이 없음을 의미하는 값.
	}
	
}
