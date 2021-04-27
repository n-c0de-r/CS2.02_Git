import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class TestEven {
	Logic2 l = new Logic2();
	@Test
	void test() {
		assertEquals(l.evenlySpaced(2, 4, 6), true);
		assertEquals(l.evenlySpaced(4, 6, 2), true);
		assertEquals(l.evenlySpaced(4, 6, 3), false);
		assertEquals(l.evenlySpaced(6, 2, 4), true);
		assertEquals(l.evenlySpaced(6, 2, 8), false);
		assertEquals(l.evenlySpaced(2, 2, 2), true);
		assertEquals(l.evenlySpaced(2, 2, 3), false);
		assertEquals(l.evenlySpaced(9, 10, 11), true);
		assertEquals(l.evenlySpaced(10, 9, 11), true);
		assertEquals(l.evenlySpaced(10, 9, 9), false);
		assertEquals(l.evenlySpaced(2, 4, 4), false);
		assertEquals(l.evenlySpaced(2, 2, 4), false);
		assertEquals(l.evenlySpaced(3, 6, 12), false);
		assertEquals(l.evenlySpaced(12, 3, 6), false);
	}

}
