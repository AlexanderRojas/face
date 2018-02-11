package com.full.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	

	
	@FindBy(id="email")
	private static WebElement emailInput;

	@FindBy(id = "pass")
	private static WebElement passInput;

	@FindBy(id = "u_0_3")
	private static WebElement submitButton;

	public static void go(WebDriver driver){
	
		driver.get("https://www.facebook.com/");
		}

	public static void login(String email, String pass) {
		emailInput.sendKeys(email);
		passInput.sendKeys(pass);
		submitButton.submit();

		
	}

}
