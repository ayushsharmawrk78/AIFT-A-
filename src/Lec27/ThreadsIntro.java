package Lec27;

public class ThreadsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a =10;
//		int b =20;
//		int c =a+b;
//		System.out.println(c);
//		
//		int a1 =10;
//		int b1 =20;
//		int c1 =a1/b1;
//		System.out.println(c1);
//	
		System.out.println(Thread.currentThread());
		fun();
		
	}
	public static void fun() {
		System.out.println(Thread.currentThread());	
	}

}
