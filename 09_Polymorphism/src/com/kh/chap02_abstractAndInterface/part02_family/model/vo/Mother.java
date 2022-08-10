package com.kh.chap02_abstractAndInterface.part02_family.model.vo;
//	eat,sleep�޼ҵ尡 �߻�޼ҵ��, �������̵�� ä���ֱ� �������� �߻�Ŭ���� ������.
//					���			����
public class Mother extends Person implements Basic {
//	�ʵ��
	/*
	 * name, weight, health
	 */
	private String babyBirth;	// �Ʊ��� ź�� ���� : ���, �Ծ�, ����

//	�����ں�
	public Mother() {
		super();
	}
	public Mother(String name, double weight, int health,String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
//	�޼ҵ��
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	@Override
	public String toString() {	// toString�� �������̵� ���� x(���Ǽ��� ���� ����)
		return super.toString()+", babyBirth : " + babyBirth;
	}
//	eat�� sleep�� �������̵� ���� O(�߻�޼ҵ��̱� ������)
	
//	�������̽��� ������� ������, �θ�Ŭ������ Person�� eat,sleep�޼ҵ尡 ���(�ּ�ó���Ͽ�) ������ ��.
//	�ٸ�, �������̽�(Basic)�� eat,sleep�޼ҵ尡 �����ϱ� ������, implements Basic�� ���ָ� ������ �����.
	@Override
	public void eat() {
//		�����Ը� ������ �����Կ� 10 ����
		super.setWeight(super.getWeight() +10);
//		�ǰ����� ������ �ǰ����� 10 ����
		super.setHealth(super.getHealth() -10);
	}
	@Override
	public void sleep() {
//		�ǰ����� ������ �ǰ����� 10 ����
		super.setHealth(super.getHealth() +10);
	}
	
}
