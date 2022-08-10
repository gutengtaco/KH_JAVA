package com.kh.exception.controller;

// java.lang�� import������ �����Ǿ� ����.
import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	/*
	 * ���ܴ� Ŭ���� ����(���)������ �̷���� ����.
	 * 
	 * Unchecked Exception : ������ ���忡�� ������ �߻��� �� �ִ� ������ ������ ����. 
	 * RuntimeException Ŭ���� 
	 * ���α׷� ���� �� �߻��Ǵ� ���ܵ��� �θ�Ŭ����
	 * 1. ArrayIndexOutOfBoundException : �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
	 * 2. NegativeArraySizeException : �迭�� ũ�⸦ ������ �������� �� �߻��ϴ� ����
	 * 3. ClassCastException : ����� �� ���� ����ȯ�� ����� ��� �߻��ϴ� ����
	 * => �������� ������ ��, ��Ӱ��谡 �ƴ� Ŭ�������� ĳ������ �� ��
	 * => Parent - child1�� �ƴ�, child1 - child2�� ĳ������ �� ���
	 * 4. NullPointerException : �ּҰ��� ���� null�ӿ��� �ұ��ϰ�, �����ϰ����� �� �߻��ϴ� ����.
	 * 5. ArithmeticException : ������ ���� �� 0���� ������ �߻��ϴ� ����
	 * 
	 * => RuntimeException�� ���õ� ���ܵ��� ����� ������ ������ ��Ȳ�̱⋚����
	 * 	  ����ó���� ���� �ʰԲ� ������ ���ǹ�(if��)���� �ذ� ������(����)
	 * => ���� ����ó��(���ܰ� �߻������� ������ ������ ����)�� �� �ʿ� ����.
	 */
	
