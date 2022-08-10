package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{
//	鞘靛何
	private boolean coupon;
//	积己磊何
	public CookBook() {
		super();
	}

	public CookBook(String title, String author, String publisher,
			       boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
//	getter, setter
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
//	toString
	@Override
	public String toString() {
		return "CookBook ["+super.toString()+", "+"coupon=" + coupon + "]";
		
	}
	
	
}
