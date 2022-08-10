package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
//		1. �������� �����ϱ� ��(ElectronicController1)
//		��ǰ��ü
		ElectronicController1 ec = new ElectronicController1();
		ec.insert(new Desktop("�Ｚ","����ũž",1200000,"GTX 1070"));
//					==> ec.insert(d);
//				 	==> Desktop d = new Desktop("�Ｚ","����ũž",1200000,"GTX 1070");
		ec.insert(new NoteBook("LG","�׷�",2000000,3));
		ec.insert(new Tablet("����","�����е�",500000,false));
//		=>���� ����ũž, ��Ʈ��, �º� �Ѵ뾿�� ��ǰ����.
		
//		�մ�
//		���Կ� �ִ� ��ǰ���� ��ȸ
		
		Desktop d = ec.selectDesktop();
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
//		������ ������ ������ ��ü�� �����Ͽ� �̸� �����.
//		=>�Ź� Ÿ���� �ٸ��⶧���� �ѹ��� ����� �������� ����(�κй��)
		
//		System.out.println(ec.selectDesktop());
//		System.out.println(ec.selectNoteBook());
//		System.out.println(ec.selectTablet());
//		��ü�� ���� �ʰ� �׳� ����ص� ��.
		
//		2. �������� ������ ��(ElectronicController2)
		ElectronicController2 ec2 = new ElectronicController2();
//		�� �������� ��ü��������, private Electronic[] elec = new Electronic[3];�� �ʵ庯���� ����� �� ����.
		
//		��ǰ��ü
//		Electronic any = (Electronic)new Desktop("�Ｚ","����ũž",1000000,"Gtx1070")
//		...
		ec2.insert(/*(Electronic)*/new Desktop("�Ｚ","����ũž",1000000,"Gtx1070"),0);
		ec2.insert(/*(Electronic)*/new NoteBook("LG","�׷�",2000000,3), 1);
		ec2.insert(/*(Electronic)*/new Tablet("����","�����е�",500000,false), 2);
//		â�� ������
		
//		��
		System.out.println("===== ������ ���� �� =====");
//		������ â���� �ϳ��� �̾Ƽ� �������� ��
		System.out.println(ec2.select(0)/*.toString*/);
		
//		â��°�� �� ������
		Electronic[] elec = ec2.select();
		System.out.println("elec : "+ elec); // �ּҰ��� ��µ�.
		System.out.println();
		for(int i=0; i<elec.length;i++) {
			System.out.println(elec[i]);
		}
		/*
		 * �������� ����ϴ� ����
		 * 1. �θ�Ÿ���� ��ü�迭��, �پ��� �ڽĵ��� ��� �ѹ��� �޾��� �� ����.
		 * => �θ�Ÿ�� �ϳ������� �پ��� �ڽ� ��ü���� �ٷ� �� ����.
		 * 2. �޼ҵ��� �Ű������� ��ȯ���� �������� �����ϸ�, �޼ҵ��� ������ Ȯ �پ��(�ڵ尡 ��������)
		 */
		
	}
	

}
