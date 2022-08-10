package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

//	다형성을 적용한 후
public class ElectronicController2 {
//	[필드부]
//	필드를 객체배열, 객체명으로 지어줌
//	여기서, 객체배열의 할당까지 이루어짐.
	private Electronic[] elec = new Electronic[3];
	
//	[생성자부]
	
	
//	[메소드부]
//	물건이 납품될때마다, 창고에 물건을 하나하나 차곡차곡 채워넣겠다.
//	매개변수에 객체를, index번째의 객체배열에 대입함. 
//	이때, Electronic의 매개변수생성자를 갖다 쓴 것임.
	public void insert(Electronic any, int index) {
			elec[index] = any;
	}
//	고객이 원하는 물건을 하나씩 꺼내주기(창고로부터) 
	public Electronic select(int index) {
		return elec[index];
	}
//	고객이 원하는 물건이 재고의 전부일때 => 창고째로 넘겨주기

	public Electronic[] select() {
		return elec;
	}
	
	/*
	 * 메소드
	 * 입력값(매개변수)이 있든 없든간에, 수행할 내용을 실행함.
	 * => 반환값이 있으면 내보내고, 없으면 메소드 내에서 연산만 함.
	 * 
	 * 입력값 : boolean,byte, short, int, long, float, double, char, String, 
	 * 			객체, 배열, 객체배열,... 
	 * 			ex) main메소드(String[] args) =>String[]배열의 args라는 객체명
	 * 출력값 : void, boolean,byte, short, int, long, float, double, char, String, 
	 * 			객체, 배열, 객체배열,...
	 */
}
