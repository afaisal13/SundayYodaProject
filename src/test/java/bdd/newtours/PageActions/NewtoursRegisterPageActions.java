package bdd.newtours.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import bdd.newtours.PageElements.NewtoursRegisterPageLocators;
import bdd.utilities.ReadExcelSheetData;
import bdd.utilities.SetupDrivers;

public class NewtoursRegisterPageActions {
	
	NewtoursRegisterPageLocators NewtoursRegisterPageLocatorsObj;
	
	public NewtoursRegisterPageActions(){
		NewtoursRegisterPageLocatorsObj = new NewtoursRegisterPageLocators();
		PageFactory.initElements(SetupDrivers.driver, NewtoursRegisterPageLocatorsObj);
	}

	public void fillContactInfo() throws Exception {
	
		/*NewtoursRegisterPageLocatorsObj.txtFirstName.clear();
		NewtoursRegisterPageLocatorsObj.txtFirstName.sendKeys("Fawad");
		NewtoursRegisterPageLocatorsObj.txtLastName.clear();
		NewtoursRegisterPageLocatorsObj.txtLastName.sendKeys("Khan");
		NewtoursRegisterPageLocatorsObj.txtPhone.clear();
		NewtoursRegisterPageLocatorsObj.txtPhone.sendKeys("9192254322");
		NewtoursRegisterPageLocatorsObj.txtEmail.clear();
		NewtoursRegisterPageLocatorsObj.txtEmail.sendKeys("fwd@gmail.com");*/
		
//closing the iframe advertising
		WebElement element1 = SetupDrivers.driver.findElement(By.xpath("//iframe[@id='flow_close_btn_iframe']"));
	    element1.click();
		
		NewtoursRegisterPageLocatorsObj.txtFirstName.clear();
		NewtoursRegisterPageLocatorsObj.txtFirstName.sendKeys(ReadExcelSheetData.getMapData("FirstName"));
		NewtoursRegisterPageLocatorsObj.txtLastName.clear();
		NewtoursRegisterPageLocatorsObj.txtLastName.sendKeys(ReadExcelSheetData.getMapData("LastName"));
		NewtoursRegisterPageLocatorsObj.txtPhone.clear();
		NewtoursRegisterPageLocatorsObj.txtPhone.sendKeys(ReadExcelSheetData.getMapData("Phone"));
		NewtoursRegisterPageLocatorsObj.txtEmail.clear();
		NewtoursRegisterPageLocatorsObj.txtEmail.sendKeys(ReadExcelSheetData.getMapData("Email"));
	}
	
	public void fillMailingInfo(){
		NewtoursRegisterPageLocatorsObj.txtAddress.clear();
		NewtoursRegisterPageLocatorsObj.txtAddress.sendKeys("7409 Bruson");
		NewtoursRegisterPageLocatorsObj.txtCity.clear();
		NewtoursRegisterPageLocatorsObj.txtCity.sendKeys("Jackson Hts");;
		NewtoursRegisterPageLocatorsObj.txtState.clear();
		NewtoursRegisterPageLocatorsObj.txtState.sendKeys("NY");
		NewtoursRegisterPageLocatorsObj.txtPostalCode.clear();
		NewtoursRegisterPageLocatorsObj.txtPostalCode.sendKeys("11372");
		
		Select dropDown=new Select(NewtoursRegisterPageLocatorsObj.drpCountry);
		dropDown.selectByValue("UNITED STATES");
		
	}
	
	public void fillUserInfo(String UserName, String Password){
		NewtoursRegisterPageLocatorsObj.txtUserName.clear();
		NewtoursRegisterPageLocatorsObj.txtUserName.sendKeys(UserName);
		NewtoursRegisterPageLocatorsObj.txtPassword.clear();
		NewtoursRegisterPageLocatorsObj.txtPassword.sendKeys(Password);
		NewtoursRegisterPageLocatorsObj.txtConfirmPassword.clear();
		NewtoursRegisterPageLocatorsObj.txtConfirmPassword.sendKeys(Password);
	}
	
	public void submitRegForm(){
		NewtoursRegisterPageLocatorsObj.btnSubmit.click();
	}
	
}
