package com.assignment.bridgelabz;

public class TestMaximum<T extends Comparable<T>> {
	   public T x,y,z;
	    public TestMaximum(T x,T y,T z) {
	    	this.x=x;
	    	this.y=y;
	    	this.z=z;
	    }
	
	    //generic method
		public static <T extends Comparable<T>> T findMaximum(T x,T y,T z) {
			T max = x;
			if(y.compareTo(max)>0) {
				max = y;
			}
		    if(z.compareTo(max)>0) {
		    	max=z;
		    }
			return max;	
		
		}
		//Display the output
		public void display() {
			T maximum = findMaximum(x,y,z);
			System.out.println("Maximum value is "+maximum);
		}
		
		public static void main(String[] args) {
			
			TestMaximum<Integer> intt = new TestMaximum<Integer>(3,4,5);
			TestMaximum<Float> floatt = new TestMaximum<Float>(3.5f,3.7f,3.8f);
			TestMaximum<String> tm = new TestMaximum<String>("Apple","Peach","Caurliflower");
			
			
		 //calling generic method
		 //Test case 1
		 intt.display();
		 floatt.display();
		 tm.display();
		 

		}
}

	
