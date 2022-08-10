package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		/*
		 * 보조스트림
		 * 기반스트림(외부매체와 직접 연결되는 통로)의 부족한 기능들을 확장
		 * 보조스트림은 단독 사용이 불가함(단독으로 객체 생성이 불가함)
		 * 
		 * [표현법]
		 * 보조스트림클래스명 객체명 = new 보조스트림클래스명(기반스트림 객체);

		 * 1. BufferedXXX : 속도 성능 향상 목적으로 사용됨.
		 * => 버퍼공간을 제공해서, 한번에 모아서 한꺼번에 입출력을 진행하는 구조로 이루어짐.
		 * 2. ObjectXXX : 객체 단위로 입출력을 할 수 있는 기능을 제공.
		 * 
		 * 보조스트림과 기반스트림의 결합기준
		 * 보조스트림 Reader / Writer계열이면, 기반스트림도 맞춰서 Reader/Writer계열
		 * 보조스트림 Input / Output계열이면, 기반스트림도 맞춰서 Input/ Output계열
		 */
		BufferedDao bd = new BufferedDao();
//		bd.fileSave();
		bd.fileRead();
		
	}

}
