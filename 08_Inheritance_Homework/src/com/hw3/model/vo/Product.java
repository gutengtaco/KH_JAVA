package com.hw3.model.vo;

public class Product {
//	鞘靛何
	private String brand;
	private String name;
	private String color;
	private int price;
	private Product prod;
//	积己磊何
	public Product() {
		super();
	}

	public Product(String brand, String name, String color, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.price = price;
	}
//	getter,setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "brand=" + brand + ", name=" + name + ", color=" + color + ", price=" + price ;
	}
	@Override
	public boolean equals(Object obj) {
		boolean result;
			if(result = obj.toString().equals(prod.toString())) {
				result = obj.toString().equals(prod.toString());
			}else {
				result = obj.toString().equals(prod.toString());
			}
			return result;
			
	}
	@Override
	public int hashCode() {
		Integer i = price;
		return (brand.hashCode()+name.hashCode()+color.hashCode()+i.hashCode());
	}
	

	
}
