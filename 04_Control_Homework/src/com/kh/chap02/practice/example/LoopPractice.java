package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		/*
		 * ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
		 * ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		 * ���� 1 �̸��� ���ڰ� �Էµƴٸ� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		 * (for�� �̿�)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine();
			if(num>0) {
				for(int i=0; i<num; i++) {
					System.out.print((i+1)+" ");
				}
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
	}
	public void practice2() {
		/*
		 * practice1() ������ �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		 * ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.���� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
			for(;;) {
				System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
				int num = sc.nextInt();
				sc.nextLine();
					if(num>0) {
						for(int i=0; i<num; i++) {
							System.out.print((i+1)+" ");
						}
						break;
					}else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
						continue;
					}
			}
	}
	public void practice3() {
		/*
		 * ����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ��� ���ڸ� �Ųٷ� ����ϼ���.
		 * ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
		 * (for�� �̿�)
		 */
			Scanner sc = new Scanner(System.in);
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			sc.nextLine();
				if(num >= 1) {
					for(int i=num; i>=1; i--) {
						System.out.print(i+" ");
					}
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
		
	}
	public void practice4() {
		/*
		 * practice3() ������ �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		 * ���߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.���� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			sc.nextLine();
				if(num >= 1) {
					for(int i=num; i>=1; i--) {
						System.out.print(i+" ");
					}
					break;
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.�ٽ� �Է����ּ���.");
					continue;
				}
		}
	}
	public void practice5() {
		/*
		 * 1���� ����ڿ��� �Է� ���� �������� �������� ���� ����Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� : "); // 4��� ����
		int num = sc.nextInt();
		sc.nextLine();
		int sum = 0;
			if(num>0) { // num = 4
				for(int i=0; i<num; i++) { // i= 0,1,2,3 / num = 4
					sum = sum+(i+1); // sum = 1+2+3+4 
						if((i+1)==num) { // i= 1,2,3,4 / num = 4
							System.out.print((i+1)+ " = ");
							System.out.print(sum);
						}else { 
							System.out.print((i+1)+ " + ");
						}
				}
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
	}
	public void practice6() {
		/*
		 * ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
		 * ���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1�̻��� ���ڸ��� �Է����ּ��䡰�� ����ϼ���.
		 * (for�� �̿�)
		 * 
		 * ����
		 * ù��° ���� : 4  
		 * �ι�° ���� : 8
		 * 4 5 6 7 8 
		 * 
		 * ù��° ���� : 8  
		 * �ι�° ���� : 4
		 * 4 5 6 7 8 
		 * 
		 * ù��° ���� : 9  
		 * �ι�° ���� : 0
		 * 1�̻��� ���ڸ��� �Է����ּ���.
		 */
		Scanner sc = new Scanner(System.in);
			System.out.print("ù��° ���� : ");
			int num1 = sc.nextInt();
			sc.nextLine();
			System.out.print("�ι�° ���� : ");
			int num2 = sc.nextInt();
			sc.nextLine();	
				if(num1>=1 && num2>=1){ // 1�̻��� ���ڸ� �Է¹���
					if(num1 < num2) { // num1=4, num2=8
						for(int i=num1; i<=num2; i++) {
							System.out.print(i+" ");
						}
					}else {
						// num2=4 , num1=8
						for(int i=num2; i<=num1; i++) {
							System.out.print(i+" ");
						}
					}
				}else if(num1 <= 0){ // num1�� 0������ ���ڸ� �Է¹���
					System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
				}else if(num2 <= 0) {// num2�� 0������ ���ڸ� �Է¹���.
					System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
				}
	}
	public void practice7() {
		/*
		 * �� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		 * ��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���
		 */
		Scanner sc = new Scanner(System.in);
			
			for(;;) {
				System.out.print("ù��° ���� : ");
				int num1 = sc.nextInt();
				sc.nextLine();
				System.out.print("�ι�° ���� : ");
				int num2 = sc.nextInt();
				sc.nextLine();	
					if(num1>=1 && num2>=1){ // 1�̻��� ���ڸ� �Է¹���
						if(num1 < num2) { // num1=4, num2=8
							for(int i=num1; i<=num2; i++) {
								System.out.print(i+" ");
							}
							break;
						}else {
							// num2=4 , num1=8
							for(int i=num2; i<=num1; i++) {
								System.out.print(i+" ");
							}
							break;
						}
					}else if(num1 <= 0){ // num1�� 0������ ���ڸ� �Է¹���
						System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
					}else if(num2 <= 0) {// num2�� 0������ ���ڸ� �Է¹���.
						System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
					}
			}

	}
	public void practice8() {
		/*
		 * ����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
		 * 
		 * (for�� �̿�)
		 * ex.
		 * ���� : 4
		 * ===== 4�� =====
		 * 4 * 1 = 4
		 * 4 * 2 = 8
		 * 4 * 3 = 12
		 * 4 * 4 = 16
		 * 4 * 5 = 20
		 * 4 * 6 = 24
		 * 4 * 7 = 28
		 * 4 * 8 = 32
		 * 4 * 9 = 36
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int gugudan = sc.nextInt();
		sc.nextLine();
		System.out.println("====="+ gugudan+"�� =====");
			for(int i=1; i<10; i++) {
				System.out.printf("%d * %d = %d \n",gugudan,i,(gugudan*i));
			}
	}
	public void practice9() {
		/*
		 * ����ڷκ��� �Է¹��� ������ �ܺ��� 9�ܱ��� ����ϼ���.
		 * 
		 * ����
		 * ���� : 4
		 * ===== 4�� =====
		 * ===== 5�� =====
		 * ...
		 * ===== 9�� =====
		 * 
		 * ���� : 10
		 * 2~9 ������ ���ڸ� �Է����ּ���.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int gugudan = sc.nextInt();
		sc.nextLine();
			if(gugudan>=2 && gugudan<=9) {
				for(int i=gugudan ; i<=9; i++) {
					System.out.printf("===== %d�� =====\n",i);
					for(int j=1; j<=9; j++ ) {
						System.out.printf("%d * %d = %d \n"
								,i,j,(i*j));
					}
				}
			}else{
				System.out.println("2~9������ ���ڸ� �Է����ּ���.");
			}
	}
	public void practice10() {
		/*
		 * Practice9() ������ �����ϳ�, 2~9 ������ ���ڰ� �ƴ� ���� �Էµƴٸ�
		 * ��2~9 ������ ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		 */
		for(;;) {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� : ");
			int gugudan = sc.nextInt();
			sc.nextLine();
				if(gugudan>=2 && gugudan<=9) {
					for(int i=gugudan ; i<=9; i++) {
						System.out.printf("===== %d�� =====\n",i);
						for(int j=1; j<=9; j++ ) {
							System.out.printf("%d * %d = %d \n"
									,i,j,(i*j));
						}
					}
					break;
				}else{
					System.out.println("2~9������ ���ڸ� �Է����ּ���.");
				}
		}
	}
	public void practice11() {
		/*
		 * ����ڷκ��� ���� ���ڿ� ������ �Է� �޾�
		 * ������ ������ ���ڰ� Ŀ���ų� �۾����� ���α׷��� �����ϼ���.
		 * ��, ��µǴ� ���ڴ� �� 10���Դϴ�.
		 * ���������� ���ڵ� ���̿��� ������ ������ ���� �����ϴ� ���� ���Ѵ�.
		 *ex) 2, 7, 12, 17, 22 ��
		 *      5  5   5   5 => ���⼭ ������ 5
		 *
		 * ���� ���� : 4
		 * ���� : 3
		 * 4 7 10 13 16 19 22 25 28 31

		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("����  ���� : ");
		int startNum = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		int equaldef = sc.nextInt();
		sc.nextLine();
		// ���ۼ���  : 3
		// ���� : 2
		// 3 5 7 9 11 13 15 17 19 21(3+ 2*9)
		for(int i=0; i<=9; i++) {
			if(i==0) {
				System.out.print(startNum+" ");
			}else {
				startNum = startNum+equaldef;
				System.out.print(startNum+" ");
			}
		}
	}

	public void practice12() {
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
