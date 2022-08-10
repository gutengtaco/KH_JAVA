package com.kh.chap01_list.part02_mvc.model.vo;

//	model : ���α׷��� ����� �Ǵ� ���� ��� �뵵�� Ŭ���� 
//	=> VO, DAO�� �ش� Ŭ������ �ش��.
//	=> MVC���� �߿��� M(Model)�� �ش��.
public class Music {
//	�ʵ��
	private String title;
	private String artist;
//	�����ں�
	public Music() {
		super();
	}
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}
//	�޼ҵ��
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