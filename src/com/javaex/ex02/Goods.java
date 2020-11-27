package com.javaex.ex02;

public class Goods {

	//field
	private String name;
	private int price;

	//constructor 
	public Goods(String name) {
		super();
		this.name = name;
	}
	
	//getter-setter
	public String getName() {
		return name;
	}

	public Goods() {
		super();
	}
	
	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;

	}
//getter-setter 
	void setName(String string) {  
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public void showInfo() {
		System.out.println("상품명:" + name + ", 가격:" + price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
}








