package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun {

	public static void main(String[] args) {
		
//		Properties : Map계열(Key + value세트로 저장)
//		=> Properties는 Key, value를 모두 String으로 제한함.
//		=> 파일입출력을 지원함.
		Properties prop = new Properties();
		
//		String이 아닌 값도 들어갈수는 있음.
//		=> Map계열이기 때문에, put메소드로 Key+Value 세트로 넣을 수 있긴 함.
		prop.put("새우깡", new Snack("짠맛", 500));
		System.out.println(prop);
		System.out.println(prop.get("새우깡"));
		
//		단, 주로 Properties를 사용하는 경우는 Properties에 담겨있는
//		Key + value를 파일들로 기록하거나, 파일에 기록되어 있는 Key+value를 가져오고자 하기 위해서
//		주로 <String, String>으로 씀.
		
//		파일로 기록하는 경우 : Output(storeXXX 메소드)
//		파일로부터 가져오는 경우 : Input(loadXXX메소드)
		
		System.out.println("---------------------------------------------------------------------------");
		Properties prop2 = new Properties();
//		Properties는 제네릭 설정을 할 수 없음(어차피 <String, String>이기 때문에)
		
//		값 넣기
//		1, setProperties(String key, String value) : put이랑 같은 역할
		prop2.setProperty("List", "ArrayList");
		prop2.setProperty("Set", "HashSet");
		prop2.setProperty("Map", "HashMap");
		prop2.setProperty("Map", "Properties");
//		=> 중복되는 key값은 마지막의 Value로 덮어씌워짐.
		System.out.println(prop2);
//		=> 저장 순서 유지X , Key값 중복X
		
//		파일로 내보내기(출력)
		try {
//		1. Store(OutputStream os,String comment)
//		=> Properties에 담긴 key-value 세트들을 .properties라는 확장자의 파일로 출력
		prop2.store(new FileOutputStream("test.properties"), "Properties Test");
//		한글로 하면 글자가 깨짐. 영어로 해야 잘 출력됨.
		
		
//		2. storeToXML(OutputStream os, String comments)
//		=> Properties에 담긴 key-value세트들을 .xml라는 확장자의 파일로 출력
		prop2.storeToXML(new FileOutputStream("test.xml"), "Properties Test");
		
		}catch(IOException e){
			e.printStackTrace();
		}
		

		
	}

}
