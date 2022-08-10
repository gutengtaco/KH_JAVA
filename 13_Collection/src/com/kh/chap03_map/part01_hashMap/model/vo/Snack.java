package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {
	
	
//	鞘靛何
	private String flavor;
	private int calorie;
	
//	积己磊何
	public Snack() {
		super();
	}
	public Snack(String flavor, int calorie) {
		super();
		this.flavor = flavor;
		this.calorie = calorie;
	}
	
//	皋家靛何
//	getter,setter
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
//	toString
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calorie=" + calorie + "]";
	}

	
}
