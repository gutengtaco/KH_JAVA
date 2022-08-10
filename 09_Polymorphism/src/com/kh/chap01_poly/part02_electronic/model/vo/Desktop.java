package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{
//	�ʵ��
	public static final String CPU = "inter"; 
//	����ʵ�(public static final �ڷ��� �빮��=�ʱⰪ;)
//	public�̴� getter�޼ҵ� �ʿ���� + ����ʵ��̴� ���� �ٲ��� ���Ͽ� setter�޼ҵ� �ʿ����.
	private String graphic;
//	�����ں�
	public Desktop() {
		super();
	}
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand,name,price);
		this.graphic = graphic;
	}
//	�޼ҵ��
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
//	�������̵�
	@Override
	public String toString() {
		return "Desktop [brand="+super.getBrand()+", name="+super.getName()+", price="+super.getPrice()+
				", cpu ="+CPU+", graphic="+ graphic + "]";
	}
	
}
