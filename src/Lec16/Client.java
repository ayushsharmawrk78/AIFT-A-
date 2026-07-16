package Lec16;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Client {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
//		
//		int []arr  = new int [2000000000000];
//		
//		int a =10;
//		int a =20;
//		System.out.println("hello");
//	int a = 10/0;
//		System.out.println("hello");
//		
	//	FileReader fs = new FileReader("abc.txt");
//		
//		int []arr = new int [5];
//		System.out.println(arr[6]);
		

Student s = new Student();

s.name="aadit";
try {
	s.setage(-23);
	
	
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();

}
System.out.println("hello");






	}

}
