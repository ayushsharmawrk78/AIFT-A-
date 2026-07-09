package LEC3;

import java.util.Scanner;

public class SOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);

//int n = in.nextInt();
//int sum =0;
//while(n!=0) {
//	int rem = n%10;
//	
//	sum = sum+rem;
//	
//	n = n/10;
//	
//}
//System.out.println(sum);


int num = in.nextInt();


int a = num;


int count =0;
while(num!=0) {
	int rem = num%10;
	count++;
	num = num/10;
}
num =a;

int sum =0;
while(num!=0) {
	int rem = num%10;
	sum = sum + (int )(Math.pow(rem, count));
	
	num = num/10;
}

if(sum==a) {
	System.out.println("yes");
}else {
	
	System.out.println("no");
}
	}
	
	

}
