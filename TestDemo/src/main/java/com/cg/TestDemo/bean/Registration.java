package com.cg.TestDemo.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	@FindBy(name="first")
	 public WebElement first;
	
	@FindBy(name="last")
	public WebElement last;
	
	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(name="number")
	public WebElement number;
	
	@FindBy(name="address")
	public WebElement address;
	
	@FindBy(name="city")
	public WebElement city;
	
	@FindBy(name="state")
	public WebElement state;
	
	@FindBy(name="commit")
	public WebElement commit;
	

}
