package com.kh.run;

import com.kh.array.A_Array;
import com.kh.array.B_ArrayCopy;
import com.kh.array.C_DimensionalArray;

public class Run {

	public static void main(String[] args) {
//		지금까지 썼었던 실행방식도
//      a라는 변수가 stack영역에 공간을 확보하고
//		new구문이 실행되며 heap영역에 공간을 확보하고고
//		heap영역의 주소값이 a라는 변수에 담기는 것임.
//		다만, 배열처럼 방이 나눠진 상태는 아님. 
//		=> 참조형 변수
		A_Array a = new A_Array();
//	 	a.method1();
		
//      System.out.println(a);
//		마찬가지로, com.kh.array.A_Array@6d06d69c라는 주소값이 담김 - Stack영역
//      a.method2();
//		a.method3();
//		a.method4();
//		a.method5();
//		a.method6();
//		a.method7();
//		a.method8();
//		a.method9();
//		a.method10();
//		B_ArrayCopy b = new B_ArrayCopy();
//		b.method1();
//		b.method2();
//		b.method3();
//		b.method4();
//		b.method5();
		C_DimensionalArray c = new C_DimensionalArray();
		c.method1();
//		c.method2();
//		c.method3();
//		c.method4();
//		c.method5();
		
	}

}
