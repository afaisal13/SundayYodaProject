package bdd.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupDrivers {
	
	public static WebDriver driver;

	
	public static void setupDriver() {

    	System.setProperty("webdriver.chrome.driver", "C:/TTSoftware/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications"); //to disable notification generated by chromedriver
		driver = new ChromeDriver(options);

	}
	

	public static WebDriver getDriver() {
		return driver;

	}

	public static void tearDownDriver() {
		driver.quit();
	}
}
