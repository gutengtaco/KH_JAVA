package com.kh.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {
//	�ʵ��
	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();
	
	
//	�޼ҵ��
	public void mainMenu() {
		System.out.println("==== ����Ÿ�� ���� ���α׷� ====");
		System.out.println("1. ���� ����");
		System.out.println("2. ���� ����");
		System.out.println("3. ������ ���� �˻�");
		System.out.println("4. ��ü���");
		System.out.println("0. ���α׷� ����");
		System.out.println("===============================");
		
		while(true) {
//				����ڰ� �Է��� �޴� ��ȣ�� ���� ȭ�鿡 ���
				System.out.print("���Ͻô� �޴� ��ȣ�� �Է����ּ��� : ");
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
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default :
					System.out.println("���� �޴��Դϴ�. �ٽ� �������ּ���.");
				}
		}
	}
//	1. ���� ������ ȭ��
//	���� ������ �� �ִ� ���� ��ȣ�� ã�ƺ�.
	public void insertCar(){
		System.out.println();
		System.out.println("--- ���� ���� ---");
//		������ȣ, ��������, �����̸�(�������� �ڵ��� ����)
		System.out.print("���� ��ȣ : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� ����(1.����/2.����/3.SUV/4.Ʈ��) : ");
		int carType = sc.nextInt();
		sc.nextLine();
		
		System.out.print("���� �̸� : ");
		String owner = sc.nextLine();
		
//		��û => Cotroller �޼ҵ� ȣ��
		ptc.insertCar(carNum,carType,owner);
		
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		System.out.println();
	}
//	2. ���� ������ ȭ��
	public void deleteCar() {
		System.out.println();
		System.out.println("--- ���� ���� ---");
		
//		���� : �ڵ��� ��ȣ
		System.out.print("���� ��ȣ : ");
		int carNum = sc.nextInt();
		sc.nextLine();
		
//		��û => Controller �޼ҵ� ȣ��
		int result = ptc.deleteCar(carNum);
		
		if(result >0) {
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("�ش� ������ȣ�� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		
	}
//	3. ������ ���� �˻��� ȭ��
	public void searchCar() {
		System.out.println();
		System.out.println(" --- �������� �˻� ---");
		System.out.print("���ָ� �˻� : ");
		String owner = sc.nextLine();
		
//		��û => Controller�� ��û
		ArrayList<Car> searched = ptc.searchCar(owner);
		if(searched.isEmpty()) {
			System.out.println("���� �ش� ���Ƿ� ������ ������ �����ϴ�.");
		}else {
			System.out.println("�ش� ���Ƿ� �� ������ "+searched.size()+"�� �����մϴ�." );
			for(int i=0; i<searched.size(); i++) {
				System.out.println(searched.get(i));
			}
		}
		System.out.println();
		
	}
//	4. ��ü ��¿� ȭ��
	public void selectList() {
		System.out.println();
		System.out.println(" --- ��ü ��� --- ");
		
//		��û => Controller �޼ҵ忡�� carList ��ü �����ޱ�
		ArrayList<Car> listAll = ptc.selectList();
		if(listAll.isEmpty()) {
			System.out.println("���� ������ ������ �����ϴ�.");
		}else {
			System.out.println("���� ������ ������" + listAll.size() + "�� �ֽ��ϴ�.");
			for(int i=0; i<listAll.size(); i++) {
				System.out.println(listAll.get(i));
			}
		}
		System.out.println();
	}
		
}

