package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Basketball extends Sports {
//	[�����޼���]
//	The type Basketball must implement the inherited abstract method Sports.rule()
//	�̿ϼ��� Ŭ������ �߻�Ŭ������ ��ӹް� �Ǹ�,
//	�θ�Ŭ������ �ִ� �߻�޼ҵ带 ������ �������̵��� ���ؼ� �ϼ������־����.
	
	@Override
	public void rule() {
		System.out.println("������ ���� ������ ���� �ִ´�.");
	}
//	�� �������� �������̵��� �������־
//	������ ������鼭, �߻�޼ҵ带 ä����.
	
//	�̷��� �ϸ�, ������� �ڽ�Ŭ������ �������� �ο���.
}
