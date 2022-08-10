package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		/*
		//1. 기본생성자를 통해 객체를 생성 + setter메소드로 값을 필드에 대입
		Book bk1 = new Book();	// JVM이 초기값으로 세팅
		bk1.setTitle("자바칩의 정석");
		bk1.setAuthor("김자바칩");
		bk1.setPublisher("KH정보교육원");
		bk1.setPrice(20000);
		System.out.println(bk1.getTitle());
		System.out.println(bk1.getAuthor());
		System.out.println(bk1.getPublisher());
		System.out.println(bk1.getPrice());
		System.out.println(bk1.information());
		
		//2. 매개변수 생성자를 이용하여 생성과 동시에 원하는 값으로 초기화.
		Book bk2 = new Book("C언어의 정석","나씨씨","씨언어출판사",20000);
		System.out.println(bk2.getTitle());
		System.out.println(bk2.getAuthor());
		System.out.println(bk2.getPublisher());
		System.out.println(bk2.getPrice());
		System.out.println(bk2.information());
		
		//3. 사용자가 입력한 값들로 객체를 생성
		Scanner sc = new Scanner(System.in);
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.nextLine();
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book bk3 = new Book(title, author, publisher, price);
		System.out.println(bk3.information()); 
		*/

		
		// 이 시점에서 책 3권이 완성됨.
		
		/*
		 * 세 개의 Book 객체가 필요하다는 가정 하에
		 * 각 Book 객체를 따로 관리 하고자 한다면?
		 * 단, 사용자에게 입력받은 값들로, 책의 정보를 채워 넣기!(Scanner를 이용)
		 */
		
		
//		Book 객체를 생성하기 전에, 일단 선언만 하고 임시로 null로 채워줌.
//		Book bk1;
//		Stack영역에 bk1이라는 공간이 생김.
//		이 bk1이라는 공간은 나중에 할당(heap)이 되면 주소값이 담김.
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		System.out.println(bk1);
		// stack영역에 선언만 한 상태이기 때문에
		// 값이 null이 뜸.
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) { // i=0,1,2
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
// 			Heap영역에 실제값을 넣고, Stack의 bk1에 주소값을 담음.
			if(i==0) {
				bk1 = new Book(title, author, publisher, price);
			}else if(i==1) {
				bk2 = new Book(title, author, publisher, price);
			}else {
				bk3 = new Book(title, author, publisher, price);
			}
//			객체(참조형 변수) : 서로 다른 자료형의 값을 넣을 수 있음.(1차원 배열과 비슷)
//			 stack				heap
//			bk1(0123)	-> 	0123	(title, author, publisher, price)	
//			bk2(1234)	->	1234	(title, author, publisher, price)
//			bk3(2345)	->	2345	(title, author, publisher, price)
//						    .getXXX
//							.information
		}
//		출력시에는 반복문 사용 불가 (bki로 못함)
//		출력을 하면 잘 입력된 것을 볼 수 있음.
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
//		여태까지는 책의 정보를 추가해주는 행위를 한 것!(추가기능)
		
//	         각 전체 도서들의 제목과 일일이 비교하여 일치하는 도서의 가격을 알려줌.(검색기능) 
		System.out.print("검색할 책 제목 : ");
		String searchTitle = sc.nextLine();
		
		if(searchTitle.equals(bk1.getTitle())) {
			System.out.println(bk1.getPrice());
		}
		if(searchTitle.equals(bk2.getTitle())) {
			System.out.println(bk2.getPrice());
		}
		if(searchTitle.equals(bk3.getTitle())) {
			System.out.println(bk3.getPrice());
		}
//		해당하는 검색이 있으면 가격을 출력, 없으면 빈칸이 출력됨.(정상작동)
//		단, 코드 작성시, 반복문을 활용하지 못하여 제한이 있음.
		
	}
		

}
