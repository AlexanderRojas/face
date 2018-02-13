package com.full.pages;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.Assert;

public class Face {
	
	@FindBy(id="userNavigationLabel")
	private static WebElement logoutButton;


	public static void logout() {
		
		//Assert.assertNotNull(logoutButton,  "No Es nulo");
		
		
		logoutButton.click();
		//logoutButton.submit();
		
	}

}
