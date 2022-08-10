package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DAO(Data Access Object)
// 데이터가 보관되어있는 공간과, 직접 접근해서 데이터를 입출력해주는 용도의 클래스
public class FileByteDao {
//	프로그램 --> 외부매체(파일)
//	출력 : 프로그램 내의 데이터를 파일로 보내기(즉, 파일에 기록하겠다)
	
	public void fileSave() {
//		바이트스트림(ByteStream)	
//		FileOutputStream : "파일"로 데이터를 1byte단위로 출력해주는 스트림.
//		연결통로를 만들겠다 == 스트림 객체를 생성하겠다.
		
		FileOutputStream fout = null; // null로 선언
		try {
			
//		1.FileOutputStream 객체 생성
//		=> 해당 "파일"과 직접 연결되는 1byte짜리 기반스트림을 만들겠다.
//		=> 객체 생성 시, 연결할 파일명을 제시하되, 존재하지 않는 파일명을 제시하면
//		   알아서 파일이 생성되고, 연결이 지어짐.
//		=> 존재하는 파일명을 제시하면, 통로만 만들어지고 연결이 지어짐.
//		=> throws IOException이어서, try~catch구문을 반드시 써줘야 함.
		fout = new FileOutputStream("a_byte.txt", true); // 초기화는 try문 안에서
//		옵션 : true(이어쓰기로 하여, 현재의 내용을 반복하여 작성함)
//			   false(덮어쓰기, 기본값)
		
//		2. 연결 통로로 데이터들 출력 : Write()메소드 사용
//									   =>입력 : read, 출력 : write
//		=> 1byte범위 : -128 ~ 127
//		=> 아스키코드표 : 0 ~ 127
//		(단, 파일에 기록될때는 해당 숫자의 고유한 문자가 기록됨.)
		fout.write(97); // 'a'가 기록
		fout.write('b'); // 'b'가 기록(형변환)
		fout.write('김'); // '@'가 기록(2byte라 글자가 깨짐.)
//									   (바이트스트림은 한글을 내보내기엔 부적합)
//		오버로딩된 형태로 byte배열을 매개변수로 전달도 가능
//		기존의 int에서 byte배열로 오버로딩
		byte[] bArr = {99,100,101};
		fout.write(bArr); // 'c','d','e' 기록
//		bArr배열의 1번째 인덱스부터 2개의 값을 출력시킴.
		fout.write(bArr, 1, 2); // 'd', 'e' 기록
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 어떤 예외가 발생하더라도, 반드시 실행할 구문을 작성함.
//		3. 스트림을 다 이용했으면, 자원을 반납함(연결 통로를 끊겠다) : 반드시 실행
//		=> close() 메소드 호출
			try {
			fout.close();
//			[오류메세지]
//			fout cannot be resolved
//			지역변수로 사용해서 생기는 문제
//			fout을 전역변수로 설정해주면 됨.
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
	
//	프로그램 <-- 외부매체(파일)
//	입력 : 파일로부터 데이터를 가져옴
	public void fileRead() {
//		FileInputStream : 파일로부터 데이터를 1byte 단위로 입력받는 스트림.
		
//		자원 반납(통로끊음.)을 대비해 미리 선언 및 null초기화를 해줌.
		FileInputStream fin = null;

		try {
//		1. FileInputStream 객체 생성(연결 통로를 열겠다, 연결시키겠다.)
//		FileOutputStream때에는 없는 파일을 제시해도 잘 됨.(프로그램 -> 외부매체)
//		FileInputStream때에는 없는 파일을 제시하면 오류가 뜸.(프로그램<- 외부매체)
//		=> 현재 실존하는 파일을 프로그램으로 불러오는 것이기 때문에. 
			fin = new FileInputStream("a_byte.txt");
			
//		2. 통로로 데이터를 읽어오기 : read() 메소드 사용
//		단, 1byte단위로 읽어올 수 있음.
//		=> 아스키코드표 참고 	
//			System.out.println(fin.read()); // 97
//			System.out.println(fin.read()); // 98
//			System.out.println(fin.read()); // 64('김'이 아닌 @로 인식)
//			System.out.println(fin.read()); // 99
//			System.out.println(fin.read()); // 100
//			System.out.println(fin.read()); // 101
//			System.out.println(fin.read()); // 100
//			System.out.println(fin.read()); // 101
//			모든 문자를 읽어온 상태
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
//			결과값이 98, 99, 101, 101로 나옴.
//			StringTokenizer사례와 똑같음.
//			=> if문의 read()에 값이 들어오고, 조건에 적용한 후, 출력문에서 다시한번 read()때문에 값이 또 들어옴.
			
			/*
			해결방법 1
			int value = 0;
			while(true) {
				value = fin.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
			
//			해결방법 2
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
//				3. 스트림을 모두 이용한 후, 자원 반납(연결 끊기)
//				close() 메소드 사용
				fin.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
		
}

