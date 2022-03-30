package com.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee e=null;
		
		try {
			FileInputStream fin=new FileInputStream("../Demo/src/com/serialization/MyFile.ser");
			ObjectInputStream ois=new ObjectInputStream(fin);
			e=(Employee) ois.readObject();
			ois.close();
			fin.close();
		} catch (IOException e2) {
			// TODO: handle exception
			e2.printStackTrace();
			return;
		}
		catch(ClassNotFoundException ec) {
			ec.printStackTrace();
			return;
		}
		System.out.println("Deserializable data: ");
		System.out.println("Emp ID: "+e.getId());
		System.out.println("Emp Name: "+e.getName());
		
	}

}
