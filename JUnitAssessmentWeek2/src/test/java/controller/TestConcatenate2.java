
/**
 * @author valei - vlunderwood
 * CIS175 - Fall 2023
 * Sep 1, 2023
 */
package controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TestConcatenate2 {
	@Test
	public void testMinimuntAge() {
		Concatenate can = new Concatenate();
		assertTrue(can.minimumAge(16));
		assertFalse(can.minimumAge(25));
		assertTrue(can.minimumAge(18));
		assertTrue(can.minimumAge(-1));
		
	}
}
