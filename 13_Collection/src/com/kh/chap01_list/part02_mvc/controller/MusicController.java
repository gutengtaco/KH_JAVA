package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

//	Controller : ������� ��Ҹ� ����ϴ� �κ�.
//	��ص忡 �ش��.
//	������� ��û�� �޾Ƽ� ó�����ִ� Ŭ����, ó������� View�� ��������. 
//	=>MVC���� �� C(Controller)�� �ش��.
public class MusicController {
	private ArrayList<Music> list = new ArrayList<>();
	{	// �ʱ�ȭ �� : �ʵ忡 ���� �������ִ� �뵵.(�Ű����� �����ڿ� ���)
		
//		������ �ԷµǾ� �ִ� �ʵ� ��
		list.add(new Music("Tears","������"));	//	0��°
		list.add(new Music("��","������"));	// 1��°
	}
	
	
//	���ο� �� �߰� ��û�� ������ ��, ����� �޼ҵ�(�� �߰� ��� ���)
	public int insertMusic(String title, String artist) {
		
//		�߰� �� size - �߰� �� size
		int before = list.size();
		
//		2��°���� �Էµ�.
		list.add(new Music(title,artist));
		int after = list.size();
		int result = after - before;
		return result;
	}
//	�� ��ü ��ȸ ��û�� ������ ��, ����� �޼ҵ�(�� ��ü ��ȸ ��� ���)
	public ArrayList<Music> selectMusicList() {
			return list;
	}
	
//	Ư�� �� �˻� ��û�� ������ ��, ����� �޼ҵ�(Ư�� �� �˻� ��� ���)
	public ArrayList<Music> searchMusic(String keyword) {
//			�˻���� => �ݺ��� ����, ���ԵǴ� ���� return���� ��ȯ
		
//			1. �˻� ������� ��� ArrayList ��ü �����
			ArrayList<Music> searched = new ArrayList<>(); // ũ�� ���� X
//			2. �ݺ����� ������ ������ keyword�� ���ԵǾ��ִ��� �˻�
			for(int i=0; i<list.size();i++) {
//				a.contains(b)
//				=> a,b�� ���ڿ�
//				=> a��� ���ڿ��� �κй��ڿ��� b�� ���ԵǾ������� true / �ƴϸ� false
				if(list.get(i).getTitle().contains(keyword)) {
//					3. ���԰���� ArrayList��ü�� ���
					searched.add(list.get(i));
				}
			}
//			4. �˻���� return
			return searched; 
	}
//	Ư�� �� ���� ��û�� ������ ��, ����� �޼ҵ�(Ư�� �� ���� ��� ���)
	public int deleteMusic(String title) {
		
//		1. ������� ���� ���� ����
		int result = 0;
		
//		2. �ݺ��� Ȱ���Ͽ� getTitle()�� title�� �����
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getTitle().toLowerCase().equals(title)) {
//				3.���� �޼ҵ� �ۼ� �� ����++
				list.remove(i);
				result++;
			}
		}
		return result;
	}
//	Ư�� �� ���� ��û�� ������ ��, ����� �޼ҵ�(Ư�� �� ���� ��� ���)
	public int updateMusic(String title, String updateTitle, String updateArtist) {
//		1. ��ȯ�� ������� ���� ���� ����
		int result = 0;
//			2. �ݺ�
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
