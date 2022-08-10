package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun {

	public static void main(String[] args) {
		
//		Properties : Map�迭(Key + value��Ʈ�� ����)
//		=> Properties�� Key, value�� ��� String���� ������.
//		=> ����������� ������.
		Properties prop = new Properties();
		
//		String�� �ƴ� ���� ������ ����.
//		=> Map�迭�̱� ������, put�޼ҵ�� Key+Value ��Ʈ�� ���� �� �ֱ� ��.
		prop.put("�����", new Snack("§��", 500));
		System.out.println(prop);
		System.out.println(prop.get("�����"));
		
//		��, �ַ� Properties�� ����ϴ� ���� Properties�� ����ִ�
//		Key + value�� ���ϵ�� ����ϰų�, ���Ͽ� ��ϵǾ� �ִ� Key+value�� ���������� �ϱ� ���ؼ�
//		�ַ� <String, String>���� ��.
		
//		���Ϸ� ����ϴ� ��� : Output(storeXXX �޼ҵ�)
//		���Ϸκ��� �������� ��� : Input(loadXXX�޼ҵ�)
		
		System.out.println("---------------------------------------------------------------------------");
		Properties prop2 = new Properties();
//		Properties�� ���׸� ������ �� �� ����(������ <String, String>�̱� ������)
		
//		�� �ֱ�
//		1, setProperties(String key, String value) : put�̶� ���� ����
		prop2.setProperty("List", "ArrayList");
		prop2.setProperty("Set", "HashSet");
		prop2.setProperty("Map", "HashMap");
		prop2.setProperty("Map", "Properties");
//		=> �ߺ��Ǵ� key���� �������� Value�� �������.
		System.out.println(prop2);
//		=> ���� ���� ����X , Key�� �ߺ�X
		
//		���Ϸ� ��������(���)
		try {
//		1. Store(OutputStream os,String comment)
//		=> Properties�� ��� key-value ��Ʈ���� .properties��� Ȯ������ ���Ϸ� ���
		prop2.store(new FileOutputStream("test.properties"), "Properties Test");
//		�ѱ۷� �ϸ� ���ڰ� ����. ����� �ؾ� �� ��µ�.
		
		
//		2. storeToXML(OutputStream os, String comments)
//		=> Properties�� ��� key-value��Ʈ���� .xml��� Ȯ������ ���Ϸ� ���
		prop2.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
		
		}catch(IOException e){
			e.printStackTrace();
		}
		

		
	}

}
