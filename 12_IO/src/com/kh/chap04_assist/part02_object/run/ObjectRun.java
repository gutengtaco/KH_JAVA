package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_object.model.dao.ObjectsDao;

public class ObjectRun {

	public static void main(String[] args) {
//		ObjectDao od = new ObjectDao();
		/*
		사용자가 원하는 파일명으로 입력받아  넘겨주기
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 파일명을 입력하세요 : ");
		String fileName = sc.nextLine();
		od.fileSave(fileName);
//		객체 단위로 기록되어 있어서 깨져보이지만, 잘 저장된 것임!!
		*/
//		od.fileRead(); // 결과가 잘 출력됨.
		ObjectsDao osd = new ObjectsDao();
		
//		osd.fileSave("Phones.txt");
//		깨져보이지만, 정상적으로 파일에 출력된 것임.
		osd.fileRead();

	}

}
