package com.hw3.model.vo;

import com.hw3.controller.ProductController;

public class Product {
//	鞘靛何
	private int pId;
	private String pName;
	private int price;
	private double tax;
	
//	积己磊何
	public Product() {
		ProductController pc = new ProductController();
		pc.count++;
	}
	public Product(int pId, String pName, int price, double tax) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
	}
//	皋家靛何
//	setter
	public void setpId(int pId) {
		this.pId = pId;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
//	getter
	public int getpId() {
		return pId;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public double getTax() {
		return tax;
	}
//	info
	public String information() {
		return "力前锅龋 : "+pId+", "+"力前疙 : "+pName+", "+"力前啊拜 : "+price+", "+"力前技陛 : "+tax;
	}
	
}
