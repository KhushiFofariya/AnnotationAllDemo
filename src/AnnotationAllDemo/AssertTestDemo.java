package AnnotationAllDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class AssertTestDemo {
	@Test
	public void testForAssertEquals() {
		int result = 1;
		int expected = 1;
		assertEquals(result,expected);
}
	
	@Test
	 public void testForAssertTrue()
	 {
		 assertTrue("Hello".contains("e"));
	 }
	
	@Test
	 public void testForAssertFalse()
	 {
		 assertFalse("Hello".contains("k"));
	 }
	
	@Test
	 public void testForNull()
	 {
		 String s =null;
		 assertNull(s);
	 }
	
	@Test
	 public void testForAssertThrow()
	 {
		 assertThrows(IllegalArgumentException.class, () -> {
			 throw new IllegalArgumentException("Invalid Argument");
		 });
	 }
	
	@Test
	
	public void testFail() {
		fail("It is suppose to be fail");
	}
	
}
