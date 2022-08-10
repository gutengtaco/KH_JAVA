package com.hw4.controller;

import java.util.Scanner;

import com.hw4.model.vo.Employee;

public class EmpTest extends Employee{
	private Employee[] empArr;

	public EmpTest() {
		super();
	}

	public Employee[] getEmpArr() {
		return empArr;
	}
	
	public void setEmp() {
		empArr = new Employee[5];
		empArr[0] = new Employee("������",24, 1500000,1.245);
		empArr[1] = new Employee("��Ҷ�",40, 2500000,1.4);
		empArr[2] = new Employee("�ݰ���",22, 1780000,1.3);
		empArr[3] = new Employee("�����",31, 1950000,1.365);
		empArr[4] = new Employee("ȫ�߶�",34, 1650000,1.212);
		
	}
	public void printEmp() {
		for(int i=0; i<empArr.length; i++) {
			System.out.println(empArr[i].toString());
		}
	}
//	�̸� ��������
	public void nameSortPrint() {
		// ���� : ���� ���� �����͸� ������ ��Ģ�� ���� ���ʴ�� ����.
		// �������� : ���� �ͺ��� ū ������� ����. 
		// �������� : ū �ͺ��� ���� ������� ����.
		
		/*
		 * ��ǥ���� ���� ���
		 * �������� : ������ �� ���ϴ� ����(���� ����, ��ȿ������ ���)
		 * ex) 6 4 8 1 2
		 * 
		 * 1Ʈ (4 6) 8 1 2 => ���Ĵ�� ���� -1
		 *     4 (6 8) 1 2
		 *     4 6 (1 8) 2
		 *     4 6 1 (2 8)
		 * => ���� ū ���� �� �ڷ� �з���    
		 * 
		 * 2Ʈ (4 6) 1 2 8 => ���Ĵ�� ���� -2
		 *     4 (1 6) 2 8 
		 *     4 1 (2 6) 8
		 * => �� �������� ū�� �ڷ� ������
		 * 
		 * 3Ʈ
		 * 	   (1 4) 2 6 8 => ���Ĵ�� ���� -3
		 *     1 (2 4) 6 8
		 * => �� �������� ū�� �ڷ� ������.
		 * 
		 * 4Ʈ 
		 *     1 2 4 6 8
		 * 
		 * ==> �� �õ�����, ���� ���ڸ����� �������� ������ �̷����.
		 * ==> �� �õ�����, �ݺ��Ǵ� Ƚ���� 1�� ����.
		 * ==> �� ó���� ���Ĵ�� ���� -1
		 */
		for(int i=0; i< empArr.length-1; i++) { // 1Ʈ, 2Ʈ, 3Ʈ, 4Ʈ
			
			for(int j=0; j<empArr.length-1-i; j++) { // 4����, 3����, 2����, 1����
				
//				���� ���� �༮�� �� ũ�ٸ� �ڸ� �ٲ�. �ƴϸ� �ȹٲ�
				if(empArr[j].getName().compareTo(empArr[j+1].getName())>0) {
//					�ӽ� ����Ҹ� ����� ��� ����(�ٲ�ġ��)
					Employee temp = empArr[j];
					empArr[j] = empArr[j+1];
					empArr[j+1] = temp;
				}
			}
		}
//		��� �� ������ �����ߴ� == ������ ������������ �� �̷������.
		printEmp();
		
	}
//	���̱��� ��������
	public void ageSortPrint() {
		for(int i=0; i<empArr.length-1; i++) {
			for(int j=0; j<empArr.length-1-i; j++) {
				if(empArr[j].getAge() > empArr[j+1].getAge()) {
					Employee temp = empArr[j];
					empArr[j] = empArr[j+1];
					empArr[j+1] = temp;
				}
			}
		}
		printEmp();
	}
}