//	�ʵ��
//	Scanner ��ü�� �Ź� �޼ҵ帶�� �����ϴ� ���� �ƴ�, ���������� �����صΰ� ������ ��
	/*default*/ Scanner sc = new Scanner(System.in);
	
	public void method1() {
//		ArithmeticException : ������ ���� ��, 0���� ������ �߻��ϴ� ����
		
//		����ڷκ��� �ΰ��� �������� �Է¹޾� ������ ���� ����� ���
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		/*
//		���1. ���ǹ����� ó��(����ó��X)
		if(num2 != 0) {	// ������ ����
			System.out.println("������ ���� ��� : "+(num1/num2));
		}else {	// 0���� �������ٰ� �˷���
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		System.out.println("���α׷� ����");
		*/
		
//		���2. ����ó���������� �ذ�(���ܰ� �߻����� ��츦 ����Ͽ� ������ ������ �̸� ������.)
		/*
		 * try ~ catch��
		 * [ǥ����]
		 * try {
		 * 		 ���ܰ� �߻��ҹ��� ����;
		 * } catch(�߻��ɿ���Ŭ���� ������ => �Ű�����){
		 * 		 �ش� ���ܰ� �߻��� ���, ������ ����
		 * }
		 */
		try {
			System.out.println("������ ���� ��� : "+(num1/num2));
		}catch(ArithmeticException e) {
//			��� �� ������ �����ϸ� => �̹� ������ �߻���.
			System.out.println("0���� ���� �� �����ϴ�.");
			
//			������ ��������.
//			���� ���ܰ� �߻��� ������ �� �� ����.
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}
	
	public void method2() {
		System.out.print("�����Է� (0 ����) : ");
		try {
		int num = sc.nextInt();	// ���� �̿��� �� �Է½�, InputMismatchException�߻�
		sc.nextLine();
		
		System.out.println("������ ��� : "+(10/num)); // 0�� ���, ArithmeticException�߻�
		
		}catch(InputMismatchException e) {
			System.out.println("������ �Է��ؾ� �մϴ�.");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
//		���� catch�� : ���ܰ� ������ �߻��� ���ɼ��� �ִ� ���, �� ����� ����ŭ catch���� �ۼ� ����
		System.out.println("���α׷��� �����մϴ�.");
	}
	public void method3() {
//		ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� ������ �� �߻��ϴ� ����
//		NegativeArraySizeException : �迭�� ũ�⸦ ������ ������ ��� �߻��ϴ� ����.
		System.out.print("�迭�� ũ�� : ");
		int size = sc.nextInt();
		sc.nextLine();
//		�迭�� �Ҵ��ϱ� ��, if������ ������ ���� �ʰ� ���ڴ�.
//		if(size >= 0) {
//			int[] arr = new int[size];
//		}else {
//			System.out.println("�迭�� ũ��� ������� �մϴ�.");
//		}
		/*
		try {
			int[] arr = new int[size];
//			ũ�Ⱑ ������ �� �����߻�
			System.out.println("100��° �ε����� : "+arr[100]);
//			size�� 100���Ͻ� ���� �߻�(�������ε��� = �ε���ũ��-1)
			
		}catch(NegativeArraySizeException e) { // �ش� catch���� ����ȴٸ� try~catch������ ��������.
//			�� �������� �ش� ������ �߻���.
			System.out.println("�迭�� ũ��� ������� �մϴ�.");
			
		}catch(ArrayIndexOutOfBoundsException e) {
//			�� �������� �ش� ������ �߻���.
			System.out.println("�������� �ε����� �����Ͽ����ϴ�.");
		}
		*/
		
//		������ ����
		/*
		try {
			int[] arr = new int[size];
			System.out.println("100��° �ε��� �� : "+arr[100]);
			
		}catch(RuntimeException e) {
//			�������� �̿��Ͽ� �θ�Ÿ���� ����Ŭ������ catch���� �ۼ� ����
//			���� : catch���� ������ ���� �� ����.
//			���� : ��Ȯ�� � ������ �߻��ߴ��� �� �� ����.
			System.out.println("�迭�� ũ�⸦ ������ �Է��߰ų�, �������� �ε����� �����Ͽ����ϴ�.");
		}
		System.out.println("���α׷� ����");
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("100��° �ε��� �� : "+ arr[100]);
			
		}catch(NegativeArraySizeException e) {
			System.out.println("�迭�� ũ��δ� ������ ������ �� �����ϴ�.");
		}catch(RuntimeException e) {
			System.out.println("�迭�� ũ�⸦ ������ �Է��߰ų�, �������� �ε����� ��������.");
		}
//		���� catch ���� ��� ������ �߿���.
//		=> ��������� ������ ����Ÿ���� ����Ŭ������ �ش��ϴ� catch���� ���� �����.
//		=> ������ ū �θ�Ŭ������ ���� ����Ѵٸ�, �ڽ�Ŭ������ �ش��ϴ� catch������ Unreachable ������ �߻�.
		System.out.println("���α׷� ����");
	}
	/*
	 * RuntimeException ���õ� ������
	 * 1. ���ǹ����� �ذ� ���� : ���� ��ü�� �߻����� �ʰ� ���ִ�, �����ϴ� ȿ��
	 * 						     �����ڰ� �ҽ��ڵ�� ���ʿ� ��鸵�ϴ� ��(����ó��X)
	 * 							 ���ܰ� �߻��ϱ� ������ ��ó�� ���
	 * 2. ����ó���� �ذ� ���� : ���ܰ� �߻��� ������ ����ؼ�, �׶� ������ ������ �̸� �����صδ� ��.
	 * 							 ���ܰ� �߻��ϰ� ������ ��ó�� ���
	 * 
	 * RuntimeException == UncheckedException(���������� ����)
	 * ������ ������ ��Ȳ => ���ǹ����� �ذ��ϴ� ���� �� ����
	 * ������ �Ұ����� ��Ȳ => ����ó�� �������� �ذ��ؾ� ��.
	 * 
	 */
}
