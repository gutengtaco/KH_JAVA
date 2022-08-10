package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;

public class MethodRun {

	public static void main(String[] args) {
		
		System.out.println("------------MethodTest1 Ŭ����------------"); 
//		1��
		MethodTest1 m1 = new MethodTest1();
		m1.method1(); 
		
		System.out.println("--------------------------------");
//		2��
//		m1.method2();	// sysout�� ���� ������ ������� ������ ����.
//		int random = m1.method2();	
//		System.out.println("������ : "+random);
		System.out.println("������ : "+m1.method2());
		
		System.out.println("--------------------------------");
//		3��
		m1.method3(1,10); // ����, ����, �ڷ����� �¾� �������� ��.
		
		System.out.println("--------------------------------");
//		4��
		System.out.println(m1.method4(1, 10)); // sysout�� ���� ������ ������� ������ ����.
		
		/*
		 * ��ȯ���� �ְ�, ������ ����
		 * 1. ��ȯ���� �ִ� ���(void�� �ƴ� ���) - 2,4��
		 * => ������ ������� ������, �޼ҵ带 ȣ���ϴ� ������ ��ȯ���� �´� ������ �����Ͽ� ����� ����.
		 * 2. ��ȯ���� ���� ���(void�� �ִ� ���) - 1,3��
		 * => ������ ������� ������, �޼ҵ� ������ ����� ����ϴ� ���·� �̿�.
		 * 
		 */
		System.out.println("------------MethodTest2 Ŭ����------------"); 
		MethodTest2.method1(); // static�� import���־�� ��.
		
		System.out.println("---------------------------------");
		String str = MethodTest2.method2();
		System.out.println(str);
		System.out.println(MethodTest2.method2());
		
		System.out.println("---------------------------------");
		MethodTest2.method3("ȫ�浿", 20);
		
		System.out.println("---------------------------------");
		
		System.out.println(MethodTest2.method4(10, 6, '*'));
		
		/*
		 * static �޼ҵ��� ��쿡�� new������ ��ü�� ������ �ʿ䰡 ����.
		 * static�� ���� Ŭ���� ������ ���������� �޼ҵ� ����,
		 * ���α׷� ���� ��, �޸��� static����(����)�� �Ҵ��.
		 */
	}

}
