/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class SecondLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {55,8,70,94,21,4,67,1,6,200,3,10};
		
		int max1=numbers[0], max2=numbers[0];
		
		for(int i=1; i<numbers.length; i++) {
			if(max1<numbers[i]) {
				max2=max1;
				max1=numbers[i];
			}
		}
		
		System.out.println("Second Largest Number in Array is "+max2);
	}

}
