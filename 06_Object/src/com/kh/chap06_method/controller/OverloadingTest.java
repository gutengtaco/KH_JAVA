package com.kh.chap06_method.controller;

public class OverloadingTest {
	/*
	 * �޼ҵ� �����ε�
	 * �� Ŭ���� ���� ���� �޼ҵ������ ���� �޼ҵ带 ������ �� �ִ� ���.
	 * (��, �޼ҵ��� �̸��� �ߺ��ǵ� �����.)
	 * 
	 * �����ε� ��Ģ
	 * 1. �Ű������� �ڷ����� ����, ������ �ٸ��� �ۼ��Ǿ�� ��.
	 * 2. �Ű�������, ��ȯ��, ���������ڴ� �����ε��� ������ ���� ����.
	 * 3. �޼ҵ���� �����ؾ� ��.
	 */
	
	/*
	 *�����ε��� �� �� ����
	 *System.out.println : �Ű������� ������ ������ ������ �ٸ� ����
	 *System.out.printf : �Ű������� ������ ����� �ٸ� ����
	 *������ �ߴ� "������" ���� 
	 */
	
	public void test() {
		// System���� println�޼ҵ带 ����� ����.
		// ��ȣ ���� ���빰�� �Ű�������.
		System.out.println(0);	// int
		System.out.println('1');	// char
		System.out.println(1.1);	// double
		System.out.println("����"); 	// String
 		System.out.println(true);	// boolean
 		// => �޼ҵ��� �Ű������� ������ ������, ������ �ٸ��� ������, �����ε��� ��ǥ���� ������.
	}
	public void test(int a) { // �Ű������� ������ �ٸ���, �����ε��� �����.
		
	}
	public void test(int a, String s) { // ����������, �Ű������� ������ �޶�, �����ε��� �����.
		
	}
	public void test(String s, int a) { // �Ű������� ������ ������ ������, ������ �ٲ㼭, �����ε��� �����.
		
	}
	public void test(int a, int b) { // �Ű������� ������ ������, ������ �޶�, �����ε��� �����.
		
	}
//	public void test(int c, int d){ // �Ű������� ����, ����, ������ ���� => �����ε��� ���� �ȵ�.
//									   => �Ű��������� ������ ���� ����.
//									   => �Ű������� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ�� ��.
//	}
	public void test(int a, int b, String s) { // �Ű������� ����, ������ ��� �޶�, �����ε��� �����.
		
	}
//	public int test(int a, int b, String s) {    �Ű������� ����, ����, ������ ���� => �����ε��� ���� �ȵ�.
//												 =>��ȯ���� ������ ���� ����.
//		  										 =>������ �Ű������� ����, ����, ������ �����ε��� ������ ��.
//	}
//	private void test(int a, int b, String s) {	 �Ű������� ����, ����, ������ ���� => �����ε��� ���� �ȵ�.
//	 											 =>���������ڰ� ������ ���� ����. 
//		
//	}
	
}