package LEC3;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);


int n  = in.nextInt();
int fact =0;
int i=2;

while(i<n) {
	if(n%i==0) {
		fact++;
		i++;
	break;
	}
	System.out.println("hello");
	
	i++;
}

if(fact>=1) {
	System.out.println("NON PRIME");
}else {
	System.out.println("PRIME");
}
	}

}
