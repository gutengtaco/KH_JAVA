package com.kh.practice;

import java.util.Scanner;

public class KeyboardInputPractice {
	/*
	 * Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
	 * ��� ����
	 * ù ��° ���� : 5
	 * �� ��° ���� : 7
	 * ���ϱ� ��� : 12
	 * ���� ��� : -2
	 * ���ϱ� ��� : 35
	 * ������ ��� : 0
	 */
	public void myCalculator() {
		// 1. Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("��� ����");
		// 2. nextInt, nextLine ���
		System.out.print("ù��° ���� : ");
		int first = sc.nextInt();
		sc.nextLine();
		System.out.print("�ι�° ���� : ");
		int second = sc.nextInt();
		sc.nextLine();
		// 3. ��� ���
		System.out.println("���ϱ� ��� : "+(first+second));
		System.out.println("���� ��� : "+(first-second));
		System.out.println("���ϱ� ��� : "+(first*second));
		System.out.println("������ ��� : "+(first/second));
	}
	
}
