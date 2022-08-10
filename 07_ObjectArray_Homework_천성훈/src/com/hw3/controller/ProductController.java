package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	private Product[] pro = new Product[10];
	public int count=0;
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		do {System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("원하시는 메뉴를 선택하세요 : ");
			int select = sc.nextInt();
			sc.nextLine();
				if(select == 1) {
					productInput();
				}else if(select == 2) {
					productPrint();
				}else if(select == 9) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("다시 입력해주세요.");
					continue;
				}
		}while(true);
		
	}
	
	public void productInput() {
		System.out.print("제품번호 : ");
		int pId = sc.nextInt();
		sc.nextLine();
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		System.out.print("제품가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		sc.nextLine();	
			for(int i=0; i<pro.length; i++) {
				pro[count] = new Product(pId, pName, price, tax);
			}
		count++;
	}
	
	public void productPrint() {
		for(int i=0; i<pro.length; i++) {
			if(pro[i]!=null) {
				System.out.println(pro[i].information());
			}else {
				continue;
			}
		}
	}
}
