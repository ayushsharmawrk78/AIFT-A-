package Lec4;

import java.util.Scanner;

public class Dectobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
int n= in.nextInt();


int mul = 1;
int ans = 0;
while(n!=0) {
	
	int rem = n%2;
	ans = ans +mul*rem;
	n = n/2;
	mul= mul*10;
}
System.out.println(ans);

	}

}
