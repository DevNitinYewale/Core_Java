package com.collection.comparable;
/*
 *create Student class and implements it comparable interface.
 *comparable interface is used for sort the data ascending or descending order. 
 * */
public class Students implements Comparable<Students> {
	/*
	 * declare three variable 
	 * */
	private int date;
	private String name;
	private String major;
	
	
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public Students(int date, String name, String major) {
		super();
		this.date = date;
		this.name = name;
		this.major = major;
	}

	/*
	 * I sorted the data ascending order by student admission date
	 * sort data using compareTO() predefine methods in comparable interface
	 * */
	
	@Override
	public int compareTo(Students obj) {
		// TODO Auto-generated method stub
		if(date==obj.date) {
			return 0;
		}
		
		else if(date>obj.date) {
			return 1;
		}
		
		else {
			return -1;
		}

	}	
	
}