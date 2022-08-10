package com.kh.chap01_oneVsmany.model.vo;

public class Book {
//	�ʵ��
// 	������, ���ڸ�, ���ǻ��, ����
	private String title;
	private String author;
	private String publisher;
	private int price;
	
//	�����ں�
//	�⺻ ������
	public Book() {}
//	��� �ʵ带 �Ű������� ���� ������
//	��ü ������ ���ÿ� ��� �ʵ��� ����, 
//	���� ���ϴ� ������ �ʱ�ȭ�ϱ� ���ؼ� �ۼ�.
	public Book(String title, String author ,String publisher, int price) {
		this.title = title;
		this.author = author;
		this.publisher=publisher;
		this.price = price;
	}

//	�޼ҵ��
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
