package com.kh.chap01_oneVsmany.model.vo;

public class Book {
//	필드부
// 	도서명, 저자명, 출판사명, 가격
	private String title;
	private String author;
	private String publisher;
	private int price;
	
//	생성자부
//	기본 생성자
	public Book() {}
//	모든 필드를 매개변수로 갖는 생성자
//	객체 생성과 동시에 모든 필드의 값을, 
//	내가 원하는 값으로 초기화하기 위해서 작성.
	public Book(String title, String author ,String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher=publisher;
		this.price = price;
	}

//	메소드부
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getPrice() {
		return price;
	}
	public String information() {
		return "title : "+title+", author : "+author+", publisher : "+publisher + ", price: "+price;
	}
}
