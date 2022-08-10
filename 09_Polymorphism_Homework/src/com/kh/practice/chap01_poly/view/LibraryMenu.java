package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		while(true) {
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().toUpperCase().charAt(0);
			if(gender == 'M' || gender =='F' ) {
				Member mem = new Member(name,age,gender);
				lc.insertMember(mem);
				break;
			}else {
				System.out.println("�ٽ� �Է����ּ���.");
				continue;
			}
		}
		System.out.println();
		while(true) {
			System.out.println();
			System.out.println("==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int num = sc.nextInt();
			sc.nextLine();
			switch(num) {
			case 1 : 
				System.out.println();
				System.out.println("1)����������");
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
				System.out.println("���α׷��� �����մϴ�");
				return;
			default :
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
	}
	public void selectAll() {
		System.out.println();
		System.out.println("2)���� ��ü ��ȸ");
		
		for(int i=0; i<lc.selectAll().length;i++) {
			System.out.println((i+1)+"�� ���� : " + lc.selectAll()[i]);
		}
	}
	public void searchBook() {
		System.out.println();
		System.out.println("3)���� �˻�");
		System.out.print("�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		lc.searchBook(keyword);
		int count = 0;
		for(int i=0; i<lc.searchBook(keyword).length;i++) {
			if(lc.searchBook(keyword)[i] != null) {
			count++;
			}
		}
		if(count >0) {
			System.out.println("�� " + count +"���� �˻��Ǿ����ϴ�.");
			for(int i=0; i<lc.searchBook(keyword).length;i++) {
				if(lc.searchBook(keyword)[i] != null) {
					System.out.println(lc.searchBook(keyword)[i]);
				}
			}
		}else {
			System.out.println("�˻������ �����ϴ�.");
		}
	}
	public void rentBook() {
		
	}
}


