package com.kh.practice1.example;

import java.util.Scanner;

public class VariablePractice {
	/*
	 * �̸�(String), ����(char), ����(int), Ű(double)�� ����ڿ��� �Է� �޾� 
	 * ������ ���� ������ ��� ����ϼ���.
	 *
	 * ����
	 * �̸��� �Է��ϼ��� : �ƹ���
	 * ���̸� �Է��ϼ��� : 20
	 * ������ �Է��ϼ���(��/��) : ��
	 * Ű�� �Է��ϼ���(cm) : 180.5
	 * 
	 * Ű 180.5�� 20�� ���� �ƹ����� �ݰ����ϴ�^^
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("������ �Է��Ͻÿ�(��/��) : ");
		char str = sc.nextLine().charAt(0);
//		String str = gender+"��";
		String gender = (str=='��')? "����"
				:(str=='��')? "����":"X";
		System.out.print("Ű�� �Է��Ͻÿ� : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.printf("Ű %.1f�� %d�� %s %s�� �ݰ����ϴ�^^"
				,height,age,gender,name);
		
	}
	/*
	 * Ű����� ���� �ΰ��� �Է¹޾�
	 * �� ���� ��, ��, ��, �������� ���� ����ϼ���
	 * 
	 * ����
	 * ù��° ������ �Է��Ͻÿ� : 23
	 * �ι�° ������ �Է��Ͻÿ� : 7
	 * ���ϱ� ��� : 30
	 * ���� ��� : 16
	 * ���ϱ� ��� : 161
	 * ������ �� ��� : 3
	 */
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		sc.nextLine();
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("���ϱ� ��� : "+(a+b));
		System.out.println("���� ��� : "+(a-b));
		System.out.println("���ϱ� ��� : "+(a*b));
		System.out.println("������ �� ��� : "+(a/b));
	}
	
	/*
	 * Ű����� ����, ���ΰ��� �Ǽ������� �Է¹޾�
	 * �簢���� ������ �ѷ��� ����Ͽ� ����Ͻÿ�.
	 * [����]
	 * �簢���� ���� = ���� * ����
	 * �簢���� �ѷ� = (���� * 2) + (���� * 2)
	 * 
	 * ����
	 * ���� : 13.5
	 * ���� : 41.7
	 * ���� : 562.95
	 * �ѷ� : 110.4
	 */
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		double horizon = sc.nextDouble();
		sc.nextLine();
		System.out.print("���� : ");
		double vertical = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		System.out.println("���� : " +(horizon * vertical));
		System.out.println("�ѷ� : " +((horizon*2) + (vertical*2)));
	}
	/*
	 * ���� ���ڿ� ���� Ű����� �Է¹޾�
	 * ���� ���� �� ���� ����ϼ���.
	 * 
	 * ����
	 * ���ڿ��� �Է��ϼ��� : apple
	 * ù��° ���� : a
	 * �ι�° ���� : p
	 * ����° ���� : p
	 */
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		System.out.println();
		System.out.println("ù��° ���� : "+str.charAt(0));
		System.out.println("�ι�° ���� : "+str.charAt(1));
		System.out.println("����° ���� : "+str.charAt(2));
	}
}
