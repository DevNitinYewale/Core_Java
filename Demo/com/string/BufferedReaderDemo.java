package com.string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.print("Enter Your name: ");
		String str=br.readLine();
		System.out.print("Enter your age: ");
		int age=Integer.parseInt(br.readLine());
		
		System.out.println("Your name is: "+str);
		System.out.println("Your age is: "+age);
		
		
		FileReader fr=new FileReader("../Demo/src/com/string/simple.txt");
		BufferedReader br2=new BufferedReader(fr);
		int i;
		System.out.println("File Data: ");
		while((i=br2.read())!=-1) {
			System.out.print((char)i);
		}
br.close();
br2.close();
	}

}
