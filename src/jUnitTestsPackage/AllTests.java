package jUnitTestsPackage;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ jUnitFuntions.class, testString.class })
public class AllTests {

}
