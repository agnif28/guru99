package com.example.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.common.CommonConstants;
import com.example.pages.LoginPage;
import com.example.pages.NewCustomerPage;

public class NewCustomerTest {
	WebDriver driver;
	LoginPage objLogin;
	NewCustomerPage new_Customer;

	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:\\JARS\\Chrome driver 32 bit\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.demo.guru99.com/v4/");
		driver.manage().window().maximize();
	}
	@Test
	public void test_new_customer(){
		objLogin = new LoginPage(driver);
		objLogin.loginToGuru99(CommonConstants.USER_ID, CommonConstants.PASSWORD);
		// create New customer page object
		new_Customer = new NewCustomerPage(driver);
		// clicking on the button
		new_Customer.clickNewCustomer();
	}
}


