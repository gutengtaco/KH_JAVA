package com.kh.chap01_list.part02_mvc.model.vo;

//	model : 프로그램의 기반이 되는 값을 담는 용도의 클래스 
//	=> VO, DAO가 해당 클래스에 해당됨.
//	=> MVC패턴 중에서 M(Model)에 해당됨.
public class Music {
//	필드부
	private String title;
	private String artist;
//	생성자부
	public Music() {
		super();
	}
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
//	메소드부
//	getter, setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
//	toString
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	

}