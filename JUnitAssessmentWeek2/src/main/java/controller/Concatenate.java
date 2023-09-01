
/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 1, 2023
 */
package controller;


public class Concatenate {
	
	public static void main(String[] args) {
		Concatenate can = new Concatenate();
		System.out.println(can.concatString("val", "erie"));
		System.out.println(can.concatChar('V', 'U'));
		System.out.println(can.minimumAge(37));
		
	}

	/**
	 * @param i
	 * @return 
	 */
	boolean minimumAge(int i) {
		// TODO Auto-generated method stub
		if (i <= 18) {
			return true;
		}
		return false;
	}

	/**
	 * @param c
	 * @param d
	 */
	String concatChar(char c, char d) {
		// TODO Auto-generated method stub
		return Character.toString(c) + Character.toString(d);
	}

	/**
	 * @param string
	 * @param string2
	 */
	String concatString(String string, String string2) {
		// TODO Auto-generated method stub
		return string.concat(string2);
	}
	
	
	
}