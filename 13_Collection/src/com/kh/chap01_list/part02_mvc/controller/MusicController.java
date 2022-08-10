package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

//	Controller : 기능적인 요소를 담당하는 부분.
//	백앤드에 해당됨.
//	사용자의 요청을 받아서 처리해주는 클래스, 처리결과는 View로 돌려보냄. 
//	=>MVC패턴 중 C(Controller)에 해당됨.
public class MusicController {
	private ArrayList<Music> list = new ArrayList<>();
	{	// 초기화 블럭 : 필드에 값을 대입해주는 용도.(매개변수 생성자와 비슷)
		
//		기존에 입력되어 있는 필드 값
		list.add(new Music("Tears","소찬휘"));	//	0번째
		list.add(new Music("와","이정현"));	// 1번째
	}
	
	
//	새로운 곡 추가 요청이 들어왔을 때, 실행될 메소드(곡 추가 기능 담당)
	public int insertMusic(String title, String artist) {
		
//		추가 후 size - 추가 전 size
		int before = list.size();
		
//		2번째부터 입력됨.
		list.add(new Music(title,artist));
		int after = list.size();
		int result = after - before;
		return result;
	}
//	곡 전체 조회 요청이 들어왓을 때, 실행될 메소드(곡 전체 조회 기능 담당)
	public ArrayList<Music> selectMusicList() {
			return list;
	}
	
//	특정 곡 검색 요청이 들어왓을 때, 실행될 메소드(특정 곡 검색 기능 담당)
	public ArrayList<Music> searchMusic(String keyword) {
//			검색기능 => 반복을 돌려, 포함되는 것을 return으로 반환
		
//			1. 검색 결과들이 담길 ArrayList 객체 만들기
			ArrayList<Music> searched = new ArrayList<>(); // 크기 지정 X
//			2. 반복문을 돌리며 곡제목에 keyword가 포함되어있는지 검사
			for(int i=0; i<list.size();i++) {
//				a.contains(b)
//				=> a,b는 문자열
//				=> a라는 문자열에 부분문자열로 b가 포함되어있으면 true / 아니면 false
				if(list.get(i).getTitle().contains(keyword)) {
//					3. 포함결과를 ArrayList객체에 담기
					searched.add(list.get(i));
				}
			}
//			4. 검색결과 return
			return searched; 
	}
//	특정 곡 삭제 요청이 들어왔을 때, 실행될 메소드(특정 곡 삭제 기능 담당)
	public int deleteMusic(String title) {
		
//		1. 결과값을 담을 변수 세팅
		int result = 0;
		
//		2. 반복문 활용하여 getTitle()과 title을 동등비교
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getTitle().toLowerCase().equals(title)) {
//				3.삭제 메소드 작성 후 변수++
				list.remove(i);
				result++;
			}
		}
		return result;
	}
//	특정 곡 수정 요청이 들어왔을 때, 실행될 메소드(특정 곡 수정 기능 담당)
	public int updateMusic(String title, String updateTitle, String updateArtist) {
//		1. 반환할 결과값을 담을 변수 세팅
		int result = 0;
//			2. 반복
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().toLowerCase().equals(title)) {
					list.get(i).setTitle(updateTitle);
					list.get(i).setArtist(updateArtist);
					result++;
				}
			}
			return result;
	}
}
