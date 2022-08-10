package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * ���׿�����
	 * �� ���� �׸�(�ǿ�����)�� ������ �����ϴ� ������
	 * 
	 * [ǥ����]
	 * ���ǽ�? ���ǽ��� ����� true�� ����� ����� : ���ǽ��� ����� false�� ����� �����
	 * => ��, ���ǽ��� ����� true �Ǵ� false�� ���´�.
	 * (���ǽ� : ������ �Ǻ��ϴ� ��.����� true �Ǵ� false�� ������ ��)
	 * ������������, �񱳿�����, �������ڰ� ���ǽ����� ���� �� �ִ�.
	 */
	public void method1() {
		
		// ����ڰ� �Է��� �������� ������� �ƴ��� �Ǻ� ��, ����� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		String result = (num > 0)? "����Դϴ�." : "����� �ƴմϴ�.";
		// ��� ���� String�� ������ ������ Variable�� String���� �Ͽ���.
		System.out.println(num+"�� "+result );
	}
	public void method2() {
		// ����ڰ� �Է��� �������� ¦������ Ȧ�������� �Ǻ� ��, ����� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		// ¦���� ���
		// String result = (num % 2 == 0)? "¦���Դϴ�." : "Ȧ���Դϴ�.";
        // Ȧ���� ���
		String result = (num % 2 == 1)? "Ȧ���Դϴ�." : "¦���Դϴ�.";
		System.out.printf("%d��  %s", num , result);
	}
	public void method3() {
		// ����ڷκ��� ������ �ϳ��� �Է¹޾� �빮������ �ƴ��� �Ǻ� �� ����ϱ�
		// => �ƽ�Ű�ڵ� 'A' = 65, 'a' = 97
		//�ڵ�����ȯ�̶� (int)�Ƚ��൵ �ȴ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ : ");
		char ch = sc.nextLine().charAt(0);
		//String result = (65 <= (int)ch && (int)ch <=90 )? 
		//"�빮���Դϴ�" : "�빮�ڰ� �ƴմϴ�."; 
		String result = (('A'<=ch) && (ch <='Z'))? 
		"�빮���Դϴ�." : "�빮�ڰ� �ƴմϴ�.";
		System.out.printf("%c�� %s",ch,result);
	}
	public void method4() {
		/*
		 * ������ method1�� ������ �����Ѵ�.
		 * ����ڰ� �Է��� ���� ���� (����, 0, ���)������ �Ǻ��� ��
		 * ����� ����غ��ڴ�.
		 */
		
		Scanner sc =new Scanner(System.in);
		System.out.print("���� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		String result = (num > 0)? "����Դϴ�" 
				: (num == 0)? "0�Դϴ�" : "�����Դϴ�.";
		System.out.printf("%s",result);
	}
}
