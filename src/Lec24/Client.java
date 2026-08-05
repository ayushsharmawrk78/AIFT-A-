package Lec24;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
School s = new School("chitkara", "rajpura", 4, 2);

s.addstudent("dhruv", 21);
s.addstudent("aryan", 23);
s.addstudent("ishpreet", 23);
s.addstudent("aryan", 23);

s.addemployee("naman", 1);
s.addemployee("naman2", 2);


s.Display();
	}

}
