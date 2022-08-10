package com.kh.variable;

public class D_Printf {
	
	/*
	 * System.out.println(����ϰ��� �ϴ� ��); 
	 * => ���� ����� �Ŀ� �ٹٲ�(Ŀ���� �����ٿ� ����.)�� �ѹ� ���ش�.
	 * System.out.print(����ϰ��� �ϴ� ��);
	 * => ���� ����� �Ŀ� �ٹٲ�(Ŀ���� �ش��ٿ� ����.)�� ���� �ʴ´�.
	 * 
	 * System.out.printf()�� ���Ͽ� �������
	 * [ǥ����]
	 * System.out.printf("����ϰ��� �ϴ� ����", ����ϰ��� �ϴ� ��);
	 * => f�� format(����)�� �ǹ��Ѵ�.
	 * => ���Ŀ� ���缭 ������ ��µǳ�, �ٹٲ��� �Ͼ�� �ʴ´�.
	 * => ������ \n�� �̿��Ѵ�.
	 * => "����ϰ��� �ϴ� ����"�� ������ �հ�, ����ϰ��� �ϴ� ������ ������ �޲۴ٰ� �����ϸ� �ȴ�.
	 * ����
	 * %d : ����(decimal, 10����)�� �� �ڸ�
	 * %f : �Ǽ�(float)�� �� �ڸ�
	 * %c : ����(character)�� �� �ڸ�
	 * %s : ���ڿ�(String)�� �� �ڸ�
	 */
	public void printfTest(){
		
		//���� �׽�Ʈ(%d)
		int iNum1 = 10;
		int iNum2 = 20;
		
		// iNum1 : xx, iNum2 : xx => �̷� �������� ����Ѵ�.
		// println ���
		System.out.println("iNum1 : "+iNum1+", iNum2 : "+iNum2);
		// printf ���
		System.out.printf("iNum1 : %d, iNum2 : %d",iNum1,iNum2);
		
		// �����׽�Ʈ(%d)
		System.out.println("\n"+iNum1 + " + " +iNum2 + " = " + iNum1+iNum2);
		System.out.println(iNum1 + " + " +iNum2 + " = " + (iNum1+iNum2));
		// ��ȣ�� ������� ������ �����ۿ��� �ƴ� ���ڿ��� ����Ѵ�.
		
		System.out.printf("%d + %d = %d \n",iNum1,iNum2,(iNum1+iNum2));
		// �ٹٲ��� ���� �ʾ� ���൵ �߰����ش�.
		
		// �Բ� ����� �� �ִ� �ɼ�
		System.out.printf("%5d \n",iNum1); // 5ĭ�� ���� �� ������ ������ ��.
		System.out.printf("%-5d \n" ,iNum2); // 5ĭ�� ���� �� ���� ������ ��.
		
		// �Ǽ��׽�Ʈ(%f)
		double dNum = 4.27546789;
		System.out.printf("dNum : %f \n",dNum); 
		// 4.275468�̶�� ���� ���´�.
		// %f : �Ҽ��� �Ʒ� 7��° �ٿ��� �ݿø��� �Ǿ� �Ҽ��� �Ʒ� 6��°������ ��µȴ�.
		System.out.printf("dNum : %.1f \n",dNum);
		// 4.3�̶�� ���� ���´�.
		// �Ҽ��� �Ʒ� 2��° �ٿ��� �ݿø��� �Ǿ� �Ҽ��� �Ʒ� 1��°������ ��µȴ�.
		
		// ���� �� ���ڿ� �׽�Ʈ(%c, %s)
		char ch = 'a';
		String str = "Hello";
		System.out.printf("%c %s \n",ch,str);
		// a Hello��� ���� ���´�.
		System.out.printf("%c    %s \n",ch,str);
		System.out.printf("%c \t %s \n",ch,str);
		// \t : TabŰ�� �ѹ� ���� ȿ���� �ش�.
		// \n : EnterŰ�� �ѹ� ���� ȿ���� �ش�.
		
		// �ɼ�
		System.out.printf("%C %S",ch, str);
		// ���ĺ� �ҹ����� ���, �빮�ڷ� �ٲپ ����Ѵ�.
		
		/*
		 * printf : ���� �� ���� �����Ͽ� �����ϰ� ����� �� �ְ� ���ش�.
		 * 	                  ��, ������ Format�� ������ ���� and Variable�� ������ ������ �¾ƾ� �Ѵ�.
		 */
	}
}
