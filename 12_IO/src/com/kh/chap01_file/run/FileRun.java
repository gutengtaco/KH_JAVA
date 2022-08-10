package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
//		간단하게 파일 만드는 과정 및 메소드 사용
//		java.io.File 클래스를 가지고 작업
		
//		1. 별도의 경로 지정없이 파일명만 제시해서 생성해보기
//		=> 현재 작업하고 있는 프로젝트 폴더 내에 파일이 생성
//		=> 상대경로 : 현재 위치한 곳을 기준으로, 나의 위치
		try {
			
			File file1 = new File("test.txt");
			file1.createNewFile();
//			Project에 refresh하면 test.txt가 생김.
			
//		2. 경로 지정을 한 파일명을 제시해서 생성해보기	
//		=> 경로의 폴더가 존재하지 않아 발생하는 오류 
//		=> 폴더를 만들어주면 잘 실행됨.	
//		=> 절대경로 : 최초의 시작점에서 경유한 경로를 전부 기입하는 방식
			File file2 = new File("C:\\aaa\\test.txt");
			file2.createNewFile();
			
//		3. 폴더도 만들고, 거기에 파일도 만드는 연습
			File bbbFolder = new File("C:\\bbb"); //폴더는 확장자가 붙지 않음.
			bbbFolder.mkdir(); // make directory
			File file3 = new File("C:\\bbb\\test.txt");
			file3.createNewFile();
			
//		4. 별도의 경로 지정없이 폴더를 생성 후 파일 생성하기
			File folder = new File("test"); // 프로젝트 내에 생성(상대경로)
			folder.mkdir();
			File file = new File("test\\person.txt"); // 상대경로
			file.createNewFile();
			
//		File클래스에서 제공하는 메소드들
			System.out.println("파일이 맞습니까? " + folder.isFile()); // false
			System.out.println("파일이 맞습니까? " + file.isFile()); // true
			System.out.println("파일명 : "+file.getName()); // person.txt
			System.out.println("상위폴더 : "+ file.getParent()); // test
			System.out.println("파일용량 : "+ file.length()); // 0
			System.out.println("절대경로 : "+ file.getAbsolutePath()); 
			//  C:\01_Java-workspace\12_IO\test\person.txt
			
		}catch(IOException e){
			e.printStackTrace(); // 오류를 추적해줌.
		}
		
		System.out.println("프로그램 종료");
		
	}

}

	/*
	 * 프로그램             외부매체
	 * 
	 * 소스코드(기준)       파일
	 *                      키보드
	 *                      모니터 
	 *                      DB
	 *                      
	 * 프로그램 상의 데이터를 외부매체(모니터, 스피커, 파일 등)로 출력하거나
	 * 입력장치(키보드, 마우스, 파일)로 입력받은 과정을 진행하고자 한다면
	 * 반드시 프로그램과 외부매체 사이의 "통로"를 만들어주어야 함.
	 * => 이 통로를 "Stream(스트림)"이라고 함.
	 * [특징]
	 * 1. 단방향 : 입력이면 입력, 출력이면 출력
	 * 			   입력용 스트림, 출력용 스트림이 따로따로 존재함.
	 *    		   입출력을 위해서는 적어도 2개의 스트림이 필요함.
	 * 2. 선입선출 : 먼저 전달한 값이 먼저 도달하게 됨(First In First Out : FIFO)
	 * 3. delay : 시간 지연 문제가 발생가능함. 
	 * 
	 * 스트림( 클래스 )구분
	 * 1. 통로의 사이즈로 구분
	 * >바이트 스트림(좁은) : 1byte짜리가 이동할 수 있을 정도의 사이즈
	 * (입력 : XXXInputStream / 출력 : XXXOutputStream)
	 * 
	 * >문자 스트림(넓은) : 2byte짜리가 이동할 수 있을 정도의 사이즈
	 * (입력 : XXXReader / 출력 : XXXWriter)
	 * 
	 * 2. 외부매체와 직접적인 연결 여부
	 * > 기반스트림 : 외부매체와 직접적으로 연결되는 통로
	 * 
	 * > 보조스트림 : 기반스트림만으로 부족한 성능을 향상시켜주는 용도의 통로
	 * => 단독으로 사용하지 못함.(외부매체와 직접적으로 연결되는 개념이 아님!)
	 */















