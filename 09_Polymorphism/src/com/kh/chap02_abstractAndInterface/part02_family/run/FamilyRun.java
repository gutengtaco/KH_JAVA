package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;

public class FamilyRun {

	public static void main(String[] args) {

//		��ü ���� �׽�Ʈ
//		Person p = new Person();
//		�߻�Ŭ������ �̿ϼ��� ���¶�, ��ü������ ���� ����.
//		Person p ; => ������ ������.
//		
//		�������� �̿��Ͽ� ��ü ���� => ������ ���� + �ڽİ�ü�� ����.
//		Person p1 = new Mother("�����", 50, 70, "���");
//		Person p2 = new Baby("��ֱ�", 3.5, 70);
//		
//		������ ObjectŬ������ toString�� �������̵�.
//		�������̵����� ����, ��ü�� �����ص� �������ε�����, �ּҰ��� �ƴ� ���ϴ� ���·� ��µ�.
//		System.out.println(p1/*.toString*/);
//		System.out.println(p2/*.toString*/);
//		
//		p1.eat(); 	// ���� : ������ +10, �ǰ��� -10
//		p1.sleep(); // ���� : �ǰ��� +10
//		p2.eat();	// �ֱ� : ������ +3, �ǰ��� +1
//		p2.sleep();	// �ֱ� : �ǰ��� +3
//
//		System.out.println("======== ������ =======");
//		System.out.println(p1);	// ���� : ������(50->60) , �ǰ��� �������
//		System.out.println(p2); // �ֱ� : ������(3.5->6.5), �ǰ���(70->74)
//		�ƹ��� PersonŬ������ eat, sleep�޼ҵ尡 �̿ϼ��� ���¶�
//		�������ε��� ����, ���� �������̵��Ǿ �ϼ��� ������ �޼ҵ尡 ȣ���.
//		
//		�������̽� ���� ��
//		��ü���� �׽�Ʈ
//		Basic s = new Basic(); �������̽��� ��ü������ ���� ����.
		Basic b1 = new Mother("�����",50,70,"���");	// ���������� ��ü ���� ����
		Basic b2 = new Baby("��ֱ�",3.5,70);
		
		System.out.println(b1/*.toString*/);
		System.out.println(b2/*.toString*/);
		
		b1.eat();
		b1.sleep();
		b2.eat();
		b2.sleep();
		
		System.out.println("========������=======");
		System.out.println(b1);
		System.out.println(b2);
//		Person�� ���� �߻�Ŭ���� ����̳�
//		Basic�� ���� �������̽��� �����̳� ����� �Ȱ���.
//		=> ���� �������̽��� ���Ǻκ��� ������ �ʿ�� ����.
//		=> ��, ����̶�� �ݵ�� �ؾ��ϴ� ������ ���� ������ ������ �Ͽ� �������̽��� ������ �� ��!!
	}

}
