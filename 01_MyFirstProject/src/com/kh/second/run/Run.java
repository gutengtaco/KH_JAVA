package com.kh.second.run;

import com.kh.first.HelloEveryone;
import com.kh.second.MethodTest; // �ش� Package�� �ִ� �ش� Class�� ������ ����.(Import��)

//com.kh.second.run.Run
public class Run { // Class�ȿ� Source Code�� �ۼ��Ѵ�.
	
	// main Method
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		/*
		 * ���� Class�� �����ϴ� Method�� ȣ���ϴ� ���
		 * => ȣ���ϰ��� �ϴ� Method��();
		 * ������ ���� �ٸ� Class�� �����ϴ� Method�� ȣ���ϰ��� ��
		 */
		
		// 1. ȣ���� Method�� �����ϴ� Class�� ã�ƾ� �Ѵ�.
		// => ȣ���� Method�� �����ϴ� Class�� ����(new)�̶�� ���� �ؾ� �Ѵ�.
		// [ǥ����] MethodTest(Ŭ������) mt(�뺯�� �̸�) = new MethodTest(Ŭ������)();
		// MethodTest mt = new MethodTest();
		// => �⺻������ ���� ���� Package���� �ش� �̸��� ���� Class�� ã�´�.
		// => Run Class���ؿ��� MethodTest Class�� �ٸ� Package�� �����ϱ� ������ ������ ���.
		// [����] static Ű���带 ���̸� ���� ������ ������ �� �ִ�.
		
		// [�ذ���] 
		// 1. �ش� Class�� ��Ȯ�� ��� Package�� �ִ� Class���� ������ش�.
		// => com.kh.second.MethodTest mt = new com.kh.second.MethodTest();
		// 2. Class�� ������ �ۼ��� �ϵ�, �� Class�� � Package�� �����ִ����� ������ �߰��Ѵ�.
		// => import com.kh.second.MethodTest;
		MethodTest mt = new MethodTest();
		
		// 2. ���� �� �ش� Class�� �ִ� Method�� ȣ���Ѵ�.
		// [ǥ����] �뺯�� �̸�.ȣ���ϰ��� �ϴ� Method��();
		
		/*
		mt.testPrintA();
		mt.testPrintB();
		mt.testPrintC();
		*/
		
		// testPrintA Method�� �ѹ��� ȣ���ؼ� A,B,C ��� ȣ���ϴ� ����� ���ʹ�.
		mt.testPrintA();
		
		// �Ϲ� Method : ȣ�⿡ ���ؼ��� ������ �Ǵ� Method
		// main Method : ���� �������� ����Ǵ� Method
		// => main Method�� ȣ���ؼ� ����� �� �ִ°�?
		// => ������ Yes
		// public static�̶�� Ű���尡 ���� �ٸ� Class�� Method�� ȣ���Ѵ�.
		// Import���� ���� ���� �ٸ� Package�� ���� �ٸ� Class�� ȣ���Ѵ�.
		// [ǥ����] �ش�Class��.Method��();
		HelloEveryone.main(null); // null : ���� ������ �ǹ��ϴ� ��.
	}
	
}
