package com.cg.TestDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import com.cg.TestDemo.bean.ProjectDetails;
import com.cg.TestDemo.bean.Registration;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegStep {
	WebDriver driver = null;
	Registration register;
	ProjectDetails projectdetails;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe");
	}
	@Given("^Iam on registration page$")
	public void registrationPage() {
		driver = new ChromeDriver();
		driver.navigate().to("file:///D:/BDDWorkSpace/TestDemo/src/webapp/registrationpage.html");
		register = PageFactory.initElements(driver, Registration.class);
	    
	}
	@When("^I enter firstname as (.*)$")
	public void enterFirstName(String args1) throws Throwable{
		Thread.sleep(1000);
		register.first.sendKeys(args1);
		
	}
	@And("^I enter lastname as (.*)$")
	public void enterLastName(String args1) throws Throwable{
		Thread.sleep(1000);
		register.last.sendKeys(args1);
		
	}
	@And("^I enter email Id as (.*)$")
	public void enterEmailId(String args1) throws Throwable{
		Thread.sleep(1000);
		register.email.sendKeys(args1);
	}
	@And("^I enter contactnumber as (.*)$")
	public void enterContactNumber(String args1) throws Throwable{
		Thread.sleep(1000);
		register.number.sendKeys(args1);
	}
	@And("^I enter address as (.*)$")
	public void enterAddress(String args1) throws Throwable {
		Thread.sleep(1000);
		register.address.sendKeys(args1);
	}
	@And("^I enter city as (.*)$")
	public void enterCity(String args1) throws Throwable{
		Thread.sleep(1000);
		register.city.sendKeys(args1);
	}
	@And("^I select state as (.*)$")
	public void selectState(String args1) throws Throwable{
		Thread.sleep(1000);
		Select dropDown = new Select(register.state);
		dropDown.selectByValue(args1);
		
		driver.findElement(By.name("commit")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.navigate().to("file:///D:/BDDWorkSpace/TestDemo/src/webapp/project.html");
		projectdetails = PageFactory.initElements(driver, ProjectDetails.class);
		//register.commit.click();
		/*Alert jsAlert = driver.switchTo().alert();		
		if(jsAlert.getText().equals("validated")) {
			Thread.sleep(1000);
			jsAlert.accept();
			driver.navigate().to("file:///D:/BDDWorkSpace/TestDemo/src/webapp/project.html");
			projectdetails = PageFactory.initElements(driver, ProjectDetails.class);
		}*/
	}
	@And("^I enter Project Details as (.*) project$")
	public void enterProjectDetails(String args1) throws Throwable{
		Thread.sleep(1000);
		projectdetails.prodetails.sendKeys(args1);
		
	}
	@And("^I enter Project name is (.*)$")
	public void enterProjectName(String args1)throws Throwable{
		Thread.sleep(1000);
		projectdetails.proname.sendKeys(args1);
	}
	@And("^I enter Client name is (.*)$")
	public void enterClientName(String args1)throws Throwable {
		Thread.sleep(1000);
		projectdetails.cliname.sendKeys(args1);
	}
	@And("^I enter Team Size is (.*)$")
	public void enterTeamSize(String args1)throws Throwable{
		Thread.sleep(1000);
		projectdetails.size.sendKeys(args1);
	}
	@Then("^Finally reached to registration success page$")
	public void directingTo()throws Throwable{
		driver.findElement(By.name("commit")).click();
		driver.navigate().to("file:///D:/BDDWorkSpace/TestDemo/src/webapp/success.html");
		Thread.sleep(1000);
		driver.close();
	}
	
}
