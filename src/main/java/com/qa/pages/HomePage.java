package com.qa.pages;

public class HomePage {

}
package com.autoexer.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.autoexer.actiondriver.Action;
import com.autoexer.base.Base;

public class HomePage extends Base {
	
	@FindBy(xpath = "//img[@src='/static/images/home/logo.png']")
	WebElement logoAuto;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[1]/a")
	WebElement homeButton;

	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement loginButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	 public boolean myLogoValidate() {
		 Action act = new Action();
		 return  act.isDisplayed(driver, logoAuto);
		
	}
	public LoginPage clickOnLogin() {
		loginButton.click();
		return new LoginPage();
		
	}
	public boolean validateHomeButton() {
	   
		Action act = new Action();
		 return act.isDisplayed(driver, homeButton);
		
	}
	public String getMyTitle() {
		
		String myTitle= driver.getTitle();
		return myTitle;
		
		
	}
	public HomePage clickOnHomeBtn() {
		Action act = new Action();
		act.click(driver, homeButton);
		return new HomePage();
	}
}

