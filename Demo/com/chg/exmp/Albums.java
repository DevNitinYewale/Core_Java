package com.chg.exmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Albums extends Artist {
	/*declare a variable: */
	private String title;
	private int year;
	
	/*default constructor*/
	public Albums() {
		super();
		title="none";
		year=0000;
	}

	/*Parameterized constructor*/
	public Albums(String a_Name, int birth, int death, String title, int year) {
		super(a_Name, birth,death);
		this.title = title;
		this.year = year;
	}

	/*toString method for printing data*/
	@Override
	public String toString() {
		/*super.toString() print artist inforamtion*/
		System.out.println(super.toString());
		return "Title : " + title + ", " + year ;
	}

	/*Driver code*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*is used for getting input from user:*/
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String artist_name=br.readLine();
		int artist_birth=Integer.parseInt(br.readLine());
		int artist_death=Integer.parseInt(br.readLine());
		
		String album_title=br.readLine();
		int album_year=Integer.parseInt(br.readLine());
		
		/*create child class object and it pass all arguments*/
		Albums al=new Albums(artist_name,artist_birth,artist_death,album_title,album_year);
		/*printing data*/
		System.out.println(al.toString());
		
	}
	
}