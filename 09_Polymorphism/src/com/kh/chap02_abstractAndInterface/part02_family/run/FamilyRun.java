package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;

public class FamilyRun {

	public static void main(String[] args) {

//		객체 생성 테스트
//		Person p = new Person();
//		추상클래스는 미완성된 상태라서, 객체생성이 되지 않음.
//		Person p ; => 선언은 가능함.
//		
//		다형성을 이용하여 객체 생성 => 선언은 가능 + 자식객체를 담음.
//		Person p1 = new Mother("김엄마", 50, 70, "출산");
//		Person p2 = new Baby("김애기", 3.5, 70);
//		
//		기존의 Object클래스의 toString을 오버라이딩.
//		오버라이딩으로 인해, 객체명만 제시해도 동적바인딩으로, 주소값이 아닌 원하는 형태로 출력됨.
//		System.out.println(p1/*.toString*/);
//		System.out.println(p2/*.toString*/);
//		
//		p1.eat(); 	// 엄마 : 몸무게 +10, 건강도 -10
//		p1.sleep(); // 엄마 : 건강도 +10
//		p2.eat();	// 애기 : 몸무게 +3, 건강도 +1
//		p2.sleep();	// 애기 : 건강도 +3
//
//		System.out.println("======== 다음날 =======");
//		System.out.println(p1);	// 엄마 : 몸무게(50->60) , 건강도 변경없음
//		System.out.println(p2); // 애기 : 몸무게(3.5->6.5), 건강도(70->74)
//		아무리 Person클래스의 eat, sleep메소드가 미완성된 상태라도
//		동적바인딩에 의해, 각각 오버라이딩되어서 완성된 형태의 메소드가 호출됨.
//		
//		인터페이스 적용 후
//		객체생성 테스트
//		Basic s = new Basic(); 인터페이스는 객체생성이 되지 않음.
		Basic b1 = new Mother("김엄마",50,70,"출산");	// 다형성으로 객체 생성 가능
		Basic b2 = new Baby("김애기",3.5,70);
		
		System.out.println(b1/*.toString*/);
		System.out.println(b2/*.toString*/);
		
		b1.eat();
		b1.sleep();
		b2.eat();
		b2.sleep();
		
		System.out.println("========다음날=======");
		System.out.println(b1);
		System.out.println(b2);
//		Person에 의한 추상클래스 사용이나
//		Basic에 의한 인터페이스나 로직이나 결과는 똑같음.
//		=> 굳이 인터페이스로 정의부분을 빼놓을 필요는 없음.
//		=> 단, 사람이라면 반드시 해야하는 행위에 대한 구현을 강제로 하여 인터페이스로 구현한 것 뿐!!
	}

}
