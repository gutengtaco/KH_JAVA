package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성을 적용하기 전
public class ElectronicController1 {
//	[필드부]
//	용산 전자상가에 새로 차린 가게
//	필드를 클래스, 객체명으로 지어줌.
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
//	[생성자부]
	
	
//	[메소드부]
//	데스크탑 재고가 들어올 경우,
//	오버로딩을 이용하여 메소드 이름은 같게, 매개변수는 다르게.
//	다만, 매개변수가 자료형을 클래스로, 매개변수명을 객체로 구성한 것일 뿐
	
//	형태는 setter메소드와 같음.
//	데스크탑을 생성해주는 메소드
	public void insert(Desktop d) {
//		Desktop d = new Desktop("삼성","데스크탑",1200000, "Geforce1070");
//		desk = new Desktop("삼성","데스크탑",1200000,"Geforce1070");
		desk = d;
	}
//	노트북을 생성해주는 메소드
	public void insert(NoteBook n) {
		note = n;
	}
//	태블랫을 생성해주는 메소드
	public void insert(Tablet t) {
		tab = t;
	}
//	형태는 getter메소드와 같음.
//	오버로딩이 불가(리턴형은 매개변수가 없기 때문에)하기 때문에,
//	각각의 메소드명을 아래와 같이 지었음.
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
		
}
