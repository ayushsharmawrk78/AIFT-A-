package lec12;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "1234";


System.out.println(Integer.parseInt(s));
System.out.println(ispalindrome(s));
	}
	public static boolean ispalindrome(String s) {
		
		int i =0;
		int j =s.length()-1;
		while(i<=j) {
			
			if(s.charAt(i)==s.charAt(j)) {
				i++;
				j--;
			}
			else {
				return false;
			}
			
		}
		
		return true;
	}

}
