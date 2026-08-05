package lec23;

public class Demo {
	static int a =10;
	int m = 20;
	
	static {
a=a+10;
		
	}
	static {
a= a+10;
		
	}
	public Demo() {
		this(a);
		m++;
		a++;	
	}
	public Demo(int x ) {
		x++;
		m++;
		System.out.println(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d = new Demo();
System.out.println(d.a);
System.out.println(d.m);
Demo d1 = new Demo();
System.out.println(d1.a);
System.out.println(d1.m);

	}

}
