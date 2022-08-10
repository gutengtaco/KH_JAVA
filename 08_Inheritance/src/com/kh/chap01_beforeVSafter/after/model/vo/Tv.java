package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product {

//	필드부
//	코드에는 없지만, Product에서 필드를 가져옴.
	private int inch;
	
//	생성자부
	public Tv() {}
	public Tv(String brand, String pCode, String pName, int price
			, int inch) {
		
		super(brand,pCode,pName,price);
		this.inch = inch;
	}
	
//	메소드부
//	메소드도 마찬가지로 
//	getter,setter메소드가 코드에는 없지만, Product에서 메소드를 가져와서 사용.
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	//
	//@override : 일종의 주석임. 단순히 오버라이드된 메소드라는 사실을 알려줌.
//				     다만, 오버라이드가 안되는데 이 주석을 달면 오류를 나타내줌.	
	public String information() {
		return super.information()+", "+inch;
	}
	
}
