package com.kh.chap01_abstraction.run;

import com.kh.chap01_abstraction.model.vo.Student;

public class Run {

	/*
	 * 1. 객체지향언어 : "객체"를 "지향"하는 언어로
	 * 	"객체"를 중심으로 돌아가는 언어를 뜻함.
	 * 
	 * 2. 객체
	 * 	사전적 의미로, 현실세계에 독립적으로 존재하는 모든 것들을 의미.
	 * 	목적이 있고, 의미가 있는 독립적인 객체.
	 * 
	 * 3. 객체지향 프로그래밍
	 *  현실 세계에서 독립적인 존재(객체)들 간의 상호작용(행동,행위)을 만들어냄
	 *  ex) '사람'이 '공기'를 '마신다.'
	 *  => 프로그래밍을 통해 가상세계(코드)를 구현하는 과정임. 
	 *  
	 * 4. 구현하고자 하는 프로그램상의 필요한 객체를 만들기 위해서는
	 *  "클래스"라는 틀을 먼저 만들어야 함.
	 *  => 기존의 클래스 개념 : 비슷한 역할을 하는 코드들의 모임.(변수, 메소드를 묶은 단위)
	 *  => 객체지향 클래스  : 각 객체(부품)들의 속성(변수,메소드=> 정보)을 
	 *  				  담아낼 수 있는 그릇(설명서).
	 *  
	 * 5. 현실세계를 프로그램 코드로 구현하는 단계
	 *  1단계. 추상화
	 *  2단계. 캡슐화
	 * 
	 * 6. 추상화 과정 : 현살세계의 것을 코드로 어떻게 구현할건지 생각하는 단계
	 * 		1) 내가 만들고자 하는 프로그램에서 필요한 객체를 생각함.
	 * 			예) 학생 관리 프로그램 => 학생(객체) : 홍길동, 김갑생, 박말똥,...
	 * 		2) 객체들이 가지고 있는 공통적 특성, 기능을 최대한 많이 추려냄.
	 * 			예) 성별, 키, 몸무게, 성적, 이름, 나이, 주소, 발사이즈, 혈액형, 연락처,..
	 * 		3) 추출한 것들을 가지고, 내가 구현할 프로그램에 실질적인 목적에 맞게 
	 * 		      불필요한 속성과 필요한 속성을 나눌 것
	 * 			예) 학생 관리 프로그램 : 이름, 나이, 성별, 성적, 장래희망, 학년, 연락처,...
	 * 		4) 최종적으로 추려진 것들을 가지고 자료형,변수를 정의함.
	 * 			예) String name, int age, char gender,...
	 *  		
	 *  예) 학생 관리 프로그램
	 *  1단계) 학생과 관련된 객체 : 홍길동, 김영희, 박말똥,...)
	 *  2단계) 공통적 속성, 기능을 추려냄 : 이름, 나이, 주소, 전화번호, 키, 달리기속도, ...
	 *  	                                                 밥을 먹는다, 잠을 잔다, 공부한다,숨을 쉰다... 
	 *  3단계) 프로그램의 실질적인 목적에 맞게 더 추리기
	 *  	    학생의 "인적사항"을 관리하는 프로그램 : 이름, 나이, 성별, 주소, 전화번호, 학년, 반 
	 *        학생의 "성적"을 관리하는 프로그램 : 이름, 학년, 반, 학번, 과목점수, 출석
	 *        학생의 "건강"을 관리하는 프로그램 : 이름, 학년, 키, 몸무게, 달리기속도
	 *        => 이렇게 추려내는 과정이 '설계'라고 함.
	 *  4단계) 최종적으로 추려낸 것 : 이름, 나이, 키
	 *  	  이름 : String name;
	 *       나이 : int age;
	 *       키 : double height;
	 * 
	 * 7. 위에 선정된 것들을 가지고 본격적으로 프로그래밍 해보기
	 *  1) "변수"만을 가지고 프로그래밍을 한다면?
	 *  변수 : 하나의 자료형, 하나의 값만 보관 가능한 개념.
	 *  객체를 하나 만들기 위해서 필요한 변수의 개수 : 9
	 *   => String name1 = "홍길동"; int age1 = 20; double height1 = 170.1; 
	 *   => String name2 = "고영희"; int age2 = 21; double height2 = 168.0; 
	 *   => String name3 = "박말똥"; int age3 = 25; double height3 = 185.3;
	 *   ....
	 *   만약 150명이라면, 위의 과정이 150개가 필요함. 만들기도 힘들고, 유지보수도 힘듬.
	 * 
	 *  2) "배열"을 가지고 프로그래밍을 한다면?
	 *  배열 : 하나의 자료형, 여러개의 값을 보관 가능한 개념.
	 *  객체를 하나 만들기 위해서 필요한 배열의 개수 : 3
	 *   => String[] names = {"홍길동","고영희","박말똥",....}
	 *   => int[] ages =     {20,     21,    25,....}
	 *   => double[] heights = {170.1,  168.0  185.3,....}
	 *   => 인덱스의 번호만 잘 안다면, 유용하게 활용할 수 있음.
	 *   => 다만, 인덱스에 변화가 생기면(전학간다던가) 순서가 어긋날 수 있음.(실수할 가능성이 높아짐)
	 *   => 한번 정해진 배열의 크기는 변하지 않음.(정원초과시, 배열을 다시 만들고, 배열복사를 해야함.)
	 *  
	 *  3) "변수"와 "배열"의 단점을 해결하기 위해 "구조체"라는 개념이 등장.
	 *   => 구조체 : 한번에 여러 개의 자료형, 여러 개의 값을 보관 가능한 개념.
	 *   => String 값도 보관가능하고, int값도 보관할 수 있고, double값도 보관할 수 있는 배열같은 형태로
	 *      나만의 자료형을 만들어 보자!
	 *   => 이를 Java에서는 "클래스"라고 함.
	 *   (String, int, double, char, 메소드들을 한번에 담을 수 있는 그릇)
	 *   
	 *   클래스 : 각 객체들의 속성 정보들을 담아내는 그릇과도 같은 존재(틀) =>VO(Value Object)
	 *    예) Student => String name; int age; double height;
	 * 
	 *    
	 * [참고]
	 * 변수 선언
	 * 자료형 변수명;
	 * 
	 * 배열 선언
	 * 자료형[] 배열명;
	 * 
	 * 클래스 선언
	 * 클래스명 객체;
	 * Student st = new Student();   	 
	 */
	public static void main(String[] args) {
		
//		변수만을 가지고 프로그래밍을 한다면?
		String name1 = "홍길동";
		int age1 = 20;
		double height1 = 170.4;
		
//		클래스라는 개념을 가지고 프로그래밍을 할 것!
		
//		1. Student라는 클래스를 만들었음
//		2. 만들어진 Student라는 클래스를 통해서 객체(참조형 변수)를 생성함.
//		- 배열
//		자료형[] 변수명 = new 자료형[];
//		- 참조형 변수
//		자료형 변수 = new 자료형();
//		배열과 비슷하나, 배열은 같은 자료형, 객체는 다른 자료형을 담을 수 있음.
		
//		Stack           Heap
//		                name  age  height
//		0123            null   0    0.0
//		student  ---->  0123
		
		Student student = new Student();

//		그동안은 메소드를 호출할 때, 객체명.메소드명(); 으로 호출하였음.
//		필드의 이름을 불러와서 거기에 담긴 값을 뽑아오고 싶음.=>객체명.필드명
		
//		3. 필요한 값을 필드에 담기.
		student.name = "홍길동";
		student.age = 20;
		student.height = 170.4;
//		해당 student라는 객체의 각 필드에 직접적으로 접근해서 값을 대입.
		
//		4. 값이 제대로 담겨있는지 출력해보기
		
//		Stack           Heap
//	    			    name  age  height
//		0123                          홍길동      20   170.4
//		student  ---->  0123
		
		System.out.println(student); 
//		String을 제외하고는 참조형 변수는 실제값이 아닌, 주소값이 나온다고 했었음.
//		com.kh.chap01_abstraction.model.vo.Student@6d06d69c
		
		System.out.println(student.name);	// 홍길동
		System.out.println(student.age);	// 20
		System.out.println(student.height);	// 170.4
//		해당 student라는 객체의 각 필드에 직접적으로 접근해서 값을 꺼내옴.
//		여기서 점(.)을 '직접 접근연산자'라고 함.
		
//		ooo님의 나이는 xxx살이고, 키는 xxxcm입니다. 
		System.out.printf("\"%s\"님의 나이는 %d살이고, 키는 %.1fcm입니다."
				,student.name,student.age,student.height);
		
//		Stack           Heap
//       			    name  age  height
//		0123                          홍길동      20   170.4
//		student  ---->  0123
//
//		Stack           Heap
//        				name  age  height
//		1234                          김철수      25   175.3
//		student  ---->  1234
		
		System.out.println();
		Student kim = new Student();
		kim.name = "김철수";
		kim.age = 25;
		kim.height= 175.3;
		System.out.println(kim);
		//com.kh.chap01_abstraction.model.vo.Student@677327b6
		System.out.printf("\"%s\"님의 나이는 %d살이고, 키는 %.1fcm입니다."
				,kim.name,kim.age,kim.height);
//		kim = student;
//		이렇게 작성하면 얕은 복사로, kim을 수정 시 student도 수정됨.
		
		/*
		 * 지금까지, 객체 지향 프로그램 중
		 * 1단계) 추상화 과정을 살펴보았다
		 * => 고민하는 단계(이름, 나이, 키)
		 * => 코딩으로 적용(변수-> 배열-> 클래스)
		 * => student라는 클래스를 생성.
		 * => 필드(변수) : name, age, height
		 * => 생성(new) : Heap에 실제 학생 정보를 담을 공간을 확보 
		 * => 점(.)을 통해 필드에 직접 접근(student.name, age, height)
		 * => 보안의 3요소 : 기밀성, 무결성, 가용성
		 * => 이 과정은 값에 직접 접근을 하여 값을 바꿀 수 있기 때문에
		 * => 조회(기밀성 훼손), 값 대입(무결성훼손(원본훼손))
		 * 
		 * 2단계) 캡슐화 과정
		 * => 위와 같이 보안을 훼손하는 경우를 방지하기 위해 '정보를 은닉'함.
		 * => 그리고, 정보에 대한 직접적인 접근을 막음.
		 * => 여기에 사용되는 개념이 '접근제한자'임.
		 */
		
		/*
		 * 이 시점 기준으로 캡슐화가 완료된 상태.
		 * 캡슐화가 된 상태에서 점(.)을 통해 그대로 접근하면? 
		 * => 그래도, 오류가 뜸.
		 * => The field(클래스명) Student.name(필드명) is not visible
		 * => 해당 클래스의 필드를 찾을수 없다는 뜻.(private에 의해)
		 */
	}

}
