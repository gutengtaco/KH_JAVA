package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {
//	필드부
	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();
	
	
//	메소드부
	public void mainMenu() {
		System.out.println("==== 주차타워 관리 프로그램 ====");
		System.out.println("1. 차량 주차");
		System.out.println("2. 차량 출차");
		System.out.println("3. 주차된 차량 검색");
		System.out.println("4. 전체출력");
		System.out.println("0. 프로그램 종료");
		System.out.println("===============================");
		
		while(true) {
//				사용자가 입력한 메뉴 번호에 따라 화면에 출력
				System.out.print("원하시는 메뉴 번호를 입력해주세요 : ");
				int menu = sc.nextInt();
				sc.nextLine();
				switch(menu) {
				case 1 :
					insertCar();
					break;
				case 2 : 
					deleteCar();
					break;
				case 3 :
					searchCar();
					break;
				case 4 : 
					selectList();
					break;
				case 0 : 
					System.out.println("프로그램을 종료합니다.");
					return;
				default :
					System.out.println("없는 메뉴입니다. 다시 선택해주세요.");
				}
		}
	}
//	1. 차량 주차용 화면
//	현재 주차할 수 있는 주차 번호를 찾아봄.
	public void insertCar(){
		System.out.println();
		System.out.println("--- 차량 주차 ---");
//		차량번호, 차량종류, 차주이름(실질적인 자동차 정보)
		System.out.print("차량 번호 : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("차랑 종류(1.경차/2.세단/3.SUV/4.트럭) : ");
		int carType = sc.nextInt();
		sc.nextLine();
		
		System.out.print("차주 이름 : ");
		String owner = sc.nextLine();
		
//		요청 => Cotroller 메소드 호출
		ptc.insertCar(carNum,carType,owner);
		
		System.out.println("주차가 완료되었습니다.");
		System.out.println();
	}
//	2. 차량 출차용 화면
	public void deleteCar() {
		System.out.println();
		System.out.println("--- 차량 출차 ---");
		
//		출차 : 자동차 번호
		System.out.print("차량 번호 : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
//		요청 => Controller 메소드 호출
		int result = ptc.deleteCar(carNum);
		
		if(result >0) {
			System.out.println("출차가 완료되었습니다.");
		}else {
			System.out.println("해당 차량번호는 존재하지 않습니다.");
		}
		System.out.println();
		
	}
//	3. 주차된 차량 검색용 화면
	public void searchCar() {
		System.out.println();
		System.out.println(" --- 주차차량 검색 ---");
		System.out.print("차주명 검색 : ");
		String owner = sc.nextLine();
		
//		요청 => Controller에 요청
		ArrayList<Car> searched = ptc.searchCar(owner);
		if(searched.isEmpty()) {
			System.out.println("현재 해당 명의로 주차된 차량이 없습니다.");
		}else {
			System.out.println("해당 명의로 된 차량이 "+searched.size()+"대 존재합니다." );
			for(int i=0; i<searched.size(); i++) {
				System.out.println(searched.get(i));
			}
		}
		System.out.println();
		
	}
//	4. 전체 출력용 화면
	public void selectList() {
		System.out.println();
		System.out.println(" --- 전체 출력 --- ");
		
//		요청 => Controller 메소드에서 carList 전체 돌려받기
		ArrayList<Car> listAll = ptc.selectList();
		if(listAll.isEmpty()) {
			System.out.println("현재 주차된 차량이 없습니다.");
		}else {
			System.out.println("현재 주차된 차량이" + listAll.size() + "대 있습니다.");
			for(int i=0; i<listAll.size(); i++) {
				System.out.println(listAll.get(i));
			}
		}
		System.out.println();
	}
		
}

