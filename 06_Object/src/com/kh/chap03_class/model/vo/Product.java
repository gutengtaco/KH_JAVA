package com.kh.chap03_class.model.vo;


// Ŭ�������� ��� ������ ���������� : 
// public, default(����)
// [�����޼���]
// Product cannot be resolved to a type
// ���� ������ default�� ��Ȳ���� Run�� Ŭ�������� 
// �ٸ� ��Ű���� ProductŬ������ ����� �� �߻�.
// ��, ���� ��Ű�� �ȿ� ������ ��쿡�� ����� �� ����.
public class Product {

//	[�ʵ��]
//	��ǰ��, ��ǰ����, �귣��
	private String pName;
	private int price;
	private String brand = "����";
	
//	[�����ں�]
	
//	[�޼ҵ��]
//	setter
	public void setpName(String pName) {
		this.pName = pName;
	}
//	��Ÿ�� ǥ��� ���� : ���Ϲ��ڿ� �ܾ �����ϸ� ���Ϲ��ڴ� �ҹ��ڷ�, �ܾ�� ù���� �빮�ڷ�.
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
//	getter
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
//	information
	public String information() {
		return "��ǰ�� : "+pName+"\n"+ "��ǰ���� : "+price+"\n" + "�귣��  : "+ brand;
	}
}
