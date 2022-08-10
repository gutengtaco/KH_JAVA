package com.kh.chap01.condition;

import java.util.Scanner;


public class C_Switch {
	/*
	 * Switch��
	 * ǥ���ϰ� ���� ����� ���� ���� ���� ��� ��� �����ϴ�.
	 * ��, ==(����񱳿�����)�� ���Ե� ������ ��쿡�� ����� �����ϴ�.
	 * 
	 * switch���� if���� ������
	 * if(���ǽ�) 	=> ���ǽ��� �����ϰ� ����� �� �ִ�.(��밡���� �������� �������� ����)
	 *				       ���ǽĿ��� ������ ������ ǥ���� �� �ִ�. 	
	 * Switch(���ǽ�x)=> Ȯ���� ���� ���Ǹ� �����ϴ�.(���� �� ����)
	 * 				
	 * [ǥ����]
	 * switch(���� �񱳸� �� �����){
	 * case ��1 : �������ڵ�1; // ���� ������ ����񱳸� �� ����� == ��1�̸�
	 * 					   // ������ �ڵ� 1�� �����Ѵ�.
	 * 			  break;   // ������ �ڵ� 1�� �����ϰ�, �߰�ȣ ������ ����������.
	 * case ��2 : �������ڵ�2; // ���� ������ ����񱳸� �� ����� == ��2�̸�
	 * 					   // ������ �ڵ� 2�� �����Ѵ�.
	 *            break;   // ������ �ڵ� 2�� �����ϰ�, �߰�ȣ ������ ����������.
	 * ...
	 * case ��n : �������ڵ�n;
	 *            break;
	 *            
	 * default : �������ڵ�;  // case ��1���� n������ ����񱳸� �����ϰ�
	 *                     // �ϳ��� ������� �ʾ��� �� ����ȴ�(=else)
	 *                     // break;�� ���� �ʴ´�.
	 * }
	 */
	public void method1() {
		/*
		 * 1~3������ ���ڸ� �Է¹޾�
		 * 1�ΰ�� : "�������Դϴ�"
		 * 2�ΰ�� : "�Ķ����Դϴ�"
		 * 3�ΰ�� : "�ʷϺ��Դϴ�"
		 * �߸��Է��Ѱ�� : "�߸� �Է��Ͽ����ϴ�"
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		
		int num = sc.nextInt();
		sc.nextLine();
		
//		if(num == 1) { // ������
//			System.out.println("�������Դϴ�.");
//		}else if(num == 2) { // �Ķ���
//			System.out.println("�Ķ����Դϴ�.");
//		}else if(num ==3) { // �ʷϺ�
//			System.out.println("�ʷϺ��Դϴ�.");
//		}else { // �߸��Է��� ���
//			System.out.println("�߸��Է��Ͽ����ϴ�.");
//		}
		
		String light = "";
		switch(num) {
		case 1 : // num == 1�̸� �����Ѵ�.
			light = "������"; 
			// System.out.println("�������Դϴ�");
				break; // �������� true�̸� �߰�ȣ ������ ���´�.

		case 2 : // num == 2�̸� �����Ѵ�.
			light = "�Ķ���"; 
			// System.out.println("�Ķ����Դϴ�");
				break; // �������� true�̸� �߰�ȣ ������ ���´�.

		case 3 : // num == 3�̸� �����Ѵ�.
			light = "�ʷϺ�"; 
			// System.out.println("�ʷϺ��Դϴ�.");
				break; // �������� true�̸� �߰�ȣ ������ ���´�.
		
		default : // num�� 1,2,3�� �ƴ� ���, default�� ����Ѵ�.
			System.out.println("�߸� �Է��ϼ̽��ϴ�."); 
			return; 
			// return���� ���� �������� Method ��ü�� ���������ٴ� ���̴�.
			// �׸���, ���� �������� Method�� ȣ���� c.method1();���� ���ư���.
			// ��, num == 4�� ���, default�� "�߸��Է��Ͽ����ϴ�."�� �����ϱ�� �ϰ�
			// switch���� ���ͼ� c.method1();�� �����Ͽ� ����Ѵ�.
		}
		System.out.printf("%s�Դϴ�.",light);
	}
	public void method2() {
		// ����ڿ��� ������ ���ϸ�(���, �ٳ���, ������)�� �Է¹޾�
		// �� ������ ������ ���(���:1000�� / �ٳ��� : 2000�� / ������ : 5000��)
		Scanner sc =new Scanner(System.in);
		System.out.println("-----Welcome ���ϰ��� -----");
		System.out.print("������ ���ϸ� �Է� : ");
		String fruit = sc.nextLine();
		int price = 0;
		
		// [������ ��]
		// switch������ ���ڿ��� �����(==)�� ���������� ������ �� �ִ�.(equals����)
		switch(fruit) {
		case "���" :			// if( fruit.equals("���") ) {}
			price = 1000;
			break;
		
		case "�ٳ���" : 		// else if( fruit.equals("�ٳ���") ) {}
			price = 2000;
			break;
			
		case "������" : 		// else if( fruit.equals("������") ) {}
			price = 5000;
			break;
		
		default :		// else {}
			System.out.println("�Է��Ͻ� ������ �������� �ʽ��ϴ�.");
			return;
			// return�� ���� �ٷ� ���� "�Է��Ͻ�~"������ ����ϰ�
			// Method2�� ȣ���� c.method2()�� ���ư���.
		}
		System.out.printf("%s�� ������ %d�� �Դϴ�.",fruit,price);
	}
	public void method3(){
		// �ֹι�ȣ�� �Է¹޾� ����, ���ڸ� �����Ͻÿ�.
		// => �ֹι�ȣ�� ���ڿ��� ����Ͽ� �����ÿ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է�(-����) : ");
		// Variable�� ���ǹ� �ۿ��� �����Ѵ�.
		// ������ Variable�� �ش� �߰�ȣ �ȿ����� ��ȿ�ϰ� �Ǳ� �����̴�.
		String personId = sc.nextLine();
		char gender = personId.charAt(7);
		String result = "";
		
		switch(gender) {
		// '1' �Ǵ� '3'�� ��� 
		// ������ ���̽��� �ѹ��� ��� �����ϰ� �� ���̿��� break�� ���� �ʴ´�.
		// case�� �ƹ��� ��, �ڵ�, break�� ���� ������ ���� case�� �Ѿ��.
		case '1' : 
			// result = "�����Դϴ�";
			// break;
		case '3' :
			result = "�����Դϴ�";
			break;
		
		// '2' �Ǵ� '4'�� ��� 
		case '2' : 
			// result = "�����Դϴ�";
			// break;
		case '4' : 
			result = "�����Դϴ�";
			break;
		
		default : 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		System.out.println(result);
	}
	public void method4() {
		// ����ڿ��� 1��~12�� ������ ���� �Է¹޾�
		// �ش� ���� �ش��ϴ� ������ ���
		// ��(3~5), ����(6~8��), ����(9~11��), �ܿ�(12~2��)
		Scanner sc =new Scanner(System.in);
		System.out.print("�� �Է� : ");
		
		int month = sc.nextInt();
		sc.nextLine();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8: 
			System.out.println("�����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11: 
			System.out.println("�����Դϴ�.");
			break;
		case 12:
		case 1:
		case 2: 
			System.out.println("�ܿ��Դϴ�."); 
			break;
		default : 
			System.out.println("1~12������ ���ڸ� �Է����ּ���.");
			// return;
			// Method�� ������ ���� �������� return�� ������ �����̱� ������
			// return�� ������ ������ Method�� ������ �����ص� �ȴ�.
		}
	}
}
