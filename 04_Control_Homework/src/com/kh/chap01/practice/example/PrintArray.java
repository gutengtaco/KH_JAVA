package com.kh.chap01.practice.example;

import java.util.Scanner;

public class PrintArray {
	/*
	 * ����ڷκ��� ���ڸ� �Է¹޾�
	 * �� ���ڿ���ŭ �ݺ��� �������鼭 �� index ��° ���ڸ� �ϳ��� �����Ͽ� ����ϼ���
	 * 
	 * ����
	 * ������ ����
	 * ���ڿ��� �Է��ϼ��� : apple
	 * 1��° ���� : a
	 * 2��° ���� : p
	 * 3��° ���� : p
	 * 4��° ���� : l
	 * 5��° ���� : e
	 */
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		for(int i=0; i<str.length();i++) {
			System.out.println((i+1)+"��° ���� : "+str.charAt(i));
		}
	}
}
