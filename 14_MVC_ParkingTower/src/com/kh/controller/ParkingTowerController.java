package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Car;

public class ParkingTowerController {
		
	private ArrayList<Car> carList = new ArrayList<>();
// 	1. ���� ������ �޼ҵ�
	public void insertCar(int carNum, int carType, String owner) {
		
//		carList�� �߰��ϱ� ���� �����ؾ� �� ��!
//		Car ��ü�� �ϼ����Ѿ� ��!
//		(parkingNum�� ä���� ���·� �߰��ؾ� ��)
		
//		������ȣ : ������ ���� ������ȣ + 1
//		������ ���� ������ȣ�� �˷���, ������ �ε����� �˾ƾ� ��.
//		(size()-1)
		int parkingNum = 0;
		
		if(carList.isEmpty()) { // ���� ������ ������ �Ѵ뵵 ������
//			ù��° ���� �ڸ�(�ε��� : 0)
			parkingNum = 1;
		}else { 
//			���� ����Ʈ�� ������ �ε��� �ڸ��� ������ ���� ������ȣ +1
//			�ι�° ������ ���� �ڸ� 
			parkingNum = carList.get(carList.size()-1).getParkingNum()+1;
		}
//		���� ���
		Car car = new Car(parkingNum, carNum, carType,owner);
		carList.add(car);
	}
//	2. ���� ������ �޼ҵ�
	public int deleteCar(int carNum) {
//		1. ������� ���� ���� ����
		int result = 0;
//		2. �ݺ��� �̿��Ͽ� Ž��
		for(int i=0; i<carList.size(); i++) {
//			carNum�� ��ġ�Ѵٸ� ����
			if(carList.get(i).getCarNum()==carNum) {
				carList.remove(i);
				result++;
			}
		}
//		3. �˻��� �̷������ ����++;
		return result;
	}
//	3. ���� �˻��� �޼ҵ�
	public ArrayList<Car> searchCar(String owner){
//		1. ������� ������ ������ ����
		ArrayList<Car> searched = new ArrayList<>();
//		2. �ݺ� �������� �˻� ó�� : equals() ���
//		=> ���� ������ �˻��� ���ɼ��� �����Ƿ� searched�� �߰�
			for(int i=0; i<carList.size(); i++) {
				if(carList.get(i).getOwner().equals(owner)) {
					searched.add(carList.get(i));
				}
			}
//		3. ��� ����
			return searched;
	}
//	4. ��ü��¿� �޼ҵ�
	public ArrayList<Car> selectList(){
//		1. ������� ������ ������ ����
		ArrayList<Car> listAll = new ArrayList<>();
		
//		2. �ݺ� �������� �ʵ带 ��ȯ�ϱ�
		for(int i=0; i<carList.size(); i++) {
			listAll = carList;
		}
		return listAll;
		
	}
	
}

