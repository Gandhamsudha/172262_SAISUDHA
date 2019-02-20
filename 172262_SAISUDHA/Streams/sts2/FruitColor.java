package com.sts2;

public class FruitColor {
	
		 private 	String name; 
		 private	int calories;
		 
		private	int price; 
		private 	String color;
		public FruitColor(String name, int calories,String color) {
			super();
			this.name = name;
			this.calories = calories;
			//this.price = price;
			this.color = color;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getCalories() {
			return calories;
		}
		public void setCalories(int calories) {
			this.calories = calories;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		@Override
		public String toString() {
			return "Fruit [name=" + name + ", calories=" + calories + ", color=" + color + "]";
		}
	
		}

