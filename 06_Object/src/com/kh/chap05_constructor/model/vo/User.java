package com.kh.chap05_constructor.model.vo;

public class User {
//	[필드부]
	private String userId;		// 아이디
	private String userPwd;		// 비밀번호
	private String userName;	// 이름
	private int age;			// 나이
	private char gender;		// 성별
	
	
//	[생성자부]
	/*
	 *생성자
	 *이름이 클래스명과 같고, 리턴 자료형(반환형)이 없는 일종의 메소드.
	 *본래, 리턴자료형이 없으면 void를 쓰나, 생성자부에서는 아예 쓰지 않음.
	 *객체가 생성(new 클래스명();)할때, 호출되는 것이 기본생성자임.
	 *기본적으로 매개변수가 없는 기본형태의 생성자는 JVM이 만들어줌.
	 *
	 *[표현법]
	 *public 클래스명(매개변수=>생략가능){ 실행할 코드; } 
	 *
	 *[목적]
	 *1. 객체를 생성하기 위함.
	 *2. 객체를 생성할 뿐만 아니라, 매개변수로 전달된 값을 곧바로 필드에 초기화함.
	 *					   (배열에서 선언과 동시에 초기화를 했던 것과 같다고 보면 됨.)
	 *[주의할 점]
	 *1. 생성자의 이름은 반드시 클래스명과 동일해야 함(대소문자 구분 확실히!)
	 *2. 반환형을 쓰면 안됨. => 반환형을 쓰면 메소드들이랑 구분이 안가기 때문임.
	 *3. 여러개 작성이 가능함.=> 단, 매개변수가 중복되지 않는 경우에만 중복작성이 가능.
	 *4. 매개변수가 있는 생성자를 명시적으로 작성하면, JVM이 기본생성자를 자동으로 만들어주지 않음!
	 *=> 기본생성자는 항상 만드는 습관을 들일 것!
	 *
	 */
	public User(/*매개변수*/) {
//	기본 생성자 : 매개변수가 없는 생성자.
//	=> 단지, 객체를 생성하기 위한 목적으로만 사용.(new연산자를 사용하여 Heap영역에 메모리 할당.)
//	기본생성자를 생략해도 오류가 나지 않음
//	=> JVM이 자동으로 기본생성자를 만들어 주기 때문에.
//	=> 단, 매개변수가 있는 생성자가 주기적으로 작성되어 있는 경우,
//	=> 기본 생성자를 JVM이 자동으로 만들어 주지 않음.
//	=> 이 경우에 의해, 항상 기본생성자를 만드는 습관을 들이도록!
		System.out.println("호출 확인");
	}
	
	/*
	public User() {
		
	}
	[오류메세지]
	Duplicate method User() in type User
	생성자명은 중복될 수 없음.
	*/
	
	public User(String userId, String userPwd, String userName) {
//	매개변수가 다르면 생성자명을 똑같이 해도 됨.
		
		this.userId =userId;
		this.userPwd = userPwd;
		this.userName = userName;
//	이를 작성하면 setter메소드가 필요없지 않나?
//	생성자를 기준으로 작성하고서, 이후에 일부 필드 값만 한두개 바뀌는 상황이 생긴다면
//	setter메소드를 사용하는 것이 더 유리하기 때문에 사용함.	
//	개명을 한다든지 혹은 나이를 먹는다든지 등.	
	}
	public User(String userId, String userPwd, String userName, 
			int age, char gender) {
//		모든 필드에 대하여, 매개변수를 갖고있는 생성자
//		=> 필드가 5개이면, 매개변수도 5개임.
//		=> 객체를 생성하고, 그 순간 내가 원하는 값으로 초기화까지 시킴.
//		=> 얘도 기본생성자처럼 항상 만드는 습관을 들이면 좋음(기본생성자와 달리 필수는 아님)
		
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		위의 생성자와 id, pwd, name이 중복됨에도 잘 작동함.
		*/
		this(userId,userPwd,userName);
//		중복되는 내용은 이렇게 써도 됨.
//		중복되는, 초기화 하는 내용의 생성자가 이미 존재할 경우, this생성자 사용
//		this생성자 :같은 클래스 내에 다른 생성자를 호출하는 구문.
//		this생성자는 항상 가장 윗줄에 있어야 함.
		this.age = age;
		this.gender = gender;
	}
	
	
	
//	[메소드부]
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
