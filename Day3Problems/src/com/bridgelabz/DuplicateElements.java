/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class DuplicateElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] characters= {'a','s','d','f','g','j','k','f','a','j','d'};
		
		for(int i=0; i<characters.length-1; i++) {
			int count=0;
			for(int j=i+1; j<characters.length; j++) {
				
				if(characters[i] == characters[j]) {
					count=count+1;
				}
			}
			//System.out.println(count);
			if(count>0) {
				System.out.println(characters[i]);
			}
		}
	}

}
