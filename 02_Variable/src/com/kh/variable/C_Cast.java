package com.kh.variable;

public class C_Cast {

	/*
	 * ����ȯ
	 * ���� �ڷ����� �ٲٴ� �����̴�.
	 * 
	 * ��ǻ�� �󿡼� �� ó�� ��Ģ
	 * 1. =(���Կ�����) �� �������� ���ʰ� �������� ���� �ڷ����̾�� �Ѵ�.
	 * => ��, ���� �ڷ����� �ش��ϴ� ���� ������ �����ϴ�.
	 * => �ٸ� �ڷ����� ���� �ְ� �ʹٸ�, "����ȯ"�� �ʿ��ϴ�.
	 * [ǥ����] �ڷ��� Variable�� = (�ٲ� �ڷ���)�� ;
	 *  
	 * 2. ���� �ڷ��������� ������ �����ϴ�.
	 * => �ٸ� �ڷ������� ������ �����ϰ� ������ "����ȯ"�� �ʿ��ϴ�.
	 * [ǥ����] �� + (�ٲ� �ڷ���)�� ; 
	 * 
	 * ����ȯ�� ����
	 * 1. �ڵ� ����ȯ : �ڵ����� ����ȯ�� �Ǿ�, �ڵ������ ���� ����ȯ �� �ʿ䰡 ����.
	 * 			        ���� byte�� ���� ū byte�� Variable�� ��� ���
	 *              ex) �޴���(����)�� ����� ����(ū)�� �ִ� ��� 
	 * 2. ���� ����ȯ : �ڵ� ����ȯ�� ������� �ʴ� ���, ���� ���� ����ȯ�� �ؾ��ϴ� ���
	 *              ū byte�� ���� ����byte�� Variable�� ��� ���
	 *              "����� ����ȯ" �̶�� �Ѵ�.
	 * [ǥ����] (�ٲ� �ڷ���)�ڷ����� �ٲٰ� ���� ��; 
	 * => ��������ȯ�� ǥ������ �����Ѵ�.
	 * => (�ٲ� �ڷ���) : ����ȯ ������, Cast�����ڶ�� �Ѵ�.
	 */
	
