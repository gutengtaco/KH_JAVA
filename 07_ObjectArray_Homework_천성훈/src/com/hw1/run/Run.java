package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// ��ü�迭�� ũ�� 3���� �Ҵ� �� ��
		// 0�� �ε������� �⺻�����ڸ� ���ؼ� ��ü ����
		// 1�� �ε������� �Ű����� 6��¥�� �����ڸ� �̿��Ͽ� ��ü ����
		// 2�� �ε������� �Ű����� 10��¥�� �����ڸ� �̿��Ͽ� ��ü ���� �� ���
		Employee e1 = new Employee();
		Employee e2 = new Employee(1, "ȫ�浿",19,'M',"01022223333","�������");
		Employee e3 = new Employee(2, "������","������","����",20,'F',1000000,0.01,"01011112222","��� ����");
		System.out.println("emp[0] : "+e1.information());
		System.out.println("emp[1] : "+e2.information());
		System.out.println("emp[2] : "+e3.information());
		System.out.println("==========================================================================================");
		// 3���� ��ü �� ���� ���� �ʵ忡 ���� ���� ���� �� �ٽ� ���
		e1.setEmpName("�踻��");
		e1.setDept("������");
		e1.setJob("����");
		e1.setAge(30);
		e1.setGender('M');
		e1.setSalary(3000000);
		e1.setBonusPoint(0.2);
		e1.setPhone("01055559999");
		e1.setAdress("���� ����");
		
		e2.setDept("��ȹ��");
		e2.setJob("����");
		e2.setSalary(4000000);
		e2.setBonusPoint(0.3);
		e2.setPhone("01022223333");
		e2.setAdress("���� ���");
		System.out.println("emp[0] : "+e1.information());
		System.out.println("emp[1] : "+e2.information());
		System.out.println("==========================================================================================");

		// ���� ������ ���ʽ��� ����� 1�� ������ ����Ͽ� ���
		// ���ʽ��� ����� ���� = (�޿� + (�޿� * ���ʽ�����Ʈ)) * 12
		int e1Salary = e1.getSalary();
		double e1bonus = e1.getBonusPoint();
		int e1Income = (e1.getSalary()+((int)(e1.getSalary()*e1.getBonusPoint())))*12;
		int e2Salary = e2.getSalary();
		double e2bonus = e2.getBonusPoint();
		int e2Income = (e2.getSalary()+((int)(e2.getSalary()*e2.getBonusPoint())))*12;
		int e3Salary = e3.getSalary();
		double e3bonus = e3.getBonusPoint();
		int e3Income = (e3.getSalary()+((int)(e3.getSalary()*e3.getBonusPoint())))*12;
		System.out.println("�踻���� ���� : "+e1Income+"��");
		System.out.println("ȫ�浿�� ���� : "+e2Income+"��");
		System.out.println("�������� ���� : "+e3Income+"��");
		System.out.println("==========================================================================================");
		// 3�� ������ ���� ����� ���Ͽ� ���
		System.out.println("�������� ���� ��� : "+(e1Income+e2Income+e3Income)/3+"��");
	}

}
