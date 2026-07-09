package LEC13;

public class MAXIMUMSUBARRAYSUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	public static int sum(int []arr) {
		
		int max = Integer.MIN_VALUE;
		
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum=0;
			for (int j = i; j < arr.length; j++) {
				sum = sum+arr[j];
				max = Math.max(max, sum);
			}
		}
		return max;
	}
	
	
	public static int maximumsubarray(int []arr) {
		
		int max = Integer.MIN_VALUE;
		
		
		int sum =0;
		
		
		int i =0;
		while(i<arr.length) {
			sum = sum+arr[i];
			
			max = Math.max(max, sum);
			
			
			if(sum<0) {
				sum =0;
				
			}
			
			i++;
			
		}
		
		return max;
		
		
		
		
	}

}
