package lec28;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mythread t1 = new Mythread();

t1.run();

//System.out.println(t1.getState());
//t1.start();
//System.out.println(t1.getState());

	}

}
class Mythread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
	}
	
}





//class Mythread extends Thread{
//	@Override
//	public void run() {
//	//	System.out.println(Thread.currentThread().getState());
//	System.out.println("hello"+ Thread.currentThread().getName());
//	}
//}
