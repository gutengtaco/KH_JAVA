package com.kh.operator;

import java.util.Scanner;

public class F_Logical {

	/*
	 * ��������
	 * �� ���� ������ �����ϴ� ������.(���׿�����)
	 * [ǥ����]
	 * ���� (��������) ���� 
	 * =>��� ���� �������� ���´�. 
	 * 
	 * [����]
	 * && : AND������. �Ѵ� ���϶��� True
	 * || : OR������. �� �� �ϳ��� ���̾ True
	 * 
	 * [����� ��]
	 * AND
	 * True && True   : ��
	 * True && False  : ����
	 * False && True  : ����
	 * False && False : ����
	 * 
	 * OR
	 * True || True   : ��
	 * True || False  : ��
	 * False || True  : ��
	 * False || False : ����
	 */
	
	public void method1() {
		// �񱳿����� + ��������
		// ����ڰ� �Է��� ���� ���� ��� �̸鼭 ¦������ Ȯ��
		// && : �׸���, ~(��)�鼭, ~(��)��
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		boolean result = ((num > 0) && (num % 2 == 0));
		System.out.println("�������� ����̸鼭 ¦���ΰ� ? "+result);
	}
	public void method2() {
		// ����ڰ� �Է��� �������� 1 �̻� 100������ ������ Ȯ���ϱ�
		// 1�̻� �̸鼭 100���� ( 1 <= num <= 100)
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		boolean result = ((1 <= num  && num <= 100));
		System.out.println("�������� 1�̻� 100�����ΰ�? "+result);
	}
	public void method3() {
		// || : �Ǵ� ,~(��)�ų�
		// ����ڰ� �Է��� ���� 'y' �̰ų�(�Ǵ�) 'Y'���� Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ͻ÷��� y �Ǵ� Y�� �Է��Ͻÿ� : ");
		char ch =sc.nextLine().charAt(0);
		boolean result = ((ch == 'y') ||(ch =='Y'));
		System.out.println("����ڰ� �Է��� ���� y �Ǵ� Y�ΰ�? " + result);
	}
	public void method4() {
		/*
		 * && : �� �� True���� True�̴�
		 * || : �� �� �ϳ��� True���� True�̴�(�� �� False���� False)
		 */
		
		int num1 = 10;
		boolean result1 = false && (num1 > 0); // false
		// dead code(������ �ƴ� �ʿ���� �ڵ��� ����� ���̴�.) : num1 > 0
		// �̹� �տ� false�� ���� �ڿ� ���� �ڵ��̵��� false�� ���´�.
		System.out.println("result1 : "+result1);
		
		boolean result2 = true || (num1 > 0); // true
		// ���������� dead code : num1 > 0
		// ������ ���� true�� �ڰ� ���� �������� true��� ����� ���´�.
		System.out.println("result2 : "+result2);
		
	}
}
