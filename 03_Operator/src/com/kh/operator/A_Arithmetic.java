package com.kh.operator;

public class A_Arithmetic {
	/*
	 * ���������
	 * ���׿����ڷ� ���� ����� �켱������ ������ �˴� ��Ģ����� ����.
	 * 
	 * ����
	 * ���� : +
	 * ���� : -
	 * ���� : *
	 * ������(��) : /
	 * ������(������): %(Modular) 
	 * 
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		System.out.println("num1 + num2 = " + num1 + num2);
		// num1�� num2�� Stringó�� ����Ͽ�, 103�̶�� ���� ���´�. 
		// => +��� ��ȣ�� ������ ��ɰ� ����� ����� �Ѵ� ������ �ִ�.
		// => �հ� �ڰ� �켱������ ������ +�̱� ������ ������ ������ ���ʿ��� ���������� ����ȴ�.
		System.out.println("num1 + num2 = " + (num1 + num2));
		// �ֿ켱������ ��ȣ�� ��� ���ڿ��� int���� ���� ����Ѵ�.
		
		// System.out.println("num1 - num2 = " + num1 - num2);
		// [�����޼���]
		// The operator - is undefined for the argument type(s) String, int
		// ������ ���, ������ �켱������ �����ϴ�.
		// �ֵ���ǥ�� +num1���� String���� ����Ͽ���, String - int�� �Ǿ� ������ �߻��Ѵ�.
		System.out.println("num1 - num2 = " + (num1 - num2));
		// =>���������� �ֿ켱������ ��ȣ�� ��� ���ڿ��� int���� ���� ����Ѵ�.
		
		int result = num1 + num2;
		System.out.println("result = " + result);
		// Variable�� ���ؼ��� �켱������ ������� ��ȣ���� ����ص� �ȴ�.
		
		System.out.println();
		// *,/,%�� �켱������ +,-���� ���� ������ ��ȣ�� ������� �ʾƵ� �ȴ�.
		// �ٸ�, ��ȣ�� ���� ���� �����Ѵ�.(Source Code�� �������� �������� ������)
		System.out.println("num1 * num2 = " + (num1*num2)); // 30�̶�� ���� ���´�.
		System.out.println("num1 / num2 = " + (num1/num2)); // 3�̶�� ���� ���´�.
		// ���� 3.33333... �̳� int�� �������� int�� ��µȴ�.
		System.out.println("num1 % num2 = " + (num1%num2)); // 1�̶�� ���� ���´�.
		
		// System.out.println(10 / 0);
		// [�����޼���]
		// Exception in thread "main"
		// java.lang.ArithmeticException: / by zero
		// 0���δ� ������ ���� ������ ���Ѵ�.
		// System.out.println(10 % 0);
		// [�����޼���]
		// Exception in thread "main"
		// java.lang.ArithmeticException: / by zero
		// 0���δ� ������ �������� ������ ���Ѵ�.
		
		System.out.println();
		//�Ǽ��� ���
		double a = 35; // 35.0
		double b = 10; // 10.0
		
		System.out.println("a + b= "+(a+b));
		System.out.println("a - b= "+(a-b));
		System.out.println("a * b= "+(a*b));
		System.out.println("a / b= "+(a/b));
		System.out.println("a % b= "+(a%b));
	}
	
	
}
