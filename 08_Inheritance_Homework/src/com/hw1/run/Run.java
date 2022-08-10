package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
//		3���� �л������� ��ü�迭�� ���
		System.out.println("1. �л����� ���");
		Student[] s = new Student[3];
		s[0] = new Student("ȫ�浿",20,178.2,70.0,1,"�����ý��۰��а�");
		s[1] = new Student("�踻��",21,187.3,80.0,1,"�濵�а�");
		s[2] = new Student("������",23,167.0,45.0,1,"��������а�");
//		�л� ������ ���
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].information());
		}
//		10���� ��������� ��ü�迭�� ���
//		��ü �迭 ����
		System.out.println("2. ������� ���");
		Employee[] e = new Employee[10];
//			��ü�迭�� �ε����� ������ ����
			int count=0;
			while(true){
//				Ű����� ��������� �Է¹޵��� ����
				Scanner sc = new Scanner(System.in);
				System.out.print("����̸� : ");
				String empName = sc.nextLine();
				System.out.print("������� : ");
				int empAge = sc.nextInt() ; 
				sc.nextLine();
				System.out.print("��� Ű : ");
				double empHeight = sc.nextDouble();
				sc.nextLine();
				System.out.print("��� ������ : ");
				double empWeight = sc.nextDouble();
				System.out.print("��� �޿� : ");
				int empSalary = sc.nextInt();
				sc.nextLine();
				System.out.print("��� �μ� : ");
				String empDept = sc.nextLine();
//					��ü�迭�� ������ Ȱ���Ͽ� ��ü �� ����
					e[count] = new Employee(empName,empAge,empHeight,empWeight,empSalary,empDept);
					count++;
				System.out.print("����� �� �߰��Ͻðڽ��ϱ�(Y/N)?");
				char yesNo = sc.nextLine().toUpperCase().charAt(0);
					if(yesNo == 'Y') {
						continue;
					}else {
						System.out.println("���α׷��� �����մϴ�.");
						break;
					}
			}
//			��������� ���
			for(int i=0; i<e.length; i++) {
				if(e[i] == null) {
					continue;
				}else {
					System.out.println(e[i].information());
				}
			}
	}
}
