package com.kh.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	/*
	 * continue��
	 * �ݺ��� �ȿ��� ����ϴ� ����
	 * continue�� ������ �Ǹ�, �� �ڿ� � ������ �ִ��� �������� �ʰ�
	 * ���� ����� �ݺ������� �ö�.
	 */
	public void method1() {
		// 1�������� 10���� ���� �� Ȧ���� ���
		// 1 3 5 7 9
		// 1. �������� 2�� �����Ͽ� ���
		for(int i=1; i<=10; i+=2) {	// 5ȸ �ݺ�
			System.out.print(i+" ");
		}
		System.out.println();
		// 2. ���ǹ��� %�� ����Ͽ� ���
		for(int i=1; i<=10; i++) {	// 10ȸ �ݺ�
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		// 3. �ݺ��� �ȿ��� continue �̿�
		for(int i=1; i<=10; i++) {
			
			// i�� ¦���� ��츦 �Ǻ��س�
			if(i%2==0) {
				continue;	// ¦���̸�, continue�� ���� �ٽ� �ݺ������� ���ư�
			}
			// i�� Ȧ���� ���, ���
			System.out.print(i+" ");
		}
	}
	public void method2() {
		// 1���� 100������ �� �հ�
		// ��, 6�� ����� ���� ���
		int sum=0;
		for(int i=1; i<=100 ; i++) {
			if(i%6==0) { // 6�� ����� �Ǻ�
				continue;	// �ش� ������ �������� �ʰ�, ���� i++�� �̵�.
							// i=5 => i=6(continue, ����x) => i=7
			}
			sum=sum+i;
			System.out.println(i+" ");
		}
		System.out.print("6�� ����� ������ 1~100�� �� : "+sum);
	}
	/*
	 * continue�� for�� �ȿ� ���� ��� => ���������� �̵��Ѵ�.
	 * continue�� while�� �ȿ� ���� ��� => ���ǽ����� �̵��Ѵ�.
	 */
	public void method3() {
		// 2�� ~ 9�� ���� ����ϱ� �ϵ�
		// 4�� ����ܸ� �ǳʶٰ� ����Ͻÿ�.
		for(int i=2; i<=9; i++) { // �ٱ��� for�� : �ܼ�
			System.out.println("====="+i+"�� =====");
//			1. 4��,8���� �ǳʶٱ�
//			if(i==4 || i==8) {
//				continue;	// i�� 4�ΰ��, �̸� �������� �ʰ� i++�� �̵�.
//							// 4���� ��µ��� �ʰ� 5������ �Ѿ.
//			}
//			2. 4�� ����� �ǳʶٱ�
			for(int j=1; j<=9; j++) { // ���� for�� : ���ϱ� 1~9
				 if(i%4==0){
				 		continue;
				 }
				System.out.printf("%d * %d = %d \n",i,j,(i*j));
			}
		}
		System.out.println("������ ����");
	}
	// �ݺ��� �ǽ����� 12�� - ���� ����� + exit�Է½� ����������
	public void method4() {
		/*
		 * ���� 2���� �����ڸ� �Է¹޾�
		 * ��, ������ ��(������)�� ���, 0���� �������� �Ҷ�
		 * "�ٽ� �Է����ּ���"
		 * ���� �������� ���
		 * "���� �������Դϴ�. �ٽ� �Է����ּ���"
		 * exit�� �Է½�
		 * "���α׷��� �����մϴ�"�� ��� �� ��������.
		 * 
		 */
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.print("������(+,-,*,/,%) : "  );
			String operator = sc.nextLine();

			
			// exit�Է� �� Ż��
			if(operator.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			// ���ڸ� �Է¹ޱ� ���� "���� ������~" ������ �̸� ��� �� ����!
			if(operator.equals("+")||
			   operator.equals("-")||
			   operator.equals("*")||
			   operator.equals("/")||
			   operator.equals("%")){ // ��ġ�ϴ� ���������� Ȯ����.
				
				System.out.print("����1 �Է� : ");
				int num1 = sc.nextInt();
				sc.nextLine();
				System.out.print("����2 �Է� : ");
				int num2 = sc.nextInt();
				sc.nextLine();
				
				switch(operator) {
				case "+" : System.out.println(num1 + " + " +num2 + " = " + (num1+num2));break;
				case "-" : System.out.println(num1 + " - " +num2 + " = " + (num1-num2));break;
				case "*" : System.out.println(num1 + " * " +num2 + " = " + (num1*num2));break;
				case "/" : 
					if(num2==0) {
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է��ϼ���.");
						continue;	// ���� ����� �ݺ����� while������ ���ư�.(�ö�)
					}else {
						System.out.println(num1 + "/" +num2 + " = " + (num1/num2));
						break;	// while���� ��������.(������)
					}
				case "%" : 
					if(num2==0) {
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է��ϼ���.");
						continue;
					}else {
						System.out.println(num1 + "%" +num2 + " = " + (num1%num2));
						break;
					}
				}
			}else { // ��ġ���� �ʴ� ������.
				System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
			}
					
			
		}
		
	}

}
