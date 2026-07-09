package Lec8;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []arr = {-10,-20,-30,-40,-50};
		System.out.println(max(arr));
	}
	
	public static int min(int []arr) {
		int min = Integer.MAX_VALUE;// + infinity
				;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int max(int []arr) {
		int min =Integer.MIN_VALUE; // - inifinity 
				;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>min) {
				min = arr[i];
			}
		}
		return min;
	}
	

}
