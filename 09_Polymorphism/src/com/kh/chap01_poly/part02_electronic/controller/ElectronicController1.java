package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// �������� �����ϱ� ��
public class ElectronicController1 {
//	[�ʵ��]
//	��� ���ڻ󰡿� ���� ���� ����
//	�ʵ带 Ŭ����, ��ü������ ������.
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
//	[�����ں�]
	
	
//	[�޼ҵ��]
//	����ũž ��� ���� ���,
//	�����ε��� �̿��Ͽ� �޼ҵ� �̸��� ����, �Ű������� �ٸ���.
//	�ٸ�, �Ű������� �ڷ����� Ŭ������, �Ű��������� ��ü�� ������ ���� ��
	
//	���´� setter�޼ҵ�� ����.
//	����ũž�� �������ִ� �޼ҵ�
	public void insert(Desktop d) {
//		Desktop d = new Desktop("�Ｚ","����ũž",1200000, "Geforce1070");
//		desk = new Desktop("�Ｚ","����ũž",1200000,"Geforce1070");
		desk = d;
	}
//	��Ʈ���� �������ִ� �޼ҵ�
	public void insert(NoteBook n) {
		note = n;
	}
//	�º��� �������ִ� �޼ҵ�
	public void insert(Tablet t) {
		tab = t;
	}
//	���´� getter�޼ҵ�� ����.
//	�����ε��� �Ұ�(�������� �Ű������� ���� ������)�ϱ� ������,
//	������ �޼ҵ���� �Ʒ��� ���� ������.
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
		
}
