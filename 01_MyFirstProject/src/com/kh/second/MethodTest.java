package com.kh.second;

public class MethodTest {// MethodTest Class ������ �����Ѵ�.

/*
 * �� Class���� ���� ���� Method�� ���� �� �ִ�.
 * ������ main Method�� ������ �ʿ�� ����.
 * (��, ���α׷� ���������� �ּ� 1�� �̻��� �ʿ��ϴ�) 	
 */
	
	//�Ϲ� Method : ������ ������� ���Ѵ�. ȣ��(call)�� �ʿ��ϴ�.
	public void testPrintA() {
		//Method�� ����Ǵ� ���� ����� ����
		System.out.println("testPrintA Method ����");
		testPrintB();
	}
	public void testPrintB() {
		//Method�� ����Ǵ� ���� ����� ����
		System.out.println("testPrintB Method ����");
		testPrintC();
	}
	public void testPrintC() {
		//Method�� ����Ǵ� ���� ����� ����
		System.out.println("testPrintC Method ����");
		// testPrintA(); ���ѹݺ��� ��.
		// [������]
		// ���α׷�����
		// testPrintA �޼ҵ� ����
		// testPrintB �޼ҵ� ����
		// testPrintC �޼ҵ� ����
		// testPrintA �޼ҵ� ����
		// testPrintB �޼ҵ� ����
		// testPrintC �޼ҵ� ����
		// ...
		// [�����޼���]
		// Exception in thread "main" java.lang.stackOverflowError
		// Stack�� �޸� ������ �� ���� �� �ϳ��ε� Stack�� ũ�⸦ ��� ��� �߻�
	}
	
}// MethodTest Class ������ ������.
