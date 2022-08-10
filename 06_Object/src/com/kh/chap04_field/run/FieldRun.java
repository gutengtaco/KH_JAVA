package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
//		=====1. FieldTest1 Ŭ���� =====
		FieldTest1 f1 = new FieldTest1();
//		��ü ������, global�̶�� ��������� ����� �� �ְ�
//		global�� ���� 0���� ä����(JVM)
//						int global=0;(�������)
		
		f1.test(10); // int num=10;(�Ű�����)
//						int local = 0;(��������)
//		test��� �޼ҵ带 ȣ���,num�̶�� �Ű������� �Ҵ��.
//		����, �޼ҵ尡 �����ϸ� local�̶�� ���������� �Ҵ��.
		
//		System.out.println(local);
//		System.out.println(num);
//		�޼ҵ尡 ����Ǵ� ��������, num�� local�� ���������̱� ������ ����� �Ұ�����.
		
		f1 =null;
//		�����ϴ� ������� ������.
//		�� ���� ���ĺ��ʹ�, f1�� ����� �� �� ���� = �������,�޼ҵ带 ����� �� ����.
//		System.out.println(global);	// �������
//		System.out.println(local);	// ��������
//		System.out.println(num); 	// �Ű�����
		
//		=====2. FieldTest2 Ŭ���� =====	
		FieldTest2 f2 = new FieldTest2();
		System.out.println(f2.pub); // ��𼭵� �������� ����.
		
//		not visible
//		System.out.println(f2.pro);  ���� ��Ű��O, �ٸ���Ű��X(��ӽ� O)
//		System.out.println(f2.df);  ���� ��Ű��O, �ٸ���Ű��X
		
//		System.out.println(f2.pri);  ���� Ŭ����O
		//ĸ��ȭ���� Ȱ���߾���.
		
//		=====3. FieldTes3 Ŭ���� =====
		System.out.println(FieldTest3.sta); //Ŭ��������(static����,[�����])
//		��ü������ ���ص�, import�� ���־�� ��.
//		��, ��� Ŭ������ �ִ��� ��Ȯ�ϰ� Ŭ�������� �پ��־�� ��.
// 		�ٸ� Ŭ������ ���� static�� �������� �Է��� ���� �ֱ� ������.
		
		FieldTest3 f3 = new FieldTest3();
		System.out.println(f3.sta);
//		��ü�� ���� �ǳ�, ����������.
//		System.out.println(FieldTest3.str);
//		[�����޼���]
//		Cannot make a static reference to the non-static field FieldTest3.str
//		str�� static������ �������� �ʾ�, ������ ���� ����� �� ����.
		
		FieldTest3.test();
//		���� �̿ܿ��� �޼ҵ嵵 static�� �̿��Ͽ� ������ ���� ȣ���� �� ����.
		
//		static�� ���� ��ǥ���� �� => Math
		
//		FieldTest3.NUM=100;
//		Math.PI = 100;
//		[�����޼���]
//		The final field FieldTest3.NUM cannot be assigned
//		����� �ٸ������� ������ �� ����.
		
		System.out.println(FieldTest3.NUM);
		
		
		FieldTest3.sta="���� �����غ���";
		System.out.println(FieldTest3.sta);
		
	}

}
