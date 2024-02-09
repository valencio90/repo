package home_work;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseNumberTest {

	@Test
	public void test() {
		ReverseNumber r = new ReverseNumber();
		assertEquals(12,r.reverseNumber(21));
	}

}
