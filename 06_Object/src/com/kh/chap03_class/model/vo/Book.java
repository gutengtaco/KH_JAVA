package com.kh.chap03_class.model.vo;

public class Book {
	
//	[�ʵ��]
//	������ : title
//	���ǻ�� : publisher
//	���� : author
//	���� : price
//	������ : discountRate
	private String title;
	private String publisher;
	private String author;
	private	int price;
	private double discountRate;

//	[�����ں�]
	public Book() {}
	
	public Book(String title, String publisher, String author
			,int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
//	[�޼ҵ��]
//	setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
//	getter
	public String getTitle() {
		return title;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
//	information
	public String information() {
		return "title : " + title+"\n" + "publisher : "+publisher+"\n"
				+"author : "+ author+"\n" + "price : " + price+"\n" 
				+ "discountRate : "+discountRate;
	}
}

