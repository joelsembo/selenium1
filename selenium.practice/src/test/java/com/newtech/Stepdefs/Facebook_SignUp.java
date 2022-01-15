package com.newtech.Stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook_SignUp {
	
	WebDriver driver;
	
	@Given("^new user visiting homepage and want to create a new account$")
	public void new_user_visiting_homepage_and_want_to_create_a_new_account() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
	}

	@When("^new user click on create an account and enter credentials$")
	public void new_user_click_on_create_an_account_and_enter_credentials() throws Throwable {
	   
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
	   
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("joel");
	  
		driver.findElement(By.name("lastname")).sendKeys("joel");
		
		driver.findElement(By.name("reg_email__")).sendKeys("swisbyssss@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("swisbysss@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("textme");
		
		//dropdown menu
		
		WebElement mth = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select (mth);
		month.selectByValue("8");
		
		WebElement dys = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select (dys);
		day.selectByValue("11");
	   
		WebElement yr = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select (yr);
		year.selectByValue("1996");
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	}

	@Then("^new user click on sign up and the new user successfully logIn$")
	public void new_user_click_on_sign_up_and_the_new_user_successfully_logIn() throws Throwable {
	    
	}



}
