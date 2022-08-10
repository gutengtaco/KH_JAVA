package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class PhoneRun {

	public static void main(String[] args) {
		System.out.println("-----��� �޴��� -----");
//		�޴����� � �׾Ƶΰ� �Ȱ�����? �ִ� ������ �� �ִ� ����� �� : 100
		Phone[] arr = new Phone[100];
//		�Ű����� �����ڸ� �̿��Ͽ�, �޴����� ���� �迭�� ��� ������ ��ť�� �ذ���.
		arr[0] = new Phone("������ s","10","�Ｚ",1200000); // 1�� ��� �ϼ� 
		arr[1] = new Phone("������","11","����",1300000);
		arr[2] = new Phone("�����ó�Ʈ","10","�Ｚ",1500000);
		arr[3] = new Phone("������ z�ø�","1","�Ｚ",1500000);
		arr[4] = new Phone("�̳�Ʈ","10","������",550000);
		arr[5] = new Phone("������","8","����",800000);
		arr[6] = new Phone("������","XR","����",1000000);
//		�츮�� ������ �޴����� �� 7�� / 100����� ���� ����
		System.out.println("���� ������ �޴��� ���");
		
//		�޴����� null�� �ƴ� ��쿡�� ����� ��ȸ�ǵ��� ��ġ��.
//		if(arr[i].getName() != null)
//		[�����޼���]
//		nullPointException
//		arr[7]���� �ּҰ��� ���������ʴµ�, getName()���� �����Ϸ��� �ؼ� ����.
//		[�ذ��]
//		arr[i]�� ����ִ� ���� null�� ��쿡�� continue��
//		null�� �ƴ� ��쿡�� ���� ����ϵ��� �ϰڴ�.
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) {
				System.out.println(arr[i].information());
			}else {
				continue;
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.print("�����ϰ� ���� ������ �Է��Ͻÿ�. : ");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.nextLine();
		System.out.print("����� �ø�� �Է��ϼ��� : ");
		String searchSeries = sc.nextLine();
//		��ġ�ϴ� ������ ������ ������
		int count = 0;
//		���° ���� �޴����� ������� ��Ƶ� ������ ����
		int pick = 0;
		for(int i=0; i<arr.length; i++) {
			
//			�� ��Ȳ���� �Ʊ�ó�� nullPointException�� �߻� ������.
//			=> ���ʿ� �񱳸� �ϱ� ��, �ѹ� �� ���ϸ� ��.
//			=> arr[i]��ü�� null���� �ƴ����� �Ǻ��ϰ� ���� ��.
			if(arr[i] == null) {
				continue;
			}else {
//				����, ������ �����ϴ� ����� �ø�� ���� �Է���.
				if(arr[i].getName().equals(searchName)&& 
						arr[i].getSeries().equals(searchSeries)) {
						System.out.println("�������");
						System.out.println(arr[i].information());
						count++; 
						pick = i;
						break;
				}
			}
		}
		
//		count���� 1�̸�? ã�� ������ ��ġ�� ��
//		�̷��� �ϸ� �� �˻���� ���� �� �� �ְ� ��.
//		count���� 0�̸�? ã�� ������ ���� ��.
		if(count == 0) {
			System.out.println("���� ã���ô� ��� ����� ��");
		}else {
			System.out.print("���� �����Ͻðڽ��ϱ�?(Y,N)");
			char answer = sc.nextLine().charAt(0);
			
			if(answer == 'Y') {
				System.out.println("������ ������ "+arr[pick].getPrice()+"�� �Դϴ�.");
//				�ǸŰ� �Ϸ�Ǹ�, �޴����� ������ �����ָ� ��.=> �ش� �迭 ���� ���� null�� �־� ó����.
				arr[pick] = null;
			}else {
				System.out.println("�ȳ��� ������.");
			}
		}
	}
}
 		

