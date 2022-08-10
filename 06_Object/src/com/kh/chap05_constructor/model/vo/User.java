package com.kh.chap05_constructor.model.vo;

public class User {
//	[�ʵ��]
	private String userId;		// ���̵�
	private String userPwd;		// ��й�ȣ
	private String userName;	// �̸�
	private int age;			// ����
	private char gender;		// ����
	
	
//	[�����ں�]
	/*
	 *������
	 *�̸��� Ŭ������� ����, ���� �ڷ���(��ȯ��)�� ���� ������ �޼ҵ�.
	 *����, �����ڷ����� ������ void�� ����, �����ںο����� �ƿ� ���� ����.
	 *��ü�� ����(new Ŭ������();)�Ҷ�, ȣ��Ǵ� ���� �⺻��������.
	 *�⺻������ �Ű������� ���� �⺻������ �����ڴ� JVM�� �������.
	 *
	 *[ǥ����]
	 *public Ŭ������(�Ű�����=>��������){ ������ �ڵ�; } 
	 *
	 *[����]
	 *1. ��ü�� �����ϱ� ����.
	 *2. ��ü�� ������ �Ӹ� �ƴ϶�, �Ű������� ���޵� ���� ��ٷ� �ʵ忡 �ʱ�ȭ��.
	 *					   (�迭���� ����� ���ÿ� �ʱ�ȭ�� �ߴ� �Ͱ� ���ٰ� ���� ��.)
	 *[������ ��]
	 *1. �������� �̸��� �ݵ�� Ŭ������� �����ؾ� ��(��ҹ��� ���� Ȯ����!)
	 *2. ��ȯ���� ���� �ȵ�. => ��ȯ���� ���� �޼ҵ���̶� ������ �Ȱ��� ������.
	 *3. ������ �ۼ��� ������.=> ��, �Ű������� �ߺ����� �ʴ� ��쿡�� �ߺ��ۼ��� ����.
	 *4. �Ű������� �ִ� �����ڸ� ��������� �ۼ��ϸ�, JVM�� �⺻�����ڸ� �ڵ����� ��������� ����!
	 *=> �⺻�����ڴ� �׻� ����� ������ ���� ��!
	 *
	 */
	public User(/*�Ű�����*/) {
//	�⺻ ������ : �Ű������� ���� ������.
//	=> ����, ��ü�� �����ϱ� ���� �������θ� ���.(new�����ڸ� ����Ͽ� Heap������ �޸� �Ҵ�.)
//	�⺻�����ڸ� �����ص� ������ ���� ����
//	=> JVM�� �ڵ����� �⺻�����ڸ� ����� �ֱ� ������.
//	=> ��, �Ű������� �ִ� �����ڰ� �ֱ������� �ۼ��Ǿ� �ִ� ���,
//	=> �⺻ �����ڸ� JVM�� �ڵ����� ����� ���� ����.
//	=> �� ��쿡 ����, �׻� �⺻�����ڸ� ����� ������ ���̵���!
		System.out.println("ȣ�� Ȯ��");
	}
	
	/*
	public User() {
		
	}
	[�����޼���]
	Duplicate method User() in type User
	�����ڸ��� �ߺ��� �� ����.
	*/
	
	public User(String userId, String userPwd, String userName) {
//	�Ű������� �ٸ��� �����ڸ��� �Ȱ��� �ص� ��.
		
		this.userId =userId;
		this.userPwd = userPwd;
		this.userName = userName;
//	�̸� �ۼ��ϸ� setter�޼ҵ尡 �ʿ���� �ʳ�?
//	�����ڸ� �������� �ۼ��ϰ�, ���Ŀ� �Ϻ� �ʵ� ���� �ѵΰ� �ٲ�� ��Ȳ�� ����ٸ�
//	setter�޼ҵ带 ����ϴ� ���� �� �����ϱ� ������ �����.	
//	������ �Ѵٵ��� Ȥ�� ���̸� �Դ´ٵ��� ��.	
	}
	public User(String userId, String userPwd, String userName, 
			int age, char gender) {
//		��� �ʵ忡 ���Ͽ�, �Ű������� �����ִ� ������
//		=> �ʵ尡 5���̸�, �Ű������� 5����.
//		=> ��ü�� �����ϰ�, �� ���� ���� ���ϴ� ������ �ʱ�ȭ���� ��Ŵ.
//		=> �굵 �⺻������ó�� �׻� ����� ������ ���̸� ����(�⺻�����ڿ� �޸� �ʼ��� �ƴ�)
		
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		���� �����ڿ� id, pwd, name�� �ߺ��ʿ��� �� �۵���.
		*/
		this(userId,userPwd,userName);
//		�ߺ��Ǵ� ������ �̷��� �ᵵ ��.
//		�ߺ��Ǵ�, �ʱ�ȭ �ϴ� ������ �����ڰ� �̹� ������ ���, this������ ���
//		this������ :���� Ŭ���� ���� �ٸ� �����ڸ� ȣ���ϴ� ����.
//		this�����ڴ� �׻� ���� ���ٿ� �־�� ��.
		this.age = age;
		this.gender = gender;
	}
	
	
	
//	[�޼ҵ��]
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age ) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String userId() {
		return userId;
	}
	public String userPwd() {
		return userPwd;
	}
	public String userName() {
		return userName;
	}
	public int age() {
		return age;
	}
	public char gender() {
		return gender;
	}
	public String information() {
		return "userId : " +userId + ", userPwd : "+userPwd+", userName : "+userName
				+", age : "+age+", gender : "+gender;
	}
}
