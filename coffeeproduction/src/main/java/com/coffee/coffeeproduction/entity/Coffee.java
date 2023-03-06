package com.coffee.coffeeproduction.entity;

public class Coffee {
	
	private int price;
	private String name;
	
	//Add getter setter method
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Create the constructor
	public Coffee(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//create the toString
	@Override
	public String toString() {
		return "Coffee [price=" + price + ", name=" + name + "]";
	}
	

}


