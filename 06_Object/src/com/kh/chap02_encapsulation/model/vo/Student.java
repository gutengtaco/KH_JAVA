package com.kh.chap02_encapsulation.model.vo;

public class Student {
	// [�ʵ��]
	/* �ʵ� == �ɹ�����, �ν��Ͻ�����
	 * 
	 * 	����������     [�����]   �ڷ���     �ʵ��;
	 * 	public           �⺻�ڷ���
	 * 	protected        �����ڷ���
	 * 	default          
	 * 	private
	 */
	private String name;
	private int age;
	private double height;
	
	// [�����ں�]
	
	// [�޼ҵ��]
	// ���������� ��ȯ�� �޼ҵ��(�Ű�����){ }
	// setter , getter�޼ҵ� �ۼ�
	
	// setter �޼ҵ�
	// public void set�ʵ��(�ڷ��� �Ű�������){  
	// 	 this.�ʵ�� = �Ű�������;		
	// }
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	// getter �޼ҵ�
	// public �ڷ��� get�ʵ��(){
	//	 return �ʵ��;
	// }
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	// ��������� ĸ��ȭ
	
	// ��ť��, ���� �ʵ忡 ����ִ� ��� ������ �ϳ��� ���ڿ��� ���� �������� �޼ҵ�
	public String information() {
		// return name, age, height; (X) => return������ �ۼ��� ������� �Ѱ����̾�� ��.
		// ����, �ļ��� �ڷ����� String���� �ϰ�, ���ٷ� ��� ������ ���ڿ��� ����ع���.
		return name + "���� ���̴� " + age + " �� �̰�, Ű�� " + height + " cm�Դϴ�.";
	}
}





