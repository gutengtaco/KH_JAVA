package com.kh.practice2.example;

import java.util.Scanner;

public class CastingPractice {
	/*
	 * Ű����� ���� �ϳ��� �Է¹޾� 
	 * �� ���ڿ� ������ �����ڵ� ���� ����Ͻÿ�.
	 * 
	 * ����
	 * ���� : A
	 * A unicode : 65
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println(ch+" Unicode : "+(int)ch);
	}
	/*
	 * �Ǽ������� ����, ����, ���� �� ������ ������ �Է¹޾�
	 * ������ ����� ����Ͻÿ�.
	 * 
	 * ����
	 * ���� : 90.0
	 * ���� : 90.0
	 * ���� : 90.0
	 * 
	 * ���� : 270
	 * ��� : 90
	 */
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		double korean = sc.nextDouble();
		System.out.print("���� : ");
		double english = sc.nextDouble();
		System.out.print("���� : ");
		double math = sc.nextDouble();
		System.out.println();
		System.out.println("���� : "+(int)(korean+english+math));
		System.out.println("��� : "+(int)((korean+english+math)/3));
	}
	/*
	 * ���� �� �ʱ�ȭ�� 5���� ������ ������
	 * �˸��� ��Ģ����� ����ȯ�� �̿��Ͽ�
	 * �ּ��� ���� ���� ���� ���� �������� �ڵ带 �ۼ��Ͻÿ�.
	 */
	public void method3(){
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);			// 2
		System.out.println((int)dNum);				// 2
		
		System.out.println((float)(iNum2*dNum));	// 10.0
		System.out.println((float)iNum1);			// 10.0
		
		System.out.println((float)iNum1 /(float)iNum2);	// 2.5
		System.out.println(dNum);						// 2.5
		
		System.out.println((int)fNum);  		// 3
		System.out.println(iNum1 / (int)fNum);	// 3
		
		System.out.println((float)(iNum1/ fNum));			// 3.333333
		System.out.println((double)iNum1 / (double)fNum);	// 3.333333333333335

		System.out.println(ch);					// 'A'
		System.out.println((int)ch);			// 65
		System.out.println((int)(ch + iNum1));	// 75
		System.out.println((char)(ch + iNum1));	// 'K'
		
		
		
		
		
	}
}
