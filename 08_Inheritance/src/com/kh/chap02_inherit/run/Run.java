package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		
//		��ü ���� �׽�Ʈ
		Car c = new Car("��Ʋ��",12.5,"����",4);
		Ship s = new Ship("�������̹�",3,"�",1);
		Airplane a = new Airplane("����774",0.02,"������",16,5);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		
		Vehicle vehicle = new Vehicle();
        vehicle.howToMove(); 
		a.howToMove();	// �����δ�.
		c.howToMove();	// �����δ�.
		s.howToMove();	// �����δ�.
//		�� �ڽ�Ŭ������ �ش� �޼ҵ带 ������ �ʾ������� �� �۵���.
//		�ٸ�, ���� �������̵��� ���� ���� ������.
//		�������̵��� �Ѵٸ� �������,
//		�ڵ��� : ������ �����δ�, ��: �����緯�� �����δ�, ����� :������ �����̰�, ������ �����δ�. 
	}

}
