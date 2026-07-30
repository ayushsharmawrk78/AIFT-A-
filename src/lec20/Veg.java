package lec20;

public class Veg extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Veg obj = new Veg();
obj.eat();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("you are a vegeterian");
	}

}
