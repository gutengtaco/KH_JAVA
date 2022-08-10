package com.kh.chap01_poly.part01_basic.model.vo;
//	Parent-------->Child1
//			 └---->Child2
public class Child2 extends Parent {
//	필드부
	private int n;


//	생성자부
	public Child2() {
		super();
	}
	public Child2(int x, int y, int n) {
		super(x,y);
		this.n = n;
	}
	
//	메소드부
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public String toString() {
		return "Child2 [x="+super.getX()+"y="+super.getY()+"n=" + n + "]";
	}
	public void printChild2() {
		System.out.println("나는 자식2이다.");
	}
	public void print() {
		System.out.println("나는 자식2이다.");
	}
}
