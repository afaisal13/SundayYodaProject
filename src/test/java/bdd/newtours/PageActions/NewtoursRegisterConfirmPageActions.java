package bdd.newtours.PageActions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bdd.newtours.PageElements.NewtoursRegisterConfirmPageLocators;
import bdd.utilities.SetupDrivers;

public class NewtoursRegisterConfirmPageActions {

	NewtoursRegisterConfirmPageLocators NewtoursRegisterConfirmPageLocatorsObj;
	
	public NewtoursRegisterConfirmPageActions() {
		NewtoursRegisterConfirmPageLocatorsObj= new NewtoursRegisterConfirmPageLocators();
		PageFactory.initElements(SetupDrivers.driver, NewtoursRegisterConfirmPageLocatorsObj);
	}//end of Constructor
	
	public void registerConfirmationMessage() throws Exception {
		
		//closing iframe advertising
		WebElement element1 = SetupDrivers.driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']"));
	    element1.click();
		
		String actualMessage=NewtoursRegisterConfirmPageLocatorsObj.txtRegisterConfirmation.getText();
		
		/*if (actualMessage.contains("Thank you for registering"))
			System.out.println("Registration has been Successful");
		else
			System.out.println("Registration Failed");*/
		String expectedMessage="Thank you for registering. You may now sign-in using the user name and password you've just entered.";
		Assert.assertEquals(actualMessage, expectedMessage);
		
		//Taking Screenshot
		File srcFile=((TakesScreenshot)(SetupDrivers.driver)).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\TTSoftware\\Screenshot\\screenshot1.jpg"));
		
	}
	
	 
}
