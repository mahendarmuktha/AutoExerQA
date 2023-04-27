package com.qa.testcases;

public class DataTestingTest {

}
package com.autoexer.testcases;

import org.testng.annotations.Test;

public class DataTestingTest {
	
	
	@Test(dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void signupFrom(String s1, String s2) {
		
		
	}

}
