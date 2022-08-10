package com.kh.chap02_objectArray.run;

import java.util.ArrayList;

import com.kh.chap02_objectArray.model.vo.Phone;

//	객체배열과 ArrayList를 비교해보기 위하여, 둘 다 써보았음.
public class ObjectArrayRun {

	public static void main(String[] args) {
		
//		1. 객체 배열 만들기 : 객체를 담을 수 있는 배열을 생성
//		- 선언과 동시에 할당
//		자료형[] 객체명 = new 자료형[크기]
		Phone[] arr = new Phone[3]; // 객체배열
//		배열 사용 준비 완료.
		/*
		System.out.println(arr);	// 주소값
		System.out.println(arr.length);	// 3
		System.out.println(arr[0]); // null
		*/
		ArrayList<Phone> list = new ArrayList<>(3);
//		stack			heap 
//		0123			null
//		arr				null	
//						null
//						0123
//						arr[i]  
		
		Phone p1 = new Phone(); // 객체
//		stack           heap
//		0123			null
//		p1				0123
		
		arr[0] = p1;
		list.add(p1);
//		얕은 복사
//		
//		stack			heap 
//		1111			arr[0]
//		arr		---->   2222	
//						 ↓
//						 ↓
//		2222             ↓ 
//		p1       --->   2222
		
		
		
		System.out.println(p1);
		System.out.println(list.get(0));
//		같은 주소값이 담김
		
		p1 = null;
		System.out.println(p1);
//		System.out.println(p1.information)을 하면 nullpointException이 뜸.
//		다만, p1이 null로 출력되는 것은, 아직 GC가 p1이라는 객체를 정리하지 않아서임.
//		System.out.println(arr[0]);
		
//		arr[0]이 의미하는 것 : phone 객체 1개
		/*
		arr[0].setName("갤럭시");
		arr[0].setBrand("삼성");
		arr[0].setPrice(1000000);
		*/
		list.get(0).setName("갤럭시");
		list.get(0).setBrand("삼성");
		list.get(0).setPrice(1000000);

//		System.out.println(arr[0].information());
		System.out.println(list.get(0).information());
		
//		arr[1] = new Phone("아이폰","11pro","애플",1000000);
		list.add(1, new Phone("아이폰","11pro","애플",1000000));
		
		/*
		System.out.println(arr[1]); // 주소값
		System.out.println(arr[1].information()); // 내용물이 나옴.
		*/
		System.out.println(list.get(1));
		System.out.println(list.get(1).information());
		
		System.out.println("---- 총 마무리 ----");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); // 주소값
		}
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
//		arr[2] = new Phone(); 
		list.add(new Phone());
		
		
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information()); // 실제값.
		}
		*/
//		향상된 for문
		for(Phone p : list) {
			System.out.println(p.information());
		}
		
//		stack				  heap 	
//		0123	->		1234   ->  name : 갤럭시, series : null, brand : 삼성, price : 1000000
//		arr				2345	   name : 아이폰, series : 11pro, brand : 애플, price : 1000000
//						3456       null
//						0123	   .information
//		                arr[i]     .getXXX
//									매개변수 생성자가 값으로 들어감.
//		위에서는 arr[0], arr[1]에 대해서만 객체를 생성하고 값을 대입했음.
//		따라서, arr[2]를 호출하면 nullPointException이 뜸.
//		이에, arr[2]를 객체로 생성해주면, arr[2]로부터 값을 호출할 수 있어
//		nullpointError가 뜨지 않음.
//		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i].information()); // 내용물
//		}
	}

}
