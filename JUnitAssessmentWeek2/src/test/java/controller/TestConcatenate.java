
/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 1, 2023
 */
package controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


import org.junit.Test;


public class TestConcatenate {

	
	@Test
	public void testConcatString() {
		Concatenate can = new Concatenate();
		assertEquals("Thomas", can.concatString("Tho", "mas"));
		assertNotEquals("Clare", can.concatString("Cl", "aire"));
		assertEquals("dfgsfghjhgjkfkjhgfhsdfgsdfgsdgqwertyuiop",can.concatString("dfgsfghjhgjkfkjhgfhsdfgsdfgsdg", "qwertyuiop"));
		assertEquals("  V  ",can.concatString("  ", "V  "));
	}
	
	@Test
	public void testConcatChar() {
		Concatenate can = new Concatenate();
		assertEquals("TU", can.concatChar('T', 'U'));
		assertNotEquals("TU", can.concatChar('T', 't'));
	}
	
		
}
