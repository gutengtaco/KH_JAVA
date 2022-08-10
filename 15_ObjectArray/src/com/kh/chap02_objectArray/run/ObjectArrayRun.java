package com.kh.chap02_objectArray.run;

import java.util.ArrayList;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {

		// 1. ��ü�迭 ����� => Phone ������ ��ü�� ��ڴ�.
		// ����� ���ÿ� �Ҵ�
		// �ڷ���[] �迭�� = new �ڷ���[ũ��];
		// Phone[] arr = new Phone[3];
		// �迭�� ����� �غ� �Ϸ�Ǿ���.
		
		ArrayList<Phone> list = new ArrayList<>(3);
		// Phone �� ������ �ִ� ArrayList ��ü
		
		/*
		System.out.println(arr); // �ּҰ�
		System.out.println(arr.length); // 3
		System.out.println(arr[0]); // null
		*/
		
		Phone p1 = new Phone();
		
		// �迭�� ��������� ��������
		// arr[0] = p1;
		
		list.add(p1);
		
		// �������� ����
		System.out.println(p1);
		// System.out.println(arr[0]);
		
		System.out.println(list.get(0));
		
		p1 = null;
		
		// System.out.println(arr[0]);
		
		// arr[0] �� �ǹ��ϴ°� : phone ��ü 1��
		/*
		arr[0].setName("������");
		arr[0].setBrand("�Ｚ");
		arr[0].setPrice(1000000);
		*/
		
		list.get(0).setName("������");
		list.get(0).setBrand("�Ｚ");
		list.get(0).setPrice(1000000);

		// System.out.println(arr[0].information());
		
		System.out.println(list.get(0).information());
		
		// arr[1] = new Phone("������", "11pro", "����", 1000000);
		
		list.add(1, new Phone("������", "11pro", "����", 1000000));
		
		/*
		System.out.println(arr[1]); // �ּҰ�
		System.out.println(arr[1].information()); // ���빰
		*/
		
		System.out.println(list.get(1));
		System.out.println(list.get(1).information());
		
		System.out.println("---- �� ������ ----");
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // �ּҰ�
		} 
		*/
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// arr[2] = new Phone(); // �� ������ �߰����� �� arr[2] ��° �����κ��� �޼ҵ带 ȣ���� �� �ִ�.
		
		list.add(new Phone());
		
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information()); // ���빰
		}
		*/
		
		// ���� for��
		for(Phone p : list) {
			System.out.println(p.information());
		}
	}
}
