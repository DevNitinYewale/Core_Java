package com.chg.exmp;


public class Artist {
	/*declare variables */
	private String a_Name;
	private int birth;
	private int death;
	
	/*default constructor*/
	public Artist() {
		a_Name="none";
		birth=0;
		death=0;
	}

	/*Parameterized constructor*/
	public Artist(String a_Name, int birth, int death) {
		this.a_Name = a_Name;
		this.birth = birth;
		this.death = death;
	}

	/*toString method for displaying artist information*/
	@Override
	public String toString() {
		if(death<0)
			return "Artist: "+ a_Name + ", born " + birth;
		else
			return "Artist: "+ a_Name + "("+ birth+ "-"+ death+")";
	}
	
}