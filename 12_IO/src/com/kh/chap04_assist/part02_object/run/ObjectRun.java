package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_object.model.dao.ObjectsDao;

public class ObjectRun {

	public static void main(String[] args) {
//		ObjectDao od = new ObjectDao();
		/*
		����ڰ� ���ϴ� ���ϸ����� �Է¹޾�  �Ѱ��ֱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���ϸ��� �Է��ϼ��� : ");
		String fileName = sc.nextLine();
		od.fileSave(fileName);
//		��ü ������ ��ϵǾ� �־ ������������, �� ����� ����!!
		*/
//		od.fileRead(); // ����� �� ��µ�.
		ObjectsDao osd = new ObjectsDao();
		
//		osd.fileSave("Phones.txt");
//		������������, ���������� ���Ͽ� ��µ� ����.
		osd.fileRead();

	}

}
