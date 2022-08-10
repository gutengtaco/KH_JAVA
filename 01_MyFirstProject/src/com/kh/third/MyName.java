package com.kh.third;

public class MyName {
	//callMyName Method만들기
	public void callMyName() {
		System.out.println("안녕하세요 천성훈입니다.");
	}
}

/*
 * workspace > Project > Package(폴더) > Class(파일) > Method
 * 폴더 안에 동일한 이름의 폴더명이 중복될 수 없다.
 * => 한 workspace안에 동일한 이름의 Project들이 중복X
 * => 한 Project안에 동일한 이름의 Package들이 중복X
 * => 한 Package안에 동일한 이름의 Class들이 중복X
 * => 한 Class안에 동일한 이름의 Method들이 중복O (오버로딩. 뒤에서배움)
 * => 한 Method안에 동일한 이름의 변수(대변할 이름)들이 중복X 
 */

/*
 * Java의 명명 규칙(코딩 컨벤션)
 * 1. 영어를 사용해야 한다.
 * 2. 띄어쓰기가 불가하다.(Project,Package,Class,Method 모두 불가)
 * 3. 의미 부여를 하여 단어를 조합하여 짓는다.
 * 4. Package명은 소문자로 짓는다(Class와 구분짓기 위해서)
 * 5. Class명은 첫글자를 대문자로 짓는다
 * 6. Method명은 첫글자를 소문자로 짓는다.
 * 7. Variable은 첫글자를 소문자로 짓는다.
 * 8. 공통원칙 : 여러 단어를 붙였을 때는 단어의 앞글자마다 대문자를 사용한다.(띄어쓰기 대신)
 * => 낙타봉표기법(Camel Case)라고 부른다.
 * => MethodTest(Class), testPrint(Method)
 */

/*
 * 1. com.kh.first.MethodTest 클래스
 *    com.kh.second.MethodTest 클래스
 * 위의 두개의 Class는 공존이 가능한가?
 * 패키지가 다르기 때문에 공존이 가능하다.
 * 
 * 2. com.kh.member.MemberController
 * 어디까지가 Package이고 Class인가?
 * member까지가 Package이고 MemberController가 Class이다.
 */
