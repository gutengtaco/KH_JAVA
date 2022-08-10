package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
//		상속테스트
		Desktop d = new Desktop("삼성","d-01","짱짱데스크탑",2000000,true);
//		Desktop의 매개변수생성자로 이동 => super()생성자로 Product의 매개변수 생성자로 이동 
//		=> Desktop로 다시 이동해서 값 대입 
		System.out.println(d.information());
//		=> Desktop의 매개변수생성자의 값을 호출함.
		
		SmartPhone s = new SmartPhone();
		s.setBrand("애플");
//		SmartPhone에 setBrand라는 메소드를 만들지 않았는데도, 잘 작동됨.
		s.setpCode("s-01");
		s.setpName("아이폰");
		s.setPrice(1000000);
		s.setMobileAgency("SKT");
		System.out.println(s.information());
//		SmartPhone에 information()을 만들어주면 정상작동함.
		
		Tv t = new Tv("엘지","t-01","고오급벽걸이TV",3000000,60);
		System.out.println(t.getBrand());
		System.out.println(t.getpCode());
		System.out.println(t.getpName());
		System.out.println(t.getPrice());
//		Tv에 getterBrand,pCode,pName,Price가 없음에도 잘 실행됨.
//		이는, 자식클래스에는 없지만, 부모클래스에는 있어서 사용할 수 있음.
		System.out.println(t.getInch());
//		System.out.println(t.information());
//		Tv에 information에서 가격까지만 찍힘.
		System.out.println(t.information());
//		Tv에 information을 만들어서 정상적으로 인치까지 찍힘.
//		내가 실행하고자 하는 메소드가 자식 클래스에 없다면,
//		자동으로 부모 클래스에 있는 메소드로 직행함.
//		내가 실행하고자 하는 메소드가 자식 클래스에 있다면,
//		자동으로 자식 클래스에 있는 메소드로 직행함.
//		이를 '동적바인딩'이라고 함.
		
		/*
		 * 상속의 장점
		 * 보다 적은 양의 코드로, 새로운 클래스들을 관리 가능
		 * 중복된 코드를 부모 클래스에서 공통적으로 관리하여, 새로운 코드를 추가, 수정하기 용이함.
		 * (상속 사용 안할 시, 수정할때마다 매번 각각의 클래스의 코드를 수정해주어야 함.)
		 * => 프로그램의 생산성을 높여줄 수 있음
		 * 
		 * 상속의 특징
		 * - 클래스간의 상속은 다중상속이 불가능함. 단일상속만 가능함.
		 *   (나를 기준으로 부모님이 여러명이면 안됨)
		 * - 자바에서 제공하는 또는 내가 만든 모든 클래스는 Object라는 클래스의 후손임.		 
		 * 	 (extends Object가 명시되어 있지는 않지만, 생략되어 있음.)
		 * - Object클래스에 있는 메소드를 가져다 쓸 수 있음.
		 * - Object클래스에 있는 메소드가 맘에 안든다면, 오버라이딩하여 입맛에 맞게 사용 가능.
		 *    
		 */
	}

}
