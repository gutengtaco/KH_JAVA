package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
//		파일에서 읽어들이기(입력)
//		=> 무작정 읽어들이는게 아닌, Properties객체를 만들어서 거기서 호출해야함.
		Properties prop = new Properties();
		Properties prop2 = new Properties();
		System.out.println(prop);
//		현재 비어있는 상태
		
//		읽어들이는 메소드 : load(InputStream is) 
//		=> 파일명은 존재하고 있는 파일을 정확히 제시해야 함.
		try {
//			.properties 확장자
			prop.load(new FileInputStream("Test.properties"));
			
//			.xml확장자(loadFromXML)
			prop2.loadFromXML(new FileInputStream("Test.xml"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
//		Test.properties의 내용물을 잘 읽어들임.
		System.out.println(prop2);
//		Test.xml의 내용물을 잘 읽어들임.
		
//		해당하는 Key의 value값 뽑아보기
//		getProperty(String key) : String value
		System.out.println(prop.getProperty("Map"));
		
			/*
			 * .properties파일(환경설정)을 사용하는 경우
			 * 해당 프로그램이 기본적으로 가져야 할 정보들을 .properties확장자 문서로
			 * 저장해주면 key - value 모두 문자열이기때문에
			 * 다루기 쉽고, 이해하기가 쉬움.(개발자, 일반관리자)
			 * 
			 * .xml파일을 사용하는 경우
			 * DB쿼리문처럼 긴 value를 담을 때 사용함.
			 * xml자체가 호환성이 좋기 때문에, 다른 프로그래밍 언어간의 호환이 가능함.
			 */
		
	}

}
