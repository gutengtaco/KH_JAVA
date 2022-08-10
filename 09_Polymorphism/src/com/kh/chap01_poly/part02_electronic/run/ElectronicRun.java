package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
//		1. 다형성을 적용하기 전(ElectronicController1)
//		납품업체
		ElectronicController1 ec = new ElectronicController1();
		ec.insert(new Desktop("삼성","데스크탑",1200000,"GTX 1070"));
//					==> ec.insert(d);
//				 	==> Desktop d = new Desktop("삼성","데스크탑",1200000,"GTX 1070");
		ec.insert(new NoteBook("LG","그램",2000000,3));
		ec.insert(new Tablet("애플","아이패드",500000,false));
//		=>각각 데스크탑, 노트북, 태블릿 한대씩을 납품받음.
		
//		손님
//		가게에 있는 제품들을 조회
		
		Desktop d = ec.selectDesktop();
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
//		각각의 물건을 각각의 객체로 정의하여 이를 출력함.
//		=>매번 타입이 다르기때문에 한번에 배송을 받을수가 없음(부분배송)
		
//		System.out.println(ec.selectDesktop());
//		System.out.println(ec.selectNoteBook());
//		System.out.println(ec.selectTablet());
//		객체로 담지 않고 그냥 출력해도 됨.
		
//		2. 다형성을 적용한 후(ElectronicController2)
		ElectronicController2 ec2 = new ElectronicController2();
//		이 시점에서 객체생성으로, private Electronic[] elec = new Electronic[3];로 필드변수를 사용할 수 있음.
		
//		납품업체
//		Electronic any = (Electronic)new Desktop("삼성","데스크탑",1000000,"Gtx1070")
//		...
		ec2.insert(/*(Electronic)*/new Desktop("삼성","데스크탑",1000000,"Gtx1070"),0);
		ec2.insert(/*(Electronic)*/new NoteBook("LG","그렘",2000000,3), 1);
		ec2.insert(/*(Electronic)*/new Tablet("애플","아이패드",500000,false), 2);
//		창고가 가득참
		
//		고객
		System.out.println("===== 다형성 적용 후 =====");
//		물건을 창고에서 하나만 뽑아서 보여줬을 때
		System.out.println(ec2.select(0)/*.toString*/);
		
//		창고째로 다 샀을때
		Electronic[] elec = ec2.select();
		System.out.println("elec : "+ elec); // 주소값이 출력됨.
		System.out.println();
		for(int i=0; i<elec.length;i++) {
			System.out.println(elec[i]);
		}
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입의 객체배열로, 다양한 자식들을 묶어서 한번에 받아줄 수 있음.
		 * => 부모타입 하나만으로 다양한 자식 객체들을 다룰 수 있음.
		 * 2. 메소드의 매개변수나 반환형에 다형성을 적용하면, 메소드의 개수가 확 줄어듬(코드가 간결해짐)
		 */
		
	}
	

}
