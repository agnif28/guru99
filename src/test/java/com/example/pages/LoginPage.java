package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.example.common.CommonConstants;


public class LoginPage {
	WebDriver driver;
	
	By user99GuruName = By.name("uid");
	By password99Guru = By.name("password");
	By titleText =By.className("barone");
	By login = By.name("btnLogin");
	By loginMsg = By.xpath(CommonConstants.LOGIN_MSG_CON);

	public LoginPage(WebDriver d){
		driver = d;
	}
	//Set user name in textbox
		public void setUserName(String strUserName){
			driver.findElement(user99GuruName).sendKeys(strUserName);
		}

		//Set password in password textbox
		public void setPassword(String strPassword){
			driver.findElement(password99Guru).sendKeys(strPassword);
		}

		//Click on login button
		public void clickLogin(){
			driver.findElement(login).click();
		}

		//Get the title of Login Page
		public String getLoginTitle(){
			return    driver.findElement(titleText).getText();
		}

		public void loginToGuru99(String strUserName,String strPasword){
			//Fill user name
			this.setUserName(strUserName);

			//Fill password
			this.setPassword(strPasword);

			//Click Login button
			this.clickLogin();        
		}
		public String successfulLoginMsg(){
			return driver.findElement(loginMsg).getText();
		}
	}

	

