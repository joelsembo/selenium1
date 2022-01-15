package com.newtech.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElement_Amazon {

	
	WebDriver driver;
	
	By Fashion = By.xpath("//*[@id=\"nav-xshop\"]/a[11]");
	By Men = By.xpath("//*[@id=\"nav-subnav\"]/a[3]/span[1]");
	By watches = By.xpath("//*[@id=\"sobe_d_b_4_3\"]/a");
	By wristwatches = By.xpath("//*[@id=\"a-page\"]/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/ul/span[1]/li/span/div/a/div[1]/div");
	By Timex = By.xpath("//span[contains(text(),\"Men's Expedition Scout 40 Watch\")]");
	By AddtoCart = By.xpath("//*[@id=\"add-to-cart-button\"]");
	
	public WebElement_Amazon (WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void clickOnFashion() {
		driver.findElement(Fashion).click();
	}
	
	public void clickMen() {
		driver.findElement(Men).click();
	}
	public void clicWatches() {
		driver.findElement(watches).click();
	}
	public void clickWristwatches() {
		driver.findElement(wristwatches).click();
	}
	public void clickTimex() {
		driver.findElement(Timex).click();
	}
	public void clickAddtocart() {
		driver.findElement(AddtoCart).click();
	}
}
