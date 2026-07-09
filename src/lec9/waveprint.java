package lec9;

public class waveprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]arr  = {{10,20,30,40},
		
		{50,60,70,80},

		{90,160,170,180},
};

print(arr);
	}
	
	public static void print(int [][]arr) {
		
		
		for (int i = 0; i < arr[0].length; i++) {
			if(i%2==0) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[j][i]+" ");
				}
			}
			else {
for (int j = arr.length-1; j >=0; j--) {		
	System.out.print(arr[j][i]+" ");
				}
			}
			
			System.out.println();
		}
		
	}
	
	
	public static void transpose(int [][]arr) {
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				int temp =arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
				
			}
		}
	}
	
	

}
