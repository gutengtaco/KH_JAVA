package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
//	프로그램 ---> 외부매체(파일)
//	출력
	public void fileSave(String fileName) {
//		파일로 내보낼 테스트 Phone객체 생성
		Phone ph = new Phone("아이폰",1000000);
		
//		보조스트림 객체를 try ~ with ~ resource 구문 안에서 한큐에 생성
//		ObjectOutputStream : 객체단위로 파일로 출력 시 보조해주는 스트림
//		FileOutputStream : 파일에 데이터를 출력해주는 스트림
//		    보조스트림											기반스트림
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
//			객체단위로 파일에 출력해주는 메소드
//			writeObject();
			oos.writeObject(ph);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
//	기반스트림이 바이트스트림(Output)이라 1byte인데 
//	객체 단위로 직렬화함에 따라 들어가긴 했는데
//	좁은 통로를 통해서 들어가버려서 문자가 깨져보임(정상적으로 입력된 것은 맞음)
	}
	
//	프로그램 <--- 외부매체(파일)
//	입력
	public void fileRead() {
//		ObjectInputStream : 스트림으로부터 객체 단위로 입력받기위해 사용되는 보조스트림
//		FileInputStream : 파일로부터 데이터를 읽어들이기 위해서 사용되는 기반스트림
//			보조스트림										  기반스트림
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d_object.txt"))){
//																				파일이름 정확히!
//			객체단위로 입력받는 구문
//			readObject();
			Phone ph = (Phone)ois.readObject();
			System.out.println(ph);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
//			   적절한 형변환을 하지 않았을 때 발생함.
			e.printStackTrace();
		}
	}

}
