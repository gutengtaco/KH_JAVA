package com.kh.operator;

public class C_Compound {
	/*
	 * ���մ��Կ�����
	 * ��������ڿ� ���Կ����ڸ� �Բ� ����ϴ� �������̴�.
	 * 
	 * ����
	 * +=, -=, *=, /=, %=
	 * 
	 * ��� ����
	 * a += 3; => a = a + 3;
	 * a -= 3; => a = a + 3;
	 * a *= 3; => a = a + 3;
	 * a /= 3; => a = a + 3;
	 * a %= 3; => a = a + 3;
	 * ������ a��� Variable�� ���� 3�� '���Ͽ�' �ٽ� a�� '����'�Ѵ�.
	 * ������ a��� Variable�� ���� 3�� '����' �ٽ� a�� '����'�Ѵ�.
	 * ������ a��� Variable�� ���� 3�� '���ؼ�' �ٽ� a�� '����'�Ѵ�.
	 * ������ a��� Variable�� ���� 3�� '����� ��'�� �ٽ� a�� '����'�Ѵ�.
	 * ������ a��� Variable�� ���� 3�� '����� ������'�� �ٽ� a�� '����'�Ѵ�.
	 * 
	 */
	
	public void method1() {
		// ��������ڸ� �̿��Ͽ�
		// 3�� ������Ű��
		int num = 12;
		System.out.println("���� num : " + num);
		num = num + 3;
		System.out.println("������ num : " + num);
		
		// ���մ��Կ����ڸ� �̿��Ͽ� 
		// 3�� ������Ű��
		num += 3;
		System.out.println("�� ������ num : "+num);
		
		// 5�� ���ҽ�Ű��
		num -= 5;
		System.out.println("���ҵ� num : "+num);
		
		// 6�� ������Ű��
		num *= 6;
		System.out.println("�谡�� num : "+num);
		
		// 2�� ����� ���� ���ϱ�
		num /= 2;
		System.out.println("������ �� num : "+num);
		
		// 4�� ����� ������ ���ϱ�
		num %= 4; 
		System.out.println("������ ������ num : " + num);
		
		// +=�� ���, ���ڿ��� ���յ� ������ 
		String str = "Hello";
		str += "World";
		//str = str + "World";
		System.out.println(str);
		
	}
}
