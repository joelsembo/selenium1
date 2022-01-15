package com.newtech.Stepdefs;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.newtech.PageObjectModel.WebElement_Amazon;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon_Add_to_Cart  {
	
	WebDriver driver;
	
	@Given("^user visiting homepage and want to add product to cart$")
	public void user_visiting_homepage_and_want_to_add_product_to_cart() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		Thread.sleep(17000);
		driver.manage().window().maximize();
		//driver.switchTo().alert().dismiss();
		//driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Fashion')]")).click();
		
	}

	@When("^user click on product and click on add to cart$")
	public void user_click_on_product_and_click_on_add_to_cart() throws Throwable {
	   
		
		
		WebElement_Amazon product=new WebElement_Amazon(driver);
		product.clickOnFashion();
		Thread.sleep(5000);
		product.clickMen();
		Thread.sleep(5000);
		product.clicWatches();
		Thread.sleep(5000);
		product.clickWristwatches();
		Thread.sleep(5000);
		product.clickTimex();
		Thread.sleep(5000);
		product.clickAddtocart();
	}

	@Then("^user successfully add product to cart$")
	public void user_successfully_add_product_to_cart() throws Throwable {
	    
		System.out.println(" The test pass: the product successfully added to cart");
	}


	
}
