package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitStrings = new jUnitFunctions();
		String result =junitStrings.addStrings("ISHITA GOYAL_","E20CSE153");
		assertEquals("ISHITA GOYAL_E20CSE153",result);
	}

}
