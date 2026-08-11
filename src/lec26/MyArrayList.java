package lec26;

import java.util.Arrays;

public class MyArrayList {
  private int []arr ;
 private int lasti =0;
 
 public MyArrayList() {
	 arr = new int [5];
 }
 
 public void add(int element) {

	 if(lasti==arr.length) {
		int [] arr2 = new int [arr.length*2];
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[i];
			
		}
		
		arr=arr2;
		
	 }
	 

	 arr[lasti]=element;
	 lasti++;
 }
 public void add(int index , int element) throws Exception {

	 if(lasti==index &&lasti==arr.length) {
		int [] arr2 = new int [arr.length*2];
		
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=arr[i];
			
		}
		
		
arr = arr2;
		
	 }if(index>lasti) {
			throw new Exception("Array list index cannot skip");
		}
	 
	 


	 if(lasti==index) {
		 arr[index]=element;
		 lasti++;
	 }
arr[index]=element;
 }

 @Override
	public String toString() {
		// TODO Auto-generated method stub
String a = "";
a=a+"[";
for (int i = 0; i < arr.length; i++) {
	a = a+arr[i]+", ";
}
a=a+"] hello";
return a;


	}


}
