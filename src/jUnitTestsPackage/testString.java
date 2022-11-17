package jUnitTestsPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testString {

	@Test
	void test() {
		jUnitFunctions ju = new jUnitFunctions();
		String res = ju.addString("capstone", "project");
		assertEquals("capstoneproject", res);
	}

}
