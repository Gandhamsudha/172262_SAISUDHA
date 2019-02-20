package com.sts3;

public class RedColor {
	private	int price; 
	private 	String color;

	 private 	String name; 
	
	public RedColor(int price, String color, String name) {
		super();
		this.price = price;
		this.color = color;
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "RedColor [price=" + price + ", color=" + color + ", name=" + name + "]";
	}

	
}
