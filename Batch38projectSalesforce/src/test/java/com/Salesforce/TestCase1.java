package com.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase1 {
	WebDriver driver;

	@Test
	public void tc_1() {
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// validating the homepage of salesforce that salesforce word id there or not
		WebElement salesForceLogo = driver.findElement(By.id("logo"));
		if (salesForceLogo.isDisplayed()) {
			System.out.println("Logo is Displayed");

		} else {
			System.out.println("Print Logo is not Displayed");
		}
		driver.findElement(By.id("username")).sendKeys("fahmidac12@gmail.com");
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.clear();
		passwordField.sendKeys("");
		driver.findElement(By.id("Login")).click();
		String errormessage = driver.findElement(By.id("error")).getText();
		System.out.println(errormessage);
//Assert.assertEquals("Please enter your password.", errormessage);
		String actualerrormessage = "Please enter your password";
		String expectedErrorMessage = driver.findElement(By.id("error")).getText();
		if (actualerrormessage.equals(expectedErrorMessage)) {

			System.out.println("Error msg is Diplayed than test case passed");
		} else {
			System.out.println("Error msg is not Diplayed than test case passed");
		}

		// String username = driver.findElement(By.id("username")).getText();
		// System.out.println(username);
	}

}
