package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product prod = new Product("Samsung","Galaxy S9","Blue",960000);
		System.out.println(prod.hashCode());
		Object obj = new Product("LG","G6","Red",820000);
		System.out.println("생성한 첫번째 객체의 값 : "+prod.toString());
		System.out.println("생성한 두번째 객체의 값 : "+obj.toString());
		System.out.println("==========================================================");
//		System.out.println("생성한 두 객체의 값이 같은가? "+prod.equals(obj));
		
		Product prod2 = new Product("Samsung","Galaxy S9","Blue",960000);
		System.out.println(prod.hashCode());
	}

}
