/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class FrequencyOfElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data= {1,8,7,9,2,4,2,5,5,6,5,9,3};
		int[] frequency= {0,0,0,0,0,0,0,0,0,0};
		
		for(int i=0;i<data.length;i++) {
			frequency[data[i]]+=1;
		}
		
		for(int i=0;i<frequency.length;i++) {
			System.out.println("Frequency of "+i+" is"+frequency[i]);
		}
		

	}

}
