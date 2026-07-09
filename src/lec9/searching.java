package lec9;

public class searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][]arr = {
				
				{10,20,30,40},
				{50,60,70,80},
				{90,160,170,180},
				{250,260,270,280}
		};
		System.out.println(search(arr, 700));
		
	}
	
	public static boolean search (int [][]arr  , int target) {
		
		
		int row = 0;
		int col = arr[0].length-1;
		while(col>=0&&row<arr.length) {
			if(arr[row][col]==target) {
				return true;
			}else if (arr[row][col]<target) {
				row++;
			}else {
				col--;
			}
		}
		
		
		return false;
		
	}

}
