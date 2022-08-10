package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 	View : 시각적인 요소를 담당하는 부분(사용자가 보게 될 화면과 같음).
//	프론트앤드에 해당됨.
//	화면에서의 입력과 출력을 담당함.
//	=>MVC 패턴중 V(View)에 해당됨.

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
//	메인화면 : 프로그램 실행 시, 제일 처음 보여지는 화면
	public void mainMenu() {
		// System.out.println 구문을 이용해서 적당히 꾸미기
		System.out.println("*********어서오세요*********");
		System.out.println("1. 새로운 곡 추가");
		System.out.println("2. 곡 전체 조회");
		System.out.println("3. 특정 곡 검색");
		System.out.println("4. 특정 곡 삭제");
		System.out.println("5. 특정 곡 수정");
		System.out.println("0. 프로그램 종료");
		
		while(true){
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		sc.nextLine();
			switch(menu) {
			case 1 : 
				insertMusic();
				break;
			case 2 : 
				selectMusicList();
				break;
			case 3 :
				searchMusic();
				break;
			case 4 :
				deleteMusic();
				break;
			case 5 :
				updateMusic();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다. 안녕히 가세요.");
				return;
			default : 
				System.out.println("없는 메뉴입니다. 다시 입력해주세요");
			}
		}
		
	}
	
//	입력, 출력메소드	
//	MusicController의 객체를 이용하여 값을 호출함.
//	1. 새로운 곡을 추가할 수 있는 화면
	public void insertMusic() {
		System.out.println("-- 1.새로운 곡 추가 --");
		System.out.print("곡명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수명 입력 : ");
		String artist = sc.nextLine();
//		이 시점까지 우리가 음악을 추가하고자 할 때, 필요한 정보들을 모두 입력받은 상태
		
//		요청 => Controller의 메소드를 호출(필요한 정보들을 매개변수로 넘길 것.)
		int result = mc.insertMusic(title,artist);
		if(result>0) {
			System.out.println("성공적으로 추가되었습니다.");
			System.out.println("추가된 곡은 " +result+"개 입니다.");
		}else {
			System.out.println("추가된 곡이 없습니다.");
		}
	
	}
//	2. 전체 곡을 조회할 수 있는 화면
	public void selectMusicList() {
		System.out.println("-- 2.곡 전체 조회 --");
//		요청 => Controller의 메소드를 호출
		ArrayList<Music> list = mc.selectMusicList();
		mc.selectMusicList();
		
		if(list.isEmpty()) {//만약 리스트에 노래가 없다면
			System.out.println("현재 존재하는 노래가 없습니다.");
		}else {//만약 리스트에 노래가 있다면
			System.out.println("현재 존재하는 노래는 총 " +list.size()+" 곡 입니다.");
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}
		
	}
//	3. 곡을 검색할 수 있는 화면
	public void searchMusic() {
		System.out.println("-- 3.특정 곡 검색 --");
		System.out.print("검색할 곡명 키워드 : ");
		String keyword = sc.nextLine();
		
//		요청=> Controller 메소드를 호출(검색어가 포함된 곡을 모두 찾아서 반환)
//		결과값이 0곡 ok / 결과값이 1곡 ok / 결과값이 2곡이상 ok
//		=> 2곡 이상일 가능성이 있으므로, ArrayList 타입으로 검색된 내용을 묶어서 반환.
		ArrayList<Music> searched = mc.searchMusic(keyword);
		if(searched.isEmpty()) {
			System.out.println("검색결과가 없습니다.");
		}else {
				for(Music m : searched) {
					System.out.println(m);
				}
				System.out.println("검색결과는 총 "+ searched.size() + "곡 입니다.");
		}
	
	}
//	4. 특정 곡을 삭제할 수 있는 화면
	public void deleteMusic() {
		System.out.println("-- 4.특정 곡 삭제 --");
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine().toLowerCase();
		
//		요청 => Controller 메소드를 호출(매개변수로 title을 넘겨줌)
//		추가적인 기능
//		삭제가 일어난 횟수를 메소드 반환값으로 돌려받을 것.
		int result = mc.deleteMusic(title);
		if(result>0) {
			System.out.println(result+"개의 곡이 삭제되었습니다.");
		}else {
			System.out.println("삭제된 곡이 없습니다.");
		}
	}
	public void updateMusic() {
		System.out.println("-- 5.특정 곡 수정 --");
//		수정 => 무엇을 어떻게 바꿀 것인지 제시해야 함.
//		기존 곡명, 수정할 곡명, 수정할 가수명
		System.out.print("기존 곡명 : ");
		String title = sc.nextLine().toLowerCase();
		System.out.print("수정 곡명 : ");
		String updateTitle = sc.nextLine().toLowerCase();
		System.out.print("수정 가수명 : ");
		String updateArtist = sc.nextLine().toLowerCase();
		
//		요청 => Controller메소드를 호출(매개변수로 title, updateTitle, updateArtist를 넘겨줌)
//		추가기능
//		수정된 횟수를 반환받음.
		int result = mc.updateMusic(title,updateTitle,updateArtist);
		if(result>0) {
			System.out.println(result+"개의 곡이 수정되었습니다.");
		}else {
			System.out.println("수정된 곡이 없습니다.");
		}
	}
}
