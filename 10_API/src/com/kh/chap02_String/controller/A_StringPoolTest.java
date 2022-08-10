package com.kh.chap02_String.controller;

public class A_StringPoolTest {
	
	
//	StringŬ������ ���Ͽ� �����غ���
//	String�� "�Һ�Ŭ����"(������ �ʴ� Ŭ����)��� �Ҹ�.
//	=> String ��ü �������� ���� �����Ǵ� ����, ������ ��� ������ ���� ����Ǵ� ���� �ƴ�, 
//	=> ���ο� ������ ���ο� ���ڿ��� ����� �� ��ġ�� �����ϰڴ�.
	
//	String������ ��ü �����
//	1. �����ڸ� ���ؼ� ���ڿ� ��� => String str = new String();
	public void method1() {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
//		Stack				Heap
//		
//		0123	-------->	Hello
//		str1				0123
//		
//		1234	-------->	Hello
//		str2				1234
		System.out.println(str1 == str2); // false, �ּҰ� ��
		System.out.println(str1/*.toString*/);	// Hello
//		�� toString�ε��� �ּҰ��� �ƴ� �������� �����°�?
//		ObjectŬ������ toString()�޼ҵ�� �޸�,
//		StringŬ������ toString()�޼ҵ��� ���
//		�������̵��� �Ͽ� ���� ����ִ� �ּҰ��� �ƴ�, ���� ����ִ� ���ڿ��� ��ȯ�ϰԲ� ��.
		
		System.out.println(str1.equals(str2));	// true, ���� ���ڿ� ��
//		String Ŭ������ equals()�޼ҵ��� ���,
//		������ ���� ����ִ� �ּҰ��� ���ϴ� ���ҿ���
//		���� ����ִ� ���ڿ��� ���� �� �ְԲ� �������̵� �� ����.
		
		System.out.println(str1.hashCode()); // 69609650
		System.out.println(str2.hashCode()); // 69609650
//		����������(��ü)���� �ּҰ��� 10������ ���·� ��ȯ���ִ� �޼ҵ�
//		str1�� str2�� �ּҰ��� ���� ����.
//		������ StringŬ������ hashcode()�޼ҵ��� ���
//		���� ����ִ� �ּҰ��� 10���� ���·� �������� ������ ������,
//		�� ���ҿ��� ���� ����ִ� ���ڿ� ������� �ؽ��ڵ带 10���� ���·� ���� �������Բ� �������̵���.
//		��, �Ѵ� "Hello"�� ���ڿ��� �����ϱ� ������, ���� �ּҰ��� ����.
		
//		�׷��ٸ� ��¥ �ּҰ��� �ؽ��ڵ带 �˰�ʹٸ�?
//		System.identityHashCode(������������)
//		=> �ش� ��ü�� ���� �ּҸ� �ؽ��ڵ�� ���
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
//	2. ���� ���ͷ��ν� �����ع����� => String str = "~";
	public void method2() {
		String str1 = "hello";
		String str2 = "hello";
//									  ��> hello(�ߺ��� ����)
//		Stack				Heap     ����
//						   [���Ǯ]
//		0123	��������������������> hello
//		str1				0123
//							 ��
//		1234	����������������������������	
//		str2
		
//		String ��ü�� ���鶧, ���ͷ��� �����ϴ� ������� ��ü�� �����
//		�� ���빰�� heap������ �ִ� "���Ǯ(StringPool)"�� ������ �ö󰡰� ��.
//		�� ���������� �ߺ��Ǵ� ������ �ִٸ�, �ߺ��� ������ ���� ���, ���� �ּҰ��� �����ϰ� ��.
		
		System.out.println(str1 == str2); // true, �ּҰ� ��
		System.out.println(str1/*toString*/);
		System.out.println(str2/*toString*/);
		System.out.println(str1.equals(str2)); // true, ������ ��
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // ���� ���빰(���ڿ�)�� ������� 10����ȭ
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));	// ���� �ּҰ��� ��ȯ
	}
	
//	�Һ�Ŭ����
//	=> ������ ���빰�� ������ �ʰ�, ���ο� �ּҿ� ���ο� ������ �߰��ϰ�, �����ϴ� �ּҸ� �ٲ�.
	public void method3() {
		String str = "hello";
		System.out.println(System.identityHashCode(str));
		
		str = "goodbye";
		System.out.println(System.identityHashCode(str));
		
		str += "abc";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
//										 ��> hello(0123), goodbye(1234) => ������ ����, ������ GC�� ������.
//		Stack				Heap		����
//						  [���Ǯ]
//		2345			  goodbyeabc
//		str				  2345	
//						  
		/*
		 * ������ ���Ǯ�� ������ ���� ���ڿ����� GC�� ���� ������.
		 * "�Һ�"�̶�� �ؼ� ������ �ƿ� �ȵǴ� ���� �ƴ϶�(�� ���� "���"��)
		 * ������ �� �ڸ����� �����Ǵ� ������ �ƴ�, �Ź� ���ο� �ּҰ��� �����ϴ� ����
		 */
	
	}
}
