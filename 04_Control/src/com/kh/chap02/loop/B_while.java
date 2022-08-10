package com.kh.chap02.loop;

import java.util.Scanner;

public class B_while {
	/*
	 * while��
	 * �ݺ����� �������� ���ǽ��� ����� true�� ��쿡�� �ݺ��� ����
	 * ���ǽ��� ����� false�� ���, �ݺ����� ��������.
	 * 
	 * [ǥ����]
	 * [�⺻]
	 * while(���ǽ� - true/false){
	 * 	�ݺ������� ������ ���빰;
	 * }
	 * 
	 * [����]
	 * �ʱ��; : �ݺ��� �ʿ��� ������ ���� �� �ʱ�ȭ(�ʼ� �ƴ�)
	 * while(���ǽ� - true/false){
	 * 	�ݺ������� ������ ���빰;
	 * 	������;(�ʼ� �ƴ�)  
	 * }
	 * 
	 * [����2]
	 * while(true){
	 * �ݺ������� ������ ���빰;
	 * }
	 * => ���ѹݺ��� �Ͼ.
	 * 
	 */
	public void method1() {
		
		//for(int i=0; i<5; i++) {
			//�ȳ��ϼ���
			//�ȳ��ϼ���
			//�ȳ��ϼ���
			//�ȳ��ϼ���
			//�ȳ��ϼ���
			//System.out.println("�ȳ��ϼ���.");
		//}
		int i=0; // �ʱ��
		while(i<5) { //���ǽ�
			System.out.println("�ȳ��ϼ���");
			i++; // ������
		}
		System.out.println("i = "+i);
		// �� �������� i�� 5�̴�.
		
		System.out.println();
		while(i>=1) {
			System.out.println("i = "+--i); 
			//i--;
			
			/*
			 *System.out.println("i = "+(i--));
			 *5,4,3,2,1
			 *System.out.println("i = "+(--i));
			 *4,3,2,1,0
			*/
		}
		System.out.println("i = "+i);
		// �� �������� i�� 0�̴�.
	}
	public void method2() {
//		1�������� 10������ �� �հ�
//		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("�� �հ� : "+sum);
		
		int i=1;
		int sum=0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("�� �հ� : "+sum);
	}
	public void method3() {
//		1�������� ������(1~100)������ �� �հ�
//		int random = (int)((Math.random()*100)+1);
//		int sum=0;
//		for(int i=1; i<=random; i++) {
//			sum = sum+i;
//		}
//		System.out.println("i : "+random);
//		System.out.println("���� ���հ� : "+sum);

		int i=1;
		int sum=0;
		int random = (int)((Math.random()*100)+1);
		while(i<=random) {
			sum = sum+i;
			i++;
		}
		System.out.println("i : "+i);
		System.out.println("���� ���հ� : "+sum);
	}
	public void method4() {
		/*
		 * �ƹ� ���ڿ��̳� �Է��ϼ��� : ~~
		 * ���ڿ��� ���ѹݺ��ϸ鼭 �Ź� �Է¹ޱ�
		 * �Է¹��� ���ڿ��� exit��� ���ڿ��̶�� ����
		 */
		Scanner sc = new Scanner(System.in);
		//for(;;) : Ƚ���� ���� ��, ���� ������.
		while(true) { //���ѹݺ��� ����� �� ������.
			System.out.print("�ƹ� ���ڿ��̳� �Է��ϼ��� : ");
			String str = sc.nextLine();
			System.out.println("�Է� ���� : "+str);
				if(str.equals("exit")) {
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
		}
	}
	/*
	 * do-while��
	 * do�� �켱 ������ �ϰ�, while�� ���� ������ �����Ѵ�.
	 * 
	 * [ǥ����]
	 * �ʱ��;
	 * do{
	 * 	������ �ڵ�;
	 * 	������;
	 * }while(���ǽ�);
	 * 
	 * ���ǽ��� true�̸�? ������ �ڵ带 �ٽ� ����.
	 * ���ǽ��� false�̸�? �׷��� do���� �����ϰ� �������´�.
	 * ��, while���� ���� �˻縦 ���� �ϰ�, true�������� ����.
	 * do-while���� �ϴ� ������ �ϰ� ����, ���� �˻縦 �Ͽ� true�̸� ���ư��� ����
	 * ������ while���� false���� �ּ� �ѹ��� ������.
	 */
	public void method5() {
		int i=0;
//		while(i==1) {
//			System.out.println("����"); // ���빰�� ������� ����.
//		}
		do {
			System.out.println("����"); // ���빰�� �ѹ��� �����.
		}while(i==1);
	}
	public void method6() {
		// 1 2 3 4 5 
		// for��
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// while��
		int i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		int j=1;
		//do-while��
		do {
			System.out.print(j + " ");
			j++;
		}while(j<=5); // j�� 6�̸� do���� ����� ������ �����.
	}
}

