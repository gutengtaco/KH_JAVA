package com.kh.practice.example;

import java.util.Scanner;

public class ArrayTest {
	public void practice1() {
		/*
		 * 길이가 10인 정수형 배열을 만들고 반복문을 이용하여
		 * 순서대로 배열 인덱스에 넣은 후 그 값을 다음과 같이 출력하세요
		 * 
		 * 1 2 3 4 5 6 7 8 9 10
		 */
		int[] arr = new int[10];
		for(int i=0; i<=9; i++) {
			arr[i] = (i+1);
			System.out.print(arr[i]+" ");
		}
	}
	public void practice2() {
		/*
		 * 길이가 10인 정수형 배열을 만들고 
		 * 반복문을 이용하여 역순으로 배열 인덱스에 넣은 후 그 값을 출력하세요.
		 * 10 9 8 7 6 5 4 3 2 1
		 */
		int[] arr = new int[10];
//		0 0 0 0 0 0 0 0 0 0(0~9) 길이 : 10
		for(int i=arr.length; i>0; i-- ) {
			arr[i-1]=i;
			System.out.print(arr[i-1]+" ");
		}
	}
	public void practice3() {
		/*
		 * 사용자에게 입력받은 양의 정수만큼
		 * 배열 크기를 할당하고
		 * 1부터 입력받은 값까지 배열에 초기화한 후 출력
		 * 
		 * 양의 정수 : 5
		 * 1 2 3 4 5
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		if(num>0) {
		// 배열 선언 및 할당
			int[] arr = new int[num];
				for(int i=0; i<arr.length; i++) {
					// 배열 초기화 및 값 대입
					arr[i] = i+1;
					System.out.print(arr[i]+" ");
				}
		}else {
			System.out.println("양의 정수의 값을 입력하세요.");
		}
		
	}
	public void practice4() {
		/*
		 * 길이가 5인 String배열을 선언하고 
		 * “사과”, “귤“, “포도“, “복숭아”, “참외“로 초기화 한 후
		 * 배열 인덱스를 활용해서 귤을 출력하세요
		 * 
		 * ex.
		 * 귤
		 */
		String[] arr = {"사과","귤","포도","복숭아","참외"};
		System.out.println(arr[1]);
	}
	public void practice5() {
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고
		 * 검색할 문자가 문자열에 몇 개 들어가 있는지
		 * 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		 * 
		 * 문자열 : application
		 * 문자 : i
		 * application에 i가 존재하는 위치(인덱스) : 4 8 
		 * i 개수 : 2
		 */
		Scanner sc = new Scanner(System.in);
//		문자열 및 문자 입력받기
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

//		문자를 하나하나 넣을 배열의 빈 공간 만들기
		char[] arr = new char[str.length()];
		int[] num = new int[arr.length];

//		문자를 하나하나 배열에 넣기
//		a p p l i c a t i o n
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
//		0 0 0 0 4 0 0 0 8 0 0 
		for(int i=0; i<num.length; i++) {
			if(arr[i]==ch) {
				num[i]=i;
			}
		}
//		문자열과 문자가 일치하는 인덱스 확인하기
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str,ch);
		for(int i=0; i<num.length; i++) {
				if(num[i]==0) {
					System.out.print(" ");
				}else {
					System.out.print(num[i]);
				}
		}
//		문자의 개수 찾기
		int sum = 0;
		for(int i=0; i<num.length;i++) {
			if(num[i]!=0) {
				sum++;
			}
		}
		System.out.println();
		System.out.printf("%c의 개수 : %d",ch,sum);
		
	}
	public void practice6() {
		/*
		“월“ ~ “일” (요일)까지 초기화된 문자열 배열을 만들고
		0부터 6까지 숫자를 입력 받아
		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요
		
		0 ~ 6 사이 숫자 입력 : 4 
		금요일 
		0 ~ 6 사이 숫자 입력 : 7
		잘못 입력하셨습니다
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] days = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		if(num>=0 && num<=6) {
			for(int i=0; i<days.length; i++) {
				if(num==i) {
					System.out.print(days[i]);
				}
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void practice7() {
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요
		 * 
		 * 정수 : 5
		 * 배열 0번째 인덱스에 넣을 값 : 4
		 * 배열 1번째 인덱스에 넣을 값 : -4
		 * 배열 2번째 인덱스에 넣을 값 : 3
		 * 배열 3번째 인덱스에 넣을 값 : -3
		 * 배열 4번째 인덱스에 넣을 값 : 2
		 * 4 -4 3 -3 2 
		 * 총 합 : 2
		 */
		
		Scanner sc = new Scanner(System.in);
//		정수
		System.out.print("정수 : ");
		int num = sc.nextInt();
		sc.nextLine();
//		입력받은 정수값 만큼 배열의 공간을 늘림.
		int[] arrNum = new int[num];
//		총합
		int sum = 0;
//			배열X번째 인덱스에 넣을 값을 입력 받기
			for(int i=0; i<arrNum.length; i++) {
				System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
				arrNum[i] = sc.nextInt();
				sc.nextLine();
				sum = sum+arrNum[i];
			}
//			결과 출력
			for(int i=0; i<arrNum.length; i++) {
				System.out.print(arrNum[i]+" ");
			}
			System.out.println();
			System.out.println("총합 : "+sum);
	}
	
	
	
	
	
	
	
	
	public void practice8() {
		/*
		 * 3이상인 홀수 정수를 입력 받아 
		 * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		 * 다시 정수를 받도록 하세요
		 * 
		 * 정수 : 4
		 * 다시 입력하세요.
		 * 정수 : -6
		 * 다시 입력하세요.
		 * 정수 : 5
		 * 1, 2, 3, 2, 1
		 */
		Scanner sc = new Scanner(System.in);
		for(;;) {
//			3을 입력했다고 가정.
			System.out.print("정수 : ");
			int num = sc.nextInt(); 	
//			num이 3이상이면서 홀수인 값을 입력받도록 함.
			if(num>=3 && num%2==1) {
				int[] numArr = new int[num+(num-1)]; // num+(num-1) = 5
//				오름차순 : 1, 2, 3 => num : 3
//				내림차순 : 2, 1 => num : 2
				
//				k를 대입하여 오름차순, 내림차순을 조절함.
				int k=1;
				
//				i=0,1,2
				for(int i=0; i<num; i++) {	
//					num[0] = 1
//					num[1] = 2
//					num[2] = 3
					numArr[i]=k;
					k++; 
				}
//				nunArr[i]=3, k=4;
//				i = 3,4
				for(int i=num; i<num+(num-1);i++) {
//					num[3] = 2
//					num[4] = 1
					numArr[i]=k-2; 
					k--;
				}
//				값을 출력
				for(int i=0; i<numArr.length; i++) {
					System.out.print(numArr[i]+" ");
				}
				break;
//			num이 3미만이면서 짝수인 값.
			}else {
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
	}
	public void practice9() {
		/*
		 * 사용자가 입력한 값이 배열에 있는지 검색하여
		 * 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요. 
		 * 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		 */
		Scanner sc = new Scanner(System.in);
		// 문자열 배열 선언과 동시에 초기화
		String[] menu = {"후라이드","양념","간장"};
		 
		for(int i=0;; i++) {
			System.out.print("메뉴 입력 : ");
			String userInput = sc.nextLine();
				if(menu[0].equals(userInput)||
				   menu[1].equals(userInput)||
				   menu[2].equals(userInput)) { // 존재하는 메뉴
						System.out.printf("%s 치킨 배달 가능\n",userInput);
				}else { // 존재하지 않는 메뉴
					System.out.printf("%s 치킨은 없는 메뉴입니다\n",userInput);
					break;
				}
		}
	}
	public void practice10() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요
		 * 
		 * 예시
		 * 9 7 6 2 5 10 7 2 9 6
		 */
		int[] arr = new int[10];
			for(int i=0; i<arr.length; i++) {
				int random = (int)((Math.random()*10)+1);
				arr[i] = random;
				System.out.print(arr[i]+" ");
			}
	}
	public void practice11() {
		/*
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		 * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
		 * 
		 * 		  5 3 2 7 4 8 6 10 9 10 
		 * 
		 * 최대값 : 5 5 5 7 7 8 8 10 10 10
		 * 최소값 : 5 3 2 2 2 2 2 2  2  2
		 * 		 */
		int[] arr = new int[10];
//			랜덤 값 대입
			for(int i=0; i<arr.length; i++) {
				int random = (int)((Math.random()*10)+1);
				arr[i] = random;
			}
//			5 3 2 7 4 8 6 10 9 10 
			int max = arr[0]; // 5
			int min = arr[0]; // 5
			
//			대소비교(최대값, 최소값)
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>max || arr[i]==10) { // i를 증가시키며 arr[0]과 비교하여 더 큰 값을 max에 대입
					max = arr[i];
				}else if(arr[i]<min || arr[i]==1) { // i를 증가시키며 arr[0]과 비교하여 더 작은 값을 min에 대입
					min = arr[i];
				}
			}
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("최대값 : "+max);
			System.out.println("최소값 : "+min);
	}
	public void practice12() {
		/*f
		 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		 * 1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요
		 * 
		 * arr1 : 1 1 8 3 9 5 7 3 10 5 
		 * k    : 1 
		 */

		int[] arr = new int[10];
//		i=0~9 
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*10)+1);

