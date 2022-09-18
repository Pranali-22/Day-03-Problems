/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers= {1.6,7.4,5.0,28.4,40.2,17.6,68.4,55.7,109.25};
		for(int i=numbers.length-1; i>=0; i--) {
			System.out.println(numbers[i]);
		}
	}

}
