package com.hw3.run;

import com.hw3.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product prod = new Product("Samsung","Galaxy S9","Blue",960000);
		System.out.println(prod.hashCode());
		Object obj = new Product("LG","G6","Red",820000);
		System.out.println("������ ù��° ��ü�� �� : "+prod.toString());
		System.out.println("������ �ι�° ��ü�� �� : "+obj.toString());
		System.out.println("==========================================================");
//		System.out.println("������ �� ��ü�� ���� ������? "+prod.equals(obj));
		
		Product prod2 = new Product("Samsung","Galaxy S9","Blue",960000);
		System.out.println(prod.hashCode());
	}

}
