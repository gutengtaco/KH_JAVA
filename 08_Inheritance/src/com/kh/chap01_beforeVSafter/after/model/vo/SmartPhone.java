package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product{
//	필드부
//	extends로 현재 코드상에는 나타나지않지만, 
//	Product의 brand, pCode, pName, price가 추가된 효과를 부여함.
//	추가로 getter, setter, information메소드드 딸려온 효과를 부여함.
	private String mobileAgency;
	
//	생성자부
	public SmartPhone() {}
	public SmartPhone(String brand, String pCode, String pName, int price
			        , String mobileAgency) {
		super(brand, pCode, pName, price);
//		부모클래스의 매개변수생성자를 가져다 씀.
//		this()와 사용새가 비슷함. 
//		(this()는 같은 클래스의 매개변수생성자를, super()은 상위클래스의 매개변수 생성자를 가져옴)
		this.mobileAgency = mobileAgency;
	}
	
//	메소드부
	public String getMobileAgency() {
		return mobileAgency;
	}
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
//	오버라이딩 : 부모님의 메소드를 물려받아, 내 입맛대로 정의함.
//	동적바인딩 : 오버라이딩 된 내 메소드가 호출시, 우선순위를 가짐.
	public String information() {
//		내입맛대로, 부모클래스의 info에 내가 원하는 정보도 추가하고 싶음.
		return super.information()+", "+mobileAgency;
	}
}
