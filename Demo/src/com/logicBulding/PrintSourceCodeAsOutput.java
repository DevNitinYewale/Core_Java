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
/*
 * There are N coins kept on the table, numbered from 0 to N - 1. Initially, each coin is kept tails up. You have to perform two types of operations:

1) Flip all coins numbered between A and B inclusive. This is represented by the command "0 A B"

2) Answer how many coins numbered between A and B inclusive are heads up. This is represented by the command "1 A B".

Input :
Sample Input :
4 7
1 0 3
0 1 2
1 0 1
1 0 0
0 0 3
1 0 3 
1 3 3

Sample Output :
0
1
0
2
1

Constraints :
1 <= N <= 100000
1 <= Q <= 100000
0 <= A <= B <= N - 1

 *  
 */