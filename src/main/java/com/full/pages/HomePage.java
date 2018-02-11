package com.full.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class HomePage {

	public static void go(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
}
