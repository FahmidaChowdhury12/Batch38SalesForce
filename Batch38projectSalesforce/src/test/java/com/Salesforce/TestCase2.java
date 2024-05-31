package com.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	WebDriver driver;

	@Test
	public void tc_2() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// validating the homepage of salesforce that salesforce word id there or not
		WebElement salesForceLogo = driver.findElement(By.id("logo"));
		if (salesForceLogo.isDisplayed()) {
			System.out.println("Logo is Displayed");

		} else {
			System.out.println("Print Logo is not Displayed");
		}
		//sending user name 
		driver.findElement(By.id("username")).sendKeys("fahmidac12@gmail.com");
		//sending password to the password field
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys("Salesforce#1");
	}
	
}
