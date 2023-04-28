package com.qa.testcases;


import org.testng.annotations.Test;

import com.qa.dataprovider.DataProviders;

public class DataTestingTest {
	
	
	@Test(dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void signupFrom(String s1, String s2) {
		
		
	}

}
