package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	/*
	 * 8. 캡슐화 작업을 통해 완벽한 클래스의 형태를 갖추자
	 * 캡슐화하지않으면 ? 외부로부터 직접 접근이 가능하기때문에
	 * 				값이 변질되거나, 조회를 막지 못하는 문제가 발생.
	 * "객체지향의 설계 원칙 중 정보은닉" 중 하나가 캡슐화임.
	 * "데이터에 직접 접근을 제한"하는 원칙임.
	 * 단, 대신에 값을 간접적으로나마 처리(조회, 대입)할 수 있게끔
	 * 메소드들을 클래스 내부에 만들어서 관리.
	 * 
	 * 캡슐화의 단계
	 * 1) 각 필드에 접근제한자로 private를 붙여서 숨기기.
	 * 	  예 ) 학생 성적 관리 프로그램 : 학생들이 임의로 자신의 성적을 조작하면 안됨.
	 * 						      한 학생의 성적을 다른 학생이 조회하면 안됨.
	 * 2) setter / getter 메소드 만들기
	 * 	  예 ) 학생 성적 관리 프로그램 : 선생님은 학생들의 성적을 기록하거나 수정 가능하게끔 대안책을 마련함.(setter)
	 * 				f		    선생님은 학생들의 성적을 조회할 수 있게끔 대안책을 마련함.(getter)
	 * 3) 정보 출력 메소드 만들기
	 * 매번 정보 출력시 출력문을 작성하기 귀찮으니, information을 만듬.
	 */

	public static void main(String[] args) {
//		1.학생 정보를 담을 객체를 만들기(객체화, 인스턴스화)
		Student hong = new Student();	//import할 시 클래스의 정확한 위치 기입!
//		name=null, age=0, height=0.0(기본값)
		
//		2.초기화 혹은 값 대입 
//		hong.name="홍길동";
//		hong.age=20;
//		hong.height=172.6;
//		캡슐화(private)로 인해 보이지 않게 되어 접근 할 수 없음.
		
//		3. 간접적으로 접근하기
//		getter, setter를 통해 값의 대입,값의 출력을 메소드 호출로 진행함.
//		필드에 직접 값을 대입하는 것이 아닌, 
//		메소드 내에서 필드를 바탕으로 연산작용을 하여, 그 결과를 보여주는 것임.
//		객체명.메소드명();
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(172.6);
		
//		4. 잘 담겨있나 조회.
//		System.out.println(hong.name);
//		System.out.println(hong.age);
//		System.out.println(hong.height);
//		기존의 방법(캡슐화 전)으로는 실행되지 않음.
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
//		잘실행되는 것을 볼 수 있음.
		
//		xxx님의 나이는 xx살이고, 키는 xxxcm입니다. 
//		System.out.printf("%s 님의 나이는 %d살이고, 키는 %.1fcm입니다.",
//				hong.getName(),hong.getAge(),hong.getHeight());
		System.out.println(hong.information());
		
		
//		김영희 학생이라는 객체를 만들어보세요
//		객체명 : kim
//		나이 : 21, 키 : 169.4
		Student kim = new Student();
		
		kim.setName("김영희");
		kim.setAge(21);
		kim.setHeight(169.4);
		
//		System.out.printf("%s 님의 나이는 %d살이고, 키는 %.1fcm입니다.",
//				kim.getName(),kim.getAge(),kim.getHeight());		
		
		System.out.println(kim.information());
		
	}

}
