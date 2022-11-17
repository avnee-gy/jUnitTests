package jUnitTestsPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class jUnitFuntions {

	@Test
	void test() {
		jUnitFunctions ju = new jUnitFunctions();
		int res = ju.addNumbers(100, 200);
		assertEquals(300, res);
		
	}

}
