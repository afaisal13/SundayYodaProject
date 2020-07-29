package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursRegisterConfirmPageLocators {
	
	//Register Confirmation message
	@FindBy(xpath="//font[contains(text(),'Thank you for registering.')]")
	public WebElement txtRegisterConfirmation;
	
	//sign-in link 
		@FindBy(xpath="//a[contains(text(),'sign-in')]")
		public WebElement lnkSignIn;
	
}


