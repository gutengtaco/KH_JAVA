package com.kh.chap04_assist.part01_buffered.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	
//	BufferedReader / BufferedWriter
//	프로그램 ---> 외부매체(파일)
//	출력(BufferedWriter)
	public void fileSave() {
//		0. 객체 선언 및 null로 초기화
		BufferedWriter bw = null;
		FileWriter fw = null;
		try{
//			1. 기반스트림 객체 생성
//			=> 보조스트림은 단독으로 사용이 불가해서 기반스트림을 이용함.
			fw  = new FileWriter("c_buffer.txt");
			
//			2. 보조스트림 객체 생성
			bw = new BufferedWriter(fw);
			
//			3. 파일로 데이터 내보내기
//			BufferedWriter클래스에 있는 write()메소드 사용
			bw.write("안녕하세요");
//			bw.write("\n");
			bw.newLine(); // 자동으로 개행해주는 메소드
			bw.write("반갑습니다\n");
			bw.write("저리가세요");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
//				3.자원 반납해주기
//				자원반납의 순서 : 객체 생성의 역순으로
				bw.close();
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	/*
	 * 버퍼스트림은 우선 버퍼에 문자열을 뭉텅이로 보관한 후,
	 * Write()가 끝나는 대로, 버퍼에 있는 뭉텅이를 파일로 출력함.
	 */
	
	
//	프로그램 <--- 외부매체(파일)
//	입력(BufferedReader)
	public void fileRead() {
//		0.자원 반납을 위해 선언 및 초기화
//		BufferedReader br = null;
//		
//		1. 보조스트림 객체를 생성(매개변수로 기반스트림을 한큐에 넣어보자!)
//		try {
//		br = new BufferedReader(new FileReader("c_buffer.txt"));
//		
//		2. 데이터를 파일로부터 읽어들여오기 : readLine();
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		
//		}catch(FileNotFoundException e){
//			e.printStackTrace();
//		}catch(IOException e) {
//			
//			e.printStackTrace();
//			
//		}finally {
//			
//			3. 자원 반납하기
//			try {
//			br.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		try ~ with ~ resource구문(JDK 7버전부터 사용 가능)
		/*
		 * [표현법]
		 * try(스트림 객체생성구문; 객체 생성구문){
		 * 		//예외가 발생할법한 구문
		 * }catch(예외 선언구문){
		 * 		//예외발생시 실행할 구문
		 * 
		 * }
		 * => 가장 큰 장점은 알아서 자원 반납이 됨
		 * 
		 */
//			보조스트림								기반스트림
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
