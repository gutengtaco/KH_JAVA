package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		/*
		 * Date클래스
		 * java.util 패키지 안에 존재(Scanner, StringTokenizer, Date)
		 * 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * 자바 개발 초창기에 급하게 만든, 완성도가 높지 않은 클래스
		 */
		
//		기본생성자를 통해 Date.객체 생성 => 현재 날짜 및 시간을 가지고 옴.
		Date today = new Date();
		System.out.println("기본생성자 : " + today/*.toString()*/); 
//		Wed Mar 02 12:16:23 KST 2022
		
//		방법 1. 매개변수 생성자를 이용하여 만들기
//		내가 원하는 날짜 (2020년 6월 19일)
//		Date date1 = new Date(2020,6,19);
		
//		[경고메세지]
//		The constructor Date(int, int, int) is deprecated
//		사용이 권장되지는 않음.(언젠가는 안쓰게될)
		
//		System.out.println("매개변수생성자 : "+date1); 
//		Mon Jul 19 00:00:00 KST 3920
		
//		내부적으로 내가 전달한 년도 + 1900 => 세팅하고자 하는 년도-1900
//		내부적으로 내가 전달한 월 + 1 => 세팅하고자 하는 월 - 1
//		Date date1 = new Date(2020-1900, 6-1, 19);
//		System.out.println("매개변수생성자 : "+date1);
		
		Date date1 = new Date(2020-1900, 6-1, 19, 13,44,30);
		System.out.println("매개변수 생성자 : "+date1);
		
		
//		방법2. 추가적으로 내가 원하는 날짜를, 원하는 형식으로 지정하여 출력
//		"2020년 06월 19일 19시 15분 30초"
//		=> java.text.SimpleDateFormat를 사용
		
//		1. 형식을 지정하면서 SimpleDateFormat객체 생성(매개변수생성자 활용)
//		month와 minute가 겹치기때문에 월에는 대문자M, 분에는 소문자m
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
//		2. SimpleDateFormat클래스에서 제공하는 format()메소드로 호출
//		[표현법]
//		sdf.format(Date객체); : String
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
	}

}
