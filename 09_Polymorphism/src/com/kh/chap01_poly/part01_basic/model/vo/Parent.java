package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {
//	필드부
	private int x;
	private int y;
	
//	생성자부
	public Parent() {
		/*super()*/ 
//		super()은 생략해도 JVM이 알아서 만들어줌.
	}
	public Parent(int x, int y) {
		super();
//		모든 객체는 Object의 상속을 받음.
		this.x = x;
		this.y = y;
	}
//	메소드부
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
//		보통 Object의 toString()메소드는 주소값을 불러오는 메소드이나,
//		현재는 return문을 통해, 다음과 같은 출력문을 출력하도록 
//		나의 입맛에 맞게 오버라이딩 된 상태임.
		return "Parent [x=" + x + ", y=" + y + "]";
	}
	
	public void printParent() {
		System.out.println("나는 부모다.");
	}
	public void print() {
		System.out.println("나는 부모다.");
	}
}
