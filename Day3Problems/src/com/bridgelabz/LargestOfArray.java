/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class LargestOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {1,8,7,9,2,4,67,5,6,5,3,10};
		
		int max=data[0];
		for(int i=1;i<data.length;i++) {
			if(max<data[i]) {
				max=data[i];
			}
		}
		
		System.out.println("Largest Element of array : "+max);

	}

}
