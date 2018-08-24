package com.cg.RaviCucumberOptions.step;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationFile {
	@Before(order=1)
	public void setup_step_env() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
	}
	public static WebDriver driver;
	@Given("^Open github$")
	public void open_github() throws Throwable {

		driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
			
	}

	@When("^User enters invalid username$")
	public void user_enter_invalid_username() throws Throwable {

		WebElement element1 = driver.findElement(By.id("login_field"));
		element1.sendKeys("raviprasad");
		WebElement element2 = driver.findElement(By.id("password"));
		element2.sendKeys("ravi@1234R");
		driver.findElement(By.name("commit")).click();	
	}
	
	@Then("^User should get the message 'Incorrect username or password'$")
	public void user_should_get_the_message_Incorrect_username_or_password() throws Throwable {
		WebElement element1 = driver.findElement(By.id("js-flash-container"));
		String message = element1.getText();
		assertEquals("Incorrect username or password.", message);
		
	}

	@When("^User enters invalid password$")
	public void user_enter_invalid_password() throws Throwable {

		driver.findElement(By.id("login_field")).sendKeys("ravivk322@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ravi@1234");
		driver.findElement(By.name("commit")).click();
		
	}
	
	

	@When("^User enters valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		
		WebElement username = driver.findElement(By.id("login_field"));
		username.clear();
		username.sendKeys("ravivk322@gmail.com"); 	 
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("ravi@1234R");
		driver.findElement(By.name("commit")).click();
		
		
	}
	@Then("^User should be Successfully LoggedIn$")
	public void user_should_be_successfully_logged_in() throws Throwable {
		assertEquals("GitHub", driver.getTitle());
	}

}
