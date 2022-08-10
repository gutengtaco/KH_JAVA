package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
//		형변환에서의 값처리규칙
//		1. 대입연산자를 기준으로 좌항, 우항의 자료형이 같아야한다.
//		2. 같은 자료형끼리만 연산이 가능하다.
//		3. 연산결과도 같은 자료형이어야 한다.
//		다형성에서도 마찬가지의 규칙이 적용됨.
		
//		1. 부모타입의 참조형 변수(레퍼런스 변수)로 부모 객체를 다루는 경우
//		=> 말은 어렵지만, 지금까지 객체를 생성하는 방식임.
		System.out.println("1. 부모 타입의 참조형변수로 부모 객체를 다루는 경우");
		Parent p1 = new Parent();
//		좌항의 Parent와 우항의 Parent()로 자료형이 같은것을 볼 수 있음.
		p1.printParent();
//		p1이라는 참조형 변수로, Parent클래스에 있는 메소드 접근 가능.
//		"나는 부모다"
//		p1.printChild(); 아무리 상속관계여도, 부모에서 자식에 있는 메소드는 호출할 수 없음.
//		참고 : 자식에서 부모에 있는 메소드는 호출이 가능했었음.
		
//		2.자식타입의 참조형 변수(레퍼런스 변수)로 자식 객체를 다루는 경우
		System.out.println("2. 자식 타입의 참조형변수로 부모 객체를 다루는 경우");
		Child1 c1 = new Child1();
//		좌항의 Child1과 우항의 Child1()로 자료형이 같은것을 볼 수 있음.
		c1.printChild1();
		c1.printParent();
//		c1이라는 참조형 변수로, Parent클래스와 Child1클래스에 있는 메소드 접근 가능.
//		"나는 자식1이다."
//		"나는 부모다"
		
//		3.부모타입의 참조형 변수(레퍼런스 변수)로 자식 객체를 다루는 경우
		System.out.println("3. 부모 타입의 참조형변수로 자식 객체를 다루는 경우");
		Parent p2 = /*(Parent)*/ new Child1();
//		좌항은 Parent, 우항은 Child1으로 자료형이 다름.
//		형변환때를 생각해보면, 대입연산자를 기준으로
//		좌항 > 우항 이면 자동형변환이 일어났었음.
//		=> Child1타입의 객체가 new구문에 의해 생성되고 나서, 
//		=> Parent형으로 자동형변환이 일어나서 주소값에 담긴 것으로 유추 가능.
//		=> "상속"이라는 구조가 전제로, 클래스 간에 형변환이 가능하다.
		
		p2.printParent();
//		p2라는 참조형변수로 Parent클래스에 있는 메소드 접근 가능.
		((Child1)p2).printChild1(); 
//		단, p2를 Child1형으로 강제형변환을 하게 된다면, Child1클래스의 메소드로 접근 가능.
//		점(.)이 괄호보다 우선되는 연산자이기 떄문에, 
//		괄호를 두번 쓰지 않으면 호출을 먼저 수행해서 오류가 남.
		
//		Child1 --------> Parent : 자동 형변환.
//		Parent --------> Child1 : 강제 형변환.
		
		/*
		 * 클래스 간에 형변환이 가능함.(단, 상속 관계일 경우에만 가능.)
		 * 1. 업캐스팅(Up-Casting) : 자식타입이 부모타입으로 변경되는 자동형변환을 일컬음.
		 * 							 형변환 연산자를 생략 가능함.
		 * 2. 다운캐스팅(Down-Casting) : 부모타입이 자식타입으로 변경되는 강제형변환을 일컬음.
		 * 								 형변환 연산자를 생략 불가함.
		 * 
		 *
		 */
		
//		다형성을 쓰는 이유 : 객체배열을 편리하게 쓰기 위해서
//		Child1 객체 2개, Child2 객체 2개가 필요한 상황이라고 가정	
//		객체 배열을 이용하여, Child1은 child1끼리, Child2는 Child2끼리 묶음.
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(2,1,5); 
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5,7,2);
		arr2[1] = new Child2(2,3,5);
		
//		배열의 특징 : 한가지 자료형의 여러값들을 묶어서 보관 가능.
//		=> 원래 배열은 한가지 자료형만 담을수 있기 때문에, Child1, Child2에 해당되는 배열을 각각 한개씩 만들어주어야 했다면,
//		이제는 다형성을 적용하여, 부모 타입의 객체배열 하나로 다양한 자식 객체들을 한번에 담아서 보관하겠다.
		
		System.out.println("===== 다형성을 접목한 객체배열=====");
//		부모타입의 객체 배열을 1개 생성
		Parent[] arr = new Parent[4];
