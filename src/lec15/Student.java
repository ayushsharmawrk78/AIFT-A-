package lec15;

public class Student {
	

 private String name = "kunal";

  private int age =24;


 public Student(String name , int age) {
	 if(age<0) {
		 System.out.println("age cannot be -ve");
		 return;
	 }
	 this.name= name;
	 this.age= age;
 }
 public Student() {
	 
 }
 
 
 public void setage(int age) {
	 
	 if(age<0) {
		
		 System.out.println("hello your age is -ve and cannot be set");
		 return;
	 }
	 this.age = age;
 }

 public int getage() {
return this.age;
 }
 
 
 public String getname() {
	 return this.name;
 }

}
