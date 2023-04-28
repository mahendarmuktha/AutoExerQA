package com.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.actiondriver.Action;
import com.qa.base.Base;
import com.qa.pages.HomePage;
import com.qa.utility.Log;

/**
 * @author mahendar
 *
 */
public class HomePageTest extends Base {
  
	HomePage homePage;
	Action action;
	
	@BeforeMethod
	
	public void setup() {
		lauchApp();
	}
	
	@AfterMethod
	public void teardown() {
	tearDown();
	}
	@Test
	public void VefigyLogo() {
		
		homePage =new HomePage();
		boolean result=homePage.myLogoValidate();
		Assert.assertTrue(result);
		action = new Action();
		action.screenShot(driver,"Logo screenshot");
		
	}
	@Test
	public void homeBtnVerify() {
		Log.startTestCase("homeBtnVerify");
		homePage = new HomePage();
		homePage.clickOnHomeBtn();
		Log.info("user clicked on Home button");
		Assert.assertEquals(homePage, homePage);
	   Log.info("home page is redirected");
	   Log.endTestCase("homeBtnVerify");
	}
	@Test
	
	public void verifyTitle() {
		homePage = new HomePage();
		//String MyTitle=homePage.getMyTitle();
		System.out.println(homePage.getMyTitle());
		
		
	}
	
	@Test

	public void Loginbtn() {
		homePage = new HomePage();
		homePage.clickOnLogin();
		
	
	}
}
