package com.kh.chap01_poly.part01_basic.model.vo;
//	Parent -----> Child1
public class Child1 extends Parent{
//	�ʵ��
	/*
	private int x;
	private int y;
	 */
	private int z;

//	�����ں�
	public Child1() {
		super();
	}
	public Child1(int x, int y,int z) {
		super(x, y);
//		����� �θ�Ŭ���� �Ű������������� ���� �ʱ�ȭ�ش޶�.
		this.z = z;
	}
//	�޼ҵ��
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
		System.out.println("���� �ڽ�1�̴�.");
	}
//	�������̵�
	public void print() {
		System.out.println("���� �ڽ�1�̴�.");
	}
}
