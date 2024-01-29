package string;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatenationTestCase {

	@Test
	public void testConcatenation() {
		Concatenation c1 = new Concatenation();
		String ans = c1.concatenate();
		assertEquals("valencio monteiro",ans);
	}

}
