package com.kh.chap06_method.controller;

public class MethodTest1 {
	/*
	 * �޼ҵ�
	 * 
	 *[ǥ����]
	 *����������[�����] ��ȯ�� �޼ҵ��(�Ű�����=> ���� ����){ 
	 *
	 *     ������ �ڵ�;
	 *     
	 *	   return ��ȯ�� ��; => ���� ���� : ��ȯ���� void�� ��츸
	 *}
	 *  
	 * �޼ҵ带 ������ ����, �󸶵��� ȣ���� ������.
	 * 
	 * ����� ���� ���� �޼ҵ� �׽�Ʈ
	 * 1. �Ű�����X, ��ȯ��X (�� ����� ���̽�)
	 * 2. �Ű�����X, ��ȯ��O 
	 * 3. �Ű�����O, ��ȯ��X
	 * 4. �Ű�����O, ��ȯ��O
	 * => ��ȯ���� ������(return), ������� �޼ҵ带 ȣ���� ������ ���� ����� �� ����.
	 * => ��ȯ���� ������(void), ������� ���� ������ �޼ҵ� �������� ���� ����� �� ����.
	 * => ����, return�ÿ��� ȣ��� �޼ҵ忡�� Sysout�� ����.
	 * 			void�ÿ��� �޼ҵ� ������ Sysout�� ����.
	 * => �ٸ�, return�ÿ��� �޼ҵ峻���� sysout�� ���൵ ����� ��µ�.
	 */
	
	// 1. �Ű�����X, ��ȯ��X (�׻� ��������)
	public void method1() {
		System.out.println("�Ű������� ��ȯ���� �Ѵ� ���� �޼ҵ��Դϴ�.");
		//1���� 10������ �հ踦 ���Ͽ� ����ϴ� ���
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println("���� : "+sum);
		
//		return; void�޼ҵ��� ��쿡�� �����Ǿ�����.(JVM�� �ڵ����� ��������.)
		
	}
	// 2. �Ű�����X, ��ȯ��O 
	// [�����޼���]
	// This method must return a result of type int
	public int method2() {
		System.out.println("�Ű������� ���� ��ȯ���� �ִ� �޼ҵ��Դϴ�.");
		
		// 1�������� 100���� ���� �� �������� �߻����� ��ȯ�����ִ� �޼ҵ�
		// int random = (int)((Math.random()*100)+1);
		// return random;
		
		return (int)((Math.random()*100)+1);
	}
	
	// 3. �Ű�����O, ��ȯ��X
	public void method3(int num1, int num2) {
		
		System.out.println("�Ű������� �ְ� ��ȯ���� ���� �޼ҵ��Դϴ�.");
		
		// num1�� num2�� ���ؼ� ����� ����ϴ� �޼ҵ�
		// �ּҰ� : xx
		// �ִ밪 : xx
		int min=0; // �� �� �� ���� ���� ���� �뵵�� ����
		int max=0; // �� �� �� ū ���� ���� �뵵�� ����
			if(num1 > num2) {
				min = num2;
				max = num1;
			}else {
				min = num1;
				max = num2;
			}
			System.out.println("�ִ밪 : "+max+"\n�ּҰ� : "+min);
	}
	// 4. �Ű�����O, ��ȯ��O
	public int method4(int a, int b) {
		System.out.println("�Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ��Դϴ�.");
		
		// �� �Ű������� ���� ������� ��ȯ���ִ� �޼ҵ�
		return a*b;
	}
}
