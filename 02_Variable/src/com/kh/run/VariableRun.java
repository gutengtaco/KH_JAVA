package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Cast;
import com.kh.variable.D_Printf;

public class VariableRun {

	public static void main(String[] args) {
		// 1단계 : 해당 클래스의 대변할 이름 만들기(new)
		A_Variable a = new A_Variable();
		// 2단계 : import하기
		// 3단계 : 호출하기
		//a.printSalary();
		// a라는 대변할 이름도 일종의 변수이기 때문에, 재활용이 가능하다.
		//a.declareVariable();
		//a.intiVariable();
		a.constant();
		//B_KeyboardInput b = new B_KeyboardInput();
		//b.inputTest1();
		//b.inputTest2();
		//b.inputTest3();
		//C_Cast c = new C_Cast();
		//c.autoCasting();
		//c.forceCasting();
//		D_Printf d = new D_Printf();
//		d.printfTest();
	}

}
