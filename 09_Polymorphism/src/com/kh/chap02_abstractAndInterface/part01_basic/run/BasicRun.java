package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;

public class BasicRun {

	public static void main(String[] args) {
		/*
		 * Sports
		 * Basketball
		 * Football
		 */
		
//		Sports s = new Sports();
//		[오류메세지]
//		Cannot instantiate the type Sports
//		객체를 생성하지 못한다는 오류임.
//		추상클래스는 미완성된 클래스이기때문에 객체 생성이 불가함.
		
		Sports s1;
//		객체생성은 불가능하나, 참조형 변수로 선언은 가능함.
//		추상클래스 : 다형성을 적용해서, 자식객체를 받아주는 용도로는 사용이 가능함.
		Sports s2;
		s1 = /*(Sports)*/new Basketball();
		s2 = /*(Sports)*/new Football();
		
		Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		/*
		 * 추상클래스(미완성된 클래스) : abstract class
		 * => 추상메소드가 존재하는 순간, 반드시 추상클래스로 정의(간주됨.)
		 * (일반필드 + 일반메소드+ 추상메소드)
		 * => 단, 추상메소드가 없어도 클래스명 앞에 abstract를 붙여도 추상클래스로 만들 수 있음.
		 * => 객체생성이 불가능해짐(단, 참조형 변수로 자식객체를 담을때는 사용 가능 => 다형성 적용)
		 * 
		 * 추상클래스가 필요한 때
		 * => 자식클래스들에게 일정한 규칙을 부여하고 싶을 때 쓰면 좋음.
		 * => 클래스가 아직 구체적이지 않은, 덜 구현된 상태인 것 같을때
		 * => 현재, 이 클래스에 대한 객체 생성을 애초에 막고 싶을때
		 * 
		 * 추상메소드
		 * 미완성된 메소드로, 몸통부({})가 구현되어있지 않은 메소드
		 * 자식클래스에서 오버라이딩을 통해 완성되는 메소드(강제로 오버라이딩을 해야함)
		 * =>오버라이딩을 하지 않았을 경우, 에러가 발생
		 * =>메소드 사용에 강제성(통일성)을 주는 것임.
		 * =>표준화된 틀을 제공할 목적으로도 사용됨.
		 * 
		 */
	}

}
