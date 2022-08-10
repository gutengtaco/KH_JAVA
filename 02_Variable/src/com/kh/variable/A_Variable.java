package com.kh.variable;

public class A_Variable {
	
	//�ñ�, �ٹ��ð�, �ٹ��ϼ��� ���ؼ� ������ ����Ͽ� ����ϴ� Method
	public void printSalary() {

		System.out.println("===== ���� ��� �� =====");
		
		// ��� �� �ʿ��� ������(�ñ�, �ٹ��ð�, �ٹ��ϼ�)
		System.out.println("�ñ� : 9160 ��");
		System.out.println("�ٹ��ð� : 6 �ð�");
		System.out.println("�ٹ��ϼ� : 15 ��");
		
		// ���� - �ñ� * �ٹ��ð� * �ٹ��ϼ�
		// �谩�� : 000000�� �������� ���
//		System.out.println("���μ� : 9160 * 6 * 15 ��");
		// 1. Java���� ���� ������ X�� ǥ������ �ʰ� *�� ǥ���Ѵ�.
		// 2. Java���� ���ڿ��� �ֵ���ǥ("")�� ��� ǥ���ϰ�, ���ڴ� �׳� ǥ���Ѵ�.
		// 3. Java���� ���� �ٸ� ������ ���� ������ ���̾ ���̰� ���� ���, + ��ȣ�� ����.
		// �����? ���μ� : 9160 * 6 * 15 �� 
		// ���⼭ �츮�� ���ϴ� ����? 824400��
		// �ٸ�, ���μ����� �Ǽ��� 0�� �ϳ� �� �־���.
		System.out.println("���μ� : " + 91600*6*15 + " ��");
		System.out.println("�赿�� : " + 9160*6*15 + " ��");
		System.out.println("������ : " + 9160*6*15 + " ��");
		System.out.println("���Ѽ� : " + 9160*6*15 + " ��");
		System.out.println("������ : " + 9160*6*15 + " ��");
		
		// Variable�� ����غ���
		System.out.print("\n"); // ����
		
		System.out.println("===== ���� ��� �� =====");
		//������� Variable�� �����ϰ� ���� �����غ���.
		int pay = 9160; // �ñ��� ��Ƶδ� Variable
		int time = 6;	// �ٹ��ð��� ��Ƶδ� Variable
		int day = 15;	// �ٹ��ϼ��� ��Ƶδ� Variable
		// Variable�� ������ ����غ���
		System.out.println("�ñ� :" + pay + " ��");
		System.out.println("�ٹ��ð� :" + time + " �ð�");
		System.out.println("�ٹ��ϼ� :" + day + " ��");
		
		System.out.println("���μ� : "+ pay*time*day+"��");
		System.out.println("�赿�� : "+ pay*time*day+"��");
		System.out.println("������ : "+ pay*time*day+"��");
		System.out.println("���Ѽ� : "+ pay*time*day+"��");
		System.out.println("������ : "+ pay*time*day+"��");
		// [�����޼���]
		// Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		// String literal is not properly closed by a double-quote
		// �ֵ���ǥ�� �ι� ���� ����� �����̴�.
		/*
		 * Variable�� ����ϴ� ����
		 * 1. Variable�� �켱������ ���� �ǹ̸� �ο��� �������� ����Ѵ�.(������)
		 * 2. �� �ѹ��� ���� ����ϰ�, �ʿ��� ������ ��� �̸��� �ҷ��� ����Ѵ�.(���뼺)
		 * 3. ���������� ���� ���� �� �� �ִ�.
		 */
	}
	
