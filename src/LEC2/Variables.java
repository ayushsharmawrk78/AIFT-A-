package LEC2;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a  =10 ;
//		
//	
//		
//		int b =20;
//		int c  =a+b;
//		System.out.print(c);
//		
//		System.out.println("hello");
//		
	Scanner in = new Scanner(System.in);
//		
//		
//		int m = in.nextInt();
//		System.out.println(m);
//		
//		
//		System.out.println(1);
		int n =5;
		
		
//		int i =0;
//		while(i<n) {
//			System.out.println(i);
//			i++;
//		}
//		
//		System.out.println("* * * * *");
		
//		int i =0;
//		while(i<n) {
//			System.out.print("* ");
//			i++;
//		}
		
		
		
		
		int row=1;
		int val =10;
		while(row<=n) {
			
			
			int star =0;
			while(star<row) {
				System.out.print(val+ " ");
				val = val*2;
				star++;
			}
			System.out.println();
			row++;
		}
//		int row =1;
//	int star=n;
//		while(row<=n) {
//			
//			
//			int st =0;
//			while(st<star) {
//				System.out.print("* ");
//				st++;
//			}
//			System.out.println();
//			row++;
//			star--;
//		}
		
		
//		int row =1;
//		int space = n-1;
//		
//		while(row<=n) {
//			
//			
//			int sp =0;
//			while(sp<space) {
//				System.out.print(" ");
//				sp++;
//			}
//			
//			int st =0;
//			while(st<row) {
//				System.out.print("*");
//				st++;
//			}
//			System.out.println();
//			row++;
//			space--;
//			
//		}

		int space = n-2;
		while(row<=n) {
			
			
			if(row==1 || row==n) {
				
				int star = 0;
				while(star<n) {
					System.out.print(" * ");
					star++;
				}
				
				System.out.println();
			}else {
				
				
				System.out.print(" * ");
				
				int sp =0;
				while(sp<space) {
					
					System.out.print("   ");
					sp++;
				}
				System.out.print(" * ");
				System.out.println();
			}
			row++;
		}
	
}}
	


