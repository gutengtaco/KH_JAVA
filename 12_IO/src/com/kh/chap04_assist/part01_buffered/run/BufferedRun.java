package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		/*
		 * ������Ʈ��
		 * ��ݽ�Ʈ��(�ܺθ�ü�� ���� ����Ǵ� ���)�� ������ ��ɵ��� Ȯ��
		 * ������Ʈ���� �ܵ� ����� �Ұ���(�ܵ����� ��ü ������ �Ұ���)
		 * 
		 * [ǥ����]
		 * ������Ʈ��Ŭ������ ��ü�� = new ������Ʈ��Ŭ������(��ݽ�Ʈ�� ��ü);

		 * 1. BufferedXXX : �ӵ� ���� ��� �������� ����.
		 * => ���۰����� �����ؼ�, �ѹ��� ��Ƽ� �Ѳ����� ������� �����ϴ� ������ �̷����.
		 * 2. ObjectXXX : ��ü ������ ������� �� �� �ִ� ����� ����.
		 * 
		 * ������Ʈ���� ��ݽ�Ʈ���� ���ձ���
		 * ������Ʈ�� Reader / Writer�迭�̸�, ��ݽ�Ʈ���� ���缭 Reader/Writer�迭
		 * ������Ʈ�� Input / Output�迭�̸�, ��ݽ�Ʈ���� ���缭 Input/ Output�迭
		 */
		BufferedDao bd = new BufferedDao();
//		bd.fileSave();
		bd.fileRead();
		
	}

}
