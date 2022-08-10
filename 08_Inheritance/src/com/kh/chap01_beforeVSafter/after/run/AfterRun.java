package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
//		����׽�Ʈ
		Desktop d = new Desktop("�Ｚ","d-01","¯¯����ũž",2000000,true);
//		Desktop�� �Ű����������ڷ� �̵� => super()�����ڷ� Product�� �Ű����� �����ڷ� �̵� 
//		=> Desktop�� �ٽ� �̵��ؼ� �� ���� 
		System.out.println(d.information());
//		=> Desktop�� �Ű������������� ���� ȣ����.
		
		SmartPhone s = new SmartPhone();
		s.setBrand("����");
//		SmartPhone�� setBrand��� �޼ҵ带 ������ �ʾҴµ���, �� �۵���.
		s.setpCode("s-01");
		s.setpName("������");
		s.setPrice(1000000);
		s.setMobileAgency("SKT");
		System.out.println(s.information());
//		SmartPhone�� information()�� ������ָ� �����۵���.
		
		Tv t = new Tv("����","t-01","����޺�����TV",3000000,60);
		System.out.println(t.getBrand());
		System.out.println(t.getpCode());
		System.out.println(t.getpName());
		System.out.println(t.getPrice());
//		Tv�� getterBrand,pCode,pName,Price�� �������� �� �����.
//		�̴�, �ڽ�Ŭ�������� ������, �θ�Ŭ�������� �־ ����� �� ����.
		System.out.println(t.getInch());
//		System.out.println(t.information());
//		Tv�� information���� ���ݱ����� ����.
		System.out.println(t.information());
//		Tv�� information�� ���� ���������� ��ġ���� ����.
//		���� �����ϰ��� �ϴ� �޼ҵ尡 �ڽ� Ŭ������ ���ٸ�,
//		�ڵ����� �θ� Ŭ������ �ִ� �޼ҵ�� ������.
//		���� �����ϰ��� �ϴ� �޼ҵ尡 �ڽ� Ŭ������ �ִٸ�,
//		�ڵ����� �ڽ� Ŭ������ �ִ� �޼ҵ�� ������.
//		�̸� '�������ε�'�̶�� ��.
		
		/*
		 * ����� ����
		 * ���� ���� ���� �ڵ��, ���ο� Ŭ�������� ���� ����
		 * �ߺ��� �ڵ带 �θ� Ŭ�������� ���������� �����Ͽ�, ���ο� �ڵ带 �߰�, �����ϱ� ������.
		 * (��� ��� ���� ��, �����Ҷ����� �Ź� ������ Ŭ������ �ڵ带 �������־�� ��.)
		 * => ���α׷��� ���꼺�� ������ �� ����
		 * 
		 * ����� Ư¡
		 * - Ŭ�������� ����� ���߻���� �Ұ�����. ���ϻ�Ӹ� ������.
		 *   (���� �������� �θ���� �������̸� �ȵ�)
		 * - �ڹٿ��� �����ϴ� �Ǵ� ���� ���� ��� Ŭ������ Object��� Ŭ������ �ļ���.		 
		 * 	 (extends Object�� ��õǾ� ������ ������, �����Ǿ� ����.)
		 * - ObjectŬ������ �ִ� �޼ҵ带 ������ �� �� ����.
		 * - ObjectŬ������ �ִ� �޼ҵ尡 ���� �ȵ�ٸ�, �������̵��Ͽ� �Ը��� �°� ��� ����.
		 *    
		 */
	}

}
