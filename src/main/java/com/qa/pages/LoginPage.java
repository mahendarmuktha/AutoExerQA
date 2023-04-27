package com.qa.pages;

public class LoginPage {

}
package com.autoexer.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autoexer.actiondriver.Action;
import com.autoexer.base.Base;

public class LoginPage extends Base  {

	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
	WebElement signupName;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement signupEmail;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signupBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SignUp login(String uname, String uemail) {
		
		Action act = new Action();
		
		act.type(signupName, uname);
		act.type(signupEmail, uemail);
		act.click(driver, signupBtn);
		return new SignUp();
	}
	
}

