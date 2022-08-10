package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 	View : �ð����� ��Ҹ� ����ϴ� �κ�(����ڰ� ���� �� ȭ��� ����).
//	����Ʈ�ص忡 �ش��.
//	ȭ�鿡���� �Է°� ����� �����.
//	=>MVC ������ V(View)�� �ش��.

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
//	����ȭ�� : ���α׷� ���� ��, ���� ó�� �������� ȭ��
	public void mainMenu() {
		// System.out.println ������ �̿��ؼ� ������ �ٹ̱�
		System.out.println("*********�������*********");
		System.out.println("1. ���ο� �� �߰�");
		System.out.println("2. �� ��ü ��ȸ");
		System.out.println("3. Ư�� �� �˻�");
		System.out.println("4. Ư�� �� ����");
		System.out.println("5. Ư�� �� ����");
		System.out.println("0. ���α׷� ����");
		
		while(true){
		System.out.print("�޴� �Է� : ");
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
				System.out.println("���α׷��� �����մϴ�. �ȳ��� ������.");
				return;
			default : 
				System.out.println("���� �޴��Դϴ�. �ٽ� �Է����ּ���");
			}
		}
		
	}
	
//	�Է�, ��¸޼ҵ�	
//	MusicController�� ��ü�� �̿��Ͽ� ���� ȣ����.
//	1. ���ο� ���� �߰��� �� �ִ� ȭ��
	public void insertMusic() {
		System.out.println("-- 1.���ο� �� �߰� --");
		System.out.print("��� �Է� : ");
		String title = sc.nextLine();
		System.out.print("������ �Է� : ");
		String artist = sc.nextLine();
//		�� �������� �츮�� ������ �߰��ϰ��� �� ��, �ʿ��� �������� ��� �Է¹��� ����
		
//		��û => Controller�� �޼ҵ带 ȣ��(�ʿ��� �������� �Ű������� �ѱ� ��.)
		int result = mc.insertMusic(title,artist);
		if(result>0) {
			System.out.println("���������� �߰��Ǿ����ϴ�.");
			System.out.println("�߰��� ���� " +result+"�� �Դϴ�.");
		}else {
			System.out.println("�߰��� ���� �����ϴ�.");
		}
	
	}
//	2. ��ü ���� ��ȸ�� �� �ִ� ȭ��
	public void selectMusicList() {
		System.out.println("-- 2.�� ��ü ��ȸ --");
//		��û => Controller�� �޼ҵ带 ȣ��
		ArrayList<Music> list = mc.selectMusicList();
		mc.selectMusicList();
		
		if(list.isEmpty()) {//���� ����Ʈ�� �뷡�� ���ٸ�
			System.out.println("���� �����ϴ� �뷡�� �����ϴ�.");
		}else {//���� ����Ʈ�� �뷡�� �ִٸ�
			System.out.println("���� �����ϴ� �뷡�� �� " +list.size()+" �� �Դϴ�.");
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}
		
	}
//	3. ���� �˻��� �� �ִ� ȭ��
	public void searchMusic() {
		System.out.println("-- 3.Ư�� �� �˻� --");
		System.out.print("�˻��� ��� Ű���� : ");
		String keyword = sc.nextLine();
		
//		��û=> Controller �޼ҵ带 ȣ��(�˻�� ���Ե� ���� ��� ã�Ƽ� ��ȯ)
//		������� 0�� ok / ������� 1�� ok / ������� 2���̻� ok
//		=> 2�� �̻��� ���ɼ��� �����Ƿ�, ArrayList Ÿ������ �˻��� ������ ��� ��ȯ.
		ArrayList<Music> searched = mc.searchMusic(keyword);
		if(searched.isEmpty()) {
			System.out.println("�˻������ �����ϴ�.");
		}else {
				for(Music m : searched) {
					System.out.println(m);
				}
				System.out.println("�˻������ �� "+ searched.size() + "�� �Դϴ�.");
		}
	
	}
//	4. Ư�� ���� ������ �� �ִ� ȭ��
	public void deleteMusic() {
		System.out.println("-- 4.Ư�� �� ���� --");
		System.out.print("������ ��� : ");
		String title = sc.nextLine().toLowerCase();
		
//		��û => Controller �޼ҵ带 ȣ��(�Ű������� title�� �Ѱ���)
//		�߰����� ���
//		������ �Ͼ Ƚ���� �޼ҵ� ��ȯ������ �������� ��.
		int result = mc.deleteMusic(title);
		if(result>0) {
			System.out.println(result+"���� ���� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ ���� �����ϴ�.");
		}
	}
	public void updateMusic() {
		System.out.println("-- 5.Ư�� �� ���� --");
//		���� => ������ ��� �ٲ� ������ �����ؾ� ��.
//		���� ���, ������ ���, ������ ������
		System.out.print("���� ��� : ");
		String title = sc.nextLine().toLowerCase();
		System.out.print("���� ��� : ");
		String updateTitle = sc.nextLine().toLowerCase();
		System.out.print("���� ������ : ");
		String updateArtist = sc.nextLine().toLowerCase();
		
//		��û => Controller�޼ҵ带 ȣ��(�Ű������� title, updateTitle, updateArtist�� �Ѱ���)
//		�߰����
//		������ Ƚ���� ��ȯ����.
		int result = mc.updateMusic(title,updateTitle,updateArtist);
		if(result>0) {
			System.out.println(result+"���� ���� �����Ǿ����ϴ�.");
		}else {
			System.out.println("������ ���� �����ϴ�.");
		}
	}
}
