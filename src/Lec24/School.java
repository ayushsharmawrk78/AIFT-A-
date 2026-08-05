package Lec24;

public class School {
String name ;
String address;
Student []arr ;
Employee []arr2;
int lasts=0;
int laste =0;

public School(String name , String address  , int ns , int ne) {
	this.name=name;
	this.address=address;
	arr = new Student[ns];
	arr2 = new Employee[ne];
}

public void addstudent(String name , int age) throws Exception {
	if(lasts ==arr.length) {
		throw new Exception("school is full");
	}
	
	Student s = new Student(name);
	s.setage(age);
	arr[lasts]=s;
	lasts++;
}
public void addemployee(String name , int eid) throws Exception {
	if(laste ==arr2.length) {
		throw new Exception("schools employee are done");
	}
	
	for (int i = 0; i <laste; i++) {
		if(arr2[i].eid==eid) {
			throw new Exception("already id exist");
		}
	}
	Employee e = new Employee();
	e.name=name;
	e.eid=eid;
	arr2[laste]=e;
	laste++;
	
	
}

public void Display() {
	System.out.println(name);
	System.out.println(address);
	
	System.out.println("STUDENTS");
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println("name --->"+arr[i].name+" age is --->"+arr[i].getage());
	}
	System.out.println("Employes");
	for (int i = 0; i < arr2.length; i++) {
		System.out.println("name --->"+arr2[i].name+" id is --->"+arr2[i].eid);
	}
}



}
