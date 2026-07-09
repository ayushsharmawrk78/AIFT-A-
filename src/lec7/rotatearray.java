package lec7;

public class rotatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr = {10,20,30,40,50};

rotate(arr, 47);

for (int i = 0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
}





	}
//	public static void rotate(int []arr , int k) {
//		int n = arr.length;
//		
//		 k = k%n;
//		 while(k>0) {
//			 int temp = arr[arr.length-1];
//				
//				for (int i = arr.length-1; i>0; i--) {
//					
//					
//					arr[i]=arr[i-1];
//				}
//				arr[0]=temp; 
//				k--;
//		 }
//		
//		 
//		 
//		
//		
//		
//		
//		
//	}
//	
	
	
	public static void rotate (int []arr  , int k) {
	int n = arr.length;
	k = k%n;
	
	// last k elements
	reverse(arr, n-k, n-1);
	
	// first n-k
	reverse(arr, 0, n-k-1);
	
	// all
	reverse(arr, 0, n-1);
	
	}
	
public static void reverse(int []arr , int i , int j) {
		
	
		
		while(i<=j) {
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		
	}

}
