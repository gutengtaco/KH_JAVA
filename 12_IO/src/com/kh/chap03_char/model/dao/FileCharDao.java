package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
//	프로그램 ---> 외부매체(파일)
//	출력
	public void fileSave() {
//		문자기반 스트림
//		FileWriter : 파일로 데이터를 2byte단위로 출력해주는 스트림
		
//		0. 자원반납에 대비하여 미리 선언 및 null초기화
		FileWriter fw = null;
		
		try {
//		1. FileWriter 스트림 객체 생성
//		출력의 경우, 프로그램 ---> 외부매체 이기 때문에, 파일이 없어도 제시 가능
//		(알아서 파일을 만들고, 통로가 연결됨)
		fw = new FileWriter("b_char.txt");
		
//		2. 2byte 단위로 데이터를 파일로 출력시키기 (한글 가능함)
//		write()메소드
//		문자기반 스트림은 자원반납까지 해줘야, 파일로 해당 문자가 출력됨.
//		(상속 관계 중, 구조상의 구문 문제인 것으로 추측)
		fw.write('A');
		fw.write('김');
		fw.write("\n");
		fw.write("와..IO 재밌다..ㅎ");
//		문자는 한글자씩 옮겨짐
//		다만, 문자열도 통으로 옮겨지는 것인가?
//		=> 문자열도 마찬가지로 1글자씩 쪼개서 이동됨.(와/././I/O/ /재/밌/다/././ㅎ)
		char[] cArr = {'k','i','w','i'};
		fw.write(cArr);
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
//				3. 다 쓴 스트림 자원 반납 
//				close()메소드
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
//	프로그램 <--- 외부매체(파일)
//  입력
	public void fileRead() {
//		FileReader : 파일로부터 데이터를 2byte단위로 입력받는 스트림
		
//		0. FileReader 선언 및 null초기화
		FileReader fr = null;
		
		try {
//			1.FileReader 객체 생성
//			입력일 경우, 프로그램 <--- 외부매체(파일)이기 떄문에 실존하는 파일 이름을 적어주어야 함.
			fr = new FileReader("b_char.txt");
			
//			2.파일로부터 읽어들이기
//			read()메소드
//			System.out.println(fr.read());	// 65
//			System.out.println(fr.read());	// 44608 => 유니코드
//			System.out.println(fr.read());	// 10(Lf : LineFeed) : 개행
//			read()도 마찬가지로, 불러올 값이 없을 경우 -1을 반환함.
		
//			반복문 활용
			/*
//			1. 무한으로 돌려놓고 -1이 나오면 그때 관둠.
			int value = 0;
			while(true) {
				value = fr.read();
				if(value == -1) {
					break;
				}
				System.out.println(value);
			}
			*/
				
//			2. 조건식 안에 대입구문도 같이쓰는방법
			int value=0;
			while((value=fr.read()) != -1) {
				System.out.println(value);
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
//				3. 다 쓴 스트림 자원 반납
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
