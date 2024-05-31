package com.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
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
		//clicking on the remember btn
				driver.findElement(By.id("rememberUn")).click();
		//clicking on the login btn
		driver.findElement(By.id("Login")).click();
		//validating the username is there
		String username = driver.findElement(By.id("userNavLabel")).getText();
		System.out.println(username); 
		if(username.equals("Fahmida Chowdhury")) {
			System.out.println("user name is displayed ");
		}
		else {
			System.out.println("user name is not displayed ");
		}
		//clicking on the username dropdown
		driver.findElement(By.id("userNav-arrow")).click();
		//clicking on the logout btn
		driver.findElement(By.linkText(".id")).click();
		//validating username is displayed in the username field
		String validateuser = driver.findElement(By.id("idcard")).getText();
		if(validateuser.equals("fahmidac12@gmail.com")) {
			System.out.println("user email id is displayed then test case passed" );
		}
		else {
			System.out.println("user email id is not displayed then test case failed");
		}
		driver.quit();
		
}
	
}
