/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class AscendingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {55,8,70,9,21,4,67,1,6,200,3,10};
		int temp;
		
		for(int i=0;i<numbers.length-1; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i]>numbers[j]) {
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
			
		
		System.out.println("Ascending order of the array");
		for(int i=0;i<numbers.length; i++) {
			System.out.print(numbers[i]+"\s");
		}
		
		
	}

}
