package lec28;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Mythread t1  = new Mythread();
//t1.run();


Runnable  t = ()->{

	System.out.println("hello from runnable interface"+Thread.currentThread().getName());
	
};
Thread t3 = new Thread (t);
Thread t4 = new Thread (t);
Thread t5 = new Thread (t);
Thread t6 = new Thread (t);
t3.start();
t4.start();
t5.start();
t6.start();
//Mythread t2  = new Mythread(t);
//Runnable c = new Runnable() {
//	
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		
//	}
//};

//t1.start();
Mythread2 t2 = new Mythread2();
t2.run();

	}

}

class Mythread3 extends Thread{
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub

		System.out.println("helllllooooo");
	}
}
class Mythread2 extends Thread{
	
	
}