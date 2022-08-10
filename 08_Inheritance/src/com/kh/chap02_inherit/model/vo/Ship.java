package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle{
//	필드부
	private int propeller;
	
//	생성자부
	public Ship() {}
	public Ship(String name, double mileage, String kind,int propeller) {
		super(name,mileage,kind);
		this.propeller = propeller;
	}
//	메소드부
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	public int getPropeller() {
		return propeller;
	}
	@Override
	public String information() {
		return super.information()+", "+propeller;
	}
	@Override
	public void howToMove() {
		System.out.println("프로펠러를 움직인다.");
	}
}
