package com.kh.dimension.practice;

import java.util.Scanner;

public class DimentionPractice {
	public void practice3() {
		/*
		 * 3행 3열짜리 문자열 배열을 선언 및 할당하고
		 * 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여
		 * “(0, 0)”과 같은 형식으로 저장 후 출력하세요
		 * 
		 * 예시
		 * 
		 * (0, 0)(0, 1)(0, 2)      → [0][j]  
		 * (1, 0)(1, 1)(1, 2)    ↓
		 * (2, 0)(2, 1)(2, 2)  [i][0]
		 */
		int[][] arr = new int[3][3];
		//행의 길이만큼 움직임.(0행, 1행, 2행)
		for(int i=0; i<arr.length; i++) {
			arr[i][0] = i;
			//열의 길이만큼 움직임(0행의 1열, 2열, 3열)
			for(int j=0; j<arr[i].length;j++) {
				arr[0][j] = j;
				System.out.printf("(%d, %d)",arr[i][0], arr[0][j]);
			}
			System.out.println();
		}
	}
	public void practice1() {
		/*
		 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
		 * 1) 1 ~ 16까지 값을 차례대로 저장하세요.
		 * 2) 저장된 값들을 차례대로 출력하세요.
		 */
		int k=0;
		int[][] arr = new int[4][4];
		// 값 입력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				k++;
				arr[i][j] = k;
			}
		}
		// 값 출력
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
		// 값 입력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				k--;
				arr[i][j] = k;
			}
		}
		// 값 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice4() {
		/*
		 * 4행 4열 2차원 배열을 생성하여
		 * 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		 * 아래의 내용처럼 처리하세요.
		 * 
		 * 값(0,0) 값(0,1) 값(0,2)   0행값들의 합(0,3)
		 * 값(1,0) 값(1,1) 값(1,2)   0행값들의 합(1,3)
		 * 값(2,0) 값(2,1) 값(2,2)   0행값들의 합 (2,3)
		 * 
		 * 열(3,0) 열(3,1) 열(3,2)   값들의 합계(3,3)
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
		 * 2차원 배열의 행과 열의 크기를 사용자에게 직접 입력 받되, 
		 * 1~10사이 숫자가 아니면
		 * “반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		 * 크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		 * (char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타내고 90은 Z를 나타냄
		 * 
		 * ex.
		 * 행 크기 : 5
		 * 열 크기 : 4
		 * T P M B 
		 * U I H S 
		 * Q M B H 
		 * H B I X 
		 * G F X I 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		sc.nextLine();
		System.out.print("열 크기 : ");
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
		 * {{"이", "까", "왔", "앞", "힘"}, 
		 * {"차", "지", "습", "으", "냅"}, 
		 * {"원", "열", "니", "로", "시"}, 
		 * {"배", "심", "다", "좀", "다"}, 
		 * {"열", "히", "! ", "더", "!! "}};
		 * 
		 * 위의 초기화되어 있는 배열을 가지고 아래의 ‘[그림] 실습문제6 흐름’과 같은 방식으로 출력하세요.
		 * 단, print()를 사용하고 값 사이에 띄어쓰기(“ “)가 존재하도록 출력하세요.
		 * (한 줄로 다 출력)
		 */
		String[][] strArr = new String[][] 
		   {{"이", "까", "왔", "앞", "힘"}, 
			{"차", "지", "습", "으", "냅"},
			{"원", "열", "니", "로", "시"}, 
			{"배", "심", "다", "좀", "다"}, 
			{"열", "히", "!", "더", "!!"}};
		// 행 먼저 작용, 그다음 열
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
		 * 사용자에게 행의 크기를 입력 받고 
		 * 그 수만큼의 반복을 통해 각각 해당 행의 크기도 받아
		 * 문자형 가변 배열을 선언 및 할당하세요.
		 * 그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		 * 
		 * 행의 크기 : 4
		 * 0행의 크기 : 2
		 * 1행의 크기 : 6
		 * 2행의 크기 : 3
		 * 3행의 크기 : 5
		 * 
		 * a b 
		 * c d e f g h 
		 * i j k 
		 * l m n o p
		 * 
		 * 가변배열 선언 및 할당
		 * int[][] num = new int[4][]
		 * num[0] = new int[3];
		 * num[1] = new int[2];
		 * num[2] = new int[4];
		 * => 열의 크기가 가변적이기 때문에 행의 크기는 고정, 열의 크기는 비워줌.
		 */
		
		Scanner sc = new Scanner(System.in);
		int k=97; // 아스키코드표에서 'a'
		
		System.out.print("행의 크기 : ");
		int rowSize = sc.nextInt();
		sc.nextLine();
		
		char[][] chArr = new char[rowSize][]; 
		// 가변배열은 우선 행의 개수를 정하고
				
			for(int i=0; i<rowSize; i++) {
					System.out.printf("%d행의 크기 : ",i);
					int row = sc.nextInt();
					sc.nextLine();
					
					
					chArr[i]= new char[row]; 
					// 이후, 열의 개수를 정하여 가변적인 열을 가진 배열을 만들 수 있음.
					
					// 소문자'a'부터 열의 개수마다 문자 값을 대입.
					for(int j=0; j<row;j++) {
						chArr[i][j] = (char)k;
						k++;
					}
				}
		//값을 출력
		for(int i=0; i<chArr.length; i++) {
			for(int j=0; j<chArr[i].length;j++) {
				System.out.print(chArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void practice8() {
		/*
		 * 1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		 * 3행 2열로 2차원 배열 2개를 이용하여 분단을 나눠서 저장.
		 * 1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요.
		 * 
		 * <출석부>
		 * 1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
		 * 7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		 * 
		 * ex.
		 * == 1분단 ==
		 * 강건강 남나나
		 * 도대담 류라라
		 * 문미미 박보배
		 * == 2분단 ==
		 * 송성실 윤예의
		 * 진재주 차천축
		 * 피풍표 홍하하
		 * 
		 */
		int k=0;
		String[] adress = {"강건강","남나나","도대담","류라라","문미미","박보배"
				,"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
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
			System.out.println("== 1분단 ==");
			for(int i=0; i<group1.length; i++) {
				for(int j=0; j<group1[i].length; j++) {
					System.out.print(group1[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("==2분단 ==");
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
