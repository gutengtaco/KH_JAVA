package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	public void method1() {
		
		String str = "Java,Oracle,JDBC,HTML,Server,Spring";
		
//		�����ڸ� �����ؼ� �ش� ���ڿ��� �ܾ� ������ �и�
//		���1. �и��� ���ڿ����� String�迭�� �������� ��Ƽ� ����
		String[] arr = str.split(",");
//		split�̶�� ���ڿ��� �ɰ��ִ� �޼ҵ带 Ȱ��(String Ŭ����)
//		[ǥ����] ���ڿ�.split(String������) : String[]
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
//		�迭�� ���, for���� ������ ���� �� �� ����(���� for��, for each��)
//		[ǥ����]
//		for(���� ����� ���� ���� : ���������� �����ϰ� ���� �迭�� �Ǵ� �÷��Ǹ�) { �ݺ������� ������ �ڵ� } 
		for(String s : arr) {	// ���ǻ��� : �ش� �迭�� Ÿ�Կ� �°� ���������� �ۼ��ؾ� ��!!
//			arr[0] = s => system.out.print(s) : Java
//			arr[1] = s => system.out.print(s) : Oracle
//			arr[2] = s => system.out.print(s) : JDBC
//			...
//			arr[5] = s => system.out.print(s) : Spring
			
//			���������� s��� ���ڿ� Ÿ���� ������ arr[i] �濡 ���� ���� ���������� ���鼭, �ڵ带 ������.
//			���� �̹� �̾Ƽ� ������ ��� �����Ǵ� �����̶�, �迭�� ���� ���� �����ϴ� �뵵�δ� �Ұ���
//			����, �迭�� ���� ������ִ� �뵵�θ� �����.
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
//		���2. �и��� ������ ���ڿ����� "��ū"�̶�� ������ ����ϴ� ���
//		���⼭ ��ū�̶�? �ܾ��� �� �����̸� ���ϴ� ����.
//		StringTokenizer Ŭ������ Ȱ����.(java.util.StringTokenizer)
//		[ǥ����]
//		StringTokenizer ��ü�� = new StringTokenizer(�и���Ű���� �ϴ� ���ڿ�, ������);
		StringTokenizer stn = new StringTokenizer(str, ",");
		
//		countTokens();
//		�и��Ǿ� �����ϴ� ���ڿ��� ������ ������ ��ȯ����.
		System.out.print("�и��� ���ڿ��� ���� : "+stn.countTokens() + "��"); // 6��
		
//		nextToken();
//		Java, Oracle, JDBC, HTML, Server, Spring
//		�ɰ��� �ܾ ���������� ��ȯ����.
//		System.out.println();
//		System.out.println(stn.nextToken());	// Java
//		System.out.println(stn.nextToken()); 	// Oracle
//		System.out.println(stn.nextToken());	// JDBC
//		System.out.println(stn.nextToken());	// HTML
//		System.out.println(stn.nextToken());	// Server
//		System.out.println(stn.nextToken());	// Spring
//		System.out.println(stn.nextToken());
//		[�����޼���]
//		java.util.NoSuchElementException
//		���� �����ִ� ��ü�κ���, ��ū ������ ������ ����� �߻��ϴ� ������.
		System.out.println();
		System.out.println("���� ����ִ� ��ū�� ���� : "+stn.countTokens() + "��"); // 0��
//		nextToken���� �̾Ƴ���, ������ ��ū ������ ������
		
//		��ū�� ��µɼ��� countTokens()�� ������� -1�� �Ǽ�,
//		�̸� ������ ��Ƴ���, �̸� ���ǽĿ� ����Ͽ� �ݺ��� �����ؾ� ��.
//		int end = stn.countTokens();
//		for(int i=0; i<end; i++) {
//			System.out.print(stn.nextToken()+" ");
//		}
		
//		���̻� �̾Ƴ� ��ū�� �ֳ�?��� ������ �����ϸ� while�� ��� ����
//		StingTokenizerŬ�������� �����ϴ� hasMoreTokens()�޼ҵ带 ���
//		=> StringTokenizer ��ü�κ��� �̾Ƴ� ��ū�� �ִ� ��쿡 true�� ��ȯ
		while(stn.hasMoreTokens()) {	// true�� ��¹���
			System.out.print(stn.nextToken()+" ");
		} 	// false�� ���.
		
	}
}
