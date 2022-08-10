package kr.or.iei.func;

import java.util.Scanner;

/*
	 	1. ������Ʈ/��Ű��/Ŭ���� �̸�
		������Ʈ �̸� : 01_JavaExam
		����Ŭ���� ��Ű�� : kr.or.iei.run
		����Ŭ���� : Start
		�������Ŭ���� ��Ű�� : kr.or.iei.func
		�������Ŭ���� : Question
		2. ��������
		- ���� ���� �� ������ �����Ͻÿ�.
		- �������Ŭ������ exam1 �޼ҵ忡 ����� �ۼ��Ѵ�.
		- ����Ŭ������ Question Ŭ������ exam1 �޼ҵ带 ȣ���Ѵ�.
		3. ���� �� �䱸����
		1)������Ʈ�̸�, ��Ű���̸�, Ŭ�����̸��� ��� 1�� �׸��� �䱸���׿� �°� �����Ѵ�.
		2) ���� ���� �� �� �ϳ��� ���ڿ��� Scanner �� ���Ͽ� �Է� �ް�, ������ �߻����� �����ϰ� ���� ���� �� ���ڿ��� �����Ѵ�.
		3) ������ ���� ���� �� ���ڿ��� �Է��� ���ڿ��� ���Ͽ� ������ �Ʒ� ���� ���ó�� ���ٰ� ����Ѵ�.
		4) ������ ���� ���� �� ���ڿ��� �Է��� ���ڿ��� ���Ͽ� ���� ���� �� ������ �� ��� �Ʒ� ���� ���ó�� �̱� ��� �̰�ٰ� ���, �� ��� ���ٰ� ����Ѵ�.
		5) �� ������ 5ȸ �ݺ� �� �Ʒ� ���� ���ó�� �� �� �̰����, �� �� ������, �� �� ������ ����Ѵ�.
	 	* ����,���ڿ� �Է� �� ���� ���� �� �̿��� ���ڿ��� �Է��� ��� �Ʒ� ���� ���ó�� �߸��� �Է��̶�� ��� �� �ش� ȸ���� ������ �ٽ� �����Ѵ�.
		6) ���� ����� ������ ���ƾ� �Ѵ�.
	 	*** ����ִ� ���� ���� �� ���� ***
		1 ��° ���� ���� �� ������ �����մϴ�.
		���� ���� �� �� �� ���� �Է��ϼ��� : ����
		����� ������ �½��ϴ�.
		��ǻ�ʹ� ������ �½��ϴ�.
		��! ����� �����ϴ�!
		-------------------------------
		2 ��° ���� ���� �� ������ �����մϴ�.
		���� ���� �� �� �� ���� �Է��ϼ��� : ����
		����� ������ �½��ϴ�.
		��ǻ�ʹ� ������ �½��ϴ�.
		¦¦! ����� �̰���ϴ�!
		-------------------------------
		3 ��° ���� ���� �� ������ �����մϴ�.
		���� ���� �� �� �� ���� �Է��ϼ��� : ��
		�߸��� �Է��Դϴ�.
		-------------------------------
		3 ��° ���� ���� �� ������ �����մϴ�.
		���� ���� �� �� �� ���� �Է��ϼ��� : ��
		����� ���� �½��ϴ�.
		��ǻ�ʹ� ������ �½��ϴ�.
		¦¦! ����� �̰���ϴ�!
		-------------------------------
		4 ��° ���� ���� �� ������ �����մϴ�.
		���� ���� �� �� �� ���� �Է��ϼ��� : ��
		����� ���� �½��ϴ�.
		��ǻ�ʹ� ���� �½��ϴ�.
		�����ϴ�.
		-------------------------------
		5 ��° ���� ���� �� ������ �����մϴ�.
		���� ���� �� �� �� ���� �Է��ϼ��� : ����
		����� ������ �½��ϴ�.
		��ǻ�ʹ� ������ �½��ϴ�.
		��! ����� �����ϴ�!
		-------------------------------
		�ټ� ���� ���� �� ����� �� 2 �� �̰���ϴ�.
		�ټ� ���� ���� �� ����� �� 2 �� �����ϴ�.
		�ټ� ���� ���� �� ����� �� 1 �� �����ϴ�.
		���� ���� �� ������ �����մϴ�.
	 	*/
public class QuestionAnswer {
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*** ����ִ� ���������� ���� ***");
		int win = 0;
		int lose = 0;
		int same = 0;
		for(int i=0; i<5; i++) {
		System.out.println("-----------------------------------");
		System.out.println((i+1)+"��° ���� ���� �� ������ �����մϴ�.");
		System.out.print("���� ���� �� �� �ϳ��� �Է��ϼ��� : ");
		String you = sc.nextLine(); // ����, ����, ��
		
			// ���ڿ��� ��ȿ���� üũ(����, ����, ��)
			if(you.equals("����")
			 ||you.equals("����")
			 ||you.equals("��")) { // ���� ���,
				// ������ ������.
				int random = (int)((Math.random()*3)+1);
				
				// 1,2,3�� ���� "����", "����", "��"�� ��Ī�� ��Ŵ
				String computer = " ";
					// Switch��
					switch(random) {
					case 1 : 
						computer = "����";
						break;
					case 2 :
						computer = "����";
						break;
					case 3 :
						computer = "��";
						break;
					//default : ������ 1,2,3�� ���ͼ� �� �ʿ� ����.
					}
				// ��, ��ǻ��
				System.out.println("����� " + you + " �� �½��ϴ�.");
				System.out.println("��ǻ�ʹ� " + computer + " �� �½��ϴ�.");
				
				// �� vs ��ǻ��
				if(computer.equals(you)) {	// ����� ���
					System.out.println("�����ϴ�.");
					same++;
				}else { // ����� �ʾ��� ���
					/*
					 * �̱� ���
					 * ���� < ����
					 * ���� < ��
					 * �� < ����
					 */
					if(computer.equals("����")&&you.equals("����")||
					   computer.equals("����")&&you.equals("��")||
					   computer.equals("��")&&you.equals("����")) {
					   System.out.println("¦¦! ����� �̰���ϴ�.");
					   win++;
					}else { // ���� ���
					   System.out.println("��! ����� �����ϴ�.");
					   lose++;
					}
				}
				
			}else {// �ƴ� ���
				System.out.println("�߸��� �Է��Դϴ�.");
				i--; // �߸��� �Է� �� �ش� ȸ���� �ٽ� ����
			}
		}
		System.out.println("*********************************");
		System.out.println("�̱� �Ǽ� : "+ win);
		System.out.println("�� �Ǽ� : "+ lose);
		System.out.println("��� �Ǽ� : "+ same);
		System.out.println("���� ���� ���� �����մϴ�.");
	}
}







