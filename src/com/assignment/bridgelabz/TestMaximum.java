package com.assignment.bridgelabz;

public class TestMaximum {
	//generic method
		public static<T extends Comparable<T>> void findMaximum(T x,T y,T z) {
			T max = x;
			if(y.compareTo(max)>0) {
				max = y;
			}
		    if(z.compareTo(max)>0) {
		    	max=z;
		    }	
			System.out.println("Maxumum is "+ max);
		}
		
		
		public static void main(String[] args) {
			
		 Integer xint=3,yint=4,zint=5;
		 Float   xf1=6.6f,yf1=8.8f,zf1=7.7f;
		 String xstr="pear",ystr="apple",zstr="orange";
		 
		 //calling generic method
		 //Test case 1
		 findMaximum(xint,yint,zint);
		 findMaximum(xf1,yf1,zf1);
		 findMaximum(xstr,ystr,zstr);
		 
		 //Test case 2
		 findMaximum(yint,xint,zint);
		 findMaximum(yf1,xf1,zf1);
		 findMaximum(ystr,xstr,zstr);
		 
		 //Test case 3
		 findMaximum(xint,zint,yint);
		 findMaximum(xf1,zf1,xf1);
		 findMaximum(zstr,ystr,xstr);
		 

		}

	}
