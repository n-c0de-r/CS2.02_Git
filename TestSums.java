import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSums {
	@Test
	void test() {
		assertEquals(GitTest.loneSum(1, 2, 3), 6);	
		assertEquals(GitTest.loneSum(3, 2, 3), 2);
		assertEquals(GitTest.loneSum(3, 3, 3), 0);	
		assertEquals(GitTest.loneSum(9, 2, 2), 9);
		assertEquals(GitTest.loneSum(2, 2, 9), 9);
		assertEquals(GitTest.loneSum(2, 9, 2), 9);
		assertEquals(GitTest.loneSum(2, 9, 3), 14);
		assertEquals(GitTest.loneSum(4, 2, 3), 9);
		assertEquals(GitTest.loneSum(1, 3, 1), 3);
	}

}
