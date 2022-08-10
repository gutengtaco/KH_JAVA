package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	/*
	 * Ű����� �Է¹��� �ϳ��� ������
	 * ����̸� "�����", ����� �ƴϸ� "����� �ƴϴ�"�� ����ϼ���
	 * 
	 * ����
	 * ���� : -9
	 * 
	 * ����� �ƴϴ�.
	 */
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int a = sc.nextInt();
		sc.nextLine();
		String str = (a > 0)? "�����." : "����� �ƴϴ�";
		System.out.println(str);
	}
	/*
	 * Ű����� �Է¹��� �ϳ��� ������ 
	 * ����̸� "�����" ����� �ƴ� ��� �߿��� 
	 * 0�̸� "0�̴�" 0�� �ƴϸ� "������"�� ����Ͻÿ�.
	 * 
	 * ����
	 * ���� : -9
	 * 
	 * ������
	 */
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int a = sc.nextInt();
		sc.nextLine();
		String str = (a>0)? "�����" :(a==0)? "0�̴�" : "������";
		System.out.println(str);
	}
	/*
	 * Ű����� �Է¹��� �ϳ��� ������
	 * ¦���̸� "¦����", Ȧ���̸� "Ȧ����"�� ����Ͻÿ�
	 * 
	 * ����
	 * ���� : 9
	 * 
	 * ������
	 */
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int a = sc.nextInt();
		sc.nextLine();
		String str = (a%2==0)? "¦����": "Ȧ����";
		System.out.println(str);
	}
	/*
	 * ��� ����� ���� ������������ �Ѵ�.
	 * �ο� ���� ���� ������ Ű����� �Է� �ް�
	 * 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����Ͻÿ�.
	 * 
	 * ����
	 * �ο��� : 29
	 * �������� : 100
	 * 1�δ� �������� : 3
	 * ���� �������� : 13
	 */
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο��� : ");
		int people = sc.nextInt();
		sc.nextLine();
		System.out.print("�������� : ");
		int candy = sc.nextInt();
		sc.nextLine();
		System.out.println("1�δ� �������� : " +(candy / people ));
		System.out.println("���� �������� : " +(candy % people) );
	}
	/*
	 * Ű����� �Է¹��� ������ ������ ����ϰ�
	 * ����� ������ ���� ȭ�鿡 ����Ͽ� Ȯ���Ͻÿ�.
	 * �̶�, ������ M�̸� ���л�, M�� �ƴϸ� ���л����� ���ó���Ͻÿ�.
	 * 
	 * ����
	 * �̸� : ������
	 * �г�(���ڸ�) : 3
	 * ��(���ڸ�) : 15
	 * ��ȣ(���ڸ�) : 1
	 * ����(M/F) : F
	 * ����(�Ҽ��� �Ʒ� ��° �ڸ�����) : 95.75
	 * 
	 * 3�г� 15�� 1�� ������ ���л��� ������ 95.75�̴�.
	 */
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("��(���ڸ�) : ");
		int group = sc.nextInt();
		sc.nextLine();
		System.out.print("��ȣ(���ڸ�) : ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F) : ");
		String str = sc.nextLine();
		String gender = (str=="M")? "���л�": "���л�";
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double result = sc.nextDouble();
		sc.nextLine();
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�."
				,grade,group,number,name,gender,result);
	}
	/*
	 * ���̸� Ű����� �Է� �޾�
	 * ���(13������), û�ҳ�(14~19��), ����(20��~)���� ����Ͻÿ�.
	 * 
	 * ����
	 * ���� : 19
	 * 
	 * û�ҳ�
	 */
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println();
		String result = (age <= 13)? "���"
				:(14<=age && age<=19)? "û�ҳ�" : "����";
		System.out.println(result);
		
	}
	/*
	 * ����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�,
	 * �� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
	 * �� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
	 * �� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
	 * 
	 * ����
	 * ���� : 60
	 * ���� : 80
	 * ���� : 40
	 * 
	 * �հ� : 180
	 * ��� : 60.0
	 * �հ�
	 */
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int korean = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		int english = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		int math = sc.nextInt();
		sc.nextLine();
		System.out.println();
		int sum = (korean+english+math);
		System.out.print("�հ� : "+sum +"\n");
		double average = (double)((korean+english+math)/3);
		System.out.print("��� : "+average +"\n");
		String result = (korean >= 40 && english>=40 && math>=40
				&& average >=60)?
				"�հ�" : "���հ�";
		System.out.println(result);
	}
	/*
	 * �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����Ͻÿ�.
	 * 
	 * ����
	 * �ֹι�ȣ�� �Է��Ͻÿ�(-����) : 999999-1999999
	 * ����
	 */
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		String address = sc.nextLine();
		String gender = (address.charAt(7)=='1'||address.charAt(7)=='3' )? 
				"����" : (address.charAt(7)=='2'||address.charAt(7)=='4')? 
				"����":"�߸� �Է��Ͽ����ϴ�";
		System.out.print(gender);
	}
	/*
	 * Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
	 * �׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� 
	 * true�� ����ϰ�
	 * �ƴϸ� false�� ����ϼ���.
	 * (��, �Է��� �� num1�� num2���� �۾ƾ� ��)
	 * 
	 * ����1 : 4
	 * ����2 : 11
	 * �Է� : 13
	 * true
	 */
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("�Է� : ");
		int extraNum = sc.nextInt();
		sc.nextLine();
		String result = ((extraNum <= num1 || extraNum > num2)
				&& num1 <num2)?
				"true" : "false";
		//����1 < extraNum(false) <= num2
		System.out.println(result);
	}
	/*
	 * 3���� ���� Ű����� �Է¹޾�
	 * �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����Ͻÿ�.
	 * 
	 * ����
	 * �Է�1 : 5
	 * �Է�2 : -8
	 * �Է�3 : 5
	 * false
	 */
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�1 : ");
		int a = sc.nextInt();
		System.out.print("�Է�2 : ");
		int b = sc.nextInt();
		System.out.print("�Է�3 : ");
		int c = sc.nextInt();
		String result = (a==b && b==c && c==a)? "true" : "false";
		System.out.println(result);
	}
}

