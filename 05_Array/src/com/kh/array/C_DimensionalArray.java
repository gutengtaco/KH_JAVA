package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {
	/*
	 * 2�����迭 : 1���� �迭�� ������ ���� ����.
	 */
	public void method1() {
//		1���� �迭�� ��� �����̸�
//		2���� �迭�� ��� ���ǿ� �ش���.
		
//		1���� �迭 ����
//		int[] arr1;
//		int arr1[];
		
		
//		[ǥ����]
//		1. 2�����迭�� ����
//		�ڷ���[][] �迭��;
//		�ڷ���[] �迭��[];
//		�ڷ��� �迭��[][];
		 
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
//		Stack : arr1, arr2, arr3
		
//		2. 2�����迭 �Ҵ�(�޸𸮿����� ���� Ȯ��, �迭�� ũ�⸦ ����.)
//		�迭�� = new �ڷ���[�迭��ũ��(��,�Ʒ�)][�迭��ũ��(��,������)];
		arr3 = new int[2][3];
		
//		3. 2�����迭 ����� ���ÿ� �Ҵ�
		int[][] arr = new int[3][5];
		
		System.out.println(arr); 
		// [[I@6d06d69c : ���ȣ�� 2���� 2�����迭�� ��Ÿ��
		// Stack�������� Heap������ arr[i]�� �ּҰ��� ������.
		
		System.out.println(arr[0]);
		// [I@7852e922 : ���ȣ�� 1���� 1�����迭�� ��Ÿ��
		// Heap�������� Heap������ arr[i][j]�� �ּҰ��� ������.
		
		System.out.println(arr[0][0]);
		// 0
		// Heap������ arr[i][j]�� �ش��ϴ� �������� ������.
		
//		Stack : 0123 --> Heap : arr[0]{1234} ->  1234{0 0 0 0 0}
//		        arr   			arr[1]{2345} ->  2345{0 0 0 0 0}
//			                    arr[2]{3456} ->  3456{0 0 0 0 0}
//		                        0123		     arr[i][j] 1234,2345,3456
		
		/*
		 * ������ �迭�� ����
		 * �켱������ �ּҰ��� ��� [��ũ��]��ŭ�� �迭�� ���������,  
		 * ���� ��� �ּҰ��� �������� [��ũ��]��ŭ�� �迭�� ����Ǿ 
		 * ���� ã�ư��� ����
		 * 
		 * �ش� 2���� �迭�� ��ũ�⸦ �ƴ� ��
		 * => 2�����迭��.length
		 * �ش� 2���� �迭�� ��ũ�⸦ �ƴ� ��
		 * => 2�����迭��[�ش翭].length
		 */
		System.out.println("���� ���� : "+arr.length); // 3
		// arr[]�� ����(���� ����)�� ��ȯ��.
		System.out.println("0��° ���� ���� ���� : "+arr[0].length); // 5
		System.out.println("1��° ���� ���� ���� : "+arr[0].length); // 5
		System.out.println("2��° ���� ���� ���� : "+arr[0].length); // 5
		// arr[] �ϳ��� ���� ���̸� ��ȯ��. => arr[][]
		
		/*
		 * ���
		 * arr[0][0]
		 * arr[0][1]
		 * arr[0][2]
		 * arr[0][3]
		 * arr[0][4]
		 * ============
		 * arr[1][0]
		 * arr[1][1]
		 * arr[1][2]
		 * arr[1][3]
		 * arr[1][4]
		 * ============
		 * arr[2][0]
		 * arr[2][1]
		 * arr[2][2]
		 * arr[2][3]
		 * arr[2][4]
		 * 
		 * ��Ģ : ����� ������ ���¿���,
		 * ������ 0�������� �迭�� ũ�� ������ 1�� ������.
		 */
		System.out.println();
//		�ٱ��� for�� => ����� ������
//		i�� 3�� ����(0,1,2) - ���� ���̸�ŭ
		for(int i=0; i<arr.length;i++) {
//			���� for�� => ������ ������.
//			j�� 5�� ����(0,1,2,3,4) - 0��° ���� ���� ���̸�ŭ
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
//				if((j+1)%5==0) {
//					System.out.print(arr[i][j]);
//					System.out.println();
//				}else {
//					System.out.print(arr[i][j]+",");
//				}
			}
			System.out.println();
		}
		
	}
	public void method2() {
//		2���� �迭(��ũ�� : 3, ��ũ�� : 5)
		int[][] arr = new int[3][5];
		
//		���������� �ݺ��� �����鼭 ���� ����
//		[ǥ����]
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				���� ����, ���, ���� ���� ���� ��.
//			}
//		}
		// �� ����
		int value = 0;
		// 0,1,2 : 3��
		for(int i=0; i<arr.length; i++) { 
			// 0,1,2,3,4 : 5��
			for(int j=0; j<arr[i].length; j++) { 
				value++;
				arr[i][j]=value;
			}
		} // �� 15�� �ݺ�
		
		// �� ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%-2d ",arr[i][j] );
			}
			System.out.println();
		}
	}
	public void method3() {
//		1���� �迭�� ����� ���ÿ� �ʱ�ȭ
//		int[] iArr = {1,2,3,4,5};
		
//		2���� �迭�� ����� ���ÿ� �ʱ�ȭ
		int[][] iArr = {{1,2,3,4,5},
					   {6,7,8,9,10},
		               {11,12,13,14,15}};
//		���
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.printf("%-2d ",iArr[i][j]);
			}
			System.out.println();
		}
	}
	public void method4() {
//		2��, 3��¥�� 2���� �迭 
//		0��° ���� ��������
//		1��° ���� ���������� �Է¹޾ƺ�
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[2][3];
		
//		�� ����
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				if(i==0) { // ���� ����
					System.out.print("���� ���� : ");
				}else { // ���� ����
					System.out.print("���� ���� : ");
				}
				scores[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
		
		for(int i=0; i<scores.length; i++) {
			if(i==0) {
				System.out.print("���� ������ : ");
			}else {
				System.out.print("���� ������ : ");
			}
				for(int j=0; j<scores[i].length; j++) {
						System.out.print(scores[i][j]+" ");
				}
				System.out.println();
		}
	}
	public void method5() {
//		1���� �迭�� 2�� ����
//		���� ��������, ���������� �Է¹޾�
//		����ϱ�
		
//		1���� �迭 ���� �� �Ҵ�
		Scanner sc = new Scanner(System.in);
		int[] korean = new int[3];
		int[] math = new int[3];
		
//		1���� �迭 �� ����
		for(int i=0; i<korean.length;i++) {
			System.out.print("���� ���� : ");
			korean[i]=sc.nextInt();
			sc.nextLine();
		}
		for(int j=0; j<korean.length;j++) {
			System.out.print("���� ���� : ");
			math[j]=sc.nextInt();
			sc.nextLine();
		}
//		1���� �迭 �� ���
		System.out.print("���� ������ : ");
		for(int i=0; i<korean.length; i++) {
			if((i+1)%3==0) {
				System.out.print(korean[i]+" ");
			}else {
				System.out.print(korean[i]+", ");
			}
		}
		System.out.println();
		System.out.print("���� ������ : ");
		for(int j=0; j<korean.length; j++) {
			if((j+1)%3==0) {
				System.out.print(math[j]+" ");
			}else {
				System.out.print(math[j]+", ");
			}
		}
	}
//		�� �ܿ���, ������ ���� ���� ������ �޸��ϴ�
//	 	�����迭�̶�� �͵� ����. 
	
}
				

