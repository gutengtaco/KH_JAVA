package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
//	BufferedReader / BufferedWriter
//	���α׷� ---> �ܺθ�ü(����)
//	���(BufferedWriter)
	public void fileSave() {
//		0. ��ü ���� �� null�� �ʱ�ȭ
		BufferedWriter bw = null;
		FileWriter fw = null;
		try{
//			1. ��ݽ�Ʈ�� ��ü ����
//			=> ������Ʈ���� �ܵ����� ����� �Ұ��ؼ� ��ݽ�Ʈ���� �̿���.
			fw  = new FileWriter("c_buffer.txt");
			
//			2. ������Ʈ�� ��ü ����
			bw = new BufferedWriter(fw);
			
//			3. ���Ϸ� ������ ��������
//			BufferedWriterŬ������ �ִ� write()�޼ҵ� ���
			bw.write("�ȳ��ϼ���");
//			bw.write("\n");
			bw.newLine(); // �ڵ����� �������ִ� �޼ҵ�
			bw.write("�ݰ����ϴ�\n");
			bw.write("����������");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
//				3.�ڿ� �ݳ����ֱ�
//				�ڿ��ݳ��� ���� : ��ü ������ ��������
				bw.close();
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * ���۽�Ʈ���� �켱 ���ۿ� ���ڿ��� �����̷� ������ ��,
	 * Write()�� ������ ���, ���ۿ� �ִ� �����̸� ���Ϸ� �����.
	 */
	
	
//	���α׷� <--- �ܺθ�ü(����)
//	�Է�(BufferedReader)
	public void fileRead() {
//		0.�ڿ� �ݳ��� ���� ���� �� �ʱ�ȭ
//		BufferedReader br = null;
//		
//		1. ������Ʈ�� ��ü�� ����(�Ű������� ��ݽ�Ʈ���� ��ť�� �־��!)
//		try {
//		br = new BufferedReader(new FileReader("c_buffer.txt"));
//		
//		2. �����͸� ���Ϸκ��� �о�鿩���� : readLine();
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		
//		}catch(FileNotFoundException e){
//			e.printStackTrace();
//		}catch(IOException e) {
//			
//			e.printStackTrace();
//			
//		}finally {
//			
//			3. �ڿ� �ݳ��ϱ�
//			try {
//			br.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		try ~ with ~ resource����(JDK 7�������� ��� ����)
		/*
		 * [ǥ����]
		 * try(��Ʈ�� ��ü��������; ��ü ��������){
		 * 		//���ܰ� �߻��ҹ��� ����
		 * }catch(���� ���𱸹�){
		 * 		//���ܹ߻��� ������ ����
		 * 
		 * }
		 * => ���� ū ������ �˾Ƽ� �ڿ� �ݳ��� ��
		 * 
		 */
//			������Ʈ��								��ݽ�Ʈ��
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
