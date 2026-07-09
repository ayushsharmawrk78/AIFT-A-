package lec5;

public class functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int  a = 10;
//int  b =20;
//int c = a+b;
//System.out.println(c);
//
//int m = 200;
//int n  = 201;
//int n2 = n+m;
//
//fun();
//fun2(20, 30);
//fun2(23, 300);
//fun2(210, 300);



int m =fun3(10,20);

System.out.println(m/2);
	}
	public static void fun() {
		int a = 20;
		int b = 40;
		System.out.println(a+b);
	}
	
	public static void fun2(int a , int b) {
		
		
		int c = a+b	;
		System.out.println(c);
	}
	
	public static int fun3(int a , int b) {
		int c = a+b;
		return c;
	}
	
public static int fun4() {
	return 10+20;
}

}
