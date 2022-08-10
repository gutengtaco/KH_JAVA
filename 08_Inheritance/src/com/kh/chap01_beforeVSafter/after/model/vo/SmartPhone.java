package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product{
//	�ʵ��
//	extends�� ���� �ڵ�󿡴� ��Ÿ����������, 
//	Product�� brand, pCode, pName, price�� �߰��� ȿ���� �ο���.
//	�߰��� getter, setter, information�޼ҵ�� ������ ȿ���� �ο���.
	private String mobileAgency;
	
//	�����ں�
	public SmartPhone() {}
	public SmartPhone(String brand, String pCode, String pName, int price
			        , String mobileAgency) {
		super(brand, pCode, pName, price);
//		�θ�Ŭ������ �Ű����������ڸ� ������ ��.
//		this()�� ������ �����. 
//		(this()�� ���� Ŭ������ �Ű����������ڸ�, super()�� ����Ŭ������ �Ű����� �����ڸ� ������)
		this.mobileAgency = mobileAgency;
	}
	
//	�޼ҵ��
	public String getMobileAgency() {
		return mobileAgency;
	}
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
//	�������̵� : �θ���� �޼ҵ带 �����޾�, �� �Ը���� ������.
//	�������ε� : �������̵� �� �� �޼ҵ尡 ȣ���, �켱������ ����.
	public String information() {
//		���Ը����, �θ�Ŭ������ info�� ���� ���ϴ� ������ �߰��ϰ� ����.
		return super.information()+", "+mobileAgency;
	}
}