	// �ڵ� ����ȯ : ���� byte�� ���� ū byte�� Variable�� ���� ��� �߻��Ѵ�.
	public void autoCasting() {
		// �ڵ� ����ȯ�� �Ǵ� case
		
		/* 1. ������ int(4byte) -> �Ǽ��� double(8byte) */
		int i1 = 10;
		double d1 = i1;
		System.out.println("d1 : " + d1);
		// double d1 = (double)i1;
		// 10.0(10->10.0)�� ��µǴ� ���� �� �� �ִ�.
		int i2 = 12;
		double d2 = 3.3;
		double result2 = i2+d2;
		System.out.println("result2 : "+result2);
		// double result2 = (double)i2 + double d2;
		// 15.3(12.0 + 3.3)�� ��µǴ� ���� �� �� �ִ�.
		
		/* 2. ������ int(4byte) -> ������ long(8byte) */
		int i3 = 1000;
		long l3 = i3;
		// long l3 = (long)i3;
		long l4 = (long)2000; 
		// L�� ������ �ʾƵ� long���� �ڵ� ����ȯ�� �� ���̴�.
		// ������ �׳� ���ڸ� ���� int���� �ǹ��Ѵ�.
		System.out.println("l3 : "+l3); 
		System.out.println("l4 : "+l4);
		
		/* 3.[Ư�����̽�] ������ long(8byte) -> �Ǽ��� float(4byte) */
		// ������ �Ǽ��� ��ȯ�� ���, ū size�� ������ ���� size�� �Ǽ��� ��ȯ �����ϴ�.
		// �̴� 4byte float���� ��� 8byte long������ ���� �� �ִ� ���� ������ ũ�� �����̴�.
		long l5 = 1000000000;
		float f5 = l5;
		System.out.println("f5 : "+f5);
		// float f5 = (float)l5;
		// 1.0E9��� ���� ���´�.(1000000000.0)
		
		/* 4.[Ư�����̽�] ������ char(2byte) <---> ������ int(4byte) 
		   : ����� ����ȯ ����                                                                                 */
		char ch = 65;
		System.out.println("ch : " +ch); 
		// char ch = (char) 65;
		// 'A'��� ���� ���´�.
		int num = 'A';
		System.out.println("num : "+num);
		// int num = (int) 'A';
		// 65��� ���� ���´�.
		System.out.println((int)'��');
		/*
		 * [����] �ƽ�Ű �ڵ� ǥ
		 * �� ���ں��� ������ ���ڰ����� ��ġ�Ǽ� ǥ���Ǵ� ����
		 * (0~127 : ��ҿ�����, ����, Ư������)
		 * 'A' = 65 , 'a' = 97
		 * '��' = 44608
		 * [����] �����ڵ� ǥ
		 * �� ���ں��� ������ ���ڰ����� ��ġ�Ǽ� ǥ���Ǵ� ����
		 * �ƽ�Ű �ڵ��� Ȯ��� �����̶�� ���� �ȴ�.
		 * (0~65536 : ����, ����, Ư������, �� �̿��� ����)
		 */
		int sum = 'A' + 10;
		System.out.println("sum : " + sum);
		System.out.println("sum : " + (char)sum);
		// int sum = (int)'A' + 10; => 75��� ���� ���´�.
		// char sum = 'A' + (char)10; => K��� ���� ���´�.
		
		/* 5.[Ư�����̽�] byte����, short������ ���� */
		byte b1 = 1;
		byte b2 = 10;
		short s1 = 1;
		short s2 = 10;
		//byte result = b1 + b2;
		// [�����޼���]
		// Type mismatch: cannot convert from int to byte
		// byte�� short�� ����� ������� int(4byte)�� ����Ѵ�.
		byte result1 = (byte)(b1 + b2);
		short result11 = (short)(s1 + s2);
		System.out.println("result1 : "+result1);
		System.out.println("result11 : "+result11);
		// �̷��� b1+b2�� ������ ����� int���� byte������ �ٲپ� �ش�
		// (byte)b1 + (byte)b2�� �ϴ��� ���� ����� 11�� int���̱� ������
		// ����� ��ü�� byte�� ���� �ʴ� �̻��� ������ ���.
		// short�� ���������̴�.
		
	}
	// ����(�����) ����ȯ : ū ũ���� �ڷ����� ���� ũ���� �ڷ������� ����ȯ �� ���(����ȯ ������ ���)
	public void forceCasting() {
		// ���� ����ȯ�� �ؾ��ϴ� case
		// 1. double(8byte) -> float(4byte)
		float f1 = 4.0f;
		// [�����޼���]
		// Type mismatch: cannot convert from double to float
		// �� �ڿ� f�� �ٿ��ְų� �� �տ�(float)�� �ٿ���� �Ѵ�.
		double d2 = 8.0;
		float f2 = (float)d2;
		
		// 2. double(8byte) -> int(4byte)
		double d3 = 10.89;
		int i3 = (int)d3; // 10�� ���°�? 11�� ���°�? 
		System.out.println("i3 : "+ i3);
		// 10.89 -> 10�� ����.
		// [���ǻ���]
		// �������� �ս��� �Ͼ �� �ִ�.(���� ����ȯ�� ������!)
		// => �Ҽ��� �Ʒ� ������ ����Ǿ���.
		
		int iNum = 10;
		double dNum = 5.89;
		// int iSum = iNum + dNum;
		// iNum�� ��������� ū size�� double������ �ڵ���ȯ�� �ǰ�
		// dNum�� ���������� ������ �����̴�.
		// ��, 15.89��� double���� ���·�, int iSum�� ���� �� �����̴�.
		// [�ذ���]
		// 1. ���� ����� ������ ���� ����ȯ�� ���ش�.
		int iSum1 = (int)(iNum + dNum);
		System.out.println("iSum1 : "+iSum1); // 15��� ���� ���´�.
		// 2. ������ ���� ����� �ڷ����� �°� ���� ����ȯ�� ���ش�.
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : "+iSum2); // 15��� ���� ���´�.
		// 3. ����� �ڷ����� ���� ����� �°� ���� ����ȯ�� ���ش�.
		double iSum3 = iNum + dNum;
		System.out.println("iSum3 : "+iSum3); // 15.89��� ���� ���´�.
		
		/*
		 * ���� ����ȯ�� �ַ� �ϴ� ���
		 * ���� �߻��� : Type mismatch : cannot convert from ~ to ~...
		 */
	}
	
}
