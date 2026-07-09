package LEC3;

public class Mirroring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 5;

//int star=1;
//int row =1;
//while(row<=(2*n)-1) {
//	
//	int st =0;
//	while(st<star) {
//		System.out.print("* ");
//		st++;
//	}
//	
//	if(row<n) {
//		star++;
//	}else {
//		star--;
//	}
//	
//	System.out.println();
//	row++;
//	
//}
//
//int row= 1;
//int space =0;
//
//int star =n;
//
//while(row<=(2*n)-1) {
//	
//	int sp =0;
//	while(sp<space) {
//		System.out.print(" ");
//		sp++;
//	}
//	
//	int st =0;
//	while(st<star) {
//		System.out.print("*");
//		st++;
//	}
//	
//	
//
//	System.out.println();
//	if(row<n) {
//		space=space+2;
//		star = star-1;
//	}
//	else {
//		space=space-2;
//		star = star+1;
//	}
//	
//	row++;
//}



int row =1;
int space = n-1;
int star =1;
int val =1;
while(row<=n) {
	
	
	int sp =0;
	while(sp<space) {
		System.out.print(" ");
		sp++;
	}
	
	
	int st =0;
	val =row;
	while(st<star) {
		System.out.print(val);
		st++;
		if(st<=star/2) {
			val++;
		}else {
			val--;
		}
		
	}
	System.out.println();
	row++;
	star+=2;
	space--;
}
	}

}
