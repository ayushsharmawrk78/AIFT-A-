package Lec6;

public class Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =20;
int b =30;
//System.out.println(a+"   "+b);
//swap(a, b);
//System.out.println(a+"   "+b);

int []arr = {10,20,30,40,50};
//System.out.println(arr[0]+"   "+arr[1]);
//swap(arr[0], arr[1]);
//System.out.println(arr[0]+"   "+arr[1]);
System.out.println(arr[0]+"   "+arr[1]);
swap2(arr);
System.out.println(arr[0]+"   "+arr[1]);

System.out.println(arr.length);
	}
	
	public static void swap(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void swap2(int []arr ) {
		int temp = arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}

}
