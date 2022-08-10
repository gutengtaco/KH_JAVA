package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
//		=====1. FieldTest1 클래스 =====
		FieldTest1 f1 = new FieldTest1();
//		객체 생성시, global이라는 멤버변수를 사용할 수 있고
//		global의 값은 0으로 채워짐(JVM)
//						int global=0;(멤버변수)
		
		f1.test(10); // int num=10;(매개변수)
//						int local = 0;(지역변수)
//		test라는 메소드를 호출시,num이라는 매개변수가 할당됨.
//		이후, 메소드가 시작하며 local이라는 지역변수가 할당됨.
		
//		System.out.println(local);
//		System.out.println(num);
//		메소드가 종료되는 시점에서, num과 local은 지역변수이기 떄문에 사용이 불가능함.
		
		f1 =null;
//		참조하는 연결고리가 끊어짐.
//		이 시점 이후부터는, f1의 행방을 알 수 없음 = 멤버변수,메소드를 사용할 수 없음.
//		System.out.println(global);	// 멤버변수
//		System.out.println(local);	// 지역변수
//		System.out.println(num); 	// 매개변수
		
//		=====2. FieldTest2 클래스 =====	
		FieldTest2 f2 = new FieldTest2();
		System.out.println(f2.pub); // 어디서든 직접접근 가능.
		
//		not visible
//		System.out.println(f2.pro);  같은 패키지O, 다른패키지X(상속시 O)
//		System.out.println(f2.df);  같은 패키지O, 다른패키지X
		
//		System.out.println(f2.pri);  같은 클래스O
		//캡슐화에서 활용했었음.
		
//		=====3. FieldTes3 클래스 =====
		System.out.println(FieldTest3.sta); //클래스변수(static변수,[예약어])
//		객체생성은 안해도, import는 해주어야 함.
//		단, 어느 클래스에 있는지 명확하게 클래스명을 붙어주어야 함.
// 		다른 클래스에 같은 static의 변수명을 입력할 수도 있기 때문임.
		
		FieldTest3 f3 = new FieldTest3();
		System.out.println(f3.sta);
//		객체를 만들어도 되나, 공간낭비임.
//		System.out.println(FieldTest3.str);
//		[오류메세지]
//		Cannot make a static reference to the non-static field FieldTest3.str
//		str은 static영역에 속해있지 않아, 다음과 같이 출력할 수 없음.
		
		FieldTest3.test();
//		변수 이외에도 메소드도 static을 이용하여 다음과 같이 호출할 수 있음.
		
//		static의 가장 대표적인 예 => Math
		
//		FieldTest3.NUM=100;
//		Math.PI = 100;
//		[오류메세지]
//		The final field FieldTest3.NUM cannot be assigned
//		상수는 다른값으로 변경할 수 없음.
		
		System.out.println(FieldTest3.NUM);
		
		
		FieldTest3.sta="값을 변경해볼까";
		System.out.println(FieldTest3.sta);
		
	}

}
