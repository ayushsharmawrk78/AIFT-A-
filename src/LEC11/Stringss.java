package LEC11;

public class Stringss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int []arr = {1,2,3};
//		
//		int []arr2 = {1,2,3};
//		System.out.println(arr==arr2);
		
//		
//		String s = "hello";
//		String m = "hello";
//		String a = new String ();
//		a="hello";
//		String z = new String("hello");
//		System.out.println(z==a);
//		
//		int []arr = {1,2,3};
//		System.out.println(arr.length);
//		String s ="hello";
//		System.out.println(s.length());
//		System.out.println(s.charAt(0));
//		
//		
//		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i));
//		}
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
		
		int []arr2 = {1,2,3};
		String b = "hello";

String an = b.substring(1);
System.out.println(an);
		
		for (int i = 0; i < b.length(); i++) {
			
			for (int j = i+1; j <=b.length(); j++) {
				System.out.println(b.substring(i,j));
			}
		}
		
		
		
	}

}
