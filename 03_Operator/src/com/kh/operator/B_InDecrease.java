package com.kh.operator;

public class B_InDecrease {
	/*
	 * ����������
	 * ���׿����ڷν�, �ѹ��� ���� 1�� ������Ű�ų� ���ҽ�Ű�� �������̴�.
	 * 
	 * ����
	 * ++ : �ѹ��� ���� 1�� ������Ų��.
	 * [ǥ����]
	 * ++��; : ���� ���� ������
	 * �� ++; : ���� ���� ������
	 * -- : �ѹ��� ���� 1�� ���ҽ�Ų��.
	 * [ǥ����]
	 * --��; : ���� ���� ������
	 * ��--;  : ���� ���� ������
	 * 
	 * => �������� ��ġ�� ���� ������ ���� ���� �����Ѵ�.
	 * (����������)�� : ������ ���� �ǰ� ���� ���� ó���Ѵ�. => ������ ��ó��
	 * ��(����������) : ���� ���� ó���ϰ� ������ �Ѵ�.	=> ��ó�� ������
	 */
	public void method1() {
		int num = 10;
		System.out.println("num : "+num);
		num++;
		System.out.println("����� num : " +num);
		// num Variable�� ���� ���� 1 ������Ų��.
		// ��, num = num + 1; �� ���� �ǹ��̴�.
		num--;
		// num Variable�� ���� ���� 1 ���ҽ�Ų��.
		// ��, num = num - 1; �� ���� �ǹ��̴�.
		num--;
		System.out.println("����� num : " +num);
	}
	public void method2() {
		// ��������
		int a = 10;
		int b = ++a; 
		// ������ : ++a(11)
		// ��ó�� : int b=++a(11)
		// ++a�� ����, ���� ����
		System.out.println("a : "+a+", b : "+ b);
		
		// ��������
		int c = 10;
		int d = c++; 
		// ��ó�� = int d=c(10)
		// ������ : c++(11)
		// ���� ����, ���� c++
		System.out.println("c : "+c+", d : "+ d);
	}
	
	public void method3() {
		// ���������ڴ� ���׿����ڶ� �� �Ѱ����� ���� �ȴ�.
		// ��, ���������ڰ� ���� num(1,2,3,4)���� ������ ����ȴ�.
		// ++��������
		int num1 = 20;
		int result1 = num1++ * 3; 
		// result1 = 60, num1 = 21
		System.out.println("num1 : " + num1);
		System.out.println("result1 : " + result1);
		
		// ++��������
		int num2 = 20;
		int result2 = ++num2 * 3;
		// num2 = 21, result2 = 63
		System.out.println("num2 : " + num2);
		System.out.println("result2 : "+result2);
		
		// --��������
		int num3 = 10;
		int result3 = --num3 * 5;
		// num3 = 9, result3 = 45 
		System.out.println("num3 : "+ num3);
		System.out.println("result3 : "+result3);
		
		// --��������
		int num4 = 10;
		int result4 = num4--*5;
		// result = 50, num4 = 9
		System.out.println("num4 : "+num4);
		System.out.println("result4 : "+result4);
	}
}
