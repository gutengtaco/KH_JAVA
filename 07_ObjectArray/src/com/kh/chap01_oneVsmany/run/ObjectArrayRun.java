package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

// 객체 배열을 이용한 버전
public class ObjectArrayRun {

	public static void main(String[] args) {
		
//		객체 생성시
//		자료형 객체명 = new 생성자명();
		
//		배열을 쓸 준비 => 선언 및 할당
//		자료형[] 배열명 = new 자료형[배열크기];
//		자료형을 클래스명으로 해서 자료형에 제한을 두지 않게 됨.
		
//		객체 배열
//		클래스명[] 객체명 = new 생성자명[배열크기];
		Book[] books = new Book[3];
//		1. Book[] books로 Stack영역에 books라는 공간이 생김
//		2. new Book[3]에 의해 Heap영역에 3칸짜리 빈 공간이 생김.
//		=> 다만, Heap영역에는 빈공간을 허용하지 않아, 기본값인 null로 초기화함.
//		Book bk1 = null;
//		Book bk2 = null;
//		Book bk3 = null;
		
//		stack					  heap	
//		0123		-> 		null  
//		books				null      
//							null      
//							0123
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<books.length; i++) {
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자 : ");
			String author = sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
				books[i] = new Book(title,author,publisher,price);
//				객체배열인 books[0]번째 방에 객체를 하나 만들어서, 매개변수의 값으로 채워줌.
//				객체배열인 books[1]번째 방에 객체를 하나 만들어서, 매개변수의 값으로 채워줌.
//				객체배열인 books[2]번째 방에 객체를 하나 만들어서, 매개변수의 값으로 채워줌.
//				stack					  heap	
//				0123		-> 		1234  ->   1234 book객체
//				books				2345       2345 book객체
//									3456       3456 book객체
//									0123	       객체
//									books[i]  
//				책 추가 완료 시점.
		}							
//		출력
		for(int i=0; i<books.length;i++) {
			System.out.println(books[i].information());
		}
//		전체 책 조회 기능이 완료된 시점
		
//		검색기능
		System.out.print("책제목 : ");
		String searchTitle = sc.nextLine();
		for(int i=0; i<books.length;i++) {
			if(searchTitle.equals(books[i].getTitle())) {
				System.out.println(books[i].getPrice());
				// getter메소드,information을 통해 books[i]의 생성자 값을 확인함.
				// 캡슐화로 인해 직접접근이 불가함.
			}
		}
		
		
	}

}
