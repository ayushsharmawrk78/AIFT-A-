package Lec16;

public class Exceptionpropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fun(20);
	}
	
	
	public  static void fun(int a) {
		
		try {
			fun2();
		} catch (Exception e) {
			// TODO: handle exception
			
e.printStackTrace();
		}
	}
	
	public static void fun2() {
		
		fun3();
		
	}
	
	public static void fun3() {
		fun4();
	}
	
	public static void fun4() {
		
		int a =10/0;
	}

}
