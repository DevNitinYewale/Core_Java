package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) {
		Employee e=new Employee(1, "nitin");
		try {
			FileOutputStream fout=new FileOutputStream("../Demo/src/com/serialization/MyFile.ser");
			ObjectOutputStream os=new ObjectOutputStream(fout);
			os.writeObject(e);
			fout.close();
			System.out.println("Serializable data saved in Myfile.ser");
		} catch (IOException e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
}