	//������ ����
	public void declareVariable() {
		
		/*
		 * ������ ����
		 * ���� ����ϱ� ���� Variable�� �޸� ������ Ȯ���صΰڴ�. 
		 * =>���� �뷮�� ���� ���ڸ� �����.
		 * 
		 * [ǥ����] �ڷ��� Variable��;
		 * �ڷ��� : Variable�� ũ�� �� ����� �����ϴ� �κ��̴�.
		 * Variable�� : Variable�� �̸��� ���ϴ� �κ��̴�. 
		 * 
		 * Variable ���� �� ������ ��
		 * 1. Variable���� �ҹ��ڷ� �����ϰԲ� �̸��� �����ش�.(��, ��Ÿ��ǥ����� ��Ų��.)
		 * 2. ���� ����(�߰�ȣ)�ȿ����� ������ Variable������ ������ �Ұ��ϴ�(�̸� �ߺ� �Ұ�)
		 * 3. �ش� ����(�߰�ȣ)�ȿ� ����� Variable�� �ش� ���� �ȿ����� ����� �����ϴ�.
		 *    ��, �ٸ� Method������ ����� �Ұ��ϴ� => ����������� �Ѵ�.
		 */
		
		// �ڷ���
		// 1. ����(true/false => ����)
		boolean isTrue;	 //1byte
		
		// 2. ������(������, �Ǽ���)
		// ������
		byte bNum; 		//1byte(-128 ~ 127 : 256��)
		short sNum;		//2byte 
		int iNum;		//4byte(�⺻�ڷ���, -21�� ~ 21��)
		long lNum;		//8byte
		
		// �Ǽ���(�Ҽ��� �Ʒ��� ���ڸ� ǥ�� ����)
		float fNum;		//4byte(�Ҽ��� �Ʒ� 7�ڸ�)
		double dNum;	//8byte(�⺻�ڷ���, �Ҽ��� �Ʒ� 15�ڸ� - ������)
		
		// 3. ������
		char ch; // 2byte
		
		// ----- �� ���� �� 8���� �⺻�ڷ����̶�� �Ѵ�----- 
		
		// 4. ���ڿ���(�����ڷ���)
		String str; // ũ�⸦ �������� �ʴ´�.
		
		/*
		 * ������� ������ ���� ����(�ڽ��� ���� ���)
		 * [ǥ����] ������ = ��;
		 */
		
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; 	// long���� �˷��ֱ� ���� �ڿ� L�� ���� ǥ�����ش�.
		
		fNum = 4.0f;// float���� �˷��ֱ� ���� �ڿ� f�� ���� ǥ�����ش�.
		dNum = 8.0;		
		
		ch = 'A'; 	// Java���� ������ ���� ���� �ݵ�� ��������ǥ('')�� �ִ´�.
		str = "�ȳ��ϼ���"; // ���ڿ��� ���� �ֵ���ǥ("")�� �ִ´�.
		
		//�� ������ ��� ���� ���
		System.out.println("isTrue : " + isTrue);
		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("str : " + str);

	}
	//������ ����� ���ÿ� �ʱ�ȭ
	public void intiVariable() {
		
		/*
		 * ������ ����� ���ÿ� �ʱ�ȭ
		 * [ǥ����] �ڷ��� Variable�� = ��;
		 * ���� -> �� -> ������ ������ ����
		 */
		
		// 1.����
		boolean isTrue = true; 
		boolean isFalse = 3+5<1; // ����� True �Ǵ� False�� ������ ���ĵ� ����
	
		// 2.������
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		
		// 3.�Ǽ���
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 4.������
		char ch = '��';
		
		// 5.���ڿ���(�����ڷ���)
		String str = "Java������";
		
		//�� ������ ��� �� ���
		System.out.println("isTrue : "+isTrue);
		System.out.println("isFalse : "+isFalse);
		System.out.println("bNum : "+bNum);
		System.out.println("sNum : "+sNum);
		System.out.println("iNum : "+iNum);
		System.out.println("lNum : "+lNum);
		System.out.println("fNum : "+fNum);
		System.out.println("dNum : "+dNum);
		System.out.println("ch : " +ch);
		System.out.println("str : " +str);
		
	}
	//���
	public void constant() {
		
		//������ Variable
		int age = 20;	//����� ���ÿ� ����
		System.out.println("age : " + age);
		
		// Variable�� Ư¡ : ���� �ٲ� �� �ִ�.
		age = 30;
		System.out.println("����� age : " + age);
	
		/*
		 * ��� : ������ �ʴ� ���� �ǹ��Ѵ�.
		 * 		�ѹ� ��ϵ� ���� ���� �Ұ����ϴ�.
		 * => �׻� �������� ���� ����� �� ����Ѵ�.
		 * 	    ��) pi : ������  
		 * 
		 * ��� ���� �� ��������
		 * 1. final�̶�� Ű���带 �ٿ��� �����Ѵ�.
		 * 2. ������� �׻� �빮�ڷ� ����.
		 * [ǥ����] final �ڷ��� ����� = ��;
		 */
			
		final int AGE = 20;
		System.out.println("AGE : " + AGE);
		//AGE = 30; ��� ���� �ٲٷ��� �ϸ� ������ ���.
		//[�����޼���]
		//The final local variable AGE cannot be assigned. 
		//It must be blank and not using a compound assignment
		//=>finalŰ���尡 ���� ���������� AGE�� ���� ���� �� ����.
		//=>����� �̹� ���� ���� ��� ������ü�� ���� �ʴ´�.
	}
	
	
}
