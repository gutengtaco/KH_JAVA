package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;

public class BasicRun {

	public static void main(String[] args) {
		/*
		 * Sports
		 * Basketball
		 * Football
		 */
		
//		Sports s = new Sports();
//		[�����޼���]
//		Cannot instantiate the type Sports
//		��ü�� �������� ���Ѵٴ� ������.
//		�߻�Ŭ������ �̿ϼ��� Ŭ�����̱⶧���� ��ü ������ �Ұ���.
		
		Sports s1;
//		��ü������ �Ұ����ϳ�, ������ ������ ������ ������.
//		�߻�Ŭ���� : �������� �����ؼ�, �ڽİ�ü�� �޾��ִ� �뵵�δ� ����� ������.
		Sports s2;
		s1 = /*(Sports)*/new Basketball();
		s2 = /*(Sports)*/new Football();
		
		Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		/*
		 * �߻�Ŭ����(�̿ϼ��� Ŭ����) : abstract class
		 * => �߻�޼ҵ尡 �����ϴ� ����, �ݵ�� �߻�Ŭ������ ����(���ֵ�.)
		 * (�Ϲ��ʵ� + �Ϲݸ޼ҵ�+ �߻�޼ҵ�)
		 * => ��, �߻�޼ҵ尡 ��� Ŭ������ �տ� abstract�� �ٿ��� �߻�Ŭ������ ���� �� ����.
		 * => ��ü������ �Ұ�������(��, ������ ������ �ڽİ�ü�� �������� ��� ���� => ������ ����)
		 * 
		 * �߻�Ŭ������ �ʿ��� ��
		 * => �ڽ�Ŭ�����鿡�� ������ ��Ģ�� �ο��ϰ� ���� �� ���� ����.
		 * => Ŭ������ ���� ��ü������ ����, �� ������ ������ �� ������
		 * => ����, �� Ŭ������ ���� ��ü ������ ���ʿ� ���� ������
		 * 
		 * �߻�޼ҵ�
		 * �̿ϼ��� �޼ҵ��, �����({})�� �����Ǿ����� ���� �޼ҵ�
		 * �ڽ�Ŭ�������� �������̵��� ���� �ϼ��Ǵ� �޼ҵ�(������ �������̵��� �ؾ���)
		 * =>�������̵��� ���� �ʾ��� ���, ������ �߻�
		 * =>�޼ҵ� ��뿡 ������(���ϼ�)�� �ִ� ����.
		 * =>ǥ��ȭ�� Ʋ�� ������ �������ε� ����.
		 * 
		 */
	}

}
