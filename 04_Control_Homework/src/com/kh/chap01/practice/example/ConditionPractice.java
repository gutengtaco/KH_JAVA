package com.kh.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		/*
		 * �޴��� ����ϰ� �޴� ��ȣ�� ������ "oo�޴��Դϴ�."��,
		 * ���� ��ȣ�� ������ "���α׷��� ����˴ϴ�."�� ����ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
//		�޴� ���
		System.out.println("1.�Է�");
		System.out.println("2.����");
		System.out.println("3.��ȸ");
		System.out.println("4.����");
		System.out.println("9.����");
//		����� �Է�
//		�޴� ��ġ���� Ȯ��
//		Switch������ break�� �ܼ��� Switch���� ���������� ������ ��.
//		return�� ����� ȣ���� �޼ҵ�� ���ư�, ȣ��Ǳ� ������ ���°� ��.
		while(true) {
			System.out.print("�޴��� �Է��ϼ��� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch(menu) {
			case 1 : 
				System.out.println("�Է� �޴��Դϴ�.");
				break;
			case 2 : 
				System.out.println("���� �޴��Դϴ�.");
				break;
			case 3 : 
				System.out.println("��ȸ �޴��Դϴ�.");
				break;
			case 4 : 
				System.out.println("���� �޴��Դϴ�.");
				break;
			case 9 :
				System.out.println("���� �޴��Դϴ�.");
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default : 
				System.out.println("���� �޴��Դϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}
	}
	public void practice2() {
		/*
		 * Ű����� ������ �Է¹޾�
		 * ������ ����̸鼭 ¦���϶��� "¦����"�� ���
		 * ¦���� �ƴϸ� "Ȧ����"�� ���
		 * ����� �ƴϸ� "����� �Է����ּ���."�� ���
		 */
		Scanner sc =new Scanner(System.in);
		
		for(;;) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			sc.nextLine();
			if(num>0) { // ����� ���
				if(num%2==0) { // ¦���� ���
					System.out.println("¦����");
					break;
//					break;�� �ݺ����� ��� ���� ������.
				}else { // Ȧ���� ���
					System.out.println("Ȧ����");
					continue;
//					continue;�� �Ʒ��� �ڵ�� �������� �ʰ�
//					�ٽ� �ݺ������� ���ư��� �ݺ� �����.
				}
			}else { // ����� �ƴ� ���
				System.out.println("����� �Է����ּ���.");
//					return;
			}
			System.out.println("��");
