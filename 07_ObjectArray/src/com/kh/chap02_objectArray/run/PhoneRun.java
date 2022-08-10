package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class PhoneRun {

	public static void main(String[] args) {
		System.out.println("-----당신 휴대폰 -----");
//		휴대폰을 몇개 쌓아두고 팔것인지? 최대 보관할 수 있는 재고의 수 : 100
		Phone[] arr = new Phone[100];
//		매개변수 생성자를 이용하여, 휴대폰을 만들어서 배열에 담는 과정을 한큐에 해결함.
		arr[0] = new Phone("갤럭시 s","10","삼성",1200000); // 1대 재고 완성 
		arr[1] = new Phone("아이폰","11","애플",1300000);
		arr[2] = new Phone("갤럭시노트","10","삼성",1500000);
		arr[3] = new Phone("갤럭시 z플립","1","삼성",1500000);
		arr[4] = new Phone("미노트","10","샤오미",550000);
		arr[5] = new Phone("아이폰","8","애플",800000);
		arr[6] = new Phone("아이폰","XR","애플",1000000);
//		우리가 보유한 휴대폰은 총 7대 / 100대까지 보관 가능
		System.out.println("구매 가능한 휴대폰 목록");
		
//		휴대폰이 null이 아닌 경우에만 목록이 조회되도록 조치함.
//		if(arr[i].getName() != null)
//		[오류메세지]
//		nullPointException
//		arr[7]이후 주소값이 존재하지않는데, getName()으로 참조하려고 해서 생김.
//		[해결법]
//		arr[i]에 들어있는 것이 null인 경우에는 continue를
//		null이 아닐 경우에는 값을 출력하도록 하겠다.
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != null) {
				System.out.println(arr[i].information());
			}else {
				continue;
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.print("구매하고 싶은 기기명을 입력하시오. : ");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.nextLine();
		System.out.print("기기의 시리즈를 입력하세요 : ");
		String searchSeries = sc.nextLine();
//		일치하는 정보의 개수를 변수로
		int count = 0;
//		몇번째 방의 휴대폰을 골랐는지 담아둘 변수를 세팅
		int pick = 0;
		for(int i=0; i<arr.length; i++) {
			
//			이 상황에서 아까처럼 nullPointException이 발생 가능함.
//			=> 애초에 비교를 하기 전, 한번 더 비교하면 됨.
//			=> arr[i]자체가 null인지 아닌지를 판별하고 들어가면 됨.
			if(arr[i] == null) {
				continue;
			}else {
//				현재, 상점에 존재하는 기기명과 시리즈를 같이 입력함.
				if(arr[i].getName().equals(searchName)&& 
						arr[i].getSeries().equals(searchSeries)) {
						System.out.println("기기정보");
						System.out.println(arr[i].information());
						count++; 
						pick = i;
						break;
				}
			}
		}
		
//		count값이 1이면? 찾는 정보와 일치할 때
//		이렇게 하면 총 검색결과 값을 알 수 있게 됨.
//		count값이 0이면? 찾는 정보가 없을 때.
		if(count == 0) {
			System.out.println("현재 찾으시는 재고가 없어요 ㅠ");
		}else {
			System.out.print("정말 구매하시겠습니까?(Y,N)");
			char answer = sc.nextLine().charAt(0);
			
			if(answer == 'Y') {
				System.out.println("지불할 가격은 "+arr[pick].getPrice()+"원 입니다.");
//				판매가 완료되면, 휴대폰의 정보를 지워주면 됨.=> 해당 배열 방의 값에 null을 넣어 처리함.
				arr[pick] = null;
			}else {
				System.out.println("안녕히 가세요.");
			}
		}
	}
}
 		

