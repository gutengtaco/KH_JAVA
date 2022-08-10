package com.kh.chap04_field.model.vo;

// �ʵ忡�� ��� ������ ���������� 4����
// Ŭ�������� public, default�� ��� ����.
public class FieldTest2 {
	// �ʵ忡���� public, protected, default, private ��� ����
	
	/*
	 * (+) public : ��𼭵�(���� ��Ű��, �ٸ���Ű��) ���� �����ϵ��� ��.
	 * (#) protected : ���� ��Ű���� ������ ����.
	 * 				       ��Ȳ�� ���� �ٸ� ��Ű������ ���� ����. 
	 * 				   ("��� ����"�� ��쿡 �ٸ� ��Ű���� ���� ���� )
	 * (~) default : ������ ���� ��Ű���� ��쿡�� ����. ���� �� �ڵ����� �����.
	 * (-) private : ���� �ش� Ŭ���� �������� ��� ����.
	 * 
	 * => ���������� �Ʒ��� ����������, ������ �� �ִ� ������ ������.
	 * => �տ� ���� ��ȣ(+,#,~,-)���� Ŭ���� ���̾�׷��̶�� ��.
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	/*default*/ String df = "default";
	private String pri = "private";
}
