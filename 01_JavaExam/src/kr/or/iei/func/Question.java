package kr.or.iei.func;

import java.util.Scanner;

public class Question {
	/*
	 * 사용자의 입력을 받아(가위, 바위, 보)
	 * 난수를 발생시켜 랜덤하게 가위, 바위, 보를 출력한다.
	 * 사용자의 입력과 난수를 비교하여
	 * 
	 * 가위바위보 게임을 구현하시오.
	 * exam1메소드에 기능을 작성한다.
	 */
	public void exam1() {
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		int equal = 0;
		
		System.out.println("***재미있는 가위바위보 게임***");
		for(int i=1; i<6; i++) { //for문 시작
			System.out.println(i +"번째 가위바위보 게임을 시작합니다.");
			System.out.print("가위 바위 보 중 한개를 입력하세요 : ");
			
			String me = sc.nextLine(); // 사용자가 "가위","바위","보"를 입력
			int meGame = 0;		// "가위","바위","보"를 숫자로 변환하기 위한 변수
				// "가위","바위","보"를 1,2,3으로 인식하게끔 if문 사용
				if(me.equals("가위")) {
					meGame = 1;
				}else if (me.equals("바위")) {
					meGame = 2;
				}else if (me.equals("보")) {
					meGame = 3;
				}else {
				}
				// 컴퓨터가 난수를 생성(1,2,3)하고 이를 "가위","바위","보"로 변환
				int computer = (int)(Math.random()*3+1);
				String computerGame = "";
				if(computer==1) {
					computerGame = "가위";
				}else if (computer==2) {
					computerGame="바위";
				}else if(computer==3) {
					computerGame="보";
				}
			// 가위바위보 승리, 패배, 무승부
		    // 가위, 바위, 보 무승부
			if((meGame ==1 && computer ==1)||(meGame ==2 && computer ==2)||(meGame ==3 && computer ==3) ) {
				System.out.println("당신은 "+me+" 를 냈습니다");
				System.out.println("컴퓨터는 "+computerGame+" 을 냈습니다.");
				System.out.println("비겼습니다.");
				System.out.println("----------------------------");
				equal++; //무승부를 할 때마다 equal을 1씩 증가시킴.
			// 가위, 바위, 보 패배 
			}else if((meGame ==1 && computer ==2)||(meGame ==2 && computer ==3)||((meGame ==3 && computer ==1)) ) {
				System.out.println("당신은 "+me+" 를 냈습니다");
				System.out.println("컴퓨터는 "+computerGame+" 을 냈습니다.");
				System.out.println("꽝! 당신이 졌습니다.");
				System.out.println("----------------------------");
				lose++; // 패배 할 때마다 lose를 1씩 증가시킴.
			// 가위, 바위, 보 승리
			}else if((meGame ==1 && computer ==3)||(meGame ==2 && computer ==1)||(meGame ==3 && computer ==2)) {
				System.out.println("당신은 "+me+" 를 냈습니다.");
				System.out.println("컴퓨터는 "+computerGame+" 을 냈습니다");
				System.out.println("짝짝! 당신이 이겼습니다.");
				System.out.println("----------------------------");
				win++; // 승리할 때마다 win을 1씩 증가시킴.
			// 잘못 입력 시, 해당 회차를 다시 반복함.
			}else {
				System.out.println("잘못된 입력입니다.");
				System.out.println("----------------------------");
				i--; //i의 값을 1 감소시켜 전 회차를 다시 진행함.
			}
			// 승리, 패배, 무승부의 누적값 계산
			if(i==5) {
				System.out.printf("다섯번의 게임 중 당신은 총 %d번 이겼습니다.\n",win);
				System.out.printf("다섯번의 게임 중 당신은 총 %d번 졌습니다.\n",lose);
				System.out.printf("다섯번의 게임 중 당신은 총 %d번 비겼습니다.\n",equal);
				System.out.println("가위 바위 보 게임을 종료합니다.");
		}//for문 종료
		}
		
	}
}
