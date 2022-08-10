package com.kh.chap03_class.model.vo;


// 클래스에서 사용 가능한 접근제한자 : 
// public, default(생략)
// [오류메세지]
// Product cannot be resolved to a type
// 위의 오류는 default인 상황에서 Run인 클래스에서 
// 다른 패키지인 Product클래스를 사용할 시 발생.
// 단, 같은 패키지 안에 존재할 경우에는 사용할 수 있음.
public class Product {

//	[필드부]
//	상품명, 상품가격, 브랜드
	private String pName;
	private int price;
	private String brand = "애플";
	
//	[생성자부]
	
//	[메소드부]
//	setter
	public void setpName(String pName) {
		this.pName = pName;
	}
//	낙타등 표기법 예외 : 단일문자와 단어를 조합하면 단일문자는 소문자로, 단어는 첫글자 대문자로.
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
		return "상품명 : "+pName+"\n"+ "상품가격 : "+price+"\n" + "브랜드  : "+ brand;
	}
}
