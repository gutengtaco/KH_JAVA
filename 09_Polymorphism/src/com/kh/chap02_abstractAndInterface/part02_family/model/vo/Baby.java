package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Baby extends Person implements Basic {
//	�ʵ��
//	�����ں�
	public Baby() {
		super();
	}
//	Baby�� �ʵ忡�� ��������� ������
//	Person�� ����� �޾� ����ϱ� ������, Person�� �Ű����������ڸ� ȣ�� �� �ʱ�ȭ����.
	public Baby(String name, double weight, int health) {
		super(name,weight,health);
	}
	
//	�޼ҵ��
	@Override
	public String toString() {
		return super.toString();
	}
//	eat, sleep �޼ҵ� �������̵�
	@Override
	public void eat() {	// �ƱⰡ ���� �Դ´ٸ�
		
//		������ 3 ����
//		�ǰ��� 1 ����
		super.setWeight(super.getWeight() +3);
		super.setHealth(super.getHealth() +1);
	}
	@Override
	public void sleep() {	// �ƱⰡ ���� �ܴٸ�
//		�ǰ��� 3 ����
		super.setHealth(super.getHealth() +3);
	}
	
	
	
	
	
}
