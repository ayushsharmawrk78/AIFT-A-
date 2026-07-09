package Lec6;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {10,20,30,40,50,60};


System.out.println(search(arr, 600));
	}
	
	public static int search(int []arr , int target) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void runningsum(int []arr) {
		
	
		for (int i = 1; i < arr.length; i++) {
			arr[i]= arr[i-1]+arr[i];
		}
	}

}
