package com.kh.chap02_String.controller;

import java.util.Arrays;
import java.util.Scanner;

public class B_StringMethodTest {
	public void method() {
		String str1 = "Hell world";
		
//		�޼ҵ��(�Ű�����) : ��ȯ��
		
//		1. ���ڿ�.charAt(int index) : char
//		=> ���ڿ��κ��� ���޹��� index ��ġ�� ���� �ϳ����� �������ִ� �޼ҵ�
		char ch = str1.charAt(3);
		System.out.println("ch : "+ch);	// l
		
//		2. ���ڿ�.concat(String str) : str
//		=> ���ڿ��� ���޵� �� �ٸ� ���ڿ��� �ϳ��� ���ļ� ��ȯ����.
//		=> ���ڿ� = ���ڿ� + str�� ���� ����
//		=> ��, �� �����̷θ� ���� �� ����.
		String str2 = "!!!";
		System.out.println(str1.concat(str2));
		System.out.println(str1 + str2);
		
//		3. ���ڿ�.length() : int
//		=> ���� ���ڿ��� ���̸� ��ȯ����.
		System.out.println("str1�� ���� : "+str1.length()); // 10(���� ����)
		
//		4-1. ���ڿ�.substring(int ����index) : String
//		=> ���ڿ��� ����index��ġ�������� �������� �κй��ڿ��� �����Ͽ� ��ȯ���ִ� �޼ҵ���.
		System.out.println("Str1�� �κй��ڿ� : "+str1.substring(6)); // orld
		
//		4-2. ���ڿ�.substring(int ����index, int ��index) : String  => �����ε�
//		=> ���ڿ��� ����index��ġ�������� �� index�� ��ġ�� �κй��ڿ��� �����Ͽ� ��ȯ���ִ� �޼ҵ���.
		System.out.println("str1�� �κй��ڿ� : "+str1.substring(0,6)); // Hell w (0 <= �ε��� ���� < 6)
		
//		5. ���ڿ�.replace(char old, char new) : String
//		=> old�� �ش��ϴ� ���ڿ��� new�� ��ȯ���Ѽ�, �ش� ���ڿ��� ��ȯ�����ִ� �޼ҵ�
		String str3 = str1.replace('l', 'c');
		System.out.println("str3 : "+str3);
		
//		6. ���ڿ�.trim() : String
//		=> ���ڿ������� �յ� ������ ������ ���ڿ��� ��ȯ���ִ� �޼ҵ�
		String str4 = "    JA VA    ";
		System.out.println("str4.trim()���� : " + str4.trim()); // JA VA
//		QUIZ) �߰��� ������ ���ְ� �ʹٸ�?
		System.out.println((str4).replace(" ", ""));
		
//		7-1. ���ڿ�.toUpperCase() : String
//		=> �ش� ���ڿ��� ��� �빮�ڷ� ���� ��, �� ���ڿ��� ��ȯ������.
		System.out.println("�빮�� : " + str1.toUpperCase());
//		7-2. ���ڿ�.toLowerCase() : String
//		=> �ش� ���ڿ��� ��� �ҹ��ڷ� ���� ��, �� ���ڿ��� ��ȯ������.
		System.out.println("�ҹ��� : " + str1.toLowerCase());
		
		/*
		 * ����ڷκ���
		 * ���Ḧ ���ϸ� Y�� �Է��Ͻÿ�. ��� ����
		 */
		System.out.println("---------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Ͻðڽ��ϱ�? (Y,N) : ");
		
//		ù��° ���
		char answer1 = sc.nextLine().charAt(0); // 'y' / 'Y'
			if(answer1 == 'y' || answer1 =='Y') {
				System.out.println("�ý����� �����մϴ�.");
			}else {
				System.out.println("�ý����� �������� �ʽ��ϴ�.");
			}
		
		
//		�ι�° ���
		char answer2 = sc.nextLine().toUpperCase().charAt(0);
//		�������ٿ�����(.)�� �켱������ ��� ���� ������ ���ʿ������� �����.
//		������Է� => �빮�� => ��������(�޼ҵ� Chaining)
		if(answer2 =='Y') {
			System.out.println("�ý����� �����մϴ�.");
		}else {
			System.out.println("�ý����� �������� �ʽ��ϴ�.");
		}
		
		System.out.println("---------------------------------------------------");
//		���ڿ� => char[]
//		str1���ڿ� �������� ���ڿ� �ϳ��ϳ��� �����ؼ� ���� �迭�� ��ڴ�.
		char[] arr = new char[str1.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = str1.charAt(i);	
		}
		System.out.println(Arrays.toString(arr));
		
//		8. ���ڿ�.toCharArray() : char[]
//		=> ���ڿ��� �� ���ڵ��� char�迭�� �Űܴ��
//		=> �� �迭 ��ü�� ��ȯ���ִ� �޼ҵ�
		char[] arr2 = str1.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
//		char[] => ���ڿ�
		char[] arr3 = {'a','p','p','l','e'};
		String result = "";
		for(int i=0; i<arr3.length; i++) {
			result = result+arr3[i];	// ���ڿ��� + �ٸ��ڷ��� = ���ڿ���
		}
		System.out.println("result : "+ result);
		
//		9. static valueOf(char[] data) : String
//		=> ���޵� char�迭�� ��� ���ڵ��� �ϳ��� ���ڿ��� ���̾ ��ȯ���ִ� �޼ҵ�
		System.out.println("�޼ҵ� ��� �� : "+String.valueOf(arr3));
		
	}
}
