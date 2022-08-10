package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/*
	 * if-else��
	 * �ΰ��� �������� ����� ���� ���� ��쿡 ����Ѵ�.
	 * [ǥ����]
	 * if(���ǽ�){
	 * 		������ ���� ��� ������ �ڵ�
	 * }else{
	 * 		������ ������ ��� ������ �ڵ�
	 * }
	 * => ���ǽ��� ����� true�� ���, if���� ����
	 * => ���ǽ��� ����� false�� ���, else���� ����
	 * => �� �� �ϳ��� ������ �ȴ�.
	 * 
	 */
	
	public void method1() {
		// ����ڰ� �Է��� �������� ¦������, Ȧ�������� �Ǻ��ؼ�
		// "¦����", "Ȧ����"�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		if(num % 2 == 0) { // ¦���� ���
			System.out.println("¦����");
		}else {	// ¦���� �ƴ� ���(Ȧ���� ���)
			System.out.println("Ȧ����");
		}
	}
	//��ø if�� : if���� �ȿ� �� if���� ���� ���
	//=> ���׿������� ���� ����.
	public void method2() {
		// ����ڰ� �Է��� ������� ¦������, Ȧ�������� �Ǻ��ؼ�
		// "¦����", "Ȧ����"�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) { // ����� ���
			
			if(num %2==0) {// ¦���� ���
				System.out.println("¦����.");
			}else { // Ȧ���� ���
				System.out.println("Ȧ����.");
			}
		}else { // ����� �ƴ� ���
			System.out.println("����� �Է��ؾ� �Ѵ�.");
		}
	}
	public void method3() {
		// ����ڷκ��� �̸��� �Է¹޾�
		// ��ȿ�� �̸��̶�� "�����Դϴ�. �������."���
		// �ƴ϶�� "������ �ƴմϴ�. ���ư��ּ���." ���
		// => ���ڿ��� �����
		// Scanner sc = new Scanner(System.in);
		// System.out.print("������� �̸� �Է� : ");
		// String name = sc.nextLine();
		// if(name == "ȫ�浿") {
		// 		System.out.println("�����Դϴ�. �������");
		// }else {
		// 		System.out.println("������ �ƴմϴ�. ���ư��ּ���");
		// }
		/* 
		 * �⺻�ڷ����� ���� �񱳽�, == �Ǵ� != �� ������ �񱳰� �����ϴ�.
		 * (boolean ,char, byte, short, int, long, float, double)
		 * 
		 * �����ڷ����� String�� ���� �񱳽�, == �Ǵ� !=�� ������ �񱳰� ���� �ʴ´�.
		 * ��? => �ּҰ��� �񱳴������ �Ǳ� �����̴�.
		 * �⺻�ڷ����� Stack������ �� �� �ּҰ��� ���� ���������
		 * �����ڷ����� String�� Heap������ ����, Stack������ �ּҰ��� �����ϱ⶧���̴�.
		 * => �������� 0123 -> ȫ�浿 0123(sc.nextLine())
		 *          1234 -> ȫ�浿 1234(name == "ȫ�浿")
		 * 
		 * �ּҰ��� ���ϱ� ���� equals()�� ����Ѵ�.
		 * [ǥ����]
		 * ���ϰ��� �ϴ� ���ڿ�.equals(�����ϰ��� �ϴ� ���ڿ�2)
		 * => ����, �� ���ڿ��� ������ �����ϸ� true�� ��ȯ
		 * 					      �������� �ʴٸ� false�� ��ȯ
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �̸� �Է� : ");
		String name = sc.nextLine();
		
		if(name.equals("ȫ�浿")) { //"ȫ�浿".equals(name)�� ����
			
			System.out.println("�����Դϴ�. �������");
		}else {
			
			System.out.println("������ �ƴմϴ�. ���ư��ּ���");
		}
	}
	/*
	 * if -else if��
	 * ������ �񱳴���� ������, ���� ���� ������ �������ְ��� �� ��� ����Ѵ�.
	 * 
	 * [ǥ����]
	 * if(���ǽ�1) {
	 * 		������ �ڵ�1;
	 * }
	 * else if(���ǽ�2) {
	 * 		������ �ڵ�2;
	 * }
	 * else if(���ǽ�3) {
	 * 		������ �ڵ�3;
	 * }
	 * else{
	 * 		���� ���ǵ��� ��� false���, ������ �ڵ�4;
	 * }
	 */
	public void method4() {
		// ���, 0, ������ �Ǻ��ϴ� �ڵ带 �ۼ��Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0 ) { // ����� ���
			System.out.println("����Դϴ�.");
		}else if(num == 0) { //  0�� ���
			System.out.println("0�Դϴ�.");
		}else { // ������ ���
			System.out.println("�����Դϴ�.");
		}
	}
	public void method5() {
		/*
		 * ����ڷκ��� Ű����� ������ �Է¹޴´�.
		 * 90�� �̻��� ��� : "A"���
		 * 80�� �̻� ~ 90�� �̸� : "B"���
		 * 70�� �̻� ~ 80�� �̸� : "C"���
		 * 70�� �̸� : "D"���
		 * => "����� ������ xx���̰�, ����� X��� �Դϴ�."
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		sc.nextLine();
		char grade = ' ';
		// char�ڷ����� ���� ���� ��ĭ���� �ʱ�ȭ�Ѵ�.
		
		// ����, 0~100���������� üũ
		// if(score < 0 || score > 100) {// 0 ~ 100���̰� �ƴ� ���
		// else{ // 0~100������ ���
		
		if(score>=0 && score<=100) {// 0~ 100������ ���
			if(score >= 90) {	// 90~100��
				grade = 'A';
				System.out.println(grade);
			}else if(score >= 80 ) { // 80~89��
				grade = 'B';
				System.out.println(grade);
			}else if(score >= 70 ) { // 70~79��
				grade = 'C';
				System.out.println(grade);
			}else { // 1~69��
				grade = 'D';
				System.out.println(grade);
			}
			// ������ ����� ����ϴ� ��¹��� �ۼ�
			System.out.printf("����� ������ %d���̰�, ����� %c�Դϴ�."
					,score,grade);
		}
		else {//0~100���̰� �ƴҰ��
			System.out.println("�߸� �Է��߽��ϴ�.");
		}
		
	}
	public void method6() {
		/*
		 * ���̸� �Է¹޾� ���, û�ҳ�, ������ ����Ͻÿ�.
		 * ���(1~13), û�ҳ�(14~19), ����(20~)
		 */
		// Scanner class �� �Է¹� 
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		// Variable ����
		int age = sc.nextInt();
		sc.nextLine();
		String str = "";
		// if - else if ��
		if(age > 0) { // ����� �Է��� ���
			if(age > 19) { // 20�� �̻�
				//System.out.println("�����Դϴ�.");
				str = "����";
			}else if(age >13) { // 14~19��
				//System.out.println("û�ҳ��Դϴ�.");
				str = "û�ҳ�";
			}else { // 1~13��
				//System.out.println("����Դϴ�.");
				str = "���";
			}
			// age�� str�� ����� ����� ��¹��� �ۼ�.
			System.out.printf("����� ���̴� %d���̸�, \"%s\" �Դϴ�.",age,str);
		}else { // 0, ������ �Է��� ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
}
