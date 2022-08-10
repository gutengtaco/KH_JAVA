package com.kh.chap04_field.model.vo;

// 필드에서 사용 가능한 접근제한자 4가지
// 클래스에는 public, default만 사용 가능.
public class FieldTest2 {
	// 필드에서는 public, protected, default, private 사용 가능
	
	/*
	 * (+) public : 어디서든(같은 패키지, 다른패키지) 접근 가능하도록 함.
	 * (#) protected : 같은 패키지면 무조건 가능.
	 * 				       상황에 따라서 다른 패키지에도 접근 가능. 
	 * 				   ("상속 구조"일 경우에 다른 패키지에 접근 가능 )
	 * (~) default : 오로지 같은 패키지일 경우에만 가능. 생략 시 자동으로 적용됨.
	 * (-) private : 오직 해당 클래스 내에서만 사용 가능.
	 * 
	 * => 위에서부터 아래로 내려갈수록, 접근할 수 있는 범위가 좁아짐.
	 * => 앞에 붙은 기호(+,#,~,-)들은 클래스 다이어그램이라고 함.
	 */
	
	public String pub = "public";
	protected String pro = "protected";
	/*default*/ String df = "default";
	private String pri = "private";
}
