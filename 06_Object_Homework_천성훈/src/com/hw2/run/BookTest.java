package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		// 기본생성자를 이용하여 첫 번째 Book 객체 생성
		// 매개변수 생성자를 이용하여 두 번째 Book 객체 생성 (사용 데이터 참고)
		// 객체가 가진 필드 값 출력 확인
		Book b1 = new Book();
		Book b2 = new Book("자바의 정석",20000,0.2,"윤상섭");
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println();
		// 첫 번째 객체가 가진 값을 setter를 이용하여 수정
		// 수정된 내용 출력 확인
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		System.out.println(b1.information());
		System.out.println();
		// 각 객체의 할인율을 적용한 책 가격을 계산해서 출력
		// 할인된 가격 = 가격 – (가격 * 할인율)
		b1.setPrice((int)(b1.getPrice()-(b1.getPrice()*b1.getDiscountRate())));
		b2.setPrice((int)(b2.getPrice()-(b2.getPrice()*b2.getDiscountRate())));
		System.out.println("도서명 = "+b1.getTitle());
		System.out.println("할인된 가격 = "+b1.getPrice()+"원");
		System.out.println("도서명 = "+b2.getTitle());
		System.out.println("할인된 가격 = "+b2.getPrice()+"원");
	}

}
