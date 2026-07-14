package Lec16;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Multipletrycatch {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		
		//FileReader fs  = new FileReader("abc.txt");
		
		
		
//		int []arr = new int [5];
//		System.out.println(arr[6]);
//		int a =10/0;
		
		
		
		
		
		try {
		int []arr = new int [10];
			
			System.out.println(arr[21]);
			
			int a= 10/0;
			
	
			
			
		} catch (ArithmeticException e1) {
			// TODO: handle exception
			System.out.println("hello i am in e1 arithmetic");
		}
		catch (IndexOutOfBoundsException e2) {
			// TODO: handle exception
			System.out.println("hello i am in e1 index");
		}
		finally {
			System.out.println("hellloooooooo");
		}
	}

}
