package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	/*
	 * break��
	 * break���� ������ ����
	 * "���� �� ��ġ�κ��� ���� ����� �ݺ��� �� ��"��
	 * ���������Բ� ���ִ� ����
	 * ��, �ش� break���� ���� �ִ� �ݺ��� �� ���� ��������.
	 * 
	 * [ǥ����]
	 * break;
	 * 
	 * [��������]
	 * �б⹮������ break�� switch�������� break�� �ٸ� ������.
	 * switch������ break���� �ܼ��� �ش� switch������ ���������� �뵵�� ��.
	 * �ݺ��������� break���� break���� ��ġ���� �Ѱ��� ���������� ����.
	 * 
	 */
	public void method1() {
		
		// �Ź� �ݺ������� ������ �߻��Ǵ� ������(1~100)���
		// ��, �������� Ȧ���� ��쿡�� �ݺ����� ���������Բ�.
		int i=0;
		int random=0;
		while(true) {
			random = (int)((Math.random()*100)+1);
			if(random%2==1) { // Ȧ�� �Ǻ�
				// return;	
				// �� ������ ����� �������� ���ٸ�, �̹� �ݺ��� ���� �Ǻ��� ������ ��.
				// ��, Ȧ���� ������ ���α׷��� ����Ǳ⿡, ����� ¦���� ����.
				break;
				// ���������� Ȧ���� ������ ���α׷��� ����Ǳ⿡, ����� ¦���� ����.
				
				/*
				 * return�� break�� ������
				 * break�� ���, �ش� while���� �Ѱ� �������� "�������ϴ�."�� ��µ�.
				 * return�� ���, a.method1();�� �ٽ� ���� ������
				 * ���ѹݺ��� while���� ����� ���Ͽ� "�������ϴ�."�� �������� ����.
				 * [�����޼���]
				 * Unreachable code
				 */
			}
			System.out.println("���� : "+random); // Ȧ�� �̿��� ���� ���
		}
		// while���� �ݺ��� ������ ����.
		System.out.println("�������ϴ�."); // return�Ͻ�, �������� ����.
	}
	public void method2() {
		/*
		 * �ƹ� ���ڿ��̳� �Է��ϼ���. : 
		 */
		// ���ڿ��� �������� �ݺ��ϸ鼭 �Ź� �Է¹ޱ�
		// �� ���ڿ��� ���̸� ����ϰ�
		// ����, �Է¹��� ���ڿ��� "exit"��� ���ڿ��̶�� ����
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("�ƹ� ���ڿ��̳� �Է��ϼ��� : ");
			String str = sc.nextLine();
			if(str.equals("exit")) { // ���ڿ��� exit�� ���
				// return;
				break;
			}else {	// ���ڿ��� exit�� �ƴ� ���
				// ���ڿ�.length()
				// .length()�� ����� ���������� ����.
				System.out.println("\""+str+"\"" + " �� ���� : "+str.length());
			}
		}
		// return��, Unreachable Code
		// break�� ������, Unreachable Code
		// break��, while���� �������� �Ʒ��� �ڵ带 ���.
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	public void method3() {
		
		// �Ź� �ݺ������� ����ڿ��� ����� �Է¹޾�
		// 1 ~ �Է°����� ���
		// ���������� ����� �Է����� ���, ����� ��� �� ���ѹݺ��� ��������.
		// �ƴ� ���, �ٽ� �Է��϶�� ������ ���.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("��� �Է� : ");
			int num = sc.nextInt();
			if(num>0) { // ����� ���
				for(int i=1; i<=num; i++) {
					System.out.print(i+" ");
				}
				break; // while���� ��������.
			}else { // ����� �ƴ� ���
				System.out.println("�ٽ� �Է����ּ���.");
			}
			System.out.println();
		}
	}

}
