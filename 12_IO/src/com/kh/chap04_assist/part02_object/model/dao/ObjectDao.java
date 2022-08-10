package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
//	���α׷� ---> �ܺθ�ü(����)
//	���
	public void fileSave(String fileName) {
//		���Ϸ� ������ �׽�Ʈ Phone��ü ����
		Phone ph = new Phone("������",1000000);
		
//		������Ʈ�� ��ü�� try ~ with ~ resource ���� �ȿ��� ��ť�� ����
//		ObjectOutputStream : ��ü������ ���Ϸ� ��� �� �������ִ� ��Ʈ��
//		FileOutputStream : ���Ͽ� �����͸� ������ִ� ��Ʈ��
//		    ������Ʈ��											��ݽ�Ʈ��
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
//			��ü������ ���Ͽ� ������ִ� �޼ҵ�
//			writeObject();
			oos.writeObject(ph);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
//	��ݽ�Ʈ���� ����Ʈ��Ʈ��(Output)�̶� 1byte�ε� 
//	��ü ������ ����ȭ�Կ� ���� ���� �ߴµ�
//	���� ��θ� ���ؼ� �������� ���ڰ� ��������(���������� �Էµ� ���� ����)
	}
	
//	���α׷� <--- �ܺθ�ü(����)
//	�Է�
	public void fileRead() {
//		ObjectInputStream : ��Ʈ�����κ��� ��ü ������ �Է¹ޱ����� ���Ǵ� ������Ʈ��
//		FileInputStream : ���Ϸκ��� �����͸� �о���̱� ���ؼ� ���Ǵ� ��ݽ�Ʈ��
//			������Ʈ��										  ��ݽ�Ʈ��
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"))){
//																				�����̸� ��Ȯ��!
//			��ü������ �Է¹޴� ����
//			readObject();
			Phone ph = (Phone)ois.readObject();
			System.out.println(ph);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
//			   ������ ����ȯ�� ���� �ʾ��� �� �߻���.
			e.printStackTrace();
		}
	}

}
