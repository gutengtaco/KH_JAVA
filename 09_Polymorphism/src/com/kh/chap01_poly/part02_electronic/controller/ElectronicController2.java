package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

//	�������� ������ ��
public class ElectronicController2 {
//	[�ʵ��]
//	�ʵ带 ��ü�迭, ��ü������ ������
//	���⼭, ��ü�迭�� �Ҵ���� �̷����.
	private Electronic[] elec = new Electronic[3];
	
//	[�����ں�]
	
	
//	[�޼ҵ��]
//	������ ��ǰ�ɶ�����, â�� ������ �ϳ��ϳ� �������� ä���ְڴ�.
//	�Ű������� ��ü��, index��°�� ��ü�迭�� ������. 
//	�̶�, Electronic�� �Ű����������ڸ� ���� �� ����.
	public void insert(Electronic any, int index) {
			elec[index] = any;
	}
//	���� ���ϴ� ������ �ϳ��� �����ֱ�(â��κ���) 
	public Electronic select(int index) {
		return elec[index];
	}
//	���� ���ϴ� ������ ����� �����϶� => â��°�� �Ѱ��ֱ�

	public Electronic[] select() {
		return elec;
	}
	
	/*
	 * �޼ҵ�
	 * �Է°�(�Ű�����)�� �ֵ� ���簣��, ������ ������ ������.
	 * => ��ȯ���� ������ ��������, ������ �޼ҵ� ������ ���길 ��.
	 * 
	 * �Է°� : boolean,byte, short, int, long, float, double, char, String, 
	 * 			��ü, �迭, ��ü�迭,... 
	 * 			ex) main�޼ҵ�(String[] args) =>String[]�迭�� args��� ��ü��
	 * ��°� : void, boolean,byte, short, int, long, float, double, char, String, 
	 * 			��ü, �迭, ��ü�迭,...
	 */
}
