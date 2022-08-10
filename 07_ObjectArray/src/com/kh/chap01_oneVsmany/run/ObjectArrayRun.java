package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

// ��ü �迭�� �̿��� ����
public class ObjectArrayRun {

	public static void main(String[] args) {
		
//		��ü ������
//		�ڷ��� ��ü�� = new �����ڸ�();
		
//		�迭�� �� �غ� => ���� �� �Ҵ�
//		�ڷ���[] �迭�� = new �ڷ���[�迭ũ��];
//		�ڷ����� Ŭ���������� �ؼ� �ڷ����� ������ ���� �ʰ� ��.
		
//		��ü �迭
//		Ŭ������[] ��ü�� = new �����ڸ�[�迭ũ��];
		Book[] books = new Book[3];
//		1. Book[] books�� Stack������ books��� ������ ����
//		2. new Book[3]�� ���� Heap������ 3ĭ¥�� �� ������ ����.
//		=> �ٸ�, Heap�������� ������� ������� �ʾ�, �⺻���� null�� �ʱ�ȭ��.
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
			System.out.print("���� : ");
			String title = sc.nextLine();
			System.out.print("���� : ");
			String author = sc.nextLine();
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
				books[i] = new Book(title,author,publisher,price);
//				��ü�迭�� books[0]��° �濡 ��ü�� �ϳ� ����, �Ű������� ������ ä����.
//				��ü�迭�� books[1]��° �濡 ��ü�� �ϳ� ����, �Ű������� ������ ä����.
//				��ü�迭�� books[2]��° �濡 ��ü�� �ϳ� ����, �Ű������� ������ ä����.
//				stack					  heap	
//				0123		-> 		1234  ->   1234 book��ü
//				books				2345       2345 book��ü
//									3456       3456 book��ü
//									0123	       ��ü
//									books[i]  
//				å �߰� �Ϸ� ����.
		}							
//		���
		for(int i=0; i<books.length;i++) {
			System.out.println(books[i].information());
		}
//		��ü å ��ȸ ����� �Ϸ�� ����
		
//		�˻����
		System.out.print("å���� : ");
		String searchTitle = sc.nextLine();
		for(int i=0; i<books.length;i++) {
			if(searchTitle.equals(books[i].getTitle())) {
				System.out.println(books[i].getPrice());
				// getter�޼ҵ�,information�� ���� books[i]�� ������ ���� Ȯ����.
				// ĸ��ȭ�� ���� ���������� �Ұ���.
			}
		}
		
		
	}

}
