package com.kh.practice;

import java.util.Scanner;

/*
 * 3���� �̻����� �̷���� ����ܾ Ű����� �Է¹޾�
 * �ش� ���ڿ� ���� �տ��� 3���� ���ڸ� ���� �����Ͽ� ����Ͻÿ�.
 * Method Name : myString
 * �������
 * ���ڿ��� �Է��ϼ���: Hello
 * ù��° ���� : H
 * �ι�° ���� : e
 * ����° ���� : l
 */
public class VariablePractice {
	public void myString() {
		// 1. Scanner Class
		Scanner sc = new Scanner(System.in);
		// 2. import�� ����
		// 3. ���ڿ��� �Է��ϼ���
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		// 4. n��° ����
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		System.out.println("ù��° ���� : "+ch1);
		System.out.println("�ι�° ���� : "+ch2);
		System.out.println("����° ���� : "+ch3);
		
		
	}
}
