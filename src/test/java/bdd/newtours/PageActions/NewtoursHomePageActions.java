package bdd.newtours.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import bdd.newtours.PageElements.NewtoursHomePageLocators;
import bdd.utilities.SetupDrivers;

public class NewtoursHomePageActions {
	
	NewtoursHomePageLocators NewtoursHomePageLocatorsObj;
	
	public NewtoursHomePageActions(){
		NewtoursHomePageLocatorsObj = new NewtoursHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, NewtoursHomePageLocatorsObj);
	}
	
	public void loadNewtourHomepage(){
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.get("http://www.demo.guru99.com/test/newtours");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		//closing the iframe advertising
		WebElement element1 = SetupDrivers.driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']"));
	    element1.click();

		
	}
	
	public void navigateRegisterPage(){
		/*SetupDrivers.driver.switchTo().frame("primis_playerSekindoSPlayer5f1b848c2feec");
		SetupDrivers.driver.findElement(By.xpath("//div[contains(@id, 'closeBtn')])")).click();
		SetupDrivers.driver.switchTo().parentFrame();*/
		NewtoursHomePageLocatorsObj.lnkRegister.click();
	}
	
}