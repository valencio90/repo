package project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareRootTestCase {

	@Test
	public void test() {
		
		SquareRoot s1 = new SquareRoot();
		int ans = s1.calSquareRoot(10);
		assertEquals(100,ans);
		
	}

}
