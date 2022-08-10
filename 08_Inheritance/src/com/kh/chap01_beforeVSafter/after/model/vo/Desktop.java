package com.kh.chap01_beforeVSafter.after.model.vo;
//			 자식					          부모
//           서브                             슈퍼
//           하위                             상위
//           후손                             조상
public class Desktop extends /*부모클래스명*/Product {
//	클래스 선언부 : 어디에서 공통적인 것을 가져올건지 언급해주어야함.
	
//	필드부
//	(brand, pCode, pName, price)
//	필드부에 직접 쓰는 것이 아닌, 부모클래스의 필드를 참조하는 것임.
	private boolean allInOne;
	
//	생성자부
//	기본생성자
	public Desktop() {}
	
//	매개변수 생성자
//	brand, pCode, pName, price, allInOne이라는 필드에 값을 다 대입해주는 생성자
	public Desktop(String brand, String pCode, String pName, int price,
				   boolean allInOne) {
//		super.은 해당 부모클래스의 객체의 주소를 담고 있음.
//		즉, 부모에 접근이 가능함.
//		ex) super.brand;
//		단, private일 경우에는 직접접근이 불가함!!
//		[오류메세지]
//		The field Product.brand is not visible
//		각 필드의 값이 private이기 때문에, 직접접근이 불가하여 오류가 뜸.
//		[해결]
//		1. private를 protected로 바꿔주기
//		=> 오류는 사라지나, 보안때문에 부적합함.
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
//		2. 부모클래스에 있는 public접근 제한자인 setter메소드 활용
//		=>해결은 되나, 코드의 길이가 길어짐.
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		this.allInOne = allInOne;
		*/
//		3. 부모클래스의 매개변수생성자를 호출하여 사용하기.
//		=> super()생성자를 이용하여 작성함.
//		=> 매개변수생성자도 일종의 메소드이기 때문에 super(매개변수)로 호출이 가능함.
//		=> 마찬가지로 호출을 한 후, 다시 부모클래스의 해당 매개변수 생성자로 돌아가 값을 초기화할 수 있음.예
//		=> 단, this()생성자와 같이 맨위에 작성해줌 
		super(brand,pCode,pName,price);
		this.allInOne = allInOne;
	}
//	메소드부
	public boolean getAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
//	오버로딩 : 같은 클래스 내에 같은 이름으로 메소드를 만들 수 있음.
//			   다만, 매개변수의 종류,개수,순서가 달라야 성립할 수 있음.
//	오버라이딩 : 부모 클래스에 있는, 같은 이름의 메소드를 내 입맛대로 정의해서 새롭게 쓰는 것임.
//				 동적바인딩이라고도 함.
//	즉, 오버로딩은 한 클래스 내에 메소드 이름은 동일하나, 매개변수의 종류, 개수, 순서를 다르게 하여 메소드를 만드는 것이고
//		오버라이딩은 상속관계에서 부모클래스의 매개변수의 종류,개수,순서를 그대로 가져와 사용하는 것임.
//		여기서, 생성자 역시 일종의 메소드이기 때문에 오버로딩, 오버라이딩이 적용됨.
	public String information() {
//		return brand+pCode+pName+price+allInOne;
//		[오류메세지]
//		The field Product.brand is not visible
//		product의 4가지 필드가 desktop에 존재하지 않아서 생김.
		
//		return super.getBrand()+", "+super.getpCode()+", "+super.getpName()+", "
//		+super.getPrice()+", "+allInOne;
//		product의 필드를 protected로 바꾸어주면 오류가 사라짐.
//		(protected : 같은패키지 o, 다른패키지x(상속관계일시에는 가능))
//		다만, 이게 적합한 방식인가? No!
//		같은 패키지 안의, 나랑 상관없는 다른 클래스에서는 자유롭게 접근이 가능한 범위라서
//		private는 "직접접근을 막겠다" => "간접접근을 가능하게 하겠다."
//		=> getter메소드를 호출하여 사용함(public이라 바로 호출 가능함)
//		=> 여기에 부모로부터 메소드를 호출한다는 의미에서 super.을 붙여줌.
		
//		부모로부터 .필드에 직접 접근하고싶다면? super.필드명
//		부모로부터 메소드를 호출하고 싶다면? super.메소드명()
//		부모로부터 생성자(기본, 매개변수)를 호출하고 싶다면? super(), super(매개변수)
		return super.information() + ", "+allInOne;
//		위의 getter메소드를 이용한 방식과 같은 효과임.
	}
}
