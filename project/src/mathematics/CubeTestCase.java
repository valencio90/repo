package mathematics;

import static org.junit.Assert.*;

import org.junit.Test;

public class CubeTestCase {

	@Test
	public void test() {
		FindingCube c1 = new FindingCube();
		int ans = c1.findCube(2);
		assertEquals(8,ans);
		
	}

}
