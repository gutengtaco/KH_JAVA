package com.kh.practice.chap01_poly.model.vo;

public class AniBook extends Book {
//	�ʵ��
	private int accessAge;
//	�����ں�
	public AniBook() {
		super();
	}

	public AniBook(String title, String author, String publisher,
		   int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
//	getter, setter
	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
//	toString
	@Override
	public String toString() {
		return "AniBook ["+super.toString()+", " + "accessAge : "+ accessAge+"]";
	}
}
