package com.kh.chap02_objectArray.run;

import java.util.ArrayList;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {

		// 1. 객체배열 만들기 => Phone 형태의 객체만 담겠다.
		// 선언과 동시에 할당
		// 자료형[] 배열명 = new 자료형[크기];
		// Phone[] arr = new Phone[3];
		// 배열을 사용할 준비가 완료되었다.
		
		ArrayList<Phone> list = new ArrayList<>(3);
		// Phone 만 담을수 있는 ArrayList 객체
		
		/*
		System.out.println(arr); // 주소값
		System.out.println(arr.length); // 3
		System.out.println(arr[0]); // null
		*/
		
		Phone p1 = new Phone();
		
		// 배열의 얕은복사와 같은원리
		// arr[0] = p1;
		
		list.add(p1);
		
		// 같은값이 찍힘
		System.out.println(p1);
		// System.out.println(arr[0]);
		
		System.out.println(list.get(0));
		
		p1 = null;
		
		// System.out.println(arr[0]);
		
		// arr[0] 이 의미하는것 : phone 객체 1개
		/*
		arr[0].setName("갤럭시");
		arr[0].setBrand("삼성");
		arr[0].setPrice(1000000);
		*/
		
		list.get(0).setName("갤럭시");
		list.get(0).setBrand("삼성");
		list.get(0).setPrice(1000000);

		// System.out.println(arr[0].information());
		
		System.out.println(list.get(0).information());
		
		// arr[1] = new Phone("아이폰", "11pro", "애플", 1000000);
		
		list.add(1, new Phone("아이폰", "11pro", "애플", 1000000));
		
		/*
		System.out.println(arr[1]); // 주소값
		System.out.println(arr[1].information()); // 내용물
		*/
		
		System.out.println(list.get(1));
		System.out.println(list.get(1).information());
		
		System.out.println("---- 총 마무리 ----");
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // 주소값
		} 
		*/
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// arr[2] = new Phone(); // 이 구문을 추가했을 때 arr[2] 번째 방으로부터 메소드를 호출할 수 있다.
		
		list.add(new Phone());
		
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information()); // 내용물
		}
		*/
		
		// 향상된 for문
		for(Phone p : list) {
			System.out.println(p.information());
		}
	}
}
