package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
//		���Ͽ��� �о���̱�(�Է�)
//		=> ������ �о���̴°� �ƴ�, Properties��ü�� ���� �ű⼭ ȣ���ؾ���.
		Properties prop = new Properties();
		Properties prop2 = new Properties();
		System.out.println(prop);
//		���� ����ִ� ����
		
//		�о���̴� �޼ҵ� : load(InputStream is) 
//		=> ���ϸ��� �����ϰ� �ִ� ������ ��Ȯ�� �����ؾ� ��.
		try {
//			.properties Ȯ����
			prop.load(new FileInputStream("Test.properties"));
			
//			.xmlȮ����(loadFromXML)
			prop2.loadFromXML(new FileInputStream("Test.xml"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
//		Test.properties�� ���빰�� �� �о����.
		System.out.println(prop2);
//		Test.xml�� ���빰�� �� �о����.
		
//		�ش��ϴ� Key�� value�� �̾ƺ���
//		getProperty(String key) : String value
		System.out.println(prop.getProperty("Map"));
		
			/*
			 * .properties����(ȯ�漳��)�� ����ϴ� ���
			 * �ش� ���α׷��� �⺻������ ������ �� �������� .propertiesȮ���� ������
			 * �������ָ� key - value ��� ���ڿ��̱⶧����
			 * �ٷ�� ����, �����ϱⰡ ����.(������, �Ϲݰ�����)
			 * 
			 * .xml������ ����ϴ� ���
			 * DB������ó�� �� value�� ���� �� �����.
			 * xml��ü�� ȣȯ���� ���� ������, �ٸ� ���α׷��� ���� ȣȯ�� ������.
			 */
		
	}

}
