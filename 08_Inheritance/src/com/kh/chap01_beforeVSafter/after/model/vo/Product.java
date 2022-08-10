package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	/*
	 * Tv, SmartPhone, Desktop은 "상품"이라는 공통적인 특징이 있음.
	 * "상품"이라면 당연히 가져야 하는 속성 : brand, pCode, pName, price 
	 * 
	 * 새 클래스 모두 공통적으로 기술했던 요소들만 추출해서 단 한번만 정의
	 * => 이렇게 정의한 클래스를 부모클래스(상위클래스, 슈퍼클래스)라고 함.
	 * 
	 */
//	필드부
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
//	생성자부
	public Product() {}
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	
//	메소드부
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String information() {
		return brand+", "+pCode+", "+pName+", "+price;
	}
	
	
}

