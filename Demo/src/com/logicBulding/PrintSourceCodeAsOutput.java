package com.logicBulding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintSourceCodeAsOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		FileReader fr=new FileReader("../Demo/src/com/logicBulding/PrintSourceCodeAsOutput.java");
		BufferedReader br=new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1) {
			System.out.print((char) i);
		}
		
	br.close();
		}catch(FileNotFoundException as ) {
			System.out.println("File not found: "+as);
		}
	}
}