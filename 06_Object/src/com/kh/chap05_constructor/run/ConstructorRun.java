package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
//		�⺻������ ȣ�� �׽�Ʈ
//		���� : new�� ��ü�� �����ϴ� ����
//		Ŭ������ ��ü�� = new �����ڸ�();
		User u1 = new User();
//		�⺻ ������ �ּ� ó����, ������ ��
//		[�����޼���]
//		The constructor User() is undefined
//		
		
		System.out.println(u1.information());
//		JVM�� ���� �⺻���� ���.(null,0,0.0,'') => ��������� �⺻�������� ����
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("ȫ�浿");
		u1.setAge(20);
		u1.setGender('��');
		
		System.out.println(u1.information());
		
//		�Ű������� userId,userPwd,userName�� ������ ȣ�� �׽�Ʈ
		User u2 = new User("user02","pass02","�踻��"); // ��ȣ�ȿ� �Ű������� �����ϸ� �⺻�������� ����� ��µ�.
		System.out.println(u2.information());
//		userId, userPwd, userName�� �ʵ�� ��ü������ ���ÿ�
//		���� ���ϴ� ������ ä������, �̿��� ���� �⺻������ ä����.
		u2.setAge(15);
		u2.setGender('��');
		System.out.println(u2.information());
		
		User u3 = new User("user03","pass03","������",20,'��');
		System.out.println(u3.information());
	}

}
