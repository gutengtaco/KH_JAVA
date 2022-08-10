package com.hw2.model.vo;

public class Book {
//	필드부
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
//	생성자부
	public Book() {}
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
//	메소드부
//	setter 메소드
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
//	getter 메소드
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public String getAuthor() {
		return author;
	}
	
//	information메소드
	public String information() {
		return "도서명 : "+title+", 가격 : "+price+", 할인율 : "+discountRate
				+", 저자명 : "+author;
	}
}

