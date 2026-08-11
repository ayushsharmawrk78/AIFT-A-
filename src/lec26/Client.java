package lec26;

import java.util.ArrayList;
import java.util.HashMap;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//MyArrayList ll = new MyArrayList();
//
//ll.add(1);
//ll.add(2);
//ll.add(3);
//ll.add(4);
//ll.add(5);
//ll.add(6);
//
//
//ll.add(8,10);
//System.out.println(ll);
//
//MyArrayList ll2 = new MyArrayList();

A<String,Boolean> object = new A<>("ayush");

System.out.println(object.obj);
object.setvalue(true);
System.out.println(object.fun());

object.fun2(0, true);



	}

}
