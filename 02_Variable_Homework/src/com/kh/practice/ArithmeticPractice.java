package com.kh.practice;

import java.util.Scanner;

public class ArithmeticPractice {
	/*
	 * �ο� ���� ���� ������ Ű����� �Է� �ް�
	 * 1�δ� �����ϰ� �������� ���� ������ 
	 * �����ְ� ���� ������ ������ ����ϼ���.
	 * ----------------------------
	 * ��� ����
	 * �ο� �� : 5
	 * ���� ���� : 164
	 * 1�δ� ������ ���� ���� : 32
	 * ���� ���� ���� : 4
	 */
	
	public void devideCandy() {
		// 1. Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ����");
		// 2. nextInt, nextLine ���
		System.out.print("�ο� �� : ");
		int count = sc.nextInt();
		sc.nextLine();
		System.out.print("�������� : ");
		int num = sc.nextInt();
		sc.nextLine();
		// 3. ��� ���
		System.out.println("1�δ� ������ ���� ���� : "+(num/count));
		System.out.print("���� ���� ���� : "+(num%count));
		
	}
}
