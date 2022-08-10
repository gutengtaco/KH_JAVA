package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		/*
		 * DateŬ����
		 * java.util ��Ű�� �ȿ� ����(Scanner, StringTokenizer, Date)
		 * ��¥�� �ð��� ���� ������ ���� �� �ִ� Ŭ����
		 * �ڹ� ���� ��â�⿡ ���ϰ� ����, �ϼ����� ���� ���� Ŭ����
		 */
		
//		�⺻�����ڸ� ���� Date.��ü ���� => ���� ��¥ �� �ð��� ������ ��.
		Date today = new Date();
		System.out.println("�⺻������ : " + today/*.toString()*/); 
//		Wed Mar 02 12:16:23 KST 2022
		
//		��� 1. �Ű����� �����ڸ� �̿��Ͽ� �����
//		���� ���ϴ� ��¥ (2020�� 6�� 19��)
//		Date date1 = new Date(2020,6,19);
		
//		[���޼���]
//		The constructor Date(int, int, int) is deprecated
//		����� ��������� ����.(�������� �Ⱦ��Ե�)
		
//		System.out.println("�Ű����������� : "+date1); 
//		Mon Jul 19 00:00:00 KST 3920
		
//		���������� ���� ������ �⵵ + 1900 => �����ϰ��� �ϴ� �⵵-1900
//		���������� ���� ������ �� + 1 => �����ϰ��� �ϴ� �� - 1
//		Date date1 = new Date(2020-1900, 6-1, 19);
//		System.out.println("�Ű����������� : "+date1);
		
		Date date1 = new Date(2020-1900, 6-1, 19, 13,44,30);
		System.out.println("�Ű����� ������ : "+date1);
		
		
//		���2. �߰������� ���� ���ϴ� ��¥��, ���ϴ� �������� �����Ͽ� ���
//		"2020�� 06�� 19�� 19�� 15�� 30��"
//		=> java.text.SimpleDateFormat�� ���
		
//		1. ������ �����ϸ鼭 SimpleDateFormat��ü ����(�Ű����������� Ȱ��)
//		month�� minute�� ��ġ�⶧���� ������ �빮��M, �п��� �ҹ���m
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
//		2. SimpleDateFormatŬ�������� �����ϴ� format()�޼ҵ�� ȣ��
//		[ǥ����]
//		sdf.format(Date��ü); : String
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
	}

}
