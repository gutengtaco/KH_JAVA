package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		/*
		//1. �⺻�����ڸ� ���� ��ü�� ���� + setter�޼ҵ�� ���� �ʵ忡 ����
		Book bk1 = new Book();	// JVM�� �ʱⰪ���� ����
		bk1.setTitle("�ڹ�Ĩ�� ����");
		bk1.setAuthor("���ڹ�Ĩ");
		bk1.setPublisher("KH����������");
		bk1.setPrice(20000);
		System.out.println(bk1.getTitle());
		System.out.println(bk1.getAuthor());
		System.out.println(bk1.getPublisher());
		System.out.println(bk1.getPrice());
		System.out.println(bk1.information());
		
		//2. �Ű����� �����ڸ� �̿��Ͽ� ������ ���ÿ� ���ϴ� ������ �ʱ�ȭ.
		Book bk2 = new Book("C����� ����","������","��������ǻ�",20000);
		System.out.println(bk2.getTitle());
		System.out.println(bk2.getAuthor());
		System.out.println(bk2.getPublisher());
		System.out.println(bk2.getPrice());
		System.out.println(bk2.information());
		
		//3. ����ڰ� �Է��� ����� ��ü�� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		String title = sc.nextLine();
		System.out.print("���� : ");
		String author = sc.nextLine();
		System.out.print("���ǻ� : ");
		String publisher = sc.nextLine();
		System.out.print("���� : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		Book bk3 = new Book(title, author, publisher, price);
		System.out.println(bk3.information()); 
		*/

		
		// �� �������� å 3���� �ϼ���.
		
		/*
		 * �� ���� Book ��ü�� �ʿ��ϴٴ� ���� �Ͽ�
		 * �� Book ��ü�� ���� ���� �ϰ��� �Ѵٸ�?
		 * ��, ����ڿ��� �Է¹��� �����, å�� ������ ä�� �ֱ�!(Scanner�� �̿�)
		 */
		
		
//		Book ��ü�� �����ϱ� ����, �ϴ� ���� �ϰ� �ӽ÷� null�� ä����.
//		Book bk1;
//		Stack������ bk1�̶�� ������ ����.
//		�� bk1�̶�� ������ ���߿� �Ҵ�(heap)�� �Ǹ� �ּҰ��� ���.
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		System.out.println(bk1);
		// stack������ ���� �� �����̱� ������
		// ���� null�� ��.
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) { // i=0,1,2
			
			System.out.print("���� : ");
			String title = sc.nextLine();
			System.out.print("���ڸ� : ");
			String author = sc.nextLine();
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			System.out.print("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
// 			Heap������ �������� �ְ�, Stack�� bk1�� �ּҰ��� ����.
			if(i==0) {
				bk1 = new Book(title, author, publisher, price);
			}else if(i==1) {
				bk2 = new Book(title, author, publisher, price);
			}else {
				bk3 = new Book(title, author, publisher, price);
			}
//			��ü(������ ����) : ���� �ٸ� �ڷ����� ���� ���� �� ����.(1���� �迭�� ���)
//			 stack				heap
//			bk1(0123)	-> 	0123	(title, author, publisher, price)	
//			bk2(1234)	->	1234	(title, author, publisher, price)
//			bk3(2345)	->	2345	(title, author, publisher, price)
//						    .getXXX
//							.information
		}
//		��½ÿ��� �ݺ��� ��� �Ұ� (bki�� ����)
//		����� �ϸ� �� �Էµ� ���� �� �� ����.
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
//		���±����� å�� ������ �߰����ִ� ������ �� ��!(�߰����)
		
//	         �� ��ü �������� ����� ������ ���Ͽ� ��ġ�ϴ� ������ ������ �˷���.(�˻����) 
		System.out.print("�˻��� å ���� : ");
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
//		�ش��ϴ� �˻��� ������ ������ ���, ������ ��ĭ�� ��µ�.(�����۵�)
//		��, �ڵ� �ۼ���, �ݺ����� Ȱ������ ���Ͽ� ������ ����.
		
	}
		

}
