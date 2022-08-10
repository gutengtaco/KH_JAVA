package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Basketball extends Sports {
//	[오류메세지]
//	The type Basketball must implement the inherited abstract method Sports.rule()
//	미완성된 클래스인 추상클래스를 상속받게 되면,
//	부모클래스에 있는 추상메소드를 강제로 오버라이딩을 통해서 완성시켜주어야함.
	
	@Override
	public void rule() {
		System.out.println("손으로 공을 던져서 링에 넣는다.");
	}
//	이 시점에서 오버라이딩을 제시해주어서
//	오류가 사라지면서, 추상메소드를 채워줌.
	
//	이렇게 하면, 어느정도 자식클래스에 강제성이 부여됨.
}
