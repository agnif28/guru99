package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.example.common.CommonConstants;

public class NewCustomerInputPage {
	WebDriver driver;
	By cutomerName     = By.name(CommonConstants.CUTOMER_NAME_PROPERTY_BYNAME);
	By genderSelection = By.xpath(CommonConstants.GENDER_BYXPATH);
	By dobSelection    = By.id(CommonConstants.DOB_BY_ID);
	By addressSelection= By.className(CommonConstants.ADDRESS_BYNAME);
	By citySelection   = By.className(CommonConstants.CITY_BYNAME);
	By stateSelection  = By.className(CommonConstants.STATE_BYNAME);
    By pinNoSelection  = By.className(CommonConstants.PIN_BYNAME);
    By mobileNoSelection = By.className(CommonConstants.MOBILENO_BYNAME);
    By emailSelection    = By.className(CommonConstants.EMAIL_ID);
    By passwordSelection = By.className(CommonConstants.PASSWORD_BYNAME);
    By submitButton      = By.className(CommonConstants.SUBMIT_BUTTON_BYNAME);
    
    public NewCustomerInputPage (WebDriver d){
    	driver = d;
    }
    
    public void customer(String Name){
    	driver.findElement(cutomerName).sendKeys(CommonConstants.CUTOMER_NAME_INPUT);
    }
    
    
    
}
