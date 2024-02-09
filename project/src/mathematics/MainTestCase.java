package mathematics;

import static org.junit.Assert.*;

import org.junit.Test;

import project.SquareRoot;
import string.Concatenation;

public class MainTestCase {

	@Test
	public void squareRootTestCase() {
		SquareRoot s1 = new SquareRoot();
		int ans = s1.calSquareRoot(10);
		assertEquals(100,ans);
	}
	
	@Test
	public void cubeTestCase() {
		FindingCube c1 = new FindingCube();
		int ans = c1.findCube(2);
		assertEquals(8,ans);
	}
	
	@Test
	public void testCalculator() {
		Calculator c1 = new Calculator();
		assertEquals(4,c1.addNos());
		assertEquals(0,c1.subNos());
		assertEquals(4,c1.multiplyNos());
		assertEquals(2,c1.divideNos());
	}
	
	@Test
	public void testConcatenation() {
		Concatenation c1 = new Concatenation();
		String ans = c1.concatenate();
		assertEquals("valencio monteiro",ans);
	}

}
