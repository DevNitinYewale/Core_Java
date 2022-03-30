package com.chg.exmp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String artist_name=br.readLine();
		int artist_birth=Integer.parseInt(br.readLine());
		int artist_death=Integer.parseInt(br.readLine());
		
		String album_title=br.readLine();
		int album_year=Integer.parseInt(br.readLine());
		
		Albums al=new Albums(artist_name,artist_birth,artist_death,album_title,album_year);
		System.out.println(al.toString());
		
	}

}
