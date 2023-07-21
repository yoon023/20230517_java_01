package com.kh.practice.snack.model.vo;

public class Snack {
	private String kind;  // 종류
	private String name; // 이름
	private String flavor;  // 맛
	private int numOf; // 개수
	private int price; // 가격
	private String ans;// 정보확
	
	public Snack() {
	}
	public Snack(String kind,String name,String flavor,int numOf,int price,String ans) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
		this.ans = ans;
	}

	public String information() {
		//TODO
		return "Snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numOf=" + numOf + ", price=" + price
				+ "]";
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getNumOf() {
		return numOf;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAns() {
		return ans;
		
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
}


















