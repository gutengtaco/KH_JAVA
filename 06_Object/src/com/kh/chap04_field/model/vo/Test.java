package com.kh.chap04_field.model.vo;

public class Test {

	public static void main(String[] args) {
		FieldTest2 f2 = new FieldTest2();
		// => ���� ��Ű�� �ȿ� �־�, import �ʿ� ����.
		System.out.println(f2.pub);	// ���� ��Ű��, �ٸ� ��Ű�� ��� ����
		System.out.println(f2.pro); // ���� ��Ű�� ����, �ٸ� ��Ű�� �Ұ�(��ӽ� ����)
		System.out.println(f2.df); // ���� ��Ű������ ����, �ٸ���Ű�� �Ұ�
//		System.out.println(f2.pri); // �ٸ� Ŭ�������� �Ұ�.
	}

}
