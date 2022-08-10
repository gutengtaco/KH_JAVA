package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {
//	최상위 클래스인 Object 상속받아보기
//	만약, 나의 클래스에 부모클래스가 존재하는데, 
//	그럼, Object와 부모클래스에 다중상속을 받는것이 아닌가?
//	아니다. 이떄는 나의 클래스로부터 부모클래스, Object클래스로 거슬러 올라가는 것임.
	
//	필드부
	private String title;
	private String author;
	private int price;
	
//	생성자부
//	메뉴툴바 - source - generate constructor using field
	public Book() {}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
//	메소드부
//	getter , setter
//	메뉴툴바 - source - generate getter and setter
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	information
//	메뉴툴바 - source - generate toString()
//	toString()은 기본적으로 Object의 상속을 받고 있는 상태임.
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	/*
	 * 오버라이딩
	 * 상속받고 있는 부모클래스의 메소드를 자식 클래스에서 재정의(재작성)하는 것.
	 * 즉, 부모가 제공하고 있는 메소드를 자식이 일부 고쳐서 사용하겠다는 의미.
	 * 호출시, 자식메소드가 우선권을 가짐.
	 * 
	 * 오버라이딩 성립 조건
	 * 1. 부모 메소드명과 동일해야 함.
	 * 2. 반환형이 같아야 함.
	 * 3. 매개변수의 자료형, 개수, 순서가 동일해야 함.(오버로딩때와는 반대임)
	 * => 단, 매개변수명은 무관함.
	 * 4. 자식메소드의 접근제한자가 부모메소드의 접근제한자보다 범위가 같거나 또는 공유 범위가 더 커야함. 
	 * => 규약의 개념이 들어가있음(재정의 하려면 적어도 이정도의 규칙은 지켜야 함.)
	 * 
	 * @Override : annotation(주석). 생략이 가능함.(부모메소드와 형태가 같다면)
	 * 			       주석이지만, 잘못 기술했을 경우 오류를 알려주기 때문에 검토할 수 있음.  
	 * 			       부모메소드가 후에 수정됐을 경우에도 또한 오류로 알려주기 때문에 검토할 수 있음. 
	 */
	
	
	
	
}
