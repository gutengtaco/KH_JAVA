package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * for��
	 * �ڵ带 �ݺ������ִ� ���� �� �ϳ��̴�.
	 * ��, ���� �ݺ��� Ƚ���� �˰� ���� �� ����Ѵ�.
	 * ��ȣ �ȿ� �ݺ��� �����ϴ� �κ��� (�ʱ��;���ǽ�;������)���� �̷���� �ִ�.
	 * 
	 * [ǥ����]
	 * for(�ʱ��;���ǽ�;������){
	 * 		�ݺ���Ű���� �ϴ� �ڵ�;
	 * }
	 * => �Ұ�ȣ : ��� �ݺ��� ������ �����Ѵ�.
	 * => �߰�ȣ : ������ �ݺ��Ͽ� ��������� �����Ѵ�.
	 * 
	 * �ʱ�� : �ݺ����� ����� ��, "�ʱ⿡ �� �ѹ��� ����Ǵ� ����"�̴�.
	 *        (�ݺ��� �ȿ��� ����� Variable�� ���� �� �ʱ�ȭ�Ѵ�.)
	 * ���ǽ� : �ݺ����� ����� ��, "�ش� �ݺ��� ����� ����"�� �����Ѵ�.
	 * 		  (�ʱ�Ŀ��� ������ Variable�� ������ ������ �����Ѵ�)
	 * 		  => ���ǽ��� ����� true : �ݺ��� �����Ѵ�. 
	 *        => ���ǽ��� ����� false : �ݺ��� ���� �� �ݺ����� �������´�.
	 * ������ : �ݺ����� �����ϴ� Variable���� ������Ų��.
	 * 		  (�ʱ�Ŀ��� ������ Variable�� ������ ������ �Ѵ�)
	 * 
	 * [���� ����]
	 * �ʱ��  -> ���ǽ�(true) ->�ڵ� -> ������ 
	 *      -> ���ǽ�(true) ->�ڵ� -> ������ 
	 *      -> ���ǽ�(true) ->�ڵ� -> ������ 
	 *      ...
	 *      -> ���ǽ� (false) ->�ڵ带 �������� �ʰ�, �ݺ��� ���� �� ��������.
	 * 
	 */
	public void method1() {
		// for���� ����ϴ� ����
		// 1. �ݺ����� ������ �ۼ��� ��, �Ǽ��� ���̱� ���ؼ�
		// 2. �ݺ��� �þ�� ���ŷӱ� ������
		
		// "�ȳ��ϼ���"�� 5�� �������� ����ϱ�
		// System.out.println("�ȳ��ϼ���");
		// System.out.println("�ȳ��ϼ���");
		// System.out.println("�ȳ��ϼ���");
		// System.out.println("�ȳ��ϼ���");
		// System.out.println("�ȳ��ϼ���");
		
		// �ݺ� Ƚ���� ���Ƶ� �ʱ��, ���ǽ�, �������� �ٸ� �� �ִ�.
		// i=1 ; i<=5
		for(int i=1; i<=5; i++) {// �ʱ�� : Variable�� ���� �� �ʱ�ȭ����.
								// ���ǽ� : ������ų Ƚ���� ��������.
								// ������ : ���������ڸ� �̿��Ͽ� ��������.
								// 		    �������������ڸ� ������ش�.
			System.out.println("�ȳ��ϼ���.");
			// i = 1(true) : "�ȳ��ϼ���" => i=2
			// i = 2(true) : "�ȳ��ϼ���" => i=3
			// i = 3(true) : "�ȳ��ϼ���" => i=4
			// i = 4(true) : "�ȳ��ϼ���" => i=5
			// i = 5(true) : "�ȳ��ϼ���" => i=6
			// i = 6(false) => �ݺ��� ����
		}

		System.out.println();
		// i=1, i<6
		for(int i=1; i<6; i++) {
			System.out.println("�ݰ����ϴ�.");
		}
		
		System.out.println();
		// �ݺ��� ���۰��� 1�� �ʿ�� ����.
		// i���� 11�������� 16���� ������ ���� 1�� ������ ���� �ݺ�
		// i=11,12,13,14,15(true) / 16(false)
		for(int i=11; i<16; i++) {
			System.out.println("�������");
		}
		
		System.out.println();
		// �����Ŀ��� ������ ���� 1�� �ʿ�� ����.
		// i�� 1���� 10���� �Ź� 2�� �����ҵ��� �ݺ�
		// i=1,3,5,7,9(true) /11(false)
		for(int i=1;i<=10; i+=2) {
			System.out.println("����������");
		}
		
		System.out.println();
		// �����Ŀ��� ���ҵ� �����ϴ�.
		// i�� 10�������� 6���� ũ�ų� ���������� �����ҵ��� �ݺ�
		// i = 10,9,8,7,6(true) / 5(false)
		for(int i=10; i>=6; i-=1) {
			System.out.println("����");
		}
	}
	public void method2() {
		
		// ���� �ܼ��ϰ� �ݺ��Ǵ� Ƚ���� �����ϴ� ǥ����
		// �ʱ��; ���ǽ�; ������
		// (int i=0; i<�ݺ���Ű�����ϴ� Ƚ��; i++)
		//System.out.println("������ ���ڿ�");
		int j = 0;
		for(int i=0; i<10; i++) {
			
			// ������ ���ڿ����� �Ź� �޶����� ��� ����� ����ʹ�.
			// i : 0
			// i : 1
			// i : 2 ...
			//System.out.println("i : "+i);
			
			// 0��° ��¹�
			// 1��° ��¹�
			// 2��° ��¹� ...
			//System.out.println(i+"��° ��¹�");
			
			// 1��° ��¹�
			// 2��° ��¹�
			// 3��° ��¹� ...
			// int j = i+1;
			// System.out.println(j+"��° ��¹�");
			
			// 1��° ��¹�
			// 2��° ��¹�
			// 2��° ��¹�
			// 3��° ��¹�...
			// Ư�� ��¹��� �ݺ��ϰ� ������
			System.out.println((i+1)+"��° ��¹�");
			if(i==1) {
				j=i+1;
				System.out.println(j+"��° ��¹�");
			}else {
			}
		}
	}
	
	public void method3() {
		
		for(int i=0; i<10; i++) {
			// 1 2 3 4 5 6 7 8 9 10
			// System.out.print((i+1)+" ");
			System.out.printf("%d ",(i+1));
		}
	}
	
	public void method4() {
		
		// 1�������� 10���� ��� ���� ���ϴ� ��
		int sum = 0 ; // 0���� �ʱ�ȭ�ϴ� ���� : ������ ��Ȯ�� ���� ��� ���ؼ�.
		for(int i=1; i<=10; i++) {
			sum = sum + i;
			// sum += i;
			// i=1 => sum= 0+1		 => i=2
			// i=2 => sum= 0+1+2	 => i=3
			// i=3 => sum= 0+1+2+3   => i=4
			// i=4 => sum= 0+1+2+3+4 => i=5
			// ...
			// i=10 => sum= 0+1+2+...+9+10 =55 =>i=11
			// i=11(false)
			
			// 1+2+3+.....+10+
			// System.out.print(i+"+");
			System.out.print(i);
			
			// i�� ������ ���ڰ� �Ǳ� �������� "+"�� ���̾ ���
			// i�� ������ ���ڰ� �Ǵ� ���� "="�� ���
			// => ���������� ����(���ǹ�)
			// ������ ���� : 10
			if(i == 10) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
			// 1+2+3+...+10 =
		}
		System.out.println(sum);
		System.out.println("1���� 10������ �� : "+sum);
	}
	public void method5() {
		// ����ڷκ��� ��� �Ѱ��� �Է� �޾�
		// 1���� �� ���ڱ��� �������� ���ϰ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("��� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		// 1.������� �ƴ��� �Ǻ�
		if(num>0) { // num�� ����� ���
			// 2. ������ ���ϱ�
			int sum = 0;
			for(int i=1; i<=num; i++) {
				System.out.print(i);
				// 3. �������� �������� ǥ���ϱ�
				// 1+2+3+...=
				if(i==num) {
					System.out.print(" = ");
				}else {
					System.out.print(" + ");
				}
				
				sum = sum+i;
			}
		// 4.for�� �ۿ� ��� ����ϱ�
		System.out.println(sum);
		System.out.println("������ : "+sum);
		
		}else{ // num�� ����� �ƴ� ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	public void method6() {
		// ���� : �Ź� ���Ƿ� �߻��ϴ� ������
		/*
		 * MathŬ����
		 * ���� ���� ���õ� ��� ���, method�� �����ϰ� �ִ� Class
		 * Java���� �̹� �����ϰ� �ִ� Class
		 * 
		 * [Ư¡]
		 * ��� Variable�� Method�տ� static�� �پ��ִ�.
		 * => Method�� ȣ���� ��, new�� �̿��Ͽ� �뺯�� �̸��� ���� �ʿ䰡 ����.
		 *    �ٷ� Class��.Method��();���� ȣ�����ش�.
		 * random()
		 * �Ź� �ٸ� �������� �������ش�.
		 * 0.0 ~ 0.999999 ������ �������� �߻��Ѵ�.
		 * 0.0 <= ������  < 1.0
		 * 
		 * [ǥ����]
		 * 0.0 <= Math.random(); < 1.0
		 */
		
		// 1. random���� ���� �߻�
		// 2. ������ ������ ����
		int random = (int)(Math.random()*10)+1; 
		// 0.0 ~ 0.999...
		// 0.0 ~ 9.999...(*10)
		// 1.0 ~ 10.999...(+1)
		// 1 ~ 10 (��������ȯ : int)
		// [����ȭ]
		// (Math.random() * ������ ����)+���ۼ�
		// ex ) 11~20������ ���� �� ������
		// (Math.random() * 10)+11
		System.out.println(random);
		
		// 3. for�� �� ���
		int sum = 0;
		// 1~10���� ������ �߻�
		for(int i=1; i<=random; i++) {
			//�������� ������ ���
			sum+=i;
		}
		System.out.printf("1���� %d������ �� ���� %d�̴�",random,sum);
	}
	public void method7() {
		// 1�������� 10������ ���� �߿���
		// Ȧ���� ����ϰڴ�.
		// for�� �Ѱ��� ���� ���� => �ݺ� 5��(ȿ����)
		for(int i=1; i<= 10; i += 2) {
			System.out.print(i + " ");
			
		}
		System.out.println();
		// for�� + if�� => �ݺ� 10��(��ȿ����)
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
	}
	public void method8() {
		// ������ 2��
		for(int i=1; i<=9; i++) {
			System.out.printf("2 * %d = %d \n",i,(2*i));
		}
	}
	public void method9() {
		// ����ڷκ��� �ܼ��� �Է¹޾�
		// �ش� �ܼ��� �������� ���
		System.out.println("====������ ������====");
		Scanner sc = new Scanner(System.in);
		System.out.print("2~9 ������ �ܼ� �Է� : ");
		int gugudan = sc.nextInt();
		sc.nextLine();
		
			if(gugudan>=2 && gugudan<=9) {
				for(int i=1; i<=9; i++) {
					System.out.printf("%d * %d = %d \n"
							,gugudan,i,(gugudan*i));
				}
			}else {
				System.out.println("�ܼ��� �߸� �Է��ϼ̽��ϴ�.");
			}
	}
	public void method10() {
		// 2�ܺ��� 9�ܱ��� ��� �� ����ϱ�
		// 9�� ���� ��� Ȯ��
		// ��Ģ�� ã��!
		// 9��� �ܼ� �κ��� 2,3,4,5,6,7,8,9 => 2~9���� 1�� ����
		// [�����޼���]
		// Duplicate local variable i
		// Variable�� �ߺ��Ǹ� �߻��Ѵ�.
		for(int i=2; i<=9; i++) { // 8��
			System.out.println("-----"+i+"��-----");
			for(int j=1; j<=9; j++) { // 9��
				System.out.printf("%d * %d = %d \n",i,j,(i*j));
			}
		}
		// �� �ݺ�Ƚ�� : 72��
	}
	public void method11() {
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
		
		// i = 0 : j = 1 2 3 4 5
		// i = 1 : j = 1 2 3 4 5
		// i = 2 : j = 1 2 3 4 5 
		for(int i=0; i<3; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public void method12() {
		
		// *****
		// *****
		// *****
		// *****
		
		// ����
		/*
		for(int i=0; i<4; i++) {
			// ����
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		// ���ʺ��� �ݺ��� 20�� ������.
		for(int i=0; i<20; i++) {
			System.out.print("*");
			// 0 1 2 3 4
			// 5 6 7 8 9
			// 10 11 12 13 14
			// 15 16 17 18 19
			if((i+1)%5 == 0 ) {
				System.out.println();
			}
		}
	}
	public void method13() {
		// 1***
		// *2**
		// **3*
		// ***4
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==j) {
					System.out.print(j);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	// for�� �ȿ� for���� ���� �� ���, "��ø for��"�̶�� �θ���.
	// if�� �ȿ� if���� ���� �� ���, "��ø if��"�̶�� �θ���.
	public void method14() {
		
		/*
		 * ����ڷκ��� ���ڸ� �Է¹޾�
		 * 3�ڸ��� �ִ� ���ڸ� ����Ͻÿ�.
		 * ���� �Է� : Hello
		 * 1��° ���� : H
		 * 2��° ���� : e
		 * 3��° ���� : l
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		/*
		 * char ch1 = str.charAt(0);
		 * char ch2 = str.charAt(1);
		 * char ch3 = str.charAt(2);
		 */
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+"��° ���� : " + str.charAt(i));
		}
		
	}
	public void method15() {
		/*
		 * �ƹ� ���ڿ��̳� �Է��ϼ���. : 
		 */
		
		// ���ڿ��� �������� �ݺ��ϸ鼭 �Ź� �Է¹ޱ�
		// ����, �Է¹��� ���ڿ��� "exit"��� ���ڿ��̶�� ����
		// [�����޼���]
		// break cannot be used outside of a loop or a switch
		// break���� �ݺ����̳� switch�� �ȿ����� ���� �� �ִ�.
		Scanner sc = new Scanner(System.in);
		
		// i=0; true; i++ : ���ǽ��� �����ϰų� true�� �Է��ϸ� ���ѹݺ��� �Ͼ��.
		// i=0; i<2;  :�������� �����ϸ� ���ѹݺ��� �Ͼ��.
		// i=0; i<2; i+=0 : ������ 0�� �ϸ� ���ѹݺ��� �Ͼ��.
		// ;; : ���� �����ص� ���ѹݺ��� �Ͼ��.
		for(int i=0; true; i++) {
			System.out.print("�ƹ� ���ڿ��̳� �Է¹������� : ");
			String str = sc.nextLine();
			// switch(str) { case "exit" : ~ }
			if(str.equals("exit")) { 
				System.out.println("���α׷��� �����մϴ�.");
				// �����Ű�� ����
				// ���� ȣ���ߴ� �������� ���ư� (a.method15();)
				return;
				// break�� �����ϴ�.
				// �ٸ�, switch������ break�� �ݺ��������� break��
				// ������ �ٸ���.(�б⹮���� ���� �� ����)
			}else {
				System.out.println("�Էµ� ���ڿ� : "+str);
			}
		}
	}
	public void method16() {
		/*
		 * ����ڷκ��� 2���� ���� ���� �Է¹޾�,
		 * �� ���̿� ���ڸ� ��� ����ϴ� ���α׷��� �ۼ��϶�.
		 * ����
		 * ����1 �Է� : 3 
		 * ����2 �Է� : 8
		 * 3 4 5 6 7 8
		 * ���ǹ��� for���� �̿��Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();
		// ������ �Էµ��� �ʾ��� ����
		// 1. Math.round() �Ǵ� Math.ceiling()���� �ݿø�,�ݳ����� ����
		// 2. try{ }catch{ }�� ���ؼ� ������ ���� ����ó�� �ϱ�.(���߿� ���)
		
		if(num1 < num2) {
			for(int i=num1; i<=num2; i++) {
				System.out.print(i+" ");
			}
		}else if(num1 > num2) {
			//for(int i=num2; i<=num1; i++){
			//System.out.println(i+" ");
		    //}
			for(int i=num1; i>=num2; i-- ) {
				System.out.print(i+" ");
			}
		}else {
			System.out.print("���� �����մϴ�.");
		}
	}


	
}

