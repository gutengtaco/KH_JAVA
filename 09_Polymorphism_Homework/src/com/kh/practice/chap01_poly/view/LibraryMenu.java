package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		while(true) {
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
			if(gender == 'M' || gender =='F' ) {
				Member mem = new Member(name,age,gender);
				lc.insertMember(mem);
				break;
			}else {
				System.out.println("다시 입력해주세요.");
				continue;
			}
		}
		System.out.println();
		while(true) {
			System.out.println();
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1 : 
				System.out.println();
				System.out.println("1)마이페이지");
				System.out.println(lc.myInfo());
				break;
			case 2 : 
				selectAll();
				break;
			case 3 :
				searchBook();
				break;
			case 4 :
//				rentBook();
				break;
			case 9 : 
				System.out.println("프로그램을 종료합니다");
				return;
			default :
				System.out.println("다시 입력해주세요.");
			}
		}
	}
	public void selectAll() {
		System.out.println();
		System.out.println("2)도서 전체 조회");
		
		for(int i=0; i<lc.selectAll().length;i++) {
			System.out.println((i+1)+"번 도서 : " + lc.selectAll()[i]);
		}
	}
	public void searchBook() {
		System.out.println();
		System.out.println("3)도서 검색");
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		lc.searchBook(keyword);
		int count = 0;
		for(int i=0; i<lc.searchBook(keyword).length;i++) {
			if(lc.searchBook(keyword)[i] != null) {
			count++;
			}
		}
		if(count >0) {
			System.out.println("총 " + count +"권이 검색되었습니다.");
			for(int i=0; i<lc.searchBook(keyword).length;i++) {
				if(lc.searchBook(keyword)[i] != null) {
					System.out.println(lc.searchBook(keyword)[i]);
				}
			}
		}else {
			System.out.println("검색결과가 없습니다.");
		}
	}
	public void rentBook() {
		
	}
}


