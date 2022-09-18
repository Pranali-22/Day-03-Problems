/**
 * 
 */
package com.bridgelabz;

/**
 * @author Dell
 *
 */
public class ElementsAtOddPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] bool= {true,false,true,false,true,false,true,false};
		for(int i=1;i<bool.length;i=i+2)
		{
				System.out.println(bool[i]);
		}
	}

}
