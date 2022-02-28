package com.assignment.bridgelabz;

public class TestMaximum {

	public static void findMaximum(Integer[] arr) {
		int max=0;
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		System.out.println("Max value is "+max);
		
	}
	public static void main(String[] args) {
	 Integer intArray1[]= {45,32,2};
	 Integer intArray2[]= {7,32,2};
	 Integer intArray3[]= {18,32,78};
	 
	 findMaximum(intArray1);
	 findMaximum(intArray2);
	 findMaximum(intArray3);

	}

}
