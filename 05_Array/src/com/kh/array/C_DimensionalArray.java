package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {
	/*
	 * 2차원배열 : 1차원 배열을 여러개 묶은 개념.
	 */
	public void method1() {
//		1차원 배열이 계란 한줄이면
//		2차원 배열은 계란 한판에 해당함.
		
//		1차원 배열 선언
//		int[] arr1;
//		int arr1[];
		
		
//		[표현법]
//		1. 2차원배열의 선언
//		자료형[][] 배열명;
//		자료형[] 배열명[];
//		자료형 배열명[][];
		 
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
//		Stack : arr1, arr2, arr3
		
//		2. 2차원배열 할당(메모리영역의 공간 확보, 배열의 크기를 지정.)
//		배열명 = new 자료형[배열의크기(행,아래)][배열의크기(열,오른쪽)];
		arr3 = new int[2][3];
		
//		3. 2차원배열 선언과 동시에 할당
		int[][] arr = new int[3][5];
		
		System.out.println(arr); 
		// [[I@6d06d69c : 대괄호가 2개로 2차원배열을 나타냄
		// Stack영역에서 Heap영역의 arr[i]의 주소값을 참조함.
		
		System.out.println(arr[0]);
		// [I@7852e922 : 대괄호가 1개로 1차원배열을 나타냄
		// Heap영역에서 Heap영역의 arr[i][j]의 주소값을 참조함.
		
		System.out.println(arr[0][0]);
		// 0
		// Heap영역의 arr[i][j]에 해당하는 실제값을 참조함.
		
//		Stack : 0123 --> Heap : arr[0]{1234} ->  1234{0 0 0 0 0}
//		        arr   			arr[1]{2345} ->  2345{0 0 0 0 0}
//			                    arr[2]{3456} ->  3456{0 0 0 0 0}
//		                        0123		     arr[i][j] 1234,2345,3456
		
		/*
		 * 이차원 배열의 구조
		 * 우선적으로 주소값이 담긴 [행크기]만큼의 배열이 만들어지고,  
		 * 각각 담긴 주소값을 기준으로 [열크기]만큼의 배열로 연결되어서 
		 * 값을 찾아가는 구조
		 * 
		 * 해당 2차원 배열의 행크기를 아는 법
		 * => 2차원배열명.length
		 * 해당 2차원 배열의 열크기를 아는 법
		 * => 2차원배열명[해당열].length
		 */
		System.out.println("행의 길이 : "+arr.length); // 3
		// arr[]의 개수(행의 길이)를 반환함.
		System.out.println("0번째 행의 열의 길이 : "+arr[0].length); // 5
		System.out.println("1번째 행의 열의 길이 : "+arr[0].length); // 5
		System.out.println("2번째 행의 열의 길이 : "+arr[0].length); // 5
		// arr[] 하나의 열의 길이를 반환함. => arr[][]
		
		/*
		 * 출력
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
		 * 규칙 : 행수는 고정된 상태에서,
		 * 열수만 0에서부터 배열의 크기 전까지 1씩 증가함.
		 */
		System.out.println();
//		바깥쪽 for문 => 행수를 움직임
//		i가 3번 돌음(0,1,2) - 행의 길이만큼
		for(int i=0; i<arr.length;i++) {
//			안쪽 for문 => 열수를 움직임.
//			j가 5번 돌음(0,1,2,3,4) - 0번째 행의 열의 길이만큼
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
//		2차원 배열(행크기 : 3, 열크기 : 5)
		int[][] arr = new int[3][5];
		
//		순차적으로 반복을 돌리면서 값을 대입
//		[표현법]
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				값을 대입, 출력, 누적 등을 쓰면 됨.
//			}
//		}
		// 값 대입
		int value = 0;
		// 0,1,2 : 3번
		for(int i=0; i<arr.length; i++) { 
			// 0,1,2,3,4 : 5번
			for(int j=0; j<arr[i].length; j++) { 
				value++;
				arr[i][j]=value;
			}
		} // 총 15번 반복
		
		// 값 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%-2d ",arr[i][j] );
			}
			System.out.println();
		}
	}
	public void method3() {
//		1차원 배열의 선언과 동시에 초기화
//		int[] iArr = {1,2,3,4,5};
		
//		2차원 배열의 선언과 동시에 초기화
		int[][] iArr = {{1,2,3,4,5},
					   {6,7,8,9,10},
		               {11,12,13,14,15}};
//		출력
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.printf("%-2d ",iArr[i][j]);
			}
			System.out.println();
		}
	}
	public void method4() {
//		2행, 3열짜리 2차원 배열 
//		0번째 행은 국어점수
//		1번째 행은 수학점수를 입력받아봄
		Scanner sc = new Scanner(System.in);
		int[][] scores = new int[2][3];
		
//		값 대입
		for(int i=0; i<scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				if(i==0) { // 국어 점수
					System.out.print("국어 점수 : ");
				}else { // 수학 점수
					System.out.print("수학 점수 : ");
				}
				scores[i][j] = sc.nextInt();
				sc.nextLine();
			}
		}
		
		for(int i=0; i<scores.length; i++) {
			if(i==0) {
				System.out.print("국어 점수들 : ");
			}else {
				System.out.print("수학 점수들 : ");
			}
				for(int j=0; j<scores[i].length; j++) {
						System.out.print(scores[i][j]+" ");
				}
				System.out.println();
		}
	}
	public void method5() {
//		1차원 배열을 2개 만들어서
//		각각 국어점수, 수학점수를 입력받아
//		출력하기
		
//		1차원 배열 선언 및 할당
		Scanner sc = new Scanner(System.in);
		int[] korean = new int[3];
		int[] math = new int[3];
		
//		1차원 배열 값 대입
		for(int i=0; i<korean.length;i++) {
			System.out.print("국어 점수 : ");
			korean[i]=sc.nextInt();
			sc.nextLine();
		}
		for(int j=0; j<korean.length;j++) {
			System.out.print("수학 점수 : ");
			math[j]=sc.nextInt();
			sc.nextLine();
		}
//		1차원 배열 값 출력
		System.out.print("국어 점수들 : ");
		for(int i=0; i<korean.length; i++) {
			if((i+1)%3==0) {
				System.out.print(korean[i]+" ");
			}else {
				System.out.print(korean[i]+", ");
			}
		}
		System.out.println();
		System.out.print("수학 점수들 : ");
		for(int j=0; j<korean.length; j++) {
			if((j+1)%3==0) {
				System.out.print(math[j]+" ");
			}else {
				System.out.print(math[j]+", ");
			}
		}
	}
//		이 외에도, 각각의 행의 열의 개수를 달리하는
//	 	가변배열이라는 것도 있음. 
	
}
				

