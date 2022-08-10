package com.kh.chap01_poly.part01_basic.model.vo;
//	Parent -----> Child1
public class Child1 extends Parent{
//	필드부
	/*
	private int x;
	private int y;
	 */
	private int z;

//	생성자부
	public Child1() {
		super();
	}
	public Child1(int x, int y,int z) {
		super(x, y);
//		나대신 부모클래스 매개변수생성자의 값을 초기화해달라.
		this.z = z;
	}
//	메소드부
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Child1 [x="+super.getX()+", y="+super.getY()
					  +"z=" + z + "]";
	}
	public void printChild1() {
		System.out.println("나는 자식1이다.");
	}
//	오버라이딩
	public void print() {
		System.out.println("나는 자식1이다.");
	}
}
