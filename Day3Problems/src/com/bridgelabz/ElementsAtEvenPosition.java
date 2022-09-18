/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class ElementsAtEvenPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] bool= {true,false,true,false,true,false,true,false};
		for(int i=0;i<bool.length;i=i+2)
		{
				System.out.println(bool[i]);
		}
	}

}
