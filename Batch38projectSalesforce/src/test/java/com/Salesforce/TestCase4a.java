package com.Salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase4a {
	WebDriver driver;

	@Test
	public void tc_4a() {
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
		// sending user name
		driver.findElement(By.id("username")).sendKeys("fahmidac12@gmail.com");
		// clicking on the forgot password link
		driver.findElement(By.id("forgot_password_link")).click();
		// valiading the password message
		WebElement forgotmsg = driver.findElement(By.id("header"));
		if (forgotmsg.isDisplayed()) {
			System.out.println("Forgot message is displayed");
		} else {
			System.out.println("Forget message is not displayed");
		}
		// checking the username field in the forgot link
		driver.findElement(By.id("un")).sendKeys("fahmidac12@gmail.com");
		// clicking on the continue btn
		driver.findElement(By.id("continue")).click();
		//Checking your email msg
		WebElement checkemail = driver.findElement(By.xpath("//*[@class='mb12']"));
		if (forgotmsg.isDisplayed()) {
			System.out.println("check your email message is displayed then test passed");
		} else {
			System.out.println("check your email is not displayed then test failed");
		}
		driver.quit();
	}
}
