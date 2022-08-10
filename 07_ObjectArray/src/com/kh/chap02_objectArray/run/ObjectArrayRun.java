package com.kh.chap02_objectArray.run;

import java.util.ArrayList;

import com.kh.chap02_objectArray.model.vo.Phone;

//	��ü�迭�� ArrayList�� ���غ��� ���Ͽ�, �� �� �Ẹ����.
public class ObjectArrayRun {

	public static void main(String[] args) {
		
//		1. ��ü �迭 ����� : ��ü�� ���� �� �ִ� �迭�� ����
//		- ����� ���ÿ� �Ҵ�
//		�ڷ���[] ��ü�� = new �ڷ���[ũ��]
		Phone[] arr = new Phone[3]; // ��ü�迭
//		�迭 ��� �غ� �Ϸ�.
		/*
		System.out.println(arr);	// �ּҰ�
		System.out.println(arr.length);	// 3
		System.out.println(arr[0]); // null
		*/
		ArrayList<Phone> list = new ArrayList<>(3);
//		stack			heap 
//		0123			null
//		arr				null	
//						null
//						0123
//						arr[i]  
		
		Phone p1 = new Phone(); // ��ü
//		stack           heap
//		0123			null
//		p1				0123
		
		arr[0] = p1;
		list.add(p1);
//		���� ����
//		
//		stack			heap 
//		1111			arr[0]
//		arr		---->   2222	
//						 ��
//						 ��
//		2222             �� 
//		p1       --->   2222
		
		
		
		System.out.println(p1);
		System.out.println(list.get(0));
//		���� �ּҰ��� ���
		
		p1 = null;
		System.out.println(p1);
//		System.out.println(p1.information)�� �ϸ� nullpointException�� ��.
//		�ٸ�, p1�� null�� ��µǴ� ����, ���� GC�� p1�̶�� ��ü�� �������� �ʾƼ���.
//		System.out.println(arr[0]);
		
//		arr[0]�� �ǹ��ϴ� �� : phone ��ü 1��
		/*
		arr[0].setName("������");
		arr[0].setBrand("�Ｚ");
		arr[0].setPrice(1000000);
		*/
		list.get(0).setName("������");
		list.get(0).setBrand("�Ｚ");
		list.get(0).setPrice(1000000);

//		System.out.println(arr[0].information());
		System.out.println(list.get(0).information());
		
//		arr[1] = new Phone("������","11pro","����",1000000);
		list.add(1, new Phone("������","11pro","����",1000000));
		
		/*
		System.out.println(arr[1]); // �ּҰ�
		System.out.println(arr[1].information()); // ���빰�� ����.
		*/
		System.out.println(list.get(1));
		System.out.println(list.get(1).information());
		
		System.out.println("---- �� ������ ----");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); // �ּҰ�
		}
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
//		arr[2] = new Phone(); 
		list.add(new Phone());
		
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information()); // ������.
		}
		*/
//		���� for��
		for(Phone p : list) {
			System.out.println(p.information());
		}
		
//		stack				  heap 	
//		0123	->		1234   ->  name : ������, series : null, brand : �Ｚ, price : 1000000
//		arr				2345	   name : ������, series : 11pro, brand : ����, price : 1000000
//						3456       null
//						0123	   .information
//		                arr[i]     .getXXX
//									�Ű����� �����ڰ� ������ ��.
//		�������� arr[0], arr[1]�� ���ؼ��� ��ü�� �����ϰ� ���� ��������.
//		����, arr[2]�� ȣ���ϸ� nullPointException�� ��.
//		�̿�, arr[2]�� ��ü�� �������ָ�, arr[2]�κ��� ���� ȣ���� �� �־�
//		nullpointError�� ���� ����.
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i].information()); // ���빰
//		}
	}

}
