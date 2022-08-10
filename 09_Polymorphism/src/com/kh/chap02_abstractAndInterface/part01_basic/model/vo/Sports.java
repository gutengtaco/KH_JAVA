package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public abstract class Sports {
//	�ʵ��
	private int people;	// Sports�� �����ϴ� ������ ���
	
	
//	�����ں�
	public Sports() {}
	public Sports(int people) {this.people= people;}
//	�޼ҵ��
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	@Override
	public String toString() {
		return "people : "+people;
	}
	
	public abstract void rule();
	/*
	 * ������ �������̵��� �� ���ε�, �� �θ�Ŭ������ ������ ä���� �ϴ°�??
	 * 
	 * ����ΰ� �������� �ʴ� �̿ϼ��޼ҵ� == �߻�޼ҵ�
	 * => abstract��� ���� ���� ���־�� ��.
	 * [ǥ����]
	 * public abstract ��ȯ�� �޼ҵ��(�Ű����� => ��������);
	 * => �߰�ȣ ������ ����.
	 * [���ǻ���]
	 * ����, ���� ���� �ۼ��ϰ� �ִ� Ŭ������ �޼ҵ�� �߿���
	 * abstract��� Ű���尡 ���� �߻�޼ҵ尡 �ϳ��� ���ԵǴ� ����,
	 * �� Ŭ������ �߻�Ŭ������ ��.
	 * => Ŭ������ �տ��� abstract�� �ٿ��־�� ��!!
	 */
}
