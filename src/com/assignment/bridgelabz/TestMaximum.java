package com.assignment.bridgelabz;

public class TestMaximum<T extends Comparable<T>> {
	   public T x,y,z;
	    public TestMaximum(T x,T y,T z) {
	    	this.x=x;
	    	this.y=y;
	    	this.z=z;
	    }
	
	    //generic method
		public static <T extends Comparable<T>> void findMaximum(T... arr) {
			 T max=arr[0];
		        for(int i =1;i<arr.length;i++){
		            if(arr[i].compareTo(max)>0){
		                max=arr[i];
		            }
		        }
				System.out.println("Maximum value is "+max);
		
		}
		
		
		public static void main(String[] args) {
			
			 Integer intArray1[]= {3,4,5,7,8};           // Test Case 1
			 Float   floatArray2[]= {4.5f,4.4f,4.8f,4.2f};     //Test Case  2
			 String  stringArray3[]= {"Apple","Caurlipower","Peach","Banana"};   //Test case2
			
			
		     //calling generic method
		     //Test case 1
			 findMaximum(intArray1);
			 findMaximum(floatArray2);
			 findMaximum(stringArray3);

		}
}

	
