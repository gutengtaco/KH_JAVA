package com.kh.dimension.practice;

import java.util.Scanner;

public class DimentionPractice {
	public void practice3() {
		/*
		 * 3�� 3��¥�� ���ڿ� �迭�� ���� �� �Ҵ��ϰ�
		 * �ε��� 0�� 0������ 2�� 2������ ���ʴ�� �����Ͽ�
		 * ��(0, 0)���� ���� �������� ���� �� ����ϼ���
		 * 
		 * ����
		 * 
		 * (0, 0)(0, 1)(0, 2)      �� [0][j]  
		 * (1, 0)(1, 1)(1, 2)    ��
		 * (2, 0)(2, 1)(2, 2)  [i][0]
		 */
		int[][] arr = new int[3][3];
		//���� ���̸�ŭ ������.(0��, 1��, 2��)
		for(int i=0; i<arr.length; i++) {
			arr[i][0] = i;
			//���� ���̸�ŭ ������(0���� 1��, 2��, 3��)
			for(int j=0; j<arr[i].length;j++) {
				arr[0][j] = j;
				System.out.printf("(%d, %d)",arr[i][0], arr[0][j]);
			}
			System.out.println();
		}
	}
	public void practice1() {
		/*
		 * 4�� 4��¥�� ������ �迭�� ���� �� �Ҵ��ϰ�
		 * 1) 1 ~ 16���� ���� ���ʴ�� �����ϼ���.
		 * 2) ����� ������ ���ʴ�� ����ϼ���.
		 */
		int k=0;
		int[][] arr = new int[4][4];
		// �� �Է�
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				k++;
				arr[i][j] = k;
			}
		}
		// �� ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		
	}
	public void practice2() {
		int k=17;		
		int[][] arr = new int[4][4];
		// �� �Է�
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				k--;
				arr[i][j] = k;
			}
		}
		// �� ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice4() {
		/*
		 * 4�� 4�� 2���� �迭�� �����Ͽ�
		 * 0�� 0������ 2�� 2�������� 1~10������ ������ ���� �� ���� ��
		 * �Ʒ��� ����ó�� ó���ϼ���.
		 * 
		 * ��(0,0) ��(0,1) ��(0,2)   0�ప���� ��(0,3)
		 * ��(1,0) ��(1,1) ��(1,2)   0�ప���� ��(1,3)
		 * ��(2,0) ��(2,1) ��(2,2)   0�ప���� �� (2,3)
		 * 
		 * ��(3,0) ��(3,1) ��(3,2)   ������ �հ�(3,3)
		 * 
		 * 
		 */
		int[][] arr = new int[4][4];
		int[] sumRow = new int[4];
		for(int i=0; i<arr.length-1; i++) { 
			for(int j=0; j<arr[i].length-1; j++) {
//				i=0 ; j=0,1,2
//				i=1 ; j=0,1,2
//				i=2 ; j=0,1,2
				arr[i][j] = (int)((Math.random()*10)+1);
				sumRow[i]= sumRow[i]+arr[i][j];
			}
		}
		for(int i=0; i<arr.length-1; i++) { 
			for(int j=0; j<arr[i].length-1; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<arr.length; i++) { 
			System.out.print(sumRow[i]+" ");
			}
		}
		
	
	
	
	public void practice5() {
		/*
		 * 2���� �迭�� ��� ���� ũ�⸦ ����ڿ��� ���� �Է� �޵�, 
		 * 1~10���� ���ڰ� �ƴϸ�
		 * ���ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.�� ��� �� �ٽ� ������ �ް� �ϼ���.
		 * ũ�Ⱑ ������ ������ �迭 �ȿ��� ���� �빮�ڰ� �������� ���� �� �� ����ϼ���.
		 * (char���� ���ڸ� ���ؼ� ���ڸ� ǥ���� �� �ְ� 65�� A�� ��Ÿ���� 90�� Z�� ��Ÿ��
		 * 
		 * ex.
		 * �� ũ�� : 5
		 * �� ũ�� : 4
		 * T P M B 
		 * U I H S 
		 * Q M B H 
		 * H B I X 
		 * G F X I 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ũ�� : ");
		int row = sc.nextInt();
		sc.nextLine();
		System.out.print("�� ũ�� : ");
		int column = sc.nextInt();
		sc.nextLine();
		char[][] chArr = new char[row][column];
			for(int i=0; i<chArr.length; i++) {
				for(int j=0; j<chArr[i].length; j++) {
					int num = (int)((Math.random()*26)+65);
					chArr[i][j] = (char)(num);
				}
			}
			for(int i=0; i<chArr.length; i++) {
				for(int j=0; j<chArr[i].length; j++) {
					System.out.printf("%c ",chArr[i][j]);
				}
				System.out.println();
			}

	}
	public void practice6() {
		/*
		 * String[][] strArr = new String[][] 
		 * {{"��", "��", "��", "��", "��"}, 
		 * {"��", "��", "��", "��", "��"}, 
		 * {"��", "��", "��", "��", "��"}, 
		 * {"��", "��", "��", "��", "��"}, 
		 * {"��", "��", "! ", "��", "!! "}};
		 * 
		 * ���� �ʱ�ȭ�Ǿ� �ִ� �迭�� ������ �Ʒ��� ��[�׸�] �ǽ�����6 �帧���� ���� ������� ����ϼ���.
		 * ��, print()�� ����ϰ� �� ���̿� ����(�� ��)�� �����ϵ��� ����ϼ���.
		 * (�� �ٷ� �� ���)
		 */
		String[][] strArr = new String[][] 
		   {{"��", "��", "��", "��", "��"}, 
			{"��", "��", "��", "��", "��"},
			{"��", "��", "��", "��", "��"}, 
			{"��", "��", "��", "��", "��"}, 
			{"��", "��", "!", "��", "!!"}};
		// �� ���� �ۿ�, �״��� ��
		// (00) (01) (02) (03) (04)
		// (10)
		// (20)
		// (30)
		// (40)	
//			System.out.println(strArr.length);
//			System.out.println(strArr[0].length);
		for(int i=0; i<strArr.length;i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[j][i]+" ");
			}
		}
	}
	public void practice7() {
		/*
		 * ����ڿ��� ���� ũ�⸦ �Է� �ް� 
		 * �� ����ŭ�� �ݺ��� ���� ���� �ش� ���� ũ�⵵ �޾�
		 * ������ ���� �迭�� ���� �� �Ҵ��ϼ���.
		 * �׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
		 * 
		 * ���� ũ�� : 4
		 * 0���� ũ�� : 2
		 * 1���� ũ�� : 6
		 * 2���� ũ�� : 3
		 * 3���� ũ�� : 5
		 * 
		 * a b 
		 * c d e f g h 
		 * i j k 
		 * l m n o p
		 * 
		 * �����迭 ���� �� �Ҵ�
		 * int[][] num = new int[4][]
		 * num[0] = new int[3];
		 * num[1] = new int[2];
		 * num[2] = new int[4];
		 * => ���� ũ�Ⱑ �������̱� ������ ���� ũ��� ����, ���� ũ��� �����.
		 */
		
		Scanner sc = new Scanner(System.in);
		int k=97; // �ƽ�Ű�ڵ�ǥ���� 'a'
		
		System.out.print("���� ũ�� : ");
		int rowSize = sc.nextInt();
		sc.nextLine();
		
		char[][] chArr = new char[rowSize][]; 
		// �����迭�� �켱 ���� ������ ���ϰ�
				
			for(int i=0; i<rowSize; i++) {
					System.out.printf("%d���� ũ�� : ",i);
					int row = sc.nextInt();
					sc.nextLine();
					
					
					chArr[i]= new char[row]; 
					// ����, ���� ������ ���Ͽ� �������� ���� ���� �迭�� ���� �� ����.
					
					// �ҹ���'a'���� ���� �������� ���� ���� ����.
					for(int j=0; j<row;j++) {
						chArr[i][j] = (char)k;
						k++;
					}
				}
		//���� ���
		for(int i=0; i<chArr.length; i++) {
			for(int j=0; j<chArr[i].length;j++) {
				System.out.print(chArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void practice8() {
		/*
		 * 1���� �迭�� 12���� �л����� �⼮�� ������ �ʱ�ȭ �ϰ�
		 * 3�� 2���� 2���� �迭 2���� �̿��Ͽ� �д��� ������ ����.
		 * 1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� �� ������ �ڸ��� ��ġ�ϼ���.
		 * 
		 * <�⼮��>
		 * 1. ���ǰ� 2. ������ 3. ����� 4. ����� 5. ���̹� 6. �ں���
		 * 7. �ۼ��� 8. ������ 9. ������ 10. ��õ�� 11. ��ǳǥ 12. ȫ����
		 * 
		 * ex.
		 * == 1�д� ==
		 * ���ǰ� ������
		 * ����� �����
		 * ���̹� �ں���
		 * == 2�д� ==
		 * �ۼ��� ������
		 * ������ ��õ��
		 * ��ǳǥ ȫ����
		 * 
		 */
		int k=0;
		String[] adress = {"���ǰ�","������","�����","�����","���̹�","�ں���"
				,"�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		String[][] group1 = new String[3][2];
		String[][] group2 = new String[3][2];
			for(int i=0; i<group1.length; i++) {
				for(int j=0; j<group1[i].length; j++) {
					group1[i][j]=adress[k];
					k++;
				}
			}
			for(int i=0; i<group2.length; i++) {
				for(int j=0; j<group2[i].length; j++) {
					group2[i][j]=adress[k];
					k++;
				}
			}
			System.out.println("== 1�д� ==");
			for(int i=0; i<group1.length; i++) {
				for(int j=0; j<group1[i].length; j++) {
					System.out.print(group1[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("==2�д� ==");
			for(int i=0; i<group2.length; i++) {
				for(int j=0; j<group2[i].length; j++) {
					System.out.print(group2[i][j]+" ");
				}
				System.out.println();
			}
			
			
	}
	public void practice9() {
		
	}
}
