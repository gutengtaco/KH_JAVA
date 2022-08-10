package com.kh.test.run;

import java.util.Scanner;
import com.kh.test.model.dao.BookDao;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 이름 : ");
		String fileName = sc.nextLine(); // 
		BookDao bookDao = new BookDao();
		bookDao.fileSave(fileName);
		System.out.println("*** 도서 조회 프로그램 ***");
		while(true) {
			System.out.print("도서 목록을 확인하시겠습니까?(Y/N) : ");
			char answer = sc.nextLine().toUpperCase().charAt(0);	 //
			if(answer=='Y') { // 
				System.out.println("도서 목록을 확인중입니다..");
				System.out.println("------------------------------------------------------------");
				bookDao.fileRead();
				System.out.println("------------------------------------------------------------");
				break;
			}
			else if(answer == 'N') { //
				System.out.println("도서 목록을 확인하지 않습니다.");
				break;
			}
			else {
				System.out.println("올바르지 않은 입력입니다. 다시 입력해주세요.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}