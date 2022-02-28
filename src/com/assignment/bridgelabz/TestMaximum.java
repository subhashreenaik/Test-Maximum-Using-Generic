package com.assignment.bridgelabz;

public class TestMaximum {
	public static void findMaximum(String[] arr) {
		String max="A";
		for(int i=0;i<arr.length;i++) {
			if(arr[i].compareTo(max) >0 ){
				max = arr[i];
			}
	
		}
		System.out.println("Max string is "+max);
		
	
	}
	public static void main(String[] args) {
	 String stringArray1[]= {"Peach","Apple","Banana"};           // Test Case 1
	 String stringArray2[]= {"Apple","Caurlipower","Banana"};     //Test Case  2
	 String stringArray3[]= {"Apple","Caurlipower","Peach"};     //Test Case  3
	 
	 //Find Maximum float Value
	 findMaximum(stringArray1);
	 findMaximum(stringArray2);
	 findMaximum(stringArray3);

	}

}


