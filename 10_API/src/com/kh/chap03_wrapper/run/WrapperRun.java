package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 * �ڷ��� => �⺻�ڷ���(8����), �����ڷ���(1����)
		 * �⺻�ڷ����� Stack�� �������� �ٷ� ��Ҿ���.
		 * �⺻�ڷ����� .�޼ҵ�() ȣ���� �Ұ���.
		 * �����ڷ����� Stack�� �ּҰ�, Heap�� �������� ��Ҿ���.
		 * �����ڷ����� .�޼ҵ�() ȣ���� ��������.
		 * 
		 * WrapperŬ����
		 * �⺻�ڷ����� ��ü�������� �������ִ� Ŭ������ WrapperŬ������� ��.
		 * 	
		 * �⺻�ڷ���	<------->	WrapperŬ����
		 * boolean					Boolean	
		 * char						Character
		 * byte 					Byte
		 * short 					Short
		 * int 						Integer
		 * long						Long
		 * float 					Float
		 * double					Double
		 * 
		 * => �⺻�ڷ����� WrapperŬ���� ���·� �ٲپ��ִ� �۾��� Boxing�̶�� ��.
		 * => WrapperŬ������ �⺻�ڷ������� �ٲپ��ִ� �۾��� UnBoxing�̶�� ��.
		 */
		
		int num1 = 10;
		int num2 = 15;
		
//		num1�� num2�� �������� ��¹��� ���ؼ� �˾ƺ��� �ʹٸ�?
		System.out.println(num1 == num2);
		
//		System.out.println(num1.equals(num2)); �⺻�ڷ����̶� ������ ��.
//		System.out.println(num1.hashCode()); �翬�� �ؽ��ڵ嵵 ������ ��.
//		=> �⺻�ڷ����� �޼ҵ带 ȣ���� �� ����.

//		�⺻�ڷ������� ��ü �ڷ����� �޼ҵ带 ������ ���� ������
//		=> WrapperŬ������ ��ȯ�Ͽ� ���.
		
//		�⺻�ڷ��� => Wrapper�ڷ���(Boxing)
		Integer i1 = num1;	// 10
		Integer i2 = num2; 	// 15
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode()); 	
		
		System.out.println(num1 < num2); // true(�Ϲ��ڷ����� ��Һ�)
		System.out.println(i1.compareTo(i2)); 
//		a.compareTo(b) : a�� b�� ���ؼ� a > b�̸� 1, a < b�̸� -1, ������ 0
//		=> ��ü�� �ٲٰ� �Ǹ�, �޼ҵ���� �̿��� �� ����.
		
//		Wrapper�ڷ��� => �⺻�ڷ���(UnBoxing)
		int num3 = i1;	// 10
		int num4 = i2;	// 15
		
		System.out.println(num3 == num4);
		System.out.println(num3 > num4);
		
		System.out.println("-----------------------------------------------------");
		
//		�⺻�ڷ��� <--------> String (�߿�)
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2); // 1015.3
		
//		1. String -> �⺻�ڷ��� : �Ľ��Ѵ�.
//		[ǥ����]
//		�ش� WrapperŬ������.parseXXX(��ȯ�� ���ڿ�);
//		.parstXXX()�޼ҵ�� static�� �پ��־� ��ü�� �������� �ʾƵ� ����� �� ����.
		
		int i = Integer.parseInt(str1);	//	"10" --> 10
//		str1�� ���ڿ��� int������ �ٲٰ�, �̸� int i�� ����.
		
		double d = Double.parseDouble(str2); // "15.3" --> 15.3
//		����������, str2�� ���ڿ��� double������ �ٲٰ�, �̸� double d�� ����.
		
		System.out.println(i+d);	//	 25.3
		
//		2. �⺻�ڷ��� -> String 
//		   10			 "10"
//		   15.3          "15.3"
//		[ǥ����]
//		String.valueOf(��ȯ�� �⺻�ڷ���); : String
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		System.out.println(strI+strD);
		
		
	}

}
