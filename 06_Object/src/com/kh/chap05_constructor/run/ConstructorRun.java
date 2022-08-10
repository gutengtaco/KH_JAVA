package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
//		기본생성자 호출 테스트
//		구문 : new로 객체를 생성하는 구문
//		클래스명 객체명 = new 생성자명();
		User u1 = new User();
//		기본 생성자 주석 처리시, 오류가 뜸
//		[오류메세지]
//		The constructor User() is undefined
//		
		
		System.out.println(u1.information());
//		JVM에 의해 기본값이 담김.(null,0,0.0,'') => 여기까지가 기본생성자의 역할
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("홍길동");
		u1.setAge(20);
		u1.setGender('남');
		
		System.out.println(u1.information());
		
//		매개변수가 userId,userPwd,userName인 생성자 호출 테스트
		User u2 = new User("user02","pass02","김말똥"); // 괄호안에 매개변수를 생략하면 기본생성자의 결과가 출력됨.
		System.out.println(u2.information());
//		userId, userPwd, userName의 필드는 객체생성과 동시에
//		내가 원하는 값으로 채워지고, 이외의 값은 기본값으로 채워짐.
		u2.setAge(15);
		u2.setGender('남');
		System.out.println(u2.information());
		
		User u3 = new User("user03","pass03","동동이",20,'남');
		System.out.println(u3.information());
	}

}
