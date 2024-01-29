package home_work;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactroialTest1 {

	@Test
	public void testFindFact() {
		Factorial f1 = new Factorial();
		assertEquals(24,f1.findFact(4));
	}

}
