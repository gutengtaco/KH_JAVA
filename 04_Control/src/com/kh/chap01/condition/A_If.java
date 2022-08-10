package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * �ܵ� if��
	 * ������ �ܵ������� �Ѱ��� ������ ���
	 * [ǥ����]
	 * if(���ǽ�){
	 *  �ش� ���ǽ��� ����� true�� ��쿡 ������ �ڵ�	
	 *  }
	 *  => ���ǽ��� ����� true�� ���, �߰�ȣ �� �ȿ� �ִ� �ڵ尡 ����ȴ�.
	 *  => ���ǽ��� ����� false�� ���, �߰�ȣ �� ���� �ڵ带 �����ϰ� �Ѿ��.
	 *  
	 *  
	 */
	public void method1() {
		
		// �ܵ� if��
		// ����ڷκ��� �������� �Է¹��� ��,
		// "����̴�","0�̴�","�����̴�"
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		// String result = (num > 0)? "����̴�" : 
		//	(num==0)? "0�̴�" : "�����̴�";
		// 1. ����� ���
		if(num > 0) {
			System.out.println("����̴�.");
		}
		// 2. 0�� ���
		if(num == 0) {
			System.out.println("0�̴�.");
		}
		// 3. ������ ���
		if(num < 0) {
			System.out.println("�����̴�.");
		}
	}
	public void method2() {
		
		// �ܵ�if�� 2
		// ����ڰ� �Է��� �������� ¦������, Ȧ�������� �Ǻ��ؼ�
		// "¦����", "Ȧ����"�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		if((num % 2 == 0)) {
			System.out.println("¦����");
		}
		if((num % 2 == 1)){
			System.out.println("Ȧ����");
		}
	}
	//�ǽ�����
	public void method3() {
		/* ����ڰ� ���̸� �Է��� ��, 
		 * 13�� ���ϸ� "����Դϴ�"
		 * 13�� �ʰ� ~ 19�� ���ϸ� "û�ҳ��Դϴ�"
		 * 19�� �ʰ� ~ "�����Դϴ�"
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
//		1. ���׿�����
//		(13�� ����)? ��� : (19�� ����)? û�ҳ� : ����; 
//		String age1 = (num<=13)? "����Դϴ�" : 
//			(num<=19)? "û�ҳ��Դϴ�":"�����Դϴ�";
//		System.out.printf("%s",age1);
//		System.out.println();
		
		//2. �ܵ� if��
		if(num <=13) { // 13�� ���� : ���
			System.out.println("����Դϴ�");
		}
		if(num >=14 && num <=19) { //14�� ~ 19�� : û�ҳ�
			System.out.println("û�ҳ��Դϴ�");
		}
		if(num >= 20) { //20�� �̻� : ����
			System.out.println("�����Դϴ�");
		}
	}
	public void method4() {
		// ����ڿ��� �Է¹��� �ֹε�Ϲ�ȣ�� ������
		// ����,���� ���� �Ǻ� �� "�����Դϴ�","�����Դϴ�" ���
		
		// 1. ����ڿ��� �ֹε�Ϲ�ȣ �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է�(-����): ");
		// �ֹι�ȣ : �������6���� + '-' + ����1���� + 6�ڸ� ����
		String personId = sc.nextLine();
		// ������ �ش��ϴ� �ε��� ����
		char gender = personId.charAt(7);
		// ���ڷ� �� Variable�� �̿��Ͽ� ��ġ ���� �Ǻ�
		if((gender=='1') || (gender=='3')) {
			System.out.println("�����Դϴ�");
		}
		if((gender=='2') || (gender=='4')) {
			System.out.println("�����Դϴ�.");
		}
		// �̿��� ���ڸ� �Է��� ���
		if((gender != '1')&&(gender != '2')&&
				(gender != '3')&&(gender != '4')) {
			System.out.println("�߸��� �ֹι�ȣ �Դϴ�.");
		}
		
	}
}
