package com.example.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.example.common.CommonConstants;
import com.example.pages.LoginPage;
import com.example.pages.NewCustomerPage;




public class LoginTest {
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
	public void test_guru99_log_in(){
		//Create Login Page object
		objLogin = new LoginPage(driver);

		//Verify login page title
		String loginPageTitle = objLogin.getLoginTitle();
		AssertJUnit.assertTrue(loginPageTitle.toLowerCase().contains(CommonConstants.LOGIN_TITLE));

		//login to application
		objLogin.loginToGuru99(CommonConstants.USER_ID, CommonConstants.PASSWORD);
		// verify successful log in msg
		System.out.println("Log in Successfully");
		String successfulLoginMsg = objLogin.successfulLoginMsg();
		Assert.assertEquals("Manger Id : mngr67522",successfulLoginMsg);
		System.out.println("Log in mgs matched with actual msg");
	}
}

