package kr.or.iei.func;

import java.util.Scanner;

public class Question {
	/*
	 * ������� �Է��� �޾�(����, ����, ��)
	 * ������ �߻����� �����ϰ� ����, ����, ���� ����Ѵ�.
	 * ������� �Է°� ������ ���Ͽ�
	 * 
	 * ���������� ������ �����Ͻÿ�.
	 * exam1�޼ҵ忡 ����� �ۼ��Ѵ�.
	 */
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		int equal = 0;
		
		System.out.println("***����ִ� ���������� ����***");
		for(int i=1; i<6; i++) { //for�� ����
			System.out.println(i +"��° ���������� ������ �����մϴ�.");
			System.out.print("���� ���� �� �� �Ѱ��� �Է��ϼ��� : ");
			
			String me = sc.nextLine(); // ����ڰ� "����","����","��"�� �Է�
			int meGame = 0;		// "����","����","��"�� ���ڷ� ��ȯ�ϱ� ���� ����
				// "����","����","��"�� 1,2,3���� �ν��ϰԲ� if�� ���
				if(me.equals("����")) {
					meGame = 1;
				}else if (me.equals("����")) {
					meGame = 2;
				}else if (me.equals("��")) {
					meGame = 3;
				}else {
				}
				// ��ǻ�Ͱ� ������ ����(1,2,3)�ϰ� �̸� "����","����","��"�� ��ȯ
				int computer = (int)(Math.random()*3+1);
				String computerGame = "";
				if(computer==1) {
					computerGame = "����";
				}else if (computer==2) {
					computerGame="����";
				}else if(computer==3) {
					computerGame="��";
				}
			// ���������� �¸�, �й�, ���º�
		    // ����, ����, �� ���º�
			if((meGame ==1 && computer ==1)||(meGame ==2 && computer ==2)||(meGame ==3 && computer ==3) ) {
				System.out.println("����� "+me+" �� �½��ϴ�");
				System.out.println("��ǻ�ʹ� "+computerGame+" �� �½��ϴ�.");
				System.out.println("�����ϴ�.");
				System.out.println("----------------------------");
				equal++; //���ºθ� �� ������ equal�� 1�� ������Ŵ.
			// ����, ����, �� �й� 
			}else if((meGame ==1 && computer ==2)||(meGame ==2 && computer ==3)||((meGame ==3 && computer ==1)) ) {
				System.out.println("����� "+me+" �� �½��ϴ�");
				System.out.println("��ǻ�ʹ� "+computerGame+" �� �½��ϴ�.");
				System.out.println("��! ����� �����ϴ�.");
				System.out.println("----------------------------");
				lose++; // �й� �� ������ lose�� 1�� ������Ŵ.
			// ����, ����, �� �¸�
			}else if((meGame ==1 && computer ==3)||(meGame ==2 && computer ==1)||(meGame ==3 && computer ==2)) {
				System.out.println("����� "+me+" �� �½��ϴ�.");
				System.out.println("��ǻ�ʹ� "+computerGame+" �� �½��ϴ�");
				System.out.println("¦¦! ����� �̰���ϴ�.");
				System.out.println("----------------------------");
				win++; // �¸��� ������ win�� 1�� ������Ŵ.
			// �߸� �Է� ��, �ش� ȸ���� �ٽ� �ݺ���.
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
				System.out.println("----------------------------");
				i--; //i�� ���� 1 ���ҽ��� �� ȸ���� �ٽ� ������.
			}
			// �¸�, �й�, ���º��� ������ ���
			if(i==5) {
				System.out.printf("�ټ����� ���� �� ����� �� %d�� �̰���ϴ�.\n",win);
				System.out.printf("�ټ����� ���� �� ����� �� %d�� �����ϴ�.\n",lose);
				System.out.printf("�ټ����� ���� �� ����� �� %d�� �����ϴ�.\n",equal);
				System.out.println("���� ���� �� ������ �����մϴ�.");
		}//for�� ����
		}
		
	}
}
