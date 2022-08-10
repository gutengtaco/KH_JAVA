package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		/*
		 * ��� Ŭ������ Object�� �ļ���.
		 * ��, �ڹٿ��� �ֻ���Ŭ������ �׻� Object
		 * => Object�� �ִ� �޼ҵ���� ��� Ŭ������ ������� ������ �� �� ����.
		 * => ������ �ȵ�� �Ը���� �������Ͽ� �� �� ����.
		 */
		
		Book bk = new Book("�ڹ�������","���ڹ�",23000);
		System.out.println(bk.toString()); // �ʵ��� ���빰�� ���ڿ��� ���̾.
		System.out.println(bk /*.toString*/); // �ּҰ��� �ƴ� �������� ����.
		
		/*
		 * Object Ŭ�������� �����ϴ� toString() �޼ҵ��� ���� ���� => �ּҰ� ����ֱ�
		 * (�ش� ������ ������ ǮŬ������ @�ش� ��ü�� �ּҰ��� 16�������� => 10������ .hashcode())
		 * => ������ �ּҰ��� ��� ��ſ�, �� �ʵ��� ���� ���ڿ��� ���̾ �����ϰԲ� �������̵��� ������.
		 * => toString()�޼ҵ带 �ּ�ó���ϸ�, �������̵��� �����Ǿ�, ������� �ּҰ��� ������ ���� �� �� ����.
		 */
		
		
	}

}
