package com.full.tests;

import org.testng.annotations.Test;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.PageFactory;
import com.full.pages.HomePage;

public class HomePageTests {
	
	WebDriver driver;

	@Test
	public void home(){
		
		//FirefoxOptions firefoxOptions = new FirefoxOptions(); 
	    //firefoxOptions.setCapability("marionette", true);
		//Anora, no se por qué, No funcionó con estas dos lineas. Tocó quitarlas,
	    
	    driver = new FirefoxDriver();
		PageFactory.initElements(driver, HomePage.class);
		HomePage.go(driver);
		//driver.quit();
	}
	
	@Test
	public void login(){

		HomePage.login("boyacenses@outlook.com", "testNG5.");
				//driver.quit();
	}
}