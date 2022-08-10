package com.kh.chap04_field.model.vo;

public class Test {

	public static void main(String[] args) {
		FieldTest2 f2 = new FieldTest2();
		// => 같은 패키지 안에 있어, import 필요 없음.
		System.out.println(f2.pub);	// 같은 패키지, 다른 패키지 모두 가능
		System.out.println(f2.pro); // 같은 패키지 가능, 다른 패키지 불가(상속시 가능)
		System.out.println(f2.df); // 같은 패키지에만 가능, 다른패키지 불가
//		System.out.println(f2.pri); // 다른 클래스여서 불가.
	}

}
