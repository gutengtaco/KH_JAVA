package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {
//	�ʵ��
	private int x;
	private int y;
	
//	�����ں�
	public Parent() {
		/*super()*/ 
//		super()�� �����ص� JVM�� �˾Ƽ� �������.
	}
	public Parent(int x, int y) {
		super();
//		��� ��ü�� Object�� ����� ����.
		this.x = x;
		this.y = y;
	}
//	�޼ҵ��
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
//		���� Object�� toString()�޼ҵ�� �ּҰ��� �ҷ����� �޼ҵ��̳�,
//		����� return���� ����, ������ ���� ��¹��� ����ϵ��� 
//		���� �Ը��� �°� �������̵� �� ������.
		return "Parent [x=" + x + ", y=" + y + "]";
	}
	
	public void printParent() {
		System.out.println("���� �θ��.");
	}
	public void print() {
		System.out.println("���� �θ��.");
	}
}
