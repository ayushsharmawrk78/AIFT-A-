package lec26;

public class Threadingintro  {
	
	
	



	public static void main(String[] args) {
		Mythread t1 = new Mythread();
// t1.run(); // oops object // no thread making  
		t1.start();
int a = 10;
int b = 20;
int c = a+b;
System.out.println(c+" "+Thread.currentThread().getName());


	}
	public static void fun() {

		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}

}
class Mythread extends Thread{
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Threadingintro.fun();
	}
}
	
