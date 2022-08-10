package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	private Product[] pro = new Product[10];
	public int count=0;
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		do {System.out.println("===== ��ǰ ���� �޴� =====");
			System.out.println("1. ��ǰ ���� �߰�");
			System.out.println("2. ��ǰ ��ü ��ȸ");
			System.out.println("9. ���α׷� ����");
			System.out.print("���Ͻô� �޴��� �����ϼ��� : ");
			int select = sc.nextInt();
			sc.nextLine();
				if(select == 1) {
					productInput();
				}else if(select == 2) {
					productPrint();
				}else if(select == 9) {
					System.out.println("���α׷� ����");
					break;
				}else {
					System.out.println("�ٽ� �Է����ּ���.");
					continue;
				}
		}while(true);
		
	}
	
	public void productInput() {
		System.out.print("��ǰ��ȣ : ");
		int pId = sc.nextInt();
		sc.nextLine();
		System.out.print("��ǰ�� : ");
		String pName = sc.nextLine();
		System.out.print("��ǰ���� : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("��ǰ ���� : ");
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
