package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
//		Desktop ��ü
//		brand, pCode, pName, price, allInOne(��ü������)
		Desktop d = new Desktop("�Ｚ","d-01","¯¯����ũž",2000000,true);
//		Tv ��ü
//		brand, pCode, pName, price, inch
		Tv t = new Tv("����","t-01","����޺�����Ƽ��",3000000,60);
//		SmartPhone ��ü
//		brand pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("����","s-01","������",1000000,"SKT");			
		
//		���
//		System.out.println(d);
//		System.out.println(t);
//		System.out.println(s);
//		������ �ּҰ��� ��µ�.
		
//		1. getter�޼ҵ�
//		System.out.println(d.getBrand());
//		System.out.println(f.getBrand());
//		System.out.println(s.getBrand());
//		...
		
//		2. information�޼ҵ�
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
//		���ٽ���, �� Ŭ�������� �ߺ��� �ڵ���� �����ϴ� ��Ȳ��
//		(brand, pCode,pName,price)
//		=> �ڵ带 ������ ����ϴ� �������� �Ǽ��� ���ܳ� �� ����.
//		=> ���������ϴ� �������� ������ ã�ư� �����ؾ� �ϴ� ���ŷο��� ����.
		
//		����̶�� ������ ������Ѽ�
//		�� Ŭ�������� �ߺ��Ǵ� �ʵ�, �޼ҵ���� 
//		�� �ѹ�, ���ϳ��� Ŭ������ ��� �����ص� �Ŀ�
//		�ش� Ŭ������ ������ ���� ������� ����.
		
//		��� 
//		�� Ŭ�������� �ߺ��� �ʵ�, �޼ҵ���� �ϳ��� Ŭ����(�θ�)�� �����صΰ�
//		�ٸ� Ŭ����(�ڽ�)���� �ش� �θ� Ŭ������ ���빰�� ������ ���� ����.
	}

}
