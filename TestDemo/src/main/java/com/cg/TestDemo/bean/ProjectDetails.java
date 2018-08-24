package com.cg.TestDemo.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectDetails {
	@FindBy(name="prodetails")
	public WebElement prodetails;
	
	@FindBy(name = "proname")
	public WebElement proname ;
	
	@FindBy(name = "cliname")
	public WebElement cliname;
	
	@FindBy(name = "client")
	public WebElement client;
	
	@FindBy(name = "size")
	public WebElement size;
	
	@FindBy(name = "register")
	public WebElement register;

}
