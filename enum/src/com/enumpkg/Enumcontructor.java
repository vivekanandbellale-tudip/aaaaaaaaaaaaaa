package com.enumpkg;

public enum Enumcontructor {
 KF(70),KO(90),RC(),FC;
	int price;
	private Enumcontructor(int price) {
		// TODO Auto-generated constructor stub
		this.price = price;
	}
	private Enumcontructor( ) {
		// TODO Auto-generated constructor stub
		this.price = 65;
	}
	public int getPrice()
	{
		return price;
	}
}
