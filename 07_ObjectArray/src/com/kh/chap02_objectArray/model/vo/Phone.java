package com.kh.chap02_objectArray.model.vo;
// 클래스(VO:Value Object)
public class Phone {
//	필드부(멤버변수, 인스턴스변수)
//	이름, 시리즈, 브랜드명, 가격
	private String name;
	private String series;
	private String brand;
	private int price;
	
//	생성자부
//	기본생성자
	public Phone() {}
//	매개변수 생성자
//	메소드 이름이 같음 + 매개변수가 다름 : 오버로딩
	public Phone(String name, String series, String brand, int price) {
		this.name = name;
		this.series = series;
		this.brand = brand;
		this.price = price;
	}
	
//	메소드부
//	setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	getter
	public String getName() {
		return name;
	}
	public String getSeries() {
		return series;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
//	information
	public String information() {
		return "name : "+name + ", series : "+series + ", brand : "+brand + ", price : "+price;
	}
}
