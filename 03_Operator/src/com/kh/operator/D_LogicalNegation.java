package com.kh.operator;

public class D_LogicalNegation {
	/*
	 * �� ���� ������
	 * true �Ǵ� false��� ������ ���������ִ� ������
	 * ���������, ����������, ���մ��Կ����ڰ� ���ڿ� ����� �������� �Ϳ� ����
	 * �� ���� �����ڴ� ������ ���� ������ �����Ѵ�.
	 * [ǥ����]
	 * !����
	 */
	public void method1() {
		System.out.println("True�� ���� : " + !true);
		System.out.println("False�� ���� : "+ !false);
		
		boolean b1 = true;
		boolean b2 = !b1;
		System.out.println("b1�� ���� : "+b1);
		System.out.println("b2�� ���� : "+b2);
	}
}
