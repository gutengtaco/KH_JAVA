package com.kh.chap01_abstraction.model.vo;

/*
 * 클래스의 구조
 * public class 클래스명{
 * 		
 * 		// 필드부
 * 
 * 		// 생성자부
 * 
 * 		// 메소드부
 * 		public void method1(){}
 * 
 * }
 */

// 학생들을 추상화해서 만든 클래스	
public class Student {
	
//	[필드부]
//	 필드 : 클래스 안의 변수(값 1개를 담는 공간) => 자료형 변수명;
//		   메소드 안의 변수는 "지역변수", 클래스 안의 변수는 "전역변수"라고 함.
//	 접근제한자 자료형 필드명;
//	 접근제한자 : 이 필드에 접근할 수 있는 범위를 제한할 수 있는 키워드
//	       	 (public> protected> default> private)
//	                     클래스 영역 안에서 필드를 선언할 때 반드시 접근제한자를 써주어야 함.
//	                     생략할 경우에는 자동적으로 default로 잡힘
//            public은 다른 패키지에서, default는 같은 패키지에서 해당 필드명을 사용하게 해줌.
	/*
	 * 캡슐화 : 필드에 담긴 값을 숨겨줌.
	 * 1단계) 접근 제한자 부분을 'private'로 바꿔줌.
	 * => 값을 바꿔야 할 일이 생겨도 값에 접근하지 못하여 바꾸지 못함 
	 * 2단계) 간접적으로 값을 조회하거나, 대입할 수 있는 메소드를 만들어줌.
	 *       : getter / setter 메소드
	 *       =>다만, 해당 메소드는 항상 접근 가능하게 'public'으로 작성함.
	 */
	// public에서 private로 바꾼 순간, Run클래스의 모든 필드변수가 사용불가함.
	public String name;		
	public int age;
	public double height;
	
//	[생성자부]
	
//	[메소드부]
	/* 각 기능들을 구현하는 부분
	 *
	 * ↓ 매개변수(재료)
	 * 		접근제한자 void(또는 반환할 결과의 '자료형') 메소드명(매개변수 => 생략가능){
	 *          	=> 결과를 보여주지 않는 대신 자료형이라도 보여주겠다는 뜻.
	 *         		=> void : 반환할 결과값이 없다는 뜻. 임의로 값을 대입해주어도 됨.
	 *         		=> return :  호출된 명령으로 값을 반환한다는 의미임.
	 * 		}
	 * ↓ 결과값
	 * 
	 */
//	데이터를 기록 및 수정하는 기능의 메소드 : setter메소드
//	=> 실행 내용이 필드에 값을 대입하는 구문 형식으로 작성
//	=> 필드에 값을 변경하지 못하게 하려면, setter메소드를 작성하지 않으면 됨.
//	=> 이 메소드는 필드에 접근 가능하도록 하기 위해 public을 사용함.
	
// 		이름값을 기록 및 수정할 수 있는 기능의 메소드(name이라는 필드에 값을 대입하는 용도)
		public void setName(String name) { 
								// 매개변수는 for문의 초기식과 같음.
								// 매개변수(지역변수)가 필드변수(전역변수)보다 우선순위가 높음.
			this.name = name;
			// String name은 메소드의 변수이고
			// this.name은 필드의 변수임.
			// => this는 현재의 필드(클래스)를 가리킴.
			// this를 빼게 되면, name=name;으로 매개변수로만 코드를 구성하게됨.
			// => 오류는 뜨지 않지만, 매개변수로 매개변수를 수정하겠다고 하여 메소드가 쓸모없게됨.
			// this.name = name;로 하여 필드변수 = 매개변수;로 하여 우선순위를 차등하여
			// 이는, 메소드의 변수로 필드의 변수를 수정하겠다는 뜻임.
		}
//		나이값을 기록 및 수정할 수 있는 기능의 메소드(age라는 필드에 값을 대입하는 용도)
		public void setAge(int age) {
			
			this.age = age;
		}
//		키값을 기록 및 수정할 수 있는 기능의 메소드(height라는 필드에 값을 대입하는 용도)
		public void setHeight(double height) {
			this.height = height;
			
		}
//	데이터를 반환해주는 기능의 메소드 : getter메소드
// 	name이라는 필드에 담긴 값을 돌려주는 용도의 메소드
//		이름값을 반환해주는 기능의 메소드
		public String getName() {
			  // 결과값을 return으로 돌려보내 결과물을 반환해야하므로
			  // void가 아닌 반환형을 씀.
			
			return name;
			// 반환할 내용 => return 내용물;
			// 값을 변경하려는 것도 아니고,
			// 메소드 내에 매개변수가 존재하지 않기 때문에
			// 굳이 this를 붙이지 않음.
		}
//		나이값을 반환해주는 기능의 메소드
		public int getAge() {
			
			return age;
		}
//		키값을 반환해주는 기능의 메소드
		public double getHeight() {
			
			return height;
		}
		
//		이처럼, 캡슐화는 getter, setter메소드들을 만들어주는 것을 의미함.
//		필드마다 꼭 1개씩은 만들어주어야 함.
		
}



