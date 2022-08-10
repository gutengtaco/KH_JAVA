package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
//	���α׷� ---> �ܺθ�ü(����)
//	���
	public void fileSave() {
//		���ڱ�� ��Ʈ��
//		FileWriter : ���Ϸ� �����͸� 2byte������ ������ִ� ��Ʈ��
		
//		0. �ڿ��ݳ��� ����Ͽ� �̸� ���� �� null�ʱ�ȭ
		FileWriter fw = null;
		
		try {
//		1. FileWriter ��Ʈ�� ��ü ����
//		����� ���, ���α׷� ---> �ܺθ�ü �̱� ������, ������ ��� ���� ����
//		(�˾Ƽ� ������ �����, ��ΰ� �����)
		fw = new FileWriter("b_char.txt");
		
//		2. 2byte ������ �����͸� ���Ϸ� ��½�Ű�� (�ѱ� ������)
//		write()�޼ҵ�
//		���ڱ�� ��Ʈ���� �ڿ��ݳ����� �����, ���Ϸ� �ش� ���ڰ� ��µ�.
//		(��� ���� ��, �������� ���� ������ ������ ����)
		fw.write('A');
		fw.write('��');
		fw.write("\n");
		fw.write("��..IO ��մ�..��");
//		���ڴ� �ѱ��ھ� �Ű���
//		�ٸ�, ���ڿ��� ������ �Ű����� ���ΰ�?
//		=> ���ڿ��� ���������� 1���ھ� �ɰ��� �̵���.(��/././I/O/ /��/��/��/././��)
		char[] cArr = {'k','i','w','i'};
		fw.write(cArr);
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
//				3. �� �� ��Ʈ�� �ڿ� �ݳ� 
//				close()�޼ҵ�
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
//	���α׷� <--- �ܺθ�ü(����)
//  �Է�
	public void fileRead() {
//		FileReader : ���Ϸκ��� �����͸� 2byte������ �Է¹޴� ��Ʈ��
		
//		0. FileReader ���� �� null�ʱ�ȭ
		FileReader fr = null;
		
		try {
//			1.FileReader ��ü ����
//			�Է��� ���, ���α׷� <--- �ܺθ�ü(����)�̱� ������ �����ϴ� ���� �̸��� �����־�� ��.
			fr = new FileReader("b_char.txt");
			
//			2.���Ϸκ��� �о���̱�
//			read()�޼ҵ�
//			System.out.println(fr.read());	// 65
//			System.out.println(fr.read());	// 44608 => �����ڵ�
//			System.out.println(fr.read());	// 10(Lf : LineFeed) : ����
//			read()�� ����������, �ҷ��� ���� ���� ��� -1�� ��ȯ��.
		
//			�ݺ��� Ȱ��
			/*
//			1. �������� �������� -1�� ������ �׶� ����.
			int value = 0;
			while(true) {
				value = fr.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
				
//			2. ���ǽ� �ȿ� ���Ա����� ���̾��¹��
			int value=0;
			while((value=fr.read()) != -1) {
				System.out.println(value);
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
//				3. �� �� ��Ʈ�� �ڿ� �ݳ�
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
