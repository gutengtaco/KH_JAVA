package com.hw3.model.vo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Song {
//	�ʵ��
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
//	�����ں�
	public Song() {}
	public Song(String title, String artist, String album, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
		this.track = track;
	}
//	getter, setter()
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
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
//	song()
	public void composerSet() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�۰��(,�Է�) : ");
		String str = sc.nextLine();
		StringTokenizer stn = new StringTokenizer(str, ",");	
		System.out.println("���� ����ִ� �۰ �� : "+stn.countTokens());
		this.composer = new String[stn.countTokens()];
			int end = stn.countTokens();
			for(int i=0; i<end; i++) {
				composer[i] = stn.nextToken();
			}
	}
	public void show() {
		System.out.print("���� : "+ title+", ���� : "+ artist+ ", �������� : "+album+", �۰ : ");
		for(int i=0; i<composer.length; i++) {
			if(i==composer.length-1) {
				System.out.println(composer[i]);
			}else {
				System.out.print(composer[i]+", ");
			}
		}
		System.out.println(" ���� : " + year + ", Ʈ�� : "+track);
	}
}
