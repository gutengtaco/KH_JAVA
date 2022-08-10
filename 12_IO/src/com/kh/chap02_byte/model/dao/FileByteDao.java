package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
// �����Ͱ� �����Ǿ��ִ� ������, ���� �����ؼ� �����͸� ��������ִ� �뵵�� Ŭ����
public class FileByteDao {
//	���α׷� --> �ܺθ�ü(����)
//	��� : ���α׷� ���� �����͸� ���Ϸ� ������(��, ���Ͽ� ����ϰڴ�)
	
	public void fileSave() {
//		����Ʈ��Ʈ��(ByteStream)	
//		FileOutputStream : "����"�� �����͸� 1byte������ ������ִ� ��Ʈ��.
//		������θ� ����ڴ� == ��Ʈ�� ��ü�� �����ϰڴ�.
		
		FileOutputStream fout = null; // null�� ����
		try {
			
//		1.FileOutputStream ��ü ����
//		=> �ش� "����"�� ���� ����Ǵ� 1byte¥�� ��ݽ�Ʈ���� ����ڴ�.
//		=> ��ü ���� ��, ������ ���ϸ��� �����ϵ�, �������� �ʴ� ���ϸ��� �����ϸ�
//		   �˾Ƽ� ������ �����ǰ�, ������ ������.
//		=> �����ϴ� ���ϸ��� �����ϸ�, ��θ� ��������� ������ ������.
//		=> throws IOException�̾, try~catch������ �ݵ�� ����� ��.
		fout = new FileOutputStream("a_byte.txt", true); // �ʱ�ȭ�� try�� �ȿ���
//		�ɼ� : true(�̾��� �Ͽ�, ������ ������ �ݺ��Ͽ� �ۼ���)
//			   false(�����, �⺻��)
		
//		2. ���� ��η� �����͵� ��� : Write()�޼ҵ� ���
//									   =>�Է� : read, ��� : write
//		=> 1byte���� : -128 ~ 127
//		=> �ƽ�Ű�ڵ�ǥ : 0 ~ 127
//		(��, ���Ͽ� ��ϵɶ��� �ش� ������ ������ ���ڰ� ��ϵ�.)
		fout.write(97); // 'a'�� ���
		fout.write('b'); // 'b'�� ���(����ȯ)
		fout.write('��'); // '@'�� ���(2byte�� ���ڰ� ����.)
//									   (����Ʈ��Ʈ���� �ѱ��� �������⿣ ������)
//		�����ε��� ���·� byte�迭�� �Ű������� ���޵� ����
//		������ int���� byte�迭�� �����ε�
		byte[] bArr = {99,100,101};
		fout.write(bArr); // 'c','d','e' ���
//		bArr�迭�� 1��° �ε������� 2���� ���� ��½�Ŵ.
		fout.write(bArr, 1, 2); // 'd', 'e' ���
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // � ���ܰ� �߻��ϴ���, �ݵ�� ������ ������ �ۼ���.
//		3. ��Ʈ���� �� �̿�������, �ڿ��� �ݳ���(���� ��θ� ���ڴ�) : �ݵ�� ����
//		=> close() �޼ҵ� ȣ��
			try {
			fout.close();
//			[�����޼���]
//			fout cannot be resolved
//			���������� ����ؼ� ����� ����
//			fout�� ���������� �������ָ� ��.
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
	
//	���α׷� <-- �ܺθ�ü(����)
//	�Է� : ���Ϸκ��� �����͸� ������
	public void fileRead() {
//		FileInputStream : ���Ϸκ��� �����͸� 1byte ������ �Է¹޴� ��Ʈ��.
		
//		�ڿ� �ݳ�(��β���.)�� ����� �̸� ���� �� null�ʱ�ȭ�� ����.
		FileInputStream fin = null;

		try {
//		1. FileInputStream ��ü ����(���� ��θ� ���ڴ�, �����Ű�ڴ�.)
//		FileOutputStream������ ���� ������ �����ص� �� ��.(���α׷� -> �ܺθ�ü)
//		FileInputStream������ ���� ������ �����ϸ� ������ ��.(���α׷�<- �ܺθ�ü)
//		=> ���� �����ϴ� ������ ���α׷����� �ҷ����� ���̱� ������. 
			fin = new FileInputStream("a_byte.txt");
			
//		2. ��η� �����͸� �о���� : read() �޼ҵ� ���
//		��, 1byte������ �о�� �� ����.
//		=> �ƽ�Ű�ڵ�ǥ ���� 	
//			System.out.println(fin.read()); // 97
//			System.out.println(fin.read()); // 98
//			System.out.println(fin.read()); // 64('��'�� �ƴ� @�� �ν�)
//			System.out.println(fin.read()); // 99
//			System.out.println(fin.read()); // 100
//			System.out.println(fin.read()); // 101
//			System.out.println(fin.read()); // 100
//			System.out.println(fin.read()); // 101
//			��� ���ڸ� �о�� ����
//			System.out.println(fin.read()); // -1
//			System.out.println(fin.read()); // -1
			/*
			while(true) {
				if(fin.read() != -1) {
					System.out.println(fin.read());
				}else{
					break;
				}
			}
			*/
//			������� 98, 99, 101, 101�� ����.
//			StringTokenizer��ʿ� �Ȱ���.
//			=> if���� read()�� ���� ������, ���ǿ� ������ ��, ��¹����� �ٽ��ѹ� read()������ ���� �� ����.
			
			/*
			�ذ��� 1
			int value = 0;
			while(true) {
				value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
//			�ذ��� 2
			int value = 0;
			while((value = fin.read()) != -1) {
				System.out.println(value);
			}
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			try {
//				3. ��Ʈ���� ��� �̿��� ��, �ڿ� �ݳ�(���� ����)
//				close() �޼ҵ� ���
				fin.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
		
}

