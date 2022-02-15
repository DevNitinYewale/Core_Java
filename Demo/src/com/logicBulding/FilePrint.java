package com.logicBulding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;



public class FilePrint {
	public static void main(String[] args) {
		try {
			
			FileReader fr=new FileReader("../Demo/src/com/logicBulding/simple.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("../Demo/src/com/logicBulding/output.txt");
			String str="";
			int i,cnt=1;
			while((i=br.read())!=-1) {
				str+=(char)i;
				char ch=(char)i;
				if(ch==' ') {
					if(str.length()>2) {
						//System.out.println(cnt+" "+str);
						String s=cnt+" "+str;
						fw.write(s);
						cnt++;
						str="";
					}
				}
				
			}
			//System.out.println("done");
			//fw.write(str);
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