//		=> 원래는 Parent타입의 객체만 4개 들어갈 수 있음.
//		=> 여기서, '자식이 부모로 자동형변환이 된다.'라는 점을 이용하여, 부모객체만 넣을 수 있는 배열에 자식객체를 넣는다면?
		arr[0] = /*(Parent)*/new Child1(1,2,4);
		arr[1] = /*(Parent)*/new Child1(2,1,5);
		arr[2] = /*(Parent)*/new Child2(5,7,2);
		arr[3] = /*(Parent)*/new Child2(2,3,5);
//		Child1, Child2 객체가 Parent 객체로 자동형변환이 되어 객체배열에 담길 수 있게 됨.
//		다형성이라는 개념을 통해서, 값을 한번에 묶어서 보관이 가능한 상태가 됨.
		
		arr[0].printParent();
		arr[1].printParent();
		arr[2].printParent();
		arr[3].printParent();
//		Parent객체로 자동형변환되어 printParent메소드를 사용할 수 있음.
		
		System.out.println();
		((Child1)arr[0]).printChild1();
		((Child1)arr[1]).printChild1();
		((Child2)arr[2]).printChild2();
		((Child2)arr[3]).printChild2();
		System.out.println();
		((Child1)arr[0]).printParent();
		((Child1)arr[1]).printParent();
		((Child2)arr[2]).printParent();
		((Child2)arr[3]).printParent();
//		Child1, Child2로 강제형변환되어 printChild1, printChild2메소드를 각각 사용할 수 있으며, 
//		상속으로 각각 printParent메소드를 사용할 수 있음.
//		=>부모타입의 배열에 담을때에는 자동형변환으로 가능하지만, 꺼내서 처리를 하려면 강제형변환으로 원상복구하고 사용해야 함.
		
//		((Child2)arr[0]).printChild2();
//		[오류메세지]
//		java.lang.ClassCastException
//		클래스 간의 형변환이 잘못 되었을 경우 발생하는 에러
//		Child1으로 바꾸어야 할 형변환을 Child2로 바꾸어서 생기는 에러임.
//		즉, 자식간에는 상속관계가 아니기 때문에 다형성이 발생하지 않음.
		
//		배열을 사용하는 이유는 반복문을 사용하기 위해서임!!!!!
		System.out.println();
		System.out.println("====== 반복문을 이용해보기 =====");
		for(int i=0 ; i<arr.length; i++) {
//			((child1) 또는 (Child2)arr[i]).printChild1() 또는 printChild2(); 
//			배열의 인덱스별로, 실제로 참조하고 있는 자식클래스로 다운캐스팅을 한 다음에, 메소드를 호출해야 함.
			
//			instanceof 연산자
//			=> 현재 객체가 실제로 어떤 자식클래스의 주소를 참조하고 있는지 확인하고자 할때 사용.
//			[표현법]
//			객체명(객체배열명) instanceof 검사하고 싶은 클래스명
//			맞다면 true, 아니면 false
//			Quiz.
//			1. 부모객체 instanceof 부모클래스 == true
//			2. 자식객체 instanceof 부모클래스 == true	(부모님꺼는 내꺼니깐)
//			3. 부모객체 instanceof 자식클래스 == false	(내꺼만 내꺼니깐)
//			4. 자식객체 instanceof 자식클래스 == true
			
//			방법1
			/*
 			if(arr[i] instanceof Child1) { // arr[i]가 원래는 Child1 형태라면
				((Child1)arr[i]).printChild1();
			}else { // arr[i]가 원래는 Child2 형태라면
				((Child2)arr[i]).printChild2();
			}
			*/
//			방법2
//			부모클래스에 print메소드를 만들어서
//			각각의 자식 클래스에도, 같은 이름으로 내용만 달리하여, print메소드를 오버라이딩하여 작성함.
//			동적바인딩에 의해, 같은 메소드명이면 부모클래스보다 자식클래스의 메소드를 먼저 호출함.
//			*동적바인딩 : 실질적으로 참조하고 있는 자식클래스의 오버라이딩된 메소드를 찾아가서 알아서 실행함.
			arr[i].print();
//			여기에서는 조건을 이용한 instanof연산자를 사용할 필요도 없고, 강제형변환을 해줄 필요도 없음.
//			(오버라이딩을 이용한 것이기 때문에, 굳이 다형성의 형변환을 사용할 필요가 없음)
			
 		}
		/*
		 * 객체지향 프로그래밍(OOP:Object Oriented Programming)
		 * 1. 캡슐화 : 정보은닉(필드에는 private, 간접접근으로 getter/setter메소드)
		 * 2. 상속 : 공통적인 내용물을 추출하여, 부모클래스로써 정의하고, 이를 자식클래스에서 가져다 쓰는 기능
		 * 3. 다형성 : 상속된 관계에서 객체간의 형(Class)변환(UpCasting, DownCasting)
		 */
		
		
		
	}
}
