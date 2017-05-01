package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.example.common.CommonConstants;

public class NewCustomerPage {
	WebDriver driver;
	By newCustomerButton = By.xpath(CommonConstants.NEW_CUTOMER_BUTTON);
	
	public NewCustomerPage(WebDriver d){
		driver = d;
	}
	
	public void clickNewCustomer(){
		driver.findElement(newCustomerButton).click();
	}
	

}
