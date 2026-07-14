package Lec16;

public class Student {
String name ="kunal";
 private int age =24;
 
 public void setage(int age) throws Exception {
	 if(age<0) {
		 
		throw new Exception(" age cannot be -ve");
	 }
	this.age=age;
 }
 public int getage() {
	 
	 
	return this.age;
	 }
}
