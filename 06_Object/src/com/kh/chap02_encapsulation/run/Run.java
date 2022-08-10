package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
	/*
	 * 8. ĸ��ȭ �۾��� ���� �Ϻ��� Ŭ������ ���¸� ������
	 * ĸ��ȭ���������� ? �ܺηκ��� ���� ������ �����ϱ⶧����
	 * 				���� �����ǰų�, ��ȸ�� ���� ���ϴ� ������ �߻�.
	 * "��ü������ ���� ��Ģ �� ��������" �� �ϳ��� ĸ��ȭ��.
	 * "�����Ϳ� ���� ������ ����"�ϴ� ��Ģ��.
	 * ��, ��ſ� ���� ���������γ��� ó��(��ȸ, ����)�� �� �ְԲ�
	 * �޼ҵ���� Ŭ���� ���ο� ���� ����.
	 * 
	 * ĸ��ȭ�� �ܰ�
	 * 1) �� �ʵ忡 ���������ڷ� private�� �ٿ��� �����.
	 * 	  �� ) �л� ���� ���� ���α׷� : �л����� ���Ƿ� �ڽ��� ������ �����ϸ� �ȵ�.
	 * 						      �� �л��� ������ �ٸ� �л��� ��ȸ�ϸ� �ȵ�.
	 * 2) setter / getter �޼ҵ� �����
	 * 	  �� ) �л� ���� ���� ���α׷� : �������� �л����� ������ ����ϰų� ���� �����ϰԲ� ���å�� ������.(setter)
	 * 				f		    �������� �л����� ������ ��ȸ�� �� �ְԲ� ���å�� ������.(getter)
	 * 3) ���� ��� �޼ҵ� �����
	 * �Ź� ���� ��½� ��¹��� �ۼ��ϱ� ��������, information�� ����.
	 */

	public static void main(String[] args) {
//		1.�л� ������ ���� ��ü�� �����(��üȭ, �ν��Ͻ�ȭ)
		Student hong = new Student();	//import�� �� Ŭ������ ��Ȯ�� ��ġ ����!
//		name=null, age=0, height=0.0(�⺻��)
		
//		2.�ʱ�ȭ Ȥ�� �� ���� 
//		hong.name="ȫ�浿";
//		hong.age=20;
//		hong.height=172.6;
//		ĸ��ȭ(private)�� ���� ������ �ʰ� �Ǿ� ���� �� �� ����.
		
//		3. ���������� �����ϱ�
//		getter, setter�� ���� ���� ����,���� ����� �޼ҵ� ȣ��� ������.
//		�ʵ忡 ���� ���� �����ϴ� ���� �ƴ�, 
//		�޼ҵ� ������ �ʵ带 �������� �����ۿ��� �Ͽ�, �� ����� �����ִ� ����.
//		��ü��.�޼ҵ��();
		
		hong.setName("ȫ�浿");
		hong.setAge(20);
		hong.setHeight(172.6);
		
//		4. �� ����ֳ� ��ȸ.
//		System.out.println(hong.name);
//		System.out.println(hong.age);
//		System.out.println(hong.height);
//		������ ���(ĸ��ȭ ��)���δ� ������� ����.
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
//		�߽���Ǵ� ���� �� �� ����.
		
//		xxx���� ���̴� xx���̰�, Ű�� xxxcm�Դϴ�. 
//		System.out.printf("%s ���� ���̴� %d���̰�, Ű�� %.1fcm�Դϴ�.",
//				hong.getName(),hong.getAge(),hong.getHeight());
		System.out.println(hong.information());
		
		
//		�迵�� �л��̶�� ��ü�� ��������
//		��ü�� : kim
//		���� : 21, Ű : 169.4
		Student kim = new Student();
		
		kim.setName("�迵��");
		kim.setAge(21);
		kim.setHeight(169.4);
		
//		System.out.printf("%s ���� ���̴� %d���̰�, Ű�� %.1fcm�Դϴ�.",
//				kim.getName(),kim.getAge(),kim.getHeight());		
		
		System.out.println(kim.information());
		
	}

}
