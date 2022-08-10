package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Book;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
//		person이라는 클래스로부터 객체를 생성
//		Person클래스가 내가 만든 자료형이 됨.
//		=> 여러개의 자료형 변수(필드변수)들을 한개의 묶음으로 보관하겠다는 의미.
//		p는 객체 혹은 변수명을 의미함.
//		=> 내가 만든 자료형에 해당되는 변수(new로 인한 참조형 변수 == 객체 == 인스턴스)
//		=> System.out.println(p);
//		=> p라는 클래스의 주소값이 나옴.
		
//		Person p = new Person();
//		
//		System.out.println(p.information());
//		각 필드에는 기본값이 들어감
//		=> 기본형은 0, 0.0, ' '(공백) / 문자형은 null
//		
//		값 넣기 => setter 메소드
//		p.setId("user01");
//		p.setPwd("pass01");
//		p.setName("홍길동");
//		
//		System.out.println();
//		System.out.println(p.information());
//		
//		p.setAge(23);
//		p.setGender('남');
//		p.setPhone("010-1111-2222");
//		p.setEmail("aaa@naver.com");
//		
//		System.out.println();
//		System.out.println(p.information());
		
		Product p1 = new Product();
		
		p1.setpName("아이폰11");
		p1.setPrice(1300000);
//		p1.setBrand("애플");
//		System.out.println(p1.information());
		
		Product p2 = new Product();
		
		p2.setpName("애플워치");
		p2.setPrice(600000);
//		p2.setBrand("애플");
//		System.out.println(p2.information());
		
//		이렇게 애플 제품만 담고싶을 경우에는?
//		setter메소드를 사용하는 대신 
//		필드변수의 값을 초기화해주면 됨.
//		private String brand = "애플";
		
		p1.setBrand("apple");
		System.out.println(p1.information());
		System.out.println();
		System.out.println(p2.information());
//		이런식으로 "애플"이라는 기본값을 "apple"로 변경하여 호출할 수도 있음.
		
		System.out.println();
		Book b = new Book();
		System.out.println(b.information());
	}

}
