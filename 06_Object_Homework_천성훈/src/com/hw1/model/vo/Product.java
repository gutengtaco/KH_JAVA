package com.hw1.model.vo;

public class Product {
//	鞘靛何
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
//	积己磊何
	public Product() {}
	public Product(String productId, String productName,
			String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
//	皋家靛何
//	setter 皋家靛
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
//	getter皋家靛
	public String getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductArea() {
		return productArea;
	}
	public int getPrice() {
		return price;
	}
	public double getTax() {
		return tax;
	}
//	information
	public String information() {
		return "力前ID : " + productId + ", 力前 捞抚 : "+ productName+
				", 力前 瘤开 : "+productArea + ", 力前 啊拜 : "+price+", 何啊技 : "+tax;
	}
	
}
