package lec12;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []freq = new int [26];
		String s = "aafcaaaffvv";


		for (int i = 0; i <s.length(); i++) {
			int ch = s.charAt(i);
			int idx = ch-97;
			freq[idx]=freq[idx]+1;
		}
		
	String m ="";
	
	for (int i = 0; i < s.length(); i++) {
		int indx = s.charAt(i)-97;
		
		if(freq[indx]>1) {
			m = m+s.charAt(i);
			freq[indx]=-1;
			
		}
	}
		System.out.println(m);
		
	}
	
public static void bubblesort(int []arr) {
		

		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length-turn; i++) {			
				if(isbig(arr[i]+"", arr[i+1]+"")) {					
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
	
			}	
				}
}
public static boolean isbig(String a , String  b) {

	String m1 = a+b;
	String m2 = b+a;
	
	if(Integer.parseInt(m2)>Integer.parseInt(m1)) {
		return true;
	}
	
	return false;

}

}
