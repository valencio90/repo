package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class OopProgramTestCase {

	@Test
	public void testIsEquilateral() {
		OopProgram op1 = new OopProgram();
		boolean ans = op1.isEquilateral(10, 10, 10);
		assertEquals(true,ans);
	}
	@Test
	public void testIsIsosceles() {
		OopProgram op1 = new OopProgram();
		boolean ans = op1.isIsosceles(10, 10, 10);
		assertEquals(true,ans);
	}
	@Test
	public void testIsScalene() {
		OopProgram op1 = new OopProgram();
		boolean ans = op1.isScalene(10, 10, 10);
		assertEquals(false,ans);
	}

}
