package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 * Checked Exception : �ݵ�� ����ó���� ����� �ϴ� ���ܵ�
	 * (���� �Ұ����� ��Ȳ���� �߻�, �̸� ����ó�� ������ �ۼ���)
	 * => �ַ� �ܺθ�ü�� ����½� �߻�.
	 */
	
	public void method1() throws IOException{
		/*
		try {
			
		method2();
		
		}catch(IOException e) {
			
			System.out.println("���� �߻���");
			
		}
		*/
		method2();
	}
//						  CheckedException�� �߻��� ��Ȳ�� �ذ��ϱ� ����
//						  throws���� �߰�.
	public void method2() throws IOException {
//		Scanner sc = new Scanner(System.in);
		
//		Checked Exception ��Ȳ�� �����ϱ� ����
//		Scanner�� ���� Ű����� ���� �Է¹��� �� �ִ� ��ü�� �ϳ� ����
//		BufferedReader Ŭ�����κ��� ��ü ����(��, ���ڿ��θ� �Է��� ������)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�ƹ� ���ڿ��̳� �Է��Ͻÿ� : ");
//		String str = br.readLine(); // ���� ������ ����ڰ� �Է��� ���ڿ��� �Է¹ްڴ�.
//		[�����޼���]
//		Unhandled exception type IOException
//		�� �޼ҵ带 ȣ������ ��, IOException�� �߻��� ���� ������ ������ ������ �˷��� ��(���� ����)
//		=>Checked Exception�̶� ������ ����ó�� ������ ���־�� ��.
		/*
//		1. try ~ catch�� : �� �������� ���� ���ܸ� ó���ϰڴ� ��� ����
		try {
			
			String str = br.readLine(); // sc.nextLine()�� ���ӻ��� ����
			System.out.println("���ڿ��� ���� : "+str.length());
			
		}catch(IOException e){
			
//			���ܰ� ���� �߻��� �� ��.
			
			System.out.println("���� �߻���.");
			
		}
		*/
		
//		2. throws ������ �̿��ϱ�
//		throws : ���⼭ ���ܸ� ó���ϴ� ���� �ƴ�, �޼ҵ带 ȣ���� ������ ó���ϰԲ� ���ѱ�.
//		=> Checked, UnChecked �Ѵ� ����� �� ����.
//		=> ��, ���� ȣ���� ������ try ~ catch���� ���ڴ�.
//		=> readLine()�޼ҵ� ��ü���� throws IOException�� ����Ǿ� ����.
		String str = br.readLine();
		System.out.println("���ڿ��� ���� : "+str.length());
	}
	
	/*
	 * Runtime Exception(UnChecked) : ���� �߻� ����(�ش� �ڵ尡 ����Ǵٰ� �������� => ����ó���� �ʼ��� �ƴ� ��Ÿ�� ����
	 * Checked Exception : ���� �߻� ����(������ ����Ǵٰ� => �ݵ�� ����ó���� ������ϱ� ������ ���Ȼ� ������ ������ ����)
	 */
	
}
