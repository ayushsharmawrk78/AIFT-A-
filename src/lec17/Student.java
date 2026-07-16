package lec17;

public class Student  {
	
	String name ="kunal";
	int age =20;
	

	
	public void func() {
		System.out.println("hello");
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		
		String a = "Name "+ name + " age "+age;
		return a;
	}
}
