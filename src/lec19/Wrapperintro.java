package lec19;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Wrapperintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;

Integer a1 = 10;

Byte b =10;
String m = a1.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(a1));
System.out.println(m);
System.out.println(a1);

int []arr = new int [4];;




	}

}
