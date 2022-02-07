package com.collection.comparable;

public class Bean_Class implements Comparable {
	String color;
	String brand;
	double price;
	public Bean_Class(String color,String brand, double price) {
		this.color=color;
		this.brand=brand;
		this.price=price;
	}
	
	
	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}


	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Bean_Class bn=(Bean_Class) obj;
		if(price==bn.price) {
			return 0;
		}
		else if(price>bn.price) {
			return 1;
		}
		else {
			return -1;
		}
			
	}

}
