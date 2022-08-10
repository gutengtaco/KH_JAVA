package com.kh.operator;

import java.util.Scanner;

public class E_Comparison {
	/*
	 * �񱳿�����(���迬����)
	 * �ΰ��� ���� ���ϴ� ���׿�����
	 * �� ���� ����� ���� ��� True, ������ ��� False�� ��ȯ�Ѵ�.
	 * => Ư�� ������ �����ϴ� ���ǹ��� ���ȴ�.
	 * 
	 * �з�
	 * 1. ũ�� ������ �� 
	 * => ����, ���ڰ� �����ϴ�.
	 * a > b : a�� b���� ū��? True or False
	 * a < b : a�� b���� ������? True or False
	 * a >= b : a�� b���� ũ�ų� ������? True or False
	 * a <= b : a�� b���� �۰ų� ������? True or False
	 * 
	 * 2. ������ ��
	 * => ����, ����, �ּҰ�, ���� ���� �����ϴ�.
	 * a == b : a�� b�� ��ġ�ϴ°�? True or False
	 * a != b : a�� b�� ��ġ���� �ʴ°�? True or False
	 * 
	 * 
	 */
	public void method1() {
		
		//��Һ� ������
		int a = 10;
		int b = 25;
		System.out.println("b�� a���� Ů�ϱ�? " + (a < b));
		System.out.println("a�� b���� Ů�ϱ�? " + (a > b));
		// +�� >���� �켱������ ������, ���ڿ� > ������ ���� ������ ���.
		// ����, ��ȣ�� ��� �켱������ �����Ͽ� �� �����־�� �Ѵ�.
		// ��ȣ�� ������ (a > b)�� ���� �����ϰ�,���� ���ʿ��� ���������� ����� �����Ѵ�.
		System.out.println("a�� b���� �۰ų� �����ϱ�? " + (a <= b));
		System.out.println("a�� b���� ũ�ų� �����ϱ�? " + (a >= b));
		System.out.println();
		//����� ������
		boolean result1 = (a == b);
		System.out.println("result1 : " + result1);
		boolean result2 = (a != b);
		System.out.println("result2 : " + result2);
		System.out.println();
		//������� + �񱳿���
		boolean result3 = 3 + 5 < 1;
		// �켱������ �������, �񱳿���, ���Կ��� ���̶�
		// 3+5, <1, = ������ ����ȴ�.
		System.out.println("result3 : " + result3);
		System.out.println();
		/*
		 * ¦��, Ȧ��
		 * ¦�� : 2�� �������� ��, ������ �������� ��(�������� 0)
		 * Ȧ�� : 2�� �������� ��, ������ �������� �ʴ� ��(�������� 1)
		 */
		// a = 10;, b = 25;
		System.out.println("a�� ¦���Դϱ�? " + ((a % 2)==0) );
		System.out.println("a�� Ȧ���Դϱ�? " + ((a % 2)==1) );
		System.out.println("b�� ¦���Դϱ�? " + ((b % 2)==0) );
		System.out.println("b�� Ȧ���Դϱ�? " + ((b % 2)==1) );
		System.out.println("b�� ¦���� �ƴմϱ�? " + ((b % 2)!=0) );
	}
	public void method2() {
		
		// 1. ����ڷκ��� ��(����)�� �Է¹޴´�.
		// 2. �ش� ���� ����Դϱ�?
		// 3. �ش� ���� ¦���Դϱ�?
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� :");
		int iNum = sc.nextInt();
		sc.nextLine();
	    System.out.println("�ش� ���� ����Դϱ�? : " + (iNum > 0) );
	    System.out.println("�ش� ���� ¦���Դϱ�? : " + ((iNum % 2) == 0) );
		
	}
}