//			���� break�� continue�� ���� ������� �ʰ�, else�� ���ؼ��� ���� ����
//			�׷���, ���⼭ else�� return�� ����ϸ� Unreachable Code�� ��. 
		}
	}
	public void practice3() {
		/*
		 * ����, ����, ���� �� ������ ������ Ű����� �Է¹ް�
		 * �հ�� ����� ����ϰ�
		 * �հ� / ���հ��� ó���Ͻÿ�.
		 * (���� : 
		 * �������� ������ ���� 40�� �̻��̸鼭,
		 * ����� 60�� �̻��� ���
		 * �հ����� ���, "�����մϴ�. �հ��Դϴ�!"
		 * ���հ��� ���, "���հ��Դϴ�."
		 *   
		 * 
		 */
		Scanner sc =new Scanner(System.in);
		for(int i=0; ;i++) {
			System.out.print("�������� : ");
			int korean = sc.nextInt();
			sc.nextLine();
			System.out.print("�������� : ");
			int math = sc.nextInt();
			sc.nextLine();
			System.out.print("�������� : ");
			int english = sc.nextInt();
			sc.nextLine();
			int sum = korean+math+english;
			double avg = (korean+math+english)/3;
				if( (korean>=40 && math>=40&& english>=40)
						&&( sum/3 )>=60){
					System.out.println("�հ� : "+sum);
					System.out.println("��� : "+avg);
					System.out.println("�����մϴ�. �հ��Դϴ�.\n");
					
				}else {
					System.out.println("���հ��Դϴ�.\n");
				}
		}
	}
	public void practice4() {
		/*
		 * ���� �ڷῡ�� if������ �Ǿ��ִ� ��, ����, ����, �ܿ��� switch������ ����Ͻÿ�.
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("1~12������ ���� �Է� : ");
			int month = sc.nextInt();
			sc.nextLine();
			switch(month) {
				case 3 : 
				case 4 :
				case 5 :
					System.out.printf("%d�� ���Դϴ�.\n",month);
					return;
				case 6 : 
				case 7 :
				case 8 :
					System.out.printf("%d�� �����Դϴ�.\n",month);
					return;
				case 9 : 
				case 10 :
				case 11 :
					System.out.printf("%d�� �����Դϴ�.\n",month);
					return;
				case 12 : 
				case 1 :
				case 2 :
					System.out.printf("%d�� �ܿ��Դϴ�.\n",month);
					return;
				default : 
					System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
					break;
			}
		}
	}
	
	public void practice5() {
		/*
		 * ���̵�, ��й�ȣ�� ���صΰ� �α��� ����� �ۼ��ϼ���.
		 * �α��� ���� �� "�α��� ����"
		 * ���̵� Ʋ���� �� "���̵� Ʋ�Ƚ��ϴ�."
		 * ��й�ȣ�� Ʋ���� �� "��й�ȣ�� Ʋ�Ƚ��ϴ�." ���
		 * 
		 * ����
		 * ���̵� : boram
		 * ��й�ȣ : 1234
		 * �α��� ����
		 * 
		 * ���̵� : boram
		 * ��й�ȣ : 23467
		 * ��й�ȣ�� Ʋ�Ƚ��ϴ�.
		 * 
		 * ���̵� : rambo
		 * ��й�ȣ : 1234
		 * ���̵� Ʋ�Ƚ��ϴ�.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			System.out.print("��й�ȣ : ");
			int pwd = sc.nextInt();
			sc.nextLine();
				if(id.equals("boram")) { // ���̵� ���� ���
					if(pwd == 1234) { // ���̵� �°�, ��й�ȣ�� ����
						System.out.println("�α��� ����");
						System.out.println();
						break;
					}else { //���̵� �°�, ��й�ȣ�� Ʋ��
						System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
						System.out.println();
						continue;
					}
				}else { // ���̵� Ʋ�� ���
					System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
					System.out.println();
					continue;
				}
		}
	}
	
	
	
	
	
	
	
	public void practice6() {
		/*
		 * ����ڿ��� ������, ȸ��, ��ȸ�� �� �ϳ��� �Է¹޾�
		 * �� ����� ���� �� �ִ� ������ ����ϼ���.
		 * �����ڴ� ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ��� �����ϰ�
		 * ȸ���� �Խñ��ۼ�, �Խñ���ȸ, ����ۼ��� �����ϰ�
		 * ��ȸ���� �Խñ� ��ȸ�� ����.
		 * �߸� �Է����� �� "�߸��Է��߽��ϴ�."
		 * 
		 * ȸ����� : ������
		 * ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�
		 */
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("ȸ�� ��� : ");
			String authority = sc.nextLine();
				if(authority.equals("������")) {
					System.out.println("ȸ������, �Խñ۰���, �Խñ��ۼ�"
							+ ",��� �ۼ�, �Խñ� ��ȸ");
					break;
				}else if(authority.equals("ȸ��")) {
					System.out.println("�Խñ��ۼ�, �Խñ���ȸ, ����ۼ�");
					break;
				}else if(authority.equals("��ȸ��")) {
					System.out.println("�Խñ� ��ȸ");
					break;
				}else {
					System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է����ּ���.");
					continue;
				}
		}
	}
	
	public void practice7() {
		/*
		 * Ű, �����Ը� double�� �Է¹ް�
		 * BMI������ ����Ͽ� ����� ����
		 * ��ü�� / ����ü�� / ��ü�� / ���� ����ϼ���.
		 * BMI = ������ / ( Ű(cm) * Ű(cm) )
		 * BMI�� 
		 * 18.5 �̸� 			: ��ü��
		 * 18.5 �̻� ~ 23 �̸� 	: ����ü��
		 * 23 �̻� ~ 25 �̸� 	: ��ü��
		 * 25 �̻� ~ 30 �̸�		: ��
		 * 30�̻�				: �� �� 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű(m)�� �Է����ּ���. : ");
		double m = sc.nextDouble();
		sc.nextLine();
		System.out.print("������(kg)�� �Է����ּ��� : ");
		double kg = sc.nextDouble();
		sc.nextLine();
		double bmi = kg/(m*m);
		System.out.println("BMI���� : "+bmi);
			if(bmi <18.5) {
				System.out.println("��ü��");
			}else if(bmi<23){
				System.out.println("����ü��");
			}else if(bmi<25){
				System.out.println("��ü��");
			}else if(bmi<30){
				System.out.println("��");
			}else {
				System.out.println("�� ��");
				
			}
	}
	public void practice8() {
		/*
		 * Ű����� �� ���� ����� �����ȣ�� �Է¹޾�
		 * �����ȣ�� ���� �������� ����Ͻÿ�.
		 * ��, ����� �ƴ� ���� �Է��ϰų� ���õǾ� ���� ���� �����ȣ �Է½�
		 * "�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�"���
		 * printf���� �̿��Ͽ� ��¹� �ۼ�
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�ǿ����� �Է�1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�ǿ����� �Է�2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("������ �Է�(+,-,*,/,%) : ");
		String str = sc.nextLine();
			if(str.equals("+")){
				System.out.printf("%d %s %d = %d",num1,str,num2,(num1+num2));
			}else if(str.equals("-")) {
				System.out.printf("%d %s %d = %d",num1,str,num2,(num1-num2));
			}else if(str.equals("*")) {
				System.out.printf("%d %s %d = %d",num1,str,num2,(num1*num2));
			}else if(str.equals("/")) {
				System.out.printf("%d %s %d = %d",num1,str,num2,(num1/num2));
			}else if(str.equals("%")) {
				System.out.printf("%d %s %d = %d",num1,str,num2,(num1%num2));
			}else {
				System.out.println("�߸� �Է��Ͽ����ϴ�. ���α׷��� �����մϴ�.");
			}
	}
	public void practice9() {
		/*
		 * �߰����, �⸻���, ��������, �⼮ȸ���� �Է��ϰ�
		 * Pass �Ǵ� Fail�� ����Ͻÿ�.
		 * ���� 100�� �� �������δ�
		 * �߰���� 20%, �⸻��� 30%, ���� 30%, �⼮ 20%
		 * �̶�, �⼮ ȸ���� �� ���� ȸ�� 20ȸ �߿��� �⼮�� ���� �Է�
		 * ������ 70�� �̻��̸鼭 ��ü ������ 70%�̻� �⼮���� ��� Pass,
		 * �ƴϸ� Fail
		 * 
		 * ����
		 * �߰���� ���� : 80
		 * �⸻��� ���� : 90
		 * ���� ���� : 50
		 * �⼮ ȸ�� : 15
		 * ===========���==========
		 * �߰���� ����(20)  : 16.0
		 * �⸻��� ����(30)  : 27.0
		 * ���� ����(30)    : 15.0
		 * �⼮ ����(20)    : 15.0	
		 * ���� : 73.0
		 * PASS
		 * 
		 * �߰� ��� ���� : 80 : 16
		 * �⸻ ��� ���� : 30 : 9
		 * ���� ���� : 60	 : 18
		 * �⼮ ȸ�� : 18 	 : 18
		 * ===========���==========
		 * FAIL [���� �̴�] (���� 61.0)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("�߰���� ���� : ");
			int middle = sc.nextInt();
			sc.nextLine();
			double middlePoint = middle * 0.2;
			
			System.out.print("�⸻��� ���� : ");
			int end = sc.nextInt();
			sc.nextLine();
			double endPoint = end * 0.3;
			
			System.out.print("���� ���� : ");
			int report = sc.nextInt();
			sc.nextLine();
			double reportPoint = report * 0.3;
			
			System.out.print("�⼮ ȸ�� : ");
			double attend = sc.nextDouble();
			sc.nextLine();

			double result = middlePoint+endPoint+reportPoint+attend;
			
			if(result>=70 && (attend/20)>=0.7) { // ���� 70�� �̻� �̸鼭 �⼮ 70% �̻�
				System.out.println("===========���==========");
				System.out.println("�߰���� ����(20) : "+middlePoint);
				System.out.println("�⸻��� ���� (30): "+endPoint);
				System.out.println("���� ����(30) : "+reportPoint);
				System.out.println("�⼮ ȸ��(20) : "+attend);
				System.out.println("���� : "+result);
				System.out.println("PASS");
			}else if(result < 70 && (attend/20) >= 0.7) { // ���� 70�� �̸� �̸鼭 �⼮ 70% �̻� 
				System.out.printf("FAIL [���� �̴�] (���� %.1f)",result);
			}else if(result >= 70 && (attend/20) < 0.7) { // ���� 70�� �̻� �̸鼭 �⼮ 70% �̸�
				System.out.printf("FAIL [�⼮ Ƚ�� ����] (%.0f/20)",attend);
			}else{ // ���� 70�� �̸� �̸鼭 �⼮ 70% �̸�
				System.out.printf("FAIL [���� �̴�] (���� %.1f)\n",result);
				System.out.printf("FAIL [�⼮ Ƚ�� ����] (%.0f/20)",attend);
				
			}
			System.out.println();
			
		}
			
	}
	public void practice10() {
		/*
		 * �տ� ������ �ǽ������� �����Ͽ� ������ �� �ִ� �޴�ȭ���� ����.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass/Fail");
		
		
		System.out.print("���� : ");
		int choose = sc.nextInt();
		sc.nextLine();
		
		switch(choose) {
		case 1 : practice1(); break;
		case 2 : practice2(); break;
		case 3 : practice3(); break;
		case 4 : practice4(); break;
		case 5 : practice5(); break;
		case 6 : practice6(); break;
		case 7 : practice7(); break;
		case 8 : practice8(); break;
		case 9 : practice9(); break;
		default : System.out.println("�ش� �޴��� �������� �ʽ��ϴ�.");
		
		}
	}
}