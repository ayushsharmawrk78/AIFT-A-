package lec28;

public class Cat extends Animal implements Runnable{

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
	public static void main(String[] args) {
		Cat c = new Cat();
		
		c.run();// main
		c.start();// mera thread 
	}


}
