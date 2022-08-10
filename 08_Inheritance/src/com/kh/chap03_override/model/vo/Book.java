package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {
//	�ֻ��� Ŭ������ Object ��ӹ޾ƺ���
//	����, ���� Ŭ������ �θ�Ŭ������ �����ϴµ�, 
//	�׷�, Object�� �θ�Ŭ������ ���߻���� �޴°��� �ƴѰ�?
//	�ƴϴ�. �̋��� ���� Ŭ�����κ��� �θ�Ŭ����, ObjectŬ������ �Ž��� �ö󰡴� ����.
	
//	�ʵ��
	private String title;
	private String author;
	private int price;
	
//	�����ں�
//	�޴����� - source - generate constructor using field
	public Book() {}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
//	�޼ҵ��
//	getter , setter
//	�޴����� - source - generate getter and setter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	information
//	�޴����� - source - generate toString()
//	toString()�� �⺻������ Object�� ����� �ް� �ִ� ������.
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	/*
	 * �������̵�
	 * ��ӹް� �ִ� �θ�Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� ������(���ۼ�)�ϴ� ��.
	 * ��, �θ� �����ϰ� �ִ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ�.
	 * ȣ���, �ڽĸ޼ҵ尡 �켱���� ����.
	 * 
	 * �������̵� ���� ����
	 * 1. �θ� �޼ҵ��� �����ؾ� ��.
	 * 2. ��ȯ���� ���ƾ� ��.
	 * 3. �Ű������� �ڷ���, ����, ������ �����ؾ� ��.(�����ε����ʹ� �ݴ���)
	 * => ��, �Ű��������� ������.
	 * 4. �ڽĸ޼ҵ��� ���������ڰ� �θ�޼ҵ��� ���������ں��� ������ ���ų� �Ǵ� ���� ������ �� Ŀ����. 
	 * => �Ծ��� ������ ������(������ �Ϸ��� ��� �������� ��Ģ�� ���Ѿ� ��.)
	 * 
	 * @Override : annotation(�ּ�). ������ ������.(�θ�޼ҵ�� ���°� ���ٸ�)
	 * 			       �ּ�������, �߸� ������� ��� ������ �˷��ֱ� ������ ������ �� ����.  
	 * 			       �θ�޼ҵ尡 �Ŀ� �������� ��쿡�� ���� ������ �˷��ֱ� ������ ������ �� ����. 
	 */
	
	
	
	
}
