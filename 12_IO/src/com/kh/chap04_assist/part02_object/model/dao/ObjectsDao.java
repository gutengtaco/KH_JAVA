package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

// 	��ü�迭�� ArrayList�� �Ѵ� �Ẹ����
public class ObjectsDao {
	/*
// 	 *  Phone[] arr = new Phone[3];	
	 *	public ObjectsDao(){
	 *  
	 *		�⺻�����ڸ� ���� ��ü ���� ��, 
	 *  	�� �ѹ� �����ϰ� ���� ������ ���� �� ����.
	 *  	arr[0] = new Phone("������",1000000);
	 *		arr[1] = new Phone("������",1300000);
	 *		arr[2] = new Phone("�ø���",1500000);
	 *
	 * 	}
	 * 
	 */
	
//	Phone��ü�� ���� �� �ִ� ArrayList��ü ����
	ArrayList<Phone> phoneList = new ArrayList<>(3);
	public ObjectsDao() {
		phoneList.add(new Phone("������",1000000));
		phoneList.add(new Phone("������",1300000));
		phoneList.add(new Phone("�ø���",1500000));
		
	}
//	=> �迭�� ���� �����ϴ� ����, ArrayList�� �޼ҵ带 ȣ���Ͽ� ���� ����
	
	
//	���
	public void fileSave(String fileName) {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("������",1000000);
		arr[1] = new Phone("������",1300000);
		arr[2] = new Phone("�ø���",1500000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
//			�������⸸ ���ϸ� ��.
//			oos.writeObject(arr[0]);
//			oos.writeObject(arr[1]);
//			oos.writeObject(arr[2]);
			
			/*
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			*/
			
			
//			phoneList�κ��� ������ �ε����� �����ؼ� �����͸� ���
			for(int i=0; i<phoneList.size(); i++) {
				oos.writeObject(phoneList.get(i));
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
//	�Է�
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phones.txt"))) {
			while(true) {
				System.out.println(ois.readObject()/*.toString()*/);
//				readObject() �޼ҵ�� Object�������� ��ȯ����.
//				toString()�޼ҵ带 �̹� �������̵� �Ͽ���.
//				�������̵� ��, �������ε��� ���� ���� ����ȯ�� ���ص�, �ڽĸ޼ҵ带 ȣ����.
			}
//			[�����޼���]
//			EOFException(End of File) : IOException�� �ڽ�.
//			Checked�迭�̳�, ������ �� �ִ� ������
//			��������� �����µ� �� �������� �� �� �߻��ϴ� ����
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("������ ��� �о����ϴ�.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}
}
