package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException{
		/*
		 * 에러(오류)
		 * 1. 시스템 에러 : 컴퓨터의 오작동으로 인해 발생하는 에러
		 * => 애초에 실행할 환경 자체가 작동되지 않는 에러
		 * => 소스코드를 수정하는 선에서 해결되지 않음.(가장 심각한 에러)
		 * 
		 * 2. 컴파일 에러 : 소스코드상의 문법적인 문제로 발생하는 에러
		 * => 문법에 맞는 코드로 바꾸면 해결할 수 있음.(빨간 밑줄로 알려주는 에러)
		 * 
		 * 3. 런타임 에러 : 소스코드 상으로는 문제가 없으나, 프로그램 실행 중 발생하는 에러
		 * => 사용자의 잘못일수도 있고, 개발자가 예측 가능한 경우를 제대로 처리 안해놓은 것일수도 있음.
		 * 
		 * 4. 논리 에러 : 코드상의 문법적인 문제도 없고, 실행도 잘 됨.
		 * => 다만, 프로그램의 의도상 맞지 않는 오류가 발생함.(예상했던 결과값과 다름)
		 * (True라고 써야할 것을 False로 씀.)
		 * 
		 * 이 중 시스템에러를 제외한, 컴파일 / 런타임 / 논리와 같은 비교적 덜 심각한 에러를
		 * '예외'(Exception)이라고 함.
		 * 
		 * 이러한 예외가 발생했을 때를 대비하여 ,이를 처리할 방법을 정의해둔 것을 
		 * '예외처리'라고 함.
		 * => 만약에 xxx오류가 발생하면 어떤 코드를 실행시킬래?? (일종의 조건문처럼 해석됨)
		 * 
		 * 예외처리를 하는 이유 : 예외 발생 시, 프로그램이 항상 비정상적으로 종료되기때문에, 이를 막고자 함.
		 * => 오류 밑에 제시된 구문은 실행조차 되지가 않음.
		 * 
		 * 예외처리 방법
		 * 1. try~ catch문을 이용
		 * 2. throws를 이용(떠넘기기)
		 * 
		 * 각각의 오류들은 클래스이기 때문에 import문을 써주어야 함
		 * (단, java.lang클래스계열은 import문 생략 가능)
		 */
		
		A_UncheckedException a = new A_UncheckedException();
//		a.method1();
//		a.method2();
//		a.method3();
		
		B_CheckedException b = new B_CheckedException();
		try {
		b.method1();
		} catch(IOException e) {
			System.out.println("예외가 발생됨.");
		}
	}

}
