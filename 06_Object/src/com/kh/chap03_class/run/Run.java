package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Book;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
//		person�̶�� Ŭ�����κ��� ��ü�� ����
//		PersonŬ������ ���� ���� �ڷ����� ��.
//		=> �������� �ڷ��� ����(�ʵ庯��)���� �Ѱ��� �������� �����ϰڴٴ� �ǹ�.
//		p�� ��ü Ȥ�� �������� �ǹ���.
//		=> ���� ���� �ڷ����� �ش�Ǵ� ����(new�� ���� ������ ���� == ��ü == �ν��Ͻ�)
//		=> System.out.println(p);
//		=> p��� Ŭ������ �ּҰ��� ����.
		
//		Person p = new Person();
//		
//		System.out.println(p.information());
//		�� �ʵ忡�� �⺻���� ��
//		=> �⺻���� 0, 0.0, ' '(����) / �������� null
//		
//		�� �ֱ� => setter �޼ҵ�
//		p.setId("user01");
//		p.setPwd("pass01");
//		p.setName("ȫ�浿");
//		
//		System.out.println();
//		System.out.println(p.information());
//		
//		p.setAge(23);
//		p.setGender('��');
//		p.setPhone("010-1111-2222");
//		p.setEmail("aaa@naver.com");
//		
//		System.out.println();
//		System.out.println(p.information());
		
		Product p1 = new Product();
		
		p1.setpName("������11");
		p1.setPrice(1300000);
//		p1.setBrand("����");
//		System.out.println(p1.information());
		
		Product p2 = new Product();
		
		p2.setpName("���ÿ�ġ");
		p2.setPrice(600000);
//		p2.setBrand("����");
//		System.out.println(p2.information());
		
//		�̷��� ���� ��ǰ�� ������ ��쿡��?
//		setter�޼ҵ带 ����ϴ� ��� 
//		�ʵ庯���� ���� �ʱ�ȭ���ָ� ��.
//		private String brand = "����";
		
		p1.setBrand("apple");
		System.out.println(p1.information());
		System.out.println();
		System.out.println(p2.information());
//		�̷������� "����"�̶�� �⺻���� "apple"�� �����Ͽ� ȣ���� ���� ����.
		
		System.out.println();
		Book b = new Book();
		System.out.println(b.information());
	}

}
