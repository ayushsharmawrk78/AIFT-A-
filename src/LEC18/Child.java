package LEC18;

public class Child  {
   static {
	   System.out.println("hello i am in static block");
   }
	
	String name ="dev";
//	public static  void fun() {
//		fun2();
//		
//	}
public   void fun2() {
	System.out.println(this.name);
	fun();	
		
	}
	
}
