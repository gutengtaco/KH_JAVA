package com.kh.practice.chap01_poly.model.vo;

public class Book {
//	鞘靛何
	private String title;
	private String author;
	private String publisher;
//	积己磊何
	public Book() {
		super();
	}
	public Book(String title, String author, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
//	getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
//	toString
	@Override
	public String toString() {
		return "title=" + title + ", author=" + author + ", publisher=" + publisher;
	}
	
	
}
