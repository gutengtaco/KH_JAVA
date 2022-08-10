package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{
//	필드부
	public static final String CPU = "inter"; 
//	상수필드(public static final 자료형 대문자=초기값;)
//	public이니 getter메소드 필요없음 + 상수필드이니 값을 바꾸지 못하여 setter메소드 필요없음.
	private String graphic;
//	생성자부
	public Desktop() {
		super();
	}
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand,name,price);
		this.graphic = graphic;
	}
//	메소드부
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
//	오버라이딩
	@Override
	public String toString() {
		return "Desktop [brand="+super.getBrand()+", name="+super.getName()+", price="+super.getPrice()+
				", cpu ="+CPU+", graphic="+ graphic + "]";
	}
	
}
