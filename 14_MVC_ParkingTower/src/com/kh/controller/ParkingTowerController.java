package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {
		
	private ArrayList<Car> carList = new ArrayList<>();
// 	1. 차량 주차용 메소드
	public void insertCar(int carNum, int carType, String owner) {
		
//		carList에 추가하기 전에 생각해야 할 것!
//		Car 객체를 완성시켜야 함!
//		(parkingNum이 채워진 상태로 추가해야 함)
		
//		주차번호 : 마지막 차의 주차번호 + 1
//		마지막 차의 주차번호를 알려면, 마지막 인덱스를 알아야 함.
//		(size()-1)
		int parkingNum = 0;
		
		if(carList.isEmpty()) { // 현재 주차된 차량이 한대도 없으면
//			첫번째 주차 자리(인덱스 : 0)
			parkingNum = 1;
		}else { 
//			현재 리스트에 마지막 인덱스 자리에 주차된 차의 주차번호 +1
//			두번째 이후의 주차 자리 
			parkingNum = carList.get(carList.size()-1).getParkingNum()+1;
		}
//		차량 등록
		Car car = new Car(parkingNum, carNum, carType,owner);
		carList.add(car);
	}
//	2. 차량 출차용 메소드
	public int deleteCar(int carNum) {
//		1. 결과물을 담을 변수 세팅
		int result = 0;
//		2. 반복문 이용하여 탐색
		for(int i=0; i<carList.size(); i++) {
//			carNum이 일치한다면 삭제
			if(carList.get(i).getCarNum()==carNum) {
				carList.remove(i);
				result++;
			}
		}
//		3. 검색이 이루어지면 변수++;
		return result;
	}
//	3. 차량 검색용 메소드
	public ArrayList<Car> searchCar(String owner){
//		1. 결과값을 내보낼 변수를 세팅
		ArrayList<Car> searched = new ArrayList<>();
//		2. 반복 돌려가며 검색 처리 : equals() 사용
//		=> 차가 여러대 검색될 가능성이 높으므로 searched에 추가
			for(int i=0; i<carList.size(); i++) {
				if(carList.get(i).getOwner().equals(owner)) {
					searched.add(carList.get(i));
				}
			}
//		3. 결과 리턴
			return searched;
	}
//	4. 전체출력용 메소드
	public ArrayList<Car> selectList(){
//		1. 결과값을 내보낼 변수를 세팅
		ArrayList<Car> listAll = new ArrayList<>();
		
//		2. 반복 돌려가며 필드를 반환하기
		for(int i=0; i<carList.size(); i++) {
			listAll = carList;
		}
		return listAll;
		
	}
	
}

