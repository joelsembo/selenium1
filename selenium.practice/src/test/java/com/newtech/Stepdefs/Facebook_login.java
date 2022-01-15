package com.newtech.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook_login {
	
	WebDriver driver;
	
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	}

	@When("^user enter\"([^\"]*)\" and \"([^\"]*)\" and user click on sign in in button$")
	public void user_enter_and_and_user_click_on_sign_in_in_button(String arg1, String arg2) throws Throwable {
	  
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(arg1);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(arg2);
		driver.findElement(By.name("login")).click();
	}

	@Then("^user successfully login to fbk and click on log off for logout$")
	public void user_successfully_login_to_fbk_and_click_on_log_off_for_logout() throws Throwable {
	    
	}



}
