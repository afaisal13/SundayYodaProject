package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursRegisterPageLocators {

	//--------Contact Information Section---------------
		//First Name
		@FindBy(xpath="//input[@name='firstName']")
	    public WebElement txtFirstName;
		
		//Last Name
		@FindBy(xpath="//input[@name='lastName']")
	    public WebElement txtLastName;
		
		//phone number
		@FindBy(xpath="//input[@name='phone']")
	    public WebElement txtPhone;
		
		//Email Address
		@FindBy(xpath="//input[@id='userName']")
	    public WebElement txtEmail;
		
	//------------Mailing Information Section-------------
		//Address
		@FindBy(xpath="//input[@name='address1']")
		public WebElement txtAddress;
		
		//City
		@FindBy(xpath="//input[@name='city']")
		public WebElement txtCity;
		
		//State
		@FindBy(xpath="//input[@name='state']")
		public WebElement txtState;
		
		//postal code
		@FindBy(xpath="//input[@name='state']")
		public WebElement txtPostalCode;
		
		//Country Selection
		@FindBy(xpath="//select[@name='country']")
		public WebElement drpCountry;
		
	//-------------User Information Section---------------
		//User name
		@FindBy(xpath="//input[@id='email']")
		public WebElement txtUserName;
		
		//Password
		@FindBy(xpath="//input[@name='password']")
		public WebElement txtPassword;
		
		//Confirm Password
		@FindBy(xpath="//input[@name='confirmPassword']")
		public WebElement txtConfirmPassword;
		
		//Submit Button
		@FindBy(xpath="//input[@name='submit']")
		public WebElement btnSubmit;
		
}
