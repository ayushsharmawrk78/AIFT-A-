package lec28;

public class Animal extends Thread{
public static void main(String[] args) {
	Animal m = new Animal();
	m.eat();//main
	m.run();// main
	m.start(); /// mera thread
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("helllooo in run");
	eat();
	}
	public void eat() {
		System.out.println("eating in animal class"+Thread.currentThread().getName());
	}
}
