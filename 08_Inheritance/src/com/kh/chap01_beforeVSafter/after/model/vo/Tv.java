package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product {

//	�ʵ��
//	�ڵ忡�� ������, Product���� �ʵ带 ������.
	private int inch;
	
//	�����ں�
	public Tv() {}
	public Tv(String brand, String pCode, String pName, int price
			, int inch) {
		
		super(brand,pCode,pName,price);
		this.inch = inch;
	}
	
//	�޼ҵ��
//	�޼ҵ嵵 ���������� 
//	getter,setter�޼ҵ尡 �ڵ忡�� ������, Product���� �޼ҵ带 �����ͼ� ���.
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	//
	//@override : ������ �ּ���. �ܼ��� �������̵�� �޼ҵ��� ����� �˷���.
//				     �ٸ�, �������̵尡 �ȵǴµ� �� �ּ��� �޸� ������ ��Ÿ����.	
	public String information() {
		return super.information()+", "+inch;
	}
	
}
