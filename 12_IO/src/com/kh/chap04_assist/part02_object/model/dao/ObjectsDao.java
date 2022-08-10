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

// 	객체배열과 ArrayList를 둘다 써보았음
public class ObjectsDao {
	/*
// 	 *  Phone[] arr = new Phone[3];	
	 *	public ObjectsDao(){
	 *  
	 *		기본생성자를 통해 객체 생성 시, 
	 *  	단 한번 실행하고 싶은 내용을 적을 수 있음.
	 *  	arr[0] = new Phone("아이폰",1000000);
	 *		arr[1] = new Phone("갤럭시",1300000);
	 *		arr[2] = new Phone("플립폰",1500000);
	 *
	 * 	}
	 * 
	 */
	
//	Phone객체만 담을 수 있는 ArrayList객체 생성
	ArrayList<Phone> phoneList = new ArrayList<>(3);
	public ObjectsDao() {
		phoneList.add(new Phone("아이폰",1000000));
		phoneList.add(new Phone("갤럭시",1300000));
		phoneList.add(new Phone("플립폰",1500000));
		
	}
//	=> 배열은 값을 대입하는 형식, ArrayList는 메소드를 호출하여 값을 대입
	
	
//	출력
	public void fileSave(String fileName) {
		
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("아이폰",1000000);
		arr[1] = new Phone("갤럭시",1300000);
		arr[2] = new Phone("플립폰",1500000);
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
//			내보내기만 잘하면 됨.
//			oos.writeObject(arr[0]);
//			oos.writeObject(arr[1]);
//			oos.writeObject(arr[2]);
			
			/*
			for(int i=0; i<arr.length; i++) {
				oos.writeObject(arr[i]);
			}
			*/
			
			
//			phoneList로부터 각각의 인덱스에 접근해서 데이터를 출력
			for(int i=0; i<phoneList.size(); i++) {
				oos.writeObject(phoneList.get(i));
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
//	입력
	public void fileRead() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phones.txt"))) {
			while(true) {
				System.out.println(ois.readObject()/*.toString()*/);
//				readObject() 메소드는 Object형식으로 반환해줌.
//				toString()메소드를 이미 오버라이딩 하였음.
//				오버라이딩 시, 동적바인딩에 의해 굳이 형변환을 안해도, 자식메소드를 호출함.
			}
//			[오류메세지]
//			EOFException(End of File) : IOException의 자식.
//			Checked계열이나, 예측할 수 있는 오류임
//			파일출력이 끝났는데 더 뽑으려고 할 때 발생하는 오류
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("파일을 모두 읽었습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
