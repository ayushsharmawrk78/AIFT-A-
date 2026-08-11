package lec26;

import java.util.ArrayList;
import java.util.List;

public class Introtoarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>ll =new ArrayList<>();
int []arr = new int [5];
ll.add(1);
ll.add(2);
ll.add(3);
System.out.println(ll);

ll.add(3,4);
System.out.println(ll);
ll.add(0,3);
System.out.println(ll);
//ll.add(6,7);
ll.remove(0);
List<String >ll2 = new ArrayList<>();
ll.addAll(ll2);
System.out.println(ll.get(2));
ll.set(0, 14);
System.out.println(ll);

	}

}