//			i=0 => X
//			i=1 => j=0;
//			i=2 => j=0,1
//			i=3 => j=0,1,2
//			...
//			i=7 => j=0,1,2,3,4,5,6
//			i=8 => j=0,1,2,3,4,5,6,7
//			i=9 => j=0,1,2,3,4,5,6,7,8
//			이전값(j)이 다음값(i)과 같으면 위치를 1 감소시켜 이전값(j)으로 돌아감
			for(int j=0; j<i ; j++) {
				if(arr[j] == arr[i]) {
				i--;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void practice13() {
		/*
		 * 주민등록번호를 String 문자열로 입력 받고
		 * 입력 받은 그 문자열을 각 인덱스 별 문자를
		 * char[]에 옮겨 담기 (단, 성별 자리 이후부터는 *로 담기
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String adress = sc.nextLine();
		
		char[] ch = new char[adress.length()];
		for(int i=0; i<9; i++) {
			ch[i] = adress.charAt(i);
		}
		for(int i=8; i<14; i++) {
			ch[i] = '*';
		}
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
	public void practice14() {
		/*
		 * 로또 번호 자동 생성기 프로그램을 작성하는데 
		 * 중복값 없이 오름차순으로 정렬하여 출력하세요.
		 * 
		 * 3 4 15 17 28 40
		 */
		int[] lotto = new int[6];

//		로또에 번호 대입
		for(int i=0; i<lotto.length; i++) {
			int random = (int)((Math.random()*50)+1);
			lotto[i] = random;
			
//				 X			: i=0
//			     j=0   		: i=1
//				 j=0,1		: i=2
//				 j=0,1,2  	: i=3
//				 j=0,1,2,3 	: i=4
//				 j=0,1,2,3,4  : i=5
//				이전값(j)이 다음값(i)과 같으면 위치를 1 감소시켜 이전값(j)으로 돌아감
				for(int j=0; j<i; j++) {
					if(lotto[j]==lotto[i]) {
						i--;
					}
					
//					box라는 변수를 이용하여
//					box에 lotto[i]를 넣고
//					lotto[i]자리에 lotto[j]를 넣고
//					lotto[j]자리에 기존의 lotto[i]를 넣는다.
					
//					예시
//					12 9 x x x
					
//					lotto[j](이전값) > lotto[i](다음값)
//					12 > 9
					
//					box = lotto[i]
//					box = 12
					
//					lotto[i] = lotto[j]
//					9 9 x x x 
					
//					lotto[j] = box;
//					9 12 x x x 
					if(lotto[i]<lotto[j]) {
						int box = lotto[i];
						lotto[i]=lotto[j];
						lotto[j] = box;
					}
				}
		}
		for(int i=0; i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
	}
}

	
	
















