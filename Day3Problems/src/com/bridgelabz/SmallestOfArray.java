/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class SmallestOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {100,8,7,9,4,67,5,6,5,3,10};
		
		int min=data[0];
		for(int i=1;i<data.length;i++) {
			if(min>data[i]) {
				min=data[i];
			}
		}
		
		System.out.println("Smallest Element of array : "+min);


	}

}
